/*
 * Decompiled by CFR-JS 0.4.0.
 */
public class dxVertexLayout extends vmb {
    jagdx.IDirect3DVertexDeclaration field_b;

    dxVertexLayout(nla param0, qma[] param1) {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        qma var7 = null;
        int var8 = 0;
        pb var9 = null;
        jagdx.VertexElementCollection var10 = null;
        var10 = new jagdx.VertexElementCollection(param0.field_Sc);
        var4 = 0;
        var5 = 0;
        L0: while (true) {
          if (var5 >= param1.length) {
            var10.finish();
            this.field_b = param0.field_Mc.a(var10, (jagdx.IDirect3DVertexDeclaration) null);
            return;
          } else {
            var6 = 0;
            var7 = param1[var5];
            var8 = 0;
            L1: while (true) {
              if (var8 >= var7.a(-52)) {
                var5++;
                continue L0;
              } else {
                L2: {
                  var9 = var7.b(var8, 118);
                  if (pb.field_k == var9) {
                    var10.addElement(var5, 2, 0, 0, 0, var6);
                    break L2;
                  } else {
                    if (var9 == pb.field_g) {
                      var10.addElement(var5, 2, 0, 3, 0, var6);
                      break L2;
                    } else {
                      if (pb.field_d == var9) {
                        var10.addElement(var5, 4, 0, 10, 0, var6);
                        break L2;
                      } else {
                        if (pb.field_e == var9) {
                          incrementValue$4 = var4;
                          var4++;
                          var10.addElement(var5, 0, 0, 5, incrementValue$4, var6);
                          break L2;
                        } else {
                          if (var9 != pb.field_l) {
                            if (var9 != pb.field_h) {
                              if (pb.field_b != var9) {
                                break L2;
                              } else {
                                incrementValue$5 = var4;
                                var4++;
                                var10.addElement(var5, 3, 0, 5, incrementValue$5, var6);
                                break L2;
                              }
                            } else {
                              incrementValue$6 = var4;
                              var4++;
                              var10.addElement(var5, 2, 0, 5, incrementValue$6, var6);
                              break L2;
                            }
                          } else {
                            incrementValue$7 = var4;
                            var4++;
                            var10.addElement(var5, 1, 0, 5, incrementValue$7, var6);
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
                var6 = var6 + var9.field_i;
                var8++;
                continue L1;
              }
            }
          }
        }
    }
}
