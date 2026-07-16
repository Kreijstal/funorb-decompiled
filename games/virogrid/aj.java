/*
 * Decompiled by CFR-JS 0.4.0.
 */
class aj implements ol, gm {
    int field_f;
    static String field_h;
    int field_t;
    static String field_q;
    int field_p;
    int field_n;
    int field_r;
    static String field_l;
    private boolean field_s;
    e field_i;
    int field_k;
    static String field_e;
    static p field_m;
    int field_d;
    int field_j;
    private int field_b;
    static boolean field_a;
    int field_o;
    static int field_g;
    int field_c;

    public final int b(int param0, fi param1, int param2) {
        Object var5 = null;
        if (param0 != -587719039) {
          var5 = null;
          int discarded$2 = this.a(23, -29, (byte) 22, (fi) null);
          return this.a((byte) -92, param1, param2, 0);
        } else {
          return this.a((byte) -92, param1, param2, 0);
        }
    }

    public final void a(byte param0, int param1, int param2, fi param3, int param4, int param5) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        ie var19 = null;
        ie var20 = null;
        ri var21 = null;
        ie var22 = null;
        ie var23 = null;
        ri var24 = null;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_38_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        var16 = Virogrid.field_F ? 1 : 0;
        if (param0 < -13) {
          if (param4 == param1) {
            return;
          } else {
            L0: {
              if (param3.f(true)) {
                L1: {
                  var23 = ((aj) this).a(param3, (byte) 83);
                  var22 = var23;
                  if (param1 <= param4) {
                    var9 = param4;
                    var8 = param1;
                    break L1;
                  } else {
                    var9 = param1;
                    var8 = param4;
                    break L1;
                  }
                }
                var10 = var22.b(var8, 0);
                var11 = var22.b(var9, 0);
                uk.a(param3.field_m + (param3.field_u + param5), 6, param2 + param3.field_l, param3.field_g + param3.field_l + param2, param5 - -param3.field_u);
                var12 = var10;
                L2: while (true) {
                  if (var11 < var12) {
                    ai.a(true);
                    break L0;
                  } else {
                    L3: {
                      var24 = var23.field_d[var12];
                      if (var10 != var12) {
                        stackOut_32_0 = var24.field_d[0];
                        stackIn_33_0 = stackOut_32_0;
                        break L3;
                      } else {
                        stackOut_31_0 = var22.a(var8, -1);
                        stackIn_33_0 = stackOut_31_0;
                        break L3;
                      }
                    }
                    L4: {
                      var14 = stackIn_33_0;
                      if (var11 == var12) {
                        stackOut_37_0 = var22.a(var9, -1);
                        stackIn_38_0 = stackOut_37_0;
                        break L4;
                      } else {
                        if (var24 != null) {
                          stackOut_36_0 = var24.field_d[-1 + var24.field_d.length];
                          stackIn_38_0 = stackOut_36_0;
                          break L4;
                        } else {
                          stackOut_35_0 = 0;
                          stackIn_38_0 = stackOut_35_0;
                          break L4;
                        }
                      }
                    }
                    var15 = stackIn_38_0;
                    vi.field_g.a(((aj) this).field_o >>> -1295351656, var24.field_c + param3.field_q + (((aj) this).field_n + param3.field_u + param5), var24.field_b, -var14 + var15, this.a(param2, var14, (byte) -76, param3), 124, ((aj) this).field_o);
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
          field_g = -91;
          if (param4 == param1) {
            return;
          } else {
            L5: {
              if (param3.f(true)) {
                L6: {
                  var20 = ((aj) this).a(param3, (byte) 83);
                  var19 = var20;
                  if (param1 <= param4) {
                    var9 = param4;
                    var8 = param1;
                    break L6;
                  } else {
                    var9 = param1;
                    var8 = param4;
                    break L6;
                  }
                }
                var10 = var19.b(var8, 0);
                var11 = var19.b(var9, 0);
                uk.a(param3.field_m + (param3.field_u + param5), 6, param2 + param3.field_l, param3.field_g + param3.field_l + param2, param5 - -param3.field_u);
                var12 = var10;
                L7: while (true) {
                  if (var11 < var12) {
                    ai.a(true);
                    break L5;
                  } else {
                    L8: {
                      var21 = var20.field_d[var12];
                      if (var10 != var12) {
                        stackOut_11_0 = var21.field_d[0];
                        stackIn_12_0 = stackOut_11_0;
                        break L8;
                      } else {
                        stackOut_10_0 = var19.a(var8, -1);
                        stackIn_12_0 = stackOut_10_0;
                        break L8;
                      }
                    }
                    L9: {
                      var14 = stackIn_12_0;
                      if (var11 == var12) {
                        stackOut_16_0 = var19.a(var9, -1);
                        stackIn_17_0 = stackOut_16_0;
                        break L9;
                      } else {
                        if (var21 != null) {
                          stackOut_15_0 = var21.field_d[-1 + var21.field_d.length];
                          stackIn_17_0 = stackOut_15_0;
                          break L9;
                        } else {
                          stackOut_14_0 = 0;
                          stackIn_17_0 = stackOut_14_0;
                          break L9;
                        }
                      }
                    }
                    var15 = stackIn_17_0;
                    vi.field_g.a(((aj) this).field_o >>> -1295351656, var21.field_c + param3.field_q + (((aj) this).field_n + param3.field_u + param5), var21.field_b, -var14 + var15, this.a(param2, var14, (byte) -76, param3), 124, ((aj) this).field_o);
                    var12++;
                    continue L7;
                  }
                }
              } else {
                break L5;
              }
            }
            return;
          }
        }
    }

    private final int a(byte param0, fi param1, int param2, int param3) {
        int var5 = -68 / ((param0 - -33) / 39);
        return param1.field_q + (param2 + param1.field_u) - -((aj) this).field_n + param3;
    }

    public final int b(fi param0, boolean param1) {
        if (!param1) {
            return -12;
        }
        return -((aj) this).field_p + param0.field_g - ((aj) this).field_d;
    }

    private final void a(int param0, int param1, fi param2, int param3) {
        this.a(param0, ((aj) this).field_b, param3, 0, 0, -103, ((aj) this).field_c, param2);
        if (param1 != 29940) {
            Object var6 = null;
            this.b((fi) null, 57);
        }
    }

    public final int a(fi param0, int param1) {
        Object var4 = null;
        if (param1 <= 65) {
          var4 = null;
          int discarded$6 = ((aj) this).b(-67, (fi) null, -114);
          ie discarded$7 = ((aj) this).a(param0, (byte) -128);
          return param0.field_r.a((byte) 20) - -((aj) this).field_n + ((aj) this).field_r;
        } else {
          ie discarded$8 = ((aj) this).a(param0, (byte) -128);
          return param0.field_r.a((byte) 20) - -((aj) this).field_n + ((aj) this).field_r;
        }
    }

    private final int a(int param0, fi param1) {
        if (param0 != 0) {
          int discarded$2 = ((aj) this).a(-73);
          return -((aj) this).field_r + -((aj) this).field_n + param1.field_m;
        } else {
          return -((aj) this).field_r + -((aj) this).field_n + param1.field_m;
        }
    }

    private final void b(fi param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Virogrid.field_F ? 1 : 0;
        if (param0.field_r == null) {
          param0.field_r = (ie) (Object) new bm();
          if (param1 == -14040) {
            var3 = ((aj) this).b(param0, true);
            var4 = this.a(0, param0);
            var6 = ((aj) this).field_k;
            if (var6 == 0) {
              L0: {
                L1: {
                  var5 = ((aj) this).field_i.field_H;
                  var6 = ((aj) this).field_j;
                  if (var6 == 0) {
                    break L1;
                  } else {
                    if (-4 == (var6 ^ -1)) {
                      break L1;
                    } else {
                      if (-2 == (var6 ^ -1)) {
                        if (!(param0.field_r instanceof bm)) {
                          break L0;
                        } else {
                          ((bm) (Object) param0.field_r).a(((aj) this).c(param0, 218479361), (byte) -98, ((aj) this).field_i, var3 >> 218479361, var5);
                          return;
                        }
                      } else {
                        if (var6 != 2) {
                          break L0;
                        } else {
                          if (param0.field_r instanceof bm) {
                            ((bm) (Object) param0.field_r).a((byte) -92, var3, ((aj) this).c(param0, 218479361), var5, ((aj) this).field_i);
                            break L0;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  }
                }
                if (param0.field_r instanceof bm) {
                  ((bm) (Object) param0.field_r).a(var5, (byte) 59, ((aj) this).field_i, 0, ((aj) this).c(param0, 218479361));
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            } else {
              if (-3 == (var6 ^ -1)) {
                L2: {
                  var5 = -((aj) this).field_i.field_G + var4;
                  var6 = ((aj) this).field_j;
                  if (var6 == 0) {
                    break L2;
                  } else {
                    if (-4 == (var6 ^ -1)) {
                      break L2;
                    } else {
                      L3: {
                        if (-2 == (var6 ^ -1)) {
                          if (!(param0.field_r instanceof bm)) {
                            break L3;
                          } else {
                            ((bm) (Object) param0.field_r).a(((aj) this).c(param0, 218479361), (byte) -98, ((aj) this).field_i, var3 >> 218479361, var5);
                            return;
                          }
                        } else {
                          if (var6 == 2) {
                            if (param0.field_r instanceof bm) {
                              ((bm) (Object) param0.field_r).a((byte) -92, var3, ((aj) this).c(param0, 218479361), var5, ((aj) this).field_i);
                              break L3;
                            } else {
                              return;
                            }
                          } else {
                            return;
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                if (param0.field_r instanceof bm) {
                  ((bm) (Object) param0.field_r).a(var5, (byte) 59, ((aj) this).field_i, 0, ((aj) this).c(param0, 218479361));
                  return;
                } else {
                  return;
                }
              } else {
                if ((var6 ^ -1) != -4) {
                  if (var6 != 1) {
                    L4: {
                      var5 = (var4 + -((aj) this).field_i.field_H - ((aj) this).field_i.field_G >> 909668449) + ((aj) this).field_i.field_H;
                      var6 = ((aj) this).field_j;
                      if (var6 == 0) {
                        break L4;
                      } else {
                        if (-4 == (var6 ^ -1)) {
                          break L4;
                        } else {
                          L5: {
                            if (-2 == (var6 ^ -1)) {
                              if (!(param0.field_r instanceof bm)) {
                                break L5;
                              } else {
                                ((bm) (Object) param0.field_r).a(((aj) this).c(param0, 218479361), (byte) -98, ((aj) this).field_i, var3 >> 218479361, var5);
                                return;
                              }
                            } else {
                              if (var6 != 2) {
                                break L5;
                              } else {
                                if (param0.field_r instanceof bm) {
                                  ((bm) (Object) param0.field_r).a((byte) -92, var3, ((aj) this).c(param0, 218479361), var5, ((aj) this).field_i);
                                  break L5;
                                } else {
                                  return;
                                }
                              }
                            }
                          }
                          return;
                        }
                      }
                    }
                    if (param0.field_r instanceof bm) {
                      ((bm) (Object) param0.field_r).a(var5, (byte) 59, ((aj) this).field_i, 0, ((aj) this).c(param0, 218479361));
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L6: {
                      var5 = (var4 + -((aj) this).field_i.field_H - ((aj) this).field_i.field_G >> 909668449) + ((aj) this).field_i.field_H;
                      var6 = ((aj) this).field_j;
                      if (var6 == 0) {
                        break L6;
                      } else {
                        if (-4 == (var6 ^ -1)) {
                          break L6;
                        } else {
                          L7: {
                            if (-2 == (var6 ^ -1)) {
                              if (!(param0.field_r instanceof bm)) {
                                break L7;
                              } else {
                                ((bm) (Object) param0.field_r).a(((aj) this).c(param0, 218479361), (byte) -98, ((aj) this).field_i, var3 >> 218479361, var5);
                                return;
                              }
                            } else {
                              if (var6 != 2) {
                                break L7;
                              } else {
                                if (param0.field_r instanceof bm) {
                                  ((bm) (Object) param0.field_r).a((byte) -92, var3, ((aj) this).c(param0, 218479361), var5, ((aj) this).field_i);
                                  break L7;
                                } else {
                                  return;
                                }
                              }
                            }
                          }
                          return;
                        }
                      }
                    }
                    if (param0.field_r instanceof bm) {
                      ((bm) (Object) param0.field_r).a(var5, (byte) 59, ((aj) this).field_i, 0, ((aj) this).c(param0, 218479361));
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  L8: {
                    var5 = (var4 + -((aj) this).field_i.field_H - ((aj) this).field_i.field_G >> 909668449) + ((aj) this).field_i.field_H;
                    var6 = ((aj) this).field_j;
                    if (var6 == 0) {
                      break L8;
                    } else {
                      if (-4 == (var6 ^ -1)) {
                        break L8;
                      } else {
                        L9: {
                          if (-2 == (var6 ^ -1)) {
                            if (!(param0.field_r instanceof bm)) {
                              break L9;
                            } else {
                              ((bm) (Object) param0.field_r).a(((aj) this).c(param0, 218479361), (byte) -98, ((aj) this).field_i, var3 >> 218479361, var5);
                              return;
                            }
                          } else {
                            if (var6 != 2) {
                              break L9;
                            } else {
                              if (param0.field_r instanceof bm) {
                                ((bm) (Object) param0.field_r).a((byte) -92, var3, ((aj) this).c(param0, 218479361), var5, ((aj) this).field_i);
                                break L9;
                              } else {
                                return;
                              }
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                  if (param0.field_r instanceof bm) {
                    ((bm) (Object) param0.field_r).a(var5, (byte) 59, ((aj) this).field_i, 0, ((aj) this).c(param0, 218479361));
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          } else {
            return;
          }
        } else {
          if (param1 == -14040) {
            var3 = ((aj) this).b(param0, true);
            var4 = this.a(0, param0);
            var6 = ((aj) this).field_k;
            if (var6 == 0) {
              L10: {
                L11: {
                  var5 = ((aj) this).field_i.field_H;
                  var6 = ((aj) this).field_j;
                  if (var6 == 0) {
                    break L11;
                  } else {
                    if (-4 == (var6 ^ -1)) {
                      break L11;
                    } else {
                      if (-2 == (var6 ^ -1)) {
                        if (!(param0.field_r instanceof bm)) {
                          break L10;
                        } else {
                          ((bm) (Object) param0.field_r).a(((aj) this).c(param0, 218479361), (byte) -98, ((aj) this).field_i, var3 >> 218479361, var5);
                          break L10;
                        }
                      } else {
                        if (var6 != 2) {
                          break L10;
                        } else {
                          if (param0.field_r instanceof bm) {
                            ((bm) (Object) param0.field_r).a((byte) -92, var3, ((aj) this).c(param0, 218479361), var5, ((aj) this).field_i);
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                  }
                }
                if (param0.field_r instanceof bm) {
                  ((bm) (Object) param0.field_r).a(var5, (byte) 59, ((aj) this).field_i, 0, ((aj) this).c(param0, 218479361));
                  break L10;
                } else {
                  break L10;
                }
              }
              return;
            } else {
              if (-3 == (var6 ^ -1)) {
                L12: {
                  L13: {
                    var5 = -((aj) this).field_i.field_G + var4;
                    var6 = ((aj) this).field_j;
                    if (var6 == 0) {
                      break L13;
                    } else {
                      if (-4 == (var6 ^ -1)) {
                        break L13;
                      } else {
                        if (-2 == (var6 ^ -1)) {
                          if (!(param0.field_r instanceof bm)) {
                            break L12;
                          } else {
                            ((bm) (Object) param0.field_r).a(((aj) this).c(param0, 218479361), (byte) -98, ((aj) this).field_i, var3 >> 218479361, var5);
                            break L12;
                          }
                        } else {
                          if (var6 != 2) {
                            break L12;
                          } else {
                            if (param0.field_r instanceof bm) {
                              ((bm) (Object) param0.field_r).a((byte) -92, var3, ((aj) this).c(param0, 218479361), var5, ((aj) this).field_i);
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                    }
                  }
                  if (param0.field_r instanceof bm) {
                    ((bm) (Object) param0.field_r).a(var5, (byte) 59, ((aj) this).field_i, 0, ((aj) this).c(param0, 218479361));
                    break L12;
                  } else {
                    break L12;
                  }
                }
                return;
              } else {
                L14: {
                  if ((var6 ^ -1) != -4) {
                    if (var6 != 1) {
                      break L14;
                    } else {
                      break L14;
                    }
                  } else {
                    break L14;
                  }
                }
                L15: {
                  var5 = (var4 + -((aj) this).field_i.field_H - ((aj) this).field_i.field_G >> 909668449) + ((aj) this).field_i.field_H;
                  var6 = ((aj) this).field_j;
                  if (var6 == 0) {
                    break L15;
                  } else {
                    if (-4 == (var6 ^ -1)) {
                      break L15;
                    } else {
                      L16: {
                        if (-2 == (var6 ^ -1)) {
                          if (!(param0.field_r instanceof bm)) {
                            break L16;
                          } else {
                            ((bm) (Object) param0.field_r).a(((aj) this).c(param0, 218479361), (byte) -98, ((aj) this).field_i, var3 >> 218479361, var5);
                            return;
                          }
                        } else {
                          if (var6 != 2) {
                            break L16;
                          } else {
                            if (param0.field_r instanceof bm) {
                              ((bm) (Object) param0.field_r).a((byte) -92, var3, ((aj) this).c(param0, 218479361), var5, ((aj) this).field_i);
                              break L16;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                if (param0.field_r instanceof bm) {
                  ((bm) (Object) param0.field_r).a(var5, (byte) 59, ((aj) this).field_i, 0, ((aj) this).c(param0, 218479361));
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    final void a(int param0, aj param1) {
        param1.field_p = ((aj) this).field_p;
        if (param0 != 0) {
          return;
        } else {
          param1.field_k = ((aj) this).field_k;
          param1.field_n = ((aj) this).field_n;
          param1.field_o = ((aj) this).field_o;
          param1.field_f = ((aj) this).field_f;
          param1.field_c = ((aj) this).field_c;
          param1.field_r = ((aj) this).field_r;
          param1.field_b = ((aj) this).field_b;
          param1.field_t = ((aj) this).field_t;
          param1.field_i = ((aj) this).field_i;
          param1.field_d = ((aj) this).field_d;
          param1.field_j = ((aj) this).field_j;
          param1.field_s = ((aj) this).field_s;
          return;
        }
    }

    public final int a(int param0, fi param1, int param2) {
        if (param2 != -7510) {
          ((aj) this).field_n = 9;
          return this.a(param0, 0, (byte) -76, param1);
        } else {
          return this.a(param0, 0, (byte) -76, param1);
        }
    }

    aj(e param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    private final int a(int param0, int param1, byte param2, fi param3) {
        if (param2 > -35) {
          aj.a(true);
          return ((aj) this).field_p + (param3.field_l + param0) - (-param3.field_k + -param1);
        } else {
          return ((aj) this).field_p + (param3.field_l + param0) - (-param3.field_k + -param1);
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        field_m = null;
        field_h = null;
        if (param0) {
          aj.a(true);
          field_l = null;
          field_q = null;
          return;
        } else {
          field_l = null;
          field_q = null;
          return;
        }
    }

    public final int a(int param0, int param1, int param2, fi param3, boolean param4, int param5) {
        ie discarded$7 = ((aj) this).a(param3, (byte) -122);
        if (!param4) {
          return -33;
        } else {
          return param3.field_r.a((byte) 120, param2 - ((aj) this).b(-587719039, param3, param1), -((aj) this).a(param0, param3, -7510) + param5);
        }
    }

    public final ie a(fi param0, byte param1) {
        int var3 = 0;
        L0: {
          if (null == param0.field_r) {
            param0.field_r = (ie) (Object) new bm();
            break L0;
          } else {
            break L0;
          }
        }
        if (!((aj) this).field_s) {
          this.b(param0, -14040);
          var3 = 122 % ((-56 - param1) / 62);
          return param0.field_r;
        } else {
          ((bm) (Object) param0.field_r).a(((aj) this).field_k, ((aj) this).field_j, true, ((aj) this).field_f, ((aj) this).c(param0, 218479361), ((aj) this).field_i, ((aj) this).b(param0, true), this.a(0, param0));
          var3 = 122 % ((-56 - param1) / 62);
          return param0.field_r;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, fi param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Virogrid.field_F ? 1 : 0;
        uk.a(param7.field_m + param7.field_u + param0, 6, param2 + param7.field_l, param7.field_g + (param7.field_l + param2), param7.field_u + param0);
        var9 = -54 % ((-43 - param5) / 49);
        var10 = ((aj) this).b(param7, true);
        var11 = this.a(0, param7);
        if (!((aj) this).field_s) {
          var13 = ((aj) this).field_k;
          if (0 == var13) {
            var12 = ((aj) this).field_i.field_H;
            var13 = ((aj) this).field_j;
            if (var13 != 0) {
              if (-4 != (var13 ^ -1)) {
                if (-2 == (var13 ^ -1)) {
                  ((aj) this).field_i.c(((aj) this).c(param7, 218479361), this.a(param2, param4, (byte) -42, param7) - -(var10 >> 135250817), this.a((byte) 23, param7, param0, param3) - -var12, param6, param1);
                  ai.a(true);
                  return;
                } else {
                  if ((var13 ^ -1) == -3) {
                    ((aj) this).field_i.a(((aj) this).c(param7, 218479361), this.a(param2, param4, (byte) -107, param7) - -var10, this.a((byte) -78, param7, param0, param3) + var12, param6, param1);
                    ai.a(true);
                    return;
                  } else {
                    ai.a(true);
                    return;
                  }
                }
              } else {
                ((aj) this).field_i.b(((aj) this).c(param7, 218479361), this.a(param2, param4, (byte) -88, param7), var12 + this.a((byte) 20, param7, param0, param3), param6, param1);
                ai.a(true);
                return;
              }
            } else {
              ((aj) this).field_i.b(((aj) this).c(param7, 218479361), this.a(param2, param4, (byte) -88, param7), var12 + this.a((byte) 20, param7, param0, param3), param6, param1);
              ai.a(true);
              return;
            }
          } else {
            if (2 == var13) {
              L0: {
                var12 = var11 + -((aj) this).field_i.field_G;
                var13 = ((aj) this).field_j;
                if (var13 == 0) {
                  break L0;
                } else {
                  if (-4 == (var13 ^ -1)) {
                    break L0;
                  } else {
                    if (-2 == (var13 ^ -1)) {
                      ((aj) this).field_i.c(((aj) this).c(param7, 218479361), this.a(param2, param4, (byte) -42, param7) - -(var10 >> 135250817), this.a((byte) 23, param7, param0, param3) - -var12, param6, param1);
                      ai.a(true);
                      return;
                    } else {
                      if ((var13 ^ -1) == -3) {
                        ((aj) this).field_i.a(((aj) this).c(param7, 218479361), this.a(param2, param4, (byte) -107, param7) - -var10, this.a((byte) -78, param7, param0, param3) + var12, param6, param1);
                        ai.a(true);
                        return;
                      } else {
                        ai.a(true);
                        return;
                      }
                    }
                  }
                }
              }
              ((aj) this).field_i.b(((aj) this).c(param7, 218479361), this.a(param2, param4, (byte) -88, param7), var12 + this.a((byte) 20, param7, param0, param3), param6, param1);
              ai.a(true);
              return;
            } else {
              if (-4 != (var13 ^ -1)) {
                if (var13 == 1) {
                  L1: {
                    var12 = ((aj) this).field_i.field_H + (-((aj) this).field_i.field_H + var11 + -((aj) this).field_i.field_G >> -587719039);
                    var13 = ((aj) this).field_j;
                    if (var13 == 0) {
                      break L1;
                    } else {
                      if (-4 == (var13 ^ -1)) {
                        break L1;
                      } else {
                        if (-2 == (var13 ^ -1)) {
                          ((aj) this).field_i.c(((aj) this).c(param7, 218479361), this.a(param2, param4, (byte) -42, param7) - -(var10 >> 135250817), this.a((byte) 23, param7, param0, param3) - -var12, param6, param1);
                          ai.a(true);
                          return;
                        } else {
                          if ((var13 ^ -1) == -3) {
                            ((aj) this).field_i.a(((aj) this).c(param7, 218479361), this.a(param2, param4, (byte) -107, param7) - -var10, this.a((byte) -78, param7, param0, param3) + var12, param6, param1);
                            ai.a(true);
                            return;
                          } else {
                            ai.a(true);
                            return;
                          }
                        }
                      }
                    }
                  }
                  ((aj) this).field_i.b(((aj) this).c(param7, 218479361), this.a(param2, param4, (byte) -88, param7), var12 + this.a((byte) 20, param7, param0, param3), param6, param1);
                  ai.a(true);
                  return;
                } else {
                  var12 = ((aj) this).field_i.field_H + (-((aj) this).field_i.field_H + var11 + -((aj) this).field_i.field_G >> -587719039);
                  var13 = ((aj) this).field_j;
                  if (var13 != 0) {
                    if (-4 != (var13 ^ -1)) {
                      if (-2 == (var13 ^ -1)) {
                        ((aj) this).field_i.c(((aj) this).c(param7, 218479361), this.a(param2, param4, (byte) -42, param7) - -(var10 >> 135250817), this.a((byte) 23, param7, param0, param3) - -var12, param6, param1);
                        ai.a(true);
                        return;
                      } else {
                        if ((var13 ^ -1) == -3) {
                          ((aj) this).field_i.a(((aj) this).c(param7, 218479361), this.a(param2, param4, (byte) -107, param7) - -var10, this.a((byte) -78, param7, param0, param3) + var12, param6, param1);
                          ai.a(true);
                          return;
                        } else {
                          ai.a(true);
                          return;
                        }
                      }
                    } else {
                      ((aj) this).field_i.b(((aj) this).c(param7, 218479361), this.a(param2, param4, (byte) -88, param7), var12 + this.a((byte) 20, param7, param0, param3), param6, param1);
                      ai.a(true);
                      return;
                    }
                  } else {
                    ((aj) this).field_i.b(((aj) this).c(param7, 218479361), this.a(param2, param4, (byte) -88, param7), var12 + this.a((byte) 20, param7, param0, param3), param6, param1);
                    ai.a(true);
                    return;
                  }
                }
              } else {
                L2: {
                  var12 = ((aj) this).field_i.field_H + (-((aj) this).field_i.field_H + var11 + -((aj) this).field_i.field_G >> -587719039);
                  var13 = ((aj) this).field_j;
                  if (var13 == 0) {
                    break L2;
                  } else {
                    if (-4 == (var13 ^ -1)) {
                      break L2;
                    } else {
                      if (-2 == (var13 ^ -1)) {
                        ((aj) this).field_i.c(((aj) this).c(param7, 218479361), this.a(param2, param4, (byte) -42, param7) - -(var10 >> 135250817), this.a((byte) 23, param7, param0, param3) - -var12, param6, param1);
                        ai.a(true);
                        return;
                      } else {
                        if ((var13 ^ -1) == -3) {
                          ((aj) this).field_i.a(((aj) this).c(param7, 218479361), this.a(param2, param4, (byte) -107, param7) - -var10, this.a((byte) -78, param7, param0, param3) + var12, param6, param1);
                          ai.a(true);
                          return;
                        } else {
                          ai.a(true);
                          return;
                        }
                      }
                    }
                  }
                }
                ((aj) this).field_i.b(((aj) this).c(param7, 218479361), this.a(param2, param4, (byte) -88, param7), var12 + this.a((byte) 20, param7, param0, param3), param6, param1);
                ai.a(true);
                return;
              }
            }
          }
        } else {
          int discarded$1 = ((aj) this).field_i.a(((aj) this).c(param7, 218479361), this.a(param2, param4, (byte) -76, param7), this.a((byte) -110, param7, param0, param3), var10, var11, param6, param1, ((aj) this).field_j, ((aj) this).field_k, ((aj) this).field_f);
          ai.a(true);
          return;
        }
    }

    public final void a(int param0, int param1, boolean param2, fi param3, int param4) {
        ie var13 = null;
        ie var14 = null;
        int var7 = 0;
        ri var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        if (!(!param3.f(param2))) {
            var13 = ((aj) this).a(param3, (byte) -121);
            var14 = var13;
            var7 = var14.b(param1, 0);
            var8 = var13.field_d[var7];
            var9 = var14.a(param1, -1);
            var10 = this.a(param0, var9, (byte) -94, param3);
            var11 = ((aj) this).b(-587719039, param3, param4) - -Math.max(0, var8.field_c);
            var12 = ((aj) this).b(-587719039, param3, param4) - -Math.min(this.a(0, param3), Math.min(var8.field_b, var14.field_d.length > 1 + var7 ? var13.field_d[1 + var7].field_c : var8.field_b));
            uk.a(param3.field_m + param3.field_u + param4, 6, param0 + param3.field_l, param3.field_g + (param3.field_l + param0), param3.field_u + param4);
            vi.field_g.a(var11, -28, ((aj) this).field_t, var10, var10, var12);
            ai.a(param2);
        }
    }

    public final int a(int param0) {
        if (param0 != 0) {
          ((aj) this).field_r = -20;
          return ((aj) this).field_i.field_H + ((aj) this).field_i.field_G;
        } else {
          return ((aj) this).field_i.field_H + ((aj) this).field_i.field_G;
        }
    }

    String c(fi param0, int param1) {
        if (param1 != 218479361) {
            return null;
        }
        return param0.field_n;
    }

    public final int a(fi param0, boolean param1) {
        Object var4 = null;
        ie discarded$7 = ((aj) this).a(param0, (byte) -118);
        if (param1) {
          var4 = null;
          ((aj) this).a(-29, (fi) null, false, -86, -114);
          return param0.field_r.a(3209) + (((aj) this).field_p + ((aj) this).field_d);
        } else {
          return param0.field_r.a(3209) + (((aj) this).field_p + ((aj) this).field_d);
        }
    }

    public void a(int param0, fi param1, boolean param2, int param3, int param4) {
        if (!(((aj) this).field_i != null)) {
            return;
        }
        this.a(param3, 29940, param1, param0);
        if (param4 != -23294) {
            ((aj) this).field_s = false;
        }
    }

    protected aj() {
    }

    aj(e param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        ((aj) this).field_r = param4;
        ((aj) this).field_i = param0;
        ((aj) this).field_j = param7;
        ((aj) this).field_c = param5;
        ((aj) this).field_d = param2;
        ((aj) this).field_o = param11;
        ((aj) this).field_b = param6;
        ((aj) this).field_p = param1;
        ((aj) this).field_s = param12 ? true : false;
        ((aj) this).field_n = param3;
        ((aj) this).field_t = param10;
        ((aj) this).field_f = param9;
        ((aj) this).field_k = param8;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Log in";
        field_l = "Unpacking graphics";
        field_h = "Played";
        field_e = "Creating your account";
        field_g = 131072;
        field_m = new p();
    }
}
