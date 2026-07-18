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
        if (((pb) this).field_Pb.field_Q != 0) {
          ((pb) this).field_Ib = 20;
          return true;
        } else {
          if (~((pb) this).field_Pb.field_W != param0) {
            if (((pb) this).field_Ib <= 0) {
              if (((pb) this).field_Ib == 0) {
                if (((pb) this).field_Mb.field_z + ((pb) this).field_Mb.field_mb <= rb.field_m) {
                  return false;
                } else {
                  ((pb) this).field_Ib = 3;
                  return true;
                }
              } else {
                return false;
              }
            } else {
              ((pb) this).field_Ib = ((pb) this).field_Ib - 1;
              if (((pb) this).field_Ib == 0) {
                if (((pb) this).field_Mb.field_z + ((pb) this).field_Mb.field_mb <= rb.field_m) {
                  return false;
                } else {
                  ((pb) this).field_Ib = 3;
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
        return ((pb) this).field_Mb.field_W != 0 ? true : false;
    }

    pb(long param0, pb param1, boolean param2) {
        this(param0, param1.field_Jb, param1.field_Fb, param1.field_Pb, param1.field_Mb, param2);
    }

    final boolean g(int param0) {
        if (0 != ((pb) this).field_Fb.field_Q) {
            ((pb) this).field_Ib = 20;
            return true;
        }
        if (param0 <= 118) {
            return false;
        }
        if (((pb) this).field_Fb.field_W == 0) {
            return false;
        }
        if (0 < ((pb) this).field_Ib) {
            ((pb) this).field_Ib = ((pb) this).field_Ib - 1;
            if (((pb) this).field_Ib != 0) {
                return false;
            }
            ((pb) this).field_Ib = 3;
            return true;
        }
        if (((pb) this).field_Ib != 0) {
            return false;
        }
        ((pb) this).field_Ib = 3;
        return true;
    }

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var2_int = param1.charAt(0);
            var3 = 1;
            L1: while (true) {
              if (param1.length() <= var3) {
                stackOut_10_0 = 1;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                if (param1.charAt(var3) == var2_int) {
                  var3++;
                  continue L1;
                } else {
                  stackOut_4_0 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("pb.P(").append(17032).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final void b(int param0, int param1, int param2, boolean param3) {
        if (((pb) this).field_Gb) {
          this.a(param2, param1, (byte) -87, param0);
          if (!param3) {
            return;
          } else {
            ((pb) this).field_Nb = null;
            return;
          }
        } else {
          int discarded$2 = 1;
          this.a(param2, param0, param1);
          if (!param3) {
            return;
          } else {
            ((pb) this).field_Nb = null;
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
        if (0 != ((pb) this).field_Nb.field_Q) {
          ((pb) this).field_Ib = 20;
          return true;
        } else {
          if (param0 > 61) {
            if (((pb) this).field_Nb.field_W != 0) {
              if (((pb) this).field_Ib <= 0) {
                if (0 == ((pb) this).field_Ib) {
                  if (rb.field_m < ((pb) this).field_Mb.field_N + ((pb) this).field_Mb.field_z + (((pb) this).field_Mb.field_mb - -((pb) this).field_Mb.field_sb)) {
                    return false;
                  } else {
                    ((pb) this).field_Ib = 3;
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                ((pb) this).field_Ib = ((pb) this).field_Ib - 1;
                if (0 == ((pb) this).field_Ib) {
                  if (rb.field_m >= ((pb) this).field_Mb.field_N + ((pb) this).field_Mb.field_z + (((pb) this).field_Mb.field_mb - -((pb) this).field_Mb.field_sb)) {
                    ((pb) this).field_Ib = 3;
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
          if (0 != ((pb) this).field_Jb.field_Q) {
            ((pb) this).field_Ib = 20;
            return true;
          } else {
            if (((pb) this).field_Jb.field_W != 0) {
              L0: {
                if (((pb) this).field_Ib > 0) {
                  ((pb) this).field_Ib = ((pb) this).field_Ib - 1;
                  break L0;
                } else {
                  break L0;
                }
              }
              if (((pb) this).field_Ib != 0) {
                return false;
              } else {
                ((pb) this).field_Ib = 3;
                return true;
              }
            } else {
              return false;
            }
          }
        } else {
          boolean discarded$10 = ((pb) this).h(-127);
          if (0 != ((pb) this).field_Jb.field_Q) {
            ((pb) this).field_Ib = 20;
            return true;
          } else {
            if (((pb) this).field_Jb.field_W != 0) {
              L1: {
                if (((pb) this).field_Ib > 0) {
                  ((pb) this).field_Ib = ((pb) this).field_Ib - 1;
                  break L1;
                } else {
                  break L1;
                }
              }
              if (((pb) this).field_Ib != 0) {
                return false;
              } else {
                ((pb) this).field_Ib = 3;
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
        RuntimeException var2_ref = null;
        vb var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        vb stackIn_18_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        vb stackOut_17_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (kj.field_g != null) {
            if (param0 != null) {
              if (param0.length() != 0) {
                L0: {
                  if (param1 < -107) {
                    break L0;
                  } else {
                    field_Kb = 14;
                    break L0;
                  }
                }
                var6 = (CharSequence) (Object) param0;
                var2 = mf.a(false, var6);
                if (var2 != null) {
                  var3 = (vb) (Object) kj.field_g.a((long)var2.hashCode(), -30828);
                  L1: while (true) {
                    if (var3 != null) {
                      var7 = (CharSequence) (Object) var3.field_Ib;
                      var4 = mf.a(false, var7);
                      if (!var4.equals((Object) (Object) var2)) {
                        var3 = (vb) (Object) kj.field_g.a(-118);
                        continue L1;
                      } else {
                        stackOut_17_0 = (vb) var3;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0;
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2_ref;
            stackOut_21_1 = new StringBuilder().append("pb.N(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L2;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        le var15 = null;
        le var16 = null;
        le var17 = null;
        le var18 = null;
        le var19 = null;
        le var20 = null;
        le stackIn_8_0 = null;
        le stackIn_8_1 = null;
        le stackIn_8_2 = null;
        le stackIn_9_0 = null;
        le stackIn_9_1 = null;
        le stackIn_9_2 = null;
        le stackIn_10_0 = null;
        le stackIn_10_1 = null;
        le stackIn_10_2 = null;
        int stackIn_10_3 = 0;
        le stackIn_19_0 = null;
        le stackIn_19_1 = null;
        le stackIn_19_2 = null;
        le stackIn_20_0 = null;
        le stackIn_20_1 = null;
        le stackIn_20_2 = null;
        le stackIn_21_0 = null;
        le stackIn_21_1 = null;
        le stackIn_21_2 = null;
        int stackIn_21_3 = 0;
        le stackIn_26_0 = null;
        le stackIn_26_1 = null;
        le stackIn_26_2 = null;
        le stackIn_27_0 = null;
        le stackIn_27_1 = null;
        le stackIn_27_2 = null;
        le stackIn_28_0 = null;
        le stackIn_28_1 = null;
        le stackIn_28_2 = null;
        int stackIn_28_3 = 0;
        le stackOut_25_0 = null;
        le stackOut_25_1 = null;
        le stackOut_25_2 = null;
        le stackOut_27_0 = null;
        le stackOut_27_1 = null;
        le stackOut_27_2 = null;
        int stackOut_27_3 = 0;
        le stackOut_26_0 = null;
        le stackOut_26_1 = null;
        le stackOut_26_2 = null;
        int stackOut_26_3 = 0;
        le stackOut_18_0 = null;
        le stackOut_18_1 = null;
        le stackOut_18_2 = null;
        le stackOut_20_0 = null;
        le stackOut_20_1 = null;
        le stackOut_20_2 = null;
        int stackOut_20_3 = 0;
        le stackOut_19_0 = null;
        le stackOut_19_1 = null;
        le stackOut_19_2 = null;
        int stackOut_19_3 = 0;
        le stackOut_7_0 = null;
        le stackOut_7_1 = null;
        le stackOut_7_2 = null;
        le stackOut_9_0 = null;
        le stackOut_9_1 = null;
        le stackOut_9_2 = null;
        int stackOut_9_3 = 0;
        le stackOut_8_0 = null;
        le stackOut_8_1 = null;
        le stackOut_8_2 = null;
        int stackOut_8_3 = 0;
        L0: {
          var14 = HostileSpawn.field_I ? 1 : 0;
          if (((pb) this).field_qb < 2 * ((pb) this).field_sb) {
            var6 = ((pb) this).field_qb / 2;
            var5 = ((pb) this).field_qb / 2;
            break L0;
          } else {
            var5 = ((pb) this).field_sb;
            var6 = -((pb) this).field_sb + ((pb) this).field_qb;
            break L0;
          }
        }
        var7 = -var5 + var6;
        var8 = var7;
        if (param2 > param1) {
          L1: {
            var8 = var8 * param1 / param2;
            if (((pb) this).field_sb > var8) {
              var8 = ((pb) this).field_sb;
              break L1;
            } else {
              break L1;
            }
          }
          if (var7 < var8) {
            L2: {
              var8 = var7;
              var9 = param2 + -param1;
              var10 = -var8 + var7;
              var11 = 0;
              if (var9 > 0) {
                var11 = (var9 / 2 + var10 * param0) / var9;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var12 = var11 - -(var8 / 2);
              var15 = ((pb) this).field_Jb;
              var15.field_sb = ((pb) this).field_sb;
              var15.field_qb = var5;
              var15.field_zb = 0;
              var15.field_tb = 0;
              var16 = ((pb) this).field_Fb;
              var16.field_zb = 0;
              var16.field_tb = var6;
              var16.field_sb = ((pb) this).field_sb;
              var16.field_qb = -var6 + ((pb) this).field_qb;
              var17 = ((pb) this).field_Lb;
              var17.field_tb = var5;
              var17.field_zb = 0;
              var17.field_sb = ((pb) this).field_sb;
              var17.field_qb = var7;
              var18 = ((pb) this).field_Pb;
              var18.field_qb = var12;
              var18.field_sb = ((pb) this).field_sb;
              var18.field_tb = 0;
              var18.field_zb = 0;
              var19 = ((pb) this).field_Nb;
              var19.field_qb = -var12 + var7;
              var19.field_zb = 0;
              var19.field_sb = ((pb) this).field_sb;
              var19.field_tb = var12;
              var20 = ((pb) this).field_Mb;
              var20.field_tb = var11;
              stackOut_25_0 = ((pb) this).field_Jb;
              stackOut_25_1 = ((pb) this).field_Fb;
              stackOut_25_2 = ((pb) this).field_Lb;
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              if (param2 <= param1) {
                stackOut_27_0 = (le) (Object) stackIn_27_0;
                stackOut_27_1 = (le) (Object) stackIn_27_1;
                stackOut_27_2 = (le) (Object) stackIn_27_2;
                stackOut_27_3 = 0;
                stackIn_28_0 = stackOut_27_0;
                stackIn_28_1 = stackOut_27_1;
                stackIn_28_2 = stackOut_27_2;
                stackIn_28_3 = stackOut_27_3;
                break L3;
              } else {
                stackOut_26_0 = (le) (Object) stackIn_26_0;
                stackOut_26_1 = (le) (Object) stackIn_26_1;
                stackOut_26_2 = (le) (Object) stackIn_26_2;
                stackOut_26_3 = 1;
                stackIn_28_0 = stackOut_26_0;
                stackIn_28_1 = stackOut_26_1;
                stackIn_28_2 = stackOut_26_2;
                stackIn_28_3 = stackOut_26_3;
                break L3;
              }
            }
            stackIn_28_2.field_jb = stackIn_28_3 != 0;
            stackIn_28_1.field_jb = stackIn_28_3 != 0;
            stackIn_28_0.field_jb = stackIn_28_3 != 0;
            var20.field_zb = 0;
            var20.field_qb = var8;
            var20.field_sb = ((pb) this).field_sb;
            return;
          } else {
            L4: {
              var9 = param2 + -param1;
              var10 = -var8 + var7;
              var11 = 0;
              if (var9 > 0) {
                var11 = (var9 / 2 + var10 * param0) / var9;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var12 = var11 - -(var8 / 2);
              var15 = ((pb) this).field_Jb;
              var15.field_sb = ((pb) this).field_sb;
              var15.field_qb = var5;
              var15.field_zb = 0;
              var15.field_tb = 0;
              var16 = ((pb) this).field_Fb;
              var16.field_zb = 0;
              var16.field_tb = var6;
              var16.field_sb = ((pb) this).field_sb;
              var16.field_qb = -var6 + ((pb) this).field_qb;
              var17 = ((pb) this).field_Lb;
              var17.field_tb = var5;
              var17.field_zb = 0;
              var17.field_sb = ((pb) this).field_sb;
              var17.field_qb = var7;
              var18 = ((pb) this).field_Pb;
              var18.field_qb = var12;
              var18.field_sb = ((pb) this).field_sb;
              var18.field_tb = 0;
              var18.field_zb = 0;
              var19 = ((pb) this).field_Nb;
              var19.field_qb = -var12 + var7;
              var19.field_zb = 0;
              var19.field_sb = ((pb) this).field_sb;
              var19.field_tb = var12;
              var20 = ((pb) this).field_Mb;
              var20.field_tb = var11;
              stackOut_18_0 = ((pb) this).field_Jb;
              stackOut_18_1 = ((pb) this).field_Fb;
              stackOut_18_2 = ((pb) this).field_Lb;
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              if (param2 <= param1) {
                stackOut_20_0 = (le) (Object) stackIn_20_0;
                stackOut_20_1 = (le) (Object) stackIn_20_1;
                stackOut_20_2 = (le) (Object) stackIn_20_2;
                stackOut_20_3 = 0;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                stackIn_21_2 = stackOut_20_2;
                stackIn_21_3 = stackOut_20_3;
                break L5;
              } else {
                stackOut_19_0 = (le) (Object) stackIn_19_0;
                stackOut_19_1 = (le) (Object) stackIn_19_1;
                stackOut_19_2 = (le) (Object) stackIn_19_2;
                stackOut_19_3 = 1;
                stackIn_21_0 = stackOut_19_0;
                stackIn_21_1 = stackOut_19_1;
                stackIn_21_2 = stackOut_19_2;
                stackIn_21_3 = stackOut_19_3;
                break L5;
              }
            }
            stackIn_21_2.field_jb = stackIn_21_3 != 0;
            stackIn_21_1.field_jb = stackIn_21_3 != 0;
            stackIn_21_0.field_jb = stackIn_21_3 != 0;
            var20.field_zb = 0;
            var20.field_qb = var8;
            var20.field_sb = ((pb) this).field_sb;
            return;
          }
        } else {
          L6: {
            var7 = 0;
            var9 = param2 + -param1;
            var10 = -var8 + var7;
            var11 = 0;
            if (var9 > 0) {
              var11 = (var9 / 2 + var10 * param0) / var9;
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            var12 = var11 - -(var8 / 2);
            var15 = ((pb) this).field_Jb;
            var15.field_sb = ((pb) this).field_sb;
            var15.field_qb = var5;
            var15.field_zb = 0;
            var15.field_tb = 0;
            var16 = ((pb) this).field_Fb;
            var16.field_zb = 0;
            var16.field_tb = var6;
            var16.field_sb = ((pb) this).field_sb;
            var16.field_qb = -var6 + ((pb) this).field_qb;
            var17 = ((pb) this).field_Lb;
            var17.field_tb = var5;
            var17.field_zb = 0;
            var17.field_sb = ((pb) this).field_sb;
            var17.field_qb = var7;
            var18 = ((pb) this).field_Pb;
            var18.field_qb = var12;
            var18.field_sb = ((pb) this).field_sb;
            var18.field_tb = 0;
            var18.field_zb = 0;
            var19 = ((pb) this).field_Nb;
            var19.field_qb = -var12 + var7;
            var19.field_zb = 0;
            var19.field_sb = ((pb) this).field_sb;
            var19.field_tb = var12;
            var20 = ((pb) this).field_Mb;
            var20.field_tb = var11;
            stackOut_7_0 = ((pb) this).field_Jb;
            stackOut_7_1 = ((pb) this).field_Fb;
            stackOut_7_2 = ((pb) this).field_Lb;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_9_2 = stackOut_7_2;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            stackIn_8_2 = stackOut_7_2;
            if (param2 <= param1) {
              stackOut_9_0 = (le) (Object) stackIn_9_0;
              stackOut_9_1 = (le) (Object) stackIn_9_1;
              stackOut_9_2 = (le) (Object) stackIn_9_2;
              stackOut_9_3 = 0;
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              stackIn_10_3 = stackOut_9_3;
              break L7;
            } else {
              stackOut_8_0 = (le) (Object) stackIn_8_0;
              stackOut_8_1 = (le) (Object) stackIn_8_1;
              stackOut_8_2 = (le) (Object) stackIn_8_2;
              stackOut_8_3 = 1;
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              stackIn_10_3 = stackOut_8_3;
              break L7;
            }
          }
          stackIn_10_2.field_jb = stackIn_10_3 != 0;
          stackIn_10_1.field_jb = stackIn_10_3 != 0;
          stackIn_10_0.field_jb = stackIn_10_3 != 0;
          var20.field_zb = 0;
          var20.field_qb = var8;
          var20.field_sb = ((pb) this).field_sb;
          return;
        }
    }

    final int a(int param0, boolean param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var5 = 0;
          var6 = ((pb) this).field_Lb.field_sb + -((pb) this).field_Mb.field_sb;
          if (0 >= var6) {
            break L0;
          } else {
            var7 = ((pb) this).field_Mb.field_zb;
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
            if (var5 >= 0) {
              break L2;
            } else {
              var5 = 0;
              break L2;
            }
          }
          if (param3 <= 18) {
            boolean discarded$3 = ((pb) this).g(108);
            return var5;
          } else {
            return var5;
          }
        } else {
          L3: {
            if (var5 < 0) {
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
              boolean discarded$4 = ((pb) this).g(108);
              return var5;
            }
          } else {
            if (param3 > 18) {
              return var5;
            } else {
              boolean discarded$5 = ((pb) this).g(108);
              return var5;
            }
          }
        }
    }

    pb(long param0, le param1, le param2, le param3, le param4, boolean param5) {
        super(param0, (le) null);
        RuntimeException var8 = null;
        le var10 = null;
        le var11 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param5) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            ((pb) this).field_Gb = stackIn_4_1 != 0;
            ((pb) this).field_Jb = new le(0L, param1);
            ((pb) this).field_Fb = new le(0L, param2);
            ((pb) this).a(false, ((pb) this).field_Jb);
            ((pb) this).a(false, ((pb) this).field_Fb);
            ((pb) this).field_Lb = new le(0L, (le) null);
            ((pb) this).a(false, ((pb) this).field_Lb);
            ((pb) this).field_Pb = new le(0L, param3);
            ((pb) this).field_Nb = new le(0L, param3);
            ((pb) this).field_Nb.field_B = true;
            var10 = ((pb) this).field_Pb;
            var11 = var10;
            var11.field_B = true;
            ((pb) this).field_Lb.a(false, ((pb) this).field_Pb);
            ((pb) this).field_Lb.a(false, ((pb) this).field_Nb);
            ((pb) this).field_Mb = new le(0L, param4);
            ((pb) this).field_Mb.field_Db = true;
            ((pb) this).field_Lb.a(false, ((pb) this).field_Mb);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var8;
            stackOut_6_1 = new StringBuilder().append("pb.<init>(").append(param0).append(',');
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
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param4 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param5 + ')');
        }
    }

    final int b(int param0, boolean param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var5 = 0;
          var7 = 127 % ((46 - param2) / 53);
          var6 = ((pb) this).field_Lb.field_qb + -((pb) this).field_Mb.field_qb;
          if (var6 > 0) {
            var8 = ((pb) this).field_Mb.field_tb;
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
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int var15 = 0;
        le var16 = null;
        le var17 = null;
        le var18 = null;
        le var19 = null;
        le var20 = null;
        le var21 = null;
        le stackIn_12_0 = null;
        le stackIn_12_1 = null;
        le stackIn_12_2 = null;
        le stackIn_13_0 = null;
        le stackIn_13_1 = null;
        le stackIn_13_2 = null;
        le stackIn_14_0 = null;
        le stackIn_14_1 = null;
        le stackIn_14_2 = null;
        int stackIn_14_3 = 0;
        le stackIn_20_0 = null;
        le stackIn_20_1 = null;
        le stackIn_20_2 = null;
        le stackIn_21_0 = null;
        le stackIn_21_1 = null;
        le stackIn_21_2 = null;
        le stackIn_22_0 = null;
        le stackIn_22_1 = null;
        le stackIn_22_2 = null;
        int stackIn_22_3 = 0;
        le stackOut_11_0 = null;
        le stackOut_11_1 = null;
        le stackOut_11_2 = null;
        le stackOut_13_0 = null;
        le stackOut_13_1 = null;
        le stackOut_13_2 = null;
        int stackOut_13_3 = 0;
        le stackOut_12_0 = null;
        le stackOut_12_1 = null;
        le stackOut_12_2 = null;
        int stackOut_12_3 = 0;
        le stackOut_19_0 = null;
        le stackOut_19_1 = null;
        le stackOut_19_2 = null;
        le stackOut_21_0 = null;
        le stackOut_21_1 = null;
        le stackOut_21_2 = null;
        int stackOut_21_3 = 0;
        le stackOut_20_0 = null;
        le stackOut_20_1 = null;
        le stackOut_20_2 = null;
        int stackOut_20_3 = 0;
        L0: {
          var15 = HostileSpawn.field_I ? 1 : 0;
          if (((pb) this).field_qb * 2 > ((pb) this).field_sb) {
            var6 = ((pb) this).field_sb / 2;
            var5 = ((pb) this).field_sb / 2;
            break L0;
          } else {
            var5 = ((pb) this).field_qb;
            var6 = ((pb) this).field_sb + -((pb) this).field_qb;
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
              if (((pb) this).field_qb > var8) {
                var8 = ((pb) this).field_qb;
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
                if (var9 > 0) {
                  var11 = (var9 / 2 + param0 * var10) / var9;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                var12 = var8 / 2 + var11;
                var16 = ((pb) this).field_Jb;
                var14 = 48;
                var16.field_qb = ((pb) this).field_qb;
                var16.field_zb = 0;
                var16.field_tb = 0;
                var16.field_sb = var5;
                var17 = ((pb) this).field_Fb;
                var17.field_sb = ((pb) this).field_sb + -var6;
                var17.field_qb = ((pb) this).field_qb;
                var17.field_tb = 0;
                var17.field_zb = var6;
                var18 = ((pb) this).field_Lb;
                var18.field_qb = ((pb) this).field_qb;
                var18.field_sb = var7;
                var18.field_zb = var5;
                var18.field_tb = 0;
                var19 = ((pb) this).field_Pb;
                var19.field_qb = ((pb) this).field_qb;
                var19.field_zb = 0;
                var19.field_tb = 0;
                var19.field_sb = var12;
                var20 = ((pb) this).field_Nb;
                var20.field_zb = var12;
                var20.field_sb = var7 - var12;
                var20.field_tb = 0;
                var20.field_qb = ((pb) this).field_qb;
                var21 = ((pb) this).field_Mb;
                var21.field_zb = var11;
                stackOut_11_0 = ((pb) this).field_Jb;
                stackOut_11_1 = ((pb) this).field_Fb;
                stackOut_11_2 = ((pb) this).field_Lb;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_13_2 = stackOut_11_2;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                stackIn_12_2 = stackOut_11_2;
                if (param1 <= param3) {
                  stackOut_13_0 = (le) (Object) stackIn_13_0;
                  stackOut_13_1 = (le) (Object) stackIn_13_1;
                  stackOut_13_2 = (le) (Object) stackIn_13_2;
                  stackOut_13_3 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  stackIn_14_3 = stackOut_13_3;
                  break L4;
                } else {
                  stackOut_12_0 = (le) (Object) stackIn_12_0;
                  stackOut_12_1 = (le) (Object) stackIn_12_1;
                  stackOut_12_2 = (le) (Object) stackIn_12_2;
                  stackOut_12_3 = 1;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  stackIn_14_3 = stackOut_12_3;
                  break L4;
                }
              }
              stackIn_14_2.field_jb = stackIn_14_3 != 0;
              stackIn_14_1.field_jb = stackIn_14_3 != 0;
              stackIn_14_0.field_jb = stackIn_14_3 != 0;
              var21.field_qb = ((pb) this).field_qb;
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
          if (var9 > 0) {
            var11 = (var9 / 2 + param0 * var10) / var9;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          var12 = var8 / 2 + var11;
          var16 = ((pb) this).field_Jb;
          var14 = 48;
          var16.field_qb = ((pb) this).field_qb;
          var16.field_zb = 0;
          var16.field_tb = 0;
          var16.field_sb = var5;
          var17 = ((pb) this).field_Fb;
          var17.field_sb = ((pb) this).field_sb + -var6;
          var17.field_qb = ((pb) this).field_qb;
          var17.field_tb = 0;
          var17.field_zb = var6;
          var18 = ((pb) this).field_Lb;
          var18.field_qb = ((pb) this).field_qb;
          var18.field_sb = var7;
          var18.field_zb = var5;
          var18.field_tb = 0;
          var19 = ((pb) this).field_Pb;
          var19.field_qb = ((pb) this).field_qb;
          var19.field_zb = 0;
          var19.field_tb = 0;
          var19.field_sb = var12;
          var20 = ((pb) this).field_Nb;
          var20.field_zb = var12;
          var20.field_sb = var7 - var12;
          var20.field_tb = 0;
          var20.field_qb = ((pb) this).field_qb;
          var21 = ((pb) this).field_Mb;
          var21.field_zb = var11;
          stackOut_19_0 = ((pb) this).field_Jb;
          stackOut_19_1 = ((pb) this).field_Fb;
          stackOut_19_2 = ((pb) this).field_Lb;
          stackIn_21_0 = stackOut_19_0;
          stackIn_21_1 = stackOut_19_1;
          stackIn_21_2 = stackOut_19_2;
          stackIn_20_0 = stackOut_19_0;
          stackIn_20_1 = stackOut_19_1;
          stackIn_20_2 = stackOut_19_2;
          if (param1 <= param3) {
            stackOut_21_0 = (le) (Object) stackIn_21_0;
            stackOut_21_1 = (le) (Object) stackIn_21_1;
            stackOut_21_2 = (le) (Object) stackIn_21_2;
            stackOut_21_3 = 0;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            stackIn_22_2 = stackOut_21_2;
            stackIn_22_3 = stackOut_21_3;
            break L6;
          } else {
            stackOut_20_0 = (le) (Object) stackIn_20_0;
            stackOut_20_1 = (le) (Object) stackIn_20_1;
            stackOut_20_2 = (le) (Object) stackIn_20_2;
            stackOut_20_3 = 1;
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_22_2 = stackOut_20_2;
            stackIn_22_3 = stackOut_20_3;
            break L6;
          }
        }
        stackIn_22_2.field_jb = stackIn_22_3 != 0;
        stackIn_22_1.field_jb = stackIn_22_3 != 0;
        stackIn_22_0.field_jb = stackIn_22_3 != 0;
        var21.field_qb = ((pb) this).field_qb;
        var21.field_tb = 0;
        var21.field_sb = var8;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Ob = nf.a(false);
        field_Hb = 0;
    }
}
