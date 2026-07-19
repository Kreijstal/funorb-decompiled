/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk {
    static byte[][][] field_w;
    int field_j;
    short field_n;
    short[] field_l;
    short[] field_Q;
    int[] field_F;
    short[] field_g;
    short[] field_y;
    static String field_H;
    int[] field_i;
    short[] field_B;
    short[] field_b;
    int field_S;
    short[] field_C;
    int field_P;
    int[] field_s;
    short[] field_z;
    static qn field_v;
    short[] field_L;
    int[] field_M;
    short[] field_e;
    int[] field_J;
    static wi field_O;
    static ri field_N;
    private boolean field_d;
    short[] field_h;
    int[] field_q;
    static cq field_o;
    int[] field_I;
    int field_f;
    int[] field_p;
    int field_t;
    byte[] field_a;
    short[] field_A;
    byte field_E;
    short[] field_G;
    int[] field_m;
    short[] field_k;
    short[] field_x;
    short field_c;
    int field_T;
    short[] field_r;
    static wi field_u;
    short[] field_K;
    short[] field_R;
    short field_D;

    final static void b(boolean param0) {
        try {
            Exception var1 = null;
            java.lang.reflect.Method var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object[] var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                if (param0) {
                  break L0;
                } else {
                  gk.b(true);
                  break L0;
                }
              }
              var1_ref = Runtime.class.getMethod("maxMemory", new Class[]{});
              if (var1_ref != null) {
                try {
                  L1: {
                    var2_ref = Runtime.getRuntime();
                    var4 = (Object[]) null;
                    var3 = (Long) (var1_ref.invoke((Object) (var2_ref), (Object[]) null));
                    wh.field_x = (int)(var3.longValue() / 1048576L) - -1;
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = decompiledCaughtException;
                  return;
                }
                return;
              } else {
                return;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = (Exception) (Object) decompiledCaughtException;
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_N = null;
        field_H = null;
        field_v = null;
        field_o = null;
        if (param0 != 0) {
          return;
        } else {
          field_w = (byte[][][]) null;
          field_u = null;
          field_O = null;
          return;
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        var7 = Sumoblitz.field_L ? 1 : 0;
        var6 = 0;
        L0: while (true) {
          if (var6 >= this.field_D) {
            if (!param3) {
              return;
            } else {
              this.a((byte) 101);
              return;
            }
          } else {
            this.field_Q[var6] = (short)(param4 * this.field_Q[var6] / param1);
            this.field_B[var6] = (short)(this.field_B[var6] * param2 / param1);
            this.field_r[var6] = (short)(param0 * this.field_r[var6] / param1);
            var6++;
            if (var7 == 0) {
              continue L0;
            } else {
              return;
            }
          }
        }
    }

    private final void a(byte param0) {
        if (param0 != 101) {
            this.field_l = (short[]) null;
            this.field_d = false;
            return;
        }
        this.field_d = false;
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Sumoblitz.field_L ? 1 : 0;
        if (!this.field_d) {
          this.field_d = true;
          var2 = 32767;
          var3 = 32767;
          var4 = 32767;
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          if (param0) {
            this.a((byte) -95);
            var8 = 0;
            L0: while (true) {
              L1: {
                L2: {
                  if (var8 >= this.field_D) {
                    break L2;
                  } else {
                    var9 = this.field_Q[var8];
                    var10 = this.field_B[var8];
                    if (var12 != 0) {
                      break L1;
                    } else {
                      L3: {
                        if (var10 < var3) {
                          var3 = var10;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        if (var9 <= var5) {
                          break L4;
                        } else {
                          var5 = var9;
                          break L4;
                        }
                      }
                      L5: {
                        var11 = this.field_r[var8];
                        if (var10 <= var6) {
                          break L5;
                        } else {
                          var6 = var10;
                          break L5;
                        }
                      }
                      L6: {
                        if (var2 > var9) {
                          var2 = var9;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        if (var7 >= var11) {
                          break L7;
                        } else {
                          var7 = var11;
                          break L7;
                        }
                      }
                      L8: {
                        if (var4 <= var11) {
                          break L8;
                        } else {
                          var4 = var11;
                          break L8;
                        }
                      }
                      var8++;
                      if (var12 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                this.field_P = var7;
                this.field_T = var2;
                this.field_t = var5;
                this.field_S = var4;
                this.field_f = var6;
                this.field_j = var3;
                break L1;
              }
              return;
            }
          } else {
            var8 = 0;
            L9: while (true) {
              L10: {
                L11: {
                  if (var8 >= this.field_D) {
                    break L11;
                  } else {
                    var9 = this.field_Q[var8];
                    var10 = this.field_B[var8];
                    if (var12 != 0) {
                      break L10;
                    } else {
                      L12: {
                        if (var10 < var3) {
                          var3 = var10;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      L13: {
                        if (var9 <= var5) {
                          break L13;
                        } else {
                          var5 = var9;
                          break L13;
                        }
                      }
                      L14: {
                        var11 = this.field_r[var8];
                        if (var10 <= var6) {
                          break L14;
                        } else {
                          var6 = var10;
                          break L14;
                        }
                      }
                      L15: {
                        if (var2 > var9) {
                          var2 = var9;
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      L16: {
                        if (var7 >= var11) {
                          break L16;
                        } else {
                          var7 = var11;
                          break L16;
                        }
                      }
                      L17: {
                        if (var4 <= var11) {
                          break L17;
                        } else {
                          var4 = var11;
                          break L17;
                        }
                      }
                      var8++;
                      if (var12 == 0) {
                        continue L9;
                      } else {
                        break L11;
                      }
                    }
                  }
                }
                this.field_P = var7;
                this.field_T = var2;
                this.field_t = var5;
                this.field_S = var4;
                this.field_f = var6;
                this.field_j = var3;
                break L10;
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        var6 = Sumoblitz.field_L ? 1 : 0;
        var5 = 0;
        L0: while (true) {
          if (var5 >= this.field_D) {
            this.a((byte) 101);
            if (param2 == -81) {
              return;
            } else {
              this.field_n = (short) -48;
              return;
            }
          } else {
            this.field_Q[var5] = (short)(this.field_Q[var5] + param3);
            this.field_B[var5] = (short)(this.field_B[var5] + param1);
            this.field_r[var5] = (short)(this.field_r[var5] + param0);
            var5++;
            if (var6 != 0) {
              if (param2 != -81) {
                this.field_n = (short) -48;
                return;
              } else {
                return;
              }
            } else {
              if (var6 == 0) {
                continue L0;
              } else {
                this.a((byte) 101);
                if (param2 == -81) {
                  return;
                } else {
                  this.field_n = (short) -48;
                  return;
                }
              }
            }
          }
        }
    }

    gk() {
        this.field_E = (byte) 0;
        this.field_d = false;
    }

    static {
        field_H = "Previous";
    }
}
