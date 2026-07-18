/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj extends ca {
    private int field_i;
    private int field_n;
    private int field_h;
    static String field_o;
    private int field_f;
    private lb field_s;
    private int field_m;
    private boolean field_p;
    int field_g;
    private int field_k;
    private int field_l;
    static dh field_q;
    static fk field_j;
    static im field_r;

    final void a(byte param0) {
        if (0 <= ((oj) this).field_g) {
          ((oj) this).field_f = ((oj) this).field_f + ((oj) this).field_l;
          ((oj) this).field_k = ((oj) this).field_k + ((oj) this).field_h;
          if (((oj) this).field_k > 1600) {
            ((oj) this).field_h = ((oj) this).field_h - 1;
            ((oj) this).field_l = ((oj) this).field_l + 1;
            if (param0 == 44) {
              if (!((oj) this).field_p) {
                L0: {
                  ((oj) this).field_g = ((oj) this).field_g + 1;
                  if (((oj) this).field_g != 100) {
                    break L0;
                  } else {
                    if (!((oj) this).field_p) {
                      ((oj) this).field_s.a((byte) -6, ((oj) this).field_i);
                      break L0;
                    } else {
                      return;
                    }
                  }
                }
                return;
              } else {
                L1: {
                  ((oj) this).field_g = ((oj) this).field_g + 2;
                  ((oj) this).field_g = ((oj) this).field_g + 1;
                  if (((oj) this).field_g != 100) {
                    break L1;
                  } else {
                    if (!((oj) this).field_p) {
                      ((oj) this).field_s.a((byte) -6, ((oj) this).field_i);
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
                return;
              }
            } else {
              ((oj) this).field_f = -103;
              if (((oj) this).field_p) {
                ((oj) this).field_g = ((oj) this).field_g + 2;
                ((oj) this).field_g = ((oj) this).field_g + 1;
                if (((oj) this).field_g == 100) {
                  L2: {
                    if (!((oj) this).field_p) {
                      ((oj) this).field_s.a((byte) -6, ((oj) this).field_i);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                ((oj) this).field_g = ((oj) this).field_g + 1;
                if (((oj) this).field_g == 100) {
                  if (((oj) this).field_p) {
                    return;
                  } else {
                    ((oj) this).field_s.a((byte) -6, ((oj) this).field_i);
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          } else {
            ((oj) this).field_h = ((oj) this).field_h + 1;
            ((oj) this).field_l = ((oj) this).field_l + 1;
            if (param0 == 44) {
              if (!((oj) this).field_p) {
                ((oj) this).field_g = ((oj) this).field_g + 1;
                if (((oj) this).field_g == 100) {
                  if (!((oj) this).field_p) {
                    ((oj) this).field_s.a((byte) -6, ((oj) this).field_i);
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                ((oj) this).field_g = ((oj) this).field_g + 2;
                ((oj) this).field_g = ((oj) this).field_g + 1;
                if (((oj) this).field_g == 100) {
                  if (!((oj) this).field_p) {
                    ((oj) this).field_s.a((byte) -6, ((oj) this).field_i);
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              ((oj) this).field_f = -103;
              if (!((oj) this).field_p) {
                ((oj) this).field_g = ((oj) this).field_g + 1;
                if (((oj) this).field_g == 100) {
                  if (((oj) this).field_p) {
                    return;
                  } else {
                    ((oj) this).field_s.a((byte) -6, ((oj) this).field_i);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                ((oj) this).field_g = ((oj) this).field_g + 2;
                ((oj) this).field_g = ((oj) this).field_g + 1;
                if (((oj) this).field_g == 100) {
                  if (((oj) this).field_p) {
                    return;
                  } else {
                    ((oj) this).field_s.a((byte) -6, ((oj) this).field_i);
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
        } else {
          if (param0 != 44) {
            ((oj) this).field_f = -103;
            if (((oj) this).field_p) {
              ((oj) this).field_g = ((oj) this).field_g + 2;
              ((oj) this).field_g = ((oj) this).field_g + 1;
              if (((oj) this).field_g == 100) {
                if (((oj) this).field_p) {
                  return;
                } else {
                  ((oj) this).field_s.a((byte) -6, ((oj) this).field_i);
                  return;
                }
              } else {
                return;
              }
            } else {
              ((oj) this).field_g = ((oj) this).field_g + 1;
              if (((oj) this).field_g == 100) {
                if (((oj) this).field_p) {
                  return;
                } else {
                  ((oj) this).field_s.a((byte) -6, ((oj) this).field_i);
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            L3: {
              if (!((oj) this).field_p) {
                break L3;
              } else {
                ((oj) this).field_g = ((oj) this).field_g + 2;
                break L3;
              }
            }
            L4: {
              ((oj) this).field_g = ((oj) this).field_g + 1;
              if (((oj) this).field_g != 100) {
                break L4;
              } else {
                if (!((oj) this).field_p) {
                  ((oj) this).field_s.a((byte) -6, ((oj) this).field_i);
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            return;
          }
        }
    }

    final static int a(byte param0, int param1) {
        int var2 = 1;
        if (param1 == 1) {
            var2 = 2;
            if (param1 == 4) {
                var2 = 3;
            }
            return var2;
        }
        if (param1 == 2) {
            var2 = 2;
            if (param1 == 4) {
                var2 = 3;
            }
            return var2;
        }
        if (param1 == 5) {
            var2 = 2;
            if (param1 == 4) {
                var2 = 3;
            }
            return var2;
        }
        if (param1 == 4) {
            var2 = 3;
        }
        return var2;
    }

    final static boolean a(ti param0, int param1, ti param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var3_int = param0.field_ab + -param2.field_ab;
            L1: {
              if (param0.field_Z == uc.field_r) {
                var3_int -= 200;
                break L1;
              } else {
                if (null == param0.field_Z) {
                  var3_int += 200;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param2.field_Z != uc.field_r) {
                if (param2.field_Z == null) {
                  var3_int -= 200;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                var3_int += 200;
                break L2;
              }
            }
            L3: {
              if (var3_int <= 0) {
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L3;
              } else {
                stackOut_14_0 = 1;
                stackIn_16_0 = stackOut_14_0;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3;
            stackOut_17_1 = new StringBuilder().append("oj.C(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          L5: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(100).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
        return stackIn_16_0 != 0;
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = OrbDefence.field_D ? 1 : 0;
          var4 = -param1 + ((((oj) this).field_f >> 4) + 320);
          var5 = 240 + ((((oj) this).field_k >> 4) + -param2);
          if (!((oj) this).field_p) {
            break L0;
          } else {
            var4 = (((oj) this).field_f >> 4) + 363;
            var5 = 24 - -(((oj) this).field_k >> 4);
            break L0;
          }
        }
        L1: {
          var6 = 255;
          if (param0 == 54) {
            break L1;
          } else {
            ((oj) this).a((byte) 2, -56, 109);
            break L1;
          }
        }
        L2: {
          var7 = ((oj) this).field_i + 3 << 4;
          var8 = ((oj) this).field_g;
          var9 = 363;
          var10 = 24;
          if (((oj) this).field_p) {
            var9 = -param1 + (((oj) this).field_n >> 4) + 320;
            var10 = (((oj) this).field_m >> 4) - param2 + 240;
            break L2;
          } else {
            break L2;
          }
        }
        if (100 >= var8) {
          if (0 <= var8) {
            var4 = (var8 * var9 + var4 * (-var8 + 100)) / 100;
            var5 = (var8 * var10 + var5 * (-var8 + 100)) / 100;
            if (var8 < 0) {
              if (!((oj) this).field_p) {
                return;
              } else {
                ul.a(5808, 384, 320, 200, em.field_s);
                return;
              }
            } else {
              ul.a(var4 << 4, var5 << 4, var7, var6, ki.field_f);
              return;
            }
          } else {
            if (var8 < 0) {
              if (!((oj) this).field_p) {
                return;
              } else {
                ul.a(5808, 384, 320, 200, em.field_s);
                return;
              }
            } else {
              ul.a(var4 << 4, var5 << 4, var7, var6, ki.field_f);
              return;
            }
          }
        } else {
          var5 = var10;
          var4 = var9;
          if (!((oj) this).field_p) {
            var6 = 200 - var8;
            var7 = 320;
            if (var8 < 0) {
              if (!((oj) this).field_p) {
                return;
              } else {
                ul.a(5808, 384, 320, 200, em.field_s);
                return;
              }
            } else {
              ul.a(var4 << 4, var5 << 4, var7, var6, ki.field_f);
              return;
            }
          } else {
            return;
          }
        }
    }

    oj(int param0, int param1, lb param2, int param3) {
        try {
            ((oj) this).field_k = param1 * ol.field_e << 4;
            ((oj) this).field_f = ol.field_e * param0 << 4;
            ((oj) this).field_l = (int)(-80.0 + Math.random() * 161.0);
            ((oj) this).field_h = (int)(Math.random() * 161.0 - 80.0);
            ((oj) this).field_i = 1;
            ((oj) this).field_g = -param3;
            ((oj) this).field_s = param2;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "oj.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void c(int param0) {
        field_o = null;
        field_j = null;
        if (param0 != 384) {
          oj.c(100);
          field_q = null;
          field_r = null;
          return;
        } else {
          field_q = null;
          field_r = null;
          return;
        }
    }

    oj(int param0, int param1, lb param2, int param3, int param4) {
        try {
            ((oj) this).field_k = param1 * ol.field_e << 4;
            ((oj) this).field_f = param0 * ol.field_e << 4;
            ((oj) this).field_l = (int)(-80.0 + Math.random() * 161.0);
            ((oj) this).field_h = (int)(-80.0 + Math.random() * 161.0);
            ((oj) this).field_g = -param3;
            ((oj) this).field_s = param2;
            ((oj) this).field_i = param4;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "oj.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "BIG SHOT";
        field_j = new fk(2);
        field_r = new im();
    }
}
