/*
 * Decompiled by CFR-JS 0.4.0.
 */
public class dxVertexLayout extends mna {
    jagdx.IDirect3DVertexDeclaration field_e;

    dxVertexLayout(cta param0, ne[] param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int var4;
        int var5;
        int var6;
        ne var7;
        int var8;
        gj var9;
        jagdx.VertexElementCollection var10;
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
                          incrementValue$0 = var4;
                          var4++;
                          var10.addElement(var5, 0, 0, 5, incrementValue$0, var6);
                          break L2;
                        } else {
                          if (var9 == gj.field_n) {
                            incrementValue$1 = var4;
                            var4++;
                            var10.addElement(var5, 1, 0, 5, incrementValue$1, var6);
                            break L2;
                          } else {
                            if (gj.field_k != var9) {
                              if (var9 != gj.field_j) {
                                break L2;
                              } else {
                                incrementValue$2 = var4;
                                var4++;
                                var10.addElement(var5, 3, 0, 5, incrementValue$2, var6);
                                break L2;
                              }
                            } else {
                              incrementValue$3 = var4;
                              var4++;
                              var10.addElement(var5, 2, 0, 5, incrementValue$3, var6);
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
