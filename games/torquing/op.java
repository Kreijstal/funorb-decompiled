/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class op extends wk implements ec {
    private la field_m;
    private la field_p;
    private boolean field_o;
    static int field_k;
    private cf field_l;
    private int field_n;
    static int field_q;
    static int field_j;
    static int field_i;

    public final int[] a(int param0, float param1) {
        vm var3;
        vm stackIn_4_0;
        Object stackIn_4_1;
        la stackIn_4_2;
        float stackIn_4_3;
        Object stackIn_5_1;
        vm stackIn_6_0 = null;
        Object stackIn_6_1 = null;
        la stackIn_6_2 = null;
        float stackIn_6_3 = 0.0f;
        int stackIn_6_4 = 0;
        var3 = this.b(param0, (byte) -61);
        if (var3 == null) {
          return null;
        } else {
          L0: {
            L1: {
              stackIn_4_0 = (vm) (var3);

              stackIn_4_1 = this;

              stackIn_4_2 = this.field_p;

              stackIn_4_3 = param1;

              if (this.field_o) {
                break L1;
              } else {


                stackIn_5_1 = this;

                if (!this.a(param0, (byte) 98).field_h) {
                  stackIn_6_0 = (vm) ((Object) stackIn_4_0);
                  stackIn_6_1 = this;
                  stackIn_6_2 = (la) ((Object) stackIn_4_2);
                  stackIn_6_3 = stackIn_4_3;
                  stackIn_6_4 = 0;
                  break L0;
                } else {
                  stackIn_4_0 = (vm) ((Object) stackIn_4_0);
                  stackIn_4_1 = this;
                  stackIn_4_2 = (la) ((Object) stackIn_4_2);

                  break L1;
                }
              }
            }
            stackIn_6_0 = (vm) ((Object) stackIn_4_0);
            stackIn_6_1 = this;
            stackIn_6_2 = (la) ((Object) stackIn_4_2);
            stackIn_6_3 = stackIn_4_3;
            stackIn_6_4 = 1;
            break L0;
          }
          return ((vm) (Object) stackIn_6_0).a((si) (this), stackIn_6_2, stackIn_6_3, stackIn_6_4 != 0);
        }
    }

    final static void a(byte param0, fj param1, java.math.BigInteger param2, java.math.BigInteger param3, int param4, byte[] param5, int param6) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        var10 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var7_int = ed.a((byte) 72, param4);
              if (mo.field_y == null) {
                mo.field_y = new java.security.SecureRandom();
                break L1;
              } else {
                break L1;
              }
            }
            var13 = new int[4];
            var12 = var13;
            var8 = var12;
            var9 = 0;
            L2: while (true) {
              if (4 <= var9) {
                L3: {
                  if (param0 == 20) {
                    break L3;
                  } else {
                    op.a(-68L, 80);
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    if (hc.field_c == null) {
                      break L5;
                    } else {
                      if (var7_int > hc.field_c.field_j.length) {
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  hc.field_c = new fj(var7_int);
                  break L4;
                }
                L6: {
                  L7: {
                    hc.field_c.field_n = 0;
                    hc.field_c.a(param4, param6, param5, (byte) -53);
                    hc.field_c.d(var7_int, 114);
                    hc.field_c.a(5479, var13);
                    if (null == vg.field_k) {
                      break L7;
                    } else {
                      if (vg.field_k.field_j.length >= 100) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  vg.field_k = new fj(100);
                  break L6;
                }
                vg.field_k.field_n = 0;
                vg.field_k.b(90, 10);
                var11 = 0;
                var9 = var11;
                L8: while (true) {
                  if (4 <= var11) {
                    vg.field_k.a(param4, param0 + 52);
                    vg.field_k.a(param2, param3, -64);
                    param1.a(vg.field_k.field_n, 0, vg.field_k.field_j, (byte) -62);
                    param1.a(hc.field_c.field_n, 0, hc.field_c.field_j, (byte) -104);
                    break L0;
                  } else {
                    vg.field_k.b((byte) 60, var13[var11]);
                    var11++;
                    continue L8;
                  }
                }
              } else {
                var8[var9] = mo.field_y.nextInt();
                var9++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var7);

            stackIn_24_1 = new StringBuilder().append("op.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L9;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param2 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L10;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');

            if (param3 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L11;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L12;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L12;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_25_0), stackIn_34_2 + ',' + param6 + ')');
        }
    }

    private final vm b(int param0, byte param1) {
        vm var3;
        byte[] var4;
        var3 = (vm) ((Object) this.field_l.a((long)param0, 4604));
        if (var3 != null) {
          return var3;
        } else {
          if (param1 == -61) {
            var4 = this.field_m.a(param0, param1 + 161, 0);
            if (var4 == null) {
              return null;
            } else {
              var3 = new vm(new fj(var4));
              this.field_l.a((long)param0, var3, 0);
              return var3;
            }
          } else {
            field_k = -28;
            var4 = this.field_m.a(param0, param1 + 161, 0);
            if (var4 == null) {
              return null;
            } else {
              var3 = new vm(new fj(var4));
              this.field_l.a((long)param0, var3, 0);
              return var3;
            }
          }
        }
    }

    final static void a(long param0, int param1) {
        try {
            Throwable decompiledCaughtException = null;
            InterruptedException var3 = null;
            byte[] var4 = null;
            try {
              L0: {
                Thread.sleep(param0);
                if (param1 >= 75) {
                  break L0;
                } else {
                  var4 = (byte[]) null;
                  op.a((byte) -95, (fj) null, (java.math.BigInteger) null, (java.math.BigInteger) null, 124, (byte[]) null, -48);
                  return;
                }
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var3 = (InterruptedException) (Object) decompiledCaughtException;
                break L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final boolean d(int param0) {
        return !this.a(param0, (byte) 98).field_g;
    }

    public final int c(int param0) {
        return this.a(param0, (byte) 98).field_j;
    }

    final wd a(byte param0, int param1) {
        vm var3;
        if (param0 > 19) {
          var3 = this.b(param1, (byte) -61);
          if (var3 == null) {
            return null;
          } else {
            return var3.field_u;
          }
        } else {
          field_j = 49;
          var3 = this.b(param1, (byte) -61);
          if (var3 == null) {
            return null;
          } else {
            return var3.field_u;
          }
        }
    }

    op(la param0, la param1, la param2, int param3, boolean param4) {
        super(param1, param0, param2);
        this.field_o = false;
        this.field_n = 50;
        try {
            this.field_m = param0;
            this.field_n = param3;
            this.field_p = param2;
            this.field_o = param4 ? true : false;
            this.field_l = new cf(this.field_n);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "op.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final int b(int param0) {
        return this.a(param0, (byte) 98).field_d & 65535;
    }

    public final boolean a(int param0) {
        if (this.field_o || this.a(param0, (byte) 98).field_h) {
            return true;
        }
        return false;
    }

    static {
        tb.a(50, -128);
    }
}
