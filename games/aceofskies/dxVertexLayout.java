/*
 * Decompiled by CFR-JS 0.4.0.
 */
public class dxVertexLayout extends fa {
    jagdx.IDirect3DVertexDeclaration field_d;

    dxVertexLayout(kr param0, pl[] param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        pl var7 = null;
        int var8 = 0;
        rl var9 = null;
        jagdx.VertexElementCollection var10 = null;
        var10 = new jagdx.VertexElementCollection(param0.field_Ic);
        var4 = 0;
        var5 = 0;
        L0: while (true) {
          if (param1.length <= var5) {
            var10.finish();
            ((dxVertexLayout) this).field_d = param0.field_Rc.a(var10, (jagdx.IDirect3DVertexDeclaration) null);
            return;
          } else {
            var6 = 0;
            var7 = param1[var5];
            var8 = 0;
            L1: while (true) {
              if (var8 >= var7.a((byte) 90)) {
                var5++;
                continue L0;
              } else {
                L2: {
                  var9 = var7.b(var8, -128);
                  if (rl.field_b != var9) {
                    if (var9 == rl.field_m) {
                      var10.addElement(var5, 2, 0, 3, 0, var6);
                      break L2;
                    } else {
                      if (rl.field_c != var9) {
                        if (var9 == rl.field_k) {
                          int incrementValue$4 = var4;
                          var4++;
                          var10.addElement(var5, 0, 0, 5, incrementValue$4, var6);
                          break L2;
                        } else {
                          if (rl.field_j == var9) {
                            int incrementValue$5 = var4;
                            var4++;
                            var10.addElement(var5, 1, 0, 5, incrementValue$5, var6);
                            break L2;
                          } else {
                            if (rl.field_g != var9) {
                              if (rl.field_n != var9) {
                                break L2;
                              } else {
                                int incrementValue$6 = var4;
                                var4++;
                                var10.addElement(var5, 3, 0, 5, incrementValue$6, var6);
                                break L2;
                              }
                            } else {
                              int incrementValue$7 = var4;
                              var4++;
                              var10.addElement(var5, 2, 0, 5, incrementValue$7, var6);
                              break L2;
                            }
                          }
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
                var6 = var6 + var9.field_l;
                var8++;
                continue L1;
              }
            }
          }
        }
    }
}
