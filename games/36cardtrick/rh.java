/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh extends qb {
    int field_i;
    static int field_k;
    static String field_g;
    static boolean field_j;
    static gf field_l;
    static int[] field_h;

    final static void a() {
        RuntimeException var1 = null;
        w var1_ref = null;
        int var2 = 0;
        String var3 = null;
        int var3_int = 0;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        aa var5_ref = null;
        aa var6 = null;
        String var6_ref = null;
        String var7 = null;
        aa var7_ref = null;
        int var8 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        var8 = Main.field_T;
        try {
          L0: {
            var1_ref = rd.field_j;
            var2 = var1_ref.f(-102);
            if (var2 != 0) {
              if (1 == var2) {
                L1: {
                  if (rf.field_d == null) {
                    rf.field_d = new ph(128);
                    ok.field_b = 0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  var3 = var1_ref.c(false);
                  if (var3.equals((Object) (Object) "")) {
                    var3 = null;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  var4_ref_String = var1_ref.c(false);
                  var5 = var1_ref.c(false);
                  var6 = jf.a(0, var4_ref_String);
                  if (var6 == null) {
                    var6 = jf.a(0, var5);
                    if (null != var6) {
                      rf.field_d.a((he) (Object) var6, (long)ff.a((byte) 116, (CharSequence) (Object) var4_ref_String).hashCode(), 6144);
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (var6 != null) {
                    break L4;
                  } else {
                    var6 = new aa();
                    rf.field_d.a((he) (Object) var6, (long)ff.a((byte) 116, (CharSequence) (Object) var4_ref_String).hashCode(), 6144);
                    int fieldTemp$4 = ok.field_b;
                    ok.field_b = ok.field_b + 1;
                    var6.field_eb = fieldTemp$4;
                    kh.field_c.a((qb) (Object) var6, 27362);
                    break L4;
                  }
                }
                L5: {
                  if (var3 != null) {
                    var3 = var3.intern();
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var6.field_gb = var4_ref_String;
                var6.field_cb = var3;
                var6.c(82);
                var7_ref = (aa) (Object) kh.field_c.a((byte) 74);
                L6: while (true) {
                  L7: {
                    if (null == var7_ref) {
                      break L7;
                    } else {
                      if (!rl.a((byte) 127, var7_ref, var6)) {
                        break L7;
                      } else {
                        var7_ref = (aa) (Object) kh.field_c.b((byte) -109);
                        if (var8 == 0) {
                          continue L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  L8: {
                    L9: {
                      if (null != var7_ref) {
                        break L9;
                      } else {
                        kh.field_c.a((qb) (Object) var6, 27362);
                        if (var8 == 0) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    ce.a((qb) (Object) var7_ref, 0, (qb) (Object) var6);
                    break L8;
                  }
                  return;
                }
              } else {
                if (var2 == 2) {
                  L10: {
                    if (ii.field_c != 1) {
                      break L10;
                    } else {
                      ii.field_c = 2;
                      break L10;
                    }
                  }
                  return;
                } else {
                  if (var2 == 3) {
                    L11: {
                      if (2 == ii.field_c) {
                        ii.field_c = 1;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    return;
                  } else {
                    if (var2 != 4) {
                      int discarded$5 = 92;
                      k.a((Throwable) null, (byte) -108, "F1: " + aj.a());
                      mc.a((byte) -125);
                      break L0;
                    } else {
                      ii.field_c = 1;
                      var3 = var1_ref.c(false);
                      bc.field_b = var3.intern();
                      var4 = var1_ref.f(121);
                      sl.a((byte) 99, var4);
                      return;
                    }
                  }
                }
              }
            } else {
              L12: {
                if (sl.field_b == null) {
                  sl.field_b = new ph(128);
                  de.field_b = 0;
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (var1_ref.f(15) != 1) {
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  break L13;
                } else {
                  stackOut_11_0 = 1;
                  stackIn_14_0 = stackOut_11_0;
                  break L13;
                }
              }
              L14: {
                var3_int = stackIn_14_0;
                var4_ref_String = var1_ref.c(false);
                if (var3_int != 0) {
                  String discarded$6 = var1_ref.c(false);
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                var5_ref = hb.a((byte) -118, var4_ref_String);
                var6_ref = var1_ref.c(false);
                var7 = ff.a((byte) 116, (CharSequence) (Object) var4_ref_String);
                if (null != var7) {
                  break L15;
                } else {
                  var7 = var4_ref_String;
                  break L15;
                }
              }
              L16: {
                if (var5_ref != null) {
                  break L16;
                } else {
                  var5_ref = hb.a((byte) -41, var6_ref);
                  if (null != var5_ref) {
                    sl.field_b.a((he) (Object) var5_ref, (long)var7.hashCode(), 6144);
                    break L16;
                  } else {
                    break L16;
                  }
                }
              }
              L17: {
                if (var5_ref == null) {
                  var5_ref = new aa();
                  sl.field_b.a((he) (Object) var5_ref, (long)var7.hashCode(), 6144);
                  int fieldTemp$7 = de.field_b;
                  de.field_b = de.field_b + 1;
                  var5_ref.field_eb = fieldTemp$7;
                  cd.field_b.a((qb) (Object) var5_ref, 27362);
                  break L17;
                } else {
                  break L17;
                }
              }
              var5_ref.field_gb = var4_ref_String;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1, "rh.A(" + 0 + ')');
        }
    }

    final static void d(int param0) {
        try {
            ml.field_b = null;
            hb.field_a = null;
            na.field_q = null;
            rd.field_k = null;
            jf.field_i = null;
            int var1_int = 5 / ((-88 - param0) / 33);
            kb.field_c = null;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "rh.D(" + param0 + ')');
        }
    }

    private rh() throws Throwable {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          throw new Error();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1, "rh.<init>()");
        }
    }

    final static String[] a(char param0, String param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_16_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var9 = Main.field_T;
        try {
          L0: {
            L1: {
              var3_int = qd.a((byte) -118, param0, (CharSequence) (Object) param1);
              var4 = new String[var3_int + 1];
              var5 = 0;
              if (param2 < -24) {
                break L1;
              } else {
                field_k = -6;
                break L1;
              }
            }
            var6 = 0;
            var7 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var3_int <= var7) {
                    break L4;
                  } else {
                    if (var9 != 0) {
                      break L3;
                    } else {
                      var8 = var6;
                      L5: while (true) {
                        L6: {
                          L7: {
                            if (param0 == param1.charAt(var8)) {
                              break L7;
                            } else {
                              var8++;
                              if (var9 != 0) {
                                break L6;
                              } else {
                                if (var9 == 0) {
                                  continue L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          int incrementValue$2 = var5;
                          var5++;
                          var4[incrementValue$2] = param1.substring(var6, var8);
                          var6 = 1 + var8;
                          var7++;
                          break L6;
                        }
                        if (var9 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                var4[var3_int] = param1.substring(var6);
                break L3;
              }
              stackOut_16_0 = (String[]) var4;
              stackIn_17_0 = stackOut_16_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3;
            stackOut_18_1 = new StringBuilder().append("rh.C(").append(param0).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L8;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param2 + ')');
        }
        return stackIn_17_0;
    }

    public static void b() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_g = null;
            field_l = null;
            field_h = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1, "rh.E(" + -109 + ')');
        }
    }

    final static kc a(int param0, qk param1, int param2) {
        RuntimeException var4 = null;
        Object stackIn_7_0 = null;
        kc stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        kc stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (!tc.a(param2, param0, 25479, param1)) {
              stackOut_6_0 = null;
              stackIn_7_0 = stackOut_6_0;
              return (kc) (Object) stackIn_7_0;
            } else {
              int discarded$1 = 35;
              stackOut_8_0 = sj.b();
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("rh.B(").append(param0).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L1;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param2 + ',' + -30851 + ')');
        }
        return stackIn_9_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = false;
        field_k = 0;
        field_g = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_h = new int[12];
    }
}
