/*
 * Decompiled by CFR-JS 0.4.0.
 */
class a implements ml, ui {
    static String field_d;
    private boolean field_i;
    int field_b;
    static String field_c;
    ta field_p;
    static String field_j;
    private int field_m;
    int field_l;
    int field_h;
    int field_k;
    int field_n;
    int field_g;
    int field_f;
    int field_e;
    int field_o;
    int field_a;

    String c(we param0, int param1) {
        Object var4 = null;
        if (param1 != -775) {
          var4 = null;
          int discarded$2 = this.a((we) null, -87);
          return param0.field_s;
        } else {
          return param0.field_s;
        }
    }

    public final aa a(int param0, we param1) {
        if (param0 == -1) {
          L0: {
            if (null == param1.field_q) {
              param1.field_q = (aa) (Object) new sb();
              break L0;
            } else {
              break L0;
            }
          }
          if (((a) this).field_i) {
            ((sb) (Object) param1.field_q).a(((a) this).b(param1, true), ((a) this).field_a, ((a) this).c(param1, -775), ((a) this).field_o, ((a) this).field_p, this.a(param1, param0 + -1), param0 ^ -4477, ((a) this).field_l);
            return param1.field_q;
          } else {
            this.b(param1, 30373);
            return param1.field_q;
          }
        } else {
          return null;
        }
    }

    final static void b(int param0) {
        int var1 = 0;
        var1 = pf.a((byte) 31, 5);
        if (param0 <= 21) {
          field_j = null;
          cj.a((byte) 108, ke.field_h[20 + var1]);
          return;
        } else {
          cj.a((byte) 108, ke.field_h[20 + var1]);
          return;
        }
    }

    private final void a(int param0, int param1, we param2, int param3) {
        this.a(((a) this).field_m, param1, 0, param3, param2, param0 ^ -25601, ((a) this).field_f, 0);
        if (param0 != 25600) {
            ((a) this).field_m = -126;
        }
    }

    public final int a(int param0) {
        if (param0 != 2) {
          ((a) this).field_i = false;
          return ((a) this).field_p.field_D + ((a) this).field_p.field_C;
        } else {
          return ((a) this).field_p.field_D + ((a) this).field_p.field_C;
        }
    }

    public final int b(we param0, boolean param1) {
        if (!param1) {
          field_d = null;
          return -((a) this).field_g + -((a) this).field_h + param0.field_l;
        } else {
          return -((a) this).field_g + -((a) this).field_h + param0.field_l;
        }
    }

    public final int a(we param0, boolean param1) {
        aa discarded$7 = ((a) this).a(-1, param0);
        if (param1) {
          ((a) this).field_a = 15;
          return param0.field_q.b(62) - -((a) this).field_n + ((a) this).field_b;
        } else {
          return param0.field_q.b(62) - -((a) this).field_n + ((a) this).field_b;
        }
    }

    public final void a(int param0, we param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        be var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        aa var17 = null;
        aa var18 = null;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        var16 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param4 == param2) {
          return;
        } else {
          L0: {
            if (!param1.b((byte) 65)) {
              break L0;
            } else {
              L1: {
                var17 = ((a) this).a(-1, param1);
                var18 = var17;
                if (param4 <= param2) {
                  var8 = param4;
                  var9 = param2;
                  break L1;
                } else {
                  var9 = param4;
                  var8 = param2;
                  break L1;
                }
              }
              var10 = var18.b(var8, -98);
              var11 = var18.b(var9, -23);
              qi.a(param1.field_l + (param3 - -param1.field_r), true, param1.field_p + param5 + param1.field_e, param1.field_r + param3, param5 - -param1.field_e);
              var12 = var10;
              L2: while (true) {
                if (var11 < var12) {
                  tj.b(653);
                  break L0;
                } else {
                  L3: {
                    var13 = var17.field_c[var12];
                    if (var10 != var12) {
                      stackOut_11_0 = var13.field_c[0];
                      stackIn_12_0 = stackOut_11_0;
                      break L3;
                    } else {
                      stackOut_10_0 = var18.a(124, var8);
                      stackIn_12_0 = stackOut_10_0;
                      break L3;
                    }
                  }
                  L4: {
                    var14 = stackIn_12_0;
                    if (var11 != var12) {
                      if (var13 == null) {
                        stackOut_16_0 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        break L4;
                      } else {
                        stackOut_15_0 = var13.field_c[-1 + var13.field_c.length];
                        stackIn_17_0 = stackOut_15_0;
                        break L4;
                      }
                    } else {
                      stackOut_13_0 = var18.a(85, var9);
                      stackIn_17_0 = stackOut_13_0;
                      break L4;
                    }
                  }
                  var15 = stackIn_17_0;
                  hi.field_b.a(this.a((byte) 113, param3, param1, var14), ((a) this).field_e, ((a) this).field_e >>> -1291978248, var13.field_f, 101, -var14 + var15, var13.field_a + (param1.field_e + param5 + (((a) this).field_n + param1.field_i)));
                  var12++;
                  continue L2;
                }
              }
            }
          }
          if (param0 < 81) {
            ((a) this).field_m = -34;
            return;
          } else {
            return;
          }
        }
    }

    final void a(boolean param0, a param1) {
        param1.field_n = ((a) this).field_n;
        param1.field_o = ((a) this).field_o;
        param1.field_f = ((a) this).field_f;
        param1.field_b = ((a) this).field_b;
        param1.field_g = ((a) this).field_g;
        param1.field_h = ((a) this).field_h;
        param1.field_e = ((a) this).field_e;
        param1.field_l = ((a) this).field_l;
        param1.field_m = ((a) this).field_m;
        param1.field_a = ((a) this).field_a;
        param1.field_k = ((a) this).field_k;
        if (param0) {
            ((a) this).field_e = -9;
        } else {
            param1.field_p = ((a) this).field_p;
            param1.field_i = ((a) this).field_i;
            return;
        }
        param1.field_p = ((a) this).field_p;
        param1.field_i = ((a) this).field_i;
    }

    public final int a(we param0, int param1, int param2) {
        Object var5 = null;
        if (param1 > -52) {
          var5 = null;
          aa discarded$2 = ((a) this).a(51, (we) null);
          return this.a(param2, param0, 0, false);
        } else {
          return this.a(param2, param0, 0, false);
        }
    }

    private final int a(we param0, int param1) {
        if (param1 != -2) {
          ((a) this).field_f = 51;
          return -((a) this).field_b + (-((a) this).field_n + param0.field_p);
        } else {
          return -((a) this).field_b + (-((a) this).field_n + param0.field_p);
        }
    }

    public void a(boolean param0, we param1, int param2, int param3, int param4) {
        if (!(null != ((a) this).field_p)) {
            return;
        }
        if (param4 <= 19) {
            return;
        }
        this.a(25600, param2, param1, param3);
    }

    a(ta param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    private final void b(we param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (null == param0.field_q) {
          L0: {
            param0.field_q = (aa) (Object) new sb();
            var3 = ((a) this).b(param0, true);
            var4 = this.a(param0, param1 + -30375);
            var6 = ((a) this).field_o;
            if (var6 != 0) {
              if (var6 != 2) {
                L1: {
                  if (3 != var6) {
                    if (-2 != (var6 ^ -1)) {
                      break L1;
                    } else {
                      var5 = ((a) this).field_p.field_C - -(-((a) this).field_p.field_D + (var4 - ((a) this).field_p.field_C) >> 205953569);
                      var6 = ((a) this).field_l;
                      if (var6 != 0) {
                        L2: {
                          if (3 == var6) {
                            if (!(param0.field_q instanceof sb)) {
                              break L2;
                            } else {
                              L3: {
                                ((sb) (Object) param0.field_q).a(((a) this).c(param0, param1 ^ -30116), var5, 0, ((a) this).field_p, (byte) 79);
                                if (param1 == 30373) {
                                  break L3;
                                } else {
                                  a.a(false);
                                  break L3;
                                }
                              }
                              return;
                            }
                          } else {
                            if (var6 != 1) {
                              if (-3 != (var6 ^ -1)) {
                                break L2;
                              } else {
                                if (!(param0.field_q instanceof sb)) {
                                  break L2;
                                } else {
                                  L4: {
                                    ((sb) (Object) param0.field_q).a((byte) -82, ((a) this).field_p, ((a) this).c(param0, -775), var5, var3);
                                    if (param1 == 30373) {
                                      break L4;
                                    } else {
                                      a.a(false);
                                      break L4;
                                    }
                                  }
                                  return;
                                }
                              }
                            } else {
                              if (!(param0.field_q instanceof sb)) {
                                L5: {
                                  if (param1 == 30373) {
                                    break L5;
                                  } else {
                                    a.a(false);
                                    break L5;
                                  }
                                }
                                return;
                              } else {
                                L6: {
                                  ((sb) (Object) param0.field_q).a(((a) this).c(param0, -775), var3 >> -853381919, -2713, ((a) this).field_p, var5);
                                  if (param1 == 30373) {
                                    break L6;
                                  } else {
                                    a.a(false);
                                    break L6;
                                  }
                                }
                                return;
                              }
                            }
                          }
                        }
                        if (param1 != 30373) {
                          a.a(false);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        L7: {
                          if (!(param0.field_q instanceof sb)) {
                            break L7;
                          } else {
                            ((sb) (Object) param0.field_q).a(((a) this).c(param0, param1 ^ -30116), var5, 0, ((a) this).field_p, (byte) 79);
                            break L7;
                          }
                        }
                        L8: {
                          if (param1 == 30373) {
                            break L8;
                          } else {
                            a.a(false);
                            break L8;
                          }
                        }
                        return;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
                var5 = ((a) this).field_p.field_C - -(-((a) this).field_p.field_D + (var4 - ((a) this).field_p.field_C) >> 205953569);
                break L0;
              } else {
                var5 = var4 + -((a) this).field_p.field_D;
                break L0;
              }
            } else {
              var5 = ((a) this).field_p.field_C;
              break L0;
            }
          }
          var6 = ((a) this).field_l;
          if (var6 != 0) {
            L9: {
              if (3 == var6) {
                if (!(param0.field_q instanceof sb)) {
                  break L9;
                } else {
                  ((sb) (Object) param0.field_q).a(((a) this).c(param0, param1 ^ -30116), var5, 0, ((a) this).field_p, (byte) 79);
                  if (param1 != 30373) {
                    a.a(false);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                if (var6 != 1) {
                  if (-3 != (var6 ^ -1)) {
                    break L9;
                  } else {
                    if (!(param0.field_q instanceof sb)) {
                      break L9;
                    } else {
                      ((sb) (Object) param0.field_q).a((byte) -82, ((a) this).field_p, ((a) this).c(param0, -775), var5, var3);
                      if (param1 == 30373) {
                        return;
                      } else {
                        a.a(false);
                        return;
                      }
                    }
                  }
                } else {
                  if (param0.field_q instanceof sb) {
                    ((sb) (Object) param0.field_q).a(((a) this).c(param0, -775), var3 >> -853381919, -2713, ((a) this).field_p, var5);
                    if (param1 == 30373) {
                      return;
                    } else {
                      a.a(false);
                      return;
                    }
                  } else {
                    if (param1 != 30373) {
                      a.a(false);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
            if (param1 == 30373) {
              return;
            } else {
              a.a(false);
              return;
            }
          } else {
            if (param0.field_q instanceof sb) {
              ((sb) (Object) param0.field_q).a(((a) this).c(param0, param1 ^ -30116), var5, 0, ((a) this).field_p, (byte) 79);
              if (param1 != 30373) {
                a.a(false);
                return;
              } else {
                return;
              }
            } else {
              if (param1 != 30373) {
                a.a(false);
                return;
              } else {
                return;
              }
            }
          }
        } else {
          L10: {
            var3 = ((a) this).b(param0, true);
            var4 = this.a(param0, param1 + -30375);
            var6 = ((a) this).field_o;
            if (var6 != 0) {
              if (var6 != 2) {
                L11: {
                  if (3 != var6) {
                    if (-2 == (var6 ^ -1)) {
                      break L11;
                    } else {
                      break L11;
                    }
                  } else {
                    break L11;
                  }
                }
                var5 = ((a) this).field_p.field_C - -(-((a) this).field_p.field_D + (var4 - ((a) this).field_p.field_C) >> 205953569);
                break L10;
              } else {
                var5 = var4 + -((a) this).field_p.field_D;
                break L10;
              }
            } else {
              var5 = ((a) this).field_p.field_C;
              break L10;
            }
          }
          var6 = ((a) this).field_l;
          if (var6 != 0) {
            L12: {
              if (3 == var6) {
                if (!(param0.field_q instanceof sb)) {
                  break L12;
                } else {
                  L13: {
                    ((sb) (Object) param0.field_q).a(((a) this).c(param0, param1 ^ -30116), var5, 0, ((a) this).field_p, (byte) 79);
                    if (param1 == 30373) {
                      break L13;
                    } else {
                      a.a(false);
                      break L13;
                    }
                  }
                  return;
                }
              } else {
                if (var6 != 1) {
                  if (-3 != (var6 ^ -1)) {
                    break L12;
                  } else {
                    if (!(param0.field_q instanceof sb)) {
                      break L12;
                    } else {
                      L14: {
                        ((sb) (Object) param0.field_q).a((byte) -82, ((a) this).field_p, ((a) this).c(param0, -775), var5, var3);
                        if (param1 == 30373) {
                          break L14;
                        } else {
                          a.a(false);
                          break L14;
                        }
                      }
                      return;
                    }
                  }
                } else {
                  if (!(param0.field_q instanceof sb)) {
                    L15: {
                      if (param1 == 30373) {
                        break L15;
                      } else {
                        a.a(false);
                        break L15;
                      }
                    }
                    return;
                  } else {
                    L16: {
                      ((sb) (Object) param0.field_q).a(((a) this).c(param0, -775), var3 >> -853381919, -2713, ((a) this).field_p, var5);
                      if (param1 == 30373) {
                        break L16;
                      } else {
                        a.a(false);
                        break L16;
                      }
                    }
                    return;
                  }
                }
              }
            }
            if (param1 != 30373) {
              a.a(false);
              return;
            } else {
              return;
            }
          } else {
            L17: {
              if (!(param0.field_q instanceof sb)) {
                break L17;
              } else {
                ((sb) (Object) param0.field_q).a(((a) this).c(param0, param1 ^ -30116), var5, 0, ((a) this).field_p, (byte) 79);
                break L17;
              }
            }
            L18: {
              if (param1 == 30373) {
                break L18;
              } else {
                a.a(false);
                break L18;
              }
            }
            return;
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3, we param4, int param5, int param6, int param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        L0: {
          var13 = MonkeyPuzzle2.field_F ? 1 : 0;
          qi.a(param3 + (param4.field_r + param4.field_l), true, param4.field_p + param1 + param4.field_e, param3 - -param4.field_r, param4.field_e + param1);
          if (param5 == -1) {
            break L0;
          } else {
            var14 = null;
            int discarded$2 = this.a((byte) 57, -109, (we) null, 41);
            break L0;
          }
        }
        var9 = ((a) this).b(param4, true);
        var10 = this.a(param4, param5 ^ 1);
        if (((a) this).field_i) {
          int discarded$3 = ((a) this).field_p.a(((a) this).c(param4, param5 + -774), this.a((byte) 71, param3, param4, param2), this.a(param1, param4, param7, false), var9, var10, param6, param0, ((a) this).field_l, ((a) this).field_o, ((a) this).field_a);
          tj.b(653);
          return;
        } else {
          L1: {
            var12 = ((a) this).field_o;
            if (var12 != 0) {
              if (2 == var12) {
                var11 = -((a) this).field_p.field_D + var10;
                var12 = ((a) this).field_l;
                if (var12 != 0) {
                  if ((var12 ^ -1) != -4) {
                    if ((var12 ^ -1) != -2) {
                      if (var12 == 2) {
                        ((a) this).field_p.c(((a) this).c(param4, param5 + -774), var9 + this.a((byte) 59, param3, param4, param2), var11 + this.a(param1, param4, param7, false), param6, param0);
                        tj.b(653);
                        return;
                      } else {
                        tj.b(653);
                        return;
                      }
                    } else {
                      ((a) this).field_p.a(((a) this).c(param4, -775), (var9 >> -94967135) + this.a((byte) 72, param3, param4, param2), this.a(param1, param4, param7, false) - -var11, param6, param0);
                      tj.b(653);
                      return;
                    }
                  } else {
                    ((a) this).field_p.b(((a) this).c(param4, param5 + -774), this.a((byte) 84, param3, param4, param2), var11 + this.a(param1, param4, param7, false), param6, param0);
                    tj.b(653);
                    return;
                  }
                } else {
                  ((a) this).field_p.b(((a) this).c(param4, param5 + -774), this.a((byte) 84, param3, param4, param2), var11 + this.a(param1, param4, param7, false), param6, param0);
                  tj.b(653);
                  return;
                }
              } else {
                if ((var12 ^ -1) != -4) {
                  if (var12 != 1) {
                    var11 = ((a) this).field_p.field_C + (-((a) this).field_p.field_C + var10 + -((a) this).field_p.field_D >> 1853122209);
                    break L1;
                  } else {
                    var11 = ((a) this).field_p.field_C + (-((a) this).field_p.field_C + var10 + -((a) this).field_p.field_D >> 1853122209);
                    var12 = ((a) this).field_l;
                    if (var12 != 0) {
                      if ((var12 ^ -1) != -4) {
                        if ((var12 ^ -1) != -2) {
                          if (var12 == 2) {
                            ((a) this).field_p.c(((a) this).c(param4, param5 + -774), var9 + this.a((byte) 59, param3, param4, param2), var11 + this.a(param1, param4, param7, false), param6, param0);
                            tj.b(653);
                            return;
                          } else {
                            tj.b(653);
                            return;
                          }
                        } else {
                          ((a) this).field_p.a(((a) this).c(param4, -775), (var9 >> -94967135) + this.a((byte) 72, param3, param4, param2), this.a(param1, param4, param7, false) - -var11, param6, param0);
                          tj.b(653);
                          return;
                        }
                      } else {
                        ((a) this).field_p.b(((a) this).c(param4, param5 + -774), this.a((byte) 84, param3, param4, param2), var11 + this.a(param1, param4, param7, false), param6, param0);
                        tj.b(653);
                        return;
                      }
                    } else {
                      ((a) this).field_p.b(((a) this).c(param4, param5 + -774), this.a((byte) 84, param3, param4, param2), var11 + this.a(param1, param4, param7, false), param6, param0);
                      tj.b(653);
                      return;
                    }
                  }
                } else {
                  var11 = ((a) this).field_p.field_C + (-((a) this).field_p.field_C + var10 + -((a) this).field_p.field_D >> 1853122209);
                  var12 = ((a) this).field_l;
                  if (var12 != 0) {
                    if ((var12 ^ -1) != -4) {
                      if ((var12 ^ -1) != -2) {
                        if (var12 == 2) {
                          ((a) this).field_p.c(((a) this).c(param4, param5 + -774), var9 + this.a((byte) 59, param3, param4, param2), var11 + this.a(param1, param4, param7, false), param6, param0);
                          tj.b(653);
                          return;
                        } else {
                          tj.b(653);
                          return;
                        }
                      } else {
                        ((a) this).field_p.a(((a) this).c(param4, -775), (var9 >> -94967135) + this.a((byte) 72, param3, param4, param2), this.a(param1, param4, param7, false) - -var11, param6, param0);
                        tj.b(653);
                        return;
                      }
                    } else {
                      ((a) this).field_p.b(((a) this).c(param4, param5 + -774), this.a((byte) 84, param3, param4, param2), var11 + this.a(param1, param4, param7, false), param6, param0);
                      tj.b(653);
                      return;
                    }
                  } else {
                    ((a) this).field_p.b(((a) this).c(param4, param5 + -774), this.a((byte) 84, param3, param4, param2), var11 + this.a(param1, param4, param7, false), param6, param0);
                    tj.b(653);
                    return;
                  }
                }
              }
            } else {
              var11 = ((a) this).field_p.field_C;
              break L1;
            }
          }
          var12 = ((a) this).field_l;
          if (var12 != 0) {
            if ((var12 ^ -1) != -4) {
              if ((var12 ^ -1) != -2) {
                if (var12 == 2) {
                  ((a) this).field_p.c(((a) this).c(param4, param5 + -774), var9 + this.a((byte) 59, param3, param4, param2), var11 + this.a(param1, param4, param7, false), param6, param0);
                  tj.b(653);
                  return;
                } else {
                  tj.b(653);
                  return;
                }
              } else {
                ((a) this).field_p.a(((a) this).c(param4, -775), (var9 >> -94967135) + this.a((byte) 72, param3, param4, param2), this.a(param1, param4, param7, false) - -var11, param6, param0);
                tj.b(653);
                return;
              }
            } else {
              ((a) this).field_p.b(((a) this).c(param4, param5 + -774), this.a((byte) 84, param3, param4, param2), var11 + this.a(param1, param4, param7, false), param6, param0);
              tj.b(653);
              return;
            }
          } else {
            ((a) this).field_p.b(((a) this).c(param4, param5 + -774), this.a((byte) 84, param3, param4, param2), var11 + this.a(param1, param4, param7, false), param6, param0);
            tj.b(653);
            return;
          }
        }
    }

    public final int a(int param0, byte param1, we param2) {
        if (param1 < 59) {
          ((a) this).field_m = 36;
          return this.a((byte) 89, param0, param2, 0);
        } else {
          return this.a((byte) 89, param0, param2, 0);
        }
    }

    private final int a(int param0, we param1, int param2, boolean param3) {
        Object var6 = null;
        if (param3) {
          var6 = null;
          String discarded$2 = ((a) this).c((we) null, 32);
          return param0 + (param1.field_e - -((a) this).field_n) + param1.field_i - -param2;
        } else {
          return param0 + (param1.field_e - -((a) this).field_n) + param1.field_i - -param2;
        }
    }

    private final int a(byte param0, int param1, we param2, int param3) {
        if (param0 < 54) {
          ((a) this).field_p = null;
          return param3 + param1 + (param2.field_r + (((a) this).field_h - -param2.field_k));
        } else {
          return param3 + param1 + (param2.field_r + (((a) this).field_h - -param2.field_k));
        }
    }

    public final void a(we param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        aa var15 = null;
        aa var16 = null;
        be var17 = null;
        aa var18 = null;
        aa var19 = null;
        be var20 = null;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_13_3 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        if (param4 != 0) {
          L0: {
            ((a) this).field_a = -17;
            if (param0.b((byte) 91)) {
              L1: {
                var16 = ((a) this).a(-1, param0);
                var15 = var16;
                var7 = var15.b(param3, -25);
                var17 = var16.field_c[var7];
                var9 = var15.a(92, param3);
                var10 = this.a((byte) 124, param1, param0, var9);
                var11 = ((a) this).a(param0, -118, param2) - -Math.max(0, var17.field_a);
                stackOut_10_0 = ((a) this).a(param0, -127, param2);
                stackOut_10_1 = this.a(param0, -2);
                stackOut_10_2 = var17.field_f;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_12_2 = stackOut_10_2;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                stackIn_11_2 = stackOut_10_2;
                if (var15.field_c.length <= var7 + 1) {
                  stackOut_12_0 = stackIn_12_0;
                  stackOut_12_1 = stackIn_12_1;
                  stackOut_12_2 = stackIn_12_2;
                  stackOut_12_3 = var17.field_f;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  stackIn_13_2 = stackOut_12_2;
                  stackIn_13_3 = stackOut_12_3;
                  break L1;
                } else {
                  stackOut_11_0 = stackIn_11_0;
                  stackOut_11_1 = stackIn_11_1;
                  stackOut_11_2 = stackIn_11_2;
                  stackOut_11_3 = var16.field_c[var7 - -1].field_a;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_13_2 = stackOut_11_2;
                  stackIn_13_3 = stackOut_11_3;
                  break L1;
                }
              }
              var12 = stackIn_13_0 + Math.min(stackIn_13_1, Math.min(stackIn_13_2, stackIn_13_3));
              qi.a(param0.field_r + (param1 + param0.field_l), true, param0.field_p + param0.field_e + param2, param0.field_r + param1, param0.field_e + param2);
              hi.field_b.a(13421772, ((a) this).field_k, var10, var11, var12, var10);
              tj.b(param4 ^ 653);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L2: {
            if (param0.b((byte) 91)) {
              L3: {
                var19 = ((a) this).a(-1, param0);
                var18 = var19;
                var7 = var18.b(param3, -25);
                var20 = var19.field_c[var7];
                var9 = var18.a(92, param3);
                var10 = this.a((byte) 124, param1, param0, var9);
                var11 = ((a) this).a(param0, -118, param2) - -Math.max(0, var20.field_a);
                stackOut_3_0 = ((a) this).a(param0, -127, param2);
                stackOut_3_1 = this.a(param0, -2);
                stackOut_3_2 = var20.field_f;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                stackIn_5_2 = stackOut_3_2;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                if (var18.field_c.length <= var7 + 1) {
                  stackOut_5_0 = stackIn_5_0;
                  stackOut_5_1 = stackIn_5_1;
                  stackOut_5_2 = stackIn_5_2;
                  stackOut_5_3 = var20.field_f;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  stackIn_6_2 = stackOut_5_2;
                  stackIn_6_3 = stackOut_5_3;
                  break L3;
                } else {
                  stackOut_4_0 = stackIn_4_0;
                  stackOut_4_1 = stackIn_4_1;
                  stackOut_4_2 = stackIn_4_2;
                  stackOut_4_3 = var19.field_c[var7 - -1].field_a;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  stackIn_6_2 = stackOut_4_2;
                  stackIn_6_3 = stackOut_4_3;
                  break L3;
                }
              }
              var12 = stackIn_6_0 + Math.min(stackIn_6_1, Math.min(stackIn_6_2, stackIn_6_3));
              qi.a(param0.field_r + (param1 + param0.field_l), true, param0.field_p + param0.field_e + param2, param0.field_r + param1, param0.field_e + param2);
              hi.field_b.a(13421772, ((a) this).field_k, var10, var11, var12, var10);
              tj.b(param4 ^ 653);
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        field_d = null;
        if (!param0) {
            field_j = null;
            field_j = null;
            return;
        }
        field_j = null;
    }

    public final int a(we param0, byte param1) {
        aa discarded$7 = ((a) this).a(-1, param0);
        if (param1 != 103) {
          return -124;
        } else {
          return param0.field_q.a(true) - -((a) this).field_h - -((a) this).field_g;
        }
    }

    public final int a(int param0, int param1, we param2, int param3, boolean param4, int param5) {
        if (!param4) {
          a.b(-109);
          aa discarded$2 = ((a) this).a(-1, param2);
          return param2.field_q.a(param3 + -((a) this).a(param0, (byte) 121, param2), -((a) this).a(param2, -92, param5) + param1, -115);
        } else {
          aa discarded$3 = ((a) this).a(-1, param2);
          return param2.field_q.a(param3 + -((a) this).a(param0, (byte) 121, param2), -((a) this).a(param2, -92, param5) + param1, -115);
        }
    }

    protected a() {
    }

    a(ta param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        ((a) this).field_n = param3;
        ((a) this).field_h = param1;
        ((a) this).field_a = param9;
        ((a) this).field_m = param6;
        ((a) this).field_k = param10;
        ((a) this).field_g = param2;
        ((a) this).field_p = param0;
        ((a) this).field_e = param11;
        ((a) this).field_i = param12 ? true : false;
        ((a) this).field_l = param7;
        ((a) this).field_o = param8;
        ((a) this).field_b = param4;
        ((a) this).field_f = param5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Return to game";
        field_c = "Orb coins: <%0>";
        field_j = "Updates will sent to the email address you've given";
    }
}
