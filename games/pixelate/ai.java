/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ai {
    int[] field_b;
    byte[] field_J;
    int field_r;
    int field_n;
    int[][] field_z;
    int field_m;
    int[] field_y;
    static Random field_d;
    int field_I;
    int field_s;
    int field_j;
    int field_i;
    int[] field_w;
    byte[][] field_h;
    int field_D;
    byte[] field_t;
    int field_H;
    int field_v;
    byte[] field_o;
    byte field_G;
    int field_F;
    byte[] field_k;
    int field_g;
    int field_l;
    static int field_x;
    int field_K;
    int[][] field_E;
    byte[] field_p;
    boolean[] field_q;
    boolean[] field_f;
    byte[] field_a;
    static String field_C;
    int field_c;
    int[] field_u;
    static ak field_A;
    int[][] field_B;
    static int[] field_e;

    final static boolean a(byte param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (!we.a(true, 5832, param1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var2_int = 0;
                if (param0 < -125) {
                  break L1;
                } else {
                  ai.a((byte) 125);
                  break L1;
                }
              }
              L2: while (true) {
                if (param1.length() <= var2_int) {
                  stackOut_13_0 = 1;
                  stackIn_14_0 = stackOut_13_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (!vf.a((byte) -3, param1.charAt(var2_int))) {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var2_int++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var2);
            stackOut_15_1 = new StringBuilder().append("ai.B(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            return stackIn_14_0 != 0;
          }
        }
    }

    final static void a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Pixelate.field_H ? 1 : 0;
        if (param1 == 6) {
          if ((uo.field_j ^ -1) >= -1) {
            if (!jg.a((byte) 58)) {
              var2 = 1;
              if (vh.field_c == null) {
                L0: {
                  if (dg.field_a) {
                    bq.a(param0, (byte) -89, var2);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                return;
              } else {
                return;
              }
            } else {
              var2 = 0;
              if (vh.field_c == null) {
                L1: {
                  if (dg.field_a) {
                    bq.a(param0, (byte) -89, var2);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return;
              } else {
                return;
              }
            }
          } else {
            if (vh.field_c == null) {
              ib.field_f = wo.a(mc.field_k, 150, 480, 0, 640, 0);
              if (ib.field_f != null) {
                var2 = 2;
                he.a(0, ib.field_f);
                if (vh.field_c == null) {
                  L2: {
                    if (dg.field_a) {
                      bq.a(param0, (byte) -89, var2);
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
                var2 = 3;
                if (vh.field_c == null) {
                  L3: {
                    if (dg.field_a) {
                      bq.a(param0, (byte) -89, var2);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  return;
                } else {
                  return;
                }
              }
            } else {
              ib.field_f = vh.field_c.b(false);
              ah.a(2, (byte) 114);
              if (ib.field_f != null) {
                var2 = 2;
                he.a(0, ib.field_f);
                if (vh.field_c != null) {
                  return;
                } else {
                  L4: {
                    if (dg.field_a) {
                      bq.a(param0, (byte) -89, var2);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  return;
                }
              } else {
                var2 = 3;
                if (vh.field_c != null) {
                  return;
                } else {
                  L5: {
                    if (dg.field_a) {
                      bq.a(param0, (byte) -89, var2);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  return;
                }
              }
            }
          }
        } else {
          field_C = (String) null;
          if ((uo.field_j ^ -1) >= -1) {
            if (!jg.a((byte) 58)) {
              var2 = 1;
              if (vh.field_c != null) {
                return;
              } else {
                L6: {
                  if (dg.field_a) {
                    bq.a(param0, (byte) -89, var2);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                return;
              }
            } else {
              var2 = 0;
              if (vh.field_c != null) {
                return;
              } else {
                L7: {
                  if (dg.field_a) {
                    bq.a(param0, (byte) -89, var2);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                return;
              }
            }
          } else {
            if (vh.field_c == null) {
              ib.field_f = wo.a(mc.field_k, 150, 480, 0, 640, 0);
              if (ib.field_f != null) {
                var2 = 2;
                he.a(0, ib.field_f);
                if (vh.field_c != null) {
                  return;
                } else {
                  L8: {
                    if (dg.field_a) {
                      bq.a(param0, (byte) -89, var2);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  return;
                }
              } else {
                var2 = 3;
                if (vh.field_c != null) {
                  return;
                } else {
                  L9: {
                    if (dg.field_a) {
                      bq.a(param0, (byte) -89, var2);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  return;
                }
              }
            } else {
              ib.field_f = vh.field_c.b(false);
              ah.a(2, (byte) 114);
              if (ib.field_f != null) {
                var2 = 2;
                he.a(0, ib.field_f);
                if (vh.field_c != null) {
                  return;
                } else {
                  L10: {
                    if (dg.field_a) {
                      bq.a(param0, (byte) -89, var2);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  return;
                }
              } else {
                var2 = 3;
                if (vh.field_c != null) {
                  return;
                } else {
                  L11: {
                    if (dg.field_a) {
                      bq.a(param0, (byte) -89, var2);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  return;
                }
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_C = null;
        if (param0 != -92) {
          field_C = (String) null;
          field_A = null;
          field_e = null;
          field_d = null;
          return;
        } else {
          field_A = null;
          field_e = null;
          field_d = null;
          return;
        }
    }

    ai() {
        this.field_b = new int[257];
        this.field_y = new int[6];
        this.field_h = new byte[6][258];
        this.field_I = 0;
        this.field_z = new int[6][258];
        this.field_J = new byte[18002];
        this.field_l = 0;
        this.field_E = new int[6][258];
        this.field_w = new int[16];
        this.field_p = new byte[18002];
        this.field_u = new int[256];
        this.field_f = new boolean[256];
        this.field_t = new byte[4096];
        this.field_a = new byte[256];
        this.field_B = new int[6][258];
        this.field_q = new boolean[16];
    }

    static {
        field_x = 9;
        field_d = new Random();
        field_C = "Unable to add friend - system busy";
        field_e = new int[8192];
    }
}
