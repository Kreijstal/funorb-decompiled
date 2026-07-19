/*
 * Decompiled by CFR-JS 0.4.0.
 */
public class dxVertexLayout extends mna {
    jagdx.IDirect3DVertexDeclaration field_e;

    dxVertexLayout(cta param0, ne[] param1) {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ne var7 = null;
        int var8 = 0;
        gj var9 = null;
        jagdx.VertexElementCollection var10 = null;
        var10 = new jagdx.VertexElementCollection(param0.field_Mc);
        var4 = 0;
        var5 = 0;
        L0: while (true) {
          if (var5 >= param1.length) {
            var10.finish();
            this.field_e = param0.field_jd.a(var10, (jagdx.IDirect3DVertexDeclaration) null);
            return;
          } else {
            var6 = 0;
            var7 = param1[var5];
            var8 = 0;
            L1: while (true) {
              if (var7.b((byte) 56) <= var8) {
                var5++;
                continue L0;
              } else {
                L2: {
                  var9 = var7.b(0, var8);
                  if (var9 == gj.field_p) {
                    var10.addElement(var5, 2, 0, 0, 0, var6);
                    break L2;
                  } else {
                    if (var9 == gj.field_e) {
                      var10.addElement(var5, 2, 0, 3, 0, var6);
                      break L2;
                    } else {
                      if (gj.field_b == var9) {
                        var10.addElement(var5, 4, 0, 10, 0, var6);
                        break L2;
                      } else {
                        if (gj.field_m == var9) {
                          incrementValue$4 = var4;
                          var4++;
                          var10.addElement(var5, 0, 0, 5, incrementValue$4, var6);
                          break L2;
                        } else {
                          if (var9 == gj.field_n) {
                            incrementValue$5 = var4;
                            var4++;
                            var10.addElement(var5, 1, 0, 5, incrementValue$5, var6);
                            break L2;
                          } else {
                            if (gj.field_k != var9) {
                              if (var9 != gj.field_j) {
                                break L2;
                              } else {
                                incrementValue$6 = var4;
                                var4++;
                                var10.addElement(var5, 3, 0, 5, incrementValue$6, var6);
                                break L2;
                              }
                            } else {
                              incrementValue$7 = var4;
                              var4++;
                              var10.addElement(var5, 2, 0, 5, incrementValue$7, var6);
                              break L2;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                var6 = var6 + var9.field_l;
                var8++;
                continue L1;
              }
            }
          }
        }
    }
}
