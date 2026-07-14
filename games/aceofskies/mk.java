/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mk extends pa {
    static int field_s;
    static int field_C;
    private static int field_u;
    int field_m;
    int field_g;
    int field_o;
    static int field_k;
    static int field_A;
    static int field_d;
    kj field_D;
    private static int field_B;
    static int field_b;
    static int field_q;
    static int field_c;
    static int field_j;
    static int field_r;
    static int field_x;
    static int field_n;
    static int field_i;
    static int field_w;
    static int field_e;
    private static int field_y;
    static int field_h;
    static int field_v;
    static int field_a;
    int field_l;
    int field_z;
    int field_p;
    static int field_f;
    private static int field_t;

    final void a(float param0, float param1, float param2, float param3, float param4, float param5, int param6, int param7, int param8, int param9) {
        int var11 = 0;
        int var12 = 0;
        if (!((mk) this).field_D.h()) {
          if (this.a(param0, param1, param2, param3, param4, param5)) {
            field_d = param7;
            if (param6 != 1) {
              field_C = param7 >>> 24;
              field_a = 256 - field_C;
              if (param6 != 0) {
                L0: {
                  if (param6 != 2) {
                    break L0;
                  } else {
                    field_B = param7 >>> 24;
                    field_t = 256 - field_B;
                    var11 = (param7 & 16711935) * field_t & -16711936;
                    var12 = (param7 & 65280) * field_t & 16711680;
                    field_s = (var11 | var12) >>> 8;
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
                                ((mk) this).b(2, 2);
                                return;
                              }
                            } else {
                              ((mk) this).b(2, 1);
                              return;
                            }
                          } else {
                            ((mk) this).b(2, 0);
                            return;
                          }
                        }
                      } else {
                        if (param8 != 0) {
                          if (param8 != 1) {
                            if (param8 != 2) {
                              break L1;
                            } else {
                              ((mk) this).b(3, 2);
                              return;
                            }
                          } else {
                            ((mk) this).b(3, 1);
                            return;
                          }
                        } else {
                          ((mk) this).b(3, 0);
                          return;
                        }
                      }
                    } else {
                      if (param8 != 0) {
                        if (param8 != 1) {
                          if (param8 != 2) {
                            break L1;
                          } else {
                            ((mk) this).b(0, 2);
                            return;
                          }
                        } else {
                          ((mk) this).b(0, 1);
                          return;
                        }
                      } else {
                        ((mk) this).b(0, 0);
                        return;
                      }
                    }
                  }
                  return;
                } else {
                  if (param8 != 0) {
                    if (param8 != 1) {
                      if (param8 == 2) {
                        ((mk) this).b(1, 2);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      ((mk) this).b(1, 1);
                      return;
                    }
                  } else {
                    ((mk) this).b(1, 0);
                    return;
                  }
                }
              } else {
                field_n = (param7 & 16711680) >> 16;
                field_e = (param7 & 65280) >> 8;
                field_b = param7 & 255;
                if (param6 != 1) {
                  if (param6 != 0) {
                    if (param6 != 3) {
                      if (param6 == 2) {
                        if (param8 != 0) {
                          if (param8 != 1) {
                            if (param8 == 2) {
                              ((mk) this).b(2, 2);
                              return;
                            } else {
                              return;
                            }
                          } else {
                            ((mk) this).b(2, 1);
                            return;
                          }
                        } else {
                          ((mk) this).b(2, 0);
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      if (param8 != 0) {
                        if (param8 != 1) {
                          if (param8 == 2) {
                            ((mk) this).b(3, 2);
                            return;
                          } else {
                            return;
                          }
                        } else {
                          ((mk) this).b(3, 1);
                          return;
                        }
                      } else {
                        ((mk) this).b(3, 0);
                        return;
                      }
                    }
                  } else {
                    if (param8 != 0) {
                      if (param8 != 1) {
                        if (param8 == 2) {
                          ((mk) this).b(0, 2);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        ((mk) this).b(0, 1);
                        return;
                      }
                    } else {
                      ((mk) this).b(0, 0);
                      return;
                    }
                  }
                } else {
                  if (param8 != 0) {
                    if (param8 != 1) {
                      if (param8 != 2) {
                        return;
                      } else {
                        ((mk) this).b(1, 2);
                        return;
                      }
                    } else {
                      ((mk) this).b(1, 1);
                      return;
                    }
                  } else {
                    ((mk) this).b(1, 0);
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
                            ((mk) this).b(2, 2);
                            return;
                          } else {
                            return;
                          }
                        } else {
                          ((mk) this).b(2, 1);
                          return;
                        }
                      } else {
                        ((mk) this).b(2, 0);
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (param8 != 0) {
                      if (param8 != 1) {
                        if (param8 == 2) {
                          ((mk) this).b(3, 2);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        ((mk) this).b(3, 1);
                        return;
                      }
                    } else {
                      ((mk) this).b(3, 0);
                      return;
                    }
                  }
                } else {
                  if (param8 != 0) {
                    if (param8 != 1) {
                      if (param8 != 2) {
                        return;
                      } else {
                        ((mk) this).b(0, 2);
                        return;
                      }
                    } else {
                      ((mk) this).b(0, 1);
                      return;
                    }
                  } else {
                    ((mk) this).b(0, 0);
                    return;
                  }
                }
              } else {
                if (param8 != 0) {
                  if (param8 != 1) {
                    if (param8 != 2) {
                      return;
                    } else {
                      ((mk) this).b(1, 2);
                      return;
                    }
                  } else {
                    ((mk) this).b(1, 1);
                    return;
                  }
                } else {
                  ((mk) this).b(1, 0);
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

    final int d() {
        return ((mk) this).field_g + ((mk) this).field_o + ((mk) this).field_m;
    }

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
          var7 = ((mk) this).field_g + ((mk) this).field_o + ((mk) this).field_m;
          var8 = ((mk) this).field_z + ((mk) this).field_p + ((mk) this).field_l;
          if (var7 != ((mk) this).field_o) {
            var9 = (param2 - param0) / (float)var7;
            var10 = (param3 - param1) / (float)var7;
            var11 = (param4 - param0) / (float)var8;
            var12 = (param5 - param1) / (float)var8;
            var13 = var11 * (float)((mk) this).field_z;
            var14 = var12 * (float)((mk) this).field_z;
            var15 = var9 * (float)((mk) this).field_g;
            var16 = var10 * (float)((mk) this).field_g;
            var17 = -var9 * (float)((mk) this).field_m;
            var18 = -var10 * (float)((mk) this).field_m;
            var19 = -var11 * (float)((mk) this).field_l;
            var20 = -var12 * (float)((mk) this).field_l;
            param0 = param0 + (var15 + var13);
            param1 = param1 + (var16 + var14);
            param2 = param2 + (var17 + var13);
            param3 = param3 + (var18 + var14);
            param4 = param4 + (var15 + var19);
            param5 = param5 + (var16 + var20);
            break L0;
          } else {
            if (var8 == ((mk) this).field_p) {
              break L0;
            } else {
              L1: {
                var9 = (param2 - param0) / (float)var7;
                var10 = (param3 - param1) / (float)var7;
                var11 = (param4 - param0) / (float)var8;
                var12 = (param5 - param1) / (float)var8;
                var13 = var11 * (float)((mk) this).field_z;
                var14 = var12 * (float)((mk) this).field_z;
                var15 = var9 * (float)((mk) this).field_g;
                var16 = var10 * (float)((mk) this).field_g;
                var17 = -var9 * (float)((mk) this).field_m;
                var18 = -var10 * (float)((mk) this).field_m;
                var19 = -var11 * (float)((mk) this).field_l;
                var20 = -var12 * (float)((mk) this).field_l;
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
                if (var11 >= (float)((mk) this).field_D.field_z) {
                  break L11;
                } else {
                  var11 = (float)((mk) this).field_D.field_z;
                  break L11;
                }
              }
              L12: {
                if (var12 <= (float)((mk) this).field_D.field_k) {
                  break L12;
                } else {
                  var12 = (float)((mk) this).field_D.field_k;
                  break L12;
                }
              }
              L13: {
                if (var13 >= (float)((mk) this).field_D.field_w) {
                  break L13;
                } else {
                  var13 = (float)((mk) this).field_D.field_w;
                  break L13;
                }
              }
              L14: {
                if (var14 <= (float)((mk) this).field_D.field_D) {
                  break L14;
                } else {
                  var14 = (float)((mk) this).field_D.field_D;
                  break L14;
                }
              }
              var12 = var11 - var12;
              if (var12 < 0.0f) {
                var14 = var13 - var14;
                if (var14 >= 0.0f) {
                  return false;
                } else {
                  field_r = ((mk) this).field_D.field_f;
                  field_w = (int)((float)((int)var13 * field_r) + var11);
                  var15 = (param2 - param0) * (param5 - param1) - (param3 - param1) * (param4 - param0);
                  var16 = (param4 - param0) * (param3 - param1) - (param5 - param1) * (param2 - param0);
                  field_A = (int)((param5 - param1) * 4096.0f * (float)((mk) this).field_o / var15);
                  field_f = (int)((param3 - param1) * 4096.0f * (float)((mk) this).field_p / var16);
                  field_q = (int)((param4 - param0) * 4096.0f * (float)((mk) this).field_o / var16);
                  field_v = (int)((param2 - param0) * 4096.0f * (float)((mk) this).field_p / var15);
                  field_y = (int)(var11 * 16.0f + 8.0f - (param0 + param2 + param4 + var9) / 4.0f * 16.0f);
                  field_u = (int)(var13 * 16.0f + 8.0f - (param1 + param3 + param5 + var10) / 4.0f * 16.0f);
                  field_j = (((mk) this).field_o >> 1 << 12) + (field_u * field_q >> 4);
                  field_h = (((mk) this).field_p >> 1 << 12) + (field_u * field_v >> 4);
                  field_x = field_y * field_A >> 4;
                  field_c = field_y * field_f >> 4;
                  field_k = (int)var12;
                  field_i = (int)var14;
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
          if (var11 >= (float)((mk) this).field_D.field_z) {
            break L25;
          } else {
            var11 = (float)((mk) this).field_D.field_z;
            break L25;
          }
        }
        L26: {
          if (var12 <= (float)((mk) this).field_D.field_k) {
            break L26;
          } else {
            var12 = (float)((mk) this).field_D.field_k;
            break L26;
          }
        }
        L27: {
          if (var13 >= (float)((mk) this).field_D.field_w) {
            break L27;
          } else {
            var13 = (float)((mk) this).field_D.field_w;
            break L27;
          }
        }
        L28: {
          if (var14 <= (float)((mk) this).field_D.field_D) {
            break L28;
          } else {
            var14 = (float)((mk) this).field_D.field_D;
            break L28;
          }
        }
        var12 = var11 - var12;
        if (var12 < 0.0f) {
          var14 = var13 - var14;
          if (var14 >= 0.0f) {
            return false;
          } else {
            field_r = ((mk) this).field_D.field_f;
            field_w = (int)((float)((int)var13 * field_r) + var11);
            var15 = (param2 - param0) * (param5 - param1) - (param3 - param1) * (param4 - param0);
            var16 = (param4 - param0) * (param3 - param1) - (param5 - param1) * (param2 - param0);
            field_A = (int)((param5 - param1) * 4096.0f * (float)((mk) this).field_o / var15);
            field_f = (int)((param3 - param1) * 4096.0f * (float)((mk) this).field_p / var16);
            field_q = (int)((param4 - param0) * 4096.0f * (float)((mk) this).field_o / var16);
            field_v = (int)((param2 - param0) * 4096.0f * (float)((mk) this).field_p / var15);
            field_y = (int)(var11 * 16.0f + 8.0f - (param0 + param2 + param4 + var9) / 4.0f * 16.0f);
            field_u = (int)(var13 * 16.0f + 8.0f - (param1 + param3 + param5 + var10) / 4.0f * 16.0f);
            field_j = (((mk) this).field_o >> 1 << 12) + (field_u * field_q >> 4);
            field_h = (((mk) this).field_p >> 1 << 12) + (field_u * field_v >> 4);
            field_x = field_y * field_A >> 4;
            field_c = field_y * field_f >> 4;
            field_k = (int)var12;
            field_i = (int)var14;
            return true;
          }
        } else {
          return false;
        }
    }

    abstract void b(int param0, int param1);

    final int a() {
        return ((mk) this).field_o;
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7);

    abstract void a(int param0, int param1, int param2, int param3, int param4);

    final void a(int param0, int param1, int param2, int param3) {
        ((mk) this).field_g = param0;
        ((mk) this).field_z = param1;
        ((mk) this).field_m = param2;
        ((mk) this).field_l = param3;
    }

    final int b() {
        return ((mk) this).field_p;
    }

    mk(kj param0, int param1, int param2) {
        ((mk) this).field_D = param0;
        ((mk) this).field_o = param1;
        ((mk) this).field_p = param2;
    }

    final int c() {
        return ((mk) this).field_z + ((mk) this).field_p + ((mk) this).field_l;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = 0;
        field_s = 0;
        field_n = 0;
        field_e = 0;
        field_a = 0;
        field_B = 0;
        field_b = 0;
        field_t = 0;
    }
}
