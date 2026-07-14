/*
 * Decompiled by CFR-JS 0.4.0.
 */
class al implements kg, jh {
    static hl field_i;
    int field_k;
    int field_a;
    static String field_l;
    private boolean field_p;
    static String field_e;
    int field_o;
    private int field_m;
    int field_f;
    int field_j;
    int field_n;
    int field_d;
    int field_g;
    jb field_b;
    int field_h;
    int field_c;

    public final int b(na param0, int param1) {
        int var3 = 46 / ((param1 - -15) / 48);
        return -((al) this).field_f + param0.field_F - ((al) this).field_g;
    }

    final static void a(int param0, boolean param1, byte[] param2, int param3, boolean param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        bc var10 = null;
        bc stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        bc stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        bc stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        bc stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        bc stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        bc stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        L0: {
          var10 = nd.field_Lb;
          var10.f(param3, (byte) -92);
          var10.field_t = var10.field_t + 1;
          var7 = var10.field_t;
          stackOut_0_0 = (bc) var10;
          stackOut_0_1 = 4;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          if (param4) {
            stackOut_2_0 = (bc) (Object) stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            break L0;
          } else {
            stackOut_1_0 = (bc) (Object) stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            break L0;
          }
        }
        ((bc) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2 != 0);
        var10.a(param5, false);
        var8 = param0;
        if (!param1) {
          var10.a(var8, false);
          if (!param4) {
            var9 = null;
            al.a((String) null, (byte) -79);
            var10.a(0, 128, param2, param2.length);
            var10.b(-var7 + var10.field_t, -2);
            return;
          } else {
            var10.a(0, 128, param2, param2.length);
            var10.b(-var7 + var10.field_t, -2);
            return;
          }
        } else {
          // wide iinc 8 128
          var10.a(var8, false);
          if (param4) {
            var10.a(0, 128, param2, param2.length);
            var10.b(-var7 + var10.field_t, -2);
            return;
          } else {
            var9 = null;
            al.a((String) null, (byte) -79);
            var10.a(0, 128, param2, param2.length);
            var10.b(-var7 + var10.field_t, -2);
            return;
          }
        }
    }

    public void a(na param0, int param1, int param2, boolean param3, boolean param4) {
        Object var7 = null;
        if (null != ((al) this).field_b) {
          if (!param3) {
            var7 = null;
            this.a(-34, (na) null);
            this.a(param1, param2, param0, (byte) -47);
            return;
          } else {
            this.a(param1, param2, param0, (byte) -47);
            return;
          }
        } else {
          return;
        }
    }

    private final void a(int param0, na param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = TetraLink.field_J;
          if (param1.field_D == null) {
            param1.field_D = (hi) (Object) new we();
            break L0;
          } else {
            break L0;
          }
        }
        var3 = ((al) this).b(param1, -107);
        var4 = this.d(param1, -42);
        if (param0 != 2) {
          ((al) this).field_f = -119;
          var6 = ((al) this).field_d;
          if (var6 != -1) {
            if (-3 != var6) {
              if ((var6 ^ -1) != -4) {
                if (1 != var6) {
                  var5 = ((al) this).field_b.field_N + (-((al) this).field_b.field_K + -((al) this).field_b.field_N + var4 >> 397202721);
                  var6 = ((al) this).field_k;
                  if (var6 != 0) {
                    if (3 != var6) {
                      L1: {
                        if (var6 != 1) {
                          if (var6 != 2) {
                            break L1;
                          } else {
                            if (param1.field_D instanceof we) {
                              ((we) (Object) param1.field_D).a(((al) this).c(param1, 4373), var5, var3, false, ((al) this).field_b);
                              break L1;
                            } else {
                              return;
                            }
                          }
                        } else {
                          if (!(param1.field_D instanceof we)) {
                            break L1;
                          } else {
                            ((we) (Object) param1.field_D).a(((al) this).c(param1, 4373), (byte) 124, ((al) this).field_b, var3 >> 196350017, var5);
                            return;
                          }
                        }
                      }
                      return;
                    } else {
                      if (param1.field_D instanceof we) {
                        ((we) (Object) param1.field_D).a(0, ((al) this).field_b, 0, var5, ((al) this).c(param1, 4373));
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (param1.field_D instanceof we) {
                      ((we) (Object) param1.field_D).a(0, ((al) this).field_b, 0, var5, ((al) this).c(param1, 4373));
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  var5 = ((al) this).field_b.field_N + (-((al) this).field_b.field_K + -((al) this).field_b.field_N + var4 >> 397202721);
                  var6 = ((al) this).field_k;
                  if (var6 != 0) {
                    if (3 != var6) {
                      if (var6 != 1) {
                        if (var6 == 2) {
                          if (!(param1.field_D instanceof we)) {
                            return;
                          } else {
                            ((we) (Object) param1.field_D).a(((al) this).c(param1, 4373), var5, var3, false, ((al) this).field_b);
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        if (!(param1.field_D instanceof we)) {
                          return;
                        } else {
                          ((we) (Object) param1.field_D).a(((al) this).c(param1, 4373), (byte) 124, ((al) this).field_b, var3 >> 196350017, var5);
                          return;
                        }
                      }
                    } else {
                      if (!(param1.field_D instanceof we)) {
                        return;
                      } else {
                        ((we) (Object) param1.field_D).a(0, ((al) this).field_b, 0, var5, ((al) this).c(param1, 4373));
                        return;
                      }
                    }
                  } else {
                    if (!(param1.field_D instanceof we)) {
                      return;
                    } else {
                      ((we) (Object) param1.field_D).a(0, ((al) this).field_b, 0, var5, ((al) this).c(param1, 4373));
                      return;
                    }
                  }
                }
              } else {
                var5 = ((al) this).field_b.field_N + (-((al) this).field_b.field_K + -((al) this).field_b.field_N + var4 >> 397202721);
                var6 = ((al) this).field_k;
                if (var6 != 0) {
                  if (3 != var6) {
                    if (var6 != 1) {
                      if (var6 == 2) {
                        if (!(param1.field_D instanceof we)) {
                          return;
                        } else {
                          ((we) (Object) param1.field_D).a(((al) this).c(param1, 4373), var5, var3, false, ((al) this).field_b);
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      if (param1.field_D instanceof we) {
                        ((we) (Object) param1.field_D).a(((al) this).c(param1, 4373), (byte) 124, ((al) this).field_b, var3 >> 196350017, var5);
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    L2: {
                      if (param1.field_D instanceof we) {
                        ((we) (Object) param1.field_D).a(0, ((al) this).field_b, 0, var5, ((al) this).c(param1, 4373));
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    return;
                  }
                } else {
                  L3: {
                    if (param1.field_D instanceof we) {
                      ((we) (Object) param1.field_D).a(0, ((al) this).field_b, 0, var5, ((al) this).c(param1, 4373));
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  return;
                }
              }
            } else {
              var5 = -((al) this).field_b.field_K + var4;
              var6 = ((al) this).field_k;
              if (var6 != 0) {
                if (3 != var6) {
                  L4: {
                    if (var6 != 1) {
                      if (var6 == 2) {
                        if (param1.field_D instanceof we) {
                          ((we) (Object) param1.field_D).a(((al) this).c(param1, 4373), var5, var3, false, ((al) this).field_b);
                          break L4;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      if (!(param1.field_D instanceof we)) {
                        break L4;
                      } else {
                        ((we) (Object) param1.field_D).a(((al) this).c(param1, 4373), (byte) 124, ((al) this).field_b, var3 >> 196350017, var5);
                        return;
                      }
                    }
                  }
                  return;
                } else {
                  L5: {
                    if (param1.field_D instanceof we) {
                      ((we) (Object) param1.field_D).a(0, ((al) this).field_b, 0, var5, ((al) this).c(param1, 4373));
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  return;
                }
              } else {
                L6: {
                  if (param1.field_D instanceof we) {
                    ((we) (Object) param1.field_D).a(0, ((al) this).field_b, 0, var5, ((al) this).c(param1, 4373));
                    break L6;
                  } else {
                    break L6;
                  }
                }
                return;
              }
            }
          } else {
            var5 = ((al) this).field_b.field_N;
            var6 = ((al) this).field_k;
            if (var6 != 0) {
              if (3 != var6) {
                L7: {
                  if (var6 != 1) {
                    if (var6 != 2) {
                      break L7;
                    } else {
                      if (param1.field_D instanceof we) {
                        ((we) (Object) param1.field_D).a(((al) this).c(param1, 4373), var5, var3, false, ((al) this).field_b);
                        break L7;
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (!(param1.field_D instanceof we)) {
                      break L7;
                    } else {
                      ((we) (Object) param1.field_D).a(((al) this).c(param1, 4373), (byte) 124, ((al) this).field_b, var3 >> 196350017, var5);
                      return;
                    }
                  }
                }
                return;
              } else {
                L8: {
                  if (param1.field_D instanceof we) {
                    ((we) (Object) param1.field_D).a(0, ((al) this).field_b, 0, var5, ((al) this).c(param1, 4373));
                    break L8;
                  } else {
                    break L8;
                  }
                }
                return;
              }
            } else {
              L9: {
                if (param1.field_D instanceof we) {
                  ((we) (Object) param1.field_D).a(0, ((al) this).field_b, 0, var5, ((al) this).c(param1, 4373));
                  break L9;
                } else {
                  break L9;
                }
              }
              return;
            }
          }
        } else {
          L10: {
            var6 = ((al) this).field_d;
            if (var6 != -1) {
              if (-3 != var6) {
                L11: {
                  if ((var6 ^ -1) == -4) {
                    break L11;
                  } else {
                    if (1 == var6) {
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                }
                var5 = ((al) this).field_b.field_N + (-((al) this).field_b.field_K + -((al) this).field_b.field_N + var4 >> 397202721);
                break L10;
              } else {
                var5 = -((al) this).field_b.field_K + var4;
                break L10;
              }
            } else {
              var5 = ((al) this).field_b.field_N;
              break L10;
            }
          }
          var6 = ((al) this).field_k;
          if (var6 != 0) {
            if (3 != var6) {
              if (var6 != 1) {
                if (var6 == 2) {
                  if (!(param1.field_D instanceof we)) {
                    return;
                  } else {
                    ((we) (Object) param1.field_D).a(((al) this).c(param1, 4373), var5, var3, false, ((al) this).field_b);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                if (param1.field_D instanceof we) {
                  ((we) (Object) param1.field_D).a(((al) this).c(param1, 4373), (byte) 124, ((al) this).field_b, var3 >> 196350017, var5);
                  return;
                } else {
                  return;
                }
              }
            } else {
              L12: {
                if (param1.field_D instanceof we) {
                  ((we) (Object) param1.field_D).a(0, ((al) this).field_b, 0, var5, ((al) this).c(param1, 4373));
                  break L12;
                } else {
                  break L12;
                }
              }
              return;
            }
          } else {
            L13: {
              if (param1.field_D instanceof we) {
                ((we) (Object) param1.field_D).a(0, ((al) this).field_b, 0, var5, ((al) this).c(param1, 4373));
                break L13;
              } else {
                break L13;
              }
            }
            return;
          }
        }
    }

    public final int a(int param0, int param1, na param2) {
        Object var5 = null;
        if (param1 != 0) {
          var5 = null;
          ((al) this).a(6, (al) null);
          return this.a(0, param2, param0, 0);
        } else {
          return this.a(0, param2, param0, 0);
        }
    }

    public final int a(boolean param0) {
        if (!param0) {
            return -109;
        }
        return ((al) this).field_b.field_N + ((al) this).field_b.field_K;
    }

    final static sj a(boolean param0, int param1) {
        sj var2 = null;
        sj stackIn_2_0 = null;
        sj stackIn_3_0 = null;
        sj stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        sj stackIn_6_0 = null;
        sj stackIn_7_0 = null;
        sj stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        sj stackOut_5_0 = null;
        sj stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        sj stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        sj stackOut_1_0 = null;
        sj stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        sj stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        var2 = new sj(true);
        if (param1 != 1) {
          L0: {
            field_e = null;
            stackOut_5_0 = (sj) var2;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param0) {
              stackOut_7_0 = (sj) (Object) stackIn_7_0;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = (sj) (Object) stackIn_6_0;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          stackIn_8_0.field_b = stackIn_8_1 != 0;
          return var2;
        } else {
          L1: {
            stackOut_1_0 = (sj) var2;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param0) {
              stackOut_3_0 = (sj) (Object) stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = (sj) (Object) stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          stackIn_4_0.field_b = stackIn_4_1 != 0;
          return var2;
        }
    }

    public final int a(int param0, int param1, int param2, int param3, na param4, byte param5) {
        if (param5 != -34) {
          ((al) this).field_o = -103;
          hi discarded$2 = ((al) this).a(param4, false);
          return param4.field_D.a(param3 + -((al) this).a(param1, 0, param4), param2 - ((al) this).a(param4, param0, true), 12024);
        } else {
          hi discarded$3 = ((al) this).a(param4, false);
          return param4.field_D.a(param3 + -((al) this).a(param1, 0, param4), param2 - ((al) this).a(param4, param0, true), 12024);
        }
    }

    public final hi a(na param0, boolean param1) {
        L0: {
          if (null == param0.field_D) {
            param0.field_D = (hi) (Object) new we();
            break L0;
          } else {
            break L0;
          }
        }
        if (((al) this).field_p) {
          ((we) (Object) param0.field_D).a(-24340, this.d(param0, -37), ((al) this).c(param0, 4373), ((al) this).b(param0, 111), ((al) this).field_b, ((al) this).field_k, ((al) this).field_d, ((al) this).field_c);
          if (param1) {
            return null;
          } else {
            return param0.field_D;
          }
        } else {
          this.a(2, param0);
          if (param1) {
            return null;
          } else {
            return param0.field_D;
          }
        }
    }

    public final void a(na param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object var13 = null;
        hi var16 = null;
        hi var17 = null;
        bk var18 = null;
        hi var19 = null;
        hi var20 = null;
        bk var21 = null;
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
        if (param3 != 0) {
          L0: {
            var13 = null;
            int discarded$4 = this.d((na) null, -88);
            if (param0.c(3)) {
              L1: {
                var17 = ((al) this).a(param0, false);
                var16 = var17;
                var7 = var16.a(param2, 103);
                var18 = var17.field_c[var7];
                var9 = var16.a(param2, true);
                var10 = this.a(param3 + 0, param0, param4, var9);
                var11 = ((al) this).a(param0, param1, true) - -Math.max(0, var18.field_h);
                stackOut_10_0 = ((al) this).a(param0, param1, true);
                stackOut_10_1 = this.d(param0, param3 ^ -128);
                stackOut_10_2 = var18.field_a;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_12_2 = stackOut_10_2;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                stackIn_11_2 = stackOut_10_2;
                if (var16.field_c.length > 1 + var7) {
                  stackOut_12_0 = stackIn_12_0;
                  stackOut_12_1 = stackIn_12_1;
                  stackOut_12_2 = stackIn_12_2;
                  stackOut_12_3 = var17.field_c[1 + var7].field_h;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  stackIn_13_2 = stackOut_12_2;
                  stackIn_13_3 = stackOut_12_3;
                  break L1;
                } else {
                  stackOut_11_0 = stackIn_11_0;
                  stackOut_11_1 = stackIn_11_1;
                  stackOut_11_2 = stackIn_11_2;
                  stackOut_11_3 = var18.field_a;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_13_2 = stackOut_11_2;
                  stackIn_13_3 = stackOut_11_3;
                  break L1;
                }
              }
              var12 = stackIn_13_0 - -Math.min(stackIn_13_1, Math.min(stackIn_13_2, stackIn_13_3));
              kl.a(param0.field_F + (param0.field_t + param4), param0.field_u + param1 - -param0.field_w, param1 + param0.field_w, (byte) -79, param0.field_t + param4);
              dh.field_q.a(var12, var10, param3 + -64, var11, ((al) this).field_o, var10);
              dh.a(-581);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L2: {
            if (param0.c(3)) {
              L3: {
                var20 = ((al) this).a(param0, false);
                var19 = var20;
                var7 = var19.a(param2, 103);
                var21 = var20.field_c[var7];
                var9 = var19.a(param2, true);
                var10 = this.a(param3 + 0, param0, param4, var9);
                var11 = ((al) this).a(param0, param1, true) - -Math.max(0, var21.field_h);
                stackOut_3_0 = ((al) this).a(param0, param1, true);
                stackOut_3_1 = this.d(param0, param3 ^ -128);
                stackOut_3_2 = var21.field_a;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                stackIn_5_2 = stackOut_3_2;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                if (var19.field_c.length > 1 + var7) {
                  stackOut_5_0 = stackIn_5_0;
                  stackOut_5_1 = stackIn_5_1;
                  stackOut_5_2 = stackIn_5_2;
                  stackOut_5_3 = var20.field_c[1 + var7].field_h;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  stackIn_6_2 = stackOut_5_2;
                  stackIn_6_3 = stackOut_5_3;
                  break L3;
                } else {
                  stackOut_4_0 = stackIn_4_0;
                  stackOut_4_1 = stackIn_4_1;
                  stackOut_4_2 = stackIn_4_2;
                  stackOut_4_3 = var21.field_a;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  stackIn_6_2 = stackOut_4_2;
                  stackIn_6_3 = stackOut_4_3;
                  break L3;
                }
              }
              var12 = stackIn_6_0 - -Math.min(stackIn_6_1, Math.min(stackIn_6_2, stackIn_6_3));
              kl.a(param0.field_F + (param0.field_t + param4), param0.field_u + param1 - -param0.field_w, param1 + param0.field_w, (byte) -79, param0.field_t + param4);
              dh.field_q.a(var12, var10, param3 + -64, var11, ((al) this).field_o, var10);
              dh.a(-581);
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    public final int a(na param0, byte param1) {
        hi discarded$7 = ((al) this).a(param0, false);
        if (param1 != 36) {
          return -68;
        } else {
          return param0.field_D.b((byte) 117) + ((al) this).field_f - -((al) this).field_g;
        }
    }

    final void a(int param0, al param1) {
        param1.field_j = ((al) this).field_j;
        param1.field_m = ((al) this).field_m;
        param1.field_k = ((al) this).field_k;
        param1.field_h = ((al) this).field_h;
        param1.field_f = ((al) this).field_f;
        param1.field_p = ((al) this).field_p;
        param1.field_b = ((al) this).field_b;
        param1.field_d = ((al) this).field_d;
        param1.field_o = ((al) this).field_o;
        param1.field_c = ((al) this).field_c;
        param1.field_a = ((al) this).field_a;
        param1.field_g = ((al) this).field_g;
        param1.field_n = ((al) this).field_n;
        if (param0 != 0) {
            int discarded$0 = ((al) this).a(false);
        }
    }

    private final void a(int param0, int param1, na param2, byte param3) {
        this.a(param2, param0, 0, (byte) 45, ((al) this).field_m, ((al) this).field_a, 0, param1);
        if (param3 != -47) {
            ((al) this).field_j = -55;
        }
    }

    private final int a(int param0, na param1, byte param2, int param3) {
        int var5 = -77 % ((61 - param2) / 48);
        return param3 + (param1.field_o + (((al) this).field_j + param0 + param1.field_w));
    }

    public final int a(na param0, int param1, boolean param2) {
        Object var5 = null;
        if (!param2) {
          var5 = null;
          int discarded$2 = ((al) this).b((na) null, -6);
          return this.a(param1, param0, (byte) 120, 0);
        } else {
          return this.a(param1, param0, (byte) 120, 0);
        }
    }

    final static void a(String param0, byte param1) {
        rb.field_Nb = param0;
        if (param1 != 24) {
            field_l = null;
            t.a(12, 0);
            return;
        }
        t.a(12, 0);
    }

    private final void a(na param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        var13 = TetraLink.field_J;
        kl.a(param0.field_F + param0.field_t + param1, param7 + param0.field_w + param0.field_u, param0.field_w + param7, (byte) -79, param0.field_t + param1);
        var9 = ((al) this).b(param0, 75);
        var10 = this.d(param0, -19);
        if (((al) this).field_p) {
          int discarded$1 = ((al) this).field_b.a(((al) this).c(param0, 4373), this.a(0, param0, param1, param6), this.a(param7, param0, (byte) -24, param2), var9, var10, param5, param4, ((al) this).field_k, ((al) this).field_d, ((al) this).field_c);
          if (param3 >= 37) {
            dh.a(-581);
            return;
          } else {
            var14 = null;
            al.a((String) null, (byte) -67);
            dh.a(-581);
            return;
          }
        } else {
          L0: {
            var12 = ((al) this).field_d;
            if (var12 != -1) {
              if (-3 == var12) {
                L1: {
                  var11 = -((al) this).field_b.field_K + var10;
                  var12 = ((al) this).field_k;
                  if (var12 != 0) {
                    if ((var12 ^ -1) == -4) {
                      break L1;
                    } else {
                      if ((var12 ^ -1) != -2) {
                        if (var12 == 2) {
                          ((al) this).field_b.c(((al) this).c(param0, 4373), var9 + this.a(0, param0, param1, param6), this.a(param7, param0, (byte) 122, param2) + var11, param5, param4);
                          if (param3 >= 37) {
                            dh.a(-581);
                            return;
                          } else {
                            var14 = null;
                            al.a((String) null, (byte) -67);
                            dh.a(-581);
                            return;
                          }
                        } else {
                          if (param3 >= 37) {
                            dh.a(-581);
                            return;
                          } else {
                            var14 = null;
                            al.a((String) null, (byte) -67);
                            dh.a(-581);
                            return;
                          }
                        }
                      } else {
                        ((al) this).field_b.a(((al) this).c(param0, 4373), this.a(0, param0, param1, param6) + (var9 >> -902192255), var11 + this.a(param7, param0, (byte) 120, param2), param5, param4);
                        if (param3 >= 37) {
                          dh.a(-581);
                          return;
                        } else {
                          var14 = null;
                          al.a((String) null, (byte) -67);
                          dh.a(-581);
                          return;
                        }
                      }
                    }
                  } else {
                    break L1;
                  }
                }
                ((al) this).field_b.b(((al) this).c(param0, 4373), this.a(0, param0, param1, param6), var11 + this.a(param7, param0, (byte) -79, param2), param5, param4);
                if (param3 >= 37) {
                  dh.a(-581);
                  return;
                } else {
                  var14 = null;
                  al.a((String) null, (byte) -67);
                  dh.a(-581);
                  return;
                }
              } else {
                if (-4 != (var12 ^ -1)) {
                  if ((var12 ^ -1) != -2) {
                    var11 = ((al) this).field_b.field_N + (-((al) this).field_b.field_K + (-((al) this).field_b.field_N + var10) >> -77187071);
                    var12 = ((al) this).field_k;
                    if (var12 != 0) {
                      if ((var12 ^ -1) == -4) {
                        ((al) this).field_b.b(((al) this).c(param0, 4373), this.a(0, param0, param1, param6), var11 + this.a(param7, param0, (byte) -79, param2), param5, param4);
                        if (param3 >= 37) {
                          dh.a(-581);
                          return;
                        } else {
                          var14 = null;
                          al.a((String) null, (byte) -67);
                          dh.a(-581);
                          return;
                        }
                      } else {
                        if ((var12 ^ -1) != -2) {
                          if (var12 != 2) {
                            if (param3 >= 37) {
                              dh.a(-581);
                              return;
                            } else {
                              var14 = null;
                              al.a((String) null, (byte) -67);
                              dh.a(-581);
                              return;
                            }
                          } else {
                            ((al) this).field_b.c(((al) this).c(param0, 4373), var9 + this.a(0, param0, param1, param6), this.a(param7, param0, (byte) 122, param2) + var11, param5, param4);
                            if (param3 >= 37) {
                              dh.a(-581);
                              return;
                            } else {
                              var14 = null;
                              al.a((String) null, (byte) -67);
                              dh.a(-581);
                              return;
                            }
                          }
                        } else {
                          ((al) this).field_b.a(((al) this).c(param0, 4373), this.a(0, param0, param1, param6) + (var9 >> -902192255), var11 + this.a(param7, param0, (byte) 120, param2), param5, param4);
                          if (param3 >= 37) {
                            dh.a(-581);
                            return;
                          } else {
                            var14 = null;
                            al.a((String) null, (byte) -67);
                            dh.a(-581);
                            return;
                          }
                        }
                      }
                    } else {
                      ((al) this).field_b.b(((al) this).c(param0, 4373), this.a(0, param0, param1, param6), var11 + this.a(param7, param0, (byte) -79, param2), param5, param4);
                      if (param3 >= 37) {
                        dh.a(-581);
                        return;
                      } else {
                        var14 = null;
                        al.a((String) null, (byte) -67);
                        dh.a(-581);
                        return;
                      }
                    }
                  } else {
                    var11 = ((al) this).field_b.field_N + (-((al) this).field_b.field_K + (-((al) this).field_b.field_N + var10) >> -77187071);
                    var12 = ((al) this).field_k;
                    if (var12 != 0) {
                      if ((var12 ^ -1) == -4) {
                        ((al) this).field_b.b(((al) this).c(param0, 4373), this.a(0, param0, param1, param6), var11 + this.a(param7, param0, (byte) -79, param2), param5, param4);
                        if (param3 >= 37) {
                          dh.a(-581);
                          return;
                        } else {
                          var14 = null;
                          al.a((String) null, (byte) -67);
                          dh.a(-581);
                          return;
                        }
                      } else {
                        if ((var12 ^ -1) != -2) {
                          if (var12 != 2) {
                            if (param3 >= 37) {
                              dh.a(-581);
                              return;
                            } else {
                              var14 = null;
                              al.a((String) null, (byte) -67);
                              dh.a(-581);
                              return;
                            }
                          } else {
                            ((al) this).field_b.c(((al) this).c(param0, 4373), var9 + this.a(0, param0, param1, param6), this.a(param7, param0, (byte) 122, param2) + var11, param5, param4);
                            if (param3 >= 37) {
                              dh.a(-581);
                              return;
                            } else {
                              var14 = null;
                              al.a((String) null, (byte) -67);
                              dh.a(-581);
                              return;
                            }
                          }
                        } else {
                          ((al) this).field_b.a(((al) this).c(param0, 4373), this.a(0, param0, param1, param6) + (var9 >> -902192255), var11 + this.a(param7, param0, (byte) 120, param2), param5, param4);
                          if (param3 >= 37) {
                            dh.a(-581);
                            return;
                          } else {
                            var14 = null;
                            al.a((String) null, (byte) -67);
                            dh.a(-581);
                            return;
                          }
                        }
                      }
                    } else {
                      ((al) this).field_b.b(((al) this).c(param0, 4373), this.a(0, param0, param1, param6), var11 + this.a(param7, param0, (byte) -79, param2), param5, param4);
                      if (param3 >= 37) {
                        dh.a(-581);
                        return;
                      } else {
                        var14 = null;
                        al.a((String) null, (byte) -67);
                        dh.a(-581);
                        return;
                      }
                    }
                  }
                } else {
                  var11 = ((al) this).field_b.field_N + (-((al) this).field_b.field_K + (-((al) this).field_b.field_N + var10) >> -77187071);
                  break L0;
                }
              }
            } else {
              var11 = ((al) this).field_b.field_N;
              break L0;
            }
          }
          var12 = ((al) this).field_k;
          if (var12 != 0) {
            if ((var12 ^ -1) == -4) {
              ((al) this).field_b.b(((al) this).c(param0, 4373), this.a(0, param0, param1, param6), var11 + this.a(param7, param0, (byte) -79, param2), param5, param4);
              if (param3 >= 37) {
                dh.a(-581);
                return;
              } else {
                var14 = null;
                al.a((String) null, (byte) -67);
                dh.a(-581);
                return;
              }
            } else {
              if ((var12 ^ -1) != -2) {
                if (var12 != 2) {
                  if (param3 >= 37) {
                    dh.a(-581);
                    return;
                  } else {
                    var14 = null;
                    al.a((String) null, (byte) -67);
                    dh.a(-581);
                    return;
                  }
                } else {
                  ((al) this).field_b.c(((al) this).c(param0, 4373), var9 + this.a(0, param0, param1, param6), this.a(param7, param0, (byte) 122, param2) + var11, param5, param4);
                  if (param3 >= 37) {
                    dh.a(-581);
                    return;
                  } else {
                    var14 = null;
                    al.a((String) null, (byte) -67);
                    dh.a(-581);
                    return;
                  }
                }
              } else {
                ((al) this).field_b.a(((al) this).c(param0, 4373), this.a(0, param0, param1, param6) + (var9 >> -902192255), var11 + this.a(param7, param0, (byte) 120, param2), param5, param4);
                if (param3 >= 37) {
                  dh.a(-581);
                  return;
                } else {
                  var14 = null;
                  al.a((String) null, (byte) -67);
                  dh.a(-581);
                  return;
                }
              }
            }
          } else {
            ((al) this).field_b.b(((al) this).c(param0, 4373), this.a(0, param0, param1, param6), var11 + this.a(param7, param0, (byte) -79, param2), param5, param4);
            if (param3 >= 37) {
              dh.a(-581);
              return;
            } else {
              var14 = null;
              al.a((String) null, (byte) -67);
              dh.a(-581);
              return;
            }
          }
        }
    }

    String c(na param0, int param1) {
        if (param1 != 4373) {
            Object var4 = null;
            ((al) this).a(105, (al) null);
            return param0.field_A;
        }
        return param0.field_A;
    }

    public final void a(int param0, int param1, int param2, int param3, int param4, na param5) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        Object var17 = null;
        hi var20 = null;
        hi var21 = null;
        bk var22 = null;
        hi var23 = null;
        hi var24 = null;
        bk var25 = null;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_37_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        var16 = TetraLink.field_J;
        if (param2 == param0) {
          return;
        } else {
          if (param1 != 18985) {
            L0: {
              var17 = null;
              this.a(-123, (na) null);
              if (param5.c(param1 + -18982)) {
                L1: {
                  var21 = ((al) this).a(param5, false);
                  var20 = var21;
                  if (param2 > param0) {
                    var9 = param2;
                    var8 = param0;
                    break L1;
                  } else {
                    var9 = param0;
                    var8 = param2;
                    break L1;
                  }
                }
                var10 = var20.a(var8, 107);
                var11 = var20.a(var9, 113);
                kl.a(param3 - (-param5.field_t - param5.field_F), param5.field_u + param5.field_w + param4, param5.field_w + param4, (byte) -79, param5.field_t + param3);
                var12 = var10;
                L2: while (true) {
                  if (var11 < var12) {
                    dh.a(-581);
                    break L0;
                  } else {
                    L3: {
                      var22 = var21.field_c[var12];
                      if (var10 == var12) {
                        stackOut_31_0 = var20.a(var8, true);
                        stackIn_32_0 = stackOut_31_0;
                        break L3;
                      } else {
                        stackOut_30_0 = var22.field_j[0];
                        stackIn_32_0 = stackOut_30_0;
                        break L3;
                      }
                    }
                    L4: {
                      var14 = stackIn_32_0;
                      if (var11 == var12) {
                        stackOut_36_0 = var20.a(var9, true);
                        stackIn_37_0 = stackOut_36_0;
                        break L4;
                      } else {
                        if (var22 != null) {
                          stackOut_35_0 = var22.field_j[-1 + var22.field_j.length];
                          stackIn_37_0 = stackOut_35_0;
                          break L4;
                        } else {
                          stackOut_34_0 = 0;
                          stackIn_37_0 = stackOut_34_0;
                          break L4;
                        }
                      }
                    }
                    var15 = stackIn_37_0;
                    dh.field_q.a(param4 + param5.field_w + ((al) this).field_j - (-param5.field_o + -var22.field_h), var15 - var14, 13421772, ((al) this).field_n, var22.field_a, ((al) this).field_n >>> -1434745832, this.a(0, param5, param3, var14));
                    var12++;
                    continue L2;
                  }
                }
              } else {
                break L0;
              }
            }
            return;
          } else {
            L5: {
              if (param5.c(param1 + -18982)) {
                L6: {
                  var24 = ((al) this).a(param5, false);
                  var23 = var24;
                  if (param2 > param0) {
                    var9 = param2;
                    var8 = param0;
                    break L6;
                  } else {
                    var9 = param0;
                    var8 = param2;
                    break L6;
                  }
                }
                var10 = var23.a(var8, 107);
                var11 = var23.a(var9, 113);
                kl.a(param3 - (-param5.field_t - param5.field_F), param5.field_u + param5.field_w + param4, param5.field_w + param4, (byte) -79, param5.field_t + param3);
                var12 = var10;
                L7: while (true) {
                  if (var11 < var12) {
                    dh.a(-581);
                    break L5;
                  } else {
                    L8: {
                      var25 = var24.field_c[var12];
                      if (var10 == var12) {
                        stackOut_13_0 = var23.a(var8, true);
                        stackIn_14_0 = stackOut_13_0;
                        break L8;
                      } else {
                        stackOut_12_0 = var25.field_j[0];
                        stackIn_14_0 = stackOut_12_0;
                        break L8;
                      }
                    }
                    L9: {
                      var14 = stackIn_14_0;
                      if (var11 == var12) {
                        stackOut_18_0 = var23.a(var9, true);
                        stackIn_19_0 = stackOut_18_0;
                        break L9;
                      } else {
                        if (var25 != null) {
                          stackOut_17_0 = var25.field_j[-1 + var25.field_j.length];
                          stackIn_19_0 = stackOut_17_0;
                          break L9;
                        } else {
                          stackOut_16_0 = 0;
                          stackIn_19_0 = stackOut_16_0;
                          break L9;
                        }
                      }
                    }
                    var15 = stackIn_19_0;
                    dh.field_q.a(param4 + param5.field_w + ((al) this).field_j - (-param5.field_o + -var25.field_h), var15 - var14, 13421772, ((al) this).field_n, var25.field_a, ((al) this).field_n >>> -1434745832, this.a(0, param5, param3, var14));
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

    private final int a(int param0, na param1, int param2, int param3) {
        Object var6 = null;
        if (param0 != 0) {
          var6 = null;
          int discarded$2 = ((al) this).a((na) null, 74, false);
          return param1.field_t + (param2 + ((al) this).field_f) + (param1.field_E + param3);
        } else {
          return param1.field_t + (param2 + ((al) this).field_f) + (param1.field_E + param3);
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_l = null;
        field_i = null;
        int var1 = -5 % ((-21 - param0) / 62);
    }

    private final int d(na param0, int param1) {
        int var3 = 39 / ((-81 - param1) / 32);
        return -((al) this).field_j + param0.field_u - ((al) this).field_h;
    }

    public final int a(na param0, int param1) {
        Object var4 = null;
        if (param1 < 65) {
          var4 = null;
          int discarded$6 = ((al) this).a(-16, 92, (na) null);
          hi discarded$7 = ((al) this).a(param0, false);
          return param0.field_D.a(true) + (((al) this).field_j + ((al) this).field_h);
        } else {
          hi discarded$8 = ((al) this).a(param0, false);
          return param0.field_D.a(true) + (((al) this).field_j + ((al) this).field_h);
        }
    }

    protected al() {
    }

    al(jb param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    al(jb param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        ((al) this).field_g = param2;
        ((al) this).field_n = param11;
        ((al) this).field_c = param9;
        ((al) this).field_o = param10;
        ((al) this).field_m = param6;
        ((al) this).field_h = param4;
        ((al) this).field_j = param3;
        ((al) this).field_d = param8;
        ((al) this).field_k = param7;
        ((al) this).field_b = param0;
        ((al) this).field_f = param1;
        ((al) this).field_a = param5;
        ((al) this).field_p = param12 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "This game is full.";
        field_e = "Continue";
    }
}
