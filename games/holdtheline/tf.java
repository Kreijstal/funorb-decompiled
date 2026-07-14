/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf extends tj {
    private int field_s;
    private int[] field_u;
    static uf field_A;
    private boolean field_w;
    kf field_q;
    private int field_B;
    private int field_D;
    private int field_y;
    private vi field_m;
    private kf field_p;
    static en field_n;
    kf field_C;
    private vi field_z;
    static String field_r;
    private boolean field_x;
    private vi field_t;
    private int[] field_v;
    static uf field_o;

    final synchronized void a(int param0) {
        int var3 = 0;
        L0: {
          var3 = HoldTheLine.field_D;
          if ((((tf) this).field_y ^ -1) >= -1) {
            if (1048576 <= ((tf) this).field_y) {
              break L0;
            } else {
              if (null != ((tf) this).field_m) {
                ((tf) this).field_C.a(param0);
                break L0;
              } else {
                if (1048576 <= ((tf) this).field_y) {
                  break L0;
                } else {
                  if (null == ((tf) this).field_m) {
                    break L0;
                  } else {
                    ((tf) this).field_C.a(param0);
                    break L0;
                  }
                }
              }
            }
          } else {
            if (1048576 <= ((tf) this).field_y) {
              break L0;
            } else {
              if (null == ((tf) this).field_m) {
                break L0;
              } else {
                ((tf) this).field_C.a(param0);
                break L0;
              }
            }
          }
        }
        L1: {
          if (-1 <= (((tf) this).field_s ^ -1)) {
            break L1;
          } else {
            if (null != ((tf) this).field_t) {
              ((tf) this).field_p.a(param0);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (!((tf) this).field_x) {
            break L2;
          } else {
            L3: {
              if (0 >= ((tf) this).field_D) {
                break L3;
              } else {
                if (!((tf) this).field_q.c((byte) -128)) {
                  ((tf) this).field_x = false;
                  ((tf) this).field_z = null;
                  ((tf) this).field_D = -((tf) this).field_D;
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if ((((tf) this).field_D ^ -1) <= -1) {
              break L2;
            } else {
              if (!((tf) this).field_C.c((byte) 39)) {
                ((tf) this).field_x = false;
                ((tf) this).field_D = -((tf) this).field_D;
                ((tf) this).field_m = null;
                break L2;
              } else {
                break L2;
              }
            }
          }
        }
        L4: {
          if (0 == ((tf) this).field_D) {
            break L4;
          } else {
            ((tf) this).field_y = ((tf) this).field_y + ((tf) this).field_D * param0;
            if (((tf) this).field_y >= 1048576) {
              ((tf) this).field_y = 1048576;
              if (!((tf) this).field_x) {
                ((tf) this).field_D = 0;
                if (!((tf) this).field_w) {
                  L5: {
                    if (null == ((tf) this).field_m) {
                      break L5;
                    } else {
                      ((tf) this).field_C.f(-127);
                      break L5;
                    }
                  }
                  ((tf) this).field_m = null;
                  break L4;
                } else {
                  break L4;
                }
              } else {
                break L4;
              }
            } else {
              if (0 < ((tf) this).field_y) {
                break L4;
              } else {
                ((tf) this).field_y = 0;
                if (((tf) this).field_x) {
                  break L4;
                } else {
                  ((tf) this).field_D = 0;
                  if (!((tf) this).field_w) {
                    L6: {
                      if (null == ((tf) this).field_z) {
                        break L6;
                      } else {
                        ((tf) this).field_q.f(-127);
                        break L6;
                      }
                    }
                    ((tf) this).field_z = null;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
            }
          }
        }
    }

    final static hj[] a(int param0, gn param1, int param2, boolean param3) {
        if (!qg.a(param2, param0, (byte) -27, param1)) {
            return null;
        }
        if (param3) {
            java.awt.Container discarded$0 = tf.e(-27);
        }
        return jd.h(-128);
    }

    final boolean a(int param0, vi param1) {
        Object var4 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 < -11) {
            break L0;
          } else {
            var4 = null;
            boolean discarded$2 = ((tf) this).a(-93, (vi) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (param1 == ((tf) this).field_z) {
              break L2;
            } else {
              if (((tf) this).field_m != param1) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final tj b() {
        return null;
    }

    final synchronized int c() {
        return 2;
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
        int stackIn_32_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_59_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        var11 = HoldTheLine.field_D;
        if (((tf) this).field_B <= 0) {
          ((tf) this).a(param2);
          return;
        } else {
          L0: {
            if (((tf) this).field_x) {
              if (0 < ((tf) this).field_D) {
                if (!((tf) this).field_q.c((byte) -127)) {
                  ((tf) this).field_D = -((tf) this).field_D;
                  ((tf) this).field_x = false;
                  ((tf) this).field_z = null;
                  break L0;
                } else {
                  if (-1 >= (((tf) this).field_D ^ -1)) {
                    break L0;
                  } else {
                    if (((tf) this).field_C.c((byte) 101)) {
                      break L0;
                    } else {
                      ((tf) this).field_D = -((tf) this).field_D;
                      ((tf) this).field_x = false;
                      ((tf) this).field_m = null;
                      break L0;
                    }
                  }
                }
              } else {
                if (-1 >= (((tf) this).field_D ^ -1)) {
                  break L0;
                } else {
                  if (((tf) this).field_C.c((byte) 101)) {
                    break L0;
                  } else {
                    ((tf) this).field_D = -((tf) this).field_D;
                    ((tf) this).field_x = false;
                    ((tf) this).field_m = null;
                    break L0;
                  }
                }
              }
            } else {
              break L0;
            }
          }
          L1: {
            var4 = (((tf) this).field_y >> 172353900) * ((tf) this).field_B / 256;
            var5 = ((tf) this).field_B + -var4;
            if (((tf) this).field_D == 0) {
              break L1;
            } else {
              ((tf) this).field_y = ((tf) this).field_y + param2 * ((tf) this).field_D;
              if (((tf) this).field_y < 1048576) {
                if (0 < ((tf) this).field_y) {
                  break L1;
                } else {
                  ((tf) this).field_y = 0;
                  if (((tf) this).field_x) {
                    break L1;
                  } else {
                    ((tf) this).field_D = 0;
                    if (((tf) this).field_w) {
                      break L1;
                    } else {
                      L2: {
                        if (((tf) this).field_z != null) {
                          ((tf) this).field_q.f(-124);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      ((tf) this).field_z = null;
                      break L1;
                    }
                  }
                }
              } else {
                ((tf) this).field_y = 1048576;
                if (((tf) this).field_x) {
                  break L1;
                } else {
                  ((tf) this).field_D = 0;
                  if (((tf) this).field_w) {
                    break L1;
                  } else {
                    L3: {
                      if (null == ((tf) this).field_m) {
                        break L3;
                      } else {
                        ((tf) this).field_C.f(-127);
                        break L3;
                      }
                    }
                    ((tf) this).field_m = null;
                    break L1;
                  }
                }
              }
            }
          }
          L4: {
            if (!lo.field_t) {
              stackOut_31_0 = param2;
              stackIn_32_0 = stackOut_31_0;
              break L4;
            } else {
              stackOut_30_0 = param2 << -596116767;
              stackIn_32_0 = stackOut_30_0;
              break L4;
            }
          }
          L5: {
            var6 = stackIn_32_0;
            if (-257 >= (((tf) this).field_s ^ -1)) {
              break L5;
            } else {
              L6: {
                if (((tf) this).field_z != null) {
                  break L6;
                } else {
                  if (((tf) this).field_m != null) {
                    break L6;
                  } else {
                    break L5;
                  }
                }
              }
              if (var4 != 256) {
                if ((var5 ^ -1) == -257) {
                  ((tf) this).field_C.b(param0, param1, param2);
                  break L5;
                } else {
                  L7: {
                    L8: {
                      if (null == ((tf) this).field_v) {
                        break L8;
                      } else {
                        if (var6 > ((tf) this).field_v.length) {
                          break L8;
                        } else {
                          bc.a(((tf) this).field_v, 0, var6);
                          bc.a(((tf) this).field_u, 0, var6);
                          break L7;
                        }
                      }
                    }
                    ((tf) this).field_u = new int[var6];
                    ((tf) this).field_v = new int[var6];
                    break L7;
                  }
                  L9: {
                    ((tf) this).field_q.b(((tf) this).field_v, 0, param2);
                    ((tf) this).field_C.b(((tf) this).field_u, 0, param2);
                    if (lo.field_t) {
                      param1 = param1 << 1;
                      stackOut_45_0 = param1 << 1;
                      stackIn_46_0 = stackOut_45_0;
                      break L9;
                    } else {
                      stackOut_44_0 = param1;
                      stackIn_46_0 = stackOut_44_0;
                      break L9;
                    }
                  }
                  var7 = stackIn_46_0;
                  var8 = 0;
                  L10: while (true) {
                    if (var8 >= var6) {
                      break L5;
                    } else {
                      param0[var8 + var7] = param0[var8 + var7] + (((tf) this).field_v[var8] * var4 + var5 * ((tf) this).field_u[var8] >> 1418724520);
                      var8++;
                      continue L10;
                    }
                  }
                }
              } else {
                ((tf) this).field_q.b(param0, param1, param2);
                break L5;
              }
            }
          }
          L11: {
            if (((tf) this).field_t == null) {
              break L11;
            } else {
              if (0 == ((tf) this).field_s) {
                break L11;
              } else {
                L12: {
                  L13: {
                    if (((tf) this).field_v == null) {
                      break L13;
                    } else {
                      if (((tf) this).field_v.length < var6) {
                        break L13;
                      } else {
                        bc.a(((tf) this).field_v, 0, var6);
                        break L12;
                      }
                    }
                  }
                  ((tf) this).field_u = new int[var6];
                  ((tf) this).field_v = new int[var6];
                  break L12;
                }
                L14: {
                  ((tf) this).field_p.b(((tf) this).field_v, 0, param2);
                  if (!lo.field_t) {
                    stackOut_58_0 = param1;
                    stackIn_59_0 = stackOut_58_0;
                    break L14;
                  } else {
                    param1 = param1 << 1;
                    stackOut_57_0 = param1 << 1;
                    stackIn_59_0 = stackOut_57_0;
                    break L14;
                  }
                }
                var7 = stackIn_59_0;
                var8 = ((tf) this).field_s * ((tf) this).field_B / 256;
                var9 = -var8 + ((tf) this).field_B;
                var10 = 0;
                L15: while (true) {
                  if (var10 >= var6) {
                    break L11;
                  } else {
                    param0[var10 + var7] = var9 * param0[var10 + var7] + var8 * ((tf) this).field_v[var10] >> -758450424;
                    var10++;
                    continue L15;
                  }
                }
              }
            }
          }
          return;
        }
    }

    final static java.awt.Container e(int param0) {
        if (param0 != 0) {
            field_o = null;
        }
        if (!(null == fm.field_a)) {
            return (java.awt.Container) (Object) fm.field_a;
        }
        return (java.awt.Container) (Object) en.a(111);
    }

    final tj a() {
        return null;
    }

    final synchronized void a(int param0, int param1) {
        ((tf) this).field_B = param0;
        if (param1 != -32284) {
            int discarded$0 = ((tf) this).c();
        }
    }

    public static void f(int param0) {
        field_r = null;
        int var1 = 38 / ((param0 - -51) / 59);
        field_n = null;
        field_A = null;
        field_o = null;
    }

    final static float a(byte param0, float param1, wc[] param2) {
        int var5 = 0;
        int var6 = HoldTheLine.field_D;
        float var3 = 0.0f;
        int var4 = (int)param1;
        if (param0 <= 74) {
            Object var7 = null;
            hj[] discarded$0 = tf.a(115, (gn) null, 72, true);
        }
        for (var5 = 0; var5 < var4; var5++) {
            var3 = var3 + param2[var5].f(50);
        }
        if (param1 != (float)var4) {
            var3 = var3 + param2[var4].f(50) * ((float)(-var4) + param1);
        }
        return var3;
    }

    private final void a(kf param0, byte param1, kf param2) {
        ((tf) this).field_q = param0;
        ((tf) this).field_y = 1048576;
        int var4 = 91 / ((param1 - 21) / 54);
        ((tf) this).field_C = param2;
    }

    private final void a(int param0, kf param1, int param2, int param3) {
        param1.a((byte) 108, -1, param3);
        if (param2 != 17945) {
            ((tf) this).field_y = 96;
        }
        param1.b(param0, param2 + -17943);
    }

    final synchronized void a(int param0, int param1, vi param2, byte param3, boolean param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_31_0 = 0;
        kf stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        vi stackIn_38_2 = null;
        kf stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        vi stackIn_39_2 = null;
        kf stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        vi stackIn_40_2 = null;
        int stackIn_40_3 = 0;
        kf stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        vi stackIn_48_2 = null;
        kf stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        vi stackIn_49_2 = null;
        kf stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        vi stackIn_50_2 = null;
        int stackIn_50_3 = 0;
        Object stackOut_15_0 = null;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        kf stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        vi stackOut_47_2 = null;
        kf stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        vi stackOut_49_2 = null;
        int stackOut_49_3 = 0;
        kf stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        vi stackOut_48_2 = null;
        int stackOut_48_3 = 0;
        kf stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        vi stackOut_37_2 = null;
        kf stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        vi stackOut_39_2 = null;
        int stackOut_39_3 = 0;
        kf stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        vi stackOut_38_2 = null;
        int stackOut_38_3 = 0;
        L0: {
          var8 = HoldTheLine.field_D;
          if (!((tf) this).field_x) {
            break L0;
          } else {
            if (param4) {
              L1: {
                if (((tf) this).field_D > 0) {
                  L2: {
                    if (((tf) this).field_z != null) {
                      ((tf) this).field_q.f(-127);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  ((tf) this).field_z = param2;
                  if (param2 == null) {
                    break L1;
                  } else {
                    ((tf) this).field_q.a(param3 + -2128026886, param2, false);
                    this.a(param1, ((tf) this).field_q, 17945, param5);
                    break L1;
                  }
                } else {
                  L3: {
                    if (((tf) this).field_m != null) {
                      ((tf) this).field_C.f(-125);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  ((tf) this).field_m = param2;
                  if (param2 == null) {
                    break L1;
                  } else {
                    ((tf) this).field_C.a(-2128027000, param2, false);
                    this.a(param1, ((tf) this).field_C, 17945, param5);
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
          if (!param4) {
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
        ((tf) this).field_x = stackIn_18_1 != 0;
        if (((tf) this).field_z != param2) {
          if (param2 == ((tf) this).field_m) {
            ((tf) this).field_D = -param0;
            this.a(param1, ((tf) this).field_C, 17945, param5);
            return;
          } else {
            L5: {
              if (param3 == -114) {
                break L5;
              } else {
                var9 = null;
                ((tf) this).a(85, 112, (vi) null, (byte) -26, false, -91);
                break L5;
              }
            }
            L6: {
              if (((tf) this).field_z == null) {
                var7 = 1;
                break L6;
              } else {
                if (((tf) this).field_m != null) {
                  L7: {
                    if (((tf) this).field_y >= 524288) {
                      stackOut_30_0 = 0;
                      stackIn_31_0 = stackOut_30_0;
                      break L7;
                    } else {
                      stackOut_29_0 = 1;
                      stackIn_31_0 = stackOut_29_0;
                      break L7;
                    }
                  }
                  var7 = stackIn_31_0;
                  break L6;
                } else {
                  var7 = 0;
                  break L6;
                }
              }
            }
            L8: {
              if (var7 == 0) {
                L9: {
                  if (((tf) this).field_m != null) {
                    ((tf) this).field_C.f(-125);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  ((tf) this).field_m = param2;
                  if (param2 != null) {
                    L11: {
                      stackOut_47_0 = ((tf) this).field_C;
                      stackOut_47_1 = -2128027000;
                      stackOut_47_2 = (vi) param2;
                      stackIn_49_0 = stackOut_47_0;
                      stackIn_49_1 = stackOut_47_1;
                      stackIn_49_2 = stackOut_47_2;
                      stackIn_48_0 = stackOut_47_0;
                      stackIn_48_1 = stackOut_47_1;
                      stackIn_48_2 = stackOut_47_2;
                      if (param4) {
                        stackOut_49_0 = (kf) (Object) stackIn_49_0;
                        stackOut_49_1 = stackIn_49_1;
                        stackOut_49_2 = (vi) (Object) stackIn_49_2;
                        stackOut_49_3 = 0;
                        stackIn_50_0 = stackOut_49_0;
                        stackIn_50_1 = stackOut_49_1;
                        stackIn_50_2 = stackOut_49_2;
                        stackIn_50_3 = stackOut_49_3;
                        break L11;
                      } else {
                        stackOut_48_0 = (kf) (Object) stackIn_48_0;
                        stackOut_48_1 = stackIn_48_1;
                        stackOut_48_2 = (vi) (Object) stackIn_48_2;
                        stackOut_48_3 = 1;
                        stackIn_50_0 = stackOut_48_0;
                        stackIn_50_1 = stackOut_48_1;
                        stackIn_50_2 = stackOut_48_2;
                        stackIn_50_3 = stackOut_48_3;
                        break L11;
                      }
                    }
                    ((kf) (Object) stackIn_50_0).a(stackIn_50_1, stackIn_50_2, stackIn_50_3 != 0);
                    this.a(param1, ((tf) this).field_C, 17945, param5);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                ((tf) this).field_D = -param0;
                break L8;
              } else {
                L12: {
                  if (null == ((tf) this).field_z) {
                    break L12;
                  } else {
                    ((tf) this).field_q.f(param3 ^ 13);
                    break L12;
                  }
                }
                L13: {
                  ((tf) this).field_z = param2;
                  if (param2 == null) {
                    break L13;
                  } else {
                    L14: {
                      stackOut_37_0 = ((tf) this).field_q;
                      stackOut_37_1 = -2128027000;
                      stackOut_37_2 = (vi) param2;
                      stackIn_39_0 = stackOut_37_0;
                      stackIn_39_1 = stackOut_37_1;
                      stackIn_39_2 = stackOut_37_2;
                      stackIn_38_0 = stackOut_37_0;
                      stackIn_38_1 = stackOut_37_1;
                      stackIn_38_2 = stackOut_37_2;
                      if (param4) {
                        stackOut_39_0 = (kf) (Object) stackIn_39_0;
                        stackOut_39_1 = stackIn_39_1;
                        stackOut_39_2 = (vi) (Object) stackIn_39_2;
                        stackOut_39_3 = 0;
                        stackIn_40_0 = stackOut_39_0;
                        stackIn_40_1 = stackOut_39_1;
                        stackIn_40_2 = stackOut_39_2;
                        stackIn_40_3 = stackOut_39_3;
                        break L14;
                      } else {
                        stackOut_38_0 = (kf) (Object) stackIn_38_0;
                        stackOut_38_1 = stackIn_38_1;
                        stackOut_38_2 = (vi) (Object) stackIn_38_2;
                        stackOut_38_3 = 1;
                        stackIn_40_0 = stackOut_38_0;
                        stackIn_40_1 = stackOut_38_1;
                        stackIn_40_2 = stackOut_38_2;
                        stackIn_40_3 = stackOut_38_3;
                        break L14;
                      }
                    }
                    ((kf) (Object) stackIn_40_0).a(stackIn_40_1, stackIn_40_2, stackIn_40_3 != 0);
                    this.a(param1, ((tf) this).field_q, param3 ^ -18025, param5);
                    break L13;
                  }
                }
                ((tf) this).field_D = param0;
                break L8;
              }
            }
            return;
          }
        } else {
          ((tf) this).field_D = param0;
          this.a(param1, ((tf) this).field_q, 17945, param5);
          return;
        }
    }

    public tf() {
        ((tf) this).field_s = 0;
        ((tf) this).field_B = 256;
        ((tf) this).field_w = false;
        kf var1 = new kf();
        this.a(var1, (byte) 126, new kf(var1));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "1P";
        field_n = new en();
    }
}
