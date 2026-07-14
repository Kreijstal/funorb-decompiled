/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud extends hj {
    private tv field_t;
    private int field_C;
    static hr[] field_q;
    private int[] field_s;
    private tv field_y;
    private int[] field_A;
    private boolean field_u;
    static ri field_p;
    private tv field_v;
    private int field_z;
    private int field_B;
    private bs field_D;
    private boolean field_w;
    bs field_r;
    bs field_x;
    private int field_o;

    public static void c(int param0) {
        field_p = null;
        int var1 = -38 / ((-89 - param0) / 33);
        field_q = null;
    }

    final synchronized void a(int param0, int param1, tv param2, boolean param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_31_0 = 0;
        bs stackIn_39_0 = null;
        bs stackIn_40_0 = null;
        bs stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        bs stackIn_49_0 = null;
        bs stackIn_50_0 = null;
        bs stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        Object stackOut_18_0 = null;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        bs stackOut_48_0 = null;
        bs stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        bs stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        bs stackOut_38_0 = null;
        bs stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        bs stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        L0: {
          var8 = Sumoblitz.field_L ? 1 : 0;
          if (!((ud) this).field_u) {
            break L0;
          } else {
            if (param3) {
              L1: {
                if (((ud) this).field_C <= 0) {
                  L2: {
                    if (null != ((ud) this).field_y) {
                      ((ud) this).field_r.e(0);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  ((ud) this).field_y = param2;
                  if (param2 != null) {
                    ((ud) this).field_r.a(false, param2, 60);
                    this.a(param1, (byte) 24, ((ud) this).field_r, param5);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  L3: {
                    if (((ud) this).field_v != null) {
                      ((ud) this).field_x.e(0);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  ((ud) this).field_v = param2;
                  if (param2 == null) {
                    break L1;
                  } else {
                    ((ud) this).field_x.a(false, param2, 117);
                    this.a(param1, (byte) 39, ((ud) this).field_x, param5);
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
          if (param0 == 1) {
            break L4;
          } else {
            var9 = null;
            ud.a(57, -30, 8, 30, (wb[]) null);
            break L4;
          }
        }
        L5: {
          stackOut_18_0 = this;
          stackIn_20_0 = stackOut_18_0;
          stackIn_19_0 = stackOut_18_0;
          if (!param3) {
            stackOut_20_0 = this;
            stackOut_20_1 = 0;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            break L5;
          } else {
            stackOut_19_0 = this;
            stackOut_19_1 = 1;
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            break L5;
          }
        }
        ((ud) this).field_u = stackIn_21_1 != 0;
        if (param2 != ((ud) this).field_v) {
          if (param2 != ((ud) this).field_y) {
            L6: {
              if (((ud) this).field_v != null) {
                if (((ud) this).field_y == null) {
                  var7 = 0;
                  break L6;
                } else {
                  L7: {
                    if (524288 <= ((ud) this).field_o) {
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
                }
              } else {
                var7 = 1;
                break L6;
              }
            }
            L8: {
              if (var7 == 0) {
                L9: {
                  if (null != ((ud) this).field_y) {
                    ((ud) this).field_r.e(0);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  ((ud) this).field_y = param2;
                  if (param2 != null) {
                    L11: {
                      stackOut_48_0 = ((ud) this).field_r;
                      stackIn_50_0 = stackOut_48_0;
                      stackIn_49_0 = stackOut_48_0;
                      if (param3) {
                        stackOut_50_0 = (bs) (Object) stackIn_50_0;
                        stackOut_50_1 = 0;
                        stackIn_51_0 = stackOut_50_0;
                        stackIn_51_1 = stackOut_50_1;
                        break L11;
                      } else {
                        stackOut_49_0 = (bs) (Object) stackIn_49_0;
                        stackOut_49_1 = 1;
                        stackIn_51_0 = stackOut_49_0;
                        stackIn_51_1 = stackOut_49_1;
                        break L11;
                      }
                    }
                    ((bs) (Object) stackIn_51_0).a(stackIn_51_1 != 0, param2, param0 + 67);
                    this.a(param1, (byte) 45, ((ud) this).field_r, param5);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                ((ud) this).field_C = -param4;
                break L8;
              } else {
                L12: {
                  if (null == ((ud) this).field_v) {
                    break L12;
                  } else {
                    ((ud) this).field_x.e(param0 + -1);
                    break L12;
                  }
                }
                L13: {
                  ((ud) this).field_v = param2;
                  if (param2 != null) {
                    L14: {
                      stackOut_38_0 = ((ud) this).field_x;
                      stackIn_40_0 = stackOut_38_0;
                      stackIn_39_0 = stackOut_38_0;
                      if (param3) {
                        stackOut_40_0 = (bs) (Object) stackIn_40_0;
                        stackOut_40_1 = 0;
                        stackIn_41_0 = stackOut_40_0;
                        stackIn_41_1 = stackOut_40_1;
                        break L14;
                      } else {
                        stackOut_39_0 = (bs) (Object) stackIn_39_0;
                        stackOut_39_1 = 1;
                        stackIn_41_0 = stackOut_39_0;
                        stackIn_41_1 = stackOut_39_1;
                        break L14;
                      }
                    }
                    ((bs) (Object) stackIn_41_0).a(stackIn_41_1 != 0, param2, 121);
                    this.a(param1, (byte) -114, ((ud) this).field_x, param5);
                    break L13;
                  } else {
                    break L13;
                  }
                }
                ((ud) this).field_C = param4;
                break L8;
              }
            }
            return;
          } else {
            ((ud) this).field_C = -param4;
            this.a(param1, (byte) -82, ((ud) this).field_r, param5);
            return;
          }
        } else {
          ((ud) this).field_C = param4;
          this.a(param1, (byte) -114, ((ud) this).field_x, param5);
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, wb[] param4) {
        int var10 = Sumoblitz.field_L ? 1 : 0;
        if (param4 != null) {
            // if_icmple L20
        } else {
            return;
        }
        int var5 = param4[0].field_z;
        int var6 = param4[2].field_z;
        int var7 = param4[1].field_z;
        param4[0].a(param3, param0);
        param4[param2].a(-var6 + (param1 + param3), param0);
        lk.b(mo.field_t);
        lk.e(param3 + var5, param0, -var6 + param3 - -param1, param4[1].field_w + param0);
        int var8 = param3 + var5;
        int var9 = param1 + param3 + -var6;
        param3 = var8;
        while (param3 < var9) {
            param4[1].a(param3, param0);
            param3 = param3 + var7;
        }
        lk.a(mo.field_t);
    }

    private final void a(int param0, byte param1, bs param2, int param3) {
        param2.a((byte) -86, -1, param3);
        param2.b(param0, 0);
        int var5 = -21 / ((param1 - -28) / 47);
    }

    final synchronized void a(byte param0, int param1) {
        if (param0 != -43) {
            return;
        }
        ((ud) this).field_B = param1;
    }

    private final void a(bs param0, int param1, bs param2) {
        if (param1 > -55) {
            int discarded$0 = ((ud) this).d();
        }
        ((ud) this).field_o = 1048576;
        ((ud) this).field_r = param0;
        ((ud) this).field_x = param2;
    }

    final hj c() {
        return null;
    }

    final synchronized void a(int param0) {
        int var3 = 0;
        L0: {
          var3 = Sumoblitz.field_L ? 1 : 0;
          if (-1 <= (((ud) this).field_o ^ -1)) {
            if ((((ud) this).field_o ^ -1) <= -1048577) {
              break L0;
            } else {
              if (null == ((ud) this).field_y) {
                break L0;
              } else {
                ((ud) this).field_r.a(param0);
                break L0;
              }
            }
          } else {
            if ((((ud) this).field_o ^ -1) <= -1048577) {
              break L0;
            } else {
              if (null == ((ud) this).field_y) {
                break L0;
              } else {
                ((ud) this).field_r.a(param0);
                break L0;
              }
            }
          }
        }
        L1: {
          if (0 >= ((ud) this).field_z) {
            break L1;
          } else {
            if (((ud) this).field_t == null) {
              break L1;
            } else {
              ((ud) this).field_D.a(param0);
              break L1;
            }
          }
        }
        L2: {
          if (!((ud) this).field_u) {
            break L2;
          } else {
            L3: {
              if ((((ud) this).field_C ^ -1) >= -1) {
                break L3;
              } else {
                if (!((ud) this).field_x.c(-8192)) {
                  ((ud) this).field_C = -((ud) this).field_C;
                  ((ud) this).field_u = false;
                  ((ud) this).field_v = null;
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if (0 <= ((ud) this).field_C) {
              break L2;
            } else {
              if (!((ud) this).field_r.c(-8192)) {
                ((ud) this).field_C = -((ud) this).field_C;
                ((ud) this).field_y = null;
                ((ud) this).field_u = false;
                break L2;
              } else {
                break L2;
              }
            }
          }
        }
        L4: {
          if (((ud) this).field_C != 0) {
            ((ud) this).field_o = ((ud) this).field_o + ((ud) this).field_C * param0;
            if ((((ud) this).field_o ^ -1) > -1048577) {
              if (0 < ((ud) this).field_o) {
                break L4;
              } else {
                ((ud) this).field_o = 0;
                if (!((ud) this).field_u) {
                  ((ud) this).field_C = 0;
                  if (((ud) this).field_w) {
                    break L4;
                  } else {
                    L5: {
                      if (((ud) this).field_v == null) {
                        break L5;
                      } else {
                        ((ud) this).field_x.e(0);
                        break L5;
                      }
                    }
                    ((ud) this).field_v = null;
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
            } else {
              ((ud) this).field_o = 1048576;
              if (!((ud) this).field_u) {
                ((ud) this).field_C = 0;
                if (!((ud) this).field_w) {
                  L6: {
                    if (((ud) this).field_y != null) {
                      ((ud) this).field_r.e(0);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  ((ud) this).field_y = null;
                  break L4;
                } else {
                  break L4;
                }
              } else {
                break L4;
              }
            }
          } else {
            break L4;
          }
        }
    }

    final synchronized int d() {
        return 2;
    }

    final hj a() {
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
        int stackIn_31_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_59_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        var11 = Sumoblitz.field_L ? 1 : 0;
        if (-1 > (((ud) this).field_B ^ -1)) {
          L0: {
            if (!((ud) this).field_u) {
              break L0;
            } else {
              L1: {
                if (0 >= ((ud) this).field_C) {
                  break L1;
                } else {
                  if (!((ud) this).field_x.c(-8192)) {
                    ((ud) this).field_u = false;
                    ((ud) this).field_C = -((ud) this).field_C;
                    ((ud) this).field_v = null;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              if (0 <= ((ud) this).field_C) {
                break L0;
              } else {
                if (!((ud) this).field_r.c(-8192)) {
                  ((ud) this).field_y = null;
                  ((ud) this).field_C = -((ud) this).field_C;
                  ((ud) this).field_u = false;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
          L2: {
            var4 = (((ud) this).field_o >> -610152532) * ((ud) this).field_B / 256;
            var5 = ((ud) this).field_B - var4;
            if (-1 == (((ud) this).field_C ^ -1)) {
              break L2;
            } else {
              ((ud) this).field_o = ((ud) this).field_o + ((ud) this).field_C * param2;
              if (((ud) this).field_o < 1048576) {
                if (0 < ((ud) this).field_o) {
                  break L2;
                } else {
                  ((ud) this).field_o = 0;
                  if (((ud) this).field_u) {
                    break L2;
                  } else {
                    ((ud) this).field_C = 0;
                    if (!((ud) this).field_w) {
                      L3: {
                        if (null != ((ud) this).field_v) {
                          ((ud) this).field_x.e(0);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      ((ud) this).field_v = null;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              } else {
                ((ud) this).field_o = 1048576;
                if (!((ud) this).field_u) {
                  ((ud) this).field_C = 0;
                  if (!((ud) this).field_w) {
                    L4: {
                      if (null == ((ud) this).field_y) {
                        break L4;
                      } else {
                        ((ud) this).field_r.e(0);
                        break L4;
                      }
                    }
                    ((ud) this).field_y = null;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
            }
          }
          L5: {
            if (du.field_o) {
              stackOut_30_0 = param2 << 1771722849;
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
            if ((((ud) this).field_z ^ -1) <= -257) {
              break L6;
            } else {
              L7: {
                if (((ud) this).field_v != null) {
                  break L7;
                } else {
                  if (((ud) this).field_y == null) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              if ((var4 ^ -1) == -257) {
                ((ud) this).field_x.b(param0, param1, param2);
                break L6;
              } else {
                if (256 != var5) {
                  L8: {
                    L9: {
                      if (((ud) this).field_s == null) {
                        break L9;
                      } else {
                        if (var6 <= ((ud) this).field_s.length) {
                          la.a(((ud) this).field_s, 0, var6);
                          la.a(((ud) this).field_A, 0, var6);
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    ((ud) this).field_s = new int[var6];
                    ((ud) this).field_A = new int[var6];
                    break L8;
                  }
                  L10: {
                    ((ud) this).field_x.b(((ud) this).field_s, 0, param2);
                    ((ud) this).field_r.b(((ud) this).field_A, 0, param2);
                    if (!du.field_o) {
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
                      param0[var8 + var7] = param0[var8 + var7] + (var5 * ((ud) this).field_A[var8] + var4 * ((ud) this).field_s[var8] >> -1622576056);
                      var8++;
                      continue L11;
                    }
                  }
                } else {
                  ((ud) this).field_r.b(param0, param1, param2);
                  break L6;
                }
              }
            }
          }
          L12: {
            if (null == ((ud) this).field_t) {
              break L12;
            } else {
              if (((ud) this).field_z == 0) {
                break L12;
              } else {
                L13: {
                  L14: {
                    if (((ud) this).field_s == null) {
                      break L14;
                    } else {
                      if (var6 > ((ud) this).field_s.length) {
                        break L14;
                      } else {
                        la.a(((ud) this).field_s, 0, var6);
                        break L13;
                      }
                    }
                  }
                  ((ud) this).field_A = new int[var6];
                  ((ud) this).field_s = new int[var6];
                  break L13;
                }
                L15: {
                  ((ud) this).field_D.b(((ud) this).field_s, 0, param2);
                  if (du.field_o) {
                    param1 = param1 << 1;
                    stackOut_58_0 = param1 << 1;
                    stackIn_59_0 = stackOut_58_0;
                    break L15;
                  } else {
                    stackOut_57_0 = param1;
                    stackIn_59_0 = stackOut_57_0;
                    break L15;
                  }
                }
                var7 = stackIn_59_0;
                var8 = ((ud) this).field_z * ((ud) this).field_B / 256;
                var9 = ((ud) this).field_B - var8;
                var10 = 0;
                L16: while (true) {
                  if (var6 <= var10) {
                    break L12;
                  } else {
                    param0[var10 + var7] = ((ud) this).field_s[var10] * var8 + param0[var10 + var7] * var9 >> -1592342008;
                    var10++;
                    continue L16;
                  }
                }
              }
            }
          }
          return;
        } else {
          ((ud) this).a(param2);
          return;
        }
    }

    ud(bs param0, bs param1) {
        ((ud) this).field_B = 256;
        ((ud) this).field_w = false;
        ((ud) this).field_z = 0;
        this.a(param1, -79, param0);
    }

    static {
    }
}
