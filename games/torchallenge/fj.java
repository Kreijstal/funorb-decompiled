/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj extends qd {
    private int[] field_q;
    private kb field_B;
    private ej field_n;
    private int[] field_u;
    private boolean field_t;
    static int[] field_C;
    private int field_x;
    private int field_y;
    static boolean[][][] field_z;
    private boolean field_s;
    static int[] field_m;
    static int[] field_p;
    private int field_w;
    private ej field_r;
    private kb field_v;
    private kb field_D;
    private ej field_A;
    private int field_o;

    final static void b(byte param0) {
        qb.field_c = null;
        gi.field_c = false;
        if (param0 >= -102) {
            field_C = null;
        }
        ji.field_n = null;
        qi.field_b = null;
        jl.field_c = null;
    }

    final qd c() {
        return null;
    }

    final synchronized void a(int param0, int param1) {
        ((fj) this).field_y = param1;
        if (param0 >= -118) {
            ((fj) this).field_D = null;
        }
    }

    private final void a(int param0, int param1, kb param2, int param3) {
        param2.a(-3262, param1, -1);
        if (param0 != 1553517424) {
            return;
        }
        param2.b((byte) 44, param3);
    }

    final qd b() {
        return null;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = param1 >> 1553517424;
        int var4 = param1 & 65535;
        int var5 = param2 >> -67779504;
        if (param0 != 1870096848) {
            field_C = null;
        }
        int var6 = 65535 & param2;
        return (var4 * var6 >> 1870096848) + var3 * param2 - -(var5 * var4);
    }

    final synchronized void a(int param0, int param1, int param2, boolean param3, int param4, ej param5) {
        int var7 = 0;
        int var8 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_30_0 = 0;
        kb stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        ej stackIn_38_2 = null;
        kb stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        ej stackIn_39_2 = null;
        kb stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        ej stackIn_40_2 = null;
        int stackIn_40_3 = 0;
        kb stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        ej stackIn_47_2 = null;
        kb stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        ej stackIn_48_2 = null;
        kb stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        ej stackIn_49_2 = null;
        int stackIn_49_3 = 0;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        kb stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        ej stackOut_46_2 = null;
        kb stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        ej stackOut_48_2 = null;
        int stackOut_48_3 = 0;
        kb stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        ej stackOut_47_2 = null;
        int stackOut_47_3 = 0;
        kb stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        ej stackOut_37_2 = null;
        kb stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        ej stackOut_39_2 = null;
        int stackOut_39_3 = 0;
        kb stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        ej stackOut_38_2 = null;
        int stackOut_38_3 = 0;
        L0: {
          var8 = TorChallenge.field_F ? 1 : 0;
          if (!((fj) this).field_t) {
            break L0;
          } else {
            if (param3) {
              L1: {
                if (0 >= ((fj) this).field_x) {
                  L2: {
                    if (((fj) this).field_A == null) {
                      break L2;
                    } else {
                      ((fj) this).field_v.b((byte) 31);
                      break L2;
                    }
                  }
                  ((fj) this).field_A = param5;
                  if (param5 != null) {
                    ((fj) this).field_v.a(param0 + -20174, param5, false);
                    this.a(param0 + 1553505376, param2, ((fj) this).field_v, param1);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  L3: {
                    if (((fj) this).field_n != null) {
                      ((fj) this).field_B.b((byte) 31);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  ((fj) this).field_n = param5;
                  if (param5 != null) {
                    ((fj) this).field_B.a(param0 ^ -12462, param5, false);
                    this.a(param0 + 1553505376, param2, ((fj) this).field_B, param1);
                    break L1;
                  } else {
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
          stackOut_16_0 = this;
          stackIn_18_0 = stackOut_16_0;
          stackIn_17_0 = stackOut_16_0;
          if (!param3) {
            stackOut_18_0 = this;
            stackOut_18_1 = 0;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            break L4;
          } else {
            stackOut_17_0 = this;
            stackOut_17_1 = 1;
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            break L4;
          }
        }
        ((fj) this).field_t = stackIn_19_1 != 0;
        if (param5 == ((fj) this).field_n) {
          ((fj) this).field_x = param4;
          this.a(1553517424, param2, ((fj) this).field_B, param1);
          return;
        } else {
          if (param5 != ((fj) this).field_A) {
            L5: {
              if (((fj) this).field_n != null) {
                if (((fj) this).field_A != null) {
                  L6: {
                    if (-524289 >= (((fj) this).field_w ^ -1)) {
                      stackOut_29_0 = 0;
                      stackIn_30_0 = stackOut_29_0;
                      break L6;
                    } else {
                      stackOut_28_0 = 1;
                      stackIn_30_0 = stackOut_28_0;
                      break L6;
                    }
                  }
                  var7 = stackIn_30_0;
                  break L5;
                } else {
                  var7 = 0;
                  break L5;
                }
              } else {
                var7 = 1;
                break L5;
              }
            }
            if (param0 == 12048) {
              L7: {
                if (var7 == 0) {
                  L8: {
                    if (null != ((fj) this).field_A) {
                      ((fj) this).field_v.b((byte) 31);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    ((fj) this).field_A = param5;
                    if (param5 == null) {
                      break L9;
                    } else {
                      L10: {
                        stackOut_46_0 = ((fj) this).field_v;
                        stackOut_46_1 = -8126;
                        stackOut_46_2 = (ej) param5;
                        stackIn_48_0 = stackOut_46_0;
                        stackIn_48_1 = stackOut_46_1;
                        stackIn_48_2 = stackOut_46_2;
                        stackIn_47_0 = stackOut_46_0;
                        stackIn_47_1 = stackOut_46_1;
                        stackIn_47_2 = stackOut_46_2;
                        if (param3) {
                          stackOut_48_0 = (kb) (Object) stackIn_48_0;
                          stackOut_48_1 = stackIn_48_1;
                          stackOut_48_2 = (ej) (Object) stackIn_48_2;
                          stackOut_48_3 = 0;
                          stackIn_49_0 = stackOut_48_0;
                          stackIn_49_1 = stackOut_48_1;
                          stackIn_49_2 = stackOut_48_2;
                          stackIn_49_3 = stackOut_48_3;
                          break L10;
                        } else {
                          stackOut_47_0 = (kb) (Object) stackIn_47_0;
                          stackOut_47_1 = stackIn_47_1;
                          stackOut_47_2 = (ej) (Object) stackIn_47_2;
                          stackOut_47_3 = 1;
                          stackIn_49_0 = stackOut_47_0;
                          stackIn_49_1 = stackOut_47_1;
                          stackIn_49_2 = stackOut_47_2;
                          stackIn_49_3 = stackOut_47_3;
                          break L10;
                        }
                      }
                      ((kb) (Object) stackIn_49_0).a(stackIn_49_1, stackIn_49_2, stackIn_49_3 != 0);
                      this.a(1553517424, param2, ((fj) this).field_v, param1);
                      break L9;
                    }
                  }
                  ((fj) this).field_x = -param4;
                  break L7;
                } else {
                  L11: {
                    if (null == ((fj) this).field_n) {
                      break L11;
                    } else {
                      ((fj) this).field_B.b((byte) 31);
                      break L11;
                    }
                  }
                  L12: {
                    ((fj) this).field_n = param5;
                    if (param5 == null) {
                      break L12;
                    } else {
                      L13: {
                        stackOut_37_0 = ((fj) this).field_B;
                        stackOut_37_1 = -8126;
                        stackOut_37_2 = (ej) param5;
                        stackIn_39_0 = stackOut_37_0;
                        stackIn_39_1 = stackOut_37_1;
                        stackIn_39_2 = stackOut_37_2;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        stackIn_38_2 = stackOut_37_2;
                        if (param3) {
                          stackOut_39_0 = (kb) (Object) stackIn_39_0;
                          stackOut_39_1 = stackIn_39_1;
                          stackOut_39_2 = (ej) (Object) stackIn_39_2;
                          stackOut_39_3 = 0;
                          stackIn_40_0 = stackOut_39_0;
                          stackIn_40_1 = stackOut_39_1;
                          stackIn_40_2 = stackOut_39_2;
                          stackIn_40_3 = stackOut_39_3;
                          break L13;
                        } else {
                          stackOut_38_0 = (kb) (Object) stackIn_38_0;
                          stackOut_38_1 = stackIn_38_1;
                          stackOut_38_2 = (ej) (Object) stackIn_38_2;
                          stackOut_38_3 = 1;
                          stackIn_40_0 = stackOut_38_0;
                          stackIn_40_1 = stackOut_38_1;
                          stackIn_40_2 = stackOut_38_2;
                          stackIn_40_3 = stackOut_38_3;
                          break L13;
                        }
                      }
                      ((kb) (Object) stackIn_40_0).a(stackIn_40_1, stackIn_40_2, stackIn_40_3 != 0);
                      this.a(1553517424, param2, ((fj) this).field_B, param1);
                      break L12;
                    }
                  }
                  ((fj) this).field_x = param4;
                  break L7;
                }
              }
              return;
            } else {
              return;
            }
          } else {
            ((fj) this).field_x = -param4;
            this.a(1553517424, param2, ((fj) this).field_v, param1);
            return;
          }
        }
    }

    public static void b(boolean param0) {
        field_z = null;
        field_C = null;
        field_m = null;
        if (param0) {
            int discarded$0 = fj.a(34, -118, -79);
        }
        field_p = null;
    }

    final synchronized int a() {
        return 2;
    }

    final synchronized void a(int param0) {
        int var3 = 0;
        L0: {
          var3 = TorChallenge.field_F ? 1 : 0;
          if ((((fj) this).field_w ^ -1) >= -1) {
            break L0;
          } else {
            if (null == ((fj) this).field_n) {
              break L0;
            } else {
              ((fj) this).field_B.a(param0);
              break L0;
            }
          }
        }
        L1: {
          if (((fj) this).field_w <= -1048577) {
            if (-1 <= ((fj) this).field_o) {
              break L1;
            } else {
              if (null == ((fj) this).field_r) {
                break L1;
              } else {
                ((fj) this).field_D.a(param0);
                break L1;
              }
            }
          } else {
            if (-1 >= ((fj) this).field_o) {
              break L1;
            } else {
              if (null == ((fj) this).field_r) {
                break L1;
              } else {
                ((fj) this).field_D.a(param0);
                break L1;
              }
            }
          }
        }
        L2: {
          if (!((fj) this).field_t) {
            break L2;
          } else {
            L3: {
              if (-1 >= ((fj) this).field_x) {
                break L3;
              } else {
                if (!((fj) this).field_B.d(0)) {
                  ((fj) this).field_t = false;
                  ((fj) this).field_n = null;
                  ((fj) this).field_x = -((fj) this).field_x;
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if (-1 >= (((fj) this).field_x ^ -1)) {
              break L2;
            } else {
              if (!((fj) this).field_v.d(0)) {
                ((fj) this).field_t = false;
                ((fj) this).field_x = -((fj) this).field_x;
                ((fj) this).field_A = null;
                break L2;
              } else {
                break L2;
              }
            }
          }
        }
        L4: {
          if (((fj) this).field_x != 0) {
            ((fj) this).field_w = ((fj) this).field_w + param0 * ((fj) this).field_x;
            if ((((fj) this).field_w ^ -1) <= -1048577) {
              ((fj) this).field_w = 1048576;
              if (((fj) this).field_t) {
                break L4;
              } else {
                ((fj) this).field_x = 0;
                if (((fj) this).field_s) {
                  break L4;
                } else {
                  L5: {
                    if (((fj) this).field_A == null) {
                      break L5;
                    } else {
                      ((fj) this).field_v.b((byte) 31);
                      break L5;
                    }
                  }
                  ((fj) this).field_A = null;
                  break L4;
                }
              }
            } else {
              if (0 < ((fj) this).field_w) {
                break L4;
              } else {
                ((fj) this).field_w = 0;
                if (((fj) this).field_t) {
                  break L4;
                } else {
                  ((fj) this).field_x = 0;
                  if (!((fj) this).field_s) {
                    L6: {
                      if (((fj) this).field_n == null) {
                        break L6;
                      } else {
                        ((fj) this).field_B.b((byte) 31);
                        break L6;
                      }
                    }
                    ((fj) this).field_n = null;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
            }
          } else {
            break L4;
          }
        }
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
        int stackIn_48_0 = 0;
        int stackIn_63_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_61_0 = 0;
        var11 = TorChallenge.field_F ? 1 : 0;
        if (((fj) this).field_y <= 0) {
          ((fj) this).a(param2);
          return;
        } else {
          L0: {
            if (!((fj) this).field_t) {
              break L0;
            } else {
              L1: {
                if (0 >= ((fj) this).field_x) {
                  break L1;
                } else {
                  if (!((fj) this).field_B.d(0)) {
                    ((fj) this).field_n = null;
                    ((fj) this).field_t = false;
                    ((fj) this).field_x = -((fj) this).field_x;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              if (-1 >= (((fj) this).field_x ^ -1)) {
                break L0;
              } else {
                if (!((fj) this).field_v.d(0)) {
                  ((fj) this).field_x = -((fj) this).field_x;
                  ((fj) this).field_A = null;
                  ((fj) this).field_t = false;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
          L2: {
            var4 = ((fj) this).field_y * (((fj) this).field_w >> -449764788) / 256;
            var5 = -var4 + ((fj) this).field_y;
            if (((fj) this).field_x != 0) {
              ((fj) this).field_w = ((fj) this).field_w + param2 * ((fj) this).field_x;
              if (-1048577 >= (((fj) this).field_w ^ -1)) {
                ((fj) this).field_w = 1048576;
                if (!((fj) this).field_t) {
                  ((fj) this).field_x = 0;
                  if (!((fj) this).field_s) {
                    L3: {
                      if (((fj) this).field_A != null) {
                        ((fj) this).field_v.b((byte) 31);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    ((fj) this).field_A = null;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              } else {
                if (0 >= ((fj) this).field_w) {
                  ((fj) this).field_w = 0;
                  if (((fj) this).field_t) {
                    break L2;
                  } else {
                    ((fj) this).field_x = 0;
                    if (((fj) this).field_s) {
                      break L2;
                    } else {
                      L4: {
                        if (((fj) this).field_n == null) {
                          break L4;
                        } else {
                          ((fj) this).field_B.b((byte) 31);
                          break L4;
                        }
                      }
                      ((fj) this).field_n = null;
                      break L2;
                    }
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
            if (kh.field_g) {
              stackOut_32_0 = param2 << 1182310017;
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
            if (-257 >= (((fj) this).field_o ^ -1)) {
              break L6;
            } else {
              L7: {
                if (null != ((fj) this).field_n) {
                  break L7;
                } else {
                  if (((fj) this).field_A == null) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              if (256 == var4) {
                ((fj) this).field_B.b(param0, param1, param2);
                break L6;
              } else {
                if ((var5 ^ -1) != -257) {
                  L8: {
                    L9: {
                      if (null == ((fj) this).field_u) {
                        break L9;
                      } else {
                        if (var6 <= ((fj) this).field_u.length) {
                          he.a(((fj) this).field_u, 0, var6);
                          he.a(((fj) this).field_q, 0, var6);
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    ((fj) this).field_u = new int[var6];
                    ((fj) this).field_q = new int[var6];
                    break L8;
                  }
                  L10: {
                    ((fj) this).field_B.b(((fj) this).field_u, 0, param2);
                    ((fj) this).field_v.b(((fj) this).field_q, 0, param2);
                    if (kh.field_g) {
                      param1 = param1 << 1;
                      stackOut_47_0 = param1 << 1;
                      stackIn_48_0 = stackOut_47_0;
                      break L10;
                    } else {
                      stackOut_46_0 = param1;
                      stackIn_48_0 = stackOut_46_0;
                      break L10;
                    }
                  }
                  var7 = stackIn_48_0;
                  var8 = 0;
                  L11: while (true) {
                    if (var6 <= var8) {
                      break L6;
                    } else {
                      param0[var7 + var8] = param0[var7 + var8] + (((fj) this).field_u[var8] * var4 + var5 * ((fj) this).field_q[var8] >> -1248445688);
                      var8++;
                      continue L11;
                    }
                  }
                } else {
                  ((fj) this).field_v.b(param0, param1, param2);
                  break L6;
                }
              }
            }
          }
          L12: {
            if (null == ((fj) this).field_r) {
              break L12;
            } else {
              if (0 != ((fj) this).field_o) {
                L13: {
                  L14: {
                    if (((fj) this).field_u == null) {
                      break L14;
                    } else {
                      if (var6 <= ((fj) this).field_u.length) {
                        he.a(((fj) this).field_u, 0, var6);
                        break L13;
                      } else {
                        break L14;
                      }
                    }
                  }
                  ((fj) this).field_q = new int[var6];
                  ((fj) this).field_u = new int[var6];
                  break L13;
                }
                L15: {
                  ((fj) this).field_D.b(((fj) this).field_u, 0, param2);
                  if (kh.field_g) {
                    param1 = param1 << 1;
                    stackOut_62_0 = param1 << 1;
                    stackIn_63_0 = stackOut_62_0;
                    break L15;
                  } else {
                    stackOut_61_0 = param1;
                    stackIn_63_0 = stackOut_61_0;
                    break L15;
                  }
                }
                var7 = stackIn_63_0;
                var8 = ((fj) this).field_o * ((fj) this).field_y / 256;
                var9 = ((fj) this).field_y + -var8;
                var10 = 0;
                L16: while (true) {
                  if (var10 >= var6) {
                    break L12;
                  } else {
                    param0[var7 + var10] = ((fj) this).field_u[var10] * var8 + var9 * param0[var10 + var7] >> 537284136;
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
        }
    }

    private fj() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = new int[128];
        field_p = new int[2];
        field_z = new boolean[][][]{new boolean[7][], new boolean[7][], new boolean[7][]};
    }
}
