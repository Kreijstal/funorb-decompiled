/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc extends qb {
    private vh field_z;
    ug field_A;
    private int field_p;
    static int[] field_w;
    private int[] field_s;
    private vh field_o;
    private boolean field_n;
    private int field_r;
    static String field_u;
    private int[] field_y;
    private vh field_x;
    private boolean field_q;
    private ug field_C;
    static int[] field_m;
    ug field_B;
    private int field_t;
    private int field_v;

    public static void a(byte param0) {
        field_m = null;
        if (param0 >= -12) {
            return;
        }
        field_w = null;
        field_u = null;
    }

    private final void a(ug param0, int param1, int param2, int param3) {
        param0.a(param1, param3, (byte) -82);
        param0.b(param2, 0);
    }

    final qb c() {
        return null;
    }

    final qb d() {
        return null;
    }

    final void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_33_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_64_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_62_0 = 0;
        var11 = DungeonAssault.field_K;
        if (0 < ((tc) this).field_t) {
          L0: {
            if (((tc) this).field_n) {
              L1: {
                if ((((tc) this).field_p ^ -1) >= -1) {
                  break L1;
                } else {
                  if (!((tc) this).field_A.b((byte) -126)) {
                    ((tc) this).field_o = null;
                    ((tc) this).field_n = false;
                    ((tc) this).field_p = -((tc) this).field_p;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              if ((((tc) this).field_p ^ -1) <= -1) {
                break L0;
              } else {
                if (!((tc) this).field_B.b((byte) -123)) {
                  ((tc) this).field_x = null;
                  ((tc) this).field_p = -((tc) this).field_p;
                  ((tc) this).field_n = false;
                  break L0;
                } else {
                  break L0;
                }
              }
            } else {
              break L0;
            }
          }
          L2: {
            var4 = (((tc) this).field_v >> -1224808404) * ((tc) this).field_t / 256;
            var5 = ((tc) this).field_t - var4;
            if (((tc) this).field_p != -1) {
              ((tc) this).field_v = ((tc) this).field_v + ((tc) this).field_p * param2;
              if (-1048577 > ((tc) this).field_v) {
                if (((tc) this).field_v <= 0) {
                  ((tc) this).field_v = 0;
                  if (((tc) this).field_n) {
                    break L2;
                  } else {
                    ((tc) this).field_p = 0;
                    if (!((tc) this).field_q) {
                      L3: {
                        if (((tc) this).field_o == null) {
                          break L3;
                        } else {
                          ((tc) this).field_A.d(-87);
                          break L3;
                        }
                      }
                      ((tc) this).field_o = null;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                } else {
                  break L2;
                }
              } else {
                ((tc) this).field_v = 1048576;
                if (!((tc) this).field_n) {
                  ((tc) this).field_p = 0;
                  if (!((tc) this).field_q) {
                    L4: {
                      if (null == ((tc) this).field_x) {
                        break L4;
                      } else {
                        ((tc) this).field_B.d(-128);
                        break L4;
                      }
                    }
                    ((tc) this).field_x = null;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
            } else {
              break L2;
            }
          }
          L5: {
            if (vn.field_g) {
              stackOut_32_0 = param2 << 16615361;
              stackIn_33_0 = stackOut_32_0;
              break L5;
            } else {
              stackOut_31_0 = param2;
              stackIn_33_0 = stackOut_31_0;
              break L5;
            }
          }
          L6: {
            var6 = stackIn_33_0;
            if (256 > ((tc) this).field_r) {
              L7: {
                if (((tc) this).field_o != null) {
                  break L7;
                } else {
                  if (null == ((tc) this).field_x) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              if (-257 == (var4 ^ -1)) {
                ((tc) this).field_A.b(param0, param1, param2);
                break L6;
              } else {
                if ((var5 ^ -1) != -257) {
                  L8: {
                    L9: {
                      if (((tc) this).field_s == null) {
                        break L9;
                      } else {
                        if (((tc) this).field_s.length >= var6) {
                          cj.a(((tc) this).field_s, 0, var6);
                          cj.a(((tc) this).field_y, 0, var6);
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    ((tc) this).field_s = new int[var6];
                    ((tc) this).field_y = new int[var6];
                    break L8;
                  }
                  L10: {
                    ((tc) this).field_A.b(((tc) this).field_s, 0, param2);
                    ((tc) this).field_B.b(((tc) this).field_y, 0, param2);
                    if (!vn.field_g) {
                      stackOut_48_0 = param1;
                      stackIn_49_0 = stackOut_48_0;
                      break L10;
                    } else {
                      param1 = param1 << 1;
                      stackOut_47_0 = param1 << 1;
                      stackIn_49_0 = stackOut_47_0;
                      break L10;
                    }
                  }
                  var7 = stackIn_49_0;
                  var8 = 0;
                  L11: while (true) {
                    if (var8 >= var6) {
                      break L6;
                    } else {
                      param0[var8 + var7] = param0[var8 + var7] + (var4 * ((tc) this).field_s[var8] + ((tc) this).field_y[var8] * var5 >> 1050901064);
                      var8++;
                      continue L11;
                    }
                  }
                } else {
                  ((tc) this).field_B.b(param0, param1, param2);
                  break L6;
                }
              }
            } else {
              break L6;
            }
          }
          L12: {
            if (null == ((tc) this).field_z) {
              break L12;
            } else {
              if (((tc) this).field_r != 0) {
                L13: {
                  L14: {
                    if (((tc) this).field_s == null) {
                      break L14;
                    } else {
                      if (((tc) this).field_s.length >= var6) {
                        cj.a(((tc) this).field_s, 0, var6);
                        break L13;
                      } else {
                        break L14;
                      }
                    }
                  }
                  ((tc) this).field_y = new int[var6];
                  ((tc) this).field_s = new int[var6];
                  break L13;
                }
                L15: {
                  ((tc) this).field_C.b(((tc) this).field_s, 0, param2);
                  if (!vn.field_g) {
                    stackOut_63_0 = param1;
                    stackIn_64_0 = stackOut_63_0;
                    break L15;
                  } else {
                    param1 = param1 << 1;
                    stackOut_62_0 = param1 << 1;
                    stackIn_64_0 = stackOut_62_0;
                    break L15;
                  }
                }
                var7 = stackIn_64_0;
                var8 = ((tc) this).field_t * ((tc) this).field_r / 256;
                var9 = ((tc) this).field_t - var8;
                var10 = 0;
                L16: while (true) {
                  if (var10 >= var6) {
                    break L12;
                  } else {
                    param0[var7 - -var10] = var8 * ((tc) this).field_s[var10] + param0[var7 - -var10] * var9 >> 2025300552;
                    var10++;
                    continue L16;
                  }
                }
              } else {
                break L12;
              }
            }
          }
          return;
        } else {
          ((tc) this).a(param2);
          return;
        }
    }

    final synchronized void a(int param0, int param1, int param2, vh param3, int param4, boolean param5) {
        int var7 = 0;
        int var8 = 0;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_27_0 = 0;
        ug stackIn_36_0 = null;
        vh stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        ug stackIn_37_0 = null;
        vh stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        ug stackIn_38_0 = null;
        vh stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        ug stackIn_45_0 = null;
        vh stackIn_45_1 = null;
        int stackIn_45_2 = 0;
        ug stackIn_46_0 = null;
        vh stackIn_46_1 = null;
        int stackIn_46_2 = 0;
        ug stackIn_47_0 = null;
        vh stackIn_47_1 = null;
        int stackIn_47_2 = 0;
        int stackIn_47_3 = 0;
        Object stackOut_15_0 = null;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        ug stackOut_44_0 = null;
        vh stackOut_44_1 = null;
        int stackOut_44_2 = 0;
        ug stackOut_46_0 = null;
        vh stackOut_46_1 = null;
        int stackOut_46_2 = 0;
        int stackOut_46_3 = 0;
        ug stackOut_45_0 = null;
        vh stackOut_45_1 = null;
        int stackOut_45_2 = 0;
        int stackOut_45_3 = 0;
        ug stackOut_35_0 = null;
        vh stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        ug stackOut_37_0 = null;
        vh stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        int stackOut_37_3 = 0;
        ug stackOut_36_0 = null;
        vh stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        L0: {
          var8 = DungeonAssault.field_K;
          if (!((tc) this).field_n) {
            break L0;
          } else {
            if (param5) {
              L1: {
                if (((tc) this).field_p > 0) {
                  L2: {
                    if (null != ((tc) this).field_o) {
                      ((tc) this).field_A.d(-82);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  ((tc) this).field_o = param3;
                  if (param3 == null) {
                    break L1;
                  } else {
                    ((tc) this).field_A.a(param3, param0 ^ 1917, false);
                    this.a(((tc) this).field_A, param4, param1, param0 ^ -22200);
                    break L1;
                  }
                } else {
                  L3: {
                    if (((tc) this).field_x != null) {
                      ((tc) this).field_B.d(-79);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  ((tc) this).field_x = param3;
                  if (param3 == null) {
                    break L1;
                  } else {
                    ((tc) this).field_B.a(param3, param0 ^ 1917, false);
                    this.a(((tc) this).field_B, param4, param1, param0 ^ -22200);
                    break L1;
                  }
                }
              }
              return;
            } else {
              break L0;
            }
          }
        }
        L4: {
          stackOut_15_0 = this;
          stackIn_17_0 = stackOut_15_0;
          stackIn_16_0 = stackOut_15_0;
          if (!param5) {
            stackOut_17_0 = this;
            stackOut_17_1 = 0;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            break L4;
          } else {
            stackOut_16_0 = this;
            stackOut_16_1 = 1;
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            break L4;
          }
        }
        ((tc) this).field_n = stackIn_18_1 != 0;
        if (((tc) this).field_o != param3) {
          if (((tc) this).field_x != param3) {
            L5: {
              if (((tc) this).field_o == null) {
                var7 = 1;
                break L5;
              } else {
                if (((tc) this).field_x == null) {
                  var7 = 0;
                  break L5;
                } else {
                  L6: {
                    if (((tc) this).field_v >= 524288) {
                      stackOut_26_0 = 0;
                      stackIn_27_0 = stackOut_26_0;
                      break L6;
                    } else {
                      stackOut_25_0 = 1;
                      stackIn_27_0 = stackOut_25_0;
                      break L6;
                    }
                  }
                  var7 = stackIn_27_0;
                  break L5;
                }
              }
            }
            L7: {
              if (var7 == 0) {
                L8: {
                  if (((tc) this).field_x != null) {
                    ((tc) this).field_B.d(-83);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  ((tc) this).field_x = param3;
                  if (param3 == null) {
                    break L9;
                  } else {
                    L10: {
                      stackOut_44_0 = ((tc) this).field_B;
                      stackOut_44_1 = (vh) param3;
                      stackOut_44_2 = 20938;
                      stackIn_46_0 = stackOut_44_0;
                      stackIn_46_1 = stackOut_44_1;
                      stackIn_46_2 = stackOut_44_2;
                      stackIn_45_0 = stackOut_44_0;
                      stackIn_45_1 = stackOut_44_1;
                      stackIn_45_2 = stackOut_44_2;
                      if (param5) {
                        stackOut_46_0 = (ug) (Object) stackIn_46_0;
                        stackOut_46_1 = (vh) (Object) stackIn_46_1;
                        stackOut_46_2 = stackIn_46_2;
                        stackOut_46_3 = 0;
                        stackIn_47_0 = stackOut_46_0;
                        stackIn_47_1 = stackOut_46_1;
                        stackIn_47_2 = stackOut_46_2;
                        stackIn_47_3 = stackOut_46_3;
                        break L10;
                      } else {
                        stackOut_45_0 = (ug) (Object) stackIn_45_0;
                        stackOut_45_1 = (vh) (Object) stackIn_45_1;
                        stackOut_45_2 = stackIn_45_2;
                        stackOut_45_3 = 1;
                        stackIn_47_0 = stackOut_45_0;
                        stackIn_47_1 = stackOut_45_1;
                        stackIn_47_2 = stackOut_45_2;
                        stackIn_47_3 = stackOut_45_3;
                        break L10;
                      }
                    }
                    ((ug) (Object) stackIn_47_0).a(stackIn_47_1, stackIn_47_2, stackIn_47_3 != 0);
                    this.a(((tc) this).field_B, param4, param1, -1);
                    break L9;
                  }
                }
                ((tc) this).field_p = -param2;
                break L7;
              } else {
                L11: {
                  if (null == ((tc) this).field_o) {
                    break L11;
                  } else {
                    ((tc) this).field_A.d(-80);
                    break L11;
                  }
                }
                L12: {
                  ((tc) this).field_o = param3;
                  if (param3 != null) {
                    L13: {
                      stackOut_35_0 = ((tc) this).field_A;
                      stackOut_35_1 = (vh) param3;
                      stackOut_35_2 = param0 + -1261;
                      stackIn_37_0 = stackOut_35_0;
                      stackIn_37_1 = stackOut_35_1;
                      stackIn_37_2 = stackOut_35_2;
                      stackIn_36_0 = stackOut_35_0;
                      stackIn_36_1 = stackOut_35_1;
                      stackIn_36_2 = stackOut_35_2;
                      if (param5) {
                        stackOut_37_0 = (ug) (Object) stackIn_37_0;
                        stackOut_37_1 = (vh) (Object) stackIn_37_1;
                        stackOut_37_2 = stackIn_37_2;
                        stackOut_37_3 = 0;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        stackIn_38_2 = stackOut_37_2;
                        stackIn_38_3 = stackOut_37_3;
                        break L13;
                      } else {
                        stackOut_36_0 = (ug) (Object) stackIn_36_0;
                        stackOut_36_1 = (vh) (Object) stackIn_36_1;
                        stackOut_36_2 = stackIn_36_2;
                        stackOut_36_3 = 1;
                        stackIn_38_0 = stackOut_36_0;
                        stackIn_38_1 = stackOut_36_1;
                        stackIn_38_2 = stackOut_36_2;
                        stackIn_38_3 = stackOut_36_3;
                        break L13;
                      }
                    }
                    ((ug) (Object) stackIn_38_0).a(stackIn_38_1, stackIn_38_2, stackIn_38_3 != 0);
                    this.a(((tc) this).field_A, param4, param1, -1);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                ((tc) this).field_p = param2;
                break L7;
              }
            }
            L14: {
              if (param0 == 22199) {
                break L14;
              } else {
                tc.a((byte) -5);
                break L14;
              }
            }
            return;
          } else {
            ((tc) this).field_p = -param2;
            this.a(((tc) this).field_B, param4, param1, -1);
            return;
          }
        } else {
          ((tc) this).field_p = param2;
          this.a(((tc) this).field_A, param4, param1, -1);
          return;
        }
    }

    final synchronized void a(int param0, int param1) {
        if (param1 != 256) {
            qb discarded$0 = ((tc) this).c();
        }
        ((tc) this).field_t = param0;
    }

    private final void a(boolean param0, ug param1, ug param2) {
        ((tc) this).field_B = param2;
        ((tc) this).field_v = 1048576;
        if (!param0) {
            tc.a((byte) 14);
        }
        ((tc) this).field_A = param1;
    }

    final synchronized int a() {
        return 2;
    }

    final synchronized void a(int param0) {
        int var3 = 0;
        L0: {
          var3 = DungeonAssault.field_K;
          if (0 >= ((tc) this).field_v) {
            break L0;
          } else {
            if (((tc) this).field_o == null) {
              break L0;
            } else {
              ((tc) this).field_A.a(param0);
              break L0;
            }
          }
        }
        L1: {
          if (((tc) this).field_v >= 1048576) {
            break L1;
          } else {
            if (null != ((tc) this).field_x) {
              ((tc) this).field_B.a(param0);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (0 >= ((tc) this).field_r) {
            break L2;
          } else {
            if (((tc) this).field_z != null) {
              ((tc) this).field_C.a(param0);
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (!((tc) this).field_n) {
            break L3;
          } else {
            if (0 < ((tc) this).field_p) {
              if (!((tc) this).field_A.b((byte) -127)) {
                ((tc) this).field_o = null;
                ((tc) this).field_n = false;
                ((tc) this).field_p = -((tc) this).field_p;
                break L3;
              } else {
                if (((tc) this).field_p >= 0) {
                  break L3;
                } else {
                  if (((tc) this).field_B.b((byte) -121)) {
                    break L3;
                  } else {
                    ((tc) this).field_x = null;
                    ((tc) this).field_p = -((tc) this).field_p;
                    ((tc) this).field_n = false;
                    break L3;
                  }
                }
              }
            } else {
              if (((tc) this).field_p >= 0) {
                break L3;
              } else {
                if (((tc) this).field_B.b((byte) -121)) {
                  break L3;
                } else {
                  ((tc) this).field_x = null;
                  ((tc) this).field_p = -((tc) this).field_p;
                  ((tc) this).field_n = false;
                  break L3;
                }
              }
            }
          }
        }
        L4: {
          if (((tc) this).field_p == 0) {
            break L4;
          } else {
            ((tc) this).field_v = ((tc) this).field_v + param0 * ((tc) this).field_p;
            if (-1048577 < (((tc) this).field_v ^ -1)) {
              if (-1 <= (((tc) this).field_v ^ -1)) {
                ((tc) this).field_v = 0;
                if (!((tc) this).field_n) {
                  ((tc) this).field_p = 0;
                  if (!((tc) this).field_q) {
                    L5: {
                      if (((tc) this).field_o == null) {
                        break L5;
                      } else {
                        ((tc) this).field_A.d(-86);
                        break L5;
                      }
                    }
                    ((tc) this).field_o = null;
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  break L4;
                }
              } else {
                break L4;
              }
            } else {
              ((tc) this).field_v = 1048576;
              if (((tc) this).field_n) {
                break L4;
              } else {
                ((tc) this).field_p = 0;
                if (!((tc) this).field_q) {
                  L6: {
                    if (((tc) this).field_x == null) {
                      break L6;
                    } else {
                      ((tc) this).field_B.d(-117);
                      break L6;
                    }
                  }
                  ((tc) this).field_x = null;
                  break L4;
                } else {
                  break L4;
                }
              }
            }
          }
        }
    }

    final void b(byte param0) {
        if (null != ((tc) this).field_o) {
            ((tc) this).field_A.d(param0 + -131);
        }
        if (null != ((tc) this).field_x) {
            ((tc) this).field_B.d(-96);
        }
        ((tc) this).field_o = null;
        if (param0 != 52) {
            ((tc) this).b((byte) 51);
        }
        ((tc) this).field_x = null;
    }

    final static void a(int param0, byte param1) {
        int var3 = DungeonAssault.field_K;
        pm var4 = (pm) (Object) li.field_a.e(-24172);
        while (var4 != null) {
            ro.a(var4, param0, param1 + 236);
            var4 = (pm) (Object) li.field_a.a(4);
        }
        if (param1 != -112) {
            field_u = null;
        }
    }

    public tc() {
        ((tc) this).field_q = false;
        ((tc) this).field_r = 0;
        ((tc) this).field_t = 256;
        ug var1 = new ug();
        this.a(true, var1, new ug(var1));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new int[8192];
    }
}
