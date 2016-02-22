package com.mobile.advance.webservice;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 4.1.10.0
//
// Created by Quasar Development at 22-02-2016
//
//---------------------------------------------------



import org.ksoap2.serialization.*;
import java.util.Vector;
import java.util.Hashtable;


public class ArrayOfObjAplicacion extends Vector< objAplicacion> implements KvmSerializable
{
    
    public ArrayOfObjAplicacion(){}
    
    public ArrayOfObjAplicacion(Object inObj,ExtendedSoapSerializationEnvelope __envelope)
    {
        if (inObj == null)
            return;
        SoapObject soapObject=(SoapObject)inObj;
        int size = soapObject.getPropertyCount();
        for (int i0=0;i0< size;i0++)
        {
            Object obj = soapObject.getProperty(i0);
            if (obj!=null && obj instanceof AttributeContainer)
            {
                AttributeContainer j =(AttributeContainer) soapObject.getProperty(i0);
                objAplicacion j1= (objAplicacion)__envelope.get(j,objAplicacion.class);
                add(j1);
            }
        }
}
    
    @Override
    public Object getProperty(int arg0) {
        return this.get(arg0)!=null?this.get(arg0):SoapPrimitive.NullNilElement;
    }
    
    @Override
    public int getPropertyCount() {
        return this.size();
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        info.name = "objAplicacion";
        info.type = objAplicacion.class;
    	info.namespace= "http://tempuri.org/";
    }
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }

}