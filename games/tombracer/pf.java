/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pf extends nh {
    int field_o;
    static int field_u;
    static int field_e;
    static int field_c;
    static int field_i;
    int field_g;
    static int field_y;
    int field_v;
    static int field_x;
    static int field_k;
    static int field_A;
    static int field_C;
    static int field_B;
    static int field_j;
    int field_a;
    static int field_h;
    int field_f;
    private static int field_q;
    sfa field_b;
    static int field_D;
    private static int field_p;
    static int field_d;
    private static int field_s;
    private static int field_m;
    static int field_w;
    static int field_r;
    static int field_z;
    static int field_n;
    static int field_t;
    int field_l;

    final int a() {
        return ((pf) this).field_a;
    }

    abstract void b(int param0, int param1);

    abstract void b(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8);

    final int c() {
        return ((pf) this).field_f;
    }

    final int d() {
        return ((pf) this).field_l + ((pf) this).field_a + ((pf) this).field_g;
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8);

    abstract void a(int param0, int param1, int param2, int param3, int param4);

    private final boolean a(float param0, float param1, float param2, float param3, float param4, float param5) {
        int var7 = 0;
        int var8 = 0;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        float var20 = 0.0f;
        L0: {
          var7 = ((pf) this).field_l + ((pf) this).field_a + ((pf) this).field_g;
          var8 = ((pf) this).field_o + ((pf) this).field_f + ((pf) this).field_v;
          if (var7 != ((pf) this).field_a) {
            var9 = (param2 - param0) / (float)var7;
            var10 = (param3 - param1) / (float)var7;
            var11 = (param4 - param0) / (float)var8;
            var12 = (param5 - param1) / (float)var8;
            var13 = var11 * (float)((pf) this).field_o;
            var14 = var12 * (float)((pf) this).field_o;
            var15 = var9 * (float)((pf) this).field_l;
            var16 = var10 * (float)((pf) this).field_l;
            var17 = -var9 * (float)((pf) this).field_g;
            var18 = -var10 * (float)((pf) this).field_g;
            var19 = -var11 * (float)((pf) this).field_v;
            var20 = -var12 * (float)((pf) this).field_v;
            param0 = param0 + (var15 + var13);
            param1 = param1 + (var16 + var14);
            param2 = param2 + (var17 + var13);
            param3 = param3 + (var18 + var14);
            param4 = param4 + (var15 + var19);
            param5 = param5 + (var16 + var20);
            break L0;
          } else {
            if (var8 == ((pf) this).field_f) {
              break L0;
            } else {
              L1: {
                var9 = (param2 - param0) / (float)var7;
                var10 = (param3 - param1) / (float)var7;
                var11 = (param4 - param0) / (float)var8;
                var12 = (param5 - param1) / (float)var8;
                var13 = var11 * (float)((pf) this).field_o;
                var14 = var12 * (float)((pf) this).field_o;
                var15 = var9 * (float)((pf) this).field_l;
                var16 = var10 * (float)((pf) this).field_l;
                var17 = -var9 * (float)((pf) this).field_g;
                var18 = -var10 * (float)((pf) this).field_g;
                var19 = -var11 * (float)((pf) this).field_v;
                var20 = -var12 * (float)((pf) this).field_v;
                param0 = param0 + (var15 + var13);
                param1 = param1 + (var16 + var14);
                param2 = param2 + (var17 + var13);
                param3 = param3 + (var18 + var14);
                param4 = param4 + (var15 + var19);
                param5 = param5 + (var16 + var20);
                var9 = param4 + (param2 - param0);
                var10 = param3 + (param5 - param1);
                if (param0 >= param2) {
                  var11 = param2;
                  var12 = param0;
                  break L1;
                } else {
                  var11 = param0;
                  var12 = param2;
                  break L1;
                }
              }
              L2: {
                if (param4 >= var11) {
                  break L2;
                } else {
                  var11 = param4;
                  break L2;
                }
              }
              L3: {
                if (var9 >= var11) {
                  break L3;
                } else {
                  var11 = var9;
                  break L3;
                }
              }
              L4: {
                if (param4 <= var12) {
                  break L4;
                } else {
                  var12 = param4;
                  break L4;
                }
              }
              L5: {
                if (var9 <= var12) {
                  break L5;
                } else {
                  var12 = var9;
                  break L5;
                }
              }
              L6: {
                if (param1 >= param3) {
                  var13 = param3;
                  var14 = param1;
                  break L6;
                } else {
                  var13 = param1;
                  var14 = param3;
                  break L6;
                }
              }
              L7: {
                if (param5 >= var13) {
                  break L7;
                } else {
                  var13 = param5;
                  break L7;
                }
              }
              L8: {
                if (var10 >= var13) {
                  break L8;
                } else {
                  var13 = var10;
                  break L8;
                }
              }
              L9: {
                if (param5 <= var14) {
                  break L9;
                } else {
                  var14 = param5;
                  break L9;
                }
              }
              L10: {
                if (var10 <= var14) {
                  break L10;
                } else {
                  var14 = var10;
                  break L10;
                }
              }
              L11: {
                if (var11 >= (float)((pf) this).field_b.field_J) {
                  break L11;
                } else {
                  var11 = (float)((pf) this).field_b.field_J;
                  break L11;
                }
              }
              L12: {
                if (var12 <= (float)((pf) this).field_b.field_W) {
                  break L12;
                } else {
                  var12 = (float)((pf) this).field_b.field_W;
                  break L12;
                }
              }
              L13: {
                if (var13 >= (float)((pf) this).field_b.field_d) {
                  break L13;
                } else {
                  var13 = (float)((pf) this).field_b.field_d;
                  break L13;
                }
              }
              L14: {
                if (var14 <= (float)((pf) this).field_b.field_P) {
                  break L14;
                } else {
                  var14 = (float)((pf) this).field_b.field_P;
                  break L14;
                }
              }
              var12 = var11 - var12;
              if (var12 < 0.0f) {
                var14 = var13 - var14;
                if (var14 >= 0.0f) {
                  return false;
                } else {
                  field_x = ((pf) this).field_b.field_K;
                  field_e = (int)((float)((int)var13 * field_x) + var11);
                  var15 = (param2 - param0) * (param5 - param1) - (param3 - param1) * (param4 - param0);
                  var16 = (param4 - param0) * (param3 - param1) - (param5 - param1) * (param2 - param0);
                  field_z = (int)((param5 - param1) * 4096.0f * (float)((pf) this).field_a / var15);
                  field_y = (int)((param3 - param1) * 4096.0f * (float)((pf) this).field_f / var16);
                  field_u = (int)((param4 - param0) * 4096.0f * (float)((pf) this).field_a / var16);
                  field_A = (int)((param2 - param0) * 4096.0f * (float)((pf) this).field_f / var15);
                  field_p = (int)(var11 * 16.0f + 8.0f - (param0 + param2 + param4 + var9) / 4.0f * 16.0f);
                  field_m = (int)(var13 * 16.0f + 8.0f - (param1 + param3 + param5 + var10) / 4.0f * 16.0f);
                  field_n = (((pf) this).field_a >> 1 << 12) + (field_m * field_u >> 4);
                  field_w = (((pf) this).field_f >> 1 << 12) + (field_m * field_A >> 4);
                  field_C = field_p * field_z >> 4;
                  field_r = field_p * field_y >> 4;
                  field_i = (int)var12;
                  field_c = (int)var14;
                  return true;
                }
              } else {
                return false;
              }
            }
          }
        }
        L15: {
          var9 = param4 + (param2 - param0);
          var10 = param3 + (param5 - param1);
          if (param0 >= param2) {
            var11 = param2;
            var12 = param0;
            break L15;
          } else {
            var11 = param0;
            var12 = param2;
            break L15;
          }
        }
        L16: {
          if (param4 >= var11) {
            break L16;
          } else {
            var11 = param4;
            break L16;
          }
        }
        L17: {
          if (var9 >= var11) {
            break L17;
          } else {
            var11 = var9;
            break L17;
          }
        }
        L18: {
          if (param4 <= var12) {
            break L18;
          } else {
            var12 = param4;
            break L18;
          }
        }
        L19: {
          if (var9 <= var12) {
            break L19;
          } else {
            var12 = var9;
            break L19;
          }
        }
        L20: {
          if (param1 >= param3) {
            var13 = param3;
            var14 = param1;
            break L20;
          } else {
            var13 = param1;
            var14 = param3;
            break L20;
          }
        }
        L21: {
          if (param5 >= var13) {
            break L21;
          } else {
            var13 = param5;
            break L21;
          }
        }
        L22: {
          if (var10 >= var13) {
            break L22;
          } else {
            var13 = var10;
            break L22;
          }
        }
        L23: {
          if (param5 <= var14) {
            break L23;
          } else {
            var14 = param5;
            break L23;
          }
        }
        L24: {
          if (var10 <= var14) {
            break L24;
          } else {
            var14 = var10;
            break L24;
          }
        }
        L25: {
          if (var11 >= (float)((pf) this).field_b.field_J) {
            break L25;
          } else {
            var11 = (float)((pf) this).field_b.field_J;
            break L25;
          }
        }
        L26: {
          if (var12 <= (float)((pf) this).field_b.field_W) {
            break L26;
          } else {
            var12 = (float)((pf) this).field_b.field_W;
            break L26;
          }
        }
        L27: {
          if (var13 >= (float)((pf) this).field_b.field_d) {
            break L27;
          } else {
            var13 = (float)((pf) this).field_b.field_d;
            break L27;
          }
        }
        L28: {
          if (var14 <= (float)((pf) this).field_b.field_P) {
            break L28;
          } else {
            var14 = (float)((pf) this).field_b.field_P;
            break L28;
          }
        }
        var12 = var11 - var12;
        if (var12 < 0.0f) {
          var14 = var13 - var14;
          if (var14 >= 0.0f) {
            return false;
          } else {
            field_x = ((pf) this).field_b.field_K;
            field_e = (int)((float)((int)var13 * field_x) + var11);
            var15 = (param2 - param0) * (param5 - param1) - (param3 - param1) * (param4 - param0);
            var16 = (param4 - param0) * (param3 - param1) - (param5 - param1) * (param2 - param0);
            field_z = (int)((param5 - param1) * 4096.0f * (float)((pf) this).field_a / var15);
            field_y = (int)((param3 - param1) * 4096.0f * (float)((pf) this).field_f / var16);
            field_u = (int)((param4 - param0) * 4096.0f * (float)((pf) this).field_a / var16);
            field_A = (int)((param2 - param0) * 4096.0f * (float)((pf) this).field_f / var15);
            field_p = (int)(var11 * 16.0f + 8.0f - (param0 + param2 + param4 + var9) / 4.0f * 16.0f);
            field_m = (int)(var13 * 16.0f + 8.0f - (param1 + param3 + param5 + var10) / 4.0f * 16.0f);
            field_n = (((pf) this).field_a >> 1 << 12) + (field_m * field_u >> 4);
            field_w = (((pf) this).field_f >> 1 << 12) + (field_m * field_A >> 4);
            field_C = field_p * field_z >> 4;
            field_r = field_p * field_y >> 4;
            field_i = (int)var12;
            field_c = (int)var14;
            return true;
          }
        } else {
          return false;
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        ((pf) this).field_l = param0;
        ((pf) this).field_o = param1;
        ((pf) this).field_g = param2;
        ((pf) this).field_v = param3;
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7);

    final int b() {
        return ((pf) this).field_o + ((pf) this).field_f + ((pf) this).field_v;
    }

    final void a(float param0, float param1, float param2, float param3, float param4, float param5, int param6, int param7, int param8, int param9) {
        int var11 = 0;
        int var12 = 0;
        if (!((pf) this).field_b.n()) {
          if (this.a(param0, param1, param2, param3, param4, param5)) {
            field_B = param7;
            if (param6 != 1) {
              field_k = param7 >>> 24;
              field_D = 256 - field_k;
              if (param6 != 0) {
                L0: {
                  if (param6 != 2) {
                    break L0;
                  } else {
                    field_s = param7 >>> 24;
                    field_q = 256 - field_s;
                    var11 = (param7 & 16711935) * field_q & -16711936;
                    var12 = (param7 & 65280) * field_q & 16711680;
                    field_h = (var11 | var12) >>> 8;
                    break L0;
                  }
                }
                if (param6 != 1) {
                  L1: {
                    if (param6 != 0) {
                      if (param6 != 3) {
                        if (param6 != 2) {
                          break L1;
                        } else {
                          if (param8 != 0) {
                            if (param8 != 1) {
                              if (param8 != 2) {
                                break L1;
                              } else {
                                ((pf) this).b(2, 2);
                                return;
                              }
                            } else {
                              ((pf) this).b(2, 1);
                              return;
                            }
                          } else {
                            ((pf) this).b(2, 0);
                            return;
                          }
                        }
                      } else {
                        if (param8 != 0) {
                          if (param8 != 1) {
                            if (param8 != 2) {
                              break L1;
                            } else {
                              ((pf) this).b(3, 2);
                              return;
                            }
                          } else {
                            ((pf) this).b(3, 1);
                            return;
                          }
                        } else {
                          ((pf) this).b(3, 0);
                          return;
                        }
                      }
                    } else {
                      if (param8 != 0) {
                        if (param8 != 1) {
                          if (param8 != 2) {
                            break L1;
                          } else {
                            ((pf) this).b(0, 2);
                            return;
                          }
                        } else {
                          ((pf) this).b(0, 1);
                          return;
                        }
                      } else {
                        ((pf) this).b(0, 0);
                        return;
                      }
                    }
                  }
                  return;
                } else {
                  if (param8 != 0) {
                    if (param8 != 1) {
                      if (param8 == 2) {
                        ((pf) this).b(1, 2);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      ((pf) this).b(1, 1);
                      return;
                    }
                  } else {
                    ((pf) this).b(1, 0);
                    return;
                  }
                }
              } else {
                field_d = (param7 & 16711680) >> 16;
                field_j = (param7 & 65280) >> 8;
                field_t = param7 & 255;
                if (param6 != 1) {
                  if (param6 != 0) {
                    if (param6 != 3) {
                      if (param6 == 2) {
                        if (param8 != 0) {
                          if (param8 != 1) {
                            if (param8 == 2) {
                              ((pf) this).b(2, 2);
                              return;
                            } else {
                              return;
                            }
                          } else {
                            ((pf) this).b(2, 1);
                            return;
                          }
                        } else {
                          ((pf) this).b(2, 0);
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      if (param8 != 0) {
                        if (param8 != 1) {
                          if (param8 == 2) {
                            ((pf) this).b(3, 2);
                            return;
                          } else {
                            return;
                          }
                        } else {
                          ((pf) this).b(3, 1);
                          return;
                        }
                      } else {
                        ((pf) this).b(3, 0);
                        return;
                      }
                    }
                  } else {
                    if (param8 != 0) {
                      if (param8 != 1) {
                        if (param8 == 2) {
                          ((pf) this).b(0, 2);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        ((pf) this).b(0, 1);
                        return;
                      }
                    } else {
                      ((pf) this).b(0, 0);
                      return;
                    }
                  }
                } else {
                  if (param8 != 0) {
                    if (param8 != 1) {
                      if (param8 != 2) {
                        return;
                      } else {
                        ((pf) this).b(1, 2);
                        return;
                      }
                    } else {
                      ((pf) this).b(1, 1);
                      return;
                    }
                  } else {
                    ((pf) this).b(1, 0);
                    return;
                  }
                }
              }
            } else {
              if (param6 != 1) {
                if (param6 != 0) {
                  if (param6 != 3) {
                    if (param6 == 2) {
                      if (param8 != 0) {
                        if (param8 != 1) {
                          if (param8 == 2) {
                            ((pf) this).b(2, 2);
                            return;
                          } else {
                            return;
                          }
                        } else {
                          ((pf) this).b(2, 1);
                          return;
                        }
                      } else {
                        ((pf) this).b(2, 0);
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (param8 != 0) {
                      if (param8 != 1) {
                        if (param8 == 2) {
                          ((pf) this).b(3, 2);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        ((pf) this).b(3, 1);
                        return;
                      }
                    } else {
                      ((pf) this).b(3, 0);
                      return;
                    }
                  }
                } else {
                  if (param8 != 0) {
                    if (param8 != 1) {
                      if (param8 != 2) {
                        return;
                      } else {
                        ((pf) this).b(0, 2);
                        return;
                      }
                    } else {
                      ((pf) this).b(0, 1);
                      return;
                    }
                  } else {
                    ((pf) this).b(0, 0);
                    return;
                  }
                }
              } else {
                if (param8 != 0) {
                  if (param8 != 1) {
                    if (param8 != 2) {
                      return;
                    } else {
                      ((pf) this).b(1, 2);
                      return;
                    }
                  } else {
                    ((pf) this).b(1, 1);
                    return;
                  }
                } else {
                  ((pf) this).b(1, 0);
                  return;
                }
              }
            }
          } else {
            return;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    pf(sfa param0, int param1, int param2) {
        ((pf) this).field_b = param0;
        ((pf) this).field_a = param1;
        ((pf) this).field_f = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 0;
        field_j = 0;
        field_s = 0;
        field_q = 0;
        field_d = 0;
        field_k = 0;
        field_t = 0;
        field_D = 0;
    }
}
