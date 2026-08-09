/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb extends le {
    private le field_Pb;
    private le field_Mb;
    private boolean field_Gb;
    private int field_Ib;
    private le field_Lb;
    static int field_Kb;
    private le field_Fb;
    static int[] field_Ob;
    private le field_Nb;
    private le field_Jb;
    static int field_Hb;

    final boolean h(int param0) {
        if (this.field_Pb.field_Q != 0) {
          this.field_Ib = 20;
          return true;
        } else {
          if ((this.field_Pb.field_W ^ -1) != param0) {
            if (this.field_Ib <= 0) {
              if (this.field_Ib == 0) {
                if (this.field_Mb.field_z + this.field_Mb.field_mb <= rb.field_m) {
                  return false;
                } else {
                  this.field_Ib = 3;
                  return true;
                }
              } else {
                return false;
              }
            } else {
              this.field_Ib = this.field_Ib - 1;
              if (this.field_Ib == 0) {
                if (this.field_Mb.field_z + this.field_Mb.field_mb <= rb.field_m) {
                  return false;
                } else {
                  this.field_Ib = 3;
                  return true;
                }
              } else {
                return false;
              }
            }
          } else {
            return false;
          }
        }
    }

    final boolean d(byte param0) {
        if (param0 >= -122) {
            return true;
        }
        return (this.field_Mb.field_W ^ -1) != -1 ? true : false;
    }

    pb(long param0, pb param1, boolean param2) {
        this(param0, param1.field_Jb, param1.field_Fb, param1.field_Pb, param1.field_Mb, param2);
    }

    final boolean g(int param0) {
        if (0 == this.field_Fb.field_Q) {
          if (param0 > 118) {
            if (this.field_Fb.field_W != 0) {
              if (0 >= this.field_Ib) {
                if (-1 != (this.field_Ib ^ -1)) {
                  return false;
                } else {
                  this.field_Ib = 3;
                  return true;
                }
              } else {
                this.field_Ib = this.field_Ib - 1;
                if (-1 != (this.field_Ib ^ -1)) {
                  return false;
                } else {
                  this.field_Ib = 3;
                  return true;
                }
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          this.field_Ib = 20;
          return true;
        }
    }

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var2_int = param1.charAt(0);
            var3 = 1;
            L1: while (true) {
              if (param1.length() <= var3) {
                if (param0 == 17032) {
                  stackIn_12_0 = 1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_10_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                if ((param1.charAt(var3) ^ -1) == (var2_int ^ -1)) {
                  var3++;
                  continue L1;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var2);

            stackIn_15_1 = new StringBuilder().append("pb.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    final void b(int param0, int param1, int param2, boolean param3) {
        if (this.field_Gb) {
          this.a(param2, param1, (byte) -87, param0);
          if (!param3) {
            return;
          } else {
            this.field_Nb = (le) null;
            return;
          }
        } else {
          this.a(param2, param0, param1, true);
          if (!param3) {
            return;
          } else {
            this.field_Nb = (le) null;
            return;
          }
        }
    }

    public static void f(int param0) {
        if (param0 >= -83) {
            field_Kb = -91;
            field_Ob = null;
            return;
        }
        field_Ob = null;
    }

    final boolean e(byte param0) {
        if (0 != this.field_Nb.field_Q) {
          this.field_Ib = 20;
          return true;
        } else {
          if (param0 > 61) {
            if (this.field_Nb.field_W != 0) {
              if ((this.field_Ib ^ -1) >= -1) {
                if (0 == this.field_Ib) {
                  if (rb.field_m < this.field_Mb.field_N + this.field_Mb.field_z + (this.field_Mb.field_mb - -this.field_Mb.field_sb)) {
                    return false;
                  } else {
                    this.field_Ib = 3;
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                this.field_Ib = this.field_Ib - 1;
                if (0 == this.field_Ib) {
                  if (rb.field_m >= this.field_Mb.field_N + this.field_Mb.field_z + (this.field_Mb.field_mb - -this.field_Mb.field_sb)) {
                    this.field_Ib = 3;
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        }
    }

    final boolean i(int param0) {
        if (param0 == 4308) {
          if (0 != this.field_Jb.field_Q) {
            this.field_Ib = 20;
            return true;
          } else {
            if (this.field_Jb.field_W != 0) {
              L0: {
                if (-1 > (this.field_Ib ^ -1)) {
                  this.field_Ib = this.field_Ib - 1;
                  break L0;
                } else {
                  break L0;
                }
              }
              if (this.field_Ib != 0) {
                return false;
              } else {
                this.field_Ib = 3;
                return true;
              }
            } else {
              return false;
            }
          }
        } else {
          this.h(-127);
          if (0 != this.field_Jb.field_Q) {
            this.field_Ib = 20;
            return true;
          } else {
            if (this.field_Jb.field_W != 0) {
              L1: {
                if (-1 > (this.field_Ib ^ -1)) {
                  this.field_Ib = this.field_Ib - 1;
                  break L1;
                } else {
                  break L1;
                }
              }
              if (this.field_Ib != 0) {
                return false;
              } else {
                this.field_Ib = 3;
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    final static vb b(String param0, byte param1) {
        String var2 = null;
        vb var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        vb stackIn_18_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (kj.field_g != null) {
              if (param0 != null) {
                if (-1 != (param0.length() ^ -1)) {
                  L1: {
                    if (param1 < -107) {
                      break L1;
                    } else {
                      field_Kb = 14;
                      break L1;
                    }
                  }
                  var6 = (CharSequence) ((Object) param0);
                  var2 = mf.a(false, var6);
                  if (var2 != null) {
                    var3 = (vb) ((Object) kj.field_g.a((long)var2.hashCode(), -30828));
                    L2: while (true) {
                      if (var3 != null) {
                        var7 = (CharSequence) ((Object) var3.field_Ib);
                        var4 = mf.a(false, var7);
                        if (!var4.equals(var2)) {
                          var3 = (vb) ((Object) kj.field_g.a(-118));
                          continue L2;
                        } else {
                          stackIn_18_0 = (vb) (var3);
                          break L0;
                        }
                      } else {
                        return null;
                      }
                    }
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var2_ref);

            stackIn_23_1 = new StringBuilder().append("pb.N(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L3;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
        return stackIn_18_0;
    }

    private final void a(int param0, int param1, int param2, boolean param3) {
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        le var15 = null;
        le var16 = null;
        le var17 = null;
        le var18 = null;
        le var19 = null;
        le var20 = null;
        int var14 = HostileSpawn.field_I ? 1 : 0;
        if (this.field_qb >= 2 * this.field_sb) {
            var5 = this.field_sb;
            var6 = -this.field_sb + this.field_qb;
        } else {
            var6 = this.field_qb / 2;
            var5 = this.field_qb / 2;
        }
        int var7 = -var5 + var6;
        int var8 = var7;
        if (param2 <= param1) {
            var7 = 0;
            var9 = param2 + -param1;
            var10 = -var8 + var7;
            var11 = 0;
            if (!((var9 ^ -1) >= -1)) {
                var11 = (var9 / 2 + var10 * param0) / var9;
            }
            var12 = var11 - -(var8 / 2);
            var15 = this.field_Jb;
            var15.field_sb = this.field_sb;
            var15.field_qb = var5;
            var15.field_zb = 0;
            var15.field_tb = 0;
            var16 = this.field_Fb;
            var16.field_zb = 0;
            var16.field_tb = var6;
            if (!param3) {
                return;
            }
            var16.field_sb = this.field_sb;
            var16.field_qb = -var6 + this.field_qb;
            var17 = this.field_Lb;
            var17.field_tb = var5;
            var17.field_zb = 0;
            var17.field_sb = this.field_sb;
            var17.field_qb = var7;
            var18 = this.field_Pb;
            var18.field_qb = var12;
            var18.field_sb = this.field_sb;
            var18.field_tb = 0;
            var18.field_zb = 0;
            var19 = this.field_Nb;
            var19.field_qb = -var12 + var7;
            var19.field_zb = 0;
            var19.field_sb = this.field_sb;
            var19.field_tb = var12;
            var20 = this.field_Mb;
            var20.field_tb = var11;
            this.field_Lb.field_jb = param2 > param1 ? true : false;
            this.field_Fb.field_jb = param2 > param1 ? true : false;
            this.field_Jb.field_jb = param2 > param1 ? true : false;
            var20.field_zb = 0;
            var20.field_qb = var8;
            var20.field_sb = this.field_sb;
            return;
        }
        var8 = var8 * param1 / param2;
        if (!(this.field_sb <= var8)) {
            var8 = this.field_sb;
        }
        if (var7 >= var8) {
            var9 = param2 + -param1;
            var10 = -var8 + var7;
            var11 = 0;
            if (!((var9 ^ -1) >= -1)) {
                var11 = (var9 / 2 + var10 * param0) / var9;
            }
            var12 = var11 - -(var8 / 2);
            var15 = this.field_Jb;
            var15.field_sb = this.field_sb;
            var15.field_qb = var5;
            var15.field_zb = 0;
            var15.field_tb = 0;
            var16 = this.field_Fb;
            var16.field_zb = 0;
            var16.field_tb = var6;
            if (!param3) {
                return;
            }
            var16.field_sb = this.field_sb;
            var16.field_qb = -var6 + this.field_qb;
            var17 = this.field_Lb;
            var17.field_tb = var5;
            var17.field_zb = 0;
            var17.field_sb = this.field_sb;
            var17.field_qb = var7;
            var18 = this.field_Pb;
            var18.field_qb = var12;
            var18.field_sb = this.field_sb;
            var18.field_tb = 0;
            var18.field_zb = 0;
            var19 = this.field_Nb;
            var19.field_qb = -var12 + var7;
            var19.field_zb = 0;
            var19.field_sb = this.field_sb;
            var19.field_tb = var12;
            var20 = this.field_Mb;
            var20.field_tb = var11;
            this.field_Lb.field_jb = param2 > param1 ? true : false;
            this.field_Fb.field_jb = param2 > param1 ? true : false;
            this.field_Jb.field_jb = param2 > param1 ? true : false;
            var20.field_zb = 0;
            var20.field_qb = var8;
            var20.field_sb = this.field_sb;
            return;
        }
        var8 = var7;
        var9 = param2 + -param1;
        var10 = -var8 + var7;
        var11 = 0;
        if (!((var9 ^ -1) >= -1)) {
            var11 = (var9 / 2 + var10 * param0) / var9;
        }
        var12 = var11 - -(var8 / 2);
        var15 = this.field_Jb;
        var15.field_sb = this.field_sb;
        var15.field_qb = var5;
        var15.field_zb = 0;
        var15.field_tb = 0;
        var16 = this.field_Fb;
        var16.field_zb = 0;
        var16.field_tb = var6;
        if (!param3) {
            return;
        }
        var16.field_sb = this.field_sb;
        var16.field_qb = -var6 + this.field_qb;
        var17 = this.field_Lb;
        var17.field_tb = var5;
        var17.field_zb = 0;
        var17.field_sb = this.field_sb;
        var17.field_qb = var7;
        var18 = this.field_Pb;
        var18.field_qb = var12;
        var18.field_sb = this.field_sb;
        var18.field_tb = 0;
        var18.field_zb = 0;
        var19 = this.field_Nb;
        var19.field_qb = -var12 + var7;
        var19.field_zb = 0;
        var19.field_sb = this.field_sb;
        var19.field_tb = var12;
        var20 = this.field_Mb;
        var20.field_tb = var11;
        this.field_Lb.field_jb = param2 > param1 ? true : false;
        this.field_Fb.field_jb = param2 > param1 ? true : false;
        this.field_Jb.field_jb = param2 > param1 ? true : false;
        var20.field_zb = 0;
        var20.field_qb = var8;
        var20.field_sb = this.field_sb;
    }

    final int a(int param0, boolean param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        L0: {
          var5 = 0;
          var6 = this.field_Lb.field_sb + -this.field_Mb.field_sb;
          if (0 >= var6) {
            break L0;
          } else {
            var7 = this.field_Mb.field_zb;
            var8 = -param2 + param0;
            var5 = (var6 / 2 + var7 * var8) / var6;
            break L0;
          }
        }
        if (!param1) {
          L1: {
            if (param0 - param2 < var5) {
              var5 = param0 - param2;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (-1 >= (var5 ^ -1)) {
              break L2;
            } else {
              var5 = 0;
              break L2;
            }
          }
          if (param3 <= 18) {
            this.g(108);
            return var5;
          } else {
            return var5;
          }
        } else {
          L3: {
            if (-1 < (var5 ^ -1)) {
              var5 = 0;
              break L3;
            } else {
              break L3;
            }
          }
          if (-param2 + param0 < var5) {
            var5 = -param2 + param0;
            if (param3 > 18) {
              return var5;
            } else {
              this.g(108);
              return var5;
            }
          } else {
            if (param3 > 18) {
              return var5;
            } else {
              this.g(108);
              return var5;
            }
          }
        }
    }

    pb(long param0, le param1, le param2, le param3, le param4, boolean param5) {
        super(param0, (le) null);
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        le var10 = null;
        le var11 = null;
        try {
          L0: {
            L1: {
              stackIn_3_0 = this;

              if (!param5) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            ((pb) (this)).field_Gb = stackIn_4_1 != 0;
            this.field_Jb = new le(0L, param1);
            this.field_Fb = new le(0L, param2);
            this.a(false, this.field_Jb);
            this.a(false, this.field_Fb);
            this.field_Lb = new le(0L, (le) null);
            this.a(false, this.field_Lb);
            this.field_Pb = new le(0L, param3);
            this.field_Nb = new le(0L, param3);
            this.field_Nb.field_B = true;
            var10 = this.field_Pb;
            var11 = var10;
            var11.field_B = true;
            this.field_Lb.a(false, this.field_Pb);
            this.field_Lb.a(false, this.field_Nb);
            this.field_Mb = new le(0L, param4);
            this.field_Mb.field_Db = true;
            this.field_Lb.a(false, this.field_Mb);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var8);

            stackIn_8_1 = new StringBuilder().append("pb.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param4 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_9_0), stackIn_18_2 + ',' + param5 + ')');
        }
    }

    final int b(int param0, boolean param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        L0: {
          var5 = 0;
          var7 = 127 % ((46 - param2) / 53);
          var6 = this.field_Lb.field_qb + -this.field_Mb.field_qb;
          if (-1 > (var6 ^ -1)) {
            var8 = this.field_Mb.field_tb;
            var9 = -param3 + param0;
            var5 = (var9 * var8 - -(var6 / 2)) / var6;
            break L0;
          } else {
            break L0;
          }
        }
        if (param1) {
          L1: {
            if (var5 >= 0) {
              break L1;
            } else {
              var5 = 0;
              break L1;
            }
          }
          if (var5 <= param0 - param3) {
            return var5;
          } else {
            var5 = -param3 + param0;
            return var5;
          }
        } else {
          L2: {
            if (-param3 + param0 >= var5) {
              break L2;
            } else {
              var5 = -param3 + param0;
              break L2;
            }
          }
          if (var5 >= 0) {
            return var5;
          } else {
            var5 = 0;
            return var5;
          }
        }
    }

    private final void a(int param0, int param1, byte param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var14;
        int var15;
        le var16;
        le var17;
        le var18;
        le var19;
        le var20;
        le var21;
        le stackIn_13_0 = null;
        le stackIn_13_1 = null;
        le stackIn_13_2 = null;
        le stackIn_14_0 = null;
        le stackIn_14_1 = null;
        le stackIn_14_2 = null;
        int stackIn_14_3 = 0;
        le stackIn_21_0 = null;
        le stackIn_21_1 = null;
        le stackIn_21_2 = null;
        le stackIn_22_0 = null;
        le stackIn_22_1 = null;
        le stackIn_22_2 = null;
        int stackIn_22_3 = 0;
        L0: {
          var15 = HostileSpawn.field_I ? 1 : 0;
          if (this.field_qb * 2 > this.field_sb) {
            var6 = this.field_sb / 2;
            var5 = this.field_sb / 2;
            break L0;
          } else {
            var5 = this.field_qb;
            var6 = this.field_sb + -this.field_qb;
            break L0;
          }
        }
        L1: {
          var7 = var6 + -var5;
          var8 = var7;
          if (param1 <= param3) {
            var7 = 0;
            break L1;
          } else {
            L2: {
              var8 = var8 * param3 / param1;
              if (this.field_qb > var8) {
                var8 = this.field_qb;
                break L2;
              } else {
                break L2;
              }
            }
            if (var8 <= var7) {
              break L1;
            } else {
              L3: {
                var8 = var7;
                var9 = -param3 + param1;
                var10 = -var8 + var7;
                var11 = 0;
                if ((var9 ^ -1) < -1) {
                  var11 = (var9 / 2 + param0 * var10) / var9;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                var12 = var8 / 2 + var11;
                var16 = this.field_Jb;
                var14 = 96 / ((64 - param2) / 57);
                var16.field_qb = this.field_qb;
                var16.field_zb = 0;
                var16.field_tb = 0;
                var16.field_sb = var5;
                var17 = this.field_Fb;
                var17.field_sb = this.field_sb + -var6;
                var17.field_qb = this.field_qb;
                var17.field_tb = 0;
                var17.field_zb = var6;
                var18 = this.field_Lb;
                var18.field_qb = this.field_qb;
                var18.field_sb = var7;
                var18.field_zb = var5;
                var18.field_tb = 0;
                var19 = this.field_Pb;
                var19.field_qb = this.field_qb;
                var19.field_zb = 0;
                var19.field_tb = 0;
                var19.field_sb = var12;
                var20 = this.field_Nb;
                var20.field_zb = var12;
                var20.field_sb = var7 - var12;
                var20.field_tb = 0;
                var20.field_qb = this.field_qb;
                var21 = this.field_Mb;
                var21.field_zb = var11;
                stackIn_13_0 = this.field_Jb;

                stackIn_13_1 = this.field_Fb;

                stackIn_13_2 = this.field_Lb;

                if (param1 <= param3) {
                  stackIn_14_0 = (le) ((Object) stackIn_13_0);
                  stackIn_14_1 = (le) ((Object) stackIn_13_1);
                  stackIn_14_2 = (le) ((Object) stackIn_13_2);
                  stackIn_14_3 = 0;
                  break L4;
                } else {
                  stackIn_14_0 = (le) ((Object) stackIn_13_0);
                  stackIn_14_1 = (le) ((Object) stackIn_13_1);
                  stackIn_14_2 = (le) ((Object) stackIn_13_2);
                  stackIn_14_3 = 1;
                  break L4;
                }
              }
              stackIn_14_2.field_jb = stackIn_14_3 != 0;
              stackIn_14_1.field_jb = stackIn_14_3 != 0;
              stackIn_14_0.field_jb = stackIn_14_3 != 0;
              var21.field_qb = this.field_qb;
              var21.field_tb = 0;
              var21.field_sb = var8;
              return;
            }
          }
        }
        L5: {
          var9 = -param3 + param1;
          var10 = -var8 + var7;
          var11 = 0;
          if ((var9 ^ -1) < -1) {
            var11 = (var9 / 2 + param0 * var10) / var9;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          var12 = var8 / 2 + var11;
          var16 = this.field_Jb;
          var14 = 96 / ((64 - param2) / 57);
          var16.field_qb = this.field_qb;
          var16.field_zb = 0;
          var16.field_tb = 0;
          var16.field_sb = var5;
          var17 = this.field_Fb;
          var17.field_sb = this.field_sb + -var6;
          var17.field_qb = this.field_qb;
          var17.field_tb = 0;
          var17.field_zb = var6;
          var18 = this.field_Lb;
          var18.field_qb = this.field_qb;
          var18.field_sb = var7;
          var18.field_zb = var5;
          var18.field_tb = 0;
          var19 = this.field_Pb;
          var19.field_qb = this.field_qb;
          var19.field_zb = 0;
          var19.field_tb = 0;
          var19.field_sb = var12;
          var20 = this.field_Nb;
          var20.field_zb = var12;
          var20.field_sb = var7 - var12;
          var20.field_tb = 0;
          var20.field_qb = this.field_qb;
          var21 = this.field_Mb;
          var21.field_zb = var11;
          stackIn_21_0 = this.field_Jb;

          stackIn_21_1 = this.field_Fb;

          stackIn_21_2 = this.field_Lb;

          if (param1 <= param3) {
            stackIn_22_0 = (le) ((Object) stackIn_21_0);
            stackIn_22_1 = (le) ((Object) stackIn_21_1);
            stackIn_22_2 = (le) ((Object) stackIn_21_2);
            stackIn_22_3 = 0;
            break L6;
          } else {
            stackIn_22_0 = (le) ((Object) stackIn_21_0);
            stackIn_22_1 = (le) ((Object) stackIn_21_1);
            stackIn_22_2 = (le) ((Object) stackIn_21_2);
            stackIn_22_3 = 1;
            break L6;
          }
        }
        stackIn_22_2.field_jb = stackIn_22_3 != 0;
        stackIn_22_1.field_jb = stackIn_22_3 != 0;
        stackIn_22_0.field_jb = stackIn_22_3 != 0;
        var21.field_qb = this.field_qb;
        var21.field_tb = 0;
        var21.field_sb = var8;
    }

    static {
        field_Ob = nf.a(false);
        field_Hb = 0;
    }
}
