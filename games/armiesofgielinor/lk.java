/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lk implements kh, pm {
    ka field_q;
    int field_m;
    int field_n;
    int field_g;
    static je field_a;
    static boolean field_f;
    private boolean field_c;
    int field_d;
    static String field_r;
    static int field_h;
    static int field_p;
    int field_l;
    static String field_s;
    int field_i;
    static nm field_e;
    int field_j;
    int field_o;
    private int field_b;
    int field_t;
    int field_k;

    lk(ka param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    private final int a(kb param0, int param1, int param2, int param3) {
        if (param2 != 0) {
          field_f = false;
          return param1 + ((lk) this).field_g + param0.field_p + (param3 - -param0.field_z);
        } else {
          return param1 + ((lk) this).field_g + param0.field_p + (param3 - -param0.field_z);
        }
    }

    final void a(lk param0, int param1) {
        param0.field_i = ((lk) this).field_i;
        param0.field_g = ((lk) this).field_g;
        param0.field_o = ((lk) this).field_o;
        param0.field_n = ((lk) this).field_n;
        param0.field_l = ((lk) this).field_l;
        param0.field_k = ((lk) this).field_k;
        param0.field_m = ((lk) this).field_m;
        param0.field_c = ((lk) this).field_c;
        param0.field_b = ((lk) this).field_b;
        param0.field_j = ((lk) this).field_j;
        param0.field_q = ((lk) this).field_q;
        param0.field_d = ((lk) this).field_d;
        param0.field_t = ((lk) this).field_t;
        if (param1 != 24978) {
            Object var4 = null;
            int discarded$0 = ((lk) this).a((kb) null, -24, 63, -48, 119, -128);
        }
    }

    public final void a(int param0, int param1, int param2, kb param3, int param4) {
        int var7 = 0;
        ts var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object var13 = null;
        ju var14 = null;
        ju var15 = null;
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        L0: {
          if (!param3.a(false)) {
            break L0;
          } else {
            L1: {
              var14 = ((lk) this).a(-75, param3);
              var15 = var14;
              var7 = var15.a(param1 + -1024, param4);
              var8 = var14.field_b[var7];
              var9 = var15.a((byte) -66, param4);
              var10 = this.a(param2, param3, var9, 68);
              var11 = ((lk) this).a(-18033, param0, param3) - -Math.max(0, var8.field_n);
              stackOut_1_0 = ((lk) this).a(param1 ^ -17009, param0, param3);
              stackOut_1_1 = this.c(-87, param3);
              stackOut_1_2 = var8.field_c;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_3_2 = stackOut_1_2;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              stackIn_2_2 = stackOut_1_2;
              if (var15.field_b.length <= 1 + var7) {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = stackIn_3_2;
                stackOut_3_3 = var8.field_c;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                stackIn_4_3 = stackOut_3_3;
                break L1;
              } else {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = stackIn_2_2;
                stackOut_2_3 = var14.field_b[1 + var7].field_n;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                stackIn_4_3 = stackOut_2_3;
                break L1;
              }
            }
            var12 = stackIn_4_0 + Math.min(stackIn_4_1, Math.min(stackIn_4_2, stackIn_4_3));
            id.a(param2 - -param3.field_B, param3.field_B + param2 + param3.field_l, param3.field_w + (param3.field_p + param0), param3.field_p + param0, (byte) 100);
            t.field_c.a(((lk) this).field_o, var12, var10, (byte) 101, var11, var10);
            rf.b(-18862);
            break L0;
          }
        }
        if (param1 != 1024) {
          var13 = null;
          String discarded$2 = ((lk) this).d(35, (kb) null);
          return;
        } else {
          return;
        }
    }

    private final int c(int param0, kb param1) {
        int var3 = 16 / ((-48 - param0) / 33);
        return -((lk) this).field_m + (param1.field_w + -((lk) this).field_g);
    }

    private final void b(kb param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0.field_u == null) {
          param0.field_u = (ju) (Object) new ak();
          var4 = 78 % ((60 - param1) / 38);
          var3 = ((lk) this).b(55, param0);
          var5 = this.c(83, param0);
          var7 = ((lk) this).field_k;
          if (var7 == 0) {
            var6 = ((lk) this).field_q.field_H;
            var7 = ((lk) this).field_n;
            if (-1 != (var7 ^ -1)) {
              if (3 != var7) {
                if (var7 == 1) {
                  if (param0.field_u instanceof ak) {
                    ((ak) (Object) param0.field_u).a(var6, (byte) 117, ((lk) this).field_q, ((lk) this).d(0, param0), var3 >> -1223110527);
                    return;
                  } else {
                    return;
                  }
                } else {
                  L0: {
                    if ((var7 ^ -1) != -3) {
                      break L0;
                    } else {
                      if (!(param0.field_u instanceof ak)) {
                        break L0;
                      } else {
                        ((ak) (Object) param0.field_u).a(var3, ((lk) this).d(0, param0), ((lk) this).field_q, -31932, var6);
                        return;
                      }
                    }
                  }
                  return;
                }
              } else {
                L1: {
                  if (!(param0.field_u instanceof ak)) {
                    break L1;
                  } else {
                    ((ak) (Object) param0.field_u).a(((lk) this).d(0, param0), 0, ((lk) this).field_q, var6, 0);
                    break L1;
                  }
                }
                return;
              }
            } else {
              L2: {
                if (!(param0.field_u instanceof ak)) {
                  break L2;
                } else {
                  ((ak) (Object) param0.field_u).a(((lk) this).d(0, param0), 0, ((lk) this).field_q, var6, 0);
                  break L2;
                }
              }
              return;
            }
          } else {
            if ((var7 ^ -1) == -3) {
              var6 = -((lk) this).field_q.field_L + var5;
              var7 = ((lk) this).field_n;
              if (-1 != (var7 ^ -1)) {
                if (3 != var7) {
                  if (var7 == 1) {
                    if (param0.field_u instanceof ak) {
                      ((ak) (Object) param0.field_u).a(var6, (byte) 117, ((lk) this).field_q, ((lk) this).d(0, param0), var3 >> -1223110527);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L3: {
                      if ((var7 ^ -1) != -3) {
                        break L3;
                      } else {
                        if (!(param0.field_u instanceof ak)) {
                          break L3;
                        } else {
                          ((ak) (Object) param0.field_u).a(var3, ((lk) this).d(0, param0), ((lk) this).field_q, -31932, var6);
                          return;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  if (param0.field_u instanceof ak) {
                    ((ak) (Object) param0.field_u).a(((lk) this).d(0, param0), 0, ((lk) this).field_q, var6, 0);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                L4: {
                  if (!(param0.field_u instanceof ak)) {
                    break L4;
                  } else {
                    ((ak) (Object) param0.field_u).a(((lk) this).d(0, param0), 0, ((lk) this).field_q, var6, 0);
                    break L4;
                  }
                }
                return;
              }
            } else {
              if (var7 != 3) {
                if ((var7 ^ -1) == -2) {
                  var6 = ((lk) this).field_q.field_H + (-((lk) this).field_q.field_L + (var5 + -((lk) this).field_q.field_H) >> 846808609);
                  var7 = ((lk) this).field_n;
                  if (-1 != (var7 ^ -1)) {
                    if (3 != var7) {
                      if (var7 == 1) {
                        if (param0.field_u instanceof ak) {
                          ((ak) (Object) param0.field_u).a(var6, (byte) 117, ((lk) this).field_q, ((lk) this).d(0, param0), var3 >> -1223110527);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        if ((var7 ^ -1) == -3) {
                          if (param0.field_u instanceof ak) {
                            ((ak) (Object) param0.field_u).a(var3, ((lk) this).d(0, param0), ((lk) this).field_q, -31932, var6);
                            return;
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      }
                    } else {
                      L5: {
                        if (!(param0.field_u instanceof ak)) {
                          break L5;
                        } else {
                          ((ak) (Object) param0.field_u).a(((lk) this).d(0, param0), 0, ((lk) this).field_q, var6, 0);
                          break L5;
                        }
                      }
                      return;
                    }
                  } else {
                    L6: {
                      if (!(param0.field_u instanceof ak)) {
                        break L6;
                      } else {
                        ((ak) (Object) param0.field_u).a(((lk) this).d(0, param0), 0, ((lk) this).field_q, var6, 0);
                        break L6;
                      }
                    }
                    return;
                  }
                } else {
                  var6 = ((lk) this).field_q.field_H + (-((lk) this).field_q.field_L + (var5 + -((lk) this).field_q.field_H) >> 846808609);
                  var7 = ((lk) this).field_n;
                  if (-1 != (var7 ^ -1)) {
                    if (3 != var7) {
                      if (var7 == 1) {
                        if (!(param0.field_u instanceof ak)) {
                          return;
                        } else {
                          ((ak) (Object) param0.field_u).a(var6, (byte) 117, ((lk) this).field_q, ((lk) this).d(0, param0), var3 >> -1223110527);
                          return;
                        }
                      } else {
                        if ((var7 ^ -1) == -3) {
                          if (param0.field_u instanceof ak) {
                            ((ak) (Object) param0.field_u).a(var3, ((lk) this).d(0, param0), ((lk) this).field_q, -31932, var6);
                            return;
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      }
                    } else {
                      if (param0.field_u instanceof ak) {
                        ((ak) (Object) param0.field_u).a(((lk) this).d(0, param0), 0, ((lk) this).field_q, var6, 0);
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (param0.field_u instanceof ak) {
                      ((ak) (Object) param0.field_u).a(((lk) this).d(0, param0), 0, ((lk) this).field_q, var6, 0);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                var6 = ((lk) this).field_q.field_H + (-((lk) this).field_q.field_L + (var5 + -((lk) this).field_q.field_H) >> 846808609);
                var7 = ((lk) this).field_n;
                if (-1 != (var7 ^ -1)) {
                  if (3 != var7) {
                    if (var7 == 1) {
                      if (param0.field_u instanceof ak) {
                        ((ak) (Object) param0.field_u).a(var6, (byte) 117, ((lk) this).field_q, ((lk) this).d(0, param0), var3 >> -1223110527);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      L7: {
                        if ((var7 ^ -1) != -3) {
                          break L7;
                        } else {
                          if (!(param0.field_u instanceof ak)) {
                            break L7;
                          } else {
                            ((ak) (Object) param0.field_u).a(var3, ((lk) this).d(0, param0), ((lk) this).field_q, -31932, var6);
                            return;
                          }
                        }
                      }
                      return;
                    }
                  } else {
                    if (!(param0.field_u instanceof ak)) {
                      return;
                    } else {
                      ((ak) (Object) param0.field_u).a(((lk) this).d(0, param0), 0, ((lk) this).field_q, var6, 0);
                      return;
                    }
                  }
                } else {
                  if (!(param0.field_u instanceof ak)) {
                    return;
                  } else {
                    ((ak) (Object) param0.field_u).a(((lk) this).d(0, param0), 0, ((lk) this).field_q, var6, 0);
                    return;
                  }
                }
              }
            }
          }
        } else {
          L8: {
            var4 = 78 % ((60 - param1) / 38);
            var3 = ((lk) this).b(55, param0);
            var5 = this.c(83, param0);
            var7 = ((lk) this).field_k;
            if (var7 == 0) {
              var6 = ((lk) this).field_q.field_H;
              break L8;
            } else {
              if ((var7 ^ -1) == -3) {
                var6 = -((lk) this).field_q.field_L + var5;
                break L8;
              } else {
                L9: {
                  if (var7 != 3) {
                    if ((var7 ^ -1) == -2) {
                      break L9;
                    } else {
                      break L9;
                    }
                  } else {
                    break L9;
                  }
                }
                var6 = ((lk) this).field_q.field_H + (-((lk) this).field_q.field_L + (var5 + -((lk) this).field_q.field_H) >> 846808609);
                break L8;
              }
            }
          }
          var7 = ((lk) this).field_n;
          if (-1 != (var7 ^ -1)) {
            if (3 != var7) {
              if (var7 == 1) {
                if (!(param0.field_u instanceof ak)) {
                  return;
                } else {
                  ((ak) (Object) param0.field_u).a(var6, (byte) 117, ((lk) this).field_q, ((lk) this).d(0, param0), var3 >> -1223110527);
                  return;
                }
              } else {
                if ((var7 ^ -1) == -3) {
                  if (param0.field_u instanceof ak) {
                    ((ak) (Object) param0.field_u).a(var3, ((lk) this).d(0, param0), ((lk) this).field_q, -31932, var6);
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              L10: {
                if (!(param0.field_u instanceof ak)) {
                  break L10;
                } else {
                  ((ak) (Object) param0.field_u).a(((lk) this).d(0, param0), 0, ((lk) this).field_q, var6, 0);
                  break L10;
                }
              }
              return;
            }
          } else {
            L11: {
              if (!(param0.field_u instanceof ak)) {
                break L11;
              } else {
                ((ak) (Object) param0.field_u).a(((lk) this).d(0, param0), 0, ((lk) this).field_q, var6, 0);
                break L11;
              }
            }
            return;
          }
        }
    }

    public final int a(kb param0, int param1) {
        ju discarded$7 = ((lk) this).a(-103, param0);
        if (param1 != -2) {
          field_r = null;
          return param0.field_u.a((byte) 120) - (-((lk) this).field_g - ((lk) this).field_m);
        } else {
          return param0.field_u.a((byte) 120) - (-((lk) this).field_g - ((lk) this).field_m);
        }
    }

    private final int a(int param0, kb param1, int param2, int param3) {
        int var5 = 42 / ((param3 - -63) / 35);
        return param2 + param1.field_r + param0 - (-param1.field_B - ((lk) this).field_i);
    }

    public final int a(int param0, int param1, kb param2) {
        if (param0 != -18033) {
            return 101;
        }
        return this.a(param2, 0, 0, param1);
    }

    public final int a(kb param0, int param1, byte param2) {
        if (param2 >= -108) {
            return 39;
        }
        return this.a(param1, param0, 0, -123);
    }

    public final int b(int param0, kb param1) {
        if (param0 < 44) {
          field_p = -118;
          return -((lk) this).field_t + param1.field_l - ((lk) this).field_i;
        } else {
          return -((lk) this).field_t + param1.field_l - ((lk) this).field_i;
        }
    }

    public final ju a(int param0, kb param1) {
        L0: {
          if (param1.field_u == null) {
            param1.field_u = (ju) (Object) new ak();
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 < -36) {
          if (!((lk) this).field_c) {
            this.b(param1, (byte) 112);
            return param1.field_u;
          } else {
            ((ak) (Object) param1.field_u).a(((lk) this).d(0, param1), (byte) 30, this.c(-123, param1), ((lk) this).field_k, ((lk) this).field_j, ((lk) this).field_n, ((lk) this).b(85, param1), ((lk) this).field_q);
            return param1.field_u;
          }
        } else {
          ((lk) this).field_b = 58;
          if (!((lk) this).field_c) {
            this.b(param1, (byte) 112);
            return param1.field_u;
          } else {
            ((ak) (Object) param1.field_u).a(((lk) this).d(0, param1), (byte) 30, this.c(-123, param1), ((lk) this).field_k, ((lk) this).field_j, ((lk) this).field_n, ((lk) this).b(85, param1), ((lk) this).field_q);
            return param1.field_u;
          }
        }
    }

    public void a(kb param0, int param1, int param2, boolean param3, int param4) {
        Object var7 = null;
        if (((lk) this).field_q == null) {
          return;
        } else {
          if (param2 >= -79) {
            var7 = null;
            int discarded$2 = ((lk) this).a((kb) null, 119, (byte) 95);
            this.a(param1, -251, param4, param0);
            return;
          } else {
            this.a(param1, -251, param4, param0);
            return;
          }
        }
    }

    String d(int param0, kb param1) {
        if (param0 != 0) {
            ((lk) this).field_t = -81;
            return param1.field_v;
        }
        return param1.field_v;
    }

    public final int a(kb param0, int param1, int param2, int param3, int param4, int param5) {
        if (param2 < 79) {
          return -92;
        } else {
          ju discarded$2 = ((lk) this).a(-56, param0);
          return param0.field_u.a(-((lk) this).a(param0, param5, (byte) -127) + param1, -((lk) this).a(-18033, param3, param0) + param4, -1);
        }
    }

    public final void a(int param0, int param1, int param2, kb param3, int param4, int param5) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ts var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        ju var17 = null;
        ju var18 = null;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        var16 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 == -21259) {
          if (param2 == param1) {
            return;
          } else {
            L0: {
              if (param3.a(false)) {
                L1: {
                  var17 = ((lk) this).a(-45, param3);
                  var18 = var17;
                  if (param2 < param1) {
                    var9 = param1;
                    var8 = param2;
                    break L1;
                  } else {
                    var8 = param1;
                    var9 = param2;
                    break L1;
                  }
                }
                var10 = var18.a(param0 ^ -21259, var8);
                var11 = var18.a(param0 ^ -21259, var9);
                id.a(param5 + param3.field_B, param3.field_l + (param5 - -param3.field_B), param3.field_w + (param4 - -param3.field_p), param3.field_p + param4, (byte) 116);
                var12 = var10;
                L2: while (true) {
                  if (var11 < var12) {
                    rf.b(param0 + 2397);
                    break L0;
                  } else {
                    L3: {
                      var13 = var17.field_b[var12];
                      if (var12 != var10) {
                        stackOut_14_0 = var13.field_i[0];
                        stackIn_15_0 = stackOut_14_0;
                        break L3;
                      } else {
                        stackOut_13_0 = var18.a((byte) -66, var8);
                        stackIn_15_0 = stackOut_13_0;
                        break L3;
                      }
                    }
                    L4: {
                      var14 = stackIn_15_0;
                      if (var11 != var12) {
                        if (var13 == null) {
                          stackOut_19_0 = 0;
                          stackIn_20_0 = stackOut_19_0;
                          break L4;
                        } else {
                          stackOut_18_0 = var13.field_i[var13.field_i.length - 1];
                          stackIn_20_0 = stackOut_18_0;
                          break L4;
                        }
                      } else {
                        stackOut_16_0 = var18.a((byte) -66, var9);
                        stackIn_20_0 = stackOut_16_0;
                        break L4;
                      }
                    }
                    var15 = stackIn_20_0;
                    t.field_c.a(((lk) this).field_l >>> 1572958904, this.a(param5, param3, var14, -109), ((lk) this).field_g + param4 + (param3.field_p - -param3.field_z) - -var13.field_n, true, var13.field_c, -var14 + var15, ((lk) this).field_l);
                    var12++;
                    continue L2;
                  }
                }
              } else {
                break L0;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_e = null;
        int var1 = -5 / ((-45 - param0) / 50);
        field_s = null;
        field_r = null;
    }

    final static boolean b(boolean param0) {
        if (!param0) {
            return true;
        }
        return (ib.field_j ^ -1) < -251 ? true : false;
    }

    private final void a(int param0, int param1, int param2, kb param3) {
        this.a(0, param2, param0, ((lk) this).field_d, 0, ((lk) this).field_b, param3, 2);
        if (param1 != -251) {
            ((lk) this).field_m = 1;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, kb param6, int param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param7 == 2) {
          id.a(param6.field_B + param2, param6.field_l + param2 - -param6.field_B, param6.field_w + (param6.field_p + param1), param6.field_p + param1, (byte) 91);
          var9 = ((lk) this).b(103, param6);
          var10 = this.c(-99, param6);
          if (!((lk) this).field_c) {
            var12 = ((lk) this).field_k;
            if (0 != var12) {
              if (2 != var12) {
                if (-4 != (var12 ^ -1)) {
                  if ((var12 ^ -1) != -2) {
                    var11 = ((lk) this).field_q.field_H + (-((lk) this).field_q.field_H + var10 - ((lk) this).field_q.field_L >> -1793473951);
                    var12 = ((lk) this).field_n;
                    if (0 != var12) {
                      if (var12 == 3) {
                        ((lk) this).field_q.b(((lk) this).d(0, param6), this.a(param2, param6, param0, param7 + 67), var11 + this.a(param6, param4, param7 + -2, param1), param3, param5);
                        rf.b(-18862);
                        return;
                      } else {
                        if (-2 != (var12 ^ -1)) {
                          if (var12 == 2) {
                            ((lk) this).field_q.a(((lk) this).d(param7 + -2, param6), var9 + this.a(param2, param6, param0, -114), this.a(param6, param4, 0, param1) - -var11, param3, param5);
                            rf.b(-18862);
                            return;
                          } else {
                            rf.b(-18862);
                            return;
                          }
                        } else {
                          ((lk) this).field_q.c(((lk) this).d(param7 ^ 2, param6), this.a(param2, param6, param0, -13) + (var9 >> 42811073), var11 + this.a(param6, param4, 0, param1), param3, param5);
                          rf.b(-18862);
                          return;
                        }
                      }
                    } else {
                      ((lk) this).field_q.b(((lk) this).d(0, param6), this.a(param2, param6, param0, param7 + 67), var11 + this.a(param6, param4, param7 + -2, param1), param3, param5);
                      rf.b(-18862);
                      return;
                    }
                  } else {
                    L0: {
                      var11 = ((lk) this).field_q.field_H + (-((lk) this).field_q.field_H + var10 - ((lk) this).field_q.field_L >> -1793473951);
                      var12 = ((lk) this).field_n;
                      if (0 != var12) {
                        if (var12 == 3) {
                          break L0;
                        } else {
                          if (-2 != (var12 ^ -1)) {
                            if (var12 != 2) {
                              rf.b(-18862);
                              return;
                            } else {
                              ((lk) this).field_q.a(((lk) this).d(param7 + -2, param6), var9 + this.a(param2, param6, param0, -114), this.a(param6, param4, 0, param1) - -var11, param3, param5);
                              rf.b(-18862);
                              return;
                            }
                          } else {
                            ((lk) this).field_q.c(((lk) this).d(param7 ^ 2, param6), this.a(param2, param6, param0, -13) + (var9 >> 42811073), var11 + this.a(param6, param4, 0, param1), param3, param5);
                            rf.b(-18862);
                            return;
                          }
                        }
                      } else {
                        break L0;
                      }
                    }
                    ((lk) this).field_q.b(((lk) this).d(0, param6), this.a(param2, param6, param0, param7 + 67), var11 + this.a(param6, param4, param7 + -2, param1), param3, param5);
                    rf.b(-18862);
                    return;
                  }
                } else {
                  L1: {
                    var11 = ((lk) this).field_q.field_H + (-((lk) this).field_q.field_H + var10 - ((lk) this).field_q.field_L >> -1793473951);
                    var12 = ((lk) this).field_n;
                    if (0 != var12) {
                      if (var12 == 3) {
                        break L1;
                      } else {
                        if (-2 != (var12 ^ -1)) {
                          if (var12 != 2) {
                            rf.b(-18862);
                            return;
                          } else {
                            ((lk) this).field_q.a(((lk) this).d(param7 + -2, param6), var9 + this.a(param2, param6, param0, -114), this.a(param6, param4, 0, param1) - -var11, param3, param5);
                            rf.b(-18862);
                            return;
                          }
                        } else {
                          ((lk) this).field_q.c(((lk) this).d(param7 ^ 2, param6), this.a(param2, param6, param0, -13) + (var9 >> 42811073), var11 + this.a(param6, param4, 0, param1), param3, param5);
                          rf.b(-18862);
                          return;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                  ((lk) this).field_q.b(((lk) this).d(0, param6), this.a(param2, param6, param0, param7 + 67), var11 + this.a(param6, param4, param7 + -2, param1), param3, param5);
                  rf.b(-18862);
                  return;
                }
              } else {
                var11 = -((lk) this).field_q.field_L + var10;
                var12 = ((lk) this).field_n;
                if (0 != var12) {
                  if (var12 != 3) {
                    if (-2 != (var12 ^ -1)) {
                      if (var12 != 2) {
                        rf.b(-18862);
                        return;
                      } else {
                        ((lk) this).field_q.a(((lk) this).d(param7 + -2, param6), var9 + this.a(param2, param6, param0, -114), this.a(param6, param4, 0, param1) - -var11, param3, param5);
                        rf.b(-18862);
                        return;
                      }
                    } else {
                      ((lk) this).field_q.c(((lk) this).d(param7 ^ 2, param6), this.a(param2, param6, param0, -13) + (var9 >> 42811073), var11 + this.a(param6, param4, 0, param1), param3, param5);
                      rf.b(-18862);
                      return;
                    }
                  } else {
                    ((lk) this).field_q.b(((lk) this).d(0, param6), this.a(param2, param6, param0, param7 + 67), var11 + this.a(param6, param4, param7 + -2, param1), param3, param5);
                    rf.b(-18862);
                    return;
                  }
                } else {
                  ((lk) this).field_q.b(((lk) this).d(0, param6), this.a(param2, param6, param0, param7 + 67), var11 + this.a(param6, param4, param7 + -2, param1), param3, param5);
                  rf.b(-18862);
                  return;
                }
              }
            } else {
              var11 = ((lk) this).field_q.field_H;
              var12 = ((lk) this).field_n;
              if (0 != var12) {
                if (var12 != 3) {
                  if (-2 != (var12 ^ -1)) {
                    if (var12 != 2) {
                      rf.b(-18862);
                      return;
                    } else {
                      ((lk) this).field_q.a(((lk) this).d(param7 + -2, param6), var9 + this.a(param2, param6, param0, -114), this.a(param6, param4, 0, param1) - -var11, param3, param5);
                      rf.b(-18862);
                      return;
                    }
                  } else {
                    ((lk) this).field_q.c(((lk) this).d(param7 ^ 2, param6), this.a(param2, param6, param0, -13) + (var9 >> 42811073), var11 + this.a(param6, param4, 0, param1), param3, param5);
                    rf.b(-18862);
                    return;
                  }
                } else {
                  ((lk) this).field_q.b(((lk) this).d(0, param6), this.a(param2, param6, param0, param7 + 67), var11 + this.a(param6, param4, param7 + -2, param1), param3, param5);
                  rf.b(-18862);
                  return;
                }
              } else {
                ((lk) this).field_q.b(((lk) this).d(0, param6), this.a(param2, param6, param0, param7 + 67), var11 + this.a(param6, param4, param7 + -2, param1), param3, param5);
                rf.b(-18862);
                return;
              }
            }
          } else {
            int discarded$2 = ((lk) this).field_q.a(((lk) this).d(param7 ^ 2, param6), this.a(param2, param6, param0, 66), this.a(param6, param4, 0, param1), var9, var10, param3, param5, ((lk) this).field_n, ((lk) this).field_k, ((lk) this).field_j);
            rf.b(-18862);
            return;
          }
        } else {
          ((lk) this).field_b = -74;
          id.a(param6.field_B + param2, param6.field_l + param2 - -param6.field_B, param6.field_w + (param6.field_p + param1), param6.field_p + param1, (byte) 91);
          var9 = ((lk) this).b(103, param6);
          var10 = this.c(-99, param6);
          if (!((lk) this).field_c) {
            L2: {
              var12 = ((lk) this).field_k;
              if (0 != var12) {
                if (2 != var12) {
                  L3: {
                    if (-4 != (var12 ^ -1)) {
                      if ((var12 ^ -1) != -2) {
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  var11 = ((lk) this).field_q.field_H + (-((lk) this).field_q.field_H + var10 - ((lk) this).field_q.field_L >> -1793473951);
                  break L2;
                } else {
                  var11 = -((lk) this).field_q.field_L + var10;
                  break L2;
                }
              } else {
                var11 = ((lk) this).field_q.field_H;
                break L2;
              }
            }
            L4: {
              var12 = ((lk) this).field_n;
              if (0 != var12) {
                if (var12 == 3) {
                  break L4;
                } else {
                  if (-2 != (var12 ^ -1)) {
                    if (var12 == 2) {
                      ((lk) this).field_q.a(((lk) this).d(param7 + -2, param6), var9 + this.a(param2, param6, param0, -114), this.a(param6, param4, 0, param1) - -var11, param3, param5);
                      rf.b(-18862);
                      return;
                    } else {
                      rf.b(-18862);
                      return;
                    }
                  } else {
                    ((lk) this).field_q.c(((lk) this).d(param7 ^ 2, param6), this.a(param2, param6, param0, -13) + (var9 >> 42811073), var11 + this.a(param6, param4, 0, param1), param3, param5);
                    rf.b(-18862);
                    return;
                  }
                }
              } else {
                break L4;
              }
            }
            ((lk) this).field_q.b(((lk) this).d(0, param6), this.a(param2, param6, param0, param7 + 67), var11 + this.a(param6, param4, param7 + -2, param1), param3, param5);
            rf.b(-18862);
            return;
          } else {
            int discarded$3 = ((lk) this).field_q.a(((lk) this).d(param7 ^ 2, param6), this.a(param2, param6, param0, 66), this.a(param6, param4, 0, param1), var9, var10, param3, param5, ((lk) this).field_n, ((lk) this).field_k, ((lk) this).field_j);
            rf.b(-18862);
            return;
          }
        }
    }

    public final int a(kb param0, byte param1) {
        ju discarded$0 = ((lk) this).a(-51, param0);
        int var3 = -62 / ((param1 - -20) / 38);
        return param0.field_u.a(false) - (-((lk) this).field_i + -((lk) this).field_t);
    }

    public final int a(boolean param0) {
        if (!param0) {
            return -56;
        }
        return ((lk) this).field_q.field_L + ((lk) this).field_q.field_H;
    }

    final static void a(int param0, java.awt.Canvas param1) {
        if (param0 < 70) {
            return;
        }
        oq.a(27080, (java.awt.Component) (Object) param1);
        il.a((java.awt.Component) (Object) param1, (byte) 74);
        if (!(om.field_I == null)) {
            om.field_I.a(0, (java.awt.Component) (Object) param1);
        }
    }

    protected lk() {
    }

    final static void a(hd param0, int param1, nm param2, byte param3, boolean param4, java.awt.Component param5) {
        int var6 = -98 / ((param3 - -3) / 46);
        ca.a(param5, 1024, param0, param4, -115, param2, param1, param1);
    }

    lk(ka param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        ((lk) this).field_g = param3;
        ((lk) this).field_c = param12 ? true : false;
        ((lk) this).field_d = param5;
        ((lk) this).field_m = param4;
        ((lk) this).field_l = param11;
        ((lk) this).field_b = param6;
        ((lk) this).field_q = param0;
        ((lk) this).field_j = param9;
        ((lk) this).field_n = param7;
        ((lk) this).field_k = param8;
        ((lk) this).field_o = param10;
        ((lk) this).field_t = param2;
        ((lk) this).field_i = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = false;
        field_s = "Accept rematch";
    }
}
