/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk extends gt implements ai {
    static boolean field_ob;
    static char[] field_lb;
    private boolean field_nb;
    private boolean field_pb;
    private js field_mb;

    uk(dg param0, js param1) {
        super(param0, tq.field_a, su.field_c, false, false);
        try {
            ((uk) this).field_mb = param1;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "uk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void g() {
        field_lb = null;
    }

    private final void a(boolean param0, byte param1, an param2) {
        RuntimeException var4 = null;
        String var4_ref = null;
        int var5 = 0;
        lc var6 = null;
        int var7 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              ((uk) this).field_nb = true;
              if (!param2.field_b) {
                if (param2.field_h == null) {
                  var4_ref = param2.field_g;
                  if (param2.field_e != 248) {
                    break L1;
                  } else {
                    L2: {
                      if (!param0) {
                        gj.c(0);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var4_ref = rn.field_a;
                    ((uk) this).field_pb = true;
                    break L1;
                  }
                } else {
                  var4_ref = au.field_e;
                  if (null == ((uk) this).field_mb) {
                    break L1;
                  } else {
                    ((uk) this).field_mb.a((byte) -119);
                    break L1;
                  }
                }
              } else {
                var4_ref = vl.field_b;
                break L1;
              }
            }
            L3: {
              var5 = -1 / ((-1 - param1) / 45);
              var6 = new lc((gt) this, tq.field_a, var4_ref);
              if (!param2.field_b) {
                L4: {
                  if (((uk) this).field_pb) {
                    wp discarded$2 = var6.a(wd.field_h, (byte) -123, (qm) this);
                    break L4;
                  } else {
                    if (param2.field_e != 5) {
                      var6.a(cq.field_c, -1, true);
                      break L4;
                    } else {
                      var6.a(vf.field_e, 11, true);
                      var6.a(of.field_k, 17, true);
                      break L4;
                    }
                  }
                }
                if (param2.field_e == 3) {
                  var6.a(lq.field_c, 7, true);
                  break L3;
                } else {
                  if (param2.field_e == 6) {
                    var6.a(eq.field_w, 9, true);
                    break L3;
                  } else {
                    ((uk) this).b((byte) -123, (pk) (Object) var6);
                    return;
                  }
                }
              } else {
                if (!param2.field_c) {
                  wp discarded$3 = var6.a(wd.field_h, (byte) -123, (qm) this);
                  break L3;
                } else {
                  ((uk) this).b((byte) -95, (pk) (Object) new th((uk) this));
                  return;
                }
              }
            }
            ((uk) this).b((byte) -123, (pk) (Object) var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var4;
            stackOut_28_1 = new StringBuilder().append("uk.V(").append(param0).append(',').append(param1).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L5;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L5;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ')');
        }
    }

    final void f(boolean param0) {
        this.a(param0, (byte) 127, au.a(-91, rn.field_a, 248));
    }

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
        if (param1 != 710) {
            field_ob = true;
        }
        if (!(!((uk) this).field_pb)) {
            sm.a((byte) -40, false, true);
            return;
        }
        try {
            kh.a(false);
            ((uk) this).n(-7);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "uk.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static String a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_30_0 = null;
        String stackIn_32_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_31_0 = null;
        Object stackOut_29_0 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param1 != null) {
              var2_int = 0;
              var3 = param1.length();
              L1: while (true) {
                L2: {
                  if (var3 <= var2_int) {
                    break L2;
                  } else {
                    if (!wv.a((byte) -98, param1.charAt(var2_int))) {
                      break L2;
                    } else {
                      var2_int++;
                      continue L1;
                    }
                  }
                }
                L3: while (true) {
                  L4: {
                    if (var2_int >= var3) {
                      break L4;
                    } else {
                      if (!wv.a((byte) -95, param1.charAt(var3 - 1))) {
                        break L4;
                      } else {
                        var3--;
                        continue L3;
                      }
                    }
                  }
                  var4 = var3 - var2_int;
                  if (var4 >= 1) {
                    if (12 >= var4) {
                      var5 = new StringBuilder(var4);
                      var6 = var2_int;
                      L5: while (true) {
                        if (var3 <= var6) {
                          if (var5.length() != 0) {
                            stackOut_31_0 = var5.toString();
                            stackIn_32_0 = stackOut_31_0;
                            break L0;
                          } else {
                            stackOut_29_0 = null;
                            stackIn_30_0 = stackOut_29_0;
                            return (String) (Object) stackIn_30_0;
                          }
                        } else {
                          L6: {
                            var7 = param1.charAt(var6);
                            if (!or.a((byte) 61, (char) var7)) {
                              var6++;
                              break L6;
                            } else {
                              var8 = iv.a(241, (char) var7);
                              if (var8 != 0) {
                                StringBuilder discarded$1 = var5.append((char) var8);
                                var6++;
                                break L6;
                              } else {
                                var6++;
                                break L6;
                              }
                            }
                          }
                          var6++;
                          continue L5;
                        }
                      }
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var2;
            stackOut_33_1 = new StringBuilder().append("uk.P(").append(-1).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param1 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L7;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L7;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ')');
        }
        return stackIn_32_0;
    }

    final boolean g(int param0) {
        an var2 = null;
        L0: {
          if (!((uk) this).field_D) {
            break L0;
          } else {
            if (!((uk) this).field_nb) {
              var2 = ki.c((byte) 94);
              if (var2 != null) {
                this.a(false, (byte) -128, var2);
                break L0;
              } else {
                if (param0 != -28778) {
                  return false;
                } else {
                  return super.g(param0);
                }
              }
            } else {
              if (param0 != -28778) {
                return false;
              } else {
                return super.g(param0);
              }
            }
          }
        }
        if (param0 != -28778) {
          return false;
        } else {
          return super.g(param0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ob = false;
        field_lb = new char[]{'€', ' ', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', ' ', 'Ž', ' ', ' ', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', ' ', 'ž', 'Ÿ'};
    }
}
