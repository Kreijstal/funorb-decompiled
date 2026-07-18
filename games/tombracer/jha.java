/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jha extends vg {
    private String field_n;
    private int field_f;
    private int field_l;
    private int field_g;
    private int field_m;
    private int field_j;
    private int field_k;
    private int field_u;
    private String field_h;
    private int field_s;
    private int field_o;
    private int field_p;
    private String field_q;
    private int field_r;
    private int field_t;
    private int field_i;

    final void a(int param0, int param1, int param2) {
        ((jha) this).field_p = param2;
        if (param1 != 4) {
            ((jha) this).field_s = 34;
            ((jha) this).field_u = param0;
            return;
        }
        ((jha) this).field_u = param0;
    }

    final String b(int param0) {
        if (param0 != 29161) {
            int discarded$0 = ((jha) this).a(true);
            return ((jha) this).field_n;
        }
        return ((jha) this).field_n;
    }

    final void b(byte param0) {
        int var3 = -52 % ((param0 - -59) / 45);
        int var2 = 255 - (((jha) this).field_o * 255 >> 16);
        rba.a(var2 / 2, ((jha) this).field_k, 1, ((jha) this).field_g, (byte) 99, ((jha) this).field_s, ((jha) this).field_t);
        int var4 = fn.field_f[((jha) this).field_r];
        int discarded$0 = dh.a(kn.field_p, var2, 0, 16, 4 + ((jha) this).field_t, ((jha) this).field_k - 8, var4, ((jha) this).field_s - -4, 1, 29870, 1, -8 + ((jha) this).field_g, ((jha) this).field_q);
    }

    final int a(boolean param0) {
        if (!param0) {
            int discarded$0 = ((jha) this).a(true);
            return ((jha) this).field_k;
        }
        return ((jha) this).field_k;
    }

    final int a(byte param0) {
        if (param0 != -100) {
            ((jha) this).field_o = 82;
            return ((jha) this).field_j;
        }
        return ((jha) this).field_j;
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = TombRacer.field_G ? 1 : 0;
          ((jha) this).field_m = ((jha) this).field_m + 1;
          if (((jha) this).field_m < ((jha) this).field_f) {
            var2 = -((jha) this).field_m + ((jha) this).field_f;
            var3 = ((jha) this).field_f;
            break L0;
          } else {
            if (((jha) this).field_m <= ((jha) this).field_l + -((jha) this).field_i) {
              var2 = 0;
              var3 = 1;
              break L0;
            } else {
              var3 = ((jha) this).field_i;
              var2 = -((jha) this).field_l + ((jha) this).field_i + ((jha) this).field_m;
              break L0;
            }
          }
        }
        L1: {
          if (0 < var2) {
            ((jha) this).field_o = var2 * 65536 / var3;
            ((jha) this).field_o = (((jha) this).field_o >> 8) * (((jha) this).field_o >> 8);
            break L1;
          } else {
            ((jha) this).field_o = 0;
            break L1;
          }
        }
        if (((jha) this).field_m != 1) {
          if (((jha) this).field_s < ((jha) this).field_u) {
            ((jha) this).field_s = ((jha) this).field_s + 1;
            ((jha) this).field_t = ((jha) this).field_p + (256 * ((jha) this).field_o >> 16);
            if (null != ((jha) this).field_q) {
              if (param0 >= -36) {
                int discarded$9 = ((jha) this).c((byte) 42);
                return;
              } else {
                return;
              }
            } else {
              if (null == ((jha) this).field_h) {
                ((jha) this).field_q = ((jha) this).field_n;
                var4 = ((jha) this).field_g - 8;
                var5 = kv.field_a.a(((jha) this).field_q, var4, (nh[]) null, 51, 16);
                ((jha) this).field_k = 8 + var5;
                if (param0 >= -36) {
                  int discarded$10 = ((jha) this).c((byte) 42);
                  return;
                } else {
                  return;
                }
              } else {
                ((jha) this).field_q = ((jha) this).field_h + ": " + ((jha) this).field_n;
                var4 = ((jha) this).field_g - 8;
                var5 = kv.field_a.a(((jha) this).field_q, var4, (nh[]) null, 51, 16);
                ((jha) this).field_k = 8 + var5;
                if (param0 < -36) {
                  return;
                } else {
                  int discarded$11 = ((jha) this).c((byte) 42);
                  return;
                }
              }
            }
          } else {
            if (((jha) this).field_s > ((jha) this).field_u) {
              L2: {
                ((jha) this).field_s = ((jha) this).field_s - 1;
                ((jha) this).field_t = ((jha) this).field_p + (256 * ((jha) this).field_o >> 16);
                if (null != ((jha) this).field_q) {
                  break L2;
                } else {
                  if (null == ((jha) this).field_h) {
                    ((jha) this).field_q = ((jha) this).field_n;
                    var4 = ((jha) this).field_g - 8;
                    var5 = kv.field_a.a(((jha) this).field_q, var4, (nh[]) null, 51, 16);
                    ((jha) this).field_k = 8 + var5;
                    break L2;
                  } else {
                    ((jha) this).field_q = ((jha) this).field_h + ": " + ((jha) this).field_n;
                    var4 = ((jha) this).field_g - 8;
                    var5 = kv.field_a.a(((jha) this).field_q, var4, (nh[]) null, 51, 16);
                    ((jha) this).field_k = 8 + var5;
                    break L2;
                  }
                }
              }
              if (param0 >= -36) {
                int discarded$12 = ((jha) this).c((byte) 42);
                return;
              } else {
                return;
              }
            } else {
              ((jha) this).field_t = ((jha) this).field_p + (256 * ((jha) this).field_o >> 16);
              if (null == ((jha) this).field_q) {
                L3: {
                  if (null == ((jha) this).field_h) {
                    ((jha) this).field_q = ((jha) this).field_n;
                    var4 = ((jha) this).field_g - 8;
                    var5 = kv.field_a.a(((jha) this).field_q, var4, (nh[]) null, 51, 16);
                    ((jha) this).field_k = 8 + var5;
                    break L3;
                  } else {
                    ((jha) this).field_q = ((jha) this).field_h + ": " + ((jha) this).field_n;
                    var4 = ((jha) this).field_g - 8;
                    var5 = kv.field_a.a(((jha) this).field_q, var4, (nh[]) null, 51, 16);
                    ((jha) this).field_k = 8 + var5;
                    break L3;
                  }
                }
                if (param0 < -36) {
                  return;
                } else {
                  int discarded$13 = ((jha) this).c((byte) 42);
                  return;
                }
              } else {
                L4: {
                  if (param0 < -36) {
                    break L4;
                  } else {
                    int discarded$14 = ((jha) this).c((byte) 42);
                    break L4;
                  }
                }
                return;
              }
            }
          }
        } else {
          ((jha) this).field_s = ((jha) this).field_u;
          ((jha) this).field_t = ((jha) this).field_p + (256 * ((jha) this).field_o >> 16);
          if (null != ((jha) this).field_q) {
            if (param0 >= -36) {
              int discarded$15 = ((jha) this).c((byte) 42);
              return;
            } else {
              return;
            }
          } else {
            if (null == ((jha) this).field_h) {
              ((jha) this).field_q = ((jha) this).field_n;
              var4 = ((jha) this).field_g - 8;
              var5 = kv.field_a.a(((jha) this).field_q, var4, (nh[]) null, 51, 16);
              ((jha) this).field_k = 8 + var5;
              if (param0 >= -36) {
                int discarded$16 = ((jha) this).c((byte) 42);
                return;
              } else {
                return;
              }
            } else {
              ((jha) this).field_q = ((jha) this).field_h + ": " + ((jha) this).field_n;
              var4 = ((jha) this).field_g - 8;
              var5 = kv.field_a.a(((jha) this).field_q, var4, (nh[]) null, 51, 16);
              ((jha) this).field_k = 8 + var5;
              if (param0 >= -36) {
                int discarded$17 = ((jha) this).c((byte) 42);
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final int c(byte param0) {
        if (param0 != -96) {
            boolean discarded$0 = ((jha) this).c(-105);
            return ((jha) this).field_g;
        }
        return ((jha) this).field_g;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        ((jha) this).field_i = param1;
        ((jha) this).field_l = param1 + param3 + param2;
        ((jha) this).field_f = param2;
        ((jha) this).field_m = 0;
        if (param0) {
            ((jha) this).field_m = -96;
        }
    }

    final void d(byte param0) {
        ((jha) this).field_j = ((jha) this).field_j - 1;
        if (param0 <= 2) {
            ((jha) this).field_s = -20;
        }
    }

    final boolean e(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -39) {
          L0: {
            ((jha) this).d((byte) 38);
            if (((jha) this).field_l > ((jha) this).field_m) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((jha) this).field_l > ((jha) this).field_m) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(int param0, int param1) {
        if (param0 != 1) {
            ((jha) this).a(-94);
            ((jha) this).field_g = param1;
            return;
        }
        ((jha) this).field_g = param1;
    }

    final void a(boolean param0, int param1) {
        ((jha) this).field_j = param1;
        if (param0) {
            ((jha) this).field_i = -2;
        }
    }

    final boolean c(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == -1) {
          if (((jha) this).field_o != 0) {
            if (((jha) this).field_m < -((jha) this).field_i + ((jha) this).field_l) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          String discarded$7 = ((jha) this).b(-122);
          if (((jha) this).field_o == 0) {
            return true;
          } else {
            L0: {
              if (((jha) this).field_m >= -((jha) this).field_i + ((jha) this).field_l) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    jha(int param0, String param1, String param2) {
        try {
            ((jha) this).field_h = param1;
            ((jha) this).field_r = param0;
            ((jha) this).field_n = param2;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "jha.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
