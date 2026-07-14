/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pjb extends llb {
    private llb field_xb;
    static Object field_vb;
    private llb field_Ab;
    private llb field_yb;
    private llb field_wb;
    private int field_zb;
    private llb field_Bb;
    private llb field_Cb;
    static String field_Db;

    final boolean j(int param0) {
        if (0 != ((pjb) this).field_Cb.field_o) {
          ((pjb) this).field_zb = 20;
          return true;
        } else {
          if (param0 < -2) {
            if (-1 != ((pjb) this).field_Cb.field_C) {
              if (((pjb) this).field_zb >= -1) {
                if (-1 != (((pjb) this).field_zb ^ -1)) {
                  return false;
                } else {
                  ((pjb) this).field_zb = 3;
                  return true;
                }
              } else {
                ((pjb) this).field_zb = ((pjb) this).field_zb - 1;
                if (-1 == ((pjb) this).field_zb) {
                  ((pjb) this).field_zb = 3;
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          } else {
            ((pjb) this).field_xb = null;
            if (-1 != (((pjb) this).field_Cb.field_C ^ -1)) {
              if (((pjb) this).field_zb < -1) {
                ((pjb) this).field_zb = ((pjb) this).field_zb - 1;
                if (-1 != ((pjb) this).field_zb) {
                  return false;
                } else {
                  ((pjb) this).field_zb = 3;
                  return true;
                }
              } else {
                if (-1 != ((pjb) this).field_zb) {
                  return false;
                } else {
                  ((pjb) this).field_zb = 3;
                  return true;
                }
              }
            } else {
              return false;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((pjb) this).field_G = param5;
        ((pjb) this).field_L = param0;
        ((pjb) this).field_hb = param6;
        ((pjb) this).field_K = param2;
        ((pjb) this).a(param1, param3, (byte) 88, param4);
        if (param7 != -1) {
            Object var10 = null;
            pjb.a((faa) null, (tv[]) null, -91, 37, (Class[]) null, 13);
        }
    }

    final static void a(faa param0, tv[] param1, int param2, int param3, Class[] param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        tv[] var8 = null;
        int var9 = 0;
        tv var10 = null;
        int var11 = 0;
        int var12 = 0;
        int stackIn_3_0 = 0;
        faa stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        faa stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        faa stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        faa stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        faa stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        faa stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        L0: {
          var12 = VoidHunters.field_G;
          if (param1 != null) {
            stackOut_2_0 = param1.length;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var6 = stackIn_3_0;
        param0.a(-632, var6, param2);
        if (var6 == 0) {
          L1: {
            if (param5 >= 117) {
              break L1;
            } else {
              field_vb = null;
              break L1;
            }
          }
          return;
        } else {
          var7 = iia.a(-98, -1 + param4.length);
          var8 = param1;
          var9 = 0;
          L2: while (true) {
            L3: {
              if (var8.length <= var9) {
                break L3;
              } else {
                L4: {
                  var10 = var8[var9];
                  stackOut_6_0 = (faa) param0;
                  stackOut_6_1 = 114;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  if (var10 == null) {
                    stackOut_8_0 = (faa) (Object) stackIn_8_0;
                    stackOut_8_1 = stackIn_8_1;
                    stackOut_8_2 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    stackIn_9_2 = stackOut_8_2;
                    break L4;
                  } else {
                    stackOut_7_0 = (faa) (Object) stackIn_7_0;
                    stackOut_7_1 = stackIn_7_1;
                    stackOut_7_2 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    stackIn_9_2 = stackOut_7_2;
                    break L4;
                  }
                }
                if (vq.a(stackIn_9_0, stackIn_9_1, stackIn_9_2 != 0)) {
                  var11 = 0;
                  L5: while (true) {
                    L6: {
                      if (param4.length <= var11) {
                        stb.a(2, param3, param0, var10);
                        var9++;
                        break L6;
                      } else {
                        if (param4[var11] == ((Object) (Object) var10).getClass()) {
                          param0.a(-632, var11, var7);
                          stb.a(2, param3, param0, var10);
                          break L6;
                        } else {
                          var11++;
                          continue L5;
                        }
                      }
                    }
                    var9++;
                    var9++;
                    break L3;
                  }
                } else {
                  var9++;
                  continue L2;
                }
              }
            }
            L7: {
              if (param5 >= 117) {
                break L7;
              } else {
                field_vb = null;
                break L7;
              }
            }
            return;
          }
        }
    }

    final int a(int param0, int param1, byte param2, boolean param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var5 = 50 % ((24 - param2) / 41);
          var6 = 0;
          var7 = ((pjb) this).field_yb.field_G - ((pjb) this).field_Bb.field_G;
          if (0 >= var7) {
            break L0;
          } else {
            var8 = ((pjb) this).field_Bb.field_K;
            var9 = param0 - param1;
            var6 = (var9 * var8 + var7 / 2) / var7;
            break L0;
          }
        }
        if (param3) {
          L1: {
            if (0 > var6) {
              var6 = 0;
              break L1;
            } else {
              break L1;
            }
          }
          if (-param1 + param0 >= var6) {
            return var6;
          } else {
            var6 = -param1 + param0;
            return var6;
          }
        } else {
          L2: {
            if (param0 + -param1 < var6) {
              var6 = param0 - param1;
              break L2;
            } else {
              break L2;
            }
          }
          if (0 > var6) {
            var6 = 0;
            return var6;
          } else {
            return var6;
          }
        }
    }

    public static void e(byte param0) {
        Object var2 = null;
        field_vb = null;
        if (param0 != 22) {
          var2 = null;
          pjb.a((faa) null, (tv[]) null, 92, 41, (Class[]) null, -34);
          field_Db = null;
          return;
        } else {
          field_Db = null;
          return;
        }
    }

    final static jk a(long param0, boolean param1) {
        if (!param1) {
            return null;
        }
        return (jk) (Object) icb.field_p.a(-1, param0);
    }

    final boolean i(int param0) {
        if (((pjb) this).field_Ab.field_o == 0) {
          if (param0 == 20) {
            if (((pjb) this).field_Ab.field_C != -1) {
              L0: {
                if (-1 < ((pjb) this).field_zb) {
                  ((pjb) this).field_zb = ((pjb) this).field_zb - 1;
                  break L0;
                } else {
                  break L0;
                }
              }
              if (0 == ((pjb) this).field_zb) {
                if (((pjb) this).field_Bb.field_db + ((pjb) this).field_Bb.field_u <= uia.field_b) {
                  return false;
                } else {
                  ((pjb) this).field_zb = 3;
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            boolean discarded$6 = ((pjb) this).a(false);
            if (((pjb) this).field_Ab.field_C != -1) {
              L1: {
                if (-1 < ((pjb) this).field_zb) {
                  ((pjb) this).field_zb = ((pjb) this).field_zb - 1;
                  break L1;
                } else {
                  break L1;
                }
              }
              if (0 == ((pjb) this).field_zb) {
                if (((pjb) this).field_Bb.field_db + ((pjb) this).field_Bb.field_u <= uia.field_b) {
                  return false;
                } else {
                  ((pjb) this).field_zb = 3;
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          }
        } else {
          ((pjb) this).field_zb = 20;
          return true;
        }
    }

    pjb(long param0, pjb param1) {
        this(param0, param1.field_wb, param1.field_Cb, param1.field_Ab, param1.field_Bb);
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        llb var15 = null;
        llb var16 = null;
        llb var17 = null;
        llb var18 = null;
        llb var19 = null;
        llb var20 = null;
        llb stackIn_12_0 = null;
        llb stackIn_12_1 = null;
        llb stackIn_12_2 = null;
        llb stackIn_13_0 = null;
        llb stackIn_13_1 = null;
        llb stackIn_13_2 = null;
        llb stackIn_14_0 = null;
        llb stackIn_14_1 = null;
        llb stackIn_14_2 = null;
        int stackIn_14_3 = 0;
        llb stackIn_18_0 = null;
        llb stackIn_18_1 = null;
        llb stackIn_18_2 = null;
        llb stackIn_19_0 = null;
        llb stackIn_19_1 = null;
        llb stackIn_19_2 = null;
        llb stackIn_20_0 = null;
        llb stackIn_20_1 = null;
        llb stackIn_20_2 = null;
        int stackIn_20_3 = 0;
        llb stackOut_17_0 = null;
        llb stackOut_17_1 = null;
        llb stackOut_17_2 = null;
        llb stackOut_19_0 = null;
        llb stackOut_19_1 = null;
        llb stackOut_19_2 = null;
        int stackOut_19_3 = 0;
        llb stackOut_18_0 = null;
        llb stackOut_18_1 = null;
        llb stackOut_18_2 = null;
        int stackOut_18_3 = 0;
        llb stackOut_11_0 = null;
        llb stackOut_11_1 = null;
        llb stackOut_11_2 = null;
        llb stackOut_13_0 = null;
        llb stackOut_13_1 = null;
        llb stackOut_13_2 = null;
        int stackOut_13_3 = 0;
        llb stackOut_12_0 = null;
        llb stackOut_12_1 = null;
        llb stackOut_12_2 = null;
        int stackOut_12_3 = 0;
        L0: {
          if (((pjb) this).field_G >= ((pjb) this).field_hb * 2) {
            var6 = -((pjb) this).field_hb + ((pjb) this).field_G;
            var5 = ((pjb) this).field_hb;
            break L0;
          } else {
            var6 = ((pjb) this).field_G / 2;
            var5 = ((pjb) this).field_G / 2;
            break L0;
          }
        }
        var7 = -var5 + var6;
        var8 = var7;
        if ((param0 ^ -1) >= -1) {
          L1: {
            var9 = param0 - param3;
            var10 = var7 - var8;
            var11 = 0;
            if ((var9 ^ -1) >= -1) {
              break L1;
            } else {
              var11 = (var10 * param1 + var9 / 2) / var9;
              break L1;
            }
          }
          L2: {
            var12 = var11 - -(var8 / 2);
            var15 = ((pjb) this).field_wb;
            var15.field_G = var5;
            var15.field_hb = ((pjb) this).field_hb;
            var15.field_L = 0;
            var15.field_K = 0;
            var16 = ((pjb) this).field_Cb;
            var16.field_L = 0;
            var16.field_G = ((pjb) this).field_G - var6;
            var16.field_K = var6;
            var16.field_hb = ((pjb) this).field_hb;
            var14 = 60 / ((-68 - param2) / 40);
            var17 = ((pjb) this).field_yb;
            var17.field_K = var5;
            var17.field_G = var7;
            var17.field_L = 0;
            var17.field_hb = ((pjb) this).field_hb;
            var18 = ((pjb) this).field_Ab;
            var18.field_hb = ((pjb) this).field_hb;
            var18.field_L = 0;
            var18.field_G = var12;
            var18.field_K = 0;
            var19 = ((pjb) this).field_xb;
            var19.field_hb = ((pjb) this).field_hb;
            var19.field_L = 0;
            var19.field_K = var12;
            var19.field_G = -var12 + var7;
            var20 = ((pjb) this).field_Bb;
            var20.field_G = var8;
            stackOut_17_0 = ((pjb) this).field_wb;
            stackOut_17_1 = ((pjb) this).field_Cb;
            stackOut_17_2 = ((pjb) this).field_yb;
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_19_2 = stackOut_17_2;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            stackIn_18_2 = stackOut_17_2;
            if (param3 >= param0) {
              stackOut_19_0 = (llb) (Object) stackIn_19_0;
              stackOut_19_1 = (llb) (Object) stackIn_19_1;
              stackOut_19_2 = (llb) (Object) stackIn_19_2;
              stackOut_19_3 = 0;
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              stackIn_20_3 = stackOut_19_3;
              break L2;
            } else {
              stackOut_18_0 = (llb) (Object) stackIn_18_0;
              stackOut_18_1 = (llb) (Object) stackIn_18_1;
              stackOut_18_2 = (llb) (Object) stackIn_18_2;
              stackOut_18_3 = 1;
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              stackIn_20_3 = stackOut_18_3;
              break L2;
            }
          }
          stackIn_20_2.field_y = stackIn_20_3 != 0;
          stackIn_20_1.field_y = stackIn_20_3 != 0;
          stackIn_20_0.field_y = stackIn_20_3 != 0;
          var20.field_L = 0;
          var20.field_hb = ((pjb) this).field_hb;
          var20.field_K = var11;
          return;
        } else {
          L3: {
            var8 = var8 * param3 / param0;
            if (((pjb) this).field_hb > var8) {
              var8 = ((pjb) this).field_hb;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (var7 >= var8) {
              break L4;
            } else {
              var8 = var7;
              break L4;
            }
          }
          L5: {
            var9 = param0 - param3;
            var10 = var7 - var8;
            var11 = 0;
            if ((var9 ^ -1) >= -1) {
              break L5;
            } else {
              var11 = (var10 * param1 + var9 / 2) / var9;
              break L5;
            }
          }
          L6: {
            var12 = var11 - -(var8 / 2);
            var15 = ((pjb) this).field_wb;
            var15.field_G = var5;
            var15.field_hb = ((pjb) this).field_hb;
            var15.field_L = 0;
            var15.field_K = 0;
            var16 = ((pjb) this).field_Cb;
            var16.field_L = 0;
            var16.field_G = ((pjb) this).field_G - var6;
            var16.field_K = var6;
            var16.field_hb = ((pjb) this).field_hb;
            var14 = 60 / ((-68 - param2) / 40);
            var17 = ((pjb) this).field_yb;
            var17.field_K = var5;
            var17.field_G = var7;
            var17.field_L = 0;
            var17.field_hb = ((pjb) this).field_hb;
            var18 = ((pjb) this).field_Ab;
            var18.field_hb = ((pjb) this).field_hb;
            var18.field_L = 0;
            var18.field_G = var12;
            var18.field_K = 0;
            var19 = ((pjb) this).field_xb;
            var19.field_hb = ((pjb) this).field_hb;
            var19.field_L = 0;
            var19.field_K = var12;
            var19.field_G = -var12 + var7;
            var20 = ((pjb) this).field_Bb;
            var20.field_G = var8;
            stackOut_11_0 = ((pjb) this).field_wb;
            stackOut_11_1 = ((pjb) this).field_Cb;
            stackOut_11_2 = ((pjb) this).field_yb;
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_13_2 = stackOut_11_2;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            stackIn_12_2 = stackOut_11_2;
            if (param3 >= param0) {
              stackOut_13_0 = (llb) (Object) stackIn_13_0;
              stackOut_13_1 = (llb) (Object) stackIn_13_1;
              stackOut_13_2 = (llb) (Object) stackIn_13_2;
              stackOut_13_3 = 0;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              stackIn_14_3 = stackOut_13_3;
              break L6;
            } else {
              stackOut_12_0 = (llb) (Object) stackIn_12_0;
              stackOut_12_1 = (llb) (Object) stackIn_12_1;
              stackOut_12_2 = (llb) (Object) stackIn_12_2;
              stackOut_12_3 = 1;
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              stackIn_14_3 = stackOut_12_3;
              break L6;
            }
          }
          stackIn_14_2.field_y = stackIn_14_3 != 0;
          stackIn_14_1.field_y = stackIn_14_3 != 0;
          stackIn_14_0.field_y = stackIn_14_3 != 0;
          var20.field_L = 0;
          var20.field_hb = ((pjb) this).field_hb;
          var20.field_K = var11;
          return;
        }
    }

    final boolean a(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (!param0) {
          L0: {
            ((pjb) this).field_yb = null;
            if (0 == ((pjb) this).field_Bb.field_C) {
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
            if (0 == ((pjb) this).field_Bb.field_C) {
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

    final boolean b(boolean param0) {
        if (((pjb) this).field_xb.field_o != 0) {
          ((pjb) this).field_zb = 20;
          return true;
        } else {
          if (-1 != ((pjb) this).field_xb.field_C) {
            L0: {
              if (-1 < ((pjb) this).field_zb) {
                ((pjb) this).field_zb = ((pjb) this).field_zb - 1;
                break L0;
              } else {
                break L0;
              }
            }
            if (((pjb) this).field_zb != 0) {
              if (!param0) {
                ((pjb) this).field_Ab = null;
                return false;
              } else {
                return false;
              }
            } else {
              if (uia.field_b < ((pjb) this).field_Bb.field_E + (((pjb) this).field_Bb.field_u - -((pjb) this).field_Bb.field_db + ((pjb) this).field_Bb.field_G)) {
                if (param0) {
                  return false;
                } else {
                  ((pjb) this).field_Ab = null;
                  return false;
                }
              } else {
                ((pjb) this).field_zb = 3;
                return true;
              }
            }
          } else {
            if (param0) {
              return false;
            } else {
              ((pjb) this).field_Ab = null;
              return false;
            }
          }
        }
    }

    final boolean h(int param0) {
        if (((pjb) this).field_wb.field_o == param0) {
          if (0 != ((pjb) this).field_wb.field_C) {
            if (0 >= ((pjb) this).field_zb) {
              if (-1 != ((pjb) this).field_zb) {
                return false;
              } else {
                ((pjb) this).field_zb = 3;
                return true;
              }
            } else {
              ((pjb) this).field_zb = ((pjb) this).field_zb - 1;
              if (-1 != ((pjb) this).field_zb) {
                return false;
              } else {
                ((pjb) this).field_zb = 3;
                return true;
              }
            }
          } else {
            return false;
          }
        } else {
          ((pjb) this).field_zb = 20;
          return true;
        }
    }

    pjb(long param0, llb param1, llb param2, llb param3, llb param4) {
        super(param0, (llb) null);
        ((pjb) this).field_wb = new llb(0L, param1);
        ((pjb) this).field_Cb = new llb(0L, param2);
        ((pjb) this).b(-561, ((pjb) this).field_wb);
        ((pjb) this).b(-561, ((pjb) this).field_Cb);
        ((pjb) this).field_yb = new llb(0L, (llb) null);
        ((pjb) this).b(-561, ((pjb) this).field_yb);
        ((pjb) this).field_Ab = new llb(0L, param3);
        ((pjb) this).field_xb = new llb(0L, param3);
        ((pjb) this).field_xb.field_S = true;
        llb var9 = ((pjb) this).field_Ab;
        llb var10 = var9;
        var10.field_S = true;
        ((pjb) this).field_yb.b(-561, ((pjb) this).field_Ab);
        ((pjb) this).field_yb.b(-561, ((pjb) this).field_xb);
        ((pjb) this).field_Bb = new llb(0L, param4);
        ((pjb) this).field_Bb.field_Z = true;
        ((pjb) this).field_yb.b(-561, ((pjb) this).field_Bb);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Db = "Next condition/action value 2";
    }
}
