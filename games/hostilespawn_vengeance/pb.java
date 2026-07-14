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
          if ((((pb) this).field_Pb.field_W ^ -1) != param0) {
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
        return (((pb) this).field_Mb.field_W ^ -1) != -1 ? true : false;
    }

    pb(long param0, pb param1, boolean param2) {
        this(param0, param1.field_Jb, param1.field_Fb, param1.field_Pb, param1.field_Mb, param2);
    }

    final boolean g(int param0) {
        if (0 == ((pb) this).field_Fb.field_Q) {
          if (param0 > 118) {
            if (((pb) this).field_Fb.field_W != -1) {
              if (0 >= ((pb) this).field_Ib) {
                if (-1 != (((pb) this).field_Ib ^ -1)) {
                  return false;
                } else {
                  ((pb) this).field_Ib = 3;
                  return true;
                }
              } else {
                ((pb) this).field_Ib = ((pb) this).field_Ib - 1;
                if (-1 != ((pb) this).field_Ib) {
                  return false;
                } else {
                  ((pb) this).field_Ib = 3;
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
          ((pb) this).field_Ib = 20;
          return true;
        }
    }

    final static boolean a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = HostileSpawn.field_I ? 1 : 0;
        var2 = param1.charAt(0);
        var3 = 1;
        L0: while (true) {
          if (param1.length() <= var3) {
            if (param0 != 17032) {
              return true;
            } else {
              return true;
            }
          } else {
            if (param1.charAt(var3) == var2) {
              var3++;
              continue L0;
            } else {
              return false;
            }
          }
        }
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
          this.a(param2, param0, param1, true);
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
              if ((((pb) this).field_Ib ^ -1) >= -1) {
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
                if (-1 > (((pb) this).field_Ib ^ -1)) {
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
                if (-1 > (((pb) this).field_Ib ^ -1)) {
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
        Object var3 = null;
        vb var3_ref = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        CharSequence var9 = null;
        var3 = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        if (kj.field_g != null) {
          if (param0 != null) {
            if (param0.length() != 0) {
              if (param1 < -107) {
                var8 = (CharSequence) (Object) param0;
                var2 = mf.a(false, var8);
                if (var2 != null) {
                  var3_ref = (vb) (Object) kj.field_g.a((long)var2.hashCode(), -30828);
                  L0: while (true) {
                    if (var3_ref != null) {
                      var9 = (CharSequence) (Object) var3_ref.field_Ib;
                      var4 = mf.a(false, var9);
                      if (!var4.equals((Object) (Object) var2)) {
                        var3_ref = (vb) (Object) kj.field_g.a(-118);
                        continue L0;
                      } else {
                        return var3_ref;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  return null;
                }
              } else {
                field_Kb = 14;
                var6 = (CharSequence) (Object) param0;
                var2 = mf.a(false, var6);
                if (var2 != null) {
                  var3_ref = (vb) (Object) kj.field_g.a((long)var2.hashCode(), -30828);
                  L1: while (true) {
                    if (var3_ref != null) {
                      var7 = (CharSequence) (Object) var3_ref.field_Ib;
                      var4 = mf.a(false, var7);
                      if (!var4.equals((Object) (Object) var2)) {
                        var3_ref = (vb) (Object) kj.field_g.a(-118);
                        continue L1;
                      } else {
                        return var3_ref;
                      }
                    } else {
                      return null;
                    }
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
    }

    private final void a(int param0, int param1, int param2, boolean param3) {
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
        le stackIn_10_0 = null;
        le stackIn_10_1 = null;
        le stackIn_10_2 = null;
        le stackIn_11_0 = null;
        le stackIn_11_1 = null;
        le stackIn_11_2 = null;
        le stackIn_12_0 = null;
        le stackIn_12_1 = null;
        le stackIn_12_2 = null;
        int stackIn_12_3 = 0;
        le stackIn_23_0 = null;
        le stackIn_23_1 = null;
        le stackIn_23_2 = null;
        le stackIn_24_0 = null;
        le stackIn_24_1 = null;
        le stackIn_24_2 = null;
        le stackIn_25_0 = null;
        le stackIn_25_1 = null;
        le stackIn_25_2 = null;
        int stackIn_25_3 = 0;
        le stackIn_32_0 = null;
        le stackIn_32_1 = null;
        le stackIn_32_2 = null;
        le stackIn_33_0 = null;
        le stackIn_33_1 = null;
        le stackIn_33_2 = null;
        le stackIn_34_0 = null;
        le stackIn_34_1 = null;
        le stackIn_34_2 = null;
        int stackIn_34_3 = 0;
        le stackOut_31_0 = null;
        le stackOut_31_1 = null;
        le stackOut_31_2 = null;
        le stackOut_33_0 = null;
        le stackOut_33_1 = null;
        le stackOut_33_2 = null;
        int stackOut_33_3 = 0;
        le stackOut_32_0 = null;
        le stackOut_32_1 = null;
        le stackOut_32_2 = null;
        int stackOut_32_3 = 0;
        le stackOut_22_0 = null;
        le stackOut_22_1 = null;
        le stackOut_22_2 = null;
        le stackOut_24_0 = null;
        le stackOut_24_1 = null;
        le stackOut_24_2 = null;
        int stackOut_24_3 = 0;
        le stackOut_23_0 = null;
        le stackOut_23_1 = null;
        le stackOut_23_2 = null;
        int stackOut_23_3 = 0;
        le stackOut_9_0 = null;
        le stackOut_9_1 = null;
        le stackOut_9_2 = null;
        le stackOut_11_0 = null;
        le stackOut_11_1 = null;
        le stackOut_11_2 = null;
        int stackOut_11_3 = 0;
        le stackOut_10_0 = null;
        le stackOut_10_1 = null;
        le stackOut_10_2 = null;
        int stackOut_10_3 = 0;
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
              if ((var9 ^ -1) < -1) {
                var11 = (var9 / 2 + var10 * param0) / var9;
                break L2;
              } else {
                break L2;
              }
            }
            var12 = var11 - -(var8 / 2);
            var15 = ((pb) this).field_Jb;
            var15.field_sb = ((pb) this).field_sb;
            var15.field_qb = var5;
            var15.field_zb = 0;
            var15.field_tb = 0;
            var16 = ((pb) this).field_Fb;
            var16.field_zb = 0;
            var16.field_tb = var6;
            if (param3) {
              L3: {
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
                stackOut_31_0 = ((pb) this).field_Jb;
                stackOut_31_1 = ((pb) this).field_Fb;
                stackOut_31_2 = ((pb) this).field_Lb;
                stackIn_33_0 = stackOut_31_0;
                stackIn_33_1 = stackOut_31_1;
                stackIn_33_2 = stackOut_31_2;
                stackIn_32_0 = stackOut_31_0;
                stackIn_32_1 = stackOut_31_1;
                stackIn_32_2 = stackOut_31_2;
                if (param2 <= param1) {
                  stackOut_33_0 = (le) (Object) stackIn_33_0;
                  stackOut_33_1 = (le) (Object) stackIn_33_1;
                  stackOut_33_2 = (le) (Object) stackIn_33_2;
                  stackOut_33_3 = 0;
                  stackIn_34_0 = stackOut_33_0;
                  stackIn_34_1 = stackOut_33_1;
                  stackIn_34_2 = stackOut_33_2;
                  stackIn_34_3 = stackOut_33_3;
                  break L3;
                } else {
                  stackOut_32_0 = (le) (Object) stackIn_32_0;
                  stackOut_32_1 = (le) (Object) stackIn_32_1;
                  stackOut_32_2 = (le) (Object) stackIn_32_2;
                  stackOut_32_3 = 1;
                  stackIn_34_0 = stackOut_32_0;
                  stackIn_34_1 = stackOut_32_1;
                  stackIn_34_2 = stackOut_32_2;
                  stackIn_34_3 = stackOut_32_3;
                  break L3;
                }
              }
              stackIn_34_2.field_jb = stackIn_34_3 != 0;
              stackIn_34_1.field_jb = stackIn_34_3 != 0;
              stackIn_34_0.field_jb = stackIn_34_3 != 0;
              var20.field_zb = 0;
              var20.field_qb = var8;
              var20.field_sb = ((pb) this).field_sb;
              return;
            } else {
              return;
            }
          } else {
            L4: {
              var9 = param2 + -param1;
              var10 = -var8 + var7;
              var11 = 0;
              if ((var9 ^ -1) < -1) {
                var11 = (var9 / 2 + var10 * param0) / var9;
                break L4;
              } else {
                break L4;
              }
            }
            var12 = var11 - -(var8 / 2);
            var15 = ((pb) this).field_Jb;
            var15.field_sb = ((pb) this).field_sb;
            var15.field_qb = var5;
            var15.field_zb = 0;
            var15.field_tb = 0;
            var16 = ((pb) this).field_Fb;
            var16.field_zb = 0;
            var16.field_tb = var6;
            if (param3) {
              L5: {
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
                stackOut_22_0 = ((pb) this).field_Jb;
                stackOut_22_1 = ((pb) this).field_Fb;
                stackOut_22_2 = ((pb) this).field_Lb;
                stackIn_24_0 = stackOut_22_0;
                stackIn_24_1 = stackOut_22_1;
                stackIn_24_2 = stackOut_22_2;
                stackIn_23_0 = stackOut_22_0;
                stackIn_23_1 = stackOut_22_1;
                stackIn_23_2 = stackOut_22_2;
                if (param2 <= param1) {
                  stackOut_24_0 = (le) (Object) stackIn_24_0;
                  stackOut_24_1 = (le) (Object) stackIn_24_1;
                  stackOut_24_2 = (le) (Object) stackIn_24_2;
                  stackOut_24_3 = 0;
                  stackIn_25_0 = stackOut_24_0;
                  stackIn_25_1 = stackOut_24_1;
                  stackIn_25_2 = stackOut_24_2;
                  stackIn_25_3 = stackOut_24_3;
                  break L5;
                } else {
                  stackOut_23_0 = (le) (Object) stackIn_23_0;
                  stackOut_23_1 = (le) (Object) stackIn_23_1;
                  stackOut_23_2 = (le) (Object) stackIn_23_2;
                  stackOut_23_3 = 1;
                  stackIn_25_0 = stackOut_23_0;
                  stackIn_25_1 = stackOut_23_1;
                  stackIn_25_2 = stackOut_23_2;
                  stackIn_25_3 = stackOut_23_3;
                  break L5;
                }
              }
              stackIn_25_2.field_jb = stackIn_25_3 != 0;
              stackIn_25_1.field_jb = stackIn_25_3 != 0;
              stackIn_25_0.field_jb = stackIn_25_3 != 0;
              var20.field_zb = 0;
              var20.field_qb = var8;
              var20.field_sb = ((pb) this).field_sb;
              return;
            } else {
              return;
            }
          }
        } else {
          L6: {
            var7 = 0;
            var9 = param2 + -param1;
            var10 = -var8 + var7;
            var11 = 0;
            if ((var9 ^ -1) < -1) {
              var11 = (var9 / 2 + var10 * param0) / var9;
              break L6;
            } else {
              break L6;
            }
          }
          var12 = var11 - -(var8 / 2);
          var15 = ((pb) this).field_Jb;
          var15.field_sb = ((pb) this).field_sb;
          var15.field_qb = var5;
          var15.field_zb = 0;
          var15.field_tb = 0;
          var16 = ((pb) this).field_Fb;
          var16.field_zb = 0;
          var16.field_tb = var6;
          if (param3) {
            L7: {
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
              stackOut_9_0 = ((pb) this).field_Jb;
              stackOut_9_1 = ((pb) this).field_Fb;
              stackOut_9_2 = ((pb) this).field_Lb;
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              if (param2 <= param1) {
                stackOut_11_0 = (le) (Object) stackIn_11_0;
                stackOut_11_1 = (le) (Object) stackIn_11_1;
                stackOut_11_2 = (le) (Object) stackIn_11_2;
                stackOut_11_3 = 0;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                stackIn_12_2 = stackOut_11_2;
                stackIn_12_3 = stackOut_11_3;
                break L7;
              } else {
                stackOut_10_0 = (le) (Object) stackIn_10_0;
                stackOut_10_1 = (le) (Object) stackIn_10_1;
                stackOut_10_2 = (le) (Object) stackIn_10_2;
                stackOut_10_3 = 1;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_12_2 = stackOut_10_2;
                stackIn_12_3 = stackOut_10_3;
                break L7;
              }
            }
            stackIn_12_2.field_jb = stackIn_12_3 != 0;
            stackIn_12_1.field_jb = stackIn_12_3 != 0;
            stackIn_12_0.field_jb = stackIn_12_3 != 0;
            var20.field_zb = 0;
            var20.field_qb = var8;
            var20.field_sb = ((pb) this).field_sb;
            return;
          } else {
            return;
          }
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
            if (-1 >= (var5 ^ -1)) {
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
        ((pb) this).field_Gb = param5 ? true : false;
        ((pb) this).field_Jb = new le(0L, param1);
        ((pb) this).field_Fb = new le(0L, param2);
        ((pb) this).a(false, ((pb) this).field_Jb);
        ((pb) this).a(false, ((pb) this).field_Fb);
        ((pb) this).field_Lb = new le(0L, (le) null);
        ((pb) this).a(false, ((pb) this).field_Lb);
        ((pb) this).field_Pb = new le(0L, param3);
        ((pb) this).field_Nb = new le(0L, param3);
        ((pb) this).field_Nb.field_B = true;
        le var10 = ((pb) this).field_Pb;
        le var11 = var10;
        var11.field_B = true;
        ((pb) this).field_Lb.a(false, ((pb) this).field_Pb);
        ((pb) this).field_Lb.a(false, ((pb) this).field_Nb);
        ((pb) this).field_Mb = new le(0L, param4);
        ((pb) this).field_Mb.field_Db = true;
        ((pb) this).field_Lb.a(false, ((pb) this).field_Mb);
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
          if (-1 > (var6 ^ -1)) {
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
                if ((var9 ^ -1) < -1) {
                  var11 = (var9 / 2 + param0 * var10) / var9;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                var12 = var8 / 2 + var11;
                var16 = ((pb) this).field_Jb;
                var14 = 96 / ((64 - param2) / 57);
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
          if ((var9 ^ -1) < -1) {
            var11 = (var9 / 2 + param0 * var10) / var9;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          var12 = var8 / 2 + var11;
          var16 = ((pb) this).field_Jb;
          var14 = 96 / ((64 - param2) / 57);
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
