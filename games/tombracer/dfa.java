/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dfa {
    static java.applet.Applet field_e;
    static String field_a;
    static gb field_b;
    int field_d;
    int field_c;

    final static boolean a(int param0, boolean param1, int param2) {
        String var4 = null;
        int var3 = null != ifa.field_n ? 1 : 0;
        if (fna.field_h == 9) {
            if (!sqa.a(uba.field_f, 110, fp.field_d, tba.field_g, bla.field_I)) {
                if ((fna.field_h ^ -1) == -11) {
                    if (!(var3 == 0)) {
                        return false;
                    }
                    ola.e((byte) 113);
                    return true;
                }
                if (!param1) {
                    if (fna.field_h != 11) {
                        return false;
                    }
                    if (!ns.field_f) {
                        return false;
                    }
                    if (-3 != (gm.field_n ^ -1)) {
                        if (2 == gm.field_n) {
                            if (!(!oj.i(-1))) {
                                var4 = (String) null;
                                opa.a(gm.field_n, (String) null, param2, 32371, cr.field_b, uda.field_q);
                            }
                            return true;
                        }
                        if (var3 == 0) {
                            if (!(!oj.i(-1))) {
                                var4 = (String) null;
                                opa.a(gm.field_n, (String) null, param2, 32371, cr.field_b, uda.field_q);
                            }
                            return true;
                        }
                        return false;
                    }
                    if (ota.a(apa.field_a, (byte) 13, cr.field_b)) {
                        if (2 != gm.field_n && var3 != 0) {
                            return false;
                        }
                        if (!(!oj.i(-1))) {
                            var4 = (String) null;
                            opa.a(gm.field_n, (String) null, param2, 32371, cr.field_b, uda.field_q);
                        }
                        return true;
                    }
                    return false;
                }
                field_e = (java.applet.Applet) null;
                if (fna.field_h != 11) {
                    return false;
                }
                if (!(!ns.field_f)) {
                    if (-3 == (gm.field_n ^ -1) && !ota.a(apa.field_a, (byte) 13, cr.field_b)) {
                        return false;
                    }
                    if (2 != gm.field_n && var3 != 0) {
                        return false;
                    }
                    if (!(!oj.i(-1))) {
                        var4 = (String) null;
                        opa.a(gm.field_n, (String) null, param2, 32371, cr.field_b, uda.field_q);
                    }
                    return true;
                }
                return false;
            }
            if (-3 != (uba.field_f ^ -1) && var3 != 0) {
                return false;
            }
            return eca.a((byte) -121, uba.field_f, bla.field_I, fp.field_d, tba.field_g);
        }
        if ((fna.field_h ^ -1) == -11) {
            if (!(var3 == 0)) {
                return false;
            }
            ola.e((byte) 113);
            return true;
        }
        if (param1) {
            field_e = (java.applet.Applet) null;
            if (fna.field_h == 11) {
                if (!ns.field_f) {
                    return false;
                }
                if (-3 == (gm.field_n ^ -1) && !ota.a(apa.field_a, (byte) 13, cr.field_b)) {
                    return false;
                }
                if (2 != gm.field_n && var3 != 0) {
                    return false;
                }
                if (!(!oj.i(-1))) {
                    var4 = (String) null;
                    opa.a(gm.field_n, (String) null, param2, 32371, cr.field_b, uda.field_q);
                }
                return true;
            }
            return false;
        }
        if (fna.field_h == 11) {
            if (!ns.field_f) {
                return false;
            }
            if (-3 == (gm.field_n ^ -1) && !ota.a(apa.field_a, (byte) 13, cr.field_b)) {
                return false;
            }
            if (2 != gm.field_n && var3 != 0) {
                return false;
            }
            if (!(!oj.i(-1))) {
                var4 = (String) null;
                opa.a(gm.field_n, (String) null, param2, 32371, cr.field_b, uda.field_q);
            }
            return true;
        }
        return false;
    }

    final static int a(int param0, int param1, int param2) {
        int var3;
        L0: {
          var3 = 118 % ((24 - param2) / 41);
          if (-1 >= (param0 ^ -1)) {
            break L0;
          } else {
            param0 = param1 + param0 % param1;
            break L0;
          }
        }
        if (param0 >= param1) {
          return param0 % param1;
        } else {
          return param0;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        String var7 = null;
        int var8 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 >= param2) {
                var8 = param2;
                var5_int = var8;
                L2: while (true) {
                  if (param1 <= var8) {
                    break L1;
                  } else {
                    vaa.field_a[var8][param0] = param3;
                    var8++;
                    continue L2;
                  }
                }
              } else {
                var5_int = param1;
                L3: while (true) {
                  if (param2 <= var5_int) {
                    break L1;
                  } else {
                    vaa.field_a[var5_int][param0] = param3;
                    var5_int++;
                    continue L3;
                  }
                }
              }
            }
            if (param4 == 0) {
              break L0;
            } else {
              var7 = (String) null;
              dfa.a('N', (String) null, (String) null, 30);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var5), "dfa.FC(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void c(byte param0) {
        L0: {
          og.b(0);
          if (null != nma.field_l) {
            pq.a(nma.field_l, false);
            break L0;
          } else {
            break L0;
          }
        }
        ola.f((byte) 101);
        pc.a(5);
        if (param0 != 62) {
          L1: {
            dfa.a(-50, false, 79);
            rda.e(0);
            if (bl.b(param0 + -62)) {
              ql.field_k.k(1, -2988);
              bl.a(0, -1);
              break L1;
            } else {
              break L1;
            }
          }
          dea.a(60);
          return;
        } else {
          L2: {
            rda.e(0);
            if (bl.b(param0 + -62)) {
              ql.field_k.k(1, -2988);
              bl.a(0, -1);
              break L2;
            } else {
              break L2;
            }
          }
          dea.a(60);
          return;
        }
    }

    abstract boolean b(int param0);

    abstract void a(byte param0, boolean param1);

    abstract void a(boolean param0, boolean param1, int param2);

    public static void b(byte param0) {
        field_b = null;
        if (param0 != -104) {
            field_b = (gb) null;
            field_e = null;
            field_a = null;
            return;
        }
        field_e = null;
        field_a = null;
    }

    abstract void a(int param0);

    final static String a(char param0, String param1, String param2, int param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        int var11 = 0;
        String stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param2.length();
              var5 = param1.length();
              var6 = var4_int;
              var7 = var5 + -1;
              if (param3 != var7) {
                var8_int = 0;
                L2: while (true) {
                  var8_int = param2.indexOf((int) param0, var8_int);
                  if (-1 >= (var8_int ^ -1)) {
                    var8_int++;
                    var6 = var6 + var7;
                    continue L2;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            var8 = new StringBuilder(var6);
            var9 = 0;
            L3: while (true) {
              var10 = param2.indexOf((int) param0, var9);
              if (var10 < 0) {
                discarded$0 = var8.append(param2.substring(var9));
                stackIn_11_0 = var8.toString();
                break L0;
              } else {
                discarded$1 = var8.append(param2.substring(var9, var10));
                var9 = var10 + 1;
                discarded$2 = var8.append(param1);
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("dfa.EC(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ',' + param3 + ')');
        }
        return stackIn_11_0;
    }

    abstract boolean a(int param0, char param1, int param2);

    abstract void a(byte param0);

    dfa(int param0) {
        this.field_c = param0;
        this.field_d = this.field_c;
    }

    static {
        field_a = "Bruce";
        field_b = new gb();
    }
}
