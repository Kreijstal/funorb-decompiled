/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km extends fh {
    static ed field_k;
    static String field_o;
    static int[] field_j;
    static String field_l;
    private java.nio.ByteBuffer field_m;
    static pk field_n;

    final byte[] a(int param0) {
        if (param0 != 4) {
            field_j = null;
        }
        byte[] var3 = new byte[((km) this).field_m.capacity()];
        byte[] var2 = var3;
        java.nio.Buffer discarded$0 = ((km) this).field_m.position(0);
        java.nio.ByteBuffer discarded$1 = ((km) this).field_m.get(var3);
        return var3;
    }

    public static void c(int param0) {
        field_j = null;
        field_k = null;
        field_o = null;
        field_n = null;
        field_l = null;
        if (param0 != -4) {
            km.a(111, 74);
        }
    }

    final void a(boolean param0, byte[] param1) {
        ((km) this).field_m = java.nio.ByteBuffer.allocateDirect(param1.length);
        java.nio.Buffer discarded$6 = ((km) this).field_m.position(0);
        if (!param0) {
            ((km) this).field_m = null;
        }
        java.nio.ByteBuffer discarded$7 = ((km) this).field_m.put(param1);
    }

    final static void a(int param0, int param1) {
        c var2 = om.field_c;
        var2.a(param0, true);
        var2.f(1, -123);
        int var3 = -50 % ((61 - param1) / 57);
        var2.f(2, -123);
    }

    km() {
    }

    final static void b(byte param0) {
        if (param0 != -59) {
            return;
        }
        if (!ce.field_f.field_h) {
            if (!(ce.field_f.field_c)) {
                ce.field_f.b((byte) -126);
                ce.field_f.e(param0 ^ 19593);
            }
        }
        if (!(ua.field_c.a(-19836))) {
            boolean discarded$0 = ua.field_c.g(-9949);
        }
        hk.b(param0 ^ -57);
        fg.b(0);
    }

    final static void a(n param0, lk param1, int param2, int param3) {
        try {
            int var5 = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var6_int = 0;
            String var7 = null;
            String var8 = null;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            Class[] var12 = null;
            int var12_int = 0;
            int var13 = 0;
            int var14 = 0;
            String var15 = null;
            int var16 = 0;
            Object var17 = null;
            byte[][] var18 = null;
            String var19 = null;
            byte[][] var20 = null;
            byte[][] var21 = null;
            byte[][] var22 = null;
            Throwable decompiledCaughtException = null;
            var14 = EscapeVector.field_A;
            if (param3 == -24183) {
              var17 = (Object) (Object) new mn();
              ((mn) var17).field_i = param0.e(0);
              ((mn) var17).field_g = param0.g(param3 + 19130);
              ((mn) var17).field_p = new la[((mn) var17).field_i];
              ((mn) var17).field_m = new int[((mn) var17).field_i];
              ((mn) var17).field_o = new int[((mn) var17).field_i];
              ((mn) var17).field_j = new int[((mn) var17).field_i];
              ((mn) var17).field_l = new byte[((mn) var17).field_i][][];
              ((mn) var17).field_r = new la[((mn) var17).field_i];
              var5 = 0;
              L0: while (true) {
                if ((var5 ^ -1) <= (((mn) var17).field_i ^ -1)) {
                  je.field_a.a(-12328, (hg) var17);
                  return;
                } else {
                  try {
                    L1: {
                      L2: {
                        L3: {
                          var6_int = param0.e(0);
                          if (0 == var6_int) {
                            break L3;
                          } else {
                            if (-2 == (var6_int ^ -1)) {
                              break L3;
                            } else {
                              if (-3 != (var6_int ^ -1)) {
                                L4: {
                                  L5: {
                                    if (var6_int == 3) {
                                      break L5;
                                    } else {
                                      if (-5 != (var6_int ^ -1)) {
                                        break L4;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                  var19 = param0.c(false);
                                  var8 = param0.c(false);
                                  var9 = param0.e(param3 + 24183);
                                  var10 = new String[var9];
                                  var11_int = 0;
                                  L6: while (true) {
                                    if ((var11_int ^ -1) <= (var9 ^ -1)) {
                                      L7: {
                                        var22 = new byte[var9][];
                                        var21 = var22;
                                        var20 = var21;
                                        var18 = var20;
                                        var11 = var18;
                                        if (-4 != (var6_int ^ -1)) {
                                          break L7;
                                        } else {
                                          var12_int = 0;
                                          L8: while (true) {
                                            if (var12_int >= var9) {
                                              break L7;
                                            } else {
                                              var13 = param0.g(param3 ^ 19914);
                                              var11[var12_int] = new byte[var13];
                                              param0.a(var22[var12_int], (byte) -96, 0, var13);
                                              var12_int++;
                                              continue L8;
                                            }
                                          }
                                        }
                                      }
                                      ((mn) var17).field_m[var5] = var6_int;
                                      var12 = new Class[var9];
                                      var16 = 0;
                                      var13 = var16;
                                      L9: while (true) {
                                        if (var16 >= var9) {
                                          ((mn) var17).field_p[var5] = param1.a(var8, n.a(param3, -24074), en.a(var19, (byte) 38), var12);
                                          ((mn) var17).field_l[var5] = var22;
                                          break L4;
                                        } else {
                                          var12[var16] = en.a(var10[var16], (byte) 38);
                                          var16++;
                                          continue L9;
                                        }
                                      }
                                    } else {
                                      var10[var11_int] = param0.c(false);
                                      var11_int++;
                                      continue L6;
                                    }
                                  }
                                }
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                        L10: {
                          var15 = param0.c(false);
                          var7 = var15;
                          var8 = param0.c(false);
                          var9 = 0;
                          if (var6_int != 1) {
                            break L10;
                          } else {
                            var9 = param0.g(-5053);
                            break L10;
                          }
                        }
                        ((mn) var17).field_m[var5] = var6_int;
                        ((mn) var17).field_j[var5] = var9;
                        ((mn) var17).field_r[var5] = param1.a(var8, en.a(var15, (byte) 38), n.a(param3, 24120));
                        break L2;
                      }
                      break L1;
                    }
                  } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L11: {
                      var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                      ((mn) var17).field_o[var5] = -1;
                      break L11;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter3) {
                    decompiledCaughtException = decompiledCaughtParameter3;
                    L14: {
                      var6_ref3 = (Exception) (Object) decompiledCaughtException;
                      ((mn) var17).field_o[var5] = -4;
                      break L14;
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter4) {
                    decompiledCaughtException = decompiledCaughtParameter4;
                    L15: {
                      var6_ref4 = decompiledCaughtException;
                      ((mn) var17).field_o[var5] = -5;
                      break L15;
                    }
                  }
                  var5++;
                  continue L0;
                }
              }
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(n param0, int param1) {
        hk.field_n = param0.f(param1 + -1238557701) << 1238559653;
        int var2 = param0.e(0);
        hk.field_n = hk.field_n + (var2 >> -8258493);
        wk.field_d = 1835008 & var2 << 1755770738;
        wk.field_d = wk.field_d + (param0.f(1952) << 942425122);
        var2 = param0.e(param1 + -1238559653);
        wk.field_d = wk.field_d + (var2 >> -964320506);
        oc.field_u = (63 & var2) << 14076911;
        oc.field_u = oc.field_u + (param0.e(param1 + -1238559653) << -1075165273);
        var2 = param0.e(param1 ^ param1);
        bk.field_s = (var2 & 1) << -625386768;
        oc.field_u = oc.field_u + (var2 >> -1955580831);
        bk.field_s = bk.field_s + param0.f(1952);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_o = "Retrieval objectives";
        field_j = new int[8192];
        field_n = null;
    }
}
