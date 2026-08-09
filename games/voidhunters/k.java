/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k extends rqa {
    static String field_p;
    static int field_r;
    static String field_q;
    static String field_o;

    public static void e(byte param0) {
        int var1 = 67 / ((36 - param0) / 39);
        field_q = null;
        field_o = null;
        field_p = null;
    }

    final static int a(byte param0, int param1, byte[] param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var4_int = -1;
              if (param0 == -69) {
                break L1;
              } else {
                k.e((byte) -96);
                break L1;
              }
            }
            var5 = param3;
            L2: while (true) {
              if (param1 <= var5) {
                var4_int = var4_int ^ -1;
                stackIn_7_0 = var4_int;
                break L0;
              } else {
                var4_int = var4_int >>> 60832328 ^ coa.field_d[255 & (var4_int ^ param2[var5])];
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("k.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -119) {
                break L1;
              } else {
                field_o = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = new nc(oq.field_c);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("k.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    k(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, boolean param1, String param2, boolean param3, byte param4) {
        String stackIn_4_0 = null;
        String stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        String stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_38_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        var10 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              wia.field_a = true;
              ft.field_t = param0;
              var11 = param2;
              if (param1) {
                stackIn_4_0 = era.field_q;
                break L1;
              } else {
                stackIn_4_0 = kg.field_s;
                break L1;
              }
            }
            L2: {
              var6 = stackIn_4_0;
              if (-1 != (ft.field_t ^ -1)) {
                if ((ft.field_t ^ -1) != -2) {
                  throw new IllegalArgumentException();
                } else {
                  var7 = wva.a(480, rea.field_e, 0, var11, oja.field_p);
                  var8 = var7 + 2;
                  aka.field_o = new int[var8];
                  db.field_o = new String[var8];
                  var9 = 0;
                  L3: while (true) {
                    if (var9 >= var8) {
                      kc.field_e = new int[1];
                      var9 = 0;
                      L4: while (true) {
                        if (var9 >= var7) {
                          db.field_o[-2 + var8] = "";
                          db.field_o[-1 + var8] = wm.field_b;
                          aka.field_o[-1 + var8] = 0;
                          kc.field_e[0] = 2;
                          break L2;
                        } else {
                          db.field_o[var9] = rea.field_e[var9];
                          var9++;
                          continue L4;
                        }
                      }
                    } else {
                      aka.field_o[var9] = -1;
                      var9++;
                      continue L3;
                    }
                  }
                }
              } else {
                var7 = wva.a(480, rea.field_e, 0, var11, oja.field_p);
                var8 = 3 + var7;
                aka.field_o = new int[var8];
                db.field_o = new String[var8];
                var9 = 0;
                L5: while (true) {
                  if (var8 <= var9) {
                    kc.field_e = new int[2];
                    var9 = 0;
                    L6: while (true) {
                      if (var9 >= var7) {
                        db.field_o[-3 + var8] = "";
                        db.field_o[var8 + -2] = var6;
                        aka.field_o[var8 + -2] = 0;
                        kc.field_e[0] = 1;
                        db.field_o[var8 + -1] = wm.field_b;
                        aka.field_o[-1 + var8] = 1;
                        kc.field_e[1] = 2;
                        break L2;
                      } else {
                        db.field_o[var9] = rea.field_e[var9];
                        var9++;
                        continue L6;
                      }
                    }
                  } else {
                    aka.field_o[var9] = -1;
                    var9++;
                    continue L5;
                  }
                }
              }
            }
            ei.field_c.field_c = kc.field_e.length;
            var7 = 0;
            var8 = 0;
            L7: while (true) {
              if (var8 >= db.field_o.length) {
                if (param4 >= 11) {
                  mtb.field_p = -(var7 >> -332389919) + var7 + alb.field_b;
                  mua.field_d = alb.field_b + -(var7 >> 1753795585);
                  ot.field_b = (hwa.field_q - -pva.field_g << -568881151) * ei.field_c.field_c;
                  var8 = 0;
                  L8: while (true) {
                    if (db.field_o.length <= var8) {
                      nl.field_m = -(ot.field_b >> -1571504191) + pba.field_r;
                      ei.field_c.a(param3, -1, 0, rkb.a(uia.field_b, 3841, kc.field_b));
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L9: {
                        stackIn_38_0 = ot.field_b;

                        if ((aka.field_o[var8] ^ -1) <= -1) {
                          stackIn_39_0 = stackIn_38_0;
                          stackIn_39_1 = tba.field_o;
                          break L9;
                        } else {
                          stackIn_39_0 = stackIn_38_0;
                          stackIn_39_1 = whb.field_a;
                          break L9;
                        }
                      }
                      ot.field_b = stackIn_39_0 + stackIn_39_1;
                      var8++;
                      continue L8;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L10: {
                  stackIn_25_0 = db.field_o[var8];

                  stackIn_25_1 = -42;

                  if ((aka.field_o[var8] ^ -1) > -1) {
                    stackIn_26_0 = (String) ((Object) stackIn_25_0);
                    stackIn_26_1 = stackIn_25_1;
                    stackIn_26_2 = 0;
                    break L10;
                  } else {
                    stackIn_26_0 = (String) ((Object) stackIn_25_0);
                    stackIn_26_1 = stackIn_25_1;
                    stackIn_26_2 = 1;
                    break L10;
                  }
                }
                L11: {
                  var9 = lsa.a(stackIn_26_0, stackIn_26_1, stackIn_26_2 != 0);
                  if ((aka.field_o[var8] ^ -1) != 0) {
                    var9 = var9 + ih.field_e * 2;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                if (var7 < var9) {
                  var7 = var9;
                  var8++;
                  continue L7;
                } else {
                  var8++;
                  continue L7;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackIn_44_0 = (RuntimeException) (var5);

            stackIn_44_1 = new StringBuilder().append("k.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "null";
              break L12;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "{...}";
              break L12;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_p = "Rating";
        field_r = 250;
        field_q = "This game option is not available in rated games.";
        field_o = "Capture and Hold";
    }
}
