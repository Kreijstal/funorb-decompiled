/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol extends g {
    static String field_Lb;
    private g field_Jb;
    private g field_Fb;
    private g field_Gb;
    private g field_Ib;
    private int field_Db;
    static byte[][][] field_Kb;
    private g field_Mb;
    static String field_Hb;
    private g field_Eb;

    public static void g(int param0) {
        field_Hb = null;
        if (param0 != 20) {
            field_Lb = (String) null;
            field_Lb = null;
            field_Kb = (byte[][][]) null;
            return;
        }
        field_Lb = null;
        field_Kb = (byte[][][]) null;
    }

    final boolean f(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != -1) {
          L0: {
            this.field_Fb = (g) null;
            if (this.field_Ib.field_N == 0) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.field_Ib.field_N == 0) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final boolean e(byte param0) {
        if (param0 <= -84) {
          if (this.field_Gb.field_pb != 0) {
            this.field_Db = 20;
            return true;
          } else {
            if (this.field_Gb.field_N != 0) {
              L0: {
                if ((this.field_Db ^ -1) < -1) {
                  this.field_Db = this.field_Db - 1;
                  break L0;
                } else {
                  break L0;
                }
              }
              if (this.field_Db == 0) {
                this.field_Db = 3;
                return true;
              } else {
                return false;
              }
            } else {
              return false;
            }
          }
        } else {
          this.f((byte) 105);
          if (this.field_Gb.field_pb != 0) {
            this.field_Db = 20;
            return true;
          } else {
            if (this.field_Gb.field_N != 0) {
              L1: {
                if ((this.field_Db ^ -1) < -1) {
                  this.field_Db = this.field_Db - 1;
                  break L1;
                } else {
                  break L1;
                }
              }
              if (this.field_Db != 0) {
                return false;
              } else {
                this.field_Db = 3;
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        if (param4 != -689) {
          field_Hb = (String) null;
          this.field_lb = param6;
          this.field_x = param2;
          this.field_ib = param0;
          this.field_R = param5;
          this.a((byte) -94, param7, param1, param3);
          return;
        } else {
          this.field_lb = param6;
          this.field_x = param2;
          this.field_ib = param0;
          this.field_R = param5;
          this.a((byte) -94, param7, param1, param3);
          return;
        }
    }

    final boolean f(byte param0) {
        if (0 == this.field_Mb.field_pb) {
          if (-1 != (this.field_Mb.field_N ^ -1)) {
            if (this.field_Db <= 0) {
              if (-1 == (this.field_Db ^ -1)) {
                if (this.field_Ib.field_W + (this.field_Ib.field_lb + this.field_Ib.field_gb + this.field_Ib.field_Bb) > jb.field_b) {
                  if (param0 >= -119) {
                    this.a((byte) 23, 81, 34, -99);
                    return false;
                  } else {
                    return false;
                  }
                } else {
                  this.field_Db = 3;
                  return true;
                }
              } else {
                if (param0 >= -119) {
                  this.a((byte) 23, 81, 34, -99);
                  return false;
                } else {
                  return false;
                }
              }
            } else {
              this.field_Db = this.field_Db - 1;
              if (-1 == (this.field_Db ^ -1)) {
                if (this.field_Ib.field_W + (this.field_Ib.field_lb + this.field_Ib.field_gb + this.field_Ib.field_Bb) > jb.field_b) {
                  if (param0 >= -119) {
                    this.a((byte) 23, 81, 34, -99);
                    return false;
                  } else {
                    return false;
                  }
                } else {
                  this.field_Db = 3;
                  return true;
                }
              } else {
                if (param0 >= -119) {
                  this.a((byte) 23, 81, 34, -99);
                  return false;
                } else {
                  return false;
                }
              }
            }
          } else {
            if (param0 < -119) {
              return false;
            } else {
              this.a((byte) 23, 81, 34, -99);
              return false;
            }
          }
        } else {
          this.field_Db = 20;
          return true;
        }
    }

    ol(long param0, g param1, ci param2, ci param3, g param4, g param5) {
        this(param0, param1, param1, param4, param5);
        try {
            this.field_Gb.field_ob = param2;
            this.field_Jb.field_ob = param3;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "ol.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    private final int a(int param0, int param1, byte param2, boolean param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        L0: {
          var5 = 0;
          var6 = -this.field_Ib.field_lb + this.field_Fb.field_lb;
          if (var6 <= 0) {
            break L0;
          } else {
            var7 = this.field_Ib.field_ib;
            var8 = -param0 + param1;
            var5 = (var6 / 2 + var7 * var8) / var6;
            break L0;
          }
        }
        if (param3) {
          L1: {
            if (var5 < 0) {
              var5 = 0;
              break L1;
            } else {
              break L1;
            }
          }
          if (var5 > -param0 + param1) {
            var5 = param1 - param0;
            if (param2 != -123) {
              this.a((byte) -11, -26, -77, -82);
              return var5;
            } else {
              return var5;
            }
          } else {
            if (param2 != -123) {
              this.a((byte) -11, -26, -77, -82);
              return var5;
            } else {
              return var5;
            }
          }
        } else {
          L2: {
            if (-param0 + param1 < var5) {
              var5 = param1 + -param0;
              break L2;
            } else {
              break L2;
            }
          }
          if (-1 < (var5 ^ -1)) {
            var5 = 0;
            if (param2 == -123) {
              return var5;
            } else {
              this.a((byte) -11, -26, -77, -82);
              return var5;
            }
          } else {
            if (param2 == -123) {
              return var5;
            } else {
              this.a((byte) -11, -26, -77, -82);
              return var5;
            }
          }
        }
    }

    private ol(long param0, g param1, g param2, g param3, g param4) {
        super(param0, (g) null);
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        g var9 = null;
        g var10 = null;
        try {
          L0: {
            this.field_Gb = new g(0L, param1);
            this.field_Jb = new g(0L, param2);
            this.a(this.field_Gb, -14951);
            this.a(this.field_Jb, -14951);
            this.field_Fb = new g(0L, (g) null);
            this.a(this.field_Fb, -14951);
            this.field_Eb = new g(0L, param3);
            this.field_Mb = new g(0L, param3);
            var9 = this.field_Eb;
            var10 = var9;
            this.field_Mb.field_z = true;
            var10.field_z = true;
            this.field_Fb.a(this.field_Eb, -14951);
            this.field_Fb.a(this.field_Mb, -14951);
            this.field_Ib = new g(0L, param4);
            this.field_Ib.field_kb = true;
            this.field_Fb.a(this.field_Ib, -14951);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var7);

            stackIn_5_1 = new StringBuilder().append("ol.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param4 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_6_0), stackIn_15_2 + ')');
        }
    }

    final boolean e(int param0) {
        if ((this.field_Eb.field_pb ^ -1) == param0) {
          if (-1 != (this.field_Eb.field_N ^ -1)) {
            L0: {
              if (-1 > (this.field_Db ^ -1)) {
                this.field_Db = this.field_Db - 1;
                break L0;
              } else {
                break L0;
              }
            }
            if (this.field_Db == 0) {
              if (this.field_Ib.field_Bb - -this.field_Ib.field_gb <= jb.field_b) {
                return false;
              } else {
                this.field_Db = 3;
                return true;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          this.field_Db = 20;
          return true;
        }
    }

    final boolean d(byte param0) {
        int var2;
        if (this.field_Jb.field_pb != 0) {
          this.field_Db = 20;
          return true;
        } else {
          var2 = 71 / ((-30 - param0) / 43);
          if (this.field_Jb.field_N != 0) {
            L0: {
              if (0 < this.field_Db) {
                this.field_Db = this.field_Db - 1;
                break L0;
              } else {
                break L0;
              }
            }
            if (this.field_Db == 0) {
              this.field_Db = 3;
              return true;
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var14;
        g var15;
        g var16;
        g var17;
        g var18;
        g var19;
        g var20;
        g stackIn_9_0 = null;
        g stackIn_9_1 = null;
        g stackIn_9_2 = null;
        g stackIn_10_0 = null;
        g stackIn_10_1 = null;
        g stackIn_10_2 = null;
        int stackIn_10_3 = 0;
        g stackIn_20_0 = null;
        g stackIn_20_1 = null;
        g stackIn_20_2 = null;
        g stackIn_21_0 = null;
        g stackIn_21_1 = null;
        g stackIn_21_2 = null;
        int stackIn_21_3 = 0;
        g stackIn_27_0 = null;
        g stackIn_27_1 = null;
        g stackIn_27_2 = null;
        g stackIn_28_0 = null;
        g stackIn_28_1 = null;
        g stackIn_28_2 = null;
        int stackIn_28_3 = 0;
        L0: {
          if (this.field_lb >= this.field_x * 2) {
            var5 = this.field_x;
            var6 = this.field_lb - this.field_x;
            break L0;
          } else {
            var6 = this.field_lb / 2;
            var5 = this.field_lb / 2;
            break L0;
          }
        }
        var7 = var6 - var5;
        var8 = var7;
        if (-1 > (param3 ^ -1)) {
          L1: {
            var8 = var8 * param1 / param3;
            if (this.field_x > var8) {
              var8 = this.field_x;
              break L1;
            } else {
              break L1;
            }
          }
          if (var7 >= var8) {
            L2: {
              var9 = param3 - param1;
              var10 = -var8 + var7;
              var11 = 0;
              if ((var9 ^ -1) < -1) {
                var11 = (var9 / 2 + param2 * var10) / var9;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var12 = var8 / 2 + var11;
              var15 = this.field_Gb;
              var15.field_x = this.field_x;
              var15.field_R = 0;
              var15.field_lb = var5;
              var15.field_ib = 0;
              var16 = this.field_Jb;
              var16.field_x = this.field_x;
              var16.field_lb = -var6 + this.field_lb;
              var16.field_R = 0;
              var16.field_ib = var6;
              var17 = this.field_Fb;
              var17.field_x = this.field_x;
              var17.field_lb = var7;
              var17.field_ib = var5;
              var17.field_R = 0;
              var18 = this.field_Eb;
              var18.field_R = 0;
              var18.field_lb = var12;
              var18.field_x = this.field_x;
              var18.field_ib = 0;
              var19 = this.field_Mb;
              var19.field_x = this.field_x;
              var19.field_lb = var7 + -var12;
              var19.field_R = 0;
              var19.field_ib = var12;
              var20 = this.field_Ib;
              stackIn_27_0 = this.field_Gb;

              stackIn_27_1 = this.field_Jb;

              stackIn_27_2 = this.field_Fb;

              if (param1 >= param3) {
                stackIn_28_0 = (g) ((Object) stackIn_27_0);
                stackIn_28_1 = (g) ((Object) stackIn_27_1);
                stackIn_28_2 = (g) ((Object) stackIn_27_2);
                stackIn_28_3 = 0;
                break L3;
              } else {
                stackIn_28_0 = (g) ((Object) stackIn_27_0);
                stackIn_28_1 = (g) ((Object) stackIn_27_1);
                stackIn_28_2 = (g) ((Object) stackIn_27_2);
                stackIn_28_3 = 1;
                break L3;
              }
            }
            stackIn_28_2.field_zb = stackIn_28_3 != 0;
            stackIn_28_1.field_zb = stackIn_28_3 != 0;
            stackIn_28_0.field_zb = stackIn_28_3 != 0;
            var20.field_lb = var8;
            var20.field_ib = var11;
            var20.field_x = this.field_x;
            var14 = 21 / ((param0 - -5) / 50);
            var20.field_R = 0;
            return;
          } else {
            L4: {
              var8 = var7;
              var9 = param3 - param1;
              var10 = -var8 + var7;
              var11 = 0;
              if ((var9 ^ -1) < -1) {
                var11 = (var9 / 2 + param2 * var10) / var9;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var12 = var8 / 2 + var11;
              var15 = this.field_Gb;
              var15.field_x = this.field_x;
              var15.field_R = 0;
              var15.field_lb = var5;
              var15.field_ib = 0;
              var16 = this.field_Jb;
              var16.field_x = this.field_x;
              var16.field_lb = -var6 + this.field_lb;
              var16.field_R = 0;
              var16.field_ib = var6;
              var17 = this.field_Fb;
              var17.field_x = this.field_x;
              var17.field_lb = var7;
              var17.field_ib = var5;
              var17.field_R = 0;
              var18 = this.field_Eb;
              var18.field_R = 0;
              var18.field_lb = var12;
              var18.field_x = this.field_x;
              var18.field_ib = 0;
              var19 = this.field_Mb;
              var19.field_x = this.field_x;
              var19.field_lb = var7 + -var12;
              var19.field_R = 0;
              var19.field_ib = var12;
              var20 = this.field_Ib;
              stackIn_20_0 = this.field_Gb;

              stackIn_20_1 = this.field_Jb;

              stackIn_20_2 = this.field_Fb;

              if (param1 >= param3) {
                stackIn_21_0 = (g) ((Object) stackIn_20_0);
                stackIn_21_1 = (g) ((Object) stackIn_20_1);
                stackIn_21_2 = (g) ((Object) stackIn_20_2);
                stackIn_21_3 = 0;
                break L5;
              } else {
                stackIn_21_0 = (g) ((Object) stackIn_20_0);
                stackIn_21_1 = (g) ((Object) stackIn_20_1);
                stackIn_21_2 = (g) ((Object) stackIn_20_2);
                stackIn_21_3 = 1;
                break L5;
              }
            }
            stackIn_21_2.field_zb = stackIn_21_3 != 0;
            stackIn_21_1.field_zb = stackIn_21_3 != 0;
            stackIn_21_0.field_zb = stackIn_21_3 != 0;
            var20.field_lb = var8;
            var20.field_ib = var11;
            var20.field_x = this.field_x;
            var14 = 21 / ((param0 - -5) / 50);
            var20.field_R = 0;
            return;
          }
        } else {
          L6: {
            var9 = param3 - param1;
            var10 = -var8 + var7;
            var11 = 0;
            if ((var9 ^ -1) < -1) {
              var11 = (var9 / 2 + param2 * var10) / var9;
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            var12 = var8 / 2 + var11;
            var15 = this.field_Gb;
            var15.field_x = this.field_x;
            var15.field_R = 0;
            var15.field_lb = var5;
            var15.field_ib = 0;
            var16 = this.field_Jb;
            var16.field_x = this.field_x;
            var16.field_lb = -var6 + this.field_lb;
            var16.field_R = 0;
            var16.field_ib = var6;
            var17 = this.field_Fb;
            var17.field_x = this.field_x;
            var17.field_lb = var7;
            var17.field_ib = var5;
            var17.field_R = 0;
            var18 = this.field_Eb;
            var18.field_R = 0;
            var18.field_lb = var12;
            var18.field_x = this.field_x;
            var18.field_ib = 0;
            var19 = this.field_Mb;
            var19.field_x = this.field_x;
            var19.field_lb = var7 + -var12;
            var19.field_R = 0;
            var19.field_ib = var12;
            var20 = this.field_Ib;
            stackIn_9_0 = this.field_Gb;

            stackIn_9_1 = this.field_Jb;

            stackIn_9_2 = this.field_Fb;

            if (param1 >= param3) {
              stackIn_10_0 = (g) ((Object) stackIn_9_0);
              stackIn_10_1 = (g) ((Object) stackIn_9_1);
              stackIn_10_2 = (g) ((Object) stackIn_9_2);
              stackIn_10_3 = 0;
              break L7;
            } else {
              stackIn_10_0 = (g) ((Object) stackIn_9_0);
              stackIn_10_1 = (g) ((Object) stackIn_9_1);
              stackIn_10_2 = (g) ((Object) stackIn_9_2);
              stackIn_10_3 = 1;
              break L7;
            }
          }
          stackIn_10_2.field_zb = stackIn_10_3 != 0;
          stackIn_10_1.field_zb = stackIn_10_3 != 0;
          stackIn_10_0.field_zb = stackIn_10_3 != 0;
          var20.field_lb = var8;
          var20.field_ib = var11;
          var20.field_x = this.field_x;
          var14 = 21 / ((param0 - -5) / 50);
          var20.field_R = 0;
          return;
        }
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 43 % ((-30 - param0) / 61);
        return this.a(param2, param1, (byte) -123, false);
    }

    static {
        field_Lb = "You have 1 unread message!";
    }
}
