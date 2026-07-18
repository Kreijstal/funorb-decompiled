/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd {
    private double field_a;
    private int field_e;
    static int field_d;
    private double field_g;
    private double field_h;
    static boolean field_i;
    static int field_b;
    private int field_c;
    private double field_f;

    final static wb a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        wb var7 = null;
        int var8 = 0;
        Object var9 = null;
        wb stackIn_4_0 = null;
        wb stackIn_8_0 = null;
        wb stackIn_11_0 = null;
        wb stackIn_19_0 = null;
        wb stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        wb stackOut_3_0 = null;
        wb stackOut_7_0 = null;
        wb stackOut_21_0 = null;
        wb stackOut_18_0 = null;
        wb stackOut_10_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var8 = stellarshard.field_B;
        try {
          L0: {
            var2_int = param1.length();
            if (var2_int == 0) {
              stackOut_3_0 = uj.field_d;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (255 < var2_int) {
                stackOut_7_0 = bg.field_a;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                var3 = qj.a('.', param1, 10287);
                if (var3.length >= 2) {
                  L1: {
                    var4 = var3;
                    if (param0 == -96) {
                      break L1;
                    } else {
                      var9 = null;
                      sd.a((pb) null, (byte) 119, (String) null);
                      break L1;
                    }
                  }
                  var5 = 0;
                  L2: while (true) {
                    if (var5 >= var4.length) {
                      stackOut_21_0 = eb.a(var3[-1 + var3.length], param0 ^ -30);
                      stackIn_22_0 = stackOut_21_0;
                      break L0;
                    } else {
                      var6 = var4[var5];
                      var7 = ag.a(-1, var6);
                      if (var7 != null) {
                        stackOut_18_0 = (wb) var7;
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0;
                      } else {
                        var5++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  stackOut_10_0 = uj.field_d;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var2;
            stackOut_23_1 = new StringBuilder().append("sd.C(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L3;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L3;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
        return stackIn_22_0;
    }

    private final void a(byte param0) {
        ((sd) this).field_h = ((sd) this).field_h + ((sd) this).field_g;
        ((sd) this).field_f = ((sd) this).field_f + ((sd) this).field_a;
    }

    final sd a(int param0) {
        L0: {
          this.a((byte) 107);
          ((sd) this).field_a = ((sd) this).field_a - 0.1;
          if (((sd) this).field_h >= 64.0) {
            break L0;
          } else {
            ((sd) this).field_g = ((sd) this).field_g + 0.1;
            break L0;
          }
        }
        if (param0 == 0) {
          L1: {
            if (64.0 < ((sd) this).field_h) {
              ((sd) this).field_g = ((sd) this).field_g - 0.1;
              break L1;
            } else {
              break L1;
            }
          }
          ((sd) this).field_g = ((sd) this).field_g * 0.99999;
          hk.field_p = hk.field_p - 1;
          lg.field_f = lg.field_f + 1;
          if (s.field_i) {
            if (((sd) this).field_h >= -384.0) {
              if (((sd) this).field_h > 384.0) {
                if (0 < ((sd) this).field_e) {
                  qb.field_k = qb.field_k + ((sd) this).field_e;
                  te.field_c = te.field_c + ((sd) this).field_e;
                  return null;
                } else {
                  return null;
                }
              } else {
                if (((sd) this).field_f < -304.0) {
                  L2: {
                    if (((sd) this).field_e > 0) {
                      te.field_c = te.field_c + ((sd) this).field_e;
                      cl.field_a = cl.field_a - ((sd) this).field_e;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  return null;
                } else {
                  if (304.0 < ((sd) this).field_f) {
                    if (((sd) this).field_e > 0) {
                      te.field_c = te.field_c + ((sd) this).field_e;
                      qb.field_k = qb.field_k + ((sd) this).field_e;
                      return null;
                    } else {
                      return null;
                    }
                  } else {
                    return (sd) this;
                  }
                }
              }
            } else {
              L3: {
                if (((sd) this).field_e > 0) {
                  cl.field_a = cl.field_a - ((sd) this).field_e;
                  te.field_c = te.field_c + ((sd) this).field_e;
                  break L3;
                } else {
                  break L3;
                }
              }
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        L0: {
          var2 = (int)(((sd) this).field_h + 320.0);
          var3 = (int)(((sd) this).field_f + 240.0);
          if (((sd) this).field_e <= 0) {
            L1: {
              var4 = ei.field_A;
              if (((sd) this).field_e == -1) {
                var4 = gf.field_a;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (-2 != ((sd) this).field_e) {
                break L2;
              } else {
                var4 = ka.field_l;
                break L2;
              }
            }
            L3: {
              if (((sd) this).field_e != -3) {
                break L3;
              } else {
                var4 = he.field_l;
                break L3;
              }
            }
            L4: {
              if (((sd) this).field_e != -4) {
                break L4;
              } else {
                var4 = td.field_e;
                break L4;
              }
            }
            L5: {
              if (((sd) this).field_e != -5) {
                break L5;
              } else {
                var4 = nl.field_f;
                break L5;
              }
            }
            L6: {
              if (((sd) this).field_e == -6) {
                var4 = qh.field_h;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (((sd) this).field_e != -7) {
                break L7;
              } else {
                var4 = we.field_e;
                break L7;
              }
            }
            L8: {
              if (((sd) this).field_e != -8) {
                break L8;
              } else {
                var4 = pe.field_a;
                break L8;
              }
            }
            L9: {
              if (((sd) this).field_e != -9) {
                break L9;
              } else {
                var4 = te.field_b;
                break L9;
              }
            }
            L10: {
              if (((sd) this).field_e != -10) {
                break L10;
              } else {
                var4 = ha.field_x;
                break L10;
              }
            }
            L11: {
              if (((sd) this).field_e != -11) {
                break L11;
              } else {
                var4 = fc.field_c;
                break L11;
              }
            }
            L12: {
              if (((sd) this).field_e == -12) {
                var4 = wg.field_e;
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              if (-13 != ((sd) this).field_e) {
                break L13;
              } else {
                var4 = nb.field_O;
                break L13;
              }
            }
            L14: {
              if (((sd) this).field_e != -14) {
                break L14;
              } else {
                var4 = ja.field_k;
                break L14;
              }
            }
            L15: {
              if (((sd) this).field_e == -15) {
                var4 = rd.field_b;
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              if (-16 == ((sd) this).field_e) {
                var4 = Integer.toString(ml.field_h);
                break L16;
              } else {
                break L16;
              }
            }
            qj.field_a.c(var4, var2 + -1, var3, 0, -1);
            qj.field_a.c(var4, 1 + var2, var3, 0, -1);
            qj.field_a.c(var4, var2, var3 - 1, 0, -1);
            qj.field_a.c(var4, var2, 1 + var3, 0, -1);
            qj.field_a.c(var4, var2, var3, ((sd) this).field_c, -1);
            break L0;
          } else {
            qj.field_a.c("" + ((sd) this).field_e, -1 + var2, var3, 0, -1);
            qj.field_a.c("" + ((sd) this).field_e, var2 + 1, var3, 0, -1);
            qj.field_a.c("" + ((sd) this).field_e, var2, var3 - 1, 0, -1);
            qj.field_a.c("" + ((sd) this).field_e, var2, var3 + 1, 0, -1);
            qj.field_a.c("" + ((sd) this).field_e, var2, var3, ((sd) this).field_c, -1);
            break L0;
          }
        }
        L17: {
          if (param0) {
            break L17;
          } else {
            ((sd) this).field_f = -0.5996134405584707;
            break L17;
          }
        }
    }

    final static void a(pb param0, byte param1, String param2) {
        RuntimeException runtimeException = null;
        Object var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              ve.field_a = param0;
              be.field_f = param2;
              if (param1 == 60) {
                break L1;
              } else {
                var4 = null;
                wb discarded$2 = sd.a((byte) 87, (String) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("sd.E(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    sd(int param0, qe param1, int param2) {
        try {
            ((sd) this).field_f = param1.field_l;
            ((sd) this).field_h = param1.field_a;
            ((sd) this).field_g = param1.field_d;
            ((sd) this).field_a = param1.field_k;
            ((sd) this).field_c = param2;
            ((sd) this).field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "sd.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
    }
}
