package com.mobile.advance.webservice;




//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 4.1.10.0
//
// Created by Quasar Development at 22-02-2016
//
//---------------------------------------------------




import org.ksoap2.HeaderProperty;
import org.ksoap2.serialization.*;
import org.ksoap2.transport.*;
import org.kxml2.kdom.Element;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AutorizacionesSoap
{
    interface IWcfMethod
    {
        ExtendedSoapSerializationEnvelope CreateSoapEnvelope() throws Exception;

        Object ProcessResult(ExtendedSoapSerializationEnvelope __envelope, Object result) throws Exception;
    }

    String url="http://172.16.0.183:8089/Autorizaciones.asmx";

    int timeOut=60000;
    public List< HeaderProperty> httpHeaders;
    public boolean enableLogging;

    public AutorizacionesSoap(){}

    public AutorizacionesSoap(String url)
    {
        this.url = url;
    }

    public AutorizacionesSoap(String url,int timeOut)
    {
        this.url = url;
        this.timeOut=timeOut;
    }

    protected Transport createTransport()
    {
        try
        {
            java.net.URI uri = new java.net.URI(url);
            if(uri.getScheme().equalsIgnoreCase("https"))
            {
                int port=uri.getPort()>0?uri.getPort():443;
                return new HttpsTransportSE(uri.getHost(), port, uri.getPath(), timeOut);
            }
            else
            {
                return new HttpTransportSE(url,timeOut);
            }

        }
        catch (java.net.URISyntaxException e)
        {
        }
        return null;
    }
    
    protected ExtendedSoapSerializationEnvelope createEnvelope()
    {
        ExtendedSoapSerializationEnvelope envelope= new ExtendedSoapSerializationEnvelope(ExtendedSoapSerializationEnvelope.VER11);
        return envelope;
    }
    
    protected List sendRequest(String methodName,ExtendedSoapSerializationEnvelope envelope,Transport transport  )throws Exception
    {
        return transport.call(methodName, envelope, httpHeaders);
    }

    Object getResult(Class destObj,Object source,String resultName,ExtendedSoapSerializationEnvelope __envelope) throws Exception
    {
        if(source==null)
        {
            return null;
        }
        if(source instanceof SoapPrimitive)
        {
            SoapPrimitive soap =(SoapPrimitive)source;
            if(soap.getName().equals(resultName))
            {
                Object instance=__envelope.get(source,destObj);
                return instance;
            }
        }
        else
        {
            SoapObject soap = (SoapObject)source;
            if (soap.hasProperty(resultName))
            {
                Object j=soap.getProperty(resultName);
                if(j==null)
                {
                    return null;
                }
                Object instance=__envelope.get(j,destObj);
                return instance;
            }
            else if( soap.getName().equals(resultName)) {
                Object instance=__envelope.get(source,destObj);
                return instance;
            }
       }

       return null;
    }

        
    public ArrayOfObjUsuario GetUsuarios( ) throws Exception
    {
        return (ArrayOfObjUsuario)execute(new IWcfMethod()
        {
            @Override
            public ExtendedSoapSerializationEnvelope CreateSoapEnvelope(){
              ExtendedSoapSerializationEnvelope __envelope = createEnvelope();
                SoapObject __soapReq = new SoapObject("http://tempuri.org/", "GetUsuarios");
                __envelope.setOutputSoapObject(__soapReq);
                
                PropertyInfo __info=null;
                return __envelope;
            }
            
            @Override
            public Object ProcessResult(ExtendedSoapSerializationEnvelope __envelope,Object __result)throws Exception {
                return (ArrayOfObjUsuario)getResult(ArrayOfObjUsuario.class,__result,"GetUsuariosResult",__envelope);
            }
        },"http://tempuri.org/GetUsuarios");
    }
    
    public objUsuario GetUsuario(final String vUsuario ) throws Exception
    {
        return (objUsuario)execute(new IWcfMethod()
        {
            @Override
            public ExtendedSoapSerializationEnvelope CreateSoapEnvelope(){
              ExtendedSoapSerializationEnvelope __envelope = createEnvelope();
                SoapObject __soapReq = new SoapObject("http://tempuri.org/", "GetUsuario");
                __envelope.setOutputSoapObject(__soapReq);
                
                PropertyInfo __info=null;
                __info = new PropertyInfo();
                __info.namespace="http://tempuri.org/";
                __info.name="vUsuario";
                __info.type=PropertyInfo.STRING_CLASS;
                __info.setValue(vUsuario!=null?vUsuario:SoapPrimitive.NullSkip);
                __soapReq.addProperty(__info);
                return __envelope;
            }
            
            @Override
            public Object ProcessResult(ExtendedSoapSerializationEnvelope __envelope,Object __result)throws Exception {
                return (objUsuario)getResult(objUsuario.class,__result,"GetUsuarioResult",__envelope);
            }
        },"http://tempuri.org/GetUsuario");
    }
    
    public ArrayOfObjAplicacion GetAplicaciones( ) throws Exception
    {
        return (ArrayOfObjAplicacion)execute(new IWcfMethod()
        {
            @Override
            public ExtendedSoapSerializationEnvelope CreateSoapEnvelope(){
              ExtendedSoapSerializationEnvelope __envelope = createEnvelope();
                SoapObject __soapReq = new SoapObject("http://tempuri.org/", "GetAplicaciones");
                __envelope.setOutputSoapObject(__soapReq);
                
                PropertyInfo __info=null;
                return __envelope;
            }
            
            @Override
            public Object ProcessResult(ExtendedSoapSerializationEnvelope __envelope,Object __result)throws Exception {
                return (ArrayOfObjAplicacion)getResult(ArrayOfObjAplicacion.class,__result,"GetAplicacionesResult",__envelope);
            }
        },"http://tempuri.org/GetAplicaciones");
    }
    
    public objAplicacion GetAplicacion(final String vAplicacion ) throws Exception
    {
        return (objAplicacion)execute(new IWcfMethod()
        {
            @Override
            public ExtendedSoapSerializationEnvelope CreateSoapEnvelope(){
              ExtendedSoapSerializationEnvelope __envelope = createEnvelope();
                SoapObject __soapReq = new SoapObject("http://tempuri.org/", "GetAplicacion");
                __envelope.setOutputSoapObject(__soapReq);
                
                PropertyInfo __info=null;
                __info = new PropertyInfo();
                __info.namespace="http://tempuri.org/";
                __info.name="vAplicacion";
                __info.type=PropertyInfo.STRING_CLASS;
                __info.setValue(vAplicacion!=null?vAplicacion:SoapPrimitive.NullSkip);
                __soapReq.addProperty(__info);
                return __envelope;
            }
            
            @Override
            public Object ProcessResult(ExtendedSoapSerializationEnvelope __envelope,Object __result)throws Exception {
                return (objAplicacion)getResult(objAplicacion.class,__result,"GetAplicacionResult",__envelope);
            }
        },"http://tempuri.org/GetAplicacion");
    }
    
    public ArrayOfObjPermiso GetPermisos(final String vUsuario ) throws Exception
    {
        return (ArrayOfObjPermiso)execute(new IWcfMethod()
        {
            @Override
            public ExtendedSoapSerializationEnvelope CreateSoapEnvelope(){
              ExtendedSoapSerializationEnvelope __envelope = createEnvelope();
                SoapObject __soapReq = new SoapObject("http://tempuri.org/", "GetPermisos");
                __envelope.setOutputSoapObject(__soapReq);
                
                PropertyInfo __info=null;
                __info = new PropertyInfo();
                __info.namespace="http://tempuri.org/";
                __info.name="vUsuario";
                __info.type=PropertyInfo.STRING_CLASS;
                __info.setValue(vUsuario!=null?vUsuario:SoapPrimitive.NullSkip);
                __soapReq.addProperty(__info);
                return __envelope;
            }
            
            @Override
            public Object ProcessResult(ExtendedSoapSerializationEnvelope __envelope,Object __result)throws Exception {
                return (ArrayOfObjPermiso)getResult(ArrayOfObjPermiso.class,__result,"GetPermisosResult",__envelope);
            }
        },"http://tempuri.org/GetPermisos");
    }

    
    protected Object execute(IWcfMethod wcfMethod,String methodName) throws Exception
    {
        Transport __httpTransport=createTransport();
        __httpTransport.debug=enableLogging;
        ExtendedSoapSerializationEnvelope __envelope=wcfMethod.CreateSoapEnvelope();
        try
        {
            sendRequest(methodName, __envelope, __httpTransport);
            
        }
        finally {
            if (__httpTransport.debug) {
                if (__httpTransport.requestDump != null) {
                    android.util.Log.i("requestDump",__httpTransport.requestDump);
                }
                if (__httpTransport.responseDump != null) {
                    android.util.Log.i("responseDump",__httpTransport.responseDump);
                }
            }
        }
        Object __retObj = __envelope.bodyIn;
        if (__retObj instanceof org.ksoap2.SoapFault){
            org.ksoap2.SoapFault __fault = (org.ksoap2.SoapFault)__retObj;
            throw convertToException(__fault,__envelope);
        }else{
            return wcfMethod.ProcessResult(__envelope,__retObj);
        }
    }
    
        
    Exception convertToException(org.ksoap2.SoapFault fault,ExtendedSoapSerializationEnvelope envelope)
    {

        return new Exception(fault.faultstring);
    }
}


