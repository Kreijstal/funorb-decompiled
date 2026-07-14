/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b extends id {
    static int field_t;
    static boolean field_v;
    private int field_r;
    private int field_q;
    private int field_p;
    private pb[] field_s;
    static pf field_u;

    final static ek[] a(int param0, int param1, int param2, pf param3) {
        int var4 = 0;
        var4 = -9 / ((param0 - -59) / 44);
        if (!tl.a(param3, (byte) -5, param2, param1)) {
          return null;
        } else {
          return rb.g(1851);
        }
    }

    final static boolean a(char param0, byte param1) {
        if (param1 == -123) {
          if (Character.isISOControl(param0)) {
            return false;
          } else {
            if (!od.a(param0, false)) {
              L0: {
                if (param0 == 45) {
                  break L0;
                } else {
                  if (160 == param0) {
                    break L0;
                  } else {
                    if (param0 == 32) {
                      break L0;
                    } else {
                      if (param0 == 95) {
                        break L0;
                      } else {
                        return false;
                      }
                    }
                  }
                }
              }
              return true;
            } else {
              return true;
            }
          }
        } else {
          field_t = 127;
          if (Character.isISOControl(param0)) {
            return false;
          } else {
            if (!od.a(param0, false)) {
              if (param0 != 45) {
                if (160 != param0) {
                  if (param0 != 32) {
                    if (param0 == 95) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          }
        }
    }

    public static void b(boolean param0) {
        field_u = null;
        if (!param0) {
            field_t = 69;
        }
    }

    final static void a(String param0, byte param1, long param2, String param3, java.applet.Applet param4) {
        try {
            Throwable var6 = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var8 = param4.getParameter("cookiehost");
                var7 = var8;
                var7 = var8;
                var9 = param3 + "=" + param0 + "; version=1; path=/; domain=" + var8;
                var7 = var9;
                var7 = var9;
                if (param2 < 0L) {
                  var7 = var9 + "; Discard;";
                  break L0;
                } else {
                  var7 = var9 + "; Expires=" + od.a(10, param2 * 1000L + ih.a((byte) -98)) + "; Max-Age=" + param2;
                  break L0;
                }
              }
              L1: {
                if (param1 == 38) {
                  break L1;
                } else {
                  b.a(58, 43);
                  break L1;
                }
              }
              sh.a(-13847, "document.cookie=\"" + var7 + "\"", param4);
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var6 = decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public b() {
        this(2188450, 2591221, 9543);
    }

    final static void a(int param0, int param1) {
        if (param0 != -1) {
          L0: {
            if (-2 == param0) {
              e.field_e = 1;
              stellarshard.field_U[6] = stellarshard.field_U[6] + 1;
              break L0;
            } else {
              break L0;
            }
          }
          if (2 != param0) {
            if (3 == param0) {
              L1: {
                e.field_e = 3;
                stellarshard.field_U[7] = stellarshard.field_U[7] + 1;
                if ((param0 ^ -1) == -5) {
                  e.field_e = 4;
                  stellarshard.field_U[14] = stellarshard.field_U[14] + 1;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (param0 == 5) {
                  e.field_e = 5;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (param0 == param1) {
                  e.field_e = 6;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (-8 == (param0 ^ -1)) {
                  e.field_e = 7;
                  break L4;
                } else {
                  break L4;
                }
              }
              return;
            } else {
              L5: {
                if ((param0 ^ -1) == -5) {
                  e.field_e = 4;
                  stellarshard.field_U[14] = stellarshard.field_U[14] + 1;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (param0 == 5) {
                  e.field_e = 5;
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (param0 == param1) {
                  e.field_e = 6;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (-8 == (param0 ^ -1)) {
                  e.field_e = 7;
                  break L8;
                } else {
                  break L8;
                }
              }
              return;
            }
          } else {
            e.field_e = 2;
            if (3 == param0) {
              L9: {
                e.field_e = 3;
                stellarshard.field_U[7] = stellarshard.field_U[7] + 1;
                if ((param0 ^ -1) == -5) {
                  e.field_e = 4;
                  stellarshard.field_U[14] = stellarshard.field_U[14] + 1;
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (param0 == 5) {
                  e.field_e = 5;
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (param0 == param1) {
                  e.field_e = 6;
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (-8 == (param0 ^ -1)) {
                  e.field_e = 7;
                  break L12;
                } else {
                  break L12;
                }
              }
              return;
            } else {
              L13: {
                if ((param0 ^ -1) == -5) {
                  e.field_e = 4;
                  stellarshard.field_U[14] = stellarshard.field_U[14] + 1;
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                if (param0 == 5) {
                  e.field_e = 5;
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                if (param0 == param1) {
                  e.field_e = 6;
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                if (-8 == (param0 ^ -1)) {
                  e.field_e = 7;
                  break L16;
                } else {
                  break L16;
                }
              }
              return;
            }
          }
        } else {
          L17: {
            e.field_e = 0;
            stellarshard.field_U[2] = stellarshard.field_U[2] + 1;
            if (-2 == param0) {
              e.field_e = 1;
              stellarshard.field_U[6] = stellarshard.field_U[6] + 1;
              break L17;
            } else {
              break L17;
            }
          }
          if (2 == param0) {
            e.field_e = 2;
            if (3 != param0) {
              L18: {
                if ((param0 ^ -1) == -5) {
                  e.field_e = 4;
                  stellarshard.field_U[14] = stellarshard.field_U[14] + 1;
                  break L18;
                } else {
                  break L18;
                }
              }
              L19: {
                if (param0 == 5) {
                  e.field_e = 5;
                  break L19;
                } else {
                  break L19;
                }
              }
              L20: {
                if (param0 == param1) {
                  e.field_e = 6;
                  break L20;
                } else {
                  break L20;
                }
              }
              L21: {
                if (-8 == (param0 ^ -1)) {
                  e.field_e = 7;
                  break L21;
                } else {
                  break L21;
                }
              }
              return;
            } else {
              L22: {
                e.field_e = 3;
                stellarshard.field_U[7] = stellarshard.field_U[7] + 1;
                if ((param0 ^ -1) == -5) {
                  e.field_e = 4;
                  stellarshard.field_U[14] = stellarshard.field_U[14] + 1;
                  break L22;
                } else {
                  break L22;
                }
              }
              L23: {
                if (param0 == 5) {
                  e.field_e = 5;
                  break L23;
                } else {
                  break L23;
                }
              }
              L24: {
                if (param0 == param1) {
                  e.field_e = 6;
                  break L24;
                } else {
                  break L24;
                }
              }
              L25: {
                if (-8 == param0) {
                  e.field_e = 7;
                  break L25;
                } else {
                  break L25;
                }
              }
              return;
            }
          } else {
            if (3 == param0) {
              L26: {
                e.field_e = 3;
                stellarshard.field_U[7] = stellarshard.field_U[7] + 1;
                if ((param0 ^ -1) == -5) {
                  e.field_e = 4;
                  stellarshard.field_U[14] = stellarshard.field_U[14] + 1;
                  break L26;
                } else {
                  break L26;
                }
              }
              L27: {
                if (param0 == 5) {
                  e.field_e = 5;
                  break L27;
                } else {
                  break L27;
                }
              }
              L28: {
                if (param0 == param1) {
                  e.field_e = 6;
                  break L28;
                } else {
                  break L28;
                }
              }
              L29: {
                if (-8 == param0) {
                  e.field_e = 7;
                  break L29;
                } else {
                  break L29;
                }
              }
              return;
            } else {
              L30: {
                if ((param0 ^ -1) == -5) {
                  e.field_e = 4;
                  stellarshard.field_U[14] = stellarshard.field_U[14] + 1;
                  break L30;
                } else {
                  break L30;
                }
              }
              L31: {
                if (param0 == 5) {
                  e.field_e = 5;
                  break L31;
                } else {
                  break L31;
                }
              }
              L32: {
                if (param0 == param1) {
                  e.field_e = 6;
                  break L32;
                } else {
                  break L32;
                }
              }
              L33: {
                if (-8 == (param0 ^ -1)) {
                  e.field_e = 7;
                  break L33;
                } else {
                  break L33;
                }
              }
              return;
            }
          }
        }
    }

    private b(int param0, int param1, int param2) {
        ((b) this).field_a = s.field_c;
        ((b) this).field_r = param0;
        ((b) this).field_p = param2;
        ((b) this).field_q = param1;
        ((b) this).field_s = mh.field_i;
    }

    public final void a(boolean param0, int param1, int param2, rj param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        L0: {
          if (!param3.field_q) {
            if (param3.e(0)) {
              L1: {
                var6 = 1;
                if (!(param3 instanceof ig)) {
                  break L1;
                } else {
                  param0 = param0 & ((ig) (Object) param3).field_E;
                  break L1;
                }
              }
              if (param4 != 4549) {
                return;
              } else {
                L2: {
                  if (!param0) {
                    stackOut_11_0 = ((b) this).field_p;
                    stackIn_12_0 = stackOut_11_0;
                    break L2;
                  } else {
                    if (var6 == 0) {
                      stackOut_10_0 = ((b) this).field_r;
                      stackIn_12_0 = stackOut_10_0;
                      break L2;
                    } else {
                      stackOut_9_0 = ((b) this).field_q;
                      stackIn_12_0 = stackOut_9_0;
                      break L2;
                    }
                  }
                }
                L3: {
                  var7 = stackIn_12_0;
                  if (!param0) {
                    stackOut_14_0 = 7105644;
                    stackIn_15_0 = stackOut_14_0;
                    break L3;
                  } else {
                    stackOut_13_0 = 16777215;
                    stackIn_15_0 = stackOut_13_0;
                    break L3;
                  }
                }
                var8 = stackIn_15_0;
                af.a(-57, var7, param3.field_p, param3.field_k + param2 + (param3.field_t + -((b) this).field_s[0].field_x >> 1222222209), ((b) this).field_s, param3.field_w + param1);
                int discarded$2 = ((b) this).field_a.a(param3.field_m, param3.field_w + param1, param3.field_k + (param2 - 2), param3.field_p, param3.field_t, var8, -1, 1, 1, ((b) this).field_a.field_N);
                return;
              }
            } else {
              stackOut_3_0 = 0;
              stackIn_18_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 1;
            stackIn_18_0 = stackOut_1_0;
            break L0;
          }
        }
        L4: {
          var6 = stackIn_18_0;
          if (!(param3 instanceof ig)) {
            break L4;
          } else {
            param0 = param0 & ((ig) (Object) param3).field_E;
            break L4;
          }
        }
        if (param4 != 4549) {
          return;
        } else {
          L5: {
            if (!param0) {
              stackOut_25_0 = ((b) this).field_p;
              stackIn_26_0 = stackOut_25_0;
              break L5;
            } else {
              if (var6 == 0) {
                stackOut_24_0 = ((b) this).field_r;
                stackIn_26_0 = stackOut_24_0;
                break L5;
              } else {
                stackOut_23_0 = ((b) this).field_q;
                stackIn_26_0 = stackOut_23_0;
                break L5;
              }
            }
          }
          L6: {
            var7 = stackIn_26_0;
            if (!param0) {
              stackOut_28_0 = 7105644;
              stackIn_29_0 = stackOut_28_0;
              break L6;
            } else {
              stackOut_27_0 = 16777215;
              stackIn_29_0 = stackOut_27_0;
              break L6;
            }
          }
          var8 = stackIn_29_0;
          af.a(-57, var7, param3.field_p, param3.field_k + param2 + (param3.field_t + -((b) this).field_s[0].field_x >> 1222222209), ((b) this).field_s, param3.field_w + param1);
          int discarded$3 = ((b) this).field_a.a(param3.field_m, param3.field_w + param1, param3.field_k + (param2 - 2), param3.field_p, param3.field_t, var8, -1, 1, 1, ((b) this).field_a.field_N);
          return;
        }
    }

    static {
    }
}
