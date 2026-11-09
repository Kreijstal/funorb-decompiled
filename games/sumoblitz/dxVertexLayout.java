/*
 * Decompiled by CFR-JS 0.4.0.
 */
public class dxVertexLayout extends VertexLayout {
    jagdx.IDirect3DVertexDeclaration field_d;

    dxVertexLayout(DirectXGraphicsToolkit param0, VertexStreamLayout[] param1) {
        int var5 = 0;
        int var8 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int var4;
        int var6;
        VertexStreamLayout var7;
        VertexAttribute var9;
        jagdx.VertexElementCollection var10;
        var10 = new jagdx.VertexElementCollection(param0.field_Wc);
        var4 = 0;
        for (var5 = 0; var5 < param1.length; var5++) {
          var6 = 0;
          var7 = param1[var5];
          for (var8 = 0; var8 < var7.attributeCount(44115); var8++) {
            var9 = var7.attribute(-101, var8);
            if (VertexAttribute.POSITION != var9) {
              if (var9 == VertexAttribute.NORMAL) {
                var10.addElement(var5, 2, 0, 3, 0, var6);
              } else {
                if (var9 != VertexAttribute.COLOR) {
                  if (var9 != VertexAttribute.TEXCOORD1) {
                    if (VertexAttribute.TEXCOORD2 == var9) {
                      incrementValue$0 = var4;
                      var4++;
                      var10.addElement(var5, 1, 0, 5, incrementValue$0, var6);
                    } else {
                      if (var9 == VertexAttribute.TEXCOORD3) {
                        incrementValue$1 = var4;
                        var4++;
                        var10.addElement(var5, 2, 0, 5, incrementValue$1, var6);
                      } else {
                        if (VertexAttribute.TEXCOORD4 == var9) {
                          incrementValue$2 = var4;
                          var4++;
                          var10.addElement(var5, 3, 0, 5, incrementValue$2, var6);
                        }
                      }
                    }
                  } else {
                    incrementValue$3 = var4;
                    var4++;
                    var10.addElement(var5, 0, 0, 5, incrementValue$3, var6);
                  }
                } else {
                  var10.addElement(var5, 4, 0, 10, 0, var6);
                }
              }
            } else {
              var10.addElement(var5, 2, 0, 0, 0, var6);
            }
            var6 = var6 + var9.sizeBytes;
          }
        }
        var10.finish();
        this.field_d = param0.field_Cc.createVertexDeclaration(var10, (jagdx.IDirect3DVertexDeclaration) null);
    }
}
