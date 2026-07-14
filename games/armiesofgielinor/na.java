/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na extends tj implements mf, he {
    static me field_G;
    private ma field_P;
    static int field_E;
    kv field_M;
    static String field_K;
    private fw field_L;
    static String field_I;
    static int field_F;
    private fw field_O;
    static String field_N;
    static int[] field_J;

    public na() {
        super(0, 0, 496, 0, (kh) null);
        ((na) this).field_P = new ma("", (qo) null, 12);
        lk var1 = new lk(gl.field_e, 0, 0, 0, 0, 16777215, -1, 3, 0, ArmiesOfGielinor.field_J.field_H, -1, 2147483647, true);
        kb var2 = new kb(iu.field_u, (kh) (Object) var1, (qo) null);
        ((na) this).field_O = new fw(ul.field_f, (qo) null);
        ((na) this).field_L = new fw(ac.field_s, (qo) null);
        ((na) this).field_P.field_s = ms.field_m;
        ((na) this).field_P.a((byte) 16, (n) (Object) new uj((fn) (Object) ((na) this).field_P));
        ((na) this).field_O.field_I = false;
        ((na) this).field_O.field_k = (kh) (Object) new nu();
        ((na) this).field_L.field_k = (kh) (Object) new td();
        ((na) this).field_P.field_k = (kh) (Object) new lu(10000536);
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(20, 270, var3, 8192, 50);
        var3 += 50;
        ((na) this).a((byte) 10, var2);
        var3 = var3 + (5 + this.a(-124, fq.field_k, dn.field_Ob, 170, var3, (kb) (Object) ((na) this).field_P));
        ((na) this).field_O.a(496 - var5 >> 1706931905, var5, var3, 8192, 40);
        ((na) this).field_L.a(var4 + 3, 60, var3 + 15, 8192, 40);
        ((na) this).field_L.field_x = (qo) this;
        ((na) this).field_O.field_x = (qo) this;
        ((na) this).a((byte) 10, (kb) (Object) ((na) this).field_O);
        ((na) this).a((byte) 10, (kb) (Object) ((na) this).field_L);
        ((na) this).field_M = new kv((mf) this);
        ((na) this).field_M.a(60 + (((na) this).field_P.field_B + ((na) this).field_P.field_l), -60 + (-((na) this).field_P.field_B + (((na) this).field_l + -((na) this).field_P.field_l)), 20, 8192, 150);
        ((na) this).a((byte) 10, (kb) (Object) ((na) this).field_M);
        ((na) this).a(0, 496, 0, 8192, var4 + var3 + 55);
    }

    public final void a(int param0, int param1, int param2, int param3, fw param4) {
        if (param1 == 11) {
          if (param4 != ((na) this).field_L) {
            if (param4 == ((na) this).field_O) {
              this.b(false);
              return;
            } else {
              return;
            }
          } else {
            ou.b((byte) 115);
            return;
          }
        } else {
          ((na) this).field_L = null;
          if (param4 != ((na) this).field_L) {
            if (param4 != ((na) this).field_O) {
              return;
            } else {
              this.b(false);
              return;
            }
          } else {
            ou.b((byte) 115);
            return;
          }
        }
    }

    public final void a(byte param0) {
        ((uj) (Object) ((na) this).field_P.a(param0 + -918933514)).g(50);
        if (param0 != -116) {
            Object var3 = null;
            int discarded$0 = this.a(-47, 45, (String) null, (kb) null, 47, (String) null, -7);
        }
    }

    final void a(int param0, int param1, int param2, kb param3) {
        this.a(param0 ^ 0, param1, param2, param3);
        if (param0 != 32722) {
          ((na) this).field_O = null;
          ((na) this).field_O.field_I = this.a(-29967);
          return;
        } else {
          ((na) this).field_O.field_I = this.a(-29967);
          return;
        }
    }

    private final boolean a(boolean param0, eg param1) {
        if (!param0) {
            return false;
        }
        n var3 = param1.a(-918933630);
        if (!(var3 != null)) {
            return true;
        }
        gu var4 = var3.a(false);
        return var4 == oo.field_g ? true : false;
    }

    private final boolean a(int param0) {
        if (param0 != -29967) {
            return false;
        }
        if (!this.a(true, (eg) (Object) ((na) this).field_P)) {
            return false;
        }
        return true;
    }

    private final void b(boolean param0) {
        if (param0) {
            return;
        }
        if (!this.a(-29967)) {
            return;
        }
        q.a(param0, ((na) this).field_P.field_v);
    }

    final static void c(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var14 = ArmiesOfGielinor.field_M ? 1 : 0;
          var5 = param1 + param0;
          var6 = param3 + param4;
          if (param1 > qn.field_j) {
            stackOut_2_0 = param1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = qn.field_j;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var7 = stackIn_3_0;
          if (qn.field_a < param4) {
            stackOut_5_0 = param4;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = qn.field_a;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var8 = stackIn_6_0;
          if (var5 >= qn.field_e) {
            stackOut_8_0 = qn.field_e;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = var5;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var9 = stackIn_9_0;
          if (var6 >= qn.field_f) {
            stackOut_11_0 = qn.field_f;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = var6;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        var10 = stackIn_12_0;
        if (param1 >= qn.field_j) {
          if (param1 < qn.field_e) {
            var11 = var8 * qn.field_l + param1;
            var12 = 1 + var10 + -var8 >> -621278815;
            L4: while (true) {
              var12--;
              if (-1 < (var12 ^ -1)) {
                L5: {
                  if (qn.field_a > param4) {
                    break L5;
                  } else {
                    if (qn.field_f > var6) {
                      var11 = qn.field_l * param4 + var7;
                      var12 = -var7 + var9 + 1 >> 1874126561;
                      L6: while (true) {
                        var12--;
                        if (var12 < 0) {
                          break L5;
                        } else {
                          qn.field_d[var11] = 16777215;
                          var11 += 2;
                          continue L6;
                        }
                      }
                    } else {
                      L7: {
                        var11 = 72 / ((param2 - 79) / 37);
                        if (qn.field_j > var5) {
                          break L7;
                        } else {
                          if (qn.field_e > var5) {
                            var12 = var5 + qn.field_l * ((1 & var5 - param1) + var8);
                            var13 = 1 - -var10 + -var8 >> 676038305;
                            L8: while (true) {
                              var13--;
                              if (-1 < (var13 ^ -1)) {
                                break L7;
                              } else {
                                qn.field_d[var12] = 16777215;
                                var12 = var12 + 2 * qn.field_l;
                                continue L8;
                              }
                            }
                          } else {
                            L9: {
                              if (qn.field_a > param4) {
                                break L9;
                              } else {
                                if (var6 >= qn.field_f) {
                                  break L9;
                                } else {
                                  var12 = var7 + (qn.field_l * var6 + (-param4 + var6 & 1));
                                  var13 = 1 + var9 - var7 >> 1535936193;
                                  L10: while (true) {
                                    var13--;
                                    if (0 > var13) {
                                      break L9;
                                    } else {
                                      qn.field_d[var12] = 16777215;
                                      var12 += 2;
                                      continue L10;
                                    }
                                  }
                                }
                              }
                            }
                            return;
                          }
                        }
                      }
                      L11: {
                        if (qn.field_a > param4) {
                          break L11;
                        } else {
                          if (var6 >= qn.field_f) {
                            break L11;
                          } else {
                            var12 = var7 + (qn.field_l * var6 + (-param4 + var6 & 1));
                            var13 = 1 + var9 - var7 >> 1535936193;
                            L12: while (true) {
                              var13--;
                              if (0 > var13) {
                                break L11;
                              } else {
                                qn.field_d[var12] = 16777215;
                                var12 += 2;
                                continue L12;
                              }
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                L13: {
                  var11 = 72 / ((param2 - 79) / 37);
                  if (qn.field_j > var5) {
                    break L13;
                  } else {
                    if (qn.field_e > var5) {
                      var12 = var5 + qn.field_l * ((1 & var5 - param1) + var8);
                      var13 = 1 - -var10 + -var8 >> 676038305;
                      L14: while (true) {
                        var13--;
                        if (-1 < (var13 ^ -1)) {
                          break L13;
                        } else {
                          qn.field_d[var12] = 16777215;
                          var12 = var12 + 2 * qn.field_l;
                          continue L14;
                        }
                      }
                    } else {
                      L15: {
                        if (qn.field_a > param4) {
                          break L15;
                        } else {
                          if (var6 >= qn.field_f) {
                            break L15;
                          } else {
                            var12 = var7 + (qn.field_l * var6 + (-param4 + var6 & 1));
                            var13 = 1 + var9 - var7 >> 1535936193;
                            L16: while (true) {
                              var13--;
                              if (0 > var13) {
                                break L15;
                              } else {
                                qn.field_d[var12] = 16777215;
                                var12 += 2;
                                continue L16;
                              }
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                L17: {
                  if (qn.field_a > param4) {
                    break L17;
                  } else {
                    if (var6 >= qn.field_f) {
                      break L17;
                    } else {
                      var12 = var7 + (qn.field_l * var6 + (-param4 + var6 & 1));
                      var13 = 1 + var9 - var7 >> 1535936193;
                      L18: while (true) {
                        var13--;
                        if (0 > var13) {
                          break L17;
                        } else {
                          qn.field_d[var12] = 16777215;
                          var12 += 2;
                          continue L18;
                        }
                      }
                    }
                  }
                }
                return;
              } else {
                qn.field_d[var11] = 16777215;
                var11 = var11 + 2 * qn.field_l;
                continue L4;
              }
            }
          } else {
            if (qn.field_a <= param4) {
              if (qn.field_f > var6) {
                var11 = qn.field_l * param4 + var7;
                var12 = -var7 + var9 + 1 >> 1874126561;
                L19: while (true) {
                  var12--;
                  if (var12 < 0) {
                    L20: {
                      var11 = 72 / ((param2 - 79) / 37);
                      if (qn.field_j > var5) {
                        break L20;
                      } else {
                        if (qn.field_e > var5) {
                          var12 = var5 + qn.field_l * ((1 & var5 - param1) + var8);
                          var13 = 1 - -var10 + -var8 >> 676038305;
                          L21: while (true) {
                            var13--;
                            if (-1 < (var13 ^ -1)) {
                              break L20;
                            } else {
                              qn.field_d[var12] = 16777215;
                              var12 = var12 + 2 * qn.field_l;
                              continue L21;
                            }
                          }
                        } else {
                          L22: {
                            if (qn.field_a > param4) {
                              break L22;
                            } else {
                              if (var6 >= qn.field_f) {
                                break L22;
                              } else {
                                var12 = var7 + (qn.field_l * var6 + (-param4 + var6 & 1));
                                var13 = 1 + var9 - var7 >> 1535936193;
                                L23: while (true) {
                                  var13--;
                                  if (0 > var13) {
                                    break L22;
                                  } else {
                                    qn.field_d[var12] = 16777215;
                                    var12 += 2;
                                    continue L23;
                                  }
                                }
                              }
                            }
                          }
                          return;
                        }
                      }
                    }
                    if (qn.field_a <= param4) {
                      if (var6 < qn.field_f) {
                        var12 = var7 + (qn.field_l * var6 + (-param4 + var6 & 1));
                        var13 = 1 + var9 - var7 >> 1535936193;
                        L24: while (true) {
                          var13--;
                          if (0 > var13) {
                            return;
                          } else {
                            qn.field_d[var12] = 16777215;
                            var12 += 2;
                            continue L24;
                          }
                        }
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    qn.field_d[var11] = 16777215;
                    var11 += 2;
                    continue L19;
                  }
                }
              } else {
                L25: {
                  var11 = 72 / ((param2 - 79) / 37);
                  if (qn.field_j > var5) {
                    break L25;
                  } else {
                    if (qn.field_e > var5) {
                      var12 = var5 + qn.field_l * ((1 & var5 - param1) + var8);
                      var13 = 1 - -var10 + -var8 >> 676038305;
                      L26: while (true) {
                        var13--;
                        if (-1 < (var13 ^ -1)) {
                          break L25;
                        } else {
                          qn.field_d[var12] = 16777215;
                          var12 = var12 + 2 * qn.field_l;
                          continue L26;
                        }
                      }
                    } else {
                      break L25;
                    }
                  }
                }
                L27: {
                  if (qn.field_a > param4) {
                    break L27;
                  } else {
                    if (var6 >= qn.field_f) {
                      break L27;
                    } else {
                      var12 = var7 + (qn.field_l * var6 + (-param4 + var6 & 1));
                      var13 = 1 + var9 - var7 >> 1535936193;
                      L28: while (true) {
                        var13--;
                        if (0 > var13) {
                          break L27;
                        } else {
                          qn.field_d[var12] = 16777215;
                          var12 += 2;
                          continue L28;
                        }
                      }
                    }
                  }
                }
                return;
              }
            } else {
              L29: {
                var11 = 72 / ((param2 - 79) / 37);
                if (qn.field_j > var5) {
                  break L29;
                } else {
                  if (qn.field_e > var5) {
                    var12 = var5 + qn.field_l * ((1 & var5 - param1) + var8);
                    var13 = 1 - -var10 + -var8 >> 676038305;
                    L30: while (true) {
                      var13--;
                      if (-1 < (var13 ^ -1)) {
                        break L29;
                      } else {
                        qn.field_d[var12] = 16777215;
                        var12 = var12 + 2 * qn.field_l;
                        continue L30;
                      }
                    }
                  } else {
                    break L29;
                  }
                }
              }
              L31: {
                if (qn.field_a > param4) {
                  break L31;
                } else {
                  if (var6 >= qn.field_f) {
                    break L31;
                  } else {
                    var12 = var7 + (qn.field_l * var6 + (-param4 + var6 & 1));
                    var13 = 1 + var9 - var7 >> 1535936193;
                    L32: while (true) {
                      var13--;
                      if (0 > var13) {
                        break L31;
                      } else {
                        qn.field_d[var12] = 16777215;
                        var12 += 2;
                        continue L32;
                      }
                    }
                  }
                }
              }
              return;
            }
          }
        } else {
          L33: {
            if (qn.field_a > param4) {
              break L33;
            } else {
              if (qn.field_f > var6) {
                var11 = qn.field_l * param4 + var7;
                var12 = -var7 + var9 + 1 >> 1874126561;
                L34: while (true) {
                  var12--;
                  if (var12 < 0) {
                    break L33;
                  } else {
                    qn.field_d[var11] = 16777215;
                    var11 += 2;
                    continue L34;
                  }
                }
              } else {
                L35: {
                  var11 = 72 / ((param2 - 79) / 37);
                  if (qn.field_j > var5) {
                    break L35;
                  } else {
                    if (qn.field_e > var5) {
                      var12 = var5 + qn.field_l * ((1 & var5 - param1) + var8);
                      var13 = 1 - -var10 + -var8 >> 676038305;
                      L36: while (true) {
                        var13--;
                        if (-1 < (var13 ^ -1)) {
                          break L35;
                        } else {
                          qn.field_d[var12] = 16777215;
                          var12 = var12 + 2 * qn.field_l;
                          continue L36;
                        }
                      }
                    } else {
                      break L35;
                    }
                  }
                }
                L37: {
                  if (qn.field_a > param4) {
                    break L37;
                  } else {
                    if (var6 >= qn.field_f) {
                      break L37;
                    } else {
                      var12 = var7 + (qn.field_l * var6 + (-param4 + var6 & 1));
                      var13 = 1 + var9 - var7 >> 1535936193;
                      L38: while (true) {
                        var13--;
                        if (0 > var13) {
                          break L37;
                        } else {
                          qn.field_d[var12] = 16777215;
                          var12 += 2;
                          continue L38;
                        }
                      }
                    }
                  }
                }
                return;
              }
            }
          }
          var11 = 72 / ((param2 - 79) / 37);
          if (qn.field_j <= var5) {
            if (qn.field_e <= var5) {
              L39: {
                if (qn.field_a > param4) {
                  break L39;
                } else {
                  if (var6 >= qn.field_f) {
                    break L39;
                  } else {
                    var12 = var7 + (qn.field_l * var6 + (-param4 + var6 & 1));
                    var13 = 1 + var9 - var7 >> 1535936193;
                    L40: while (true) {
                      var13--;
                      if (0 > var13) {
                        break L39;
                      } else {
                        qn.field_d[var12] = 16777215;
                        var12 += 2;
                        continue L40;
                      }
                    }
                  }
                }
              }
              return;
            } else {
              var12 = var5 + qn.field_l * ((1 & var5 - param1) + var8);
              var13 = 1 - -var10 + -var8 >> 676038305;
              L41: while (true) {
                var13--;
                if (-1 < (var13 ^ -1)) {
                  L42: {
                    if (qn.field_a > param4) {
                      break L42;
                    } else {
                      if (var6 >= qn.field_f) {
                        break L42;
                      } else {
                        var12 = var7 + (qn.field_l * var6 + (-param4 + var6 & 1));
                        var13 = 1 + var9 - var7 >> 1535936193;
                        L43: while (true) {
                          var13--;
                          if (0 > var13) {
                            break L42;
                          } else {
                            qn.field_d[var12] = 16777215;
                            var12 += 2;
                            continue L43;
                          }
                        }
                      }
                    }
                  }
                  return;
                } else {
                  qn.field_d[var12] = 16777215;
                  var12 = var12 + 2 * qn.field_l;
                  continue L41;
                }
              }
            }
          } else {
            L44: {
              if (qn.field_a > param4) {
                break L44;
              } else {
                if (var6 >= qn.field_f) {
                  break L44;
                } else {
                  var12 = var7 + (qn.field_l * var6 + (-param4 + var6 & 1));
                  var13 = 1 + var9 - var7 >> 1535936193;
                  L45: while (true) {
                    var13--;
                    if (0 > var13) {
                      break L44;
                    } else {
                      qn.field_d[var12] = 16777215;
                      var12 += 2;
                      continue L45;
                    }
                  }
                }
              }
            }
            return;
          }
        }
    }

    private final int a(int param0, int param1, String param2, kb param3, int param4, String param5, int param6) {
        pk var9 = null;
        ta var10 = null;
        var10 = new ta(20, param0, 120 - -param4, 25, param3, false, 120, 3, ArmiesOfGielinor.field_J, 16777215, param2);
        ((na) this).a((byte) 10, (kb) (Object) var10);
        var9 = new pk(((eg) (Object) param3).a(-918933630), param5, 126, param0 + var10.field_w, param4 - -25, param1);
        var9.field_x = (qo) this;
        ((na) this).a((byte) 10, (kb) (Object) var9);
        if (param6 >= -59) {
          return 6;
        } else {
          return var9.field_w + var10.field_w;
        }
    }

    final static nd a(dr[] param0, byte param1, nd[] param2, String param3) throws cb {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        StringBuilder var8 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        var5 = 5 / ((-46 - param1) / 37);
        var4 = 0;
        L0: while (true) {
          if (param0.length > var4) {
            if (param0[var4].a(param3, (byte) 55, param2)) {
              return param0[var4].a(-24872, param2);
            } else {
              var4++;
              continue L0;
            }
          } else {
            var8 = new StringBuilder("The method " + param3 + "(");
            var7 = 0;
            var5 = var7;
            L1: while (true) {
              if (param2.length <= var7) {
                StringBuilder discarded$4 = var8.append(") is undefined.");
                throw new cb(var8.toString());
              } else {
                L2: {
                  if (!param2[var7].field_e) {
                    StringBuilder discarded$5 = var8.append(hw.a(640, param2[var7].field_c.getClass()));
                    break L2;
                  } else {
                    StringBuilder discarded$6 = var8.append(cq.a(param2[var7].field_c, (byte) -75).toString());
                    break L2;
                  }
                }
                if (var7 < param2.length + -1) {
                  StringBuilder discarded$7 = var8.append(44);
                  var7++;
                  continue L1;
                } else {
                  var7++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    public static void f(byte param0) {
        if (param0 != -117) {
          field_K = null;
          field_J = null;
          field_K = null;
          field_N = null;
          field_I = null;
          field_G = null;
          return;
        } else {
          field_J = null;
          field_K = null;
          field_N = null;
          field_I = null;
          field_G = null;
          return;
        }
    }

    public final void a(int param0, String param1) {
        ma var3 = null;
        String var4 = null;
        Object var5 = null;
        var3 = ((na) this).field_P;
        var4 = param1;
        ((fn) (Object) var3).a(false, var4, -27934);
        if (param0 != -1) {
          var5 = null;
          boolean discarded$2 = ((na) this).a((kb) null, 40, '', 104);
          return;
        } else {
          return;
        }
    }

    final static om a(bv param0, int param1) {
        int var2 = 0;
        om var3 = null;
        if (param1 < 3) {
          return null;
        } else {
          var2 = param0.i(1);
          param0.o(117);
          var3 = pf.a(var2, (byte) 6, param0);
          param0.n(-2);
          return var3;
        }
    }

    private final int a(int param0, String param1, String param2, int param3, int param4, kb param5) {
        if (param0 >= -55) {
            return -123;
        }
        return this.a(param4, 35, param1, param5, param3, param2, -67);
    }

    final boolean a(kb param0, int param1, char param2, int param3) {
        if (!(!this.a(param0, param1, param2, param3 + 0))) {
            return true;
        }
        if ((param1 ^ -1) == -99) {
            return ((na) this).a(false, param0);
        }
        if (param3 != -12215) {
            field_F = -74;
            if ((param1 ^ -1) == -100) {
                return ((na) this).b((byte) -127, param0);
            }
            return false;
        }
        if (!((param1 ^ -1) != -100)) {
            return ((na) this).b((byte) -127, param0);
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = 4;
        field_K = "Remove <%0> from friend list";
        field_I = "Spells";
        field_N = "This item can only be used on other players' units.";
        field_J = new int[]{1, 1, 2, 1, 1, 1, 2, 2, 2, 2, 3, 2, 2, 2, 3, 5, 1, 1, 1, 2, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 5, 2, 2, 2, 2, 2, 2, 3, 5, 3, 3, 5, 2, 3, 5, 3, 3, 5, 2, 3, 5, 2, 3, 5};
        field_G = new me(1, 2, 2, 0);
    }
}
