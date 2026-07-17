/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class ca extends bd {
    private int field_cb;
    static he[] field_Y;
    private int field_U;
    private int field_ab;
    private int field_X;
    static nh[] field_W;
    private int field_Z;
    private int field_eb;
    static he[] field_V;
    static int field_db;
    static he[] field_bb;

    boolean j(int param0) {
        ((ca) this).g((byte) -125);
        return super.j(0);
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = -87 % ((-2 - param3) / 59);
        if (param0 <= 0) {
            ((ca) this).b(param2, 1688990433, param1);
            return;
        }
        ((ca) this).field_U = ((ca) this).field_w;
        ((ca) this).field_ab = param1;
        ((ca) this).field_eb = param0;
        ((ca) this).field_cb = ((ca) this).field_k;
        ((ca) this).field_X = param2;
        ((ca) this).field_Z = 0;
    }

    ca(k param0, int param1, int param2) {
        super(param0, param1, param2);
        ((ca) this).field_eb = 0;
        ((ca) this).field_Z = 0;
    }

    void l(int param0) {
        if (param0 != -24626) {
            ((ca) this).g((byte) 40);
        }
    }

    final static String a(Throwable param0) throws IOException {
        String var2 = null;
        PrintWriter var4 = null;
        String var5 = null;
        BufferedReader var6 = null;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        gl var14 = null;
        StringWriter var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        L0: {
          var13 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (param0 instanceof gl) {
            var14 = (gl) (Object) param0;
            var2 = var14.field_d + " | ";
            var11 = var2;
            param0 = var14.field_a;
            break L0;
          } else {
            var2 = "";
            break L0;
          }
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) (Object) var15);
        param0.printStackTrace(var4);
        var4.close();
        var5 = var15.toString();
        var2 = var5;
        var11 = var5;
        var6 = new BufferedReader((Reader) (Object) new StringReader(var5));
        var7 = var6.readLine();
        var2 = var7;
        var11 = var7;
        L1: while (true) {
          var8 = var6.readLine();
          var2 = var8;
          var11 = var8;
          var2 = var11;
          if (var8 != null) {
            L2: {
              var9 = var8.indexOf('(');
              var10 = var8.indexOf(')', 1 + var9);
              if (var9 == -1) {
                var11 = var8;
                var2 = var11;
                var2 = var11;
                break L2;
              } else {
                var11 = var8.substring(0, var9);
                break L2;
              }
            }
            L3: {
              var16 = var11.trim();
              var2 = var16;
              var2 = var16;
              var17 = var16.substring(var16.lastIndexOf(' ') + 1);
              var2 = var17;
              var2 = var17;
              var18 = var17.substring(var17.lastIndexOf('\t') + 1);
              var2 = var18;
              var2 = var18;
              var19 = var2 + var18;
              var2 = var19;
              var2 = var19;
              if (var9 == -1) {
                break L3;
              } else {
                if (-1 != var10) {
                  var12 = var8.indexOf(".java:", var9);
                  if (var12 >= 0) {
                    var2 = var19 + var8.substring(5 + var12, var10);
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  var2 = var2 + 32;
                  continue L1;
                }
              }
            }
            var2 = var2 + 32;
            continue L1;
          } else {
            var2 = var11;
            var11 = var2;
            var2 = var11;
            var2 = var2 + "| " + var7;
            return var2;
          }
        }
    }

    final static String b() {
        return dh.field_N.b((byte) -102);
    }

    public static void m() {
        field_V = null;
        field_bb = null;
        field_Y = null;
        field_W = null;
    }

    void c(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        wj.f(param2 + 6, 35 + param0, ((ca) this).field_w + -12, -40 + ((ca) this).field_k, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        var7 = 0;
        var8 = param0;
        L0: while (true) {
          if (~var7 <= ~var4) {
            var6 = 169;
            var4 = 22;
            var5 = 194;
            var7 = 0;
            var8 = 35 + param0;
            L1: while (true) {
              if (var7 >= var4) {
                return;
              } else {
                var9 = var7 * (-var5 + var6) / var4 + var5;
                var9 = var9 | (var9 << 16 | var9 << 8);
                wj.g(param2, var8, 6, var9);
                wj.g(((ca) this).field_w + param2 + -6, var8, 6, var9);
                var8++;
                var7++;
                continue L1;
              }
            }
          } else {
            L2: {
              if (~wj.field_e < ~var8) {
                break L2;
              } else {
                if (~wj.field_j >= ~var8) {
                  break L2;
                } else {
                  L3: {
                    var9 = var5 - -((var6 + -var5) * var7 / var4);
                    var10 = 0;
                    var11 = ((ca) this).field_w;
                    if (var7 > 20) {
                      break L3;
                    } else {
                      L4: while (true) {
                        if (var10 > 20) {
                          break L3;
                        } else {
                          L5: {
                            var12 = (20 + -var7) * (20 + -var7) + (20 + -var10) * (-var10 + 20);
                            if (462 >= var12) {
                              if (var12 >= 420) {
                                var13 = var9 * (-var12 + 462) / 42;
                                var13 = var13 | (var13 << 16 | var13 << 8);
                                wj.field_l[param2 + wj.field_k * var8 - -var10] = var13;
                                break L5;
                              } else {
                                break L3;
                              }
                            } else {
                              break L5;
                            }
                          }
                          var10++;
                          continue L4;
                        }
                      }
                    }
                  }
                  L6: {
                    if (var7 > 20) {
                      break L6;
                    } else {
                      var12 = var11;
                      var11 -= 21;
                      var13 = 0;
                      L7: while (true) {
                        L8: {
                          if (var13 > 20) {
                            break L8;
                          } else {
                            var14 = (20 + -var7) * (20 - var7) - -(var13 * var13);
                            if (462 < var14) {
                              break L8;
                            } else {
                              L9: {
                                if (var14 < 420) {
                                  var12 = 1 + var11;
                                  break L9;
                                } else {
                                  var15 = var9 * (-var14 + 462) / 42;
                                  var15 = var15 | (var15 << 16 | var15 << 8);
                                  wj.field_l[var11 + (param2 + wj.field_k * var8)] = var15;
                                  break L9;
                                }
                              }
                              var11++;
                              var13++;
                              continue L7;
                            }
                          }
                        }
                        var11 = var12;
                        break L6;
                      }
                    }
                  }
                  var9 = var9 | (var9 << 16 | var9 << 8);
                  wj.g(param2 + var10, var8, var11 + -var10, var9);
                  break L2;
                }
              }
            }
            var8++;
            var7++;
            continue L0;
          }
        }
    }

    boolean k(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (((ca) this).field_eb <= 0) {
        } else {
            var2 = ((ca) this).field_X;
            var3 = ((ca) this).field_ab;
            int fieldTemp$0 = ((ca) this).field_Z + 1;
            ((ca) this).field_Z = ((ca) this).field_Z + 1;
            if (~((ca) this).field_eb >= ~fieldTemp$0) {
                ((ca) this).field_eb = 0;
                ((ca) this).l(param0 ^ -27562);
            } else {
                var4 = (((ca) this).field_eb * 2 + -((ca) this).field_Z) * ((ca) this).field_Z;
                var5 = ((ca) this).field_eb * ((ca) this).field_eb;
                var2 = var4 * (-((ca) this).field_U + ((ca) this).field_X) / var5 + ((ca) this).field_U;
                var3 = var4 * (((ca) this).field_ab + -((ca) this).field_cb) / var5 + ((ca) this).field_cb;
            }
            ((ca) this).b(var2, 1688990433, var3);
        }
        if (param0 != 2968) {
            boolean discarded$1 = ((ca) this).k(-35);
        }
        return super.k(2968);
    }

    void g(byte param0) {
        if (((ca) this).field_eb <= 0) {
            return;
        }
        if (param0 > -111) {
            return;
        }
        ((ca) this).b(((ca) this).field_X, 1688990433, ((ca) this).field_ab);
        ((ca) this).field_eb = 0;
        ((ca) this).l(-24626);
    }

    static {
    }
}
