/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd {
    static af field_d;
    eh field_i;
    private int field_c;
    static nn field_f;
    static int field_j;
    int field_e;
    private int field_a;
    private int field_b;
    static bf[] field_l;
    private int field_h;
    private eh field_g;
    eh field_n;
    int field_k;
    private int field_m;

    final void a(byte param0, int param1) {
        int var4 = 0;
        var4 = DungeonAssault.field_K;
        if (param0 == 109) {
          if (((wd) this).field_k != ga.field_n) {
            if (((wd) this).field_k == li.field_h) {
              L0: {
                ((wd) this).field_e = ((wd) this).field_e - (param1 >> 2);
                if (0 >= ((wd) this).field_e) {
                  ((wd) this).field_e = 0;
                  ((wd) this).field_k = ga.field_n;
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            } else {
              ((wd) this).field_c = ((wd) this).field_c - param1;
              L1: while (true) {
                if (((wd) this).field_c < 0) {
                  if (!this.b(0)) {
                    return;
                  } else {
                    continue L1;
                  }
                } else {
                  return;
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        if (null == ((wd) this).field_n) {
          gf.b(param3, param1, param0, param4, 0);
          return;
        } else {
          if (((wd) this).field_e <= 0) {
            if (param2 != 102) {
              return;
            } else {
              L0: {
                if (-257 < ((wd) this).field_e) {
                  gf.b(param3, param1, param0, param4, 0, 256 - ((wd) this).field_e);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            }
          } else {
            this.a(param1, 1, param0, param3, param4);
            if (param2 != 102) {
              return;
            } else {
              L1: {
                if (-257 < ((wd) this).field_e) {
                  gf.b(param3, param1, param0, param4, 0, 256 - ((wd) this).field_e);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            }
          }
        }
    }

    final void a(int param0, eh param1) {
        try {
            if (param0 < 8) {
                ((wd) this).a((byte) 98, 50);
            }
            ((wd) this).a(rf.field_M, param1, -10872);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "wd.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(byte param0) {
        if (((wd) this).field_n == null) {
          ((wd) this).field_g = null;
          return;
        } else {
          ((wd) this).field_g = ((wd) this).field_n;
          ((wd) this).field_h = ((wd) this).field_m + 1;
          if (((wd) this).field_h >= ((wd) this).field_n.field_c) {
            if (((wd) this).field_a != rl.field_b) {
              if (((wd) this).field_a == rf.field_M) {
                ((wd) this).field_h = 0;
                ((wd) this).field_g = ((wd) this).field_i;
                return;
              } else {
                ((wd) this).field_g = null;
                return;
              }
            } else {
              ((wd) this).field_h = 0;
              return;
            }
          } else {
            return;
          }
        }
    }

    final static void a(byte param0, int param1, ue param2) {
        wj var6 = null;
        int var4 = 0;
        try {
            var6 = ac.field_B;
            wj var3 = var6;
            var6.d((byte) -126, param1);
            var6.field_o = var6.field_o + 1;
            var4 = var6.field_o;
            var6.a(6, 1);
            if (null != param2.field_l) {
                var6.a(6, param2.field_l.length);
                var6.a(param2.field_l, 1, param2.field_l.length, 0);
            } else {
                var6.a(6, 0);
            }
            int discarded$0 = var6.c((byte) -106, var4);
            var6.field_o = var6.field_o - 4;
            if (param0 >= -68) {
                Object var5 = null;
                wd.a((byte) -67, -90, (ue) null);
            }
            param2.field_k = var6.h(-31);
            var6.c(var6.field_o + -var4, -1);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "wd.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, eh param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              ((wd) this).field_a = param0;
              ((wd) this).field_e = 256;
              ((wd) this).field_m = 0;
              ((wd) this).field_n = param1;
              if (null != ((wd) this).field_n) {
                ((wd) this).field_b = ((wd) this).field_n.field_j[0] * ji.a(320, false, 192) >>> 8;
                ((wd) this).field_c = ((wd) this).field_b;
                ((wd) this).field_k = rl.field_f;
                this.a((byte) 28);
                break L1;
              } else {
                ((wd) this).field_k = ga.field_n;
                break L1;
              }
            }
            if (param2 == -10872) {
              break L0;
            } else {
              this.a(39, -38, 55, 112, -35);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("wd.I(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param2 + ')');
        }
    }

    private final boolean b(int param0) {
        ((wd) this).field_m = ((wd) this).field_m + 1;
        if (((wd) this).field_n.field_c <= ((wd) this).field_m) {
          if (((wd) this).field_a != rl.field_b) {
            if (rf.field_M != ((wd) this).field_a) {
              ((wd) this).field_m = ((wd) this).field_m - 1;
              ((wd) this).field_e = 256;
              ((wd) this).field_k = ((wd) this).field_a;
              return false;
            } else {
              ((wd) this).a(rl.field_b, ((wd) this).field_i, -10872);
              return false;
            }
          } else {
            ((wd) this).field_m = 0;
            wd.a(-49);
            ((wd) this).field_b = ((wd) this).field_n.field_j[((wd) this).field_m] * ji.a(320, false, 192) >>> 8;
            ((wd) this).field_c = ((wd) this).field_c + ((wd) this).field_b;
            this.a((byte) 28);
            return true;
          }
        } else {
          wd.a(-49);
          ((wd) this).field_b = ((wd) this).field_n.field_j[((wd) this).field_m] * ji.a(320, false, 192) >>> 8;
          ((wd) this).field_c = ((wd) this).field_c + ((wd) this).field_b;
          this.a((byte) 28);
          return true;
        }
    }

    wd(eh param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            ((wd) this).field_i = param0;
            ((wd) this).a(rl.field_b, ((wd) this).field_i, -10872);
            if (null != ((wd) this).field_i) {
              ((wd) this).a((byte) 109, oi.b(0, ((wd) this).field_i.field_f));
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("wd.<init>(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        cn var8 = null;
        cn var9 = null;
        cn var10 = null;
        cn var11 = null;
        cn var12 = null;
        cn var13 = null;
        var8 = ((wd) this).field_n.a(param2, ((wd) this).field_m, param4, 0);
        if (var8 == null) {
          gf.b(param3, param0, param2, param4, 0);
          return;
        } else {
          if (param1 == 1) {
            var8.c(param3, param0);
            if (null != ((wd) this).field_g) {
              if (((wd) this).field_n != ((wd) this).field_g) {
                var13 = ((wd) this).field_g.a(param2, ((wd) this).field_h, param4, param1 + -1);
                if (var13 == null) {
                  return;
                } else {
                  var7 = -((((wd) this).field_c << 8) / ((wd) this).field_b) + 256;
                  ob.a(var13, param3, var7, param0, true);
                  return;
                }
              } else {
                if (((wd) this).field_h == ((wd) this).field_m) {
                  return;
                } else {
                  L0: {
                    var12 = ((wd) this).field_g.a(param2, ((wd) this).field_h, param4, param1 + -1);
                    if (var12 != null) {
                      var7 = -((((wd) this).field_c << 8) / ((wd) this).field_b) + 256;
                      ob.a(var12, param3, var7, param0, true);
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            ((wd) this).field_a = -66;
            var8.c(param3, param0);
            if (null != ((wd) this).field_g) {
              if (((wd) this).field_n == ((wd) this).field_g) {
                if (((wd) this).field_h != ((wd) this).field_m) {
                  var11 = ((wd) this).field_g.a(param2, ((wd) this).field_h, param4, param1 + -1);
                  var9 = var11;
                  if (var11 == null) {
                    return;
                  } else {
                    var7 = -((((wd) this).field_c << 8) / ((wd) this).field_b) + 256;
                    ob.a(var11, param3, var7, param0, true);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                L1: {
                  var10 = ((wd) this).field_g.a(param2, ((wd) this).field_h, param4, param1 + -1);
                  if (var10 != null) {
                    var7 = -((((wd) this).field_c << 8) / ((wd) this).field_b) + 256;
                    ob.a(var10, param3, var7, param0, true);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_d = null;
        field_l = null;
    }

    wd(eh param0, eh param1, int param2) {
        try {
            ((wd) this).field_i = param0;
            ((wd) this).a(param2, param1, -10872);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "wd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
    }
}
