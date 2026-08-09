/*
 * Decompiled by CFR-JS 0.4.0.
 */
public class dxVertexLayout extends fa {
    jagdx.IDirect3DVertexDeclaration field_d;

    dxVertexLayout(kr param0, pl[] param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int var4;
        int var5;
        int var6;
        pl var7;
        int var8;
        rl var9;
        jagdx.VertexElementCollection var10;
        var10 = new jagdx.VertexElementCollection(param0.field_Ic);
        var4 = 0;
        var5 = 0;
        L0: while (true) {
          if (param1.length <= var5) {
            var10.finish();
            this.field_d = param0.field_Rc.a(var10, (jagdx.IDirect3DVertexDeclaration) null);
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
                          incrementValue$0 = var4;
                          var4++;
                          var10.addElement(var5, 0, 0, 5, incrementValue$0, var6);
                          break L2;
                        } else {
                          if (rl.field_j == var9) {
                            incrementValue$1 = var4;
                            var4++;
                            var10.addElement(var5, 1, 0, 5, incrementValue$1, var6);
                            break L2;
                          } else {
                            if (rl.field_g != var9) {
                              if (rl.field_n != var9) {
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
