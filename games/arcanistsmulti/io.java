/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class io extends sg {
    private int[] field_p;
    private gh field_v;
    private int field_E;
    static String field_C;
    private ha field_t;
    private int field_s;
    private ha field_o;
    private gh field_k;
    private int[] field_m;
    private boolean field_w;
    static String field_z;
    private int field_D;
    static vh field_n;
    private int field_r;
    private gh field_l;
    static String field_x;
    static String field_u;
    static boolean field_A;
    private ha field_y;
    private boolean field_q;

    final synchronized void a(int param0) {
        int var3 = 0;
        L0: {
          var3 = ArcanistsMulti.field_G ? 1 : 0;
          if (((io) this).field_r <= 0) {
            if (-1048577 <= ((io) this).field_r) {
              break L0;
            } else {
              if (null == ((io) this).field_t) {
                break L0;
              } else {
                ((io) this).field_l.a(param0);
                break L0;
              }
            }
          } else {
            if (-1048577 >= ((io) this).field_r) {
              break L0;
            } else {
              if (null == ((io) this).field_t) {
                break L0;
              } else {
                ((io) this).field_l.a(param0);
                break L0;
              }
            }
          }
        }
        L1: {
          if (0 >= ((io) this).field_E) {
            break L1;
          } else {
            if (null != ((io) this).field_y) {
              ((io) this).field_k.a(param0);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (((io) this).field_w) {
            L3: {
              if (0 >= ((io) this).field_D) {
                break L3;
              } else {
                if (!((io) this).field_v.e((byte) -8)) {
                  ((io) this).field_o = null;
                  ((io) this).field_D = -((io) this).field_D;
                  ((io) this).field_w = false;
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if (-1 >= (((io) this).field_D ^ -1)) {
              break L2;
            } else {
              if (!((io) this).field_l.e((byte) -8)) {
                ((io) this).field_t = null;
                ((io) this).field_D = -((io) this).field_D;
                ((io) this).field_w = false;
                break L2;
              } else {
                break L2;
              }
            }
          } else {
            break L2;
          }
        }
        L4: {
          if (((io) this).field_D != 0) {
            ((io) this).field_r = ((io) this).field_r + param0 * ((io) this).field_D;
            if ((((io) this).field_r ^ -1) <= -1048577) {
              ((io) this).field_r = 1048576;
              if (((io) this).field_w) {
                break L4;
              } else {
                ((io) this).field_D = 0;
                if (!((io) this).field_q) {
                  L5: {
                    if (((io) this).field_t == null) {
                      break L5;
                    } else {
                      ((io) this).field_l.a((byte) -123);
                      break L5;
                    }
                  }
                  ((io) this).field_t = null;
                  break L4;
                } else {
                  break L4;
                }
              }
            } else {
              if (((io) this).field_r > 0) {
                break L4;
              } else {
                ((io) this).field_r = 0;
                if (((io) this).field_w) {
                  break L4;
                } else {
                  ((io) this).field_D = 0;
                  if (((io) this).field_q) {
                    break L4;
                  } else {
                    L6: {
                      if (((io) this).field_o != null) {
                        ((io) this).field_v.a((byte) -125);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    ((io) this).field_o = null;
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

    final synchronized void a(boolean param0, int param1, byte param2, int param3, int param4, ha param5) {
        int var7 = 0;
        int var8 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_27_0 = 0;
        gh stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        gh stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        gh stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        gh stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        gh stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        gh stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        int stackIn_47_2 = 0;
        Object stackOut_13_0 = null;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        gh stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        gh stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        int stackOut_46_2 = 0;
        gh stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        int stackOut_45_2 = 0;
        gh stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        gh stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_38_2 = 0;
        gh stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        L0: {
          var8 = ArcanistsMulti.field_G ? 1 : 0;
          if (!((io) this).field_w) {
            break L0;
          } else {
            if (!param0) {
              break L0;
            } else {
              L1: {
                if ((((io) this).field_D ^ -1) < -1) {
                  L2: {
                    if (null == ((io) this).field_o) {
                      break L2;
                    } else {
                      ((io) this).field_v.a((byte) -106);
                      break L2;
                    }
                  }
                  ((io) this).field_o = param5;
                  if (param5 == null) {
                    break L1;
                  } else {
                    ((io) this).field_v.a((byte) -96, false, param5);
                    this.a(param3, (byte) -13, ((io) this).field_v, param1);
                    break L1;
                  }
                } else {
                  L3: {
                    if (null == ((io) this).field_t) {
                      break L3;
                    } else {
                      ((io) this).field_l.a((byte) -106);
                      break L3;
                    }
                  }
                  ((io) this).field_t = param5;
                  if (param5 != null) {
                    ((io) this).field_l.a((byte) -96, false, param5);
                    this.a(param3, (byte) -13, ((io) this).field_l, param1);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              return;
            }
          }
        }
        L4: {
          stackOut_13_0 = this;
          stackIn_15_0 = stackOut_13_0;
          stackIn_14_0 = stackOut_13_0;
          if (!param0) {
            stackOut_15_0 = this;
            stackOut_15_1 = 0;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            break L4;
          } else {
            stackOut_14_0 = this;
            stackOut_14_1 = 1;
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            break L4;
          }
        }
        ((io) this).field_w = stackIn_16_1 != 0;
        if (((io) this).field_o != param5) {
          if (param5 == ((io) this).field_t) {
            ((io) this).field_D = -param4;
            this.a(param3, (byte) -13, ((io) this).field_l, param1);
            return;
          } else {
            L5: {
              if (null == ((io) this).field_o) {
                var7 = 1;
                break L5;
              } else {
                if (null != ((io) this).field_t) {
                  L6: {
                    if (-524289 >= (((io) this).field_r ^ -1)) {
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
                } else {
                  var7 = 0;
                  break L5;
                }
              }
            }
            if (param2 == -85) {
              L7: {
                if (var7 != 0) {
                  L8: {
                    if (null == ((io) this).field_o) {
                      break L8;
                    } else {
                      ((io) this).field_v.a((byte) -124);
                      break L8;
                    }
                  }
                  L9: {
                    ((io) this).field_o = param5;
                    if (param5 == null) {
                      break L9;
                    } else {
                      L10: {
                        stackOut_44_0 = ((io) this).field_v;
                        stackOut_44_1 = -96;
                        stackIn_46_0 = stackOut_44_0;
                        stackIn_46_1 = stackOut_44_1;
                        stackIn_45_0 = stackOut_44_0;
                        stackIn_45_1 = stackOut_44_1;
                        if (param0) {
                          stackOut_46_0 = (gh) (Object) stackIn_46_0;
                          stackOut_46_1 = stackIn_46_1;
                          stackOut_46_2 = 0;
                          stackIn_47_0 = stackOut_46_0;
                          stackIn_47_1 = stackOut_46_1;
                          stackIn_47_2 = stackOut_46_2;
                          break L10;
                        } else {
                          stackOut_45_0 = (gh) (Object) stackIn_45_0;
                          stackOut_45_1 = stackIn_45_1;
                          stackOut_45_2 = 1;
                          stackIn_47_0 = stackOut_45_0;
                          stackIn_47_1 = stackOut_45_1;
                          stackIn_47_2 = stackOut_45_2;
                          break L10;
                        }
                      }
                      ((gh) (Object) stackIn_47_0).a((byte) stackIn_47_1, stackIn_47_2 != 0, param5);
                      this.a(param3, (byte) -13, ((io) this).field_v, param1);
                      break L9;
                    }
                  }
                  ((io) this).field_D = param4;
                  break L7;
                } else {
                  L11: {
                    if (null != ((io) this).field_t) {
                      ((io) this).field_l.a((byte) -109);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    ((io) this).field_t = param5;
                    if (param5 == null) {
                      break L12;
                    } else {
                      L13: {
                        stackOut_36_0 = ((io) this).field_l;
                        stackOut_36_1 = -96;
                        stackIn_38_0 = stackOut_36_0;
                        stackIn_38_1 = stackOut_36_1;
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        if (param0) {
                          stackOut_38_0 = (gh) (Object) stackIn_38_0;
                          stackOut_38_1 = stackIn_38_1;
                          stackOut_38_2 = 0;
                          stackIn_39_0 = stackOut_38_0;
                          stackIn_39_1 = stackOut_38_1;
                          stackIn_39_2 = stackOut_38_2;
                          break L13;
                        } else {
                          stackOut_37_0 = (gh) (Object) stackIn_37_0;
                          stackOut_37_1 = stackIn_37_1;
                          stackOut_37_2 = 1;
                          stackIn_39_0 = stackOut_37_0;
                          stackIn_39_1 = stackOut_37_1;
                          stackIn_39_2 = stackOut_37_2;
                          break L13;
                        }
                      }
                      ((gh) (Object) stackIn_39_0).a((byte) stackIn_39_1, stackIn_39_2 != 0, param5);
                      this.a(param3, (byte) -13, ((io) this).field_l, param1);
                      break L12;
                    }
                  }
                  ((io) this).field_D = -param4;
                  break L7;
                }
              }
              return;
            } else {
              return;
            }
          }
        } else {
          ((io) this).field_D = param4;
          this.a(param3, (byte) -13, ((io) this).field_v, param1);
          return;
        }
    }

    final synchronized void a(int param0, int param1) {
        if (param0 != 2) {
            return;
        }
        ((io) this).field_s = param1;
    }

    final void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_31_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_60_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_58_0 = 0;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        if (-1 <= (((io) this).field_s ^ -1)) {
          ((io) this).a(param2);
          return;
        } else {
          L0: {
            if (((io) this).field_w) {
              L1: {
                if (((io) this).field_D <= 0) {
                  break L1;
                } else {
                  if (!((io) this).field_v.e((byte) -8)) {
                    ((io) this).field_D = -((io) this).field_D;
                    ((io) this).field_o = null;
                    ((io) this).field_w = false;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              if ((((io) this).field_D ^ -1) <= -1) {
                break L0;
              } else {
                if (((io) this).field_l.e((byte) -8)) {
                  break L0;
                } else {
                  ((io) this).field_D = -((io) this).field_D;
                  ((io) this).field_w = false;
                  ((io) this).field_t = null;
                  break L0;
                }
              }
            } else {
              break L0;
            }
          }
          L2: {
            var4 = ((io) this).field_s * (((io) this).field_r >> 1060021324) / 256;
            var5 = ((io) this).field_s - var4;
            if (((io) this).field_D == 0) {
              break L2;
            } else {
              ((io) this).field_r = ((io) this).field_r + param2 * ((io) this).field_D;
              if (-1048577 >= (((io) this).field_r ^ -1)) {
                ((io) this).field_r = 1048576;
                if (!((io) this).field_w) {
                  ((io) this).field_D = 0;
                  if (((io) this).field_q) {
                    break L2;
                  } else {
                    L3: {
                      if (((io) this).field_t == null) {
                        break L3;
                      } else {
                        ((io) this).field_l.a((byte) -122);
                        break L3;
                      }
                    }
                    ((io) this).field_t = null;
                    break L2;
                  }
                } else {
                  break L2;
                }
              } else {
                if (((io) this).field_r > 0) {
                  break L2;
                } else {
                  ((io) this).field_r = 0;
                  if (!((io) this).field_w) {
                    ((io) this).field_D = 0;
                    if (((io) this).field_q) {
                      break L2;
                    } else {
                      L4: {
                        if (null != ((io) this).field_o) {
                          ((io) this).field_v.a((byte) -107);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      ((io) this).field_o = null;
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          L5: {
            if (lb.field_i) {
              stackOut_30_0 = param2 << -1248795487;
              stackIn_31_0 = stackOut_30_0;
              break L5;
            } else {
              stackOut_29_0 = param2;
              stackIn_31_0 = stackOut_29_0;
              break L5;
            }
          }
          L6: {
            var6 = stackIn_31_0;
            if (((io) this).field_E > -257) {
              L7: {
                if (null != ((io) this).field_o) {
                  break L7;
                } else {
                  if (((io) this).field_t == null) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              if (-257 != var4) {
                if (var5 == 256) {
                  ((io) this).field_l.a(param0, param1, param2);
                  break L6;
                } else {
                  L8: {
                    L9: {
                      if (((io) this).field_p == null) {
                        break L9;
                      } else {
                        if (((io) this).field_p.length < var6) {
                          break L9;
                        } else {
                          sf.a(((io) this).field_p, 0, var6);
                          sf.a(((io) this).field_m, 0, var6);
                          break L8;
                        }
                      }
                    }
                    ((io) this).field_p = new int[var6];
                    ((io) this).field_m = new int[var6];
                    break L8;
                  }
                  L10: {
                    ((io) this).field_v.a(((io) this).field_p, 0, param2);
                    ((io) this).field_l.a(((io) this).field_m, 0, param2);
                    if (!lb.field_i) {
                      stackOut_45_0 = param1;
                      stackIn_46_0 = stackOut_45_0;
                      break L10;
                    } else {
                      param1 = param1 << 1;
                      stackOut_44_0 = param1 << 1;
                      stackIn_46_0 = stackOut_44_0;
                      break L10;
                    }
                  }
                  var7 = stackIn_46_0;
                  var8 = 0;
                  L11: while (true) {
                    if (var8 >= var6) {
                      break L6;
                    } else {
                      param0[var8 + var7] = param0[var8 + var7] + (((io) this).field_m[var8] * var5 + var4 * ((io) this).field_p[var8] >> -1778064824);
                      var8++;
                      continue L11;
                    }
                  }
                }
              } else {
                ((io) this).field_v.a(param0, param1, param2);
                break L6;
              }
            } else {
              break L6;
            }
          }
          L12: {
            if (null == ((io) this).field_y) {
              break L12;
            } else {
              if (((io) this).field_E == 0) {
                break L12;
              } else {
                L13: {
                  L14: {
                    if (((io) this).field_p == null) {
                      break L14;
                    } else {
                      if (((io) this).field_p.length >= var6) {
                        sf.a(((io) this).field_p, 0, var6);
                        break L13;
                      } else {
                        break L14;
                      }
                    }
                  }
                  ((io) this).field_m = new int[var6];
                  ((io) this).field_p = new int[var6];
                  break L13;
                }
                L15: {
                  ((io) this).field_k.a(((io) this).field_p, 0, param2);
                  if (lb.field_i) {
                    param1 = param1 << 1;
                    stackOut_59_0 = param1 << 1;
                    stackIn_60_0 = stackOut_59_0;
                    break L15;
                  } else {
                    stackOut_58_0 = param1;
                    stackIn_60_0 = stackOut_58_0;
                    break L15;
                  }
                }
                var7 = stackIn_60_0;
                var8 = ((io) this).field_s * ((io) this).field_E / 256;
                var9 = -var8 + ((io) this).field_s;
                var10 = 0;
                L16: while (true) {
                  if (var6 <= var10) {
                    break L12;
                  } else {
                    param0[var7 + var10] = ((io) this).field_p[var10] * var8 + param0[var7 - -var10] * var9 >> 1950274152;
                    var10++;
                    continue L16;
                  }
                }
              }
            }
          }
          return;
        }
    }

    private final void a(int param0, byte param1, gh param2, int param3) {
        param2.b(-1, (byte) 69, param0);
        param2.b(param3, (byte) -118);
        if (param1 != -13) {
            io.a(-10, true);
        }
    }

    final sg b() {
        return null;
    }

    final synchronized int c() {
        return 2;
    }

    public static void c(int param0) {
        field_z = null;
        field_C = null;
        field_u = null;
        field_n = null;
        if (param0 < 61) {
            field_x = null;
        }
        field_x = null;
    }

    final sg a() {
        return null;
    }

    final static void a(int param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        kc var9_ref_kc = null;
        int var10_int = 0;
        nl var10 = null;
        int var11_int = 0;
        nl var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        kc var15 = null;
        kc var16 = null;
        int var17 = 0;
        int stackIn_1_0 = 0;
        int stackIn_2_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        kc stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        kc stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        kc stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_41_0 = 0;
        int stackOut_0_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        kc stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        kc stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        kc stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_32_0 = 0;
        L0: {
          var14 = ArcanistsMulti.field_G ? 1 : 0;
          fh.field_g = de.field_e;
          ri.field_a = de.field_j;
          stackOut_0_0 = 16;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param1) {
            stackOut_2_0 = stackIn_2_0;
            stackOut_2_1 = oo.field_y;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = stackIn_1_0;
            stackOut_1_1 = sm.field_a;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ej.a(stackIn_3_0, stackIn_3_1);
          tn.field_Ob.a(0, 0, -42 + hl.field_m.field_I, hl.field_m.field_x, 5);
          aj.field_d.a(bk.field_M.field_x, 0, 0, ga.field_r, (byte) -120);
          stackOut_3_0 = qc.field_d;
          stackOut_3_1 = bk.field_M.field_x;
          stackIn_5_0 = stackOut_3_0;
          stackIn_5_1 = stackOut_3_1;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          if (!fc.field_a) {
            stackOut_5_0 = (kc) (Object) stackIn_5_0;
            stackOut_5_1 = stackIn_5_1;
            stackOut_5_2 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            stackIn_6_2 = stackOut_5_2;
            break L1;
          } else {
            stackOut_4_0 = (kc) (Object) stackIn_4_0;
            stackOut_4_1 = stackIn_4_1;
            stackOut_4_2 = nn.field_p - -2 - -42;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_6_2 = stackOut_4_2;
            break L1;
          }
        }
        L2: {
          ((kc) (Object) stackIn_6_0).a(stackIn_6_1 - stackIn_6_2, 0, ga.field_r + 2, 18, (byte) -120);
          hf.field_q.a(nn.field_p + 42, -40 + (bk.field_M.field_x + -nn.field_p + -2), ga.field_r - -2, 18, (byte) -120);
          lf.field_b.a(ga.field_r - -22, nn.field_p, bk.field_M.field_x, false, 0, bk.field_M.field_I - (ga.field_r - -2) + -20, 2);
          var2 = -29 / ((84 - param0) / 36);
          mo.field_o.a(hl.field_m.field_x, 0, -40 + hl.field_m.field_I, 40, (byte) -120);
          nl.field_Db.a(oh.field_h.field_x, 0, 0, 30, (byte) -120);
          mi.field_m.a(oh.field_h.field_x, 0, 30, -42 + oh.field_h.field_I - 30, (byte) -120);
          var3 = 3 + vf.field_l;
          if ((ao.field_h.length ^ -1) > -3) {
            var3--;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (param1) {
            var3--;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          var4 = ((var3 + 1) / 2 + (2 + (-5 + mi.field_m.field_I) + -5 - 10)) / (1 + var3) - 2;
          if ((var4 ^ -1) >= -31) {
            break L4;
          } else {
            var4 = 30;
            break L4;
          }
        }
        L5: {
          var5 = -(var3 * (2 + var4)) + (mi.field_m.field_I + -10);
          if (var5 <= 40) {
            break L5;
          } else {
            var5 = 40;
            break L5;
          }
        }
        ib.field_s.a(-5 + mi.field_m.field_x - 5, 5, 5, var5, (byte) -120);
        var6 = var5 + 7;
        var7 = 0;
        L6: while (true) {
          if (var7 >= 4 + vf.field_l) {
            nl.field_Fb.a(360, -360 + de.field_e >> -1032561023, 10, -14 + (-120 + (de.field_j - 10)), (byte) -120);
            hf.field_t.a(nl.field_Fb.field_x, 0, 0, 24, (byte) -120);
            gk.field_g.a(nl.field_Fb.field_x, 0, 24, -24 + nl.field_Fb.field_I, (byte) -120);
            gk.field_g.field_v = of.a(3, gk.field_g.field_I, 1, 1, 11579568, 8421504);
            mj.field_s.a(-10 + gk.field_g.field_x, 5, 5, -2 + (-34 + gk.field_g.field_I), (byte) -120);
            gj.field_d.a(80, (-80 + gk.field_g.field_x) / 2, gk.field_g.field_I - 5 - 24, 24, (byte) -120);
            ie.l((byte) 112);
            return;
          } else {
            L7: {
              if (var7 != -2) {
                break L7;
              } else {
                if (-3 <= ao.field_h.length) {
                  break L7;
                } else {
                  var7++;
                  continue L6;
                }
              }
            }
            L8: {
              if (-4 != var7) {
                break L8;
              } else {
                if (-2 < le.field_q) {
                  break L8;
                } else {
                  var7++;
                  continue L6;
                }
              }
            }
            L9: {
              if (param1) {
                break L9;
              } else {
                if (3 == var7) {
                  var16 = wd.field_g[var7];
                  wd.field_g[var7].field_I = 0;
                  var16.field_x = 0;
                  var9 = 0;
                  L10: while (true) {
                    if (s.field_e[var7].length > var9) {
                      if (s.field_e[var7][var9] != null) {
                        var10 = s.field_e[var7][var9];
                        s.field_e[var7][var9].field_I = 0;
                        var10.field_x = 0;
                        var9++;
                        continue L10;
                      } else {
                        var9++;
                        continue L10;
                      }
                    } else {
                      var7++;
                      continue L6;
                    }
                  }
                } else {
                  break L9;
                }
              }
            }
            L11: {
              if (!param1) {
                break L11;
              } else {
                if (0 == var7) {
                  var15 = wd.field_g[var7];
                  wd.field_g[var7].field_I = 0;
                  var15.field_x = 0;
                  var9 = 0;
                  L12: while (true) {
                    if (s.field_e[var7].length > var9) {
                      if (s.field_e[var7][var9] != null) {
                        var10 = s.field_e[var7][var9];
                        s.field_e[var7][var9].field_I = 0;
                        var10.field_x = 0;
                        var9++;
                        continue L12;
                      } else {
                        var9++;
                        continue L12;
                      }
                    } else {
                      var7++;
                      continue L6;
                    }
                  }
                } else {
                  break L11;
                }
              }
            }
            L13: {
              if (param1) {
                if ((var7 ^ -1) <= -5) {
                  if (dh.field_Fb != null) {
                    if (dh.field_Fb[-4 + var7]) {
                      stackOut_39_0 = 1;
                      stackIn_41_0 = stackOut_39_0;
                      break L13;
                    } else {
                      stackOut_38_0 = 0;
                      stackIn_41_0 = stackOut_38_0;
                      break L13;
                    }
                  } else {
                    stackOut_36_0 = 0;
                    stackIn_41_0 = stackOut_36_0;
                    break L13;
                  }
                } else {
                  stackOut_34_0 = 0;
                  stackIn_41_0 = stackOut_34_0;
                  break L13;
                }
              } else {
                stackOut_32_0 = 0;
                stackIn_41_0 = stackOut_32_0;
                break L13;
              }
            }
            var8 = stackIn_41_0;
            if (var8 != 0) {
              var9_ref_kc = wd.field_g[var7];
              wd.field_g[var7].field_I = 0;
              var9_ref_kc.field_x = 0;
              var17 = 0;
              var10_int = var17;
              L14: while (true) {
                if (s.field_e[var7].length > var17) {
                  if (s.field_e[var7][var17] != null) {
                    var11 = s.field_e[var7][var17];
                    s.field_e[var7][var17].field_I = 0;
                    var11.field_x = 0;
                    var17++;
                    continue L14;
                  } else {
                    var17++;
                    continue L14;
                  }
                } else {
                  var7++;
                  continue L6;
                }
              }
            } else {
              L15: {
                wd.field_g[var7].a(103, 5, var6, var4, (byte) -120);
                var9 = 110;
                if (param1) {
                  s.field_e[var7][0].a(2, 0, var4, 38, var9, var6, mm.field_p);
                  var9 += 40;
                  break L15;
                } else {
                  if (s.field_e[var7][0] == null) {
                    break L15;
                  } else {
                    var10 = s.field_e[var7][0];
                    s.field_e[var7][0].field_I = 0;
                    var10.field_x = 0;
                    break L15;
                  }
                }
              }
              var10_int = 2 + oh.field_h.field_x + -5 + -var9;
              var11_int = -1 + s.field_e[var7].length;
              var12 = 0;
              L16: while (true) {
                if (var12 >= var11_int) {
                  var6 = var6 + (2 + var4);
                  var7++;
                  continue L6;
                } else {
                  var13 = var10_int * var12 / var11_int;
                  s.field_e[var7][1 + var12].a(2, 0, var4, -var13 + (var12 + 1) * var10_int / var11_int + -2, var9 + var13, var6, mm.field_p);
                  var12++;
                  continue L16;
                }
              }
            }
          }
        }
    }

    final static void a(java.awt.Color param0, String param1, boolean param2, int param3, int param4) {
        Exception var5 = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        Throwable decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param4 == -6885) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        field_u = null;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var9 = on.field_c.getGraphics();
                        if (null == jb.field_m) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        jb.field_m = new java.awt.Font("Helvetica", 1, 13);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (!param2) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var9.setColor(java.awt.Color.black);
                        var9.fillRect(0, 0, o.field_r, co.field_c);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param0 != null) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        param0 = new java.awt.Color(140, 17, 17);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (null == ik.field_e) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        ik.field_e = on.field_c.createImage(304, 34);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var10 = ik.field_e.getGraphics();
                        var10.setColor(param0);
                        var10.drawRect(0, 0, 303, 33);
                        var10.fillRect(2, 2, 3 * param3, 30);
                        var10.setColor(java.awt.Color.black);
                        var10.drawRect(1, 1, 301, 31);
                        var10.fillRect(2 + param3 * 3, 2, -(param3 * 3) + 300, 30);
                        var10.setFont(jb.field_m);
                        var10.setColor(java.awt.Color.white);
                        var10.drawString(param1, (-(param1.length() * 6) + 304) / 2, 22);
                        boolean discarded$2 = var9.drawImage(ik.field_e, o.field_r / 2 + -152, co.field_c / 2 - 18, (java.awt.image.ImageObserver) null);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var6 = (Exception) (Object) caughtException;
                        var7 = -152 + o.field_r / 2;
                        var8 = -18 + co.field_c / 2;
                        var9.setColor(param0);
                        var9.drawRect(var7, var8, 303, 33);
                        var9.fillRect(2 + var7, var8 - -2, param3 * 3, 30);
                        var9.setColor(java.awt.Color.black);
                        var9.drawRect(var7 - -1, var8 - -1, 301, 31);
                        var9.fillRect(var7 + (2 - -(3 * param3)), 2 + var8, -(param3 * 3) + 300, 30);
                        var9.setFont(jb.field_m);
                        var9.setColor(java.awt.Color.white);
                        var9.drawString(param1, var7 + (304 - param1.length() * 6) / 2, var8 - -22);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (jh.field_a != null) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var9.setFont(jb.field_m);
                        var9.setColor(java.awt.Color.white);
                        var9.drawString(jh.field_a, o.field_r / 2 + -(6 * jh.field_a.length() / 2), -26 + co.field_c / 2);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    var5 = (Exception) (Object) caughtException;
                    on.field_c.repaint();
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private io() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        ch.field_b = param0;
        if (!(eh.field_e != null)) {
            eh.field_e = new qb(640, 480);
            if (de.field_l.length != eh.field_e.field_A.length) {
                var2 = 0;
                for (var3 = -eh.field_e.field_A.length; var3 < 0; var3++) {
                    eh.field_e.field_A[var2] = de.field_l[var2];
                    var2++;
                }
                eh.field_e.a();
                de.d(2, 2, 0, 0, 640, 480);
            }
        }
        var2 = -44 % ((-45 - param1) / 34);
        vf.field_g.a(true, 0, false, rl.a(me.field_I, an.field_g, -121));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "You can change your character's appearance on the 'Character Creation' screen, accessed from the main menu. There are thousands of combinations!";
        field_u = "You just fell into the water! Normally, this would injure you, but this arena is more lenient. In a competitive match you should avoid falling into the water at all costs. Remember that, if you lose your position, you can press 'N' to centre the screen back on your Arcanist.";
        field_z = "Book of Stone";
        field_C = "Open";
    }
}
