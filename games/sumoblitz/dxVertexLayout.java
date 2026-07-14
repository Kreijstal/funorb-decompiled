/*
 * Decompiled by CFR-JS 0.4.0.
 */
public class dxVertexLayout extends hq {
    jagdx.IDirect3DVertexDeclaration field_d;

    dxVertexLayout(ir param0, hu[] param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        hu var7 = null;
        int var8 = 0;
        ls var9 = null;
        jagdx.VertexElementCollection var10 = null;
        var10 = new jagdx.VertexElementCollection(param0.field_Wc);
        var4 = 0;
        var5 = 0;
        L0: while (true) {
          if (var5 >= param1.length) {
            var10.finish();
            ((dxVertexLayout) this).field_d = param0.field_Cc.a(var10, (jagdx.IDirect3DVertexDeclaration) null);
          } else {
            var6 = 0;
            var7 = param1[var5];
            var8 = 0;
            L1: while (true) {
              if (var8 >= var7.a(44115)) {
                var5++;
                continue L0;
              } else {
                L2: {
                  var9 = var7.a(-101, var8);
                  if (ls.field_b != var9) {
                    if (var9 == ls.field_c) {
                      var10.addElement(var5, 2, 0, 3, 0, var6);
                      break L2;
                    } else {
                      if (var9 != ls.field_g) {
                        if (var9 != ls.field_j) {
                          if (ls.field_e == var9) {
                            var4++;
                            var10.addElement(var5, 1, 0, 5, var4, var6);
                            break L2;
                          } else {
                            if (var9 == ls.field_d) {
                              var4++;
                              var10.addElement(var5, 2, 0, 5, var4, var6);
                              break L2;
                            } else {
                              if (ls.field_a != var9) {
                                break L2;
                              } else {
                                var4++;
                                var10.addElement(var5, 3, 0, 5, var4, var6);
                                break L2;
                              }
                            }
                          }
                        } else {
                          var4++;
                          var10.addElement(var5, 0, 0, 5, var4, var6);
                          break L2;
                        }
                      } else {
                        var10.addElement(var5, 4, 0, 10, 0, var6);
                        break L2;
                      }
                    }
                  } else {
                    var10.addElement(var5, 2, 0, 0, 0, var6);
                    break L2;
                  }
                }
                var6 = var6 + var9.field_k;
                var8++;
                continue L1;
              }
            }
          }
        }
    }
}
