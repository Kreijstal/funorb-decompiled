/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh extends mk {
    static wk[] field_l;
    static String field_j;
    static int[] field_k;

    final static void a(vh param0, hd param1, int param2, int param3) {
        try {
            int var5 = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var6_int = 0;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            Class[] var12 = null;
            int var12_int = 0;
            int var13 = 0;
            int var14 = 0;
            String var15 = null;
            String var16 = null;
            int var17 = 0;
            dc var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            String var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            byte[][] var24 = null;
            Throwable decompiledCaughtException = null;
            var14 = ArmiesOfGielinor.field_M ? 1 : 0;
            var18 = new dc();
            var18.field_p = param0.k(0);
            var18.field_q = param0.i(1);
            var18.field_m = new int[var18.field_p];
            var18.field_u = new byte[var18.field_p][][];
            if (param3 == -1) {
              var18.field_k = new wo[var18.field_p];
              var18.field_r = new wo[var18.field_p];
              var18.field_t = new int[var18.field_p];
              var18.field_v = new int[var18.field_p];
              var5 = 0;
              L0: while (true) {
                if (var5 >= var18.field_p) {
                  var6_ref4 = decompiledCaughtException;
                  var18.field_m[var5] = -5;
                  var5++;
                } else {
                  try {
                    L1: {
                      L2: {
                        var6_int = param0.k(0);
                        if (0 == var6_int) {
                          break L2;
                        } else {
                          if (var6_int == 1) {
                            break L2;
                          } else {
                            if (-3 == (var6_int ^ -1)) {
                              break L2;
                            } else {
                              L3: {
                                if (3 == var6_int) {
                                  break L3;
                                } else {
                                  if ((var6_int ^ -1) == -5) {
                                    break L3;
                                  } else {
                                    var5++;
                                    break L1;
                                  }
                                }
                              }
                              var20 = param0.g(1);
                              var21 = param0.g(param3 + 2);
                              var9 = param0.k(0);
                              var10 = new String[var9];
                              var11_int = 0;
                              L4: while (true) {
                                if (var9 <= var11_int) {
                                  L5: {
                                    var24 = new byte[var9][];
                                    var23 = var24;
                                    var22 = var23;
                                    var19 = var22;
                                    var11 = var19;
                                    if (var6_int != 3) {
                                      break L5;
                                    } else {
                                      var12_int = 0;
                                      L6: while (true) {
                                        if (var9 <= var12_int) {
                                          break L5;
                                        } else {
                                          var13 = param0.i(1);
                                          var11[var12_int] = new byte[var13];
                                          param0.a(0, var13, 0, var24[var12_int]);
                                          var12_int++;
                                          continue L6;
                                        }
                                      }
                                    }
                                  }
                                  var18.field_t[var5] = var6_int;
                                  var12 = new Class[var9];
                                  var17 = 0;
                                  var13 = var17;
                                  L7: while (true) {
                                    if (var9 <= var17) {
                                      var18.field_r[var5] = param1.a(ah.a(var20, (byte) 90), 0, var12, var21);
                                      var18.field_u[var5] = var24;
                                      var5++;
                                      break L1;
                                    } else {
                                      var12[var17] = ah.a(var10[var17], (byte) 90);
                                      var17++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  var10[var11_int] = param0.g(kf.b(param3, -2));
                                  var11_int++;
                                  continue L4;
                                }
                              }
                            }
                          }
                        }
                      }
                      L8: {
                        var15 = param0.g(param3 + 2);
                        var16 = param0.g(1);
                        var9 = 0;
                        if (var6_int != 1) {
                          break L8;
                        } else {
                          var9 = param0.i(param3 + 2);
                          break L8;
                        }
                      }
                      var18.field_t[var5] = var6_int;
                      var18.field_v[var5] = var9;
                      var18.field_k[var5] = param1.a(-30598, ah.a(var15, (byte) 90), var16);
                      break L1;
                    }
                  } catch (java.lang.ClassNotFoundException decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                    var5++;
                  } catch (java.lang.Exception decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                    var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                    var18.field_m[var5] = -3;
                    var5++;
                  } catch (java.lang.Throwable decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                    var6_ref3 = (Exception) (Object) decompiledCaughtException;
                    var18.field_m[var5] = -4;
                    var5++;
                  }
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

    jh(fn param0) {
        super(param0);
    }

    final gu a(int param0, String param1) {
        if (param0 != -3137) {
            field_k = null;
        }
        CharSequence var4 = (CharSequence) (Object) param1;
        if (!(vv.a(-66, var4))) {
            return rn.field_e;
        }
        CharSequence var5 = (CharSequence) (Object) param1;
        int var3 = dq.a(46, var5);
        if ((var3 ^ -1) < -1) {
            // if_icmplt L73
        } else {
            return rn.field_e;
        }
        return oo.field_g;
    }

    final static boolean g(int param0) {
        if (param0 != 2) {
            field_l = null;
        }
        if (!(0 != (fk.field_b ^ -1))) {
            if (!(es.a(-122, 1))) {
                return false;
            }
            fk.field_b = mg.field_e.k(0);
            mg.field_e.field_q = 0;
        }
        if (-2 == fk.field_b) {
            if (!es.a(-96, 2)) {
                return false;
            }
            fk.field_b = mg.field_e.e((byte) -104);
            mg.field_e.field_q = 0;
        }
        return es.a(-105, fk.field_b);
    }

    final static void a(String param0, long param1, int param2, int param3, int param4) {
        vt.field_l = param3;
        wn.field_db = param0;
        vi.field_e = param2;
        if (param4 != 19212) {
            return;
        }
        lq.field_d = true;
        rt.field_z = param1;
    }

    final String a(byte param0, String param1) {
        if (param0 <= 89) {
            field_l = null;
        }
        if (((jh) this).a(-3137, param1) != rn.field_e) {
            return null;
        }
        return jg.field_n;
    }

    public static void h(int param0) {
        field_j = null;
        if (param0 >= -45) {
            field_k = null;
        }
        field_l = null;
        field_k = null;
    }

    final static void c(byte param0) {
        try {
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var1 = Runtime.class.getMethod("maxMemory", new Class[0]);
                if (param0 < -64) {
                  break L0;
                } else {
                  boolean discarded$1 = jh.g(-70);
                  break L0;
                }
              }
              L1: {
                if (var1 == null) {
                  break L1;
                } else {
                  try {
                    var2_ref = Runtime.getRuntime();
                    var4 = null;
                    var3 = (Long) var1.invoke((Object) (Object) var2_ref, (Object[]) null);
                    hq.field_f = (int)(var3.longValue() / 1048576L) + 1;
                  } catch (java.lang.Throwable decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                  }
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              var2 = decompiledCaughtException;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
