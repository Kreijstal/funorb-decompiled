/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class s {
    static int[] field_f;
    static int field_c;
    private java.util.zip.Inflater field_g;
    static int field_i;
    static int field_e;
    static String field_h;
    static boolean field_d;
    static String field_a;
    static String field_b;

    public s() {
        this(-1, 1000000, 1000000);
    }

    final static void a(boolean param0) {
        RuntimeException var1 = null;
        sl var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        String var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        ve var6 = null;
        String var7 = null;
        ve var7_ref = null;
        String var8 = null;
        int var9 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_43_0 = false;
        int stackIn_50_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        boolean stackOut_42_0 = false;
        int stackOut_48_0 = 0;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var1_ref = sa.field_a;
            var2 = var1_ref.j(-64);
            if (var2 == 0) {
              L1: {
                if (sl.field_m != null) {
                  break L1;
                } else {
                  sl.field_m = new in(128);
                  oi.field_e = 0;
                  break L1;
                }
              }
              L2: {
                if (1 != var1_ref.j(-65)) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L2;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_11_0 = stackOut_8_0;
                  break L2;
                }
              }
              L3: {
                L4: {
                  var3_int = stackIn_11_0;
                  var4_ref_String = var1_ref.e(-1);
                  if (var3_int == 0) {
                    break L4;
                  } else {
                    var5 = var1_ref.e(-1);
                    if (var9 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                var5 = var4_ref_String;
                break L3;
              }
              L5: {
                var6 = di.a(var4_ref_String, 124);
                var7 = var1_ref.e(-1);
                var8 = ji.a((CharSequence) (Object) var4_ref_String, true);
                if (var8 != null) {
                  break L5;
                } else {
                  var8 = var4_ref_String;
                  break L5;
                }
              }
              L6: {
                if (var6 != null) {
                  break L6;
                } else {
                  var6 = di.a(var7, 124);
                  if (null == var6) {
                    break L6;
                  } else {
                    sl.field_m.a((long)var8.hashCode(), (df) (Object) var6, true);
                    break L6;
                  }
                }
              }
              L7: {
                if (null != var6) {
                  break L7;
                } else {
                  var6 = new ve();
                  sl.field_m.a((long)var8.hashCode(), (df) (Object) var6, param0);
                  int fieldTemp$2 = oi.field_e;
                  oi.field_e = oi.field_e + 1;
                  var6.field_zb = fieldTemp$2;
                  fp.field_b.a((byte) -113, (oh) (Object) var6);
                  break L7;
                }
              }
              var6.field_Eb = var5;
              var6.field_Ab = var4_ref_String;
              var6.field_Bb = var7;
              return;
            } else {
              if (1 == var2) {
                L8: {
                  if (eg.field_q != null) {
                    break L8;
                  } else {
                    eg.field_q = new in(128);
                    r.field_c = 0;
                    break L8;
                  }
                }
                L9: {
                  var3 = var1_ref.e(-1);
                  if (!var3.equals((Object) (Object) "")) {
                    break L9;
                  } else {
                    var3 = null;
                    break L9;
                  }
                }
                L10: {
                  var4_ref_String = var1_ref.e(-1);
                  var5 = var1_ref.e(-1);
                  var6 = hb.a((byte) -90, var4_ref_String);
                  if (var6 != null) {
                    break L10;
                  } else {
                    var6 = hb.a((byte) -90, var5);
                    if (null == var6) {
                      break L10;
                    } else {
                      eg.field_q.a((long)ji.a((CharSequence) (Object) var4_ref_String, param0).hashCode(), (df) (Object) var6, true);
                      break L10;
                    }
                  }
                }
                L11: {
                  if (null != var6) {
                    break L11;
                  } else {
                    var6 = new ve();
                    eg.field_q.a((long)ji.a((CharSequence) (Object) var4_ref_String, true).hashCode(), (df) (Object) var6, true);
                    int fieldTemp$3 = r.field_c;
                    r.field_c = r.field_c + 1;
                    var6.field_zb = fieldTemp$3;
                    vd.field_j.a((byte) -113, (oh) (Object) var6);
                    break L11;
                  }
                }
                L12: {
                  if (var3 == null) {
                    break L12;
                  } else {
                    var3 = var3.intern();
                    break L12;
                  }
                }
                var6.field_Ab = var4_ref_String;
                var6.field_xb = var3;
                var6.field_Bb = var5;
                var6.b((byte) -125);
                var7_ref = (ve) (Object) vd.field_j.d(0);
                L13: while (true) {
                  L14: {
                    L15: {
                      L16: {
                        L17: {
                          if (var7_ref == null) {
                            break L17;
                          } else {
                            stackOut_42_0 = d.a(var7_ref, var6, (byte) -81);
                            stackIn_50_0 = stackOut_42_0 ? 1 : 0;
                            stackIn_43_0 = stackOut_42_0;
                            if (var9 != 0) {
                              break L16;
                            } else {
                              if (!stackIn_43_0) {
                                break L17;
                              } else {
                                var7_ref = (ve) (Object) vd.field_j.a((byte) -71);
                                if (var9 == 0) {
                                  continue L13;
                                } else {
                                  break L17;
                                }
                              }
                            }
                          }
                        }
                        if (var7_ref == null) {
                          break L15;
                        } else {
                          stackOut_48_0 = -126;
                          stackIn_50_0 = stackOut_48_0;
                          break L16;
                        }
                      }
                      wp.a((byte) stackIn_50_0, (oh) (Object) var6, (oh) (Object) var7_ref);
                      if (var9 == 0) {
                        break L14;
                      } else {
                        break L15;
                      }
                    }
                    vd.field_j.a((byte) -113, (oh) (Object) var6);
                    break L14;
                  }
                  return;
                }
              } else {
                L18: {
                  if (param0) {
                    break L18;
                  } else {
                    field_i = 92;
                    break L18;
                  }
                }
                if (2 == var2) {
                  L19: {
                    if (po.field_b != 1) {
                      break L19;
                    } else {
                      po.field_b = 2;
                      break L19;
                    }
                  }
                  return;
                } else {
                  if (3 != var2) {
                    if (var2 == 4) {
                      po.field_b = 1;
                      var3 = var1_ref.e(-1);
                      jo.field_d = var3.intern();
                      var4 = var1_ref.j(-71);
                      os.a(-82, var4);
                      return;
                    } else {
                      jq.a(-29901, (Throwable) null, "F1: " + w.a(16738));
                      q.g(-101);
                      break L0;
                    }
                  } else {
                    L20: {
                      if (2 == po.field_b) {
                        po.field_b = 1;
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "s.A(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        ec.a(-1, eb.field_a, 5);
        if (param0 != 1) {
            return;
        }
        try {
            ec.a(param0 ^ -2, bg.field_c, 8);
            if (!kl.d((byte) 104)) {
                ec.a(-1, rm.field_h, 1);
                ec.a(-1, up.field_b, 2);
                ec.a(param0 ^ -2, hr.field_e, 3);
                ec.a(param0 ^ -2, lm.field_e, 4);
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "s.C(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        try {
            field_a = null;
            field_h = null;
            field_b = null;
            field_f = null;
            if (param0 != 114) {
                field_e = 10;
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "s.D(" + param0 + ')');
        }
    }

    private s(int param0, int param1, int param2) {
    }

    final void a(byte[] param0, ob param1, int param2) {
        try {
            Exception exception = null;
            RuntimeException var4 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            String stackIn_24_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            RuntimeException stackOut_23_0 = null;
            StringBuilder stackOut_23_1 = null;
            String stackOut_23_2 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            String stackOut_21_2 = null;
            try {
              L0: {
                L1: {
                  if (param1.field_h[param1.field_j] != 31) {
                    break L1;
                  } else {
                    if (param1.field_h[1 + param1.field_j] == -117) {
                      L2: {
                        if (null != ((s) this).field_g) {
                          break L2;
                        } else {
                          ((s) this).field_g = new java.util.zip.Inflater(true);
                          break L2;
                        }
                      }
                      try {
                        L3: {
                          ((s) this).field_g.setInput(param1.field_h, param1.field_j + 10, -10 - (param1.field_j + 8) + param1.field_h.length);
                          int discarded$2 = ((s) this).field_g.inflate(param0);
                          break L3;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        exception = (Exception) (Object) decompiledCaughtException;
                        ((s) this).field_g.reset();
                        throw new RuntimeException("");
                      }
                      L4: {
                        ((s) this).field_g.reset();
                        if (param2 == 5591) {
                          break L4;
                        } else {
                          s.a(-110);
                          break L4;
                        }
                      }
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                throw new RuntimeException("");
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_16_0 = (RuntimeException) var4;
                stackOut_16_1 = new StringBuilder().append("s.B(");
                stackIn_19_0 = stackOut_16_0;
                stackIn_19_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (param0 == null) {
                  stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                  stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                  stackOut_19_2 = "null";
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  break L5;
                } else {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "{...}";
                  stackIn_20_0 = stackOut_17_0;
                  stackIn_20_1 = stackOut_17_1;
                  stackIn_20_2 = stackOut_17_2;
                  break L5;
                }
              }
              L6: {
                stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
                stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
                stackIn_23_0 = stackOut_20_0;
                stackIn_23_1 = stackOut_20_1;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                if (param1 == null) {
                  stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
                  stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
                  stackOut_23_2 = "null";
                  stackIn_24_0 = stackOut_23_0;
                  stackIn_24_1 = stackOut_23_1;
                  stackIn_24_2 = stackOut_23_2;
                  break L6;
                } else {
                  stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                  stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                  stackOut_21_2 = "{...}";
                  stackIn_24_0 = stackOut_21_0;
                  stackIn_24_1 = stackOut_21_1;
                  stackIn_24_2 = stackOut_21_2;
                  break L6;
                }
              }
              throw r.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = -1;
        field_f = new int[4];
        field_h = "Message lobby";
        field_a = "Security";
        field_b = "<%0> has withdrawn the request to join.";
    }
}
