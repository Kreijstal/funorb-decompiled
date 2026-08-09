/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iua {
    boolean field_j;
    private int[] field_w;
    int field_h;
    private int field_c;
    private boolean field_s;
    int field_e;
    int[] field_p;
    boolean field_m;
    private int field_i;
    private int field_l;
    int field_v;
    private tw field_o;
    private float[] field_u;
    private int field_r;
    boolean field_g;
    private int field_t;
    int field_n;
    boolean field_q;
    private sfa field_k;
    int field_b;
    private int field_f;
    private int[] field_a;
    private boolean field_d;

    final void a(float param0, float param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8, float param9, float param10, float param11) {
        float var13;
        float var14;
        float var15;
        float var16;
        float var17;
        float var18;
        float var19;
        float var20;
        float var21;
        float var22;
        float var23;
        float var24;
        float var25;
        float var26;
        float var27;
        float var28;
        if (!this.field_s) {
          L0: {
            var13 = param4 - param3;
            var14 = param1 - param0;
            var15 = param5 - param3;
            var16 = param2 - param0;
            var17 = param10 - param9;
            var18 = param11 - param9;
            var19 = param7 - param6;
            var20 = param8 - param6;
            if (param2 == param1) {
              var21 = 0.0f;
              break L0;
            } else {
              var21 = (param5 - param4) / (param2 - param1);
              break L0;
            }
          }
          L1: {
            if (param1 == param0) {
              var22 = 0.0f;
              break L1;
            } else {
              var22 = var13 / var14;
              break L1;
            }
          }
          L2: {
            if (param2 == param0) {
              var23 = 0.0f;
              break L2;
            } else {
              var23 = var15 / var16;
              break L2;
            }
          }
          var24 = var13 * var16 - var15 * var14;
          if (var24 != 0.0f) {
            L3: {
              var25 = (var17 * var16 - var18 * var14) / var24;
              var26 = (var18 * var13 - var17 * var15) / var24;
              var27 = (var19 * var16 - var20 * var14) / var24;
              var28 = (var20 * var13 - var19 * var15) / var24;
              if (param0 > param1) {
                break L3;
              } else {
                if (param0 > param2) {
                  break L3;
                } else {
                  if (param0 < (float)this.field_v) {
                    L4: {
                      if (param1 <= (float)this.field_v) {
                        break L4;
                      } else {
                        param1 = (float)this.field_v;
                        break L4;
                      }
                    }
                    L5: {
                      if (param2 <= (float)this.field_v) {
                        break L5;
                      } else {
                        param2 = (float)this.field_v;
                        break L5;
                      }
                    }
                    param9 = param9 - var25 * param3 + var25;
                    param6 = param6 - var27 * param3 + var27;
                    if (param1 >= param2) {
                      L6: {
                        param4 = param3;
                        if (param0 >= 0.0f) {
                          break L6;
                        } else {
                          param4 = param4 - var23 * param0;
                          param3 = param3 - var22 * param0;
                          param9 = param9 - var26 * param0;
                          param6 = param6 - var28 * param0;
                          param0 = 0.0f;
                          break L6;
                        }
                      }
                      L7: {
                        if (param2 >= 0.0f) {
                          break L7;
                        } else {
                          param5 = param5 - var21 * param2;
                          param2 = 0.0f;
                          break L7;
                        }
                      }
                      L8: {
                        if (param0 == param2) {
                          break L8;
                        } else {
                          if (var23 >= var22) {
                            break L8;
                          } else {
                            param1 = param1 - param2;
                            param2 = param2 - param0;
                            param0 = (float)this.field_p[(int)param0];
                            L9: while (true) {
                              param2 = param2 - 1.0f;
                              if (param2 < 0.0f) {
                                L10: while (true) {
                                  param1 = param1 - 1.0f;
                                  if (param1 < 0.0f) {
                                    return;
                                  } else {
                                    this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param3, param9, var25, param6, var27);
                                    param5 = param5 + var21;
                                    param3 = param3 + var22;
                                    param9 = param9 + var26;
                                    param6 = param6 + var28;
                                    param0 = param0 + (float)this.field_t;
                                    continue L10;
                                  }
                                }
                              } else {
                                this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param4, (int)param3, param9, var25, param6, var27);
                                param4 = param4 + var23;
                                param3 = param3 + var22;
                                param9 = param9 + var26;
                                param6 = param6 + var28;
                                param0 = param0 + (float)this.field_t;
                                continue L9;
                              }
                            }
                          }
                        }
                      }
                      if (param0 == param2) {
                        if (var21 > var22) {
                          param1 = param1 - param2;
                          param2 = param2 - param0;
                          param0 = (float)this.field_p[(int)param0];
                          L11: while (true) {
                            param2 = param2 - 1.0f;
                            if (param2 < 0.0f) {
                              L12: while (true) {
                                param1 = param1 - 1.0f;
                                if (param1 < 0.0f) {
                                  return;
                                } else {
                                  this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param3, param9, var25, param6, var27);
                                  param5 = param5 + var21;
                                  param3 = param3 + var22;
                                  param9 = param9 + var26;
                                  param6 = param6 + var28;
                                  param0 = param0 + (float)this.field_t;
                                  continue L12;
                                }
                              }
                            } else {
                              this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param4, (int)param3, param9, var25, param6, var27);
                              param4 = param4 + var23;
                              param3 = param3 + var22;
                              param9 = param9 + var26;
                              param6 = param6 + var28;
                              param0 = param0 + (float)this.field_t;
                              continue L11;
                            }
                          }
                        } else {
                          param1 = param1 - param2;
                          param2 = param2 - param0;
                          param0 = (float)this.field_p[(int)param0];
                          L13: while (true) {
                            param2 = param2 - 1.0f;
                            if (param2 < 0.0f) {
                              L14: while (true) {
                                param1 = param1 - 1.0f;
                                if (param1 < 0.0f) {
                                  return;
                                } else {
                                  this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param5, param9, var25, param6, var27);
                                  param5 = param5 + var21;
                                  param3 = param3 + var22;
                                  param9 = param9 + var26;
                                  param6 = param6 + var28;
                                  param0 = param0 + (float)this.field_t;
                                  continue L14;
                                }
                              }
                            } else {
                              this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param4, param9, var25, param6, var27);
                              param4 = param4 + var23;
                              param3 = param3 + var22;
                              param9 = param9 + var26;
                              param6 = param6 + var28;
                              param0 = param0 + (float)this.field_t;
                              continue L13;
                            }
                          }
                        }
                      } else {
                        param1 = param1 - param2;
                        param2 = param2 - param0;
                        param0 = (float)this.field_p[(int)param0];
                        L15: while (true) {
                          param2 = param2 - 1.0f;
                          if (param2 < 0.0f) {
                            L16: while (true) {
                              param1 = param1 - 1.0f;
                              if (param1 < 0.0f) {
                                return;
                              } else {
                                this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param5, param9, var25, param6, var27);
                                param5 = param5 + var21;
                                param3 = param3 + var22;
                                param9 = param9 + var26;
                                param6 = param6 + var28;
                                param0 = param0 + (float)this.field_t;
                                continue L16;
                              }
                            }
                          } else {
                            this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param4, param9, var25, param6, var27);
                            param4 = param4 + var23;
                            param3 = param3 + var22;
                            param9 = param9 + var26;
                            param6 = param6 + var28;
                            param0 = param0 + (float)this.field_t;
                            continue L15;
                          }
                        }
                      }
                    } else {
                      L17: {
                        param5 = param3;
                        if (param0 >= 0.0f) {
                          break L17;
                        } else {
                          param5 = param5 - var23 * param0;
                          param3 = param3 - var22 * param0;
                          param9 = param9 - var26 * param0;
                          param6 = param6 - var28 * param0;
                          param0 = 0.0f;
                          break L17;
                        }
                      }
                      L18: {
                        if (param1 >= 0.0f) {
                          break L18;
                        } else {
                          param4 = param4 - var21 * param1;
                          param1 = 0.0f;
                          break L18;
                        }
                      }
                      L19: {
                        if (param0 == param1) {
                          break L19;
                        } else {
                          if (var23 >= var22) {
                            break L19;
                          } else {
                            param2 = param2 - param1;
                            param1 = param1 - param0;
                            param0 = (float)this.field_p[(int)param0];
                            L20: while (true) {
                              param1 = param1 - 1.0f;
                              if (param1 < 0.0f) {
                                L21: while (true) {
                                  param2 = param2 - 1.0f;
                                  if (param2 < 0.0f) {
                                    return;
                                  } else {
                                    this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param4, param9, var25, param6, var27);
                                    param5 = param5 + var23;
                                    param4 = param4 + var21;
                                    param9 = param9 + var26;
                                    param6 = param6 + var28;
                                    param0 = param0 + (float)this.field_t;
                                    continue L21;
                                  }
                                }
                              } else {
                                this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param3, param9, var25, param6, var27);
                                param5 = param5 + var23;
                                param3 = param3 + var22;
                                param9 = param9 + var26;
                                param6 = param6 + var28;
                                param0 = param0 + (float)this.field_t;
                                continue L20;
                              }
                            }
                          }
                        }
                      }
                      if (param0 == param1) {
                        if (var23 > var21) {
                          param2 = param2 - param1;
                          param1 = param1 - param0;
                          param0 = (float)this.field_p[(int)param0];
                          L22: while (true) {
                            param1 = param1 - 1.0f;
                            if (param1 < 0.0f) {
                              L23: while (true) {
                                param2 = param2 - 1.0f;
                                if (param2 < 0.0f) {
                                  return;
                                } else {
                                  this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param4, param9, var25, param6, var27);
                                  param5 = param5 + var23;
                                  param4 = param4 + var21;
                                  param9 = param9 + var26;
                                  param6 = param6 + var28;
                                  param0 = param0 + (float)this.field_t;
                                  continue L23;
                                }
                              }
                            } else {
                              this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param3, param9, var25, param6, var27);
                              param5 = param5 + var23;
                              param3 = param3 + var22;
                              param9 = param9 + var26;
                              param6 = param6 + var28;
                              param0 = param0 + (float)this.field_t;
                              continue L22;
                            }
                          }
                        } else {
                          param2 = param2 - param1;
                          param1 = param1 - param0;
                          param0 = (float)this.field_p[(int)param0];
                          L24: while (true) {
                            param1 = param1 - 1.0f;
                            if (param1 < 0.0f) {
                              L25: while (true) {
                                param2 = param2 - 1.0f;
                                if (param2 < 0.0f) {
                                  return;
                                } else {
                                  this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param4, (int)param5, param9, var25, param6, var27);
                                  param5 = param5 + var23;
                                  param4 = param4 + var21;
                                  param9 = param9 + var26;
                                  param6 = param6 + var28;
                                  param0 = param0 + (float)this.field_t;
                                  continue L25;
                                }
                              }
                            } else {
                              this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param5, param9, var25, param6, var27);
                              param5 = param5 + var23;
                              param3 = param3 + var22;
                              param9 = param9 + var26;
                              param6 = param6 + var28;
                              param0 = param0 + (float)this.field_t;
                              continue L24;
                            }
                          }
                        }
                      } else {
                        param2 = param2 - param1;
                        param1 = param1 - param0;
                        param0 = (float)this.field_p[(int)param0];
                        L26: while (true) {
                          param1 = param1 - 1.0f;
                          if (param1 < 0.0f) {
                            L27: while (true) {
                              param2 = param2 - 1.0f;
                              if (param2 < 0.0f) {
                                return;
                              } else {
                                this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param4, (int)param5, param9, var25, param6, var27);
                                param5 = param5 + var23;
                                param4 = param4 + var21;
                                param9 = param9 + var26;
                                param6 = param6 + var28;
                                param0 = param0 + (float)this.field_t;
                                continue L27;
                              }
                            }
                          } else {
                            this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param5, param9, var25, param6, var27);
                            param5 = param5 + var23;
                            param3 = param3 + var22;
                            param9 = param9 + var26;
                            param6 = param6 + var28;
                            param0 = param0 + (float)this.field_t;
                            continue L26;
                          }
                        }
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            if (param1 > param2) {
              if (param2 < (float)this.field_v) {
                L28: {
                  if (param0 <= (float)this.field_v) {
                    break L28;
                  } else {
                    param0 = (float)this.field_v;
                    break L28;
                  }
                }
                L29: {
                  if (param1 <= (float)this.field_v) {
                    break L29;
                  } else {
                    param1 = (float)this.field_v;
                    break L29;
                  }
                }
                param11 = param11 - var25 * param5 + var25;
                param8 = param8 - var27 * param5 + var27;
                if (param0 >= param1) {
                  L30: {
                    param3 = param5;
                    if (param2 >= 0.0f) {
                      break L30;
                    } else {
                      param3 = param3 - var21 * param2;
                      param5 = param5 - var23 * param2;
                      param11 = param11 - var26 * param2;
                      param8 = param8 - var28 * param2;
                      param2 = 0.0f;
                      break L30;
                    }
                  }
                  L31: {
                    if (param1 >= 0.0f) {
                      break L31;
                    } else {
                      param4 = param4 - var22 * param1;
                      param1 = 0.0f;
                      break L31;
                    }
                  }
                  if (var21 < var23) {
                    param0 = param0 - param1;
                    param1 = param1 - param2;
                    param2 = (float)this.field_p[(int)param2];
                    L32: while (true) {
                      param1 = param1 - 1.0f;
                      if (param1 < 0.0f) {
                        L33: while (true) {
                          param0 = param0 - 1.0f;
                          if (param0 < 0.0f) {
                            return;
                          } else {
                            this.a(this.field_a, this.field_u, (int)param2, 0, 0, (int)param4, (int)param5, param11, var25, param8, var27);
                            param4 = param4 + var22;
                            param5 = param5 + var23;
                            param11 = param11 + var26;
                            param8 = param8 + var28;
                            param2 = param2 + (float)this.field_t;
                            continue L33;
                          }
                        }
                      } else {
                        this.a(this.field_a, this.field_u, (int)param2, 0, 0, (int)param3, (int)param5, param11, var25, param8, var27);
                        param3 = param3 + var21;
                        param5 = param5 + var23;
                        param11 = param11 + var26;
                        param8 = param8 + var28;
                        param2 = param2 + (float)this.field_t;
                        continue L32;
                      }
                    }
                  } else {
                    param0 = param0 - param1;
                    param1 = param1 - param2;
                    param2 = (float)this.field_p[(int)param2];
                    L34: while (true) {
                      param1 = param1 - 1.0f;
                      if (param1 < 0.0f) {
                        L35: while (true) {
                          param0 = param0 - 1.0f;
                          if (param0 < 0.0f) {
                            return;
                          } else {
                            this.a(this.field_a, this.field_u, (int)param2, 0, 0, (int)param5, (int)param4, param11, var25, param8, var27);
                            param4 = param4 + var22;
                            param5 = param5 + var23;
                            param11 = param11 + var26;
                            param8 = param8 + var28;
                            param2 = param2 + (float)this.field_t;
                            continue L35;
                          }
                        }
                      } else {
                        this.a(this.field_a, this.field_u, (int)param2, 0, 0, (int)param5, (int)param3, param11, var25, param8, var27);
                        param3 = param3 + var21;
                        param5 = param5 + var23;
                        param11 = param11 + var26;
                        param8 = param8 + var28;
                        param2 = param2 + (float)this.field_t;
                        continue L34;
                      }
                    }
                  }
                } else {
                  L36: {
                    param4 = param5;
                    if (param2 >= 0.0f) {
                      break L36;
                    } else {
                      param4 = param4 - var21 * param2;
                      param5 = param5 - var23 * param2;
                      param11 = param11 - var26 * param2;
                      param8 = param8 - var28 * param2;
                      param2 = 0.0f;
                      break L36;
                    }
                  }
                  L37: {
                    if (param0 >= 0.0f) {
                      break L37;
                    } else {
                      param3 = param3 - var22 * param0;
                      param0 = 0.0f;
                      break L37;
                    }
                  }
                  if (var21 < var23) {
                    param1 = param1 - param0;
                    param0 = param0 - param2;
                    param2 = (float)this.field_p[(int)param2];
                    L38: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        L39: while (true) {
                          param1 = param1 - 1.0f;
                          if (param1 < 0.0f) {
                            return;
                          } else {
                            this.a(this.field_a, this.field_u, (int)param2, 0, 0, (int)param4, (int)param3, param11, var25, param8, var27);
                            param4 = param4 + var21;
                            param3 = param3 + var22;
                            param11 = param11 + var26;
                            param8 = param8 + var28;
                            param2 = param2 + (float)this.field_t;
                            continue L39;
                          }
                        }
                      } else {
                        this.a(this.field_a, this.field_u, (int)param2, 0, 0, (int)param4, (int)param5, param11, var25, param8, var27);
                        param4 = param4 + var21;
                        param5 = param5 + var23;
                        param11 = param11 + var26;
                        param8 = param8 + var28;
                        param2 = param2 + (float)this.field_t;
                        continue L38;
                      }
                    }
                  } else {
                    param1 = param1 - param0;
                    param0 = param0 - param2;
                    param2 = (float)this.field_p[(int)param2];
                    L40: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        L41: while (true) {
                          param1 = param1 - 1.0f;
                          if (param1 < 0.0f) {
                            return;
                          } else {
                            this.a(this.field_a, this.field_u, (int)param2, 0, 0, (int)param3, (int)param4, param11, var25, param8, var27);
                            param4 = param4 + var21;
                            param3 = param3 + var22;
                            param11 = param11 + var26;
                            param8 = param8 + var28;
                            param2 = param2 + (float)this.field_t;
                            continue L41;
                          }
                        }
                      } else {
                        this.a(this.field_a, this.field_u, (int)param2, 0, 0, (int)param5, (int)param4, param11, var25, param8, var27);
                        param4 = param4 + var21;
                        param5 = param5 + var23;
                        param11 = param11 + var26;
                        param8 = param8 + var28;
                        param2 = param2 + (float)this.field_t;
                        continue L40;
                      }
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              if (param1 < (float)this.field_v) {
                L42: {
                  if (param2 <= (float)this.field_v) {
                    break L42;
                  } else {
                    param2 = (float)this.field_v;
                    break L42;
                  }
                }
                L43: {
                  if (param0 <= (float)this.field_v) {
                    break L43;
                  } else {
                    param0 = (float)this.field_v;
                    break L43;
                  }
                }
                param10 = param10 - var25 * param4 + var25;
                param7 = param7 - var27 * param4 + var27;
                if (param2 >= param0) {
                  L44: {
                    param5 = param4;
                    if (param1 >= 0.0f) {
                      break L44;
                    } else {
                      param5 = param5 - var22 * param1;
                      param4 = param4 - var21 * param1;
                      param10 = param10 - var26 * param1;
                      param7 = param7 - var28 * param1;
                      param1 = 0.0f;
                      break L44;
                    }
                  }
                  L45: {
                    if (param0 >= 0.0f) {
                      break L45;
                    } else {
                      param3 = param3 - var23 * param0;
                      param0 = 0.0f;
                      break L45;
                    }
                  }
                  if (var22 < var21) {
                    param2 = param2 - param0;
                    param0 = param0 - param1;
                    param1 = (float)this.field_p[(int)param1];
                    L46: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        L47: while (true) {
                          param2 = param2 - 1.0f;
                          if (param2 < 0.0f) {
                            return;
                          } else {
                            this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param3, (int)param4, param10, var25, param7, var27);
                            param3 = param3 + var23;
                            param4 = param4 + var21;
                            param10 = param10 + var26;
                            param7 = param7 + var28;
                            param1 = param1 + (float)this.field_t;
                            continue L47;
                          }
                        }
                      } else {
                        this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param5, (int)param4, param10, var25, param7, var27);
                        param5 = param5 + var22;
                        param4 = param4 + var21;
                        param10 = param10 + var26;
                        param7 = param7 + var28;
                        param1 = param1 + (float)this.field_t;
                        continue L46;
                      }
                    }
                  } else {
                    param2 = param2 - param0;
                    param0 = param0 - param1;
                    param1 = (float)this.field_p[(int)param1];
                    L48: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        L49: while (true) {
                          param2 = param2 - 1.0f;
                          if (param2 < 0.0f) {
                            return;
                          } else {
                            this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param4, (int)param3, param10, var25, param7, var27);
                            param3 = param3 + var23;
                            param4 = param4 + var21;
                            param10 = param10 + var26;
                            param7 = param7 + var28;
                            param1 = param1 + (float)this.field_t;
                            continue L49;
                          }
                        }
                      } else {
                        this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param4, (int)param5, param10, var25, param7, var27);
                        param5 = param5 + var22;
                        param4 = param4 + var21;
                        param10 = param10 + var26;
                        param7 = param7 + var28;
                        param1 = param1 + (float)this.field_t;
                        continue L48;
                      }
                    }
                  }
                } else {
                  L50: {
                    param3 = param4;
                    if (param1 >= 0.0f) {
                      break L50;
                    } else {
                      param3 = param3 - var22 * param1;
                      param4 = param4 - var21 * param1;
                      param10 = param10 - var26 * param1;
                      param7 = param7 - var28 * param1;
                      param1 = 0.0f;
                      break L50;
                    }
                  }
                  L51: {
                    if (param2 >= 0.0f) {
                      break L51;
                    } else {
                      param5 = param5 - var23 * param2;
                      param2 = 0.0f;
                      break L51;
                    }
                  }
                  L52: {
                    if (param1 == param2) {
                      break L52;
                    } else {
                      if (var22 >= var21) {
                        break L52;
                      } else {
                        param0 = param0 - param2;
                        param2 = param2 - param1;
                        param1 = (float)this.field_p[(int)param1];
                        L53: while (true) {
                          param2 = param2 - 1.0f;
                          if (param2 < 0.0f) {
                            L54: while (true) {
                              param0 = param0 - 1.0f;
                              if (param0 < 0.0f) {
                                return;
                              } else {
                                this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param3, (int)param5, param10, var25, param7, var27);
                                param3 = param3 + var22;
                                param5 = param5 + var23;
                                param10 = param10 + var26;
                                param7 = param7 + var28;
                                param1 = param1 + (float)this.field_t;
                                continue L54;
                              }
                            }
                          } else {
                            this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param3, (int)param4, param10, var25, param7, var27);
                            param3 = param3 + var22;
                            param4 = param4 + var21;
                            param10 = param10 + var26;
                            param7 = param7 + var28;
                            param1 = param1 + (float)this.field_t;
                            continue L53;
                          }
                        }
                      }
                    }
                  }
                  if (param1 == param2) {
                    if (var22 > var23) {
                      param0 = param0 - param2;
                      param2 = param2 - param1;
                      param1 = (float)this.field_p[(int)param1];
                      L55: while (true) {
                        param2 = param2 - 1.0f;
                        if (param2 < 0.0f) {
                          L56: while (true) {
                            param0 = param0 - 1.0f;
                            if (param0 < 0.0f) {
                              return;
                            } else {
                              this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param3, (int)param5, param10, var25, param7, var27);
                              param3 = param3 + var22;
                              param5 = param5 + var23;
                              param10 = param10 + var26;
                              param7 = param7 + var28;
                              param1 = param1 + (float)this.field_t;
                              continue L56;
                            }
                          }
                        } else {
                          this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param3, (int)param4, param10, var25, param7, var27);
                          param3 = param3 + var22;
                          param4 = param4 + var21;
                          param10 = param10 + var26;
                          param7 = param7 + var28;
                          param1 = param1 + (float)this.field_t;
                          continue L55;
                        }
                      }
                    } else {
                      param0 = param0 - param2;
                      param2 = param2 - param1;
                      param1 = (float)this.field_p[(int)param1];
                      L57: while (true) {
                        param2 = param2 - 1.0f;
                        if (param2 < 0.0f) {
                          L58: while (true) {
                            param0 = param0 - 1.0f;
                            if (param0 < 0.0f) {
                              return;
                            } else {
                              this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param5, (int)param3, param10, var25, param7, var27);
                              param3 = param3 + var22;
                              param5 = param5 + var23;
                              param10 = param10 + var26;
                              param7 = param7 + var28;
                              param1 = param1 + (float)this.field_t;
                              continue L58;
                            }
                          }
                        } else {
                          this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param4, (int)param3, param10, var25, param7, var27);
                          param3 = param3 + var22;
                          param4 = param4 + var21;
                          param10 = param10 + var26;
                          param7 = param7 + var28;
                          param1 = param1 + (float)this.field_t;
                          continue L57;
                        }
                      }
                    }
                  } else {
                    param0 = param0 - param2;
                    param2 = param2 - param1;
                    param1 = (float)this.field_p[(int)param1];
                    L59: while (true) {
                      param2 = param2 - 1.0f;
                      if (param2 < 0.0f) {
                        L60: while (true) {
                          param0 = param0 - 1.0f;
                          if (param0 < 0.0f) {
                            return;
                          } else {
                            this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param5, (int)param3, param10, var25, param7, var27);
                            param3 = param3 + var22;
                            param5 = param5 + var23;
                            param10 = param10 + var26;
                            param7 = param7 + var28;
                            param1 = param1 + (float)this.field_t;
                            continue L60;
                          }
                        }
                      } else {
                        this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param4, (int)param3, param10, var25, param7, var27);
                        param3 = param3 + var22;
                        param4 = param4 + var21;
                        param10 = param10 + var26;
                        param7 = param7 + var28;
                        param1 = param1 + (float)this.field_t;
                        continue L59;
                      }
                    }
                  }
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } else {
          this.field_k.b((int)param0, bt.field_h[(int)param9], (int)param3, (int)param1, 1, (int)param4);
          this.field_k.b((int)param1, bt.field_h[(int)param9], (int)param4, (int)param2, 1, (int)param5);
          this.field_k.b((int)param2, bt.field_h[(int)param9], (int)param5, (int)param0, 1, (int)param3);
          return;
        }
    }

    private final void a(int[] param0, int[] param1, int param2, int param3, int param4, float param5, float param6, float param7, float param8, float param9, float param10, float param11, float param12, float param13, float param14, float param15, float param16, float param17, float param18, float param19, float param20) {
        int incrementValue$0 = 0;
        int stackIn_28_0 = 0;
        int var22;
        float var23;
        float var24;
        float var25;
        float var26;
        float var27;
        float var28;
        float var29;
        float var30;
        float var31;
        float var32;
        int var33;
        int var34;
        int var35;
        int var36;
        int var37;
        int var38;
        int var39;
        L0: {
          var22 = param4 - param3;
          var23 = 1.0f / (float)var22;
          var24 = (param6 - param5) * var23;
          var25 = (param8 - param7) * var23;
          var26 = (param10 - param9) * var23;
          var27 = (param12 - param11) * var23;
          var28 = (param14 - param13) * var23;
          var29 = (param16 - param15) * var23;
          var30 = (param18 - param17) * var23;
          var31 = (param20 - param19) * var23;
          if (!this.field_q) {
            break L0;
          } else {
            L1: {
              if (param4 <= this.field_h) {
                break L1;
              } else {
                param4 = this.field_h;
                break L1;
              }
            }
            if (param3 >= 0) {
              break L0;
            } else {
              param5 = param5 - var24 * (float)param3;
              param7 = param7 - var25 * (float)param3;
              param9 = param9 - var26 * (float)param3;
              param11 = param11 - var27 * (float)param3;
              param13 = param13 - var28 * (float)param3;
              param15 = param15 - var29 * (float)param3;
              param17 = param17 - var30 * (float)param3;
              param19 = param19 - var31 * (float)param3;
              param3 = 0;
              break L0;
            }
          }
        }
        if (param3 < param4) {
          var22 = param4 - param3;
          param2 = param2 + param3;
          L2: while (true) {
            incrementValue$0 = var22;
            var22--;
            if (incrementValue$0 <= 0) {
              return;
            } else {
              L3: {
                var32 = 1.0f / param5;
                if (var32 >= this.field_u[param2]) {
                  break L3;
                } else {
                  L4: {
                    var33 = (int)(param7 * var32 * (float)this.field_i);
                    if (!this.field_d) {
                      if (var33 >= 0) {
                        if (var33 <= this.field_r) {
                          break L4;
                        } else {
                          var33 = this.field_r;
                          break L4;
                        }
                      } else {
                        var33 = 0;
                        break L4;
                      }
                    } else {
                      var33 = var33 & this.field_r;
                      break L4;
                    }
                  }
                  L5: {
                    var34 = (int)(param9 * var32 * (float)this.field_i);
                    if (!this.field_d) {
                      if (var34 >= 0) {
                        if (var34 <= this.field_r) {
                          break L5;
                        } else {
                          var34 = this.field_r;
                          break L5;
                        }
                      } else {
                        var34 = 0;
                        break L5;
                      }
                    } else {
                      var34 = var34 & this.field_r;
                      break L5;
                    }
                  }
                  L6: {
                    var35 = this.field_w[var34 * this.field_i + var33];
                    var36 = 255;
                    if (this.field_f != 2) {
                      if (this.field_f != 1) {
                        var36 = (int)param13;
                        break L6;
                      } else {
                        L7: {
                          if (var35 != 0) {
                            stackIn_28_0 = 255;
                            break L7;
                          } else {
                            stackIn_28_0 = 0;
                            break L7;
                          }
                        }
                        var36 = stackIn_28_0;
                        break L6;
                      }
                    } else {
                      var36 = var35 >> 24 & 255;
                      break L6;
                    }
                  }
                  if (var36 == 0) {
                    break L3;
                  } else {
                    if (var36 == 255) {
                      L8: {
                        var37 = -16777216 | (int)(param15 * (float)(var35 >> 16 & 255)) << 8 & 16711680 | (int)(param17 * (float)(var35 >> 8 & 255)) & 65280 | (int)(param19 * (float)(var35 & 255)) >> 8;
                        if (param11 == 0.0f) {
                          break L8;
                        } else {
                          var38 = (int)(255.0f - param11);
                          var39 = ((this.field_l & 16711935) * (int)param11 & -16711936 | (this.field_l & 65280) * (int)param11 & 16711680) >>> 8;
                          var37 = (((var37 & 16711935) * var38 & -16711936 | (var37 & 65280) * var38 & 16711680) >>> 8) + var39;
                          break L8;
                        }
                      }
                      param0[param2] = var37;
                      this.field_u[param2] = var32;
                      break L3;
                    } else {
                      L9: {
                        var37 = -16777216 | (int)(param15 * (float)(var35 >> 16 & 255)) << 8 & 16711680 | (int)(param17 * (float)(var35 >> 8 & 255)) & 65280 | (int)(param19 * (float)(var35 & 255)) >> 8;
                        if (param11 == 0.0f) {
                          break L9;
                        } else {
                          var38 = (int)(255.0f - param11);
                          var39 = ((this.field_l & 16711935) * (int)param11 & -16711936 | (this.field_l & 65280) * (int)param11 & 16711680) >>> 8;
                          var37 = (((var37 & 16711935) * var38 & -16711936 | (var37 & 65280) * var38 & 16711680) >>> 8) + var39;
                          break L9;
                        }
                      }
                      var38 = param0[param2];
                      var39 = 255 - var36;
                      var37 = ((var38 & 16711935) * var39 + (var37 & 16711935) * var36 & -16711936) + ((var38 & 65280) * var39 + (var37 & 65280) * var36 & 16711680) >> 8;
                      param0[param2] = var37;
                      this.field_u[param2] = var32;
                      break L3;
                    }
                  }
                }
              }
              param2++;
              param5 = param5 + var24;
              param7 = param7 + var25;
              param9 = param9 + var26;
              param11 = param11 + var27;
              param13 = param13 + var28;
              param15 = param15 + var29;
              param17 = param17 + var30;
              param19 = param19 + var31;
              continue L2;
            }
          }
        } else {
          return;
        }
    }

    private final void b(int[] param0, float[] param1, int param2, int param3, int param4, int param5, int param6, float param7, float param8) {
        int var10;
        int var11;
        int var12;
        L0: {
          if (!this.field_q) {
            break L0;
          } else {
            L1: {
              if (param6 <= this.field_h) {
                break L1;
              } else {
                param6 = this.field_h;
                break L1;
              }
            }
            if (param5 >= 0) {
              break L0;
            } else {
              param5 = 0;
              break L0;
            }
          }
        }
        if (param5 < param6) {
          param2 = param2 + (param5 - 1);
          param4 = param6 - param5 >> 2;
          param7 = param7 + param8 * (float)param5;
          if (!this.field_o.field_n) {
            if (this.field_b != 0) {
              L2: {
                if (this.field_b != 254) {
                  var10 = this.field_b;
                  var11 = 256 - this.field_b;
                  param3 = ((param3 & 16711935) * var11 >> 8 & 16711935) + ((param3 & 65280) * var11 >> 8 & 65280);
                  L3: while (true) {
                    param4--;
                    if (param4 < 0) {
                      param4 = param6 - param5 & 3;
                      L4: while (true) {
                        param4--;
                        if (param4 < 0) {
                          break L2;
                        } else {
                          L5: {
                            param2++;
                            if (param7 >= param1[param2]) {
                              break L5;
                            } else {
                              var12 = param0[param2];
                              param0[param2] = (var11 | var12 >> 24) << 24 | param3 + ((var12 & 16711935) * var10 >> 8 & 16711935) + ((var12 & 65280) * var10 >> 8 & 65280);
                              break L5;
                            }
                          }
                          param7 = param7 + param8;
                          continue L4;
                        }
                      }
                    } else {
                      L6: {
                        param2++;
                        if (param7 >= param1[param2]) {
                          break L6;
                        } else {
                          var12 = param0[param2];
                          param0[param2] = (var11 | var12 >> 24) << 24 | param3 + ((var12 & 16711935) * var10 >> 8 & 16711935) + ((var12 & 65280) * var10 >> 8 & 65280);
                          break L6;
                        }
                      }
                      L7: {
                        param7 = param7 + param8;
                        param2++;
                        if (param7 >= param1[param2]) {
                          break L7;
                        } else {
                          var12 = param0[param2];
                          param0[param2] = (var11 | var12 >> 24) << 24 | param3 + ((var12 & 16711935) * var10 >> 8 & 16711935) + ((var12 & 65280) * var10 >> 8 & 65280);
                          break L7;
                        }
                      }
                      L8: {
                        param7 = param7 + param8;
                        param2++;
                        if (param7 >= param1[param2]) {
                          break L8;
                        } else {
                          var12 = param0[param2];
                          param0[param2] = (var11 | var12 >> 24) << 24 | param3 + ((var12 & 16711935) * var10 >> 8 & 16711935) + ((var12 & 65280) * var10 >> 8 & 65280);
                          break L8;
                        }
                      }
                      L9: {
                        param7 = param7 + param8;
                        param2++;
                        if (param7 >= param1[param2]) {
                          break L9;
                        } else {
                          var12 = param0[param2];
                          param0[param2] = (var11 | var12 >> 24) << 24 | param3 + ((var12 & 16711935) * var10 >> 8 & 16711935) + ((var12 & 65280) * var10 >> 8 & 65280);
                          break L9;
                        }
                      }
                      param7 = param7 + param8;
                      continue L3;
                    }
                  }
                } else {
                  if (param5 != 0) {
                    if (param6 <= this.field_h - 1) {
                      param4--;
                      L10: while (true) {
                        if (param4 < 0) {
                          param4 = param6 - param5 & 3;
                          L11: while (true) {
                            param4--;
                            if (param4 < 0) {
                              break L2;
                            } else {
                              L12: {
                                param2++;
                                if (param7 >= param1[param2]) {
                                  break L12;
                                } else {
                                  param0[param2 - 1] = param0[param2];
                                  break L12;
                                }
                              }
                              param7 = param7 + param8;
                              continue L11;
                            }
                          }
                        } else {
                          L13: {
                            param2++;
                            if (param7 >= param1[param2]) {
                              break L13;
                            } else {
                              param0[param2 - 1] = param0[param2];
                              break L13;
                            }
                          }
                          L14: {
                            param7 = param7 + param8;
                            param2++;
                            if (param7 >= param1[param2]) {
                              break L14;
                            } else {
                              param0[param2 - 1] = param0[param2];
                              break L14;
                            }
                          }
                          L15: {
                            param7 = param7 + param8;
                            param2++;
                            if (param7 >= param1[param2]) {
                              break L15;
                            } else {
                              param0[param2 - 1] = param0[param2];
                              break L15;
                            }
                          }
                          L16: {
                            param7 = param7 + param8;
                            param2++;
                            if (param7 >= param1[param2]) {
                              break L16;
                            } else {
                              param0[param2 - 1] = param0[param2];
                              break L16;
                            }
                          }
                          param7 = param7 + param8;
                          param4--;
                          continue L10;
                        }
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
              return;
            } else {
              L17: while (true) {
                param4--;
                if (param4 < 0) {
                  param4 = param6 - param5 & 3;
                  L18: while (true) {
                    param4--;
                    if (param4 >= 0) {
                      L19: {
                        param2++;
                        if (param7 >= param1[param2]) {
                          break L19;
                        } else {
                          param0[param2] = param3;
                          break L19;
                        }
                      }
                      param7 = param7 + param8;
                      continue L18;
                    } else {
                      return;
                    }
                  }
                } else {
                  L20: {
                    param2++;
                    if (param7 >= param1[param2]) {
                      break L20;
                    } else {
                      param0[param2] = param3;
                      break L20;
                    }
                  }
                  L21: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                      break L21;
                    } else {
                      param0[param2] = param3;
                      break L21;
                    }
                  }
                  L22: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                      break L22;
                    } else {
                      param0[param2] = param3;
                      break L22;
                    }
                  }
                  L23: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                      break L23;
                    } else {
                      param0[param2] = param3;
                      break L23;
                    }
                  }
                  param7 = param7 + param8;
                  continue L17;
                }
              }
            }
          } else {
            if (this.field_b != 0) {
              if (this.field_b != 254) {
                var10 = this.field_b;
                var11 = 256 - this.field_b;
                param3 = ((param3 & 16711935) * var11 >> 8 & 16711935) + ((param3 & 65280) * var11 >> 8 & 65280);
                L24: while (true) {
                  param4--;
                  if (param4 < 0) {
                    param4 = param6 - param5 & 3;
                    L25: while (true) {
                      param4--;
                      if (param4 >= 0) {
                        L26: {
                          param2++;
                          if (param7 >= param1[param2]) {
                            break L26;
                          } else {
                            var12 = param0[param2];
                            param0[param2] = (var11 | var12 >> 24) << 24 | param3 + ((var12 & 16711935) * var10 >> 8 & 16711935) + ((var12 & 65280) * var10 >> 8 & 65280);
                            param1[param2] = param7;
                            break L26;
                          }
                        }
                        param7 = param7 + param8;
                        continue L25;
                      } else {
                        return;
                      }
                    }
                  } else {
                    L27: {
                      param2++;
                      if (param7 >= param1[param2]) {
                        break L27;
                      } else {
                        var12 = param0[param2];
                        param0[param2] = (var11 | var12 >> 24) << 24 | param3 + ((var12 & 16711935) * var10 >> 8 & 16711935) + ((var12 & 65280) * var10 >> 8 & 65280);
                        param1[param2] = param7;
                        break L27;
                      }
                    }
                    L28: {
                      param7 = param7 + param8;
                      param2++;
                      if (param7 >= param1[param2]) {
                        break L28;
                      } else {
                        var12 = param0[param2];
                        param0[param2] = (var11 | var12 >> 24) << 24 | param3 + ((var12 & 16711935) * var10 >> 8 & 16711935) + ((var12 & 65280) * var10 >> 8 & 65280);
                        param1[param2] = param7;
                        break L28;
                      }
                    }
                    L29: {
                      param7 = param7 + param8;
                      param2++;
                      if (param7 >= param1[param2]) {
                        break L29;
                      } else {
                        var12 = param0[param2];
                        param0[param2] = (var11 | var12 >> 24) << 24 | param3 + ((var12 & 16711935) * var10 >> 8 & 16711935) + ((var12 & 65280) * var10 >> 8 & 65280);
                        param1[param2] = param7;
                        break L29;
                      }
                    }
                    L30: {
                      param7 = param7 + param8;
                      param2++;
                      if (param7 >= param1[param2]) {
                        break L30;
                      } else {
                        var12 = param0[param2];
                        param0[param2] = (var11 | var12 >> 24) << 24 | param3 + ((var12 & 16711935) * var10 >> 8 & 16711935) + ((var12 & 65280) * var10 >> 8 & 65280);
                        param1[param2] = param7;
                        break L30;
                      }
                    }
                    param7 = param7 + param8;
                    continue L24;
                  }
                }
              } else {
                if (param5 != 0) {
                  if (param6 <= this.field_h - 1) {
                    param4--;
                    L31: while (true) {
                      if (param4 < 0) {
                        param4 = param6 - param5 & 3;
                        L32: while (true) {
                          param4--;
                          if (param4 >= 0) {
                            L33: {
                              param2++;
                              if (param7 >= param1[param2]) {
                                break L33;
                              } else {
                                param0[param2 - 1] = param0[param2];
                                break L33;
                              }
                            }
                            param7 = param7 + param8;
                            continue L32;
                          } else {
                            return;
                          }
                        }
                      } else {
                        L34: {
                          param2++;
                          if (param7 >= param1[param2]) {
                            break L34;
                          } else {
                            param0[param2 - 1] = param0[param2];
                            break L34;
                          }
                        }
                        L35: {
                          param7 = param7 + param8;
                          param2++;
                          if (param7 >= param1[param2]) {
                            break L35;
                          } else {
                            param0[param2 - 1] = param0[param2];
                            break L35;
                          }
                        }
                        L36: {
                          param7 = param7 + param8;
                          param2++;
                          if (param7 >= param1[param2]) {
                            break L36;
                          } else {
                            param0[param2 - 1] = param0[param2];
                            break L36;
                          }
                        }
                        L37: {
                          param7 = param7 + param8;
                          param2++;
                          if (param7 >= param1[param2]) {
                            break L37;
                          } else {
                            param0[param2 - 1] = param0[param2];
                            break L37;
                          }
                        }
                        param7 = param7 + param8;
                        param4--;
                        continue L31;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              L38: while (true) {
                param4--;
                if (param4 < 0) {
                  param4 = param6 - param5 & 3;
                  L39: while (true) {
                    param4--;
                    if (param4 >= 0) {
                      L40: {
                        param2++;
                        if (param7 >= param1[param2]) {
                          break L40;
                        } else {
                          param0[param2] = param3;
                          param1[param2] = param7;
                          break L40;
                        }
                      }
                      param7 = param7 + param8;
                      continue L39;
                    } else {
                      return;
                    }
                  }
                } else {
                  L41: {
                    param2++;
                    if (param7 >= param1[param2]) {
                      break L41;
                    } else {
                      param0[param2] = param3;
                      param1[param2] = param7;
                      break L41;
                    }
                  }
                  L42: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                      break L42;
                    } else {
                      param0[param2] = param3;
                      param1[param2] = param7;
                      break L42;
                    }
                  }
                  L43: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                      break L43;
                    } else {
                      param0[param2] = param3;
                      param1[param2] = param7;
                      break L43;
                    }
                  }
                  L44: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                      break L44;
                    } else {
                      param0[param2] = param3;
                      param1[param2] = param7;
                      break L44;
                    }
                  }
                  param7 = param7 + param8;
                  continue L38;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final void b(float param0, float param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8, int param9, int param10, int param11) {
        float var13;
        float var14;
        float var15;
        float var16;
        float var17;
        float var18;
        float var19;
        float var20;
        float var21;
        float var22;
        float var23;
        float var24;
        float var25;
        float var26;
        float var27;
        float var28;
        float var29;
        float var30;
        float var31;
        float var32;
        float var33;
        float var34;
        float var35;
        float var36;
        float var37;
        float var38;
        float var39;
        if (!this.field_s) {
          L0: {
            var13 = param4 - param3;
            var14 = param1 - param0;
            var15 = param5 - param3;
            var16 = param2 - param0;
            var17 = param7 - param6;
            var18 = param8 - param6;
            var19 = (float)((param10 & 16711680) - (param9 & 16711680));
            var20 = (float)((param11 & 16711680) - (param9 & 16711680));
            var21 = (float)((param10 & 65280) - (param9 & 65280));
            var22 = (float)((param11 & 65280) - (param9 & 65280));
            var23 = (float)((param10 & 255) - (param9 & 255));
            var24 = (float)((param11 & 255) - (param9 & 255));
            if (param2 == param1) {
              var25 = 0.0f;
              break L0;
            } else {
              var25 = (param5 - param4) / (param2 - param1);
              break L0;
            }
          }
          L1: {
            if (param1 == param0) {
              var26 = 0.0f;
              break L1;
            } else {
              var26 = var13 / var14;
              break L1;
            }
          }
          L2: {
            if (param2 == param0) {
              var27 = 0.0f;
              break L2;
            } else {
              var27 = var15 / var16;
              break L2;
            }
          }
          var28 = var13 * var16 - var15 * var14;
          if (var28 != 0.0f) {
            L3: {
              var29 = (var17 * var16 - var18 * var14) / var28;
              var30 = (var18 * var13 - var17 * var15) / var28;
              var31 = (var19 * var16 - var20 * var14) / var28;
              var32 = (var20 * var13 - var19 * var15) / var28;
              var33 = (var21 * var16 - var22 * var14) / var28;
              var34 = (var22 * var13 - var21 * var15) / var28;
              var35 = (var23 * var16 - var24 * var14) / var28;
              var36 = (var24 * var13 - var23 * var15) / var28;
              if (param0 > param1) {
                break L3;
              } else {
                if (param0 > param2) {
                  break L3;
                } else {
                  if (param0 < (float)this.field_v) {
                    L4: {
                      if (param1 <= (float)this.field_v) {
                        break L4;
                      } else {
                        param1 = (float)this.field_v;
                        break L4;
                      }
                    }
                    L5: {
                      if (param2 <= (float)this.field_v) {
                        break L5;
                      } else {
                        param2 = (float)this.field_v;
                        break L5;
                      }
                    }
                    param6 = param6 - var29 * param3 + var29;
                    var37 = (float)(param9 & 16711680) - var31 * param3 + var31;
                    var38 = (float)(param9 & 65280) - var33 * param3 + var33;
                    var39 = (float)(param9 & 255) - var35 * param3 + var35;
                    if (param1 >= param2) {
                      L6: {
                        param4 = param3;
                        if (param0 >= 0.0f) {
                          break L6;
                        } else {
                          param4 = param4 - var27 * param0;
                          param3 = param3 - var26 * param0;
                          param6 = param6 - var30 * param0;
                          var37 = var37 - var32 * param0;
                          var38 = var38 - var34 * param0;
                          var39 = var39 - var36 * param0;
                          param0 = 0.0f;
                          break L6;
                        }
                      }
                      L7: {
                        if (param2 >= 0.0f) {
                          break L7;
                        } else {
                          param5 = param5 - var25 * param2;
                          param2 = 0.0f;
                          break L7;
                        }
                      }
                      L8: {
                        if (param0 == param2) {
                          break L8;
                        } else {
                          if (var27 >= var26) {
                            break L8;
                          } else {
                            param1 = param1 - param2;
                            param2 = param2 - param0;
                            param0 = (float)this.field_p[(int)param0];
                            L9: while (true) {
                              param2 = param2 - 1.0f;
                              if (param2 < 0.0f) {
                                L10: while (true) {
                                  param1 = param1 - 1.0f;
                                  if (param1 < 0.0f) {
                                    return;
                                  } else {
                                    this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param3, param6, var29, var37, var31, var38, var33, var39, var35);
                                    param5 = param5 + var25;
                                    param3 = param3 + var26;
                                    param6 = param6 + var30;
                                    var37 = var37 + var32;
                                    var38 = var38 + var34;
                                    var39 = var39 + var36;
                                    param0 = param0 + (float)this.field_t;
                                    continue L10;
                                  }
                                }
                              } else {
                                this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param4, (int)param3, param6, var29, var37, var31, var38, var33, var39, var35);
                                param4 = param4 + var27;
                                param3 = param3 + var26;
                                param6 = param6 + var30;
                                var37 = var37 + var32;
                                var38 = var38 + var34;
                                var39 = var39 + var36;
                                param0 = param0 + (float)this.field_t;
                                continue L9;
                              }
                            }
                          }
                        }
                      }
                      if (param0 == param2) {
                        if (var25 > var26) {
                          param1 = param1 - param2;
                          param2 = param2 - param0;
                          param0 = (float)this.field_p[(int)param0];
                          L11: while (true) {
                            param2 = param2 - 1.0f;
                            if (param2 < 0.0f) {
                              L12: while (true) {
                                param1 = param1 - 1.0f;
                                if (param1 < 0.0f) {
                                  return;
                                } else {
                                  this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param3, param6, var29, var37, var31, var38, var33, var39, var35);
                                  param5 = param5 + var25;
                                  param3 = param3 + var26;
                                  param6 = param6 + var30;
                                  var37 = var37 + var32;
                                  var38 = var38 + var34;
                                  var39 = var39 + var36;
                                  param0 = param0 + (float)this.field_t;
                                  continue L12;
                                }
                              }
                            } else {
                              this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param4, (int)param3, param6, var29, var37, var31, var38, var33, var39, var35);
                              param4 = param4 + var27;
                              param3 = param3 + var26;
                              param6 = param6 + var30;
                              var37 = var37 + var32;
                              var38 = var38 + var34;
                              var39 = var39 + var36;
                              param0 = param0 + (float)this.field_t;
                              continue L11;
                            }
                          }
                        } else {
                          param1 = param1 - param2;
                          param2 = param2 - param0;
                          param0 = (float)this.field_p[(int)param0];
                          L13: while (true) {
                            param2 = param2 - 1.0f;
                            if (param2 < 0.0f) {
                              L14: while (true) {
                                param1 = param1 - 1.0f;
                                if (param1 < 0.0f) {
                                  return;
                                } else {
                                  this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param5, param6, var29, var37, var31, var38, var33, var39, var35);
                                  param5 = param5 + var25;
                                  param3 = param3 + var26;
                                  param6 = param6 + var30;
                                  var37 = var37 + var32;
                                  var38 = var38 + var34;
                                  var39 = var39 + var36;
                                  param0 = param0 + (float)this.field_t;
                                  continue L14;
                                }
                              }
                            } else {
                              this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param4, param6, var29, var37, var31, var38, var33, var39, var35);
                              param4 = param4 + var27;
                              param3 = param3 + var26;
                              param6 = param6 + var30;
                              var37 = var37 + var32;
                              var38 = var38 + var34;
                              var39 = var39 + var36;
                              param0 = param0 + (float)this.field_t;
                              continue L13;
                            }
                          }
                        }
                      } else {
                        param1 = param1 - param2;
                        param2 = param2 - param0;
                        param0 = (float)this.field_p[(int)param0];
                        L15: while (true) {
                          param2 = param2 - 1.0f;
                          if (param2 < 0.0f) {
                            L16: while (true) {
                              param1 = param1 - 1.0f;
                              if (param1 < 0.0f) {
                                return;
                              } else {
                                this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param5, param6, var29, var37, var31, var38, var33, var39, var35);
                                param5 = param5 + var25;
                                param3 = param3 + var26;
                                param6 = param6 + var30;
                                var37 = var37 + var32;
                                var38 = var38 + var34;
                                var39 = var39 + var36;
                                param0 = param0 + (float)this.field_t;
                                continue L16;
                              }
                            }
                          } else {
                            this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param4, param6, var29, var37, var31, var38, var33, var39, var35);
                            param4 = param4 + var27;
                            param3 = param3 + var26;
                            param6 = param6 + var30;
                            var37 = var37 + var32;
                            var38 = var38 + var34;
                            var39 = var39 + var36;
                            param0 = param0 + (float)this.field_t;
                            continue L15;
                          }
                        }
                      }
                    } else {
                      L17: {
                        param5 = param3;
                        if (param0 >= 0.0f) {
                          break L17;
                        } else {
                          param5 = param5 - var27 * param0;
                          param3 = param3 - var26 * param0;
                          param6 = param6 - var30 * param0;
                          var37 = var37 - var32 * param0;
                          var38 = var38 - var34 * param0;
                          var39 = var39 - var36 * param0;
                          param0 = 0.0f;
                          break L17;
                        }
                      }
                      L18: {
                        if (param1 >= 0.0f) {
                          break L18;
                        } else {
                          param4 = param4 - var25 * param1;
                          param1 = 0.0f;
                          break L18;
                        }
                      }
                      L19: {
                        if (param0 == param1) {
                          break L19;
                        } else {
                          if (var27 >= var26) {
                            break L19;
                          } else {
                            param2 = param2 - param1;
                            param1 = param1 - param0;
                            param0 = (float)this.field_p[(int)param0];
                            L20: while (true) {
                              param1 = param1 - 1.0f;
                              if (param1 < 0.0f) {
                                L21: while (true) {
                                  param2 = param2 - 1.0f;
                                  if (param2 < 0.0f) {
                                    return;
                                  } else {
                                    this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param4, param6, var29, var37, var31, var38, var33, var39, var35);
                                    param5 = param5 + var27;
                                    param4 = param4 + var25;
                                    param6 = param6 + var30;
                                    var37 = var37 + var32;
                                    var38 = var38 + var34;
                                    var39 = var39 + var36;
                                    param0 = param0 + (float)this.field_t;
                                    continue L21;
                                  }
                                }
                              } else {
                                this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param3, param6, var29, var37, var31, var38, var33, var39, var35);
                                param5 = param5 + var27;
                                param3 = param3 + var26;
                                param6 = param6 + var30;
                                var37 = var37 + var32;
                                var38 = var38 + var34;
                                var39 = var39 + var36;
                                param0 = param0 + (float)this.field_t;
                                continue L20;
                              }
                            }
                          }
                        }
                      }
                      if (param0 == param1) {
                        if (var27 > var25) {
                          param2 = param2 - param1;
                          param1 = param1 - param0;
                          param0 = (float)this.field_p[(int)param0];
                          L22: while (true) {
                            param1 = param1 - 1.0f;
                            if (param1 < 0.0f) {
                              L23: while (true) {
                                param2 = param2 - 1.0f;
                                if (param2 < 0.0f) {
                                  return;
                                } else {
                                  this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param4, param6, var29, var37, var31, var38, var33, var39, var35);
                                  param5 = param5 + var27;
                                  param4 = param4 + var25;
                                  param6 = param6 + var30;
                                  var37 = var37 + var32;
                                  var38 = var38 + var34;
                                  var39 = var39 + var36;
                                  param0 = param0 + (float)this.field_t;
                                  continue L23;
                                }
                              }
                            } else {
                              this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param3, param6, var29, var37, var31, var38, var33, var39, var35);
                              param5 = param5 + var27;
                              param3 = param3 + var26;
                              param6 = param6 + var30;
                              var37 = var37 + var32;
                              var38 = var38 + var34;
                              var39 = var39 + var36;
                              param0 = param0 + (float)this.field_t;
                              continue L22;
                            }
                          }
                        } else {
                          param2 = param2 - param1;
                          param1 = param1 - param0;
                          param0 = (float)this.field_p[(int)param0];
                          L24: while (true) {
                            param1 = param1 - 1.0f;
                            if (param1 < 0.0f) {
                              L25: while (true) {
                                param2 = param2 - 1.0f;
                                if (param2 < 0.0f) {
                                  return;
                                } else {
                                  this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param4, (int)param5, param6, var29, var37, var31, var38, var33, var39, var35);
                                  param5 = param5 + var27;
                                  param4 = param4 + var25;
                                  param6 = param6 + var30;
                                  var37 = var37 + var32;
                                  var38 = var38 + var34;
                                  var39 = var39 + var36;
                                  param0 = param0 + (float)this.field_t;
                                  continue L25;
                                }
                              }
                            } else {
                              this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param5, param6, var29, var37, var31, var38, var33, var39, var35);
                              param5 = param5 + var27;
                              param3 = param3 + var26;
                              param6 = param6 + var30;
                              var37 = var37 + var32;
                              var38 = var38 + var34;
                              var39 = var39 + var36;
                              param0 = param0 + (float)this.field_t;
                              continue L24;
                            }
                          }
                        }
                      } else {
                        param2 = param2 - param1;
                        param1 = param1 - param0;
                        param0 = (float)this.field_p[(int)param0];
                        L26: while (true) {
                          param1 = param1 - 1.0f;
                          if (param1 < 0.0f) {
                            L27: while (true) {
                              param2 = param2 - 1.0f;
                              if (param2 < 0.0f) {
                                return;
                              } else {
                                this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param4, (int)param5, param6, var29, var37, var31, var38, var33, var39, var35);
                                param5 = param5 + var27;
                                param4 = param4 + var25;
                                param6 = param6 + var30;
                                var37 = var37 + var32;
                                var38 = var38 + var34;
                                var39 = var39 + var36;
                                param0 = param0 + (float)this.field_t;
                                continue L27;
                              }
                            }
                          } else {
                            this.a(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param5, param6, var29, var37, var31, var38, var33, var39, var35);
                            param5 = param5 + var27;
                            param3 = param3 + var26;
                            param6 = param6 + var30;
                            var37 = var37 + var32;
                            var38 = var38 + var34;
                            var39 = var39 + var36;
                            param0 = param0 + (float)this.field_t;
                            continue L26;
                          }
                        }
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            if (param1 > param2) {
              if (param2 < (float)this.field_v) {
                L28: {
                  if (param0 <= (float)this.field_v) {
                    break L28;
                  } else {
                    param0 = (float)this.field_v;
                    break L28;
                  }
                }
                L29: {
                  if (param1 <= (float)this.field_v) {
                    break L29;
                  } else {
                    param1 = (float)this.field_v;
                    break L29;
                  }
                }
                param8 = param8 - var29 * param5 + var29;
                var37 = (float)(param11 & 16711680) - var31 * param5 + var31;
                var38 = (float)(param11 & 65280) - var33 * param5 + var33;
                var39 = (float)(param11 & 255) - var35 * param5 + var35;
                if (param0 >= param1) {
                  L30: {
                    param3 = param5;
                    if (param2 >= 0.0f) {
                      break L30;
                    } else {
                      param3 = param3 - var25 * param2;
                      param5 = param5 - var27 * param2;
                      param8 = param8 - var30 * param2;
                      var37 = var37 - var32 * param2;
                      var38 = var38 - var34 * param2;
                      var39 = var39 - var36 * param2;
                      param2 = 0.0f;
                      break L30;
                    }
                  }
                  L31: {
                    if (param1 >= 0.0f) {
                      break L31;
                    } else {
                      param4 = param4 - var26 * param1;
                      param1 = 0.0f;
                      break L31;
                    }
                  }
                  if (var25 < var27) {
                    param0 = param0 - param1;
                    param1 = param1 - param2;
                    param2 = (float)this.field_p[(int)param2];
                    L32: while (true) {
                      param1 = param1 - 1.0f;
                      if (param1 < 0.0f) {
                        L33: while (true) {
                          param0 = param0 - 1.0f;
                          if (param0 < 0.0f) {
                            return;
                          } else {
                            this.a(this.field_a, this.field_u, (int)param2, 0, 0, (int)param4, (int)param5, param8, var29, var37, var31, var38, var33, var39, var35);
                            param4 = param4 + var26;
                            param5 = param5 + var27;
                            param8 = param8 + var30;
                            var37 = var37 + var32;
                            var38 = var38 + var34;
                            var39 = var39 + var36;
                            param2 = param2 + (float)this.field_t;
                            continue L33;
                          }
                        }
                      } else {
                        this.a(this.field_a, this.field_u, (int)param2, 0, 0, (int)param3, (int)param5, param8, var29, var37, var31, var38, var33, var39, var35);
                        param3 = param3 + var25;
                        param5 = param5 + var27;
                        param8 = param8 + var30;
                        var37 = var37 + var32;
                        var38 = var38 + var34;
                        var39 = var39 + var36;
                        param2 = param2 + (float)this.field_t;
                        continue L32;
                      }
                    }
                  } else {
                    param0 = param0 - param1;
                    param1 = param1 - param2;
                    param2 = (float)this.field_p[(int)param2];
                    L34: while (true) {
                      param1 = param1 - 1.0f;
                      if (param1 < 0.0f) {
                        L35: while (true) {
                          param0 = param0 - 1.0f;
                          if (param0 < 0.0f) {
                            return;
                          } else {
                            this.a(this.field_a, this.field_u, (int)param2, 0, 0, (int)param5, (int)param4, param8, var29, var37, var31, var38, var33, var39, var35);
                            param4 = param4 + var26;
                            param5 = param5 + var27;
                            param8 = param8 + var30;
                            var37 = var37 + var32;
                            var38 = var38 + var34;
                            var39 = var39 + var36;
                            param2 = param2 + (float)this.field_t;
                            continue L35;
                          }
                        }
                      } else {
                        this.a(this.field_a, this.field_u, (int)param2, 0, 0, (int)param5, (int)param3, param8, var29, var37, var31, var38, var33, var39, var35);
                        param3 = param3 + var25;
                        param5 = param5 + var27;
                        param8 = param8 + var30;
                        var37 = var37 + var32;
                        var38 = var38 + var34;
                        var39 = var39 + var36;
                        param2 = param2 + (float)this.field_t;
                        continue L34;
                      }
                    }
                  }
                } else {
                  L36: {
                    param4 = param5;
                    if (param2 >= 0.0f) {
                      break L36;
                    } else {
                      param4 = param4 - var25 * param2;
                      param5 = param5 - var27 * param2;
                      param8 = param8 - var30 * param2;
                      var37 = var37 - var32 * param2;
                      var38 = var38 - var34 * param2;
                      var39 = var39 - var36 * param2;
                      param2 = 0.0f;
                      break L36;
                    }
                  }
                  L37: {
                    if (param0 >= 0.0f) {
                      break L37;
                    } else {
                      param3 = param3 - var26 * param0;
                      param0 = 0.0f;
                      break L37;
                    }
                  }
                  if (var25 < var27) {
                    param1 = param1 - param0;
                    param0 = param0 - param2;
                    param2 = (float)this.field_p[(int)param2];
                    L38: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        L39: while (true) {
                          param1 = param1 - 1.0f;
                          if (param1 < 0.0f) {
                            return;
                          } else {
                            this.a(this.field_a, this.field_u, (int)param2, 0, 0, (int)param4, (int)param3, param8, var29, var37, var31, var38, var33, var39, var35);
                            param4 = param4 + var25;
                            param3 = param3 + var26;
                            param8 = param8 + var30;
                            var37 = var37 + var32;
                            var38 = var38 + var34;
                            var39 = var39 + var36;
                            param2 = param2 + (float)this.field_t;
                            continue L39;
                          }
                        }
                      } else {
                        this.a(this.field_a, this.field_u, (int)param2, 0, 0, (int)param4, (int)param5, param8, var29, var37, var31, var38, var33, var39, var35);
                        param4 = param4 + var25;
                        param5 = param5 + var27;
                        param8 = param8 + var30;
                        var37 = var37 + var32;
                        var38 = var38 + var34;
                        var39 = var39 + var36;
                        param2 = param2 + (float)this.field_t;
                        continue L38;
                      }
                    }
                  } else {
                    param1 = param1 - param0;
                    param0 = param0 - param2;
                    param2 = (float)this.field_p[(int)param2];
                    L40: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        L41: while (true) {
                          param1 = param1 - 1.0f;
                          if (param1 < 0.0f) {
                            return;
                          } else {
                            this.a(this.field_a, this.field_u, (int)param2, 0, 0, (int)param3, (int)param4, param8, var29, var37, var31, var38, var33, var39, var35);
                            param4 = param4 + var25;
                            param3 = param3 + var26;
                            param8 = param8 + var30;
                            var37 = var37 + var32;
                            var38 = var38 + var34;
                            var39 = var39 + var36;
                            param2 = param2 + (float)this.field_t;
                            continue L41;
                          }
                        }
                      } else {
                        this.a(this.field_a, this.field_u, (int)param2, 0, 0, (int)param5, (int)param4, param8, var29, var37, var31, var38, var33, var39, var35);
                        param4 = param4 + var25;
                        param5 = param5 + var27;
                        param8 = param8 + var30;
                        var37 = var37 + var32;
                        var38 = var38 + var34;
                        var39 = var39 + var36;
                        param2 = param2 + (float)this.field_t;
                        continue L40;
                      }
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              if (param1 < (float)this.field_v) {
                L42: {
                  if (param2 <= (float)this.field_v) {
                    break L42;
                  } else {
                    param2 = (float)this.field_v;
                    break L42;
                  }
                }
                L43: {
                  if (param0 <= (float)this.field_v) {
                    break L43;
                  } else {
                    param0 = (float)this.field_v;
                    break L43;
                  }
                }
                param7 = param7 - var29 * param4 + var29;
                var37 = (float)(param10 & 16711680) - var31 * param4 + var31;
                var38 = (float)(param10 & 65280) - var33 * param4 + var33;
                var39 = (float)(param10 & 255) - var35 * param4 + var35;
                if (param2 >= param0) {
                  L44: {
                    param5 = param4;
                    if (param1 >= 0.0f) {
                      break L44;
                    } else {
                      param5 = param5 - var26 * param1;
                      param4 = param4 - var25 * param1;
                      param7 = param7 - var30 * param1;
                      var37 = var37 - var32 * param1;
                      var38 = var38 - var34 * param1;
                      var39 = var39 - var36 * param1;
                      param1 = 0.0f;
                      break L44;
                    }
                  }
                  L45: {
                    if (param0 >= 0.0f) {
                      break L45;
                    } else {
                      param3 = param3 - var27 * param0;
                      param0 = 0.0f;
                      break L45;
                    }
                  }
                  if (var26 < var25) {
                    param2 = param2 - param0;
                    param0 = param0 - param1;
                    param1 = (float)this.field_p[(int)param1];
                    L46: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        L47: while (true) {
                          param2 = param2 - 1.0f;
                          if (param2 < 0.0f) {
                            return;
                          } else {
                            this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param3, (int)param4, param7, var29, var37, var31, var38, var33, var39, var35);
                            param3 = param3 + var27;
                            param4 = param4 + var25;
                            param7 = param7 + var30;
                            var37 = var37 + var32;
                            var38 = var38 + var34;
                            var39 = var39 + var36;
                            param1 = param1 + (float)this.field_t;
                            continue L47;
                          }
                        }
                      } else {
                        this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param5, (int)param4, param7, var29, var37, var31, var38, var33, var39, var35);
                        param5 = param5 + var26;
                        param4 = param4 + var25;
                        param7 = param7 + var30;
                        var37 = var37 + var32;
                        var38 = var38 + var34;
                        var39 = var39 + var36;
                        param1 = param1 + (float)this.field_t;
                        continue L46;
                      }
                    }
                  } else {
                    param2 = param2 - param0;
                    param0 = param0 - param1;
                    param1 = (float)this.field_p[(int)param1];
                    L48: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        L49: while (true) {
                          param2 = param2 - 1.0f;
                          if (param2 < 0.0f) {
                            return;
                          } else {
                            this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param4, (int)param3, param7, var29, var37, var31, var38, var33, var39, var35);
                            param3 = param3 + var27;
                            param4 = param4 + var25;
                            param7 = param7 + var30;
                            var37 = var37 + var32;
                            var38 = var38 + var34;
                            var39 = var39 + var36;
                            param1 = param1 + (float)this.field_t;
                            continue L49;
                          }
                        }
                      } else {
                        this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param4, (int)param5, param7, var29, var37, var31, var38, var33, var39, var35);
                        param5 = param5 + var26;
                        param4 = param4 + var25;
                        param7 = param7 + var30;
                        var37 = var37 + var32;
                        var38 = var38 + var34;
                        var39 = var39 + var36;
                        param1 = param1 + (float)this.field_t;
                        continue L48;
                      }
                    }
                  }
                } else {
                  L50: {
                    param3 = param4;
                    if (param1 >= 0.0f) {
                      break L50;
                    } else {
                      param3 = param3 - var26 * param1;
                      param4 = param4 - var25 * param1;
                      param7 = param7 - var30 * param1;
                      var37 = var37 - var32 * param1;
                      var38 = var38 - var34 * param1;
                      var39 = var39 - var36 * param1;
                      param1 = 0.0f;
                      break L50;
                    }
                  }
                  L51: {
                    if (param2 >= 0.0f) {
                      break L51;
                    } else {
                      param5 = param5 - var27 * param2;
                      param2 = 0.0f;
                      break L51;
                    }
                  }
                  L52: {
                    if (param1 == param2) {
                      break L52;
                    } else {
                      if (var26 >= var25) {
                        break L52;
                      } else {
                        param0 = param0 - param2;
                        param2 = param2 - param1;
                        param1 = (float)this.field_p[(int)param1];
                        L53: while (true) {
                          param2 = param2 - 1.0f;
                          if (param2 < 0.0f) {
                            L54: while (true) {
                              param0 = param0 - 1.0f;
                              if (param0 < 0.0f) {
                                return;
                              } else {
                                this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param3, (int)param5, param7, var29, var37, var31, var38, var33, var39, var35);
                                param3 = param3 + var26;
                                param5 = param5 + var27;
                                param7 = param7 + var30;
                                var37 = var37 + var32;
                                var38 = var38 + var34;
                                var39 = var39 + var36;
                                param1 = param1 + (float)this.field_t;
                                continue L54;
                              }
                            }
                          } else {
                            this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param3, (int)param4, param7, var29, var37, var31, var38, var33, var39, var35);
                            param3 = param3 + var26;
                            param4 = param4 + var25;
                            param7 = param7 + var30;
                            var37 = var37 + var32;
                            var38 = var38 + var34;
                            var39 = var39 + var36;
                            param1 = param1 + (float)this.field_t;
                            continue L53;
                          }
                        }
                      }
                    }
                  }
                  if (param1 == param2) {
                    if (var26 > var27) {
                      param0 = param0 - param2;
                      param2 = param2 - param1;
                      param1 = (float)this.field_p[(int)param1];
                      L55: while (true) {
                        param2 = param2 - 1.0f;
                        if (param2 < 0.0f) {
                          L56: while (true) {
                            param0 = param0 - 1.0f;
                            if (param0 < 0.0f) {
                              return;
                            } else {
                              this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param3, (int)param5, param7, var29, var37, var31, var38, var33, var39, var35);
                              param3 = param3 + var26;
                              param5 = param5 + var27;
                              param7 = param7 + var30;
                              var37 = var37 + var32;
                              var38 = var38 + var34;
                              var39 = var39 + var36;
                              param1 = param1 + (float)this.field_t;
                              continue L56;
                            }
                          }
                        } else {
                          this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param3, (int)param4, param7, var29, var37, var31, var38, var33, var39, var35);
                          param3 = param3 + var26;
                          param4 = param4 + var25;
                          param7 = param7 + var30;
                          var37 = var37 + var32;
                          var38 = var38 + var34;
                          var39 = var39 + var36;
                          param1 = param1 + (float)this.field_t;
                          continue L55;
                        }
                      }
                    } else {
                      param0 = param0 - param2;
                      param2 = param2 - param1;
                      param1 = (float)this.field_p[(int)param1];
                      L57: while (true) {
                        param2 = param2 - 1.0f;
                        if (param2 < 0.0f) {
                          L58: while (true) {
                            param0 = param0 - 1.0f;
                            if (param0 < 0.0f) {
                              return;
                            } else {
                              this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param5, (int)param3, param7, var29, var37, var31, var38, var33, var39, var35);
                              param3 = param3 + var26;
                              param5 = param5 + var27;
                              param7 = param7 + var30;
                              var37 = var37 + var32;
                              var38 = var38 + var34;
                              var39 = var39 + var36;
                              param1 = param1 + (float)this.field_t;
                              continue L58;
                            }
                          }
                        } else {
                          this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param4, (int)param3, param7, var29, var37, var31, var38, var33, var39, var35);
                          param3 = param3 + var26;
                          param4 = param4 + var25;
                          param7 = param7 + var30;
                          var37 = var37 + var32;
                          var38 = var38 + var34;
                          var39 = var39 + var36;
                          param1 = param1 + (float)this.field_t;
                          continue L57;
                        }
                      }
                    }
                  } else {
                    param0 = param0 - param2;
                    param2 = param2 - param1;
                    param1 = (float)this.field_p[(int)param1];
                    L59: while (true) {
                      param2 = param2 - 1.0f;
                      if (param2 < 0.0f) {
                        L60: while (true) {
                          param0 = param0 - 1.0f;
                          if (param0 < 0.0f) {
                            return;
                          } else {
                            this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param5, (int)param3, param7, var29, var37, var31, var38, var33, var39, var35);
                            param3 = param3 + var26;
                            param5 = param5 + var27;
                            param7 = param7 + var30;
                            var37 = var37 + var32;
                            var38 = var38 + var34;
                            var39 = var39 + var36;
                            param1 = param1 + (float)this.field_t;
                            continue L60;
                          }
                        }
                      } else {
                        this.a(this.field_a, this.field_u, (int)param1, 0, 0, (int)param4, (int)param3, param7, var29, var37, var31, var38, var33, var39, var35);
                        param3 = param3 + var26;
                        param4 = param4 + var25;
                        param7 = param7 + var30;
                        var37 = var37 + var32;
                        var38 = var38 + var34;
                        var39 = var39 + var36;
                        param1 = param1 + (float)this.field_t;
                        continue L59;
                      }
                    }
                  }
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } else {
          this.field_k.b((int)param0, -16777216 | param9, (int)param3, (int)param1, 1, (int)param4);
          this.field_k.b((int)param1, -16777216 | param9, (int)param4, (int)param2, 1, (int)param5);
          this.field_k.b((int)param2, -16777216 | param9, (int)param5, (int)param0, 1, (int)param3);
          return;
        }
    }

    final void a(boolean param0) {
        this.field_s = param0 ? true : false;
    }

    private final void a(int[] param0, float[] param1, int param2, int param3, int param4, int param5, int param6, float param7, float param8, float param9, float param10) {
        int var12;
        int var13;
        int var14;
        L0: {
          if (!this.field_q) {
            break L0;
          } else {
            L1: {
              if (param6 <= this.field_h) {
                break L1;
              } else {
                param6 = this.field_h;
                break L1;
              }
            }
            if (param5 >= 0) {
              break L0;
            } else {
              param5 = 0;
              break L0;
            }
          }
        }
        if (param5 < param6) {
          L2: {
            L3: {
              param2 = param2 + (param5 - 1);
              param7 = param7 + param8 * (float)param5;
              param9 = param9 + param10 * (float)param5;
              if (!this.field_o.field_n) {
                if (!this.field_j) {
                  param4 = param6 - param5;
                  if (this.field_b != 0) {
                    var12 = this.field_b;
                    var13 = 256 - this.field_b;
                    L4: while (true) {
                      L5: {
                        param2++;
                        if (param9 >= param1[param2]) {
                          break L5;
                        } else {
                          param3 = bt.field_h[(int)param7];
                          param3 = ((param3 & 16711935) * var13 >> 8 & 16711935) + ((param3 & 65280) * var13 >> 8 & 65280);
                          var14 = param0[param2];
                          param0[param2] = (var13 | var14 >> 24) << 24 | param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                          break L5;
                        }
                      }
                      param7 = param7 + param8;
                      param9 = param9 + param10;
                      param4--;
                      if (param4 > 0) {
                        continue L4;
                      } else {
                        break L2;
                      }
                    }
                  } else {
                    L6: while (true) {
                      L7: {
                        param2++;
                        if (param9 >= param1[param2]) {
                          break L7;
                        } else {
                          param0[param2] = bt.field_h[(int)param7];
                          break L7;
                        }
                      }
                      param9 = param9 + param10;
                      param7 = param7 + param8;
                      param4--;
                      if (param4 > 0) {
                        continue L6;
                      } else {
                        break L2;
                      }
                    }
                  }
                } else {
                  param4 = param6 - param5 >> 2;
                  param8 = param8 * 4.0f;
                  if (this.field_b != 0) {
                    L8: {
                      var12 = this.field_b;
                      var13 = 256 - this.field_b;
                      if (param4 <= 0) {
                        break L8;
                      } else {
                        L9: while (true) {
                          L10: {
                            param3 = bt.field_h[(int)param7];
                            param7 = param7 + param8;
                            param3 = ((param3 & 16711935) * var13 >> 8 & 16711935) + ((param3 & 65280) * var13 >> 8 & 65280);
                            param2++;
                            if (param9 >= param1[param2]) {
                              break L10;
                            } else {
                              var14 = param0[param2];
                              param0[param2] = (var13 | var14 >> 24) << 24 | param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                              break L10;
                            }
                          }
                          L11: {
                            param9 = param9 + param10;
                            param2++;
                            if (param9 >= param1[param2]) {
                              break L11;
                            } else {
                              var14 = param0[param2];
                              param0[param2] = (var13 | var14 >> 24) << 24 | param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                              break L11;
                            }
                          }
                          L12: {
                            param9 = param9 + param10;
                            param2++;
                            if (param9 >= param1[param2]) {
                              break L12;
                            } else {
                              var14 = param0[param2];
                              param0[param2] = (var13 | var14 >> 24) << 24 | param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                              break L12;
                            }
                          }
                          L13: {
                            param9 = param9 + param10;
                            param2++;
                            if (param9 >= param1[param2]) {
                              break L13;
                            } else {
                              var14 = param0[param2];
                              param0[param2] = (var13 | var14 >> 24) << 24 | param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                              break L13;
                            }
                          }
                          param9 = param9 + param10;
                          param4--;
                          if (param4 > 0) {
                            continue L9;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    param4 = param6 - param5 & 3;
                    if (param4 <= 0) {
                      break L3;
                    } else {
                      param3 = bt.field_h[(int)param7];
                      param3 = ((param3 & 16711935) * var13 >> 8 & 16711935) + ((param3 & 65280) * var13 >> 8 & 65280);
                      L14: while (true) {
                        L15: {
                          param2++;
                          if (param9 >= param1[param2]) {
                            break L15;
                          } else {
                            var14 = param0[param2];
                            param0[param2] = (var13 | var14 >> 24) << 24 | param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                            break L15;
                          }
                        }
                        param9 = param9 + param10;
                        param4--;
                        if (param4 > 0) {
                          continue L14;
                        } else {
                          break L2;
                        }
                      }
                    }
                  } else {
                    L16: {
                      if (param4 <= 0) {
                        break L16;
                      } else {
                        L17: while (true) {
                          L18: {
                            param3 = bt.field_h[(int)param7];
                            param7 = param7 + param8;
                            param2++;
                            if (param9 >= param1[param2]) {
                              break L18;
                            } else {
                              param0[param2] = param3;
                              break L18;
                            }
                          }
                          L19: {
                            param9 = param9 + param10;
                            param2++;
                            if (param9 >= param1[param2]) {
                              break L19;
                            } else {
                              param0[param2] = param3;
                              break L19;
                            }
                          }
                          L20: {
                            param9 = param9 + param10;
                            param2++;
                            if (param9 >= param1[param2]) {
                              break L20;
                            } else {
                              param0[param2] = param3;
                              break L20;
                            }
                          }
                          L21: {
                            param9 = param9 + param10;
                            param2++;
                            if (param9 >= param1[param2]) {
                              break L21;
                            } else {
                              param0[param2] = param3;
                              break L21;
                            }
                          }
                          param9 = param9 + param10;
                          param4--;
                          if (param4 > 0) {
                            continue L17;
                          } else {
                            break L16;
                          }
                        }
                      }
                    }
                    param4 = param6 - param5 & 3;
                    if (param4 <= 0) {
                      break L2;
                    } else {
                      param3 = bt.field_h[(int)param7];
                      L22: while (true) {
                        L23: {
                          param2++;
                          if (param9 >= param1[param2]) {
                            break L23;
                          } else {
                            param0[param2] = param3;
                            break L23;
                          }
                        }
                        param9 = param9 + param10;
                        param4--;
                        if (param4 > 0) {
                          continue L22;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              } else {
                if (!this.field_j) {
                  param4 = param6 - param5;
                  if (this.field_b != 0) {
                    var12 = this.field_b;
                    var13 = 256 - this.field_b;
                    L24: while (true) {
                      L25: {
                        param2++;
                        if (param9 >= param1[param2]) {
                          break L25;
                        } else {
                          param3 = bt.field_h[(int)param7];
                          param3 = ((param3 & 16711935) * var13 >> 8 & 16711935) + ((param3 & 65280) * var13 >> 8 & 65280);
                          var14 = param0[param2];
                          param0[param2] = (var13 | var14 >> 24) << 24 | param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                          param1[param2] = param9;
                          break L25;
                        }
                      }
                      param7 = param7 + param8;
                      param9 = param9 + param10;
                      param4--;
                      if (param4 > 0) {
                        continue L24;
                      } else {
                        break L2;
                      }
                    }
                  } else {
                    L26: while (true) {
                      L27: {
                        param2++;
                        if (param9 >= param1[param2]) {
                          break L27;
                        } else {
                          param0[param2] = bt.field_h[(int)param7];
                          param1[param2] = param9;
                          break L27;
                        }
                      }
                      param9 = param9 + param10;
                      param7 = param7 + param8;
                      param4--;
                      if (param4 > 0) {
                        continue L26;
                      } else {
                        break L2;
                      }
                    }
                  }
                } else {
                  param4 = param6 - param5 >> 2;
                  param8 = param8 * 4.0f;
                  if (this.field_b != 0) {
                    L28: {
                      var12 = this.field_b;
                      var13 = 256 - this.field_b;
                      if (param4 <= 0) {
                        break L28;
                      } else {
                        L29: while (true) {
                          L30: {
                            param3 = bt.field_h[(int)param7];
                            param7 = param7 + param8;
                            param3 = ((param3 & 16711935) * var13 >> 8 & 16711935) + ((param3 & 65280) * var13 >> 8 & 65280);
                            param2++;
                            if (param9 >= param1[param2]) {
                              break L30;
                            } else {
                              var14 = param0[param2];
                              param0[param2] = (var13 | var14 >> 24) << 24 | param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                              param1[param2] = param9;
                              break L30;
                            }
                          }
                          L31: {
                            param9 = param9 + param10;
                            param2++;
                            if (param9 >= param1[param2]) {
                              break L31;
                            } else {
                              var14 = param0[param2];
                              param0[param2] = (var13 | var14 >> 24) << 24 | param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                              param1[param2] = param9;
                              break L31;
                            }
                          }
                          L32: {
                            param9 = param9 + param10;
                            param2++;
                            if (param9 >= param1[param2]) {
                              break L32;
                            } else {
                              var14 = param0[param2];
                              param0[param2] = (var13 | var14 >> 24) << 24 | param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                              param1[param2] = param9;
                              break L32;
                            }
                          }
                          L33: {
                            param9 = param9 + param10;
                            param2++;
                            if (param9 >= param1[param2]) {
                              break L33;
                            } else {
                              var14 = param0[param2];
                              param0[param2] = (var13 | var14 >> 24) << 24 | param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                              param1[param2] = param9;
                              break L33;
                            }
                          }
                          param9 = param9 + param10;
                          param4--;
                          if (param4 > 0) {
                            continue L29;
                          } else {
                            break L28;
                          }
                        }
                      }
                    }
                    param4 = param6 - param5 & 3;
                    if (param4 <= 0) {
                      break L3;
                    } else {
                      param3 = bt.field_h[(int)param7];
                      param3 = ((param3 & 16711935) * var13 >> 8 & 16711935) + ((param3 & 65280) * var13 >> 8 & 65280);
                      L34: while (true) {
                        L35: {
                          param2++;
                          if (param9 >= param1[param2]) {
                            break L35;
                          } else {
                            var14 = param0[param2];
                            param0[param2] = (var13 | var14 >> 24) << 24 | param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                            param1[param2] = param9;
                            break L35;
                          }
                        }
                        param9 = param9 + param10;
                        param4--;
                        if (param4 > 0) {
                          continue L34;
                        } else {
                          break L2;
                        }
                      }
                    }
                  } else {
                    L36: {
                      if (param4 <= 0) {
                        break L36;
                      } else {
                        L37: while (true) {
                          L38: {
                            param3 = bt.field_h[(int)param7];
                            param7 = param7 + param8;
                            param2++;
                            if (param9 >= param1[param2]) {
                              break L38;
                            } else {
                              param0[param2] = param3;
                              param1[param2] = param9;
                              break L38;
                            }
                          }
                          L39: {
                            param9 = param9 + param10;
                            param2++;
                            if (param9 >= param1[param2]) {
                              break L39;
                            } else {
                              param0[param2] = param3;
                              param1[param2] = param9;
                              break L39;
                            }
                          }
                          L40: {
                            param9 = param9 + param10;
                            param2++;
                            if (param9 >= param1[param2]) {
                              break L40;
                            } else {
                              param0[param2] = param3;
                              param1[param2] = param9;
                              break L40;
                            }
                          }
                          L41: {
                            param9 = param9 + param10;
                            param2++;
                            if (param9 >= param1[param2]) {
                              break L41;
                            } else {
                              param0[param2] = param3;
                              param1[param2] = param9;
                              break L41;
                            }
                          }
                          param9 = param9 + param10;
                          param4--;
                          if (param4 > 0) {
                            continue L37;
                          } else {
                            break L36;
                          }
                        }
                      }
                    }
                    param4 = param6 - param5 & 3;
                    if (param4 > 0) {
                      param3 = bt.field_h[(int)param7];
                      L42: while (true) {
                        L43: {
                          param2++;
                          if (param9 >= param1[param2]) {
                            break L43;
                          } else {
                            param0[param2] = param3;
                            param1[param2] = param9;
                            break L43;
                          }
                        }
                        param9 = param9 + param10;
                        param4--;
                        if (param4 > 0) {
                          continue L42;
                        } else {
                          break L2;
                        }
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
            }
            break L2;
          }
          return;
        } else {
          return;
        }
    }

    final void a(float param0, float param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8, int param9) {
        float var11;
        float var12;
        float var13;
        float var14;
        float var15;
        float var16;
        float var17;
        float var18;
        float var19;
        float var20;
        float var21;
        float var22;
        if (!this.field_s) {
          L0: {
            var11 = param4 - param3;
            var12 = param1 - param0;
            var13 = param5 - param3;
            var14 = param2 - param0;
            var15 = param7 - param6;
            var16 = param8 - param6;
            var17 = 0.0f;
            if (param1 == param0) {
              break L0;
            } else {
              var17 = (param4 - param3) / (param1 - param0);
              break L0;
            }
          }
          L1: {
            var18 = 0.0f;
            if (param2 == param1) {
              break L1;
            } else {
              var18 = (param5 - param4) / (param2 - param1);
              break L1;
            }
          }
          L2: {
            var19 = 0.0f;
            if (param2 == param0) {
              break L2;
            } else {
              var19 = (param3 - param5) / (param0 - param2);
              break L2;
            }
          }
          var20 = var11 * var14 - var13 * var12;
          if (var20 != 0.0f) {
            L3: {
              var21 = (var15 * var14 - var16 * var12) / var20;
              var22 = (var16 * var11 - var15 * var13) / var20;
              if (param0 > param1) {
                break L3;
              } else {
                if (param0 > param2) {
                  break L3;
                } else {
                  if (param0 < (float)this.field_v) {
                    L4: {
                      if (param1 <= (float)this.field_v) {
                        break L4;
                      } else {
                        param1 = (float)this.field_v;
                        break L4;
                      }
                    }
                    L5: {
                      if (param2 <= (float)this.field_v) {
                        break L5;
                      } else {
                        param2 = (float)this.field_v;
                        break L5;
                      }
                    }
                    param6 = param6 - var21 * param3 + var21;
                    if (param1 >= param2) {
                      L6: {
                        param4 = param3;
                        if (param0 >= 0.0f) {
                          break L6;
                        } else {
                          param4 = param4 - var19 * param0;
                          param3 = param3 - var17 * param0;
                          param6 = param6 - var22 * param0;
                          param0 = 0.0f;
                          break L6;
                        }
                      }
                      L7: {
                        if (param2 >= 0.0f) {
                          break L7;
                        } else {
                          param5 = param5 - var18 * param2;
                          param2 = 0.0f;
                          break L7;
                        }
                      }
                      L8: {
                        if (param0 == param2) {
                          break L8;
                        } else {
                          if (var19 >= var17) {
                            break L8;
                          } else {
                            param1 = param1 - param2;
                            param2 = param2 - param0;
                            param0 = (float)this.field_p[(int)param0];
                            L9: while (true) {
                              param2 = param2 - 1.0f;
                              if (param2 < 0.0f) {
                                L10: while (true) {
                                  param1 = param1 - 1.0f;
                                  if (param1 < 0.0f) {
                                    return;
                                  } else {
                                    this.a(this.field_a, this.field_u, (int)param0, param9, 0, (int)param5, (int)param3, param6, var21);
                                    param5 = param5 + var18;
                                    param3 = param3 + var17;
                                    param6 = param6 + var22;
                                    param0 = param0 + (float)this.field_t;
                                    continue L10;
                                  }
                                }
                              } else {
                                this.a(this.field_a, this.field_u, (int)param0, param9, 0, (int)param4, (int)param3, param6, var21);
                                param4 = param4 + var19;
                                param3 = param3 + var17;
                                param6 = param6 + var22;
                                param0 = param0 + (float)this.field_t;
                                continue L9;
                              }
                            }
                          }
                        }
                      }
                      if (param0 == param2) {
                        if (var18 > var17) {
                          param1 = param1 - param2;
                          param2 = param2 - param0;
                          param0 = (float)this.field_p[(int)param0];
                          L11: while (true) {
                            param2 = param2 - 1.0f;
                            if (param2 < 0.0f) {
                              L12: while (true) {
                                param1 = param1 - 1.0f;
                                if (param1 < 0.0f) {
                                  return;
                                } else {
                                  this.a(this.field_a, this.field_u, (int)param0, param9, 0, (int)param5, (int)param3, param6, var21);
                                  param5 = param5 + var18;
                                  param3 = param3 + var17;
                                  param6 = param6 + var22;
                                  param0 = param0 + (float)this.field_t;
                                  continue L12;
                                }
                              }
                            } else {
                              this.a(this.field_a, this.field_u, (int)param0, param9, 0, (int)param4, (int)param3, param6, var21);
                              param4 = param4 + var19;
                              param3 = param3 + var17;
                              param6 = param6 + var22;
                              param0 = param0 + (float)this.field_t;
                              continue L11;
                            }
                          }
                        } else {
                          param1 = param1 - param2;
                          param2 = param2 - param0;
                          param0 = (float)this.field_p[(int)param0];
                          L13: while (true) {
                            param2 = param2 - 1.0f;
                            if (param2 < 0.0f) {
                              L14: while (true) {
                                param1 = param1 - 1.0f;
                                if (param1 < 0.0f) {
                                  return;
                                } else {
                                  this.a(this.field_a, this.field_u, (int)param0, param9, 0, (int)param3, (int)param5, param6, var21);
                                  param5 = param5 + var18;
                                  param3 = param3 + var17;
                                  param6 = param6 + var22;
                                  param0 = param0 + (float)this.field_t;
                                  continue L14;
                                }
                              }
                            } else {
                              this.a(this.field_a, this.field_u, (int)param0, param9, 0, (int)param3, (int)param4, param6, var21);
                              param4 = param4 + var19;
                              param3 = param3 + var17;
                              param6 = param6 + var22;
                              param0 = param0 + (float)this.field_t;
                              continue L13;
                            }
                          }
                        }
                      } else {
                        param1 = param1 - param2;
                        param2 = param2 - param0;
                        param0 = (float)this.field_p[(int)param0];
                        L15: while (true) {
                          param2 = param2 - 1.0f;
                          if (param2 < 0.0f) {
                            L16: while (true) {
                              param1 = param1 - 1.0f;
                              if (param1 < 0.0f) {
                                return;
                              } else {
                                this.a(this.field_a, this.field_u, (int)param0, param9, 0, (int)param3, (int)param5, param6, var21);
                                param5 = param5 + var18;
                                param3 = param3 + var17;
                                param6 = param6 + var22;
                                param0 = param0 + (float)this.field_t;
                                continue L16;
                              }
                            }
                          } else {
                            this.a(this.field_a, this.field_u, (int)param0, param9, 0, (int)param3, (int)param4, param6, var21);
                            param4 = param4 + var19;
                            param3 = param3 + var17;
                            param6 = param6 + var22;
                            param0 = param0 + (float)this.field_t;
                            continue L15;
                          }
                        }
                      }
                    } else {
                      L17: {
                        param5 = param3;
                        if (param0 >= 0.0f) {
                          break L17;
                        } else {
                          param5 = param5 - var19 * param0;
                          param3 = param3 - var17 * param0;
                          param6 = param6 - var22 * param0;
                          param0 = 0.0f;
                          break L17;
                        }
                      }
                      L18: {
                        if (param1 >= 0.0f) {
                          break L18;
                        } else {
                          param4 = param4 - var18 * param1;
                          param1 = 0.0f;
                          break L18;
                        }
                      }
                      L19: {
                        if (param0 == param1) {
                          break L19;
                        } else {
                          if (var19 >= var17) {
                            break L19;
                          } else {
                            param2 = param2 - param1;
                            param1 = param1 - param0;
                            param0 = (float)this.field_p[(int)param0];
                            L20: while (true) {
                              param1 = param1 - 1.0f;
                              if (param1 < 0.0f) {
                                L21: while (true) {
                                  param2 = param2 - 1.0f;
                                  if (param2 < 0.0f) {
                                    return;
                                  } else {
                                    this.a(this.field_a, this.field_u, (int)param0, param9, 0, (int)param5, (int)param4, param6, var21);
                                    param5 = param5 + var19;
                                    param4 = param4 + var18;
                                    param6 = param6 + var22;
                                    param0 = param0 + (float)this.field_t;
                                    continue L21;
                                  }
                                }
                              } else {
                                this.a(this.field_a, this.field_u, (int)param0, param9, 0, (int)param5, (int)param3, param6, var21);
                                param5 = param5 + var19;
                                param3 = param3 + var17;
                                param6 = param6 + var22;
                                param0 = param0 + (float)this.field_t;
                                continue L20;
                              }
                            }
                          }
                        }
                      }
                      if (param0 == param1) {
                        if (var19 > var18) {
                          param2 = param2 - param1;
                          param1 = param1 - param0;
                          param0 = (float)this.field_p[(int)param0];
                          L22: while (true) {
                            param1 = param1 - 1.0f;
                            if (param1 < 0.0f) {
                              L23: while (true) {
                                param2 = param2 - 1.0f;
                                if (param2 < 0.0f) {
                                  return;
                                } else {
                                  this.a(this.field_a, this.field_u, (int)param0, param9, 0, (int)param5, (int)param4, param6, var21);
                                  param5 = param5 + var19;
                                  param4 = param4 + var18;
                                  param6 = param6 + var22;
                                  param0 = param0 + (float)this.field_t;
                                  continue L23;
                                }
                              }
                            } else {
                              this.a(this.field_a, this.field_u, (int)param0, param9, 0, (int)param5, (int)param3, param6, var21);
                              param5 = param5 + var19;
                              param3 = param3 + var17;
                              param6 = param6 + var22;
                              param0 = param0 + (float)this.field_t;
                              continue L22;
                            }
                          }
                        } else {
                          param2 = param2 - param1;
                          param1 = param1 - param0;
                          param0 = (float)this.field_p[(int)param0];
                          L24: while (true) {
                            param1 = param1 - 1.0f;
                            if (param1 < 0.0f) {
                              L25: while (true) {
                                param2 = param2 - 1.0f;
                                if (param2 < 0.0f) {
                                  return;
                                } else {
                                  this.a(this.field_a, this.field_u, (int)param0, param9, 0, (int)param4, (int)param5, param6, var21);
                                  param5 = param5 + var19;
                                  param4 = param4 + var18;
                                  param6 = param6 + var22;
                                  param0 = param0 + (float)this.field_t;
                                  continue L25;
                                }
                              }
                            } else {
                              this.a(this.field_a, this.field_u, (int)param0, param9, 0, (int)param3, (int)param5, param6, var21);
                              param5 = param5 + var19;
                              param3 = param3 + var17;
                              param6 = param6 + var22;
                              param0 = param0 + (float)this.field_t;
                              continue L24;
                            }
                          }
                        }
                      } else {
                        param2 = param2 - param1;
                        param1 = param1 - param0;
                        param0 = (float)this.field_p[(int)param0];
                        L26: while (true) {
                          param1 = param1 - 1.0f;
                          if (param1 < 0.0f) {
                            L27: while (true) {
                              param2 = param2 - 1.0f;
                              if (param2 < 0.0f) {
                                return;
                              } else {
                                this.a(this.field_a, this.field_u, (int)param0, param9, 0, (int)param4, (int)param5, param6, var21);
                                param5 = param5 + var19;
                                param4 = param4 + var18;
                                param6 = param6 + var22;
                                param0 = param0 + (float)this.field_t;
                                continue L27;
                              }
                            }
                          } else {
                            this.a(this.field_a, this.field_u, (int)param0, param9, 0, (int)param3, (int)param5, param6, var21);
                            param5 = param5 + var19;
                            param3 = param3 + var17;
                            param6 = param6 + var22;
                            param0 = param0 + (float)this.field_t;
                            continue L26;
                          }
                        }
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            if (param1 > param2) {
              if (param2 < (float)this.field_v) {
                L28: {
                  if (param0 <= (float)this.field_v) {
                    break L28;
                  } else {
                    param0 = (float)this.field_v;
                    break L28;
                  }
                }
                L29: {
                  if (param1 <= (float)this.field_v) {
                    break L29;
                  } else {
                    param1 = (float)this.field_v;
                    break L29;
                  }
                }
                param8 = param8 - var21 * param5 + var21;
                if (param0 >= param1) {
                  L30: {
                    param3 = param5;
                    if (param2 >= 0.0f) {
                      break L30;
                    } else {
                      param3 = param3 - var18 * param2;
                      param5 = param5 - var19 * param2;
                      param8 = param8 - var22 * param2;
                      param2 = 0.0f;
                      break L30;
                    }
                  }
                  L31: {
                    if (param1 >= 0.0f) {
                      break L31;
                    } else {
                      param4 = param4 - var17 * param1;
                      param1 = 0.0f;
                      break L31;
                    }
                  }
                  if (var18 < var19) {
                    param0 = param0 - param1;
                    param1 = param1 - param2;
                    param2 = (float)this.field_p[(int)param2];
                    L32: while (true) {
                      param1 = param1 - 1.0f;
                      if (param1 < 0.0f) {
                        L33: while (true) {
                          param0 = param0 - 1.0f;
                          if (param0 < 0.0f) {
                            return;
                          } else {
                            this.a(this.field_a, this.field_u, (int)param2, param9, 0, (int)param4, (int)param5, param8, var21);
                            param4 = param4 + var17;
                            param5 = param5 + var19;
                            param8 = param8 + var22;
                            param2 = param2 + (float)this.field_t;
                            continue L33;
                          }
                        }
                      } else {
                        this.a(this.field_a, this.field_u, (int)param2, param9, 0, (int)param3, (int)param5, param8, var21);
                        param3 = param3 + var18;
                        param5 = param5 + var19;
                        param8 = param8 + var22;
                        param2 = param2 + (float)this.field_t;
                        continue L32;
                      }
                    }
                  } else {
                    param0 = param0 - param1;
                    param1 = param1 - param2;
                    param2 = (float)this.field_p[(int)param2];
                    L34: while (true) {
                      param1 = param1 - 1.0f;
                      if (param1 < 0.0f) {
                        L35: while (true) {
                          param0 = param0 - 1.0f;
                          if (param0 < 0.0f) {
                            return;
                          } else {
                            this.a(this.field_a, this.field_u, (int)param2, param9, 0, (int)param5, (int)param4, param8, var21);
                            param4 = param4 + var17;
                            param5 = param5 + var19;
                            param8 = param8 + var22;
                            param2 = param2 + (float)this.field_t;
                            continue L35;
                          }
                        }
                      } else {
                        this.a(this.field_a, this.field_u, (int)param2, param9, 0, (int)param5, (int)param3, param8, var21);
                        param3 = param3 + var18;
                        param5 = param5 + var19;
                        param8 = param8 + var22;
                        param2 = param2 + (float)this.field_t;
                        continue L34;
                      }
                    }
                  }
                } else {
                  L36: {
                    param4 = param5;
                    if (param2 >= 0.0f) {
                      break L36;
                    } else {
                      param4 = param4 - var18 * param2;
                      param5 = param5 - var19 * param2;
                      param8 = param8 - var22 * param2;
                      param2 = 0.0f;
                      break L36;
                    }
                  }
                  L37: {
                    if (param0 >= 0.0f) {
                      break L37;
                    } else {
                      param3 = param3 - var17 * param0;
                      param0 = 0.0f;
                      break L37;
                    }
                  }
                  if (var18 < var19) {
                    param1 = param1 - param0;
                    param0 = param0 - param2;
                    param2 = (float)this.field_p[(int)param2];
                    L38: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        L39: while (true) {
                          param1 = param1 - 1.0f;
                          if (param1 < 0.0f) {
                            return;
                          } else {
                            this.a(this.field_a, this.field_u, (int)param2, param9, 0, (int)param4, (int)param3, param8, var21);
                            param4 = param4 + var18;
                            param3 = param3 + var17;
                            param8 = param8 + var22;
                            param2 = param2 + (float)this.field_t;
                            continue L39;
                          }
                        }
                      } else {
                        this.a(this.field_a, this.field_u, (int)param2, param9, 0, (int)param4, (int)param5, param8, var21);
                        param4 = param4 + var18;
                        param5 = param5 + var19;
                        param8 = param8 + var22;
                        param2 = param2 + (float)this.field_t;
                        continue L38;
                      }
                    }
                  } else {
                    param1 = param1 - param0;
                    param0 = param0 - param2;
                    param2 = (float)this.field_p[(int)param2];
                    L40: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        L41: while (true) {
                          param1 = param1 - 1.0f;
                          if (param1 < 0.0f) {
                            return;
                          } else {
                            this.a(this.field_a, this.field_u, (int)param2, param9, 0, (int)param3, (int)param4, param8, var21);
                            param4 = param4 + var18;
                            param3 = param3 + var17;
                            param8 = param8 + var22;
                            param2 = param2 + (float)this.field_t;
                            continue L41;
                          }
                        }
                      } else {
                        this.a(this.field_a, this.field_u, (int)param2, param9, 0, (int)param5, (int)param4, param8, var21);
                        param4 = param4 + var18;
                        param5 = param5 + var19;
                        param8 = param8 + var22;
                        param2 = param2 + (float)this.field_t;
                        continue L40;
                      }
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              if (param1 < (float)this.field_v) {
                L42: {
                  if (param2 <= (float)this.field_v) {
                    break L42;
                  } else {
                    param2 = (float)this.field_v;
                    break L42;
                  }
                }
                L43: {
                  if (param0 <= (float)this.field_v) {
                    break L43;
                  } else {
                    param0 = (float)this.field_v;
                    break L43;
                  }
                }
                param7 = param7 - var21 * param4 + var21;
                if (param2 >= param0) {
                  L44: {
                    param5 = param4;
                    if (param1 >= 0.0f) {
                      break L44;
                    } else {
                      param5 = param5 - var17 * param1;
                      param4 = param4 - var18 * param1;
                      param7 = param7 - var22 * param1;
                      param1 = 0.0f;
                      break L44;
                    }
                  }
                  L45: {
                    if (param0 >= 0.0f) {
                      break L45;
                    } else {
                      param3 = param3 - var19 * param0;
                      param0 = 0.0f;
                      break L45;
                    }
                  }
                  if (var17 < var18) {
                    param2 = param2 - param0;
                    param0 = param0 - param1;
                    param1 = (float)this.field_p[(int)param1];
                    L46: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        L47: while (true) {
                          param2 = param2 - 1.0f;
                          if (param2 < 0.0f) {
                            return;
                          } else {
                            this.a(this.field_a, this.field_u, (int)param1, param9, 0, (int)param3, (int)param4, param7, var21);
                            param3 = param3 + var19;
                            param4 = param4 + var18;
                            param7 = param7 + var22;
                            param1 = param1 + (float)this.field_t;
                            continue L47;
                          }
                        }
                      } else {
                        this.a(this.field_a, this.field_u, (int)param1, param9, 0, (int)param5, (int)param4, param7, var21);
                        param5 = param5 + var17;
                        param4 = param4 + var18;
                        param7 = param7 + var22;
                        param1 = param1 + (float)this.field_t;
                        continue L46;
                      }
                    }
                  } else {
                    param2 = param2 - param0;
                    param0 = param0 - param1;
                    param1 = (float)this.field_p[(int)param1];
                    L48: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        L49: while (true) {
                          param2 = param2 - 1.0f;
                          if (param2 < 0.0f) {
                            return;
                          } else {
                            this.a(this.field_a, this.field_u, (int)param1, param9, 0, (int)param4, (int)param3, param7, var21);
                            param3 = param3 + var19;
                            param4 = param4 + var18;
                            param7 = param7 + var22;
                            param1 = param1 + (float)this.field_t;
                            continue L49;
                          }
                        }
                      } else {
                        this.a(this.field_a, this.field_u, (int)param1, param9, 0, (int)param4, (int)param5, param7, var21);
                        param5 = param5 + var17;
                        param4 = param4 + var18;
                        param7 = param7 + var22;
                        param1 = param1 + (float)this.field_t;
                        continue L48;
                      }
                    }
                  }
                } else {
                  L50: {
                    param3 = param4;
                    if (param1 >= 0.0f) {
                      break L50;
                    } else {
                      param3 = param3 - var17 * param1;
                      param4 = param4 - var18 * param1;
                      param7 = param7 - var22 * param1;
                      param1 = 0.0f;
                      break L50;
                    }
                  }
                  L51: {
                    if (param2 >= 0.0f) {
                      break L51;
                    } else {
                      param5 = param5 - var19 * param2;
                      param2 = 0.0f;
                      break L51;
                    }
                  }
                  L52: {
                    if (param1 == param2) {
                      break L52;
                    } else {
                      if (var17 >= var18) {
                        break L52;
                      } else {
                        param0 = param0 - param2;
                        param2 = param2 - param1;
                        param1 = (float)this.field_p[(int)param1];
                        L53: while (true) {
                          param2 = param2 - 1.0f;
                          if (param2 < 0.0f) {
                            L54: while (true) {
                              param0 = param0 - 1.0f;
                              if (param0 < 0.0f) {
                                return;
                              } else {
                                this.a(this.field_a, this.field_u, (int)param1, param9, 0, (int)param3, (int)param5, param7, var21);
                                param3 = param3 + var17;
                                param5 = param5 + var19;
                                param7 = param7 + var22;
                                param1 = param1 + (float)this.field_t;
                                continue L54;
                              }
                            }
                          } else {
                            this.a(this.field_a, this.field_u, (int)param1, param9, 0, (int)param3, (int)param4, param7, var21);
                            param3 = param3 + var17;
                            param4 = param4 + var18;
                            param7 = param7 + var22;
                            param1 = param1 + (float)this.field_t;
                            continue L53;
                          }
                        }
                      }
                    }
                  }
                  if (param1 == param2) {
                    if (var17 > var19) {
                      param0 = param0 - param2;
                      param2 = param2 - param1;
                      param1 = (float)this.field_p[(int)param1];
                      L55: while (true) {
                        param2 = param2 - 1.0f;
                        if (param2 < 0.0f) {
                          L56: while (true) {
                            param0 = param0 - 1.0f;
                            if (param0 < 0.0f) {
                              return;
                            } else {
                              this.a(this.field_a, this.field_u, (int)param1, param9, 0, (int)param3, (int)param5, param7, var21);
                              param3 = param3 + var17;
                              param5 = param5 + var19;
                              param7 = param7 + var22;
                              param1 = param1 + (float)this.field_t;
                              continue L56;
                            }
                          }
                        } else {
                          this.a(this.field_a, this.field_u, (int)param1, param9, 0, (int)param3, (int)param4, param7, var21);
                          param3 = param3 + var17;
                          param4 = param4 + var18;
                          param7 = param7 + var22;
                          param1 = param1 + (float)this.field_t;
                          continue L55;
                        }
                      }
                    } else {
                      param0 = param0 - param2;
                      param2 = param2 - param1;
                      param1 = (float)this.field_p[(int)param1];
                      L57: while (true) {
                        param2 = param2 - 1.0f;
                        if (param2 < 0.0f) {
                          L58: while (true) {
                            param0 = param0 - 1.0f;
                            if (param0 < 0.0f) {
                              return;
                            } else {
                              this.a(this.field_a, this.field_u, (int)param1, param9, 0, (int)param5, (int)param3, param7, var21);
                              param3 = param3 + var17;
                              param5 = param5 + var19;
                              param7 = param7 + var22;
                              param1 = param1 + (float)this.field_t;
                              continue L58;
                            }
                          }
                        } else {
                          this.a(this.field_a, this.field_u, (int)param1, param9, 0, (int)param4, (int)param3, param7, var21);
                          param3 = param3 + var17;
                          param4 = param4 + var18;
                          param7 = param7 + var22;
                          param1 = param1 + (float)this.field_t;
                          continue L57;
                        }
                      }
                    }
                  } else {
                    param0 = param0 - param2;
                    param2 = param2 - param1;
                    param1 = (float)this.field_p[(int)param1];
                    L59: while (true) {
                      param2 = param2 - 1.0f;
                      if (param2 < 0.0f) {
                        L60: while (true) {
                          param0 = param0 - 1.0f;
                          if (param0 < 0.0f) {
                            return;
                          } else {
                            this.a(this.field_a, this.field_u, (int)param1, param9, 0, (int)param5, (int)param3, param7, var21);
                            param3 = param3 + var17;
                            param5 = param5 + var19;
                            param7 = param7 + var22;
                            param1 = param1 + (float)this.field_t;
                            continue L60;
                          }
                        }
                      } else {
                        this.a(this.field_a, this.field_u, (int)param1, param9, 0, (int)param4, (int)param3, param7, var21);
                        param3 = param3 + var17;
                        param4 = param4 + var18;
                        param7 = param7 + var22;
                        param1 = param1 + (float)this.field_t;
                        continue L59;
                      }
                    }
                  }
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } else {
          this.field_k.b((int)param0, param9, (int)param3, (int)param1, 1, (int)param4);
          this.field_k.b((int)param1, param9, (int)param4, (int)param2, 1, (int)param5);
          this.field_k.b((int)param2, param9, (int)param5, (int)param0, 1, (int)param3);
          return;
        }
    }

    final void b(float param0, float param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8, float param9, float param10, float param11, float param12, float param13, float param14, int param15, int param16, int param17, int param18, int param19, int param20, int param21, int param22) {
        float var24;
        float var25;
        float var26;
        float var27;
        float var28;
        float var29;
        float var30;
        float var31;
        float var32;
        float var33;
        float var34;
        float var35;
        float var36;
        float var37;
        float var38;
        float var39;
        float var40;
        float var41;
        float var42;
        float var43;
        float var44;
        float var45;
        float var46;
        float var47;
        float var48;
        float var49;
        float var50;
        float var51;
        float var52;
        float var53;
        float var54;
        float var55;
        float var56;
        float var57;
        float var58;
        float var59;
        float var60;
        float var61;
        float var62;
        float var63;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        L0: {
          if (param22 == this.field_c) {
            break L0;
          } else {
            this.field_w = this.field_k.h(param22);
            if (this.field_w != null) {
              L1: {
                stackIn_5_0 = this;

                if (!this.field_k.j(param22)) {
                  stackIn_6_0 = this;
                  stackIn_6_1 = this.field_k.field_I;
                  break L1;
                } else {
                  stackIn_6_0 = this;
                  stackIn_6_1 = 64;
                  break L1;
                }
              }
              ((iua) (this)).field_i = stackIn_6_1;
              this.field_r = this.field_i - 1;
              this.field_f = this.field_k.f(param22);
              this.field_d = this.field_k.d(param22);
              break L0;
            } else {
              this.b((float)(int)param0, (float)(int)param1, (float)(int)param2, (float)(int)param3, (float)(int)param4, (float)(int)param5, (float)(int)param6, (float)(int)param7, (float)(int)param8, l.a(param18 | param19 << 24, param15, 20048), l.a(param18 | param20 << 24, param16, 20048), l.a(param18 | param21 << 24, param17, 20048));
              return;
            }
          }
        }
        L2: {
          this.field_l = param18;
          var24 = (float)(param15 >> 24 & 255);
          var25 = (float)(param16 >> 24 & 255);
          var26 = (float)(param17 >> 24 & 255);
          var27 = (float)(param15 >> 16 & 255);
          var28 = (float)(param16 >> 16 & 255);
          var29 = (float)(param17 >> 16 & 255);
          var30 = (float)(param15 >> 8 & 255);
          var31 = (float)(param16 >> 8 & 255);
          var32 = (float)(param17 >> 8 & 255);
          var33 = (float)(param15 & 255);
          var34 = (float)(param16 & 255);
          var35 = (float)(param17 & 255);
          param9 = param9 / param6;
          param10 = param10 / param7;
          param11 = param11 / param8;
          param12 = param12 / param6;
          param13 = param13 / param7;
          param14 = param14 / param8;
          param6 = 1.0f / param6;
          param7 = 1.0f / param7;
          param8 = 1.0f / param8;
          var36 = 0.0f;
          var37 = 0.0f;
          var38 = 0.0f;
          var39 = 0.0f;
          var40 = 0.0f;
          var41 = 0.0f;
          var42 = 0.0f;
          var43 = 0.0f;
          var44 = 0.0f;
          if (param1 == param0) {
            break L2;
          } else {
            var45 = param1 - param0;
            var36 = (param4 - param3) / var45;
            var37 = (param7 - param6) / var45;
            var38 = (param10 - param9) / var45;
            var39 = (param13 - param12) / var45;
            var40 = (float)(param20 - param19) / var45;
            var41 = (var25 - var24) / var45;
            var42 = (var28 - var27) / var45;
            var43 = (var31 - var30) / var45;
            var44 = (var34 - var33) / var45;
            break L2;
          }
        }
        L3: {
          var45 = 0.0f;
          var46 = 0.0f;
          var47 = 0.0f;
          var48 = 0.0f;
          var49 = 0.0f;
          var50 = 0.0f;
          var51 = 0.0f;
          var52 = 0.0f;
          var53 = 0.0f;
          if (param2 == param1) {
            break L3;
          } else {
            var54 = param2 - param1;
            var45 = (param5 - param4) / var54;
            var46 = (param8 - param7) / var54;
            var47 = (param11 - param10) / var54;
            var48 = (param14 - param13) / var54;
            var49 = (float)(param21 - param20) / var54;
            var50 = (var26 - var25) / var54;
            var51 = (var29 - var28) / var54;
            var52 = (var32 - var31) / var54;
            var53 = (var35 - var34) / var54;
            break L3;
          }
        }
        L4: {
          var54 = 0.0f;
          var55 = 0.0f;
          var56 = 0.0f;
          var57 = 0.0f;
          var58 = 0.0f;
          var59 = 0.0f;
          var60 = 0.0f;
          var61 = 0.0f;
          var62 = 0.0f;
          if (param0 == param2) {
            break L4;
          } else {
            var63 = param0 - param2;
            var54 = (param3 - param5) / var63;
            var55 = (param6 - param8) / var63;
            var56 = (param9 - param11) / var63;
            var57 = (param12 - param14) / var63;
            var58 = (float)(param19 - param21) / var63;
            var59 = (var24 - var26) / var63;
            var60 = (var27 - var29) / var63;
            var61 = (var30 - var32) / var63;
            var62 = (var33 - var35) / var63;
            break L4;
          }
        }
        L5: {
          if (param0 > param1) {
            break L5;
          } else {
            if (param0 > param2) {
              break L5;
            } else {
              if (param0 < (float)this.field_v) {
                L6: {
                  if (param1 <= (float)this.field_v) {
                    break L6;
                  } else {
                    param1 = (float)this.field_v;
                    break L6;
                  }
                }
                L7: {
                  if (param2 <= (float)this.field_v) {
                    break L7;
                  } else {
                    param2 = (float)this.field_v;
                    break L7;
                  }
                }
                if (param1 >= param2) {
                  L8: {
                    param4 = param3;
                    param7 = param6;
                    param10 = param9;
                    param13 = param12;
                    param20 = param19;
                    var25 = var24;
                    var28 = var27;
                    var31 = var30;
                    var34 = var33;
                    if (param0 >= 0.0f) {
                      break L8;
                    } else {
                      param3 = param3 - var36 * param0;
                      param4 = param4 - var54 * param0;
                      param6 = param6 - var37 * param0;
                      param7 = param7 - var55 * param0;
                      param9 = param9 - var38 * param0;
                      param10 = param10 - var56 * param0;
                      param12 = param12 - var39 * param0;
                      param13 = param13 - var57 * param0;
                      param19 = (int)((float)param19 - var40 * param0);
                      param20 = (int)((float)param20 - var58 * param0);
                      var24 = var24 - var41 * param0;
                      var25 = var25 - var59 * param0;
                      var27 = var27 - var41 * param0;
                      var28 = var28 - var59 * param0;
                      var30 = var30 - var41 * param0;
                      var31 = var31 - var59 * param0;
                      var33 = var33 - var41 * param0;
                      var34 = var34 - var59 * param0;
                      param0 = 0.0f;
                      break L8;
                    }
                  }
                  L9: {
                    if (param2 >= 0.0f) {
                      break L9;
                    } else {
                      param5 = param5 - var45 * param2;
                      param8 = param8 - var46 * param2;
                      param11 = param11 - var47 * param2;
                      param14 = param14 - var48 * param2;
                      param21 = (int)((float)param21 - var49 * param2);
                      var26 = var26 - var50 * param2;
                      var29 = var29 - var51 * param2;
                      var32 = var32 - var52 * param2;
                      var35 = var35 - var53 * param2;
                      param2 = 0.0f;
                      break L9;
                    }
                  }
                  L10: {
                    L11: {
                      if (param0 == param2) {
                        break L11;
                      } else {
                        if (var54 < var36) {
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                    L12: {
                      if (param0 != param2) {
                        break L12;
                      } else {
                        if (var45 <= var36) {
                          break L12;
                        } else {
                          break L10;
                        }
                      }
                    }
                    param1 = param1 - param2;
                    param2 = param2 - param0;
                    param0 = (float)this.field_p[(int)param0];
                    L13: while (true) {
                      param2 = param2 - 1.0f;
                      if (param2 < 0.0f) {
                        L14: while (true) {
                          param1 = param1 - 1.0f;
                          if (param1 < 0.0f) {
                            return;
                          } else {
                            this.a(this.field_a, this.field_w, (int)param0, (int)param3, (int)param5, param6, param8, param9, param11, param12, param14, (float)param19, (float)param21, var24, var26, var27, var29, var30, var32, var33, var35);
                            param3 = param3 + var36;
                            param5 = param5 + var45;
                            param6 = param6 + var37;
                            param8 = param8 + var46;
                            param9 = param9 + var38;
                            param11 = param11 + var47;
                            param12 = param12 + var39;
                            param14 = param14 + var48;
                            param19 = (int)((float)param19 + var40);
                            param21 = (int)((float)param21 + var49);
                            var24 = var24 + var41;
                            var26 = var26 + var50;
                            var27 = var27 + var42;
                            var29 = var29 + var51;
                            var30 = var30 + var43;
                            var32 = var32 + var52;
                            var33 = var33 + var44;
                            var35 = var35 + var53;
                            param0 = param0 + (float)this.field_t;
                            continue L14;
                          }
                        }
                      } else {
                        this.a(this.field_a, this.field_w, (int)param0, (int)param3, (int)param4, param6, param7, param9, param10, param12, param13, (float)param19, (float)param20, var24, var25, var27, var28, var30, var31, var33, var34);
                        param4 = param4 + var54;
                        param3 = param3 + var36;
                        param7 = param7 + var55;
                        param6 = param6 + var37;
                        param10 = param10 + var56;
                        param9 = param9 + var38;
                        param13 = param13 + var57;
                        param12 = param12 + var39;
                        param20 = (int)((float)param20 + var58);
                        param19 = (int)((float)param19 + var40);
                        var25 = var25 + var59;
                        var24 = var24 + var41;
                        var28 = var28 + var60;
                        var27 = var27 + var42;
                        var31 = var31 + var61;
                        var30 = var30 + var43;
                        var34 = var34 + var62;
                        var33 = var33 + var44;
                        param0 = param0 + (float)this.field_t;
                        continue L13;
                      }
                    }
                  }
                  param1 = param1 - param2;
                  param2 = param2 - param0;
                  param0 = (float)this.field_p[(int)param0];
                  L15: while (true) {
                    param2 = param2 - 1.0f;
                    if (param2 < 0.0f) {
                      L16: while (true) {
                        param1 = param1 - 1.0f;
                        if (param1 < 0.0f) {
                          return;
                        } else {
                          this.a(this.field_a, this.field_w, (int)param0, (int)param5, (int)param3, param8, param6, param11, param9, param14, param12, (float)param21, (float)param19, var26, var24, var29, var27, var32, var30, var35, var33);
                          param5 = param5 + var45;
                          param3 = param3 + var36;
                          param8 = param8 + var46;
                          param6 = param6 + var37;
                          param11 = param11 + var47;
                          param9 = param9 + var38;
                          param14 = param14 + var48;
                          param12 = param12 + var39;
                          param21 = (int)((float)param21 + var49);
                          param19 = (int)((float)param19 + var40);
                          var26 = var26 + var50;
                          var24 = var24 + var41;
                          var29 = var29 + var51;
                          var27 = var27 + var42;
                          var32 = var32 + var52;
                          var30 = var30 + var43;
                          var35 = var35 + var53;
                          var33 = var33 + var44;
                          param0 = param0 + (float)this.field_t;
                          continue L16;
                        }
                      }
                    } else {
                      this.a(this.field_a, this.field_w, (int)param0, (int)param4, (int)param3, param7, param6, param10, param9, param13, param12, (float)param20, (float)param19, var25, var24, var28, var27, var31, var30, var34, var33);
                      param3 = param3 + var36;
                      param4 = param4 + var54;
                      param6 = param6 + var37;
                      param7 = param7 + var55;
                      param9 = param9 + var38;
                      param10 = param10 + var56;
                      param12 = param12 + var39;
                      param13 = param13 + var57;
                      param19 = (int)((float)param19 + var40);
                      param20 = (int)((float)param20 + var58);
                      var24 = var24 + var41;
                      var25 = var25 + var59;
                      var27 = var27 + var42;
                      var28 = var28 + var60;
                      var30 = var30 + var43;
                      var31 = var31 + var61;
                      var33 = var33 + var44;
                      var34 = var34 + var62;
                      param0 = param0 + (float)this.field_t;
                      continue L15;
                    }
                  }
                } else {
                  L17: {
                    param5 = param3;
                    param8 = param6;
                    param11 = param9;
                    param14 = param12;
                    param21 = param19;
                    var26 = var24;
                    var29 = var27;
                    var32 = var30;
                    var35 = var33;
                    if (param0 >= 0.0f) {
                      break L17;
                    } else {
                      param3 = param3 - var36 * param0;
                      param5 = param5 - var54 * param0;
                      param6 = param6 - var37 * param0;
                      param8 = param8 - var55 * param0;
                      param9 = param9 - var38 * param0;
                      param11 = param11 - var56 * param0;
                      param12 = param12 - var39 * param0;
                      param14 = param14 - var57 * param0;
                      param19 = (int)((float)param19 - var40 * param0);
                      param21 = (int)((float)param21 - var58 * param0);
                      var24 = var24 - var41 * param0;
                      var26 = var26 - var59 * param0;
                      var27 = var27 - var41 * param0;
                      var29 = var29 - var59 * param0;
                      var30 = var30 - var41 * param0;
                      var32 = var32 - var59 * param0;
                      var33 = var33 - var41 * param0;
                      var35 = var35 - var59 * param0;
                      param0 = 0.0f;
                      break L17;
                    }
                  }
                  L18: {
                    if (param1 >= 0.0f) {
                      break L18;
                    } else {
                      param4 = param4 - var45 * param1;
                      param7 = param7 - var46 * param1;
                      param10 = param10 - var47 * param1;
                      param13 = param13 - var48 * param1;
                      param20 = (int)((float)param20 - var49 * param1);
                      var25 = var25 - var50 * param1;
                      var28 = var28 - var51 * param1;
                      var31 = var31 - var52 * param1;
                      var34 = var34 - var53 * param1;
                      param1 = 0.0f;
                      break L18;
                    }
                  }
                  L19: {
                    L20: {
                      if (param0 == param1) {
                        break L20;
                      } else {
                        if (var54 < var36) {
                          break L19;
                        } else {
                          break L20;
                        }
                      }
                    }
                    L21: {
                      if (param0 != param1) {
                        break L21;
                      } else {
                        if (var54 <= var45) {
                          break L21;
                        } else {
                          break L19;
                        }
                      }
                    }
                    param2 = param2 - param1;
                    param1 = param1 - param0;
                    param0 = (float)this.field_p[(int)param0];
                    L22: while (true) {
                      param1 = param1 - 1.0f;
                      if (param1 < 0.0f) {
                        L23: while (true) {
                          param2 = param2 - 1.0f;
                          if (param2 < 0.0f) {
                            return;
                          } else {
                            this.a(this.field_a, this.field_w, (int)param0, (int)param4, (int)param5, param7, param8, param10, param11, param13, param14, (float)param20, (float)param21, var25, var26, var28, var29, var31, var32, var34, var35);
                            param4 = param4 + var45;
                            param5 = param5 + var54;
                            param7 = param7 + var46;
                            param8 = param8 + var55;
                            param10 = param10 + var47;
                            param11 = param11 + var56;
                            param13 = param13 + var48;
                            param14 = param14 + var57;
                            param20 = (int)((float)param20 + var49);
                            param21 = (int)((float)param21 + var58);
                            var25 = var25 + var50;
                            var26 = var26 + var59;
                            var28 = var28 + var51;
                            var29 = var29 + var60;
                            var31 = var31 + var52;
                            var32 = var32 + var61;
                            var34 = var34 + var53;
                            var35 = var35 + var62;
                            param0 = param0 + (float)this.field_t;
                            continue L23;
                          }
                        }
                      } else {
                        this.a(this.field_a, this.field_w, (int)param0, (int)param3, (int)param5, param6, param8, param9, param11, param12, param14, (float)param19, (float)param21, var24, var26, var27, var29, var30, var32, var33, var35);
                        param3 = param3 + var36;
                        param5 = param5 + var54;
                        param6 = param6 + var37;
                        param8 = param8 + var55;
                        param9 = param9 + var38;
                        param11 = param11 + var56;
                        param12 = param12 + var39;
                        param14 = param14 + var57;
                        param19 = (int)((float)param19 + var40);
                        param21 = (int)((float)param21 + var58);
                        var24 = var24 + var41;
                        var26 = var26 + var59;
                        var27 = var27 + var42;
                        var29 = var29 + var60;
                        var30 = var30 + var43;
                        var32 = var32 + var61;
                        var33 = var33 + var44;
                        var35 = var35 + var62;
                        param0 = param0 + (float)this.field_t;
                        continue L22;
                      }
                    }
                  }
                  param2 = param2 - param1;
                  param1 = param1 - param0;
                  param0 = (float)this.field_p[(int)param0];
                  L24: while (true) {
                    param1 = param1 - 1.0f;
                    if (param1 < 0.0f) {
                      L25: while (true) {
                        param2 = param2 - 1.0f;
                        if (param2 < 0.0f) {
                          return;
                        } else {
                          this.a(this.field_a, this.field_w, (int)param0, (int)param5, (int)param4, param8, param7, param11, param10, param14, param13, (float)param21, (float)param20, var26, var25, var29, var28, var32, var31, var35, var34);
                          param4 = param4 + var45;
                          param5 = param5 + var54;
                          param7 = param7 + var46;
                          param8 = param8 + var55;
                          param10 = param10 + var47;
                          param11 = param11 + var56;
                          param13 = param13 + var48;
                          param14 = param14 + var57;
                          param20 = (int)((float)param20 + var49);
                          param21 = (int)((float)param21 + var58);
                          var25 = var25 + var50;
                          var26 = var26 + var59;
                          var28 = var28 + var51;
                          var29 = var29 + var60;
                          var31 = var31 + var52;
                          var32 = var32 + var61;
                          var34 = var34 + var53;
                          var35 = var35 + var62;
                          param0 = param0 + (float)this.field_t;
                          continue L25;
                        }
                      }
                    } else {
                      this.a(this.field_a, this.field_w, (int)param0, (int)param5, (int)param3, param8, param6, param11, param9, param14, param12, (float)param21, (float)param19, var26, var24, var29, var27, var32, var30, var35, var33);
                      param3 = param3 + var36;
                      param5 = param5 + var54;
                      param6 = param6 + var37;
                      param8 = param8 + var55;
                      param9 = param9 + var38;
                      param11 = param11 + var56;
                      param12 = param12 + var39;
                      param14 = param14 + var57;
                      param19 = (int)((float)param19 + var40);
                      param21 = (int)((float)param21 + var58);
                      var24 = var24 + var41;
                      var26 = var26 + var59;
                      var27 = var27 + var42;
                      var29 = var29 + var60;
                      var30 = var30 + var43;
                      var32 = var32 + var61;
                      var33 = var33 + var44;
                      var35 = var35 + var62;
                      param0 = param0 + (float)this.field_t;
                      continue L24;
                    }
                  }
                }
              } else {
                return;
              }
            }
          }
        }
        if (param1 > param2) {
          if (param2 < (float)this.field_v) {
            L26: {
              if (param0 <= (float)this.field_v) {
                break L26;
              } else {
                param0 = (float)this.field_v;
                break L26;
              }
            }
            L27: {
              if (param1 <= (float)this.field_v) {
                break L27;
              } else {
                param1 = (float)this.field_v;
                break L27;
              }
            }
            if (param0 >= param1) {
              L28: {
                param3 = param5;
                param6 = param8;
                param9 = param11;
                param12 = param14;
                param19 = param21;
                var24 = var26;
                var27 = var29;
                var30 = var32;
                var33 = var35;
                if (param2 >= 0.0f) {
                  break L28;
                } else {
                  param5 = param5 - var54 * param2;
                  param3 = param3 - var45 * param2;
                  param8 = param8 - var55 * param2;
                  param6 = param6 - var46 * param2;
                  param11 = param11 - var56 * param2;
                  param9 = param9 - var47 * param2;
                  param14 = param14 - var57 * param2;
                  param12 = param12 - var48 * param2;
                  param21 = (int)((float)param21 - var58 * 3.0f);
                  param19 = (int)((float)param19 - var49 * param2);
                  var26 = var26 - var59 * param2;
                  var24 = var24 - var50 * param2;
                  var29 = var29 - var60 * param2;
                  var27 = var27 - var51 * param2;
                  var32 = var32 - var61 * param2;
                  var30 = var30 - var52 * param2;
                  var35 = var35 - var62 * param2;
                  var33 = var33 - var53 * param2;
                  param2 = 0.0f;
                  break L28;
                }
              }
              L29: {
                if (param1 >= 0.0f) {
                  break L29;
                } else {
                  param4 = param4 - var36 * param1;
                  param7 = param7 - var37 * param1;
                  param10 = param10 - var38 * param1;
                  param13 = param13 - var39 * param1;
                  param20 = (int)((float)param20 - var40 * param1);
                  var25 = var25 - var41 * param1;
                  var28 = var28 - var42 * param1;
                  var31 = var31 - var43 * param1;
                  var34 = var34 - var44 * param1;
                  param1 = 0.0f;
                  break L29;
                }
              }
              if (var45 >= var54) {
                param0 = param0 - param1;
                param1 = param1 - param2;
                param2 = (float)this.field_p[(int)param2];
                L30: while (true) {
                  param1 = param1 - 1.0f;
                  if (param1 < 0.0f) {
                    L31: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        return;
                      } else {
                        this.a(this.field_a, this.field_w, (int)param2, (int)param5, (int)param4, param8, param7, param11, param10, param14, param13, (float)param21, (float)param20, var26, var25, var29, var28, var32, var31, var35, var34);
                        param5 = param5 + var54;
                        param4 = param4 + var36;
                        param8 = param8 + var55;
                        param7 = param7 + var37;
                        param11 = param11 + var56;
                        param10 = param10 + var38;
                        param14 = param14 + var57;
                        param13 = param13 + var39;
                        param21 = (int)((float)param21 + var58);
                        param20 = (int)((float)param20 + var40);
                        var26 = var26 + var59;
                        var25 = var25 + var41;
                        var29 = var29 + var60;
                        var28 = var28 + var42;
                        var32 = var32 + var61;
                        var31 = var31 + var43;
                        var35 = var35 + var62;
                        var34 = var34 + var44;
                        param2 = param2 + (float)this.field_t;
                        continue L31;
                      }
                    }
                  } else {
                    this.a(this.field_a, this.field_w, (int)param2, (int)param5, (int)param3, param8, param6, param11, param9, param14, param12, (float)param21, (float)param19, var26, var24, var29, var27, var32, var30, var35, var33);
                    param5 = param5 + var54;
                    param3 = param3 + var45;
                    param8 = param8 + var55;
                    param6 = param6 + var46;
                    param11 = param11 + var56;
                    param9 = param9 + var47;
                    param14 = param14 + var57;
                    param12 = param12 + var48;
                    param21 = (int)((float)param21 + var58);
                    param19 = (int)((float)param19 + var49);
                    var26 = var26 + var59;
                    var24 = var24 + var50;
                    var29 = var29 + var60;
                    var27 = var27 + var51;
                    var32 = var32 + var61;
                    var30 = var30 + var52;
                    var35 = var35 + var62;
                    var33 = var33 + var53;
                    param2 = param2 + (float)this.field_t;
                    continue L30;
                  }
                }
              } else {
                param0 = param0 - param1;
                param1 = param1 - param2;
                param2 = (float)this.field_p[(int)param2];
                L32: while (true) {
                  param1 = param1 - 1.0f;
                  if (param1 < 0.0f) {
                    L33: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        return;
                      } else {
                        this.a(this.field_a, this.field_w, (int)param2, (int)param4, (int)param5, param7, param8, param10, param11, param13, param14, (float)param20, (float)param21, var25, var26, var28, var29, var31, var32, var34, var35);
                        param4 = param4 + var36;
                        param5 = param5 + var54;
                        param7 = param7 + var37;
                        param8 = param8 + var55;
                        param10 = param10 + var38;
                        param11 = param11 + var56;
                        param13 = param13 + var39;
                        param14 = param14 + var57;
                        param20 = (int)((float)param20 + var40);
                        param21 = (int)((float)param21 + var58);
                        var25 = var25 + var41;
                        var26 = var26 + var59;
                        var28 = var28 + var42;
                        var29 = var29 + var60;
                        var31 = var31 + var43;
                        var32 = var32 + var61;
                        var34 = var34 + var44;
                        var35 = var35 + var62;
                        param2 = param2 + (float)this.field_t;
                        continue L33;
                      }
                    }
                  } else {
                    this.a(this.field_a, this.field_w, (int)param2, (int)param3, (int)param5, param6, param8, param9, param11, param12, param14, (float)param19, (float)param21, var24, var26, var27, var29, var30, var32, var33, var35);
                    param3 = param3 + var45;
                    param5 = param5 + var54;
                    param6 = param6 + var46;
                    param8 = param8 + var55;
                    param9 = param9 + var47;
                    param11 = param11 + var56;
                    param12 = param12 + var48;
                    param14 = param14 + var57;
                    param19 = (int)((float)param19 + var49);
                    param21 = (int)((float)param21 + var58);
                    var24 = var24 + var50;
                    var26 = var26 + var59;
                    var27 = var27 + var51;
                    var29 = var29 + var60;
                    var30 = var30 + var52;
                    var32 = var32 + var61;
                    var33 = var33 + var53;
                    var35 = var35 + var62;
                    param2 = param2 + (float)this.field_t;
                    continue L32;
                  }
                }
              }
            } else {
              L34: {
                param4 = param5;
                param7 = param8;
                param10 = param11;
                param13 = param14;
                param20 = param21;
                var25 = var26;
                var28 = var29;
                var31 = var32;
                var34 = var35;
                if (param2 >= 0.0f) {
                  break L34;
                } else {
                  param5 = param5 - var54 * param2;
                  param4 = param4 - var45 * param2;
                  param8 = param8 - var55 * param2;
                  param7 = param7 - var46 * param2;
                  param11 = param11 - var56 * param2;
                  param10 = param10 - var47 * param2;
                  param14 = param14 - var57 * param2;
                  param13 = param13 - var48 * param2;
                  param21 = (int)((float)param21 - var58 * 3.0f);
                  param20 = (int)((float)param20 - var49 * param2);
                  var26 = var26 - var59 * param2;
                  var25 = var25 - var50 * param2;
                  var29 = var29 - var60 * param2;
                  var28 = var28 - var51 * param2;
                  var32 = var32 - var61 * param2;
                  var31 = var31 - var52 * param2;
                  var35 = var35 - var62 * param2;
                  var34 = var34 - var53 * param2;
                  param2 = 0.0f;
                  break L34;
                }
              }
              L35: {
                if (param0 >= 0.0f) {
                  break L35;
                } else {
                  param3 = param3 - var36 * param0;
                  param6 = param6 - var37 * param0;
                  param9 = param9 - var38 * param0;
                  param12 = param12 - var39 * param0;
                  param19 = (int)((float)param19 - var40 * param0);
                  var24 = var24 - var41 * param0;
                  var27 = var27 - var42 * param0;
                  var30 = var30 - var43 * param0;
                  var33 = var33 - var44 * param0;
                  param0 = 0.0f;
                  break L35;
                }
              }
              if (var45 >= var54) {
                param1 = param1 - param0;
                param0 = param0 - param2;
                param2 = (float)this.field_p[(int)param2];
                L36: while (true) {
                  param0 = param0 - 1.0f;
                  if (param0 < 0.0f) {
                    L37: while (true) {
                      param1 = param1 - 1.0f;
                      if (param1 < 0.0f) {
                        return;
                      } else {
                        this.a(this.field_a, this.field_w, (int)param2, (int)param3, (int)param4, param6, param7, param9, param10, param12, param13, (float)param19, (float)param20, var24, var25, var27, var28, var30, var31, var33, var34);
                        param3 = param3 + var36;
                        param4 = param4 + var45;
                        param6 = param6 + var37;
                        param7 = param7 + var46;
                        param9 = param9 + var38;
                        param10 = param10 + var47;
                        param12 = param12 + var39;
                        param13 = param13 + var48;
                        param19 = (int)((float)param19 + var40);
                        param20 = (int)((float)param20 + var49);
                        var24 = var24 + var41;
                        var25 = var25 + var50;
                        var27 = var27 + var42;
                        var28 = var28 + var51;
                        var30 = var30 + var43;
                        var31 = var31 + var52;
                        var33 = var33 + var44;
                        var34 = var34 + var53;
                        param2 = param2 + (float)this.field_t;
                        continue L37;
                      }
                    }
                  } else {
                    this.a(this.field_a, this.field_w, (int)param2, (int)param5, (int)param4, param8, param7, param11, param10, param14, param13, (float)param21, (float)param20, var26, var25, var29, var28, var32, var31, var35, var34);
                    param5 = param5 + var54;
                    param4 = param4 + var45;
                    param8 = param8 + var55;
                    param7 = param7 + var46;
                    param11 = param11 + var56;
                    param10 = param10 + var47;
                    param14 = param14 + var57;
                    param13 = param13 + var48;
                    param21 = (int)((float)param21 + var58);
                    param20 = (int)((float)param20 + var49);
                    var26 = var26 + var59;
                    var25 = var25 + var50;
                    var29 = var29 + var60;
                    var28 = var28 + var51;
                    var32 = var32 + var61;
                    var31 = var31 + var52;
                    var35 = var35 + var62;
                    var34 = var34 + var53;
                    param2 = param2 + (float)this.field_t;
                    continue L36;
                  }
                }
              } else {
                param1 = param1 - param0;
                param0 = param0 - param2;
                param2 = (float)this.field_p[(int)param2];
                L38: while (true) {
                  param0 = param0 - 1.0f;
                  if (param0 < 0.0f) {
                    L39: while (true) {
                      param1 = param1 - 1.0f;
                      if (param1 < 0.0f) {
                        return;
                      } else {
                        this.a(this.field_a, this.field_w, (int)param2, (int)param4, (int)param3, param7, param6, param10, param9, param13, param12, (float)param20, (float)param19, var25, var24, var28, var27, var31, var30, var34, var33);
                        param4 = param4 + var45;
                        param3 = param3 + var36;
                        param7 = param7 + var46;
                        param6 = param6 + var37;
                        param10 = param10 + var47;
                        param9 = param9 + var38;
                        param13 = param13 + var48;
                        param12 = param12 + var39;
                        param20 = (int)((float)param20 + var49);
                        param19 = (int)((float)param19 + var40);
                        var25 = var25 + var50;
                        var24 = var24 + var41;
                        var28 = var28 + var51;
                        var27 = var27 + var42;
                        var31 = var31 + var52;
                        var30 = var30 + var43;
                        var34 = var34 + var53;
                        var33 = var33 + var44;
                        param2 = param2 + (float)this.field_t;
                        continue L39;
                      }
                    }
                  } else {
                    this.a(this.field_a, this.field_w, (int)param2, (int)param4, (int)param5, param7, param8, param10, param11, param13, param14, (float)param20, (float)param21, var25, var26, var28, var29, var31, var32, var34, var35);
                    param4 = param4 + var45;
                    param5 = param5 + var54;
                    param7 = param7 + var46;
                    param8 = param8 + var55;
                    param10 = param10 + var47;
                    param11 = param11 + var56;
                    param13 = param13 + var48;
                    param14 = param14 + var57;
                    param20 = (int)((float)param20 + var49);
                    param21 = (int)((float)param21 + var58);
                    var25 = var25 + var50;
                    var26 = var26 + var59;
                    var28 = var28 + var51;
                    var29 = var29 + var60;
                    var31 = var31 + var52;
                    var32 = var32 + var61;
                    var34 = var34 + var53;
                    var35 = var35 + var62;
                    param2 = param2 + (float)this.field_t;
                    continue L38;
                  }
                }
              }
            }
          } else {
            return;
          }
        } else {
          if (param1 < (float)this.field_v) {
            L40: {
              if (param2 <= (float)this.field_v) {
                break L40;
              } else {
                param2 = (float)this.field_v;
                break L40;
              }
            }
            L41: {
              if (param0 <= (float)this.field_v) {
                break L41;
              } else {
                param0 = (float)this.field_v;
                break L41;
              }
            }
            if (param2 >= param0) {
              L42: {
                param5 = param4;
                param8 = param7;
                param11 = param10;
                param14 = param13;
                param21 = param20;
                var26 = var25;
                var29 = var28;
                var32 = var31;
                var35 = var34;
                if (param1 >= 0.0f) {
                  break L42;
                } else {
                  param5 = param5 - var36 * param1;
                  param4 = param4 - var45 * param1;
                  param8 = param8 - var37 * param1;
                  param7 = param7 - var46 * param1;
                  param11 = param11 - var38 * param1;
                  param10 = param10 - var47 * param1;
                  param14 = param14 - var39 * param1;
                  param13 = param13 - var48 * param1;
                  param21 = (int)((float)param21 - var40 * param1);
                  param20 = (int)((float)param20 - var49 * param1);
                  var26 = var26 - var41 * param1;
                  var25 = var25 - var50 * param1;
                  var29 = var29 - var42 * param1;
                  var28 = var28 - var51 * param1;
                  var32 = var32 - var43 * param1;
                  var31 = var31 - var52 * param1;
                  var35 = var35 - var44 * param1;
                  var34 = var34 - var53 * param1;
                  param1 = 0.0f;
                  break L42;
                }
              }
              L43: {
                if (param0 >= 0.0f) {
                  break L43;
                } else {
                  param3 = param3 - var54 * param0;
                  param6 = param6 - var55 * param0;
                  param9 = param9 - var56 * param0;
                  param12 = param12 - var57 * param0;
                  param19 = (int)((float)param19 - var58 * param0);
                  var24 = var24 - var59 * param0;
                  var27 = var27 - var60 * param0;
                  var30 = var30 - var61 * param0;
                  var33 = var33 - var62 * param0;
                  param0 = 0.0f;
                  break L43;
                }
              }
              param2 = param2 - param0;
              param0 = param0 - param1;
              param1 = (float)this.field_p[(int)param1];
              if (var36 >= var45) {
                L44: while (true) {
                  param0 = param0 - 1.0f;
                  if (param0 < 0.0f) {
                    L45: while (true) {
                      param2 = param2 - 1.0f;
                      if (param2 < 0.0f) {
                        return;
                      } else {
                        this.a(this.field_a, this.field_w, (int)param1, (int)param4, (int)param3, param7, param6, param10, param9, param13, param12, (float)param20, (float)param19, var25, var24, var28, var27, var31, var30, var34, var33);
                        param4 = param4 + var45;
                        param3 = param3 + var54;
                        param7 = param7 + var46;
                        param6 = param6 + var55;
                        param10 = param10 + var47;
                        param9 = param9 + var56;
                        param13 = param13 + var48;
                        param12 = param12 + var57;
                        param20 = (int)((float)param20 + var49);
                        param19 = (int)((float)param19 + var58);
                        var25 = var25 + var50;
                        var24 = var24 + var59;
                        var28 = var28 + var51;
                        var27 = var27 + var60;
                        var31 = var31 + var52;
                        var30 = var30 + var61;
                        var34 = var34 + var53;
                        var33 = var33 + var62;
                        param1 = param1 + (float)this.field_t;
                        continue L45;
                      }
                    }
                  } else {
                    this.a(this.field_a, this.field_w, (int)param1, (int)param4, (int)param5, param7, param8, param10, param11, param13, param14, (float)param20, (float)param21, var25, var26, var28, var29, var31, var32, var34, var35);
                    param4 = param4 + var45;
                    param5 = param5 + var36;
                    param7 = param7 + var46;
                    param8 = param8 + var37;
                    param10 = param10 + var47;
                    param11 = param11 + var38;
                    param13 = param13 + var48;
                    param14 = param14 + var39;
                    param20 = (int)((float)param20 + var49);
                    param21 = (int)((float)param21 + var40);
                    var25 = var25 + var50;
                    var26 = var26 + var41;
                    var28 = var28 + var51;
                    var29 = var29 + var42;
                    var31 = var31 + var52;
                    var32 = var32 + var43;
                    var34 = var34 + var53;
                    var35 = var35 + var44;
                    param1 = param1 + (float)this.field_t;
                    continue L44;
                  }
                }
              } else {
                L46: while (true) {
                  param0 = param0 - 1.0f;
                  if (param0 < 0.0f) {
                    L47: while (true) {
                      param2 = param2 - 1.0f;
                      if (param2 < 0.0f) {
                        return;
                      } else {
                        this.a(this.field_a, this.field_w, (int)param1, (int)param3, (int)param4, param6, param7, param9, param10, param12, param13, (float)param19, (float)param20, var24, var25, var27, var28, var30, var31, var33, var34);
                        param3 = param3 + var54;
                        param4 = param4 + var45;
                        param6 = param6 + var55;
                        param7 = param7 + var46;
                        param9 = param9 + var56;
                        param10 = param10 + var47;
                        param12 = param12 + var57;
                        param13 = param13 + var48;
                        param19 = (int)((float)param19 + var58);
                        param20 = (int)((float)param20 + var49);
                        var24 = var24 + var59;
                        var25 = var25 + var50;
                        var27 = var27 + var60;
                        var28 = var28 + var51;
                        var30 = var30 + var61;
                        var31 = var31 + var52;
                        var33 = var33 + var62;
                        var34 = var34 + var53;
                        param1 = param1 + (float)this.field_t;
                        continue L47;
                      }
                    }
                  } else {
                    this.a(this.field_a, this.field_w, (int)param1, (int)param5, (int)param4, param8, param7, param11, param10, param14, param13, (float)param21, (float)param20, var26, var25, var29, var28, var32, var31, var35, var34);
                    param5 = param5 + var36;
                    param4 = param4 + var45;
                    param8 = param8 + var37;
                    param7 = param7 + var46;
                    param11 = param11 + var38;
                    param10 = param10 + var47;
                    param14 = param14 + var39;
                    param13 = param13 + var48;
                    param21 = (int)((float)param21 + var40);
                    param20 = (int)((float)param20 + var49);
                    var26 = var26 + var41;
                    var25 = var25 + var50;
                    var29 = var29 + var42;
                    var28 = var28 + var51;
                    var32 = var32 + var43;
                    var31 = var31 + var52;
                    var35 = var35 + var44;
                    var34 = var34 + var53;
                    param1 = param1 + (float)this.field_t;
                    continue L46;
                  }
                }
              }
            } else {
              L48: {
                param3 = param4;
                param6 = param7;
                param9 = param10;
                param12 = param13;
                param19 = param20;
                var24 = var25;
                var27 = var28;
                var30 = var31;
                var33 = var34;
                if (param1 >= 0.0f) {
                  break L48;
                } else {
                  param3 = param3 - var36 * param1;
                  param4 = param4 - var45 * param1;
                  param6 = param6 - var37 * param1;
                  param7 = param7 - var46 * param1;
                  param9 = param9 - var38 * param1;
                  param10 = param10 - var47 * param1;
                  param12 = param12 - var39 * param1;
                  param13 = param13 - var48 * param1;
                  param19 = (int)((float)param19 - var40 * param1);
                  param20 = (int)((float)param20 - var49 * param1);
                  var24 = var24 - var41 * param1;
                  var25 = var25 - var50 * param1;
                  var27 = var27 - var42 * param1;
                  var28 = var28 - var51 * param1;
                  var30 = var30 - var43 * param1;
                  var31 = var31 - var52 * param1;
                  var33 = var33 - var44 * param1;
                  var34 = var34 - var53 * param1;
                  param1 = 0.0f;
                  break L48;
                }
              }
              L49: {
                if (param2 >= 0.0f) {
                  break L49;
                } else {
                  param5 = param5 - var54 * param2;
                  param8 = param8 - var55 * param2;
                  param11 = param11 - var56 * param2;
                  param14 = param14 - var57 * param2;
                  param21 = (int)((float)param21 - var58 * param2);
                  var26 = var26 - var59 * param2;
                  var29 = var29 - var60 * param2;
                  var32 = var32 - var61 * param2;
                  var35 = var35 - var62 * param2;
                  param2 = 0.0f;
                  break L49;
                }
              }
              L50: {
                L51: {
                  if (param1 == param2) {
                    break L51;
                  } else {
                    if (var36 < var45) {
                      break L50;
                    } else {
                      break L51;
                    }
                  }
                }
                L52: {
                  if (param1 != param2) {
                    break L52;
                  } else {
                    if (var36 <= var54) {
                      break L52;
                    } else {
                      break L50;
                    }
                  }
                }
                param0 = param0 - param2;
                param2 = param2 - param1;
                param1 = (float)this.field_p[(int)param1];
                L53: while (true) {
                  param2 = param2 - 1.0f;
                  if (param2 < 0.0f) {
                    L54: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        return;
                      } else {
                        this.a(this.field_a, this.field_w, (int)param1, (int)param5, (int)param3, param8, param6, param11, param9, param14, param12, (float)param21, (float)param19, var26, var24, var29, var27, var32, var30, var35, var33);
                        param5 = param5 + var54;
                        param3 = param3 + var36;
                        param8 = param8 + var55;
                        param6 = param6 + var37;
                        param11 = param11 + var56;
                        param9 = param9 + var38;
                        param14 = param14 + var57;
                        param12 = param12 + var39;
                        param21 = (int)((float)param21 + var58);
                        param19 = (int)((float)param19 + var40);
                        var26 = var26 + var59;
                        var24 = var24 + var41;
                        var29 = var29 + var60;
                        var27 = var27 + var42;
                        var32 = var32 + var61;
                        var30 = var30 + var43;
                        var35 = var35 + var62;
                        var33 = var33 + var44;
                        param1 = param1 + (float)this.field_t;
                        continue L54;
                      }
                    }
                  } else {
                    this.a(this.field_a, this.field_w, (int)param1, (int)param4, (int)param3, param7, param6, param10, param9, param13, param12, (float)param20, (float)param19, var25, var24, var28, var27, var31, var30, var34, var33);
                    param4 = param4 + var45;
                    param3 = param3 + var36;
                    param7 = param7 + var46;
                    param6 = param6 + var37;
                    param10 = param10 + var47;
                    param9 = param9 + var38;
                    param13 = param13 + var48;
                    param12 = param12 + var39;
                    param20 = (int)((float)param20 + var49);
                    param19 = (int)((float)param19 + var40);
                    var25 = var25 + var50;
                    var24 = var24 + var41;
                    var28 = var28 + var51;
                    var27 = var27 + var42;
                    var31 = var31 + var52;
                    var30 = var30 + var43;
                    var34 = var34 + var53;
                    var33 = var33 + var44;
                    param1 = param1 + (float)this.field_t;
                    continue L53;
                  }
                }
              }
              param0 = param0 - param2;
              param2 = param2 - param1;
              param1 = (float)this.field_p[(int)param1];
              L55: while (true) {
                param2 = param2 - 1.0f;
                if (param2 < 0.0f) {
                  L56: while (true) {
                    param0 = param0 - 1.0f;
                    if (param0 < 0.0f) {
                      return;
                    } else {
                      this.a(this.field_a, this.field_w, (int)param1, (int)param3, (int)param5, param6, param8, param9, param11, param12, param14, (float)param19, (float)param21, var24, var26, var27, var29, var30, var32, var33, var35);
                      param3 = param3 + var36;
                      param5 = param5 + var54;
                      param6 = param6 + var37;
                      param8 = param8 + var55;
                      param9 = param9 + var38;
                      param11 = param11 + var56;
                      param12 = param12 + var39;
                      param14 = param14 + var57;
                      param19 = (int)((float)param19 + var40);
                      param21 = (int)((float)param21 + var58);
                      var24 = var24 + var41;
                      var26 = var26 + var59;
                      var27 = var27 + var42;
                      var29 = var29 + var60;
                      var30 = var30 + var43;
                      var32 = var32 + var61;
                      var33 = var33 + var44;
                      var35 = var35 + var62;
                      param1 = param1 + (float)this.field_t;
                      continue L56;
                    }
                  }
                } else {
                  this.a(this.field_a, this.field_w, (int)param1, (int)param3, (int)param4, param6, param7, param9, param10, param12, param13, (float)param19, (float)param20, var24, var25, var27, var28, var30, var31, var33, var34);
                  param3 = param3 + var36;
                  param4 = param4 + var45;
                  param6 = param6 + var37;
                  param7 = param7 + var46;
                  param9 = param9 + var38;
                  param10 = param10 + var47;
                  param12 = param12 + var39;
                  param13 = param13 + var48;
                  param19 = (int)((float)param19 + var40);
                  param20 = (int)((float)param20 + var49);
                  var24 = var24 + var41;
                  var25 = var25 + var50;
                  var27 = var27 + var42;
                  var28 = var28 + var51;
                  var30 = var30 + var43;
                  var31 = var31 + var52;
                  var33 = var33 + var44;
                  var34 = var34 + var53;
                  param1 = param1 + (float)this.field_t;
                  continue L55;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    private final void a(int[] param0, float[] param1, int param2, int param3, int param4, int param5, int param6, float param7, float param8, float param9, float param10, float param11, float param12, float param13, float param14) {
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int incrementValue$24 = 0;
        int incrementValue$25 = 0;
        int incrementValue$26 = 0;
        int incrementValue$27 = 0;
        int incrementValue$28 = 0;
        int incrementValue$29 = 0;
        int incrementValue$30 = 0;
        int incrementValue$31 = 0;
        int incrementValue$32 = 0;
        int incrementValue$33 = 0;
        int incrementValue$34 = 0;
        int incrementValue$35 = 0;
        int incrementValue$36 = 0;
        int var16_int = 0;
        int[] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (!this.field_q) {
                        statePc = 5;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (param6 <= this.field_h) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    param6 = this.field_h;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (param5 >= 0) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    param5 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (param5 < param6) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    return;
                }
                case 7: {
                    if (!this.field_m) {
                        statePc = 40;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    param2 = param2 + param5;
                    param9 = param9 + param10 * (float)param5;
                    param11 = param11 + param12 * (float)param5;
                    param13 = param13 + param14 * (float)param5;
                    if (this.field_j) {
                        statePc = 18;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    param4 = param6 - param5;
                    if (this.field_b != 0) {
                        statePc = 12;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    incrementValue$19 = param2;
                    param2++;
                    param0[incrementValue$19] = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                    param9 = param9 + param10;
                    param11 = param11 + param12;
                    param13 = param13 + param14;
                    param4--;
                    if (param4 > 0) {
                        statePc = 10;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (this.field_g) {
                        statePc = 16;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var16_int = this.field_b;
                    var17 = 256 - this.field_b;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                    param9 = param9 + param10;
                    param11 = param11 + param12;
                    param13 = param13 + param14;
                    param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                    var18 = param0[param2];
                    incrementValue$20 = param2;
                    param2++;
                    param0[incrementValue$20] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                    param4--;
                    if (param4 > 0) {
                        statePc = 14;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var27 = param0;
                    var16 = var27;
                    incrementValue$21 = param2;
                    param2++;
                    var17 = incrementValue$21;
                    var18 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
                    var19 = var27[var17];
                    var20 = var18 + var19;
                    var21 = (var18 & 16711935) + (var19 & 16711935);
                    var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                    var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                    param9 = param9 + param10;
                    param11 = param11 + param12;
                    param13 = param13 + param14;
                    param4--;
                    if (param4 > 0) {
                        statePc = 16;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    return;
                }
                case 18: {
                    param4 = param6 - param5 >> 2;
                    param10 = param10 * 4.0f;
                    param12 = param12 * 4.0f;
                    param14 = param14 * 4.0f;
                    if (this.field_b != 0) {
                        statePc = 26;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (param4 <= 0) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                    param9 = param9 + param10;
                    param11 = param11 + param12;
                    param13 = param13 + param14;
                    incrementValue$22 = param2;
                    param2++;
                    param0[incrementValue$22] = param3;
                    incrementValue$23 = param2;
                    param2++;
                    param0[incrementValue$23] = param3;
                    incrementValue$24 = param2;
                    param2++;
                    param0[incrementValue$24] = param3;
                    incrementValue$25 = param2;
                    param2++;
                    param0[incrementValue$25] = param3;
                    param4--;
                    if (param4 > 0) {
                        statePc = 20;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    param4 = param6 - param5 & 3;
                    if (param4 > 0) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    return;
                }
                case 23: {
                    param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    incrementValue$26 = param2;
                    param2++;
                    param0[incrementValue$26] = param3;
                    param4--;
                    if (param4 > 0) {
                        statePc = 24;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (this.field_g) {
                        statePc = 33;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var16_int = this.field_b;
                    var17 = 256 - this.field_b;
                    if (param4 <= 0) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                    param9 = param9 + param10;
                    param11 = param11 + param12;
                    param13 = param13 + param14;
                    param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                    var18 = param0[param2];
                    incrementValue$27 = param2;
                    param2++;
                    param0[incrementValue$27] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                    var18 = param0[param2];
                    incrementValue$28 = param2;
                    param2++;
                    param0[incrementValue$28] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                    var18 = param0[param2];
                    incrementValue$29 = param2;
                    param2++;
                    param0[incrementValue$29] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                    var18 = param0[param2];
                    incrementValue$30 = param2;
                    param2++;
                    param0[incrementValue$30] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                    param4--;
                    if (param4 > 0) {
                        statePc = 28;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    param4 = param6 - param5 & 3;
                    if (param4 <= 0) {
                        statePc = 38;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                    param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    var18 = param0[param2];
                    incrementValue$31 = param2;
                    param2++;
                    param0[incrementValue$31] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                    param4--;
                    if (param4 > 0) {
                        statePc = 31;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (param4 <= 0) {
                        statePc = 35;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    param3 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
                    param9 = param9 + param10;
                    param11 = param11 + param12;
                    param13 = param13 + param14;
                    var22 = param0;
                    var16 = var22;
                    incrementValue$32 = param2;
                    param2++;
                    var17 = incrementValue$32;
                    var18 = param3;
                    var19 = var22[var17];
                    var20 = var18 + var19;
                    var21 = (var18 & 16711935) + (var19 & 16711935);
                    var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                    var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                    var23 = param0;
                    var16 = var23;
                    incrementValue$33 = param2;
                    param2++;
                    var17 = incrementValue$33;
                    var18 = param3;
                    var19 = var23[var17];
                    var20 = var18 + var19;
                    var21 = (var18 & 16711935) + (var19 & 16711935);
                    var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                    var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                    var24 = param0;
                    var16 = var24;
                    incrementValue$34 = param2;
                    param2++;
                    var17 = incrementValue$34;
                    var18 = param3;
                    var19 = var24[var17];
                    var20 = var18 + var19;
                    var21 = (var18 & 16711935) + (var19 & 16711935);
                    var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                    var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                    var25 = param0;
                    var16 = var25;
                    incrementValue$35 = param2;
                    param2++;
                    var17 = incrementValue$35;
                    var18 = param3;
                    var19 = var25[var17];
                    var20 = var18 + var19;
                    var21 = (var18 & 16711935) + (var19 & 16711935);
                    var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                    var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                    param4--;
                    if (param4 > 0) {
                        statePc = 34;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    param4 = param6 - param5 & 3;
                    if (param4 <= 0) {
                        statePc = 38;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    param3 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    var26 = param0;
                    var16 = var26;
                    incrementValue$36 = param2;
                    param2++;
                    var17 = incrementValue$36;
                    var18 = param3;
                    var19 = var26[var17];
                    var20 = var18 + var19;
                    var21 = (var18 & 16711935) + (var19 & 16711935);
                    var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                    var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                    param4--;
                    if (param4 > 0) {
                        statePc = 37;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    return;
                }
                case 40: {
                    param2 = param2 + (param5 - 1);
                    param7 = param7 + param8 * (float)param5;
                    param9 = param9 + param10 * (float)param5;
                    param11 = param11 + param12 * (float)param5;
                    param13 = param13 + param14 * (float)param5;
                    if (!this.field_o.field_n) {
                        statePc = 108;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (!this.field_j) {
                        statePc = 93;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    param4 = param6 - param5 >> 2;
                    param10 = param10 * 4.0f;
                    param12 = param12 * 4.0f;
                    param14 = param14 * 4.0f;
                    if (this.field_b != 0) {
                        statePc = 60;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    if (param4 <= 0) {
                        statePc = 53;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                    param9 = param9 + param10;
                    param11 = param11 + param12;
                    param13 = param13 + param14;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 46;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    param0[param2] = param3;
                    param1[param2] = param7;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 48;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    param0[param2] = param3;
                    param1[param2] = param7;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 50;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    param0[param2] = param3;
                    param1[param2] = param7;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 52;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    param0[param2] = param3;
                    param1[param2] = param7;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    param7 = param7 + param8;
                    param4--;
                    if (param4 > 0) {
                        statePc = 44;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    param4 = param6 - param5 & 3;
                    if (param4 > 0) {
                        statePc = 55;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    return;
                }
                case 55: {
                    param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 58;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    param0[param2] = param3;
                    param1[param2] = param7;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    param7 = param7 + param8;
                    param4--;
                    if (param4 > 0) {
                        statePc = 56;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 60: {
                    if (this.field_g) {
                        statePc = 77;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    var16_int = this.field_b;
                    var17 = 256 - this.field_b;
                    if (param4 <= 0) {
                        statePc = 71;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                    param9 = param9 + param10;
                    param11 = param11 + param12;
                    param13 = param13 + param14;
                    param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 64;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    var18 = param0[param2];
                    param0[param2] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                    param1[param2] = param7;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 66;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    var18 = param0[param2];
                    param0[param2] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                    param1[param2] = param7;
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 68;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    var18 = param0[param2];
                    param0[param2] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                    param1[param2] = param7;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 70;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    var18 = param0[param2];
                    param0[param2] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                    param1[param2] = param7;
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    param7 = param7 + param8;
                    param4--;
                    if (param4 > 0) {
                        statePc = 62;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    param4 = param6 - param5 & 3;
                    if (param4 <= 0) {
                        statePc = 92;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                    param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 75;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    var18 = param0[param2];
                    param0[param2] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                    param1[param2] = param7;
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    param7 = param7 + param8;
                    param4--;
                    if (param4 > 0) {
                        statePc = 73;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 77: {
                    if (param4 <= 0) {
                        statePc = 87;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    param3 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
                    param9 = param9 + param10;
                    param11 = param11 + param12;
                    param13 = param13 + param14;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 80;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    var28 = param0;
                    var16 = var28;
                    var17 = param2;
                    var18 = param3;
                    var19 = var28[var17];
                    var20 = var18 + var19;
                    var21 = (var18 & 16711935) + (var19 & 16711935);
                    var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                    var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                    param1[param2] = param7;
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 82;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    var29 = param0;
                    var16 = var29;
                    var17 = param2;
                    var18 = param3;
                    var19 = var29[var17];
                    var20 = var18 + var19;
                    var21 = (var18 & 16711935) + (var19 & 16711935);
                    var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                    var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                    param1[param2] = param7;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 84;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    var30 = param0;
                    var16 = var30;
                    var17 = param2;
                    var18 = param3;
                    var19 = var30[var17];
                    var20 = var18 + var19;
                    var21 = (var18 & 16711935) + (var19 & 16711935);
                    var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                    var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                    param1[param2] = param7;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 86;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    var31 = param0;
                    var16 = var31;
                    var17 = param2;
                    var18 = param3;
                    var19 = var31[var17];
                    var20 = var18 + var19;
                    var21 = (var18 & 16711935) + (var19 & 16711935);
                    var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                    var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                    param1[param2] = param7;
                    statePc = 86;
                    continue stateLoop;
                }
                case 86: {
                    param7 = param7 + param8;
                    param4--;
                    if (param4 > 0) {
                        statePc = 78;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    param4 = param6 - param5 & 3;
                    if (param4 <= 0) {
                        statePc = 92;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    param3 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 91;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    var32 = param0;
                    var16 = var32;
                    var17 = param2;
                    var18 = param3;
                    var19 = var32[var17];
                    var20 = var18 + var19;
                    var21 = (var18 & 16711935) + (var19 & 16711935);
                    var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                    var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                    param1[param2] = param7;
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    param7 = param7 + param8;
                    param4--;
                    if (param4 > 0) {
                        statePc = 89;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    return;
                }
                case 93: {
                    param4 = param6 - param5;
                    if (this.field_b != 0) {
                        statePc = 98;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 96;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    param0[param2] = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                    param1[param2] = param7;
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    param7 = param7 + param8;
                    param9 = param9 + param10;
                    param11 = param11 + param12;
                    param13 = param13 + param14;
                    param4--;
                    if (param4 > 0) {
                        statePc = 94;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 98: {
                    if (this.field_g) {
                        statePc = 104;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    var16_int = this.field_b;
                    var17 = 256 - this.field_b;
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 102;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                    param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                    var18 = param0[param2];
                    param0[param2] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                    param1[param2] = param7;
                    statePc = 102;
                    continue stateLoop;
                }
                case 102: {
                    param7 = param7 + param8;
                    param9 = param9 + param10;
                    param11 = param11 + param12;
                    param13 = param13 + param14;
                    param4--;
                    if (param4 > 0) {
                        statePc = 100;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 104: {
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 106;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    var33 = param0;
                    var16 = var33;
                    var17 = param2;
                    var18 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
                    var19 = var33[var17];
                    var20 = var18 + var19;
                    var21 = (var18 & 16711935) + (var19 & 16711935);
                    var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                    var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                    param1[param2] = param7;
                    statePc = 106;
                    continue stateLoop;
                }
                case 106: {
                    param7 = param7 + param8;
                    param9 = param9 + param10;
                    param11 = param11 + param12;
                    param13 = param13 + param14;
                    param4--;
                    if (param4 > 0) {
                        statePc = 104;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    return;
                }
                case 108: {
                    if (!this.field_j) {
                        statePc = 160;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    param4 = param6 - param5 >> 2;
                    param10 = param10 * 4.0f;
                    param12 = param12 * 4.0f;
                    param14 = param14 * 4.0f;
                    if (this.field_b != 0) {
                        statePc = 127;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    if (param4 <= 0) {
                        statePc = 120;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                    param9 = param9 + param10;
                    param11 = param11 + param12;
                    param13 = param13 + param14;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 113;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    param0[param2] = param3;
                    statePc = 113;
                    continue stateLoop;
                }
                case 113: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 115;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    param0[param2] = param3;
                    statePc = 115;
                    continue stateLoop;
                }
                case 115: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 117;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    param0[param2] = param3;
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 119;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    param0[param2] = param3;
                    statePc = 119;
                    continue stateLoop;
                }
                case 119: {
                    param7 = param7 + param8;
                    param4--;
                    if (param4 > 0) {
                        statePc = 111;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    param4 = param6 - param5 & 3;
                    if (param4 > 0) {
                        statePc = 122;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    return;
                }
                case 122: {
                    param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                    statePc = 123;
                    continue stateLoop;
                }
                case 123: {
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 125;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    param0[param2] = param3;
                    statePc = 125;
                    continue stateLoop;
                }
                case 125: {
                    param7 = param7 + param8;
                    param4--;
                    if (param4 > 0) {
                        statePc = 123;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 127: {
                    if (this.field_g) {
                        statePc = 144;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    var16_int = this.field_b;
                    var17 = 256 - this.field_b;
                    if (param4 <= 0) {
                        statePc = 138;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                    param9 = param9 + param10;
                    param11 = param11 + param12;
                    param13 = param13 + param14;
                    param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 131;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    var18 = param0[param2];
                    param0[param2] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                    statePc = 131;
                    continue stateLoop;
                }
                case 131: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 133;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    var18 = param0[param2];
                    param0[param2] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                    statePc = 133;
                    continue stateLoop;
                }
                case 133: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 135;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    var18 = param0[param2];
                    param0[param2] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                    statePc = 135;
                    continue stateLoop;
                }
                case 135: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 137;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    var18 = param0[param2];
                    param0[param2] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                    statePc = 137;
                    continue stateLoop;
                }
                case 137: {
                    param7 = param7 + param8;
                    param4--;
                    if (param4 > 0) {
                        statePc = 129;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    param4 = param6 - param5 & 3;
                    if (param4 <= 0) {
                        statePc = 159;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                    param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 142;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    var18 = param0[param2];
                    param0[param2] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                    statePc = 142;
                    continue stateLoop;
                }
                case 142: {
                    param7 = param7 + param8;
                    param4--;
                    if (param4 > 0) {
                        statePc = 140;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 144: {
                    if (param4 <= 0) {
                        statePc = 154;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    param3 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
                    param9 = param9 + param10;
                    param11 = param11 + param12;
                    param13 = param13 + param14;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 147;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    var34 = param0;
                    var16 = var34;
                    var17 = param2;
                    var18 = param3;
                    var19 = var34[var17];
                    var20 = var18 + var19;
                    var21 = (var18 & 16711935) + (var19 & 16711935);
                    var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                    var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                    statePc = 147;
                    continue stateLoop;
                }
                case 147: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 149;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    var35 = param0;
                    var16 = var35;
                    var17 = param2;
                    var18 = param3;
                    var19 = var35[var17];
                    var20 = var18 + var19;
                    var21 = (var18 & 16711935) + (var19 & 16711935);
                    var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                    var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                    statePc = 149;
                    continue stateLoop;
                }
                case 149: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 151;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    var36 = param0;
                    var16 = var36;
                    var17 = param2;
                    var18 = param3;
                    var19 = var36[var17];
                    var20 = var18 + var19;
                    var21 = (var18 & 16711935) + (var19 & 16711935);
                    var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                    var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                    statePc = 151;
                    continue stateLoop;
                }
                case 151: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 153;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    var37 = param0;
                    var16 = var37;
                    var17 = param2;
                    var18 = param3;
                    var19 = var37[var17];
                    var20 = var18 + var19;
                    var21 = (var18 & 16711935) + (var19 & 16711935);
                    var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                    var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                    statePc = 153;
                    continue stateLoop;
                }
                case 153: {
                    param7 = param7 + param8;
                    param4--;
                    if (param4 > 0) {
                        statePc = 145;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    param4 = param6 - param5 & 3;
                    if (param4 <= 0) {
                        statePc = 159;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    param3 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
                    statePc = 156;
                    continue stateLoop;
                }
                case 156: {
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 158;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    var38 = param0;
                    var16 = var38;
                    var17 = param2;
                    var18 = param3;
                    var19 = var38[var17];
                    var20 = var18 + var19;
                    var21 = (var18 & 16711935) + (var19 & 16711935);
                    var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                    var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                    statePc = 158;
                    continue stateLoop;
                }
                case 158: {
                    param7 = param7 + param8;
                    param4--;
                    if (param4 > 0) {
                        statePc = 156;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    return;
                }
                case 160: {
                    param4 = param6 - param5;
                    if (this.field_b != 0) {
                        statePc = 165;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 163;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    param0[param2] = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                    statePc = 163;
                    continue stateLoop;
                }
                case 163: {
                    param7 = param7 + param8;
                    param9 = param9 + param10;
                    param11 = param11 + param12;
                    param13 = param13 + param14;
                    param4--;
                    if (param4 > 0) {
                        statePc = 161;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 165: {
                    if (this.field_g) {
                        statePc = 171;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    var16_int = this.field_b;
                    var17 = 256 - this.field_b;
                    statePc = 167;
                    continue stateLoop;
                }
                case 167: {
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 169;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                    param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                    var18 = param0[param2];
                    param0[param2] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                    statePc = 169;
                    continue stateLoop;
                }
                case 169: {
                    param7 = param7 + param8;
                    param9 = param9 + param10;
                    param11 = param11 + param12;
                    param13 = param13 + param14;
                    param4--;
                    if (param4 > 0) {
                        statePc = 167;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 171: {
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 173;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    var39 = param0;
                    var16 = var39;
                    var17 = param2;
                    var18 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
                    var19 = var39[var17];
                    var20 = var18 + var19;
                    var21 = (var18 & 16711935) + (var19 & 16711935);
                    var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                    var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                    statePc = 173;
                    continue stateLoop;
                }
                case 173: {
                    param7 = param7 + param8;
                    param9 = param9 + param10;
                    param11 = param11 + param12;
                    param13 = param13 + param14;
                    param4--;
                    if (param4 > 0) {
                        statePc = 171;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(float param0, float param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8, float param9, float param10, float param11, float param12, float param13, float param14, int param15, int param16, int param17, int param18, int param19, int param20, int param21, int param22) {
        float var24;
        float var25;
        float var26;
        float var27;
        float var28;
        float var29;
        float var30;
        float var31;
        float var32;
        float var33;
        float var34;
        float var35;
        float var36;
        float var37;
        float var38;
        float var39;
        float var40;
        float var41;
        float var42;
        float var43;
        float var44;
        float var45;
        float var46;
        float var47;
        float var48;
        float var49;
        float var50;
        float var51;
        float var52;
        float var53;
        float var54;
        float var55;
        float var56;
        float var57;
        float var58;
        float var59;
        float var60;
        float var61;
        float var62;
        float var63;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        L0: {
          if (param22 == this.field_c) {
            break L0;
          } else {
            this.field_w = this.field_k.h(param22);
            if (this.field_w != null) {
              L1: {
                stackIn_5_0 = this;

                if (!this.field_k.j(param22)) {
                  stackIn_6_0 = this;
                  stackIn_6_1 = this.field_k.field_I;
                  break L1;
                } else {
                  stackIn_6_0 = this;
                  stackIn_6_1 = 64;
                  break L1;
                }
              }
              ((iua) (this)).field_i = stackIn_6_1;
              this.field_r = this.field_i - 1;
              this.field_f = this.field_k.f(param22);
              this.field_d = this.field_k.d(param22);
              break L0;
            } else {
              this.a((float)(int)param0, (float)(int)param1, (float)(int)param2, (float)(int)param3, (float)(int)param4, (float)(int)param5, (float)(int)param6, (float)(int)param7, (float)(int)param8, l.a(param18 | param19 << 24, param15, 20048), l.a(param18 | param20 << 24, param16, 20048), l.a(param18 | param21 << 24, param17, 20048));
              return;
            }
          }
        }
        L2: {
          this.field_l = param18;
          var24 = (float)(param15 >> 24 & 255);
          var25 = (float)(param16 >> 24 & 255);
          var26 = (float)(param17 >> 24 & 255);
          var27 = (float)(param15 >> 16 & 255);
          var28 = (float)(param16 >> 16 & 255);
          var29 = (float)(param17 >> 16 & 255);
          var30 = (float)(param15 >> 8 & 255);
          var31 = (float)(param16 >> 8 & 255);
          var32 = (float)(param17 >> 8 & 255);
          var33 = (float)(param15 & 255);
          var34 = (float)(param16 & 255);
          var35 = (float)(param17 & 255);
          param9 = param9 / param6;
          param10 = param10 / param7;
          param11 = param11 / param8;
          param12 = param12 / param6;
          param13 = param13 / param7;
          param14 = param14 / param8;
          param6 = 1.0f / param6;
          param7 = 1.0f / param7;
          param8 = 1.0f / param8;
          var36 = 0.0f;
          var37 = 0.0f;
          var38 = 0.0f;
          var39 = 0.0f;
          var40 = 0.0f;
          var41 = 0.0f;
          var42 = 0.0f;
          var43 = 0.0f;
          var44 = 0.0f;
          if (param1 == param0) {
            break L2;
          } else {
            var45 = param1 - param0;
            var36 = (param4 - param3) / var45;
            var37 = (param7 - param6) / var45;
            var38 = (param10 - param9) / var45;
            var39 = (param13 - param12) / var45;
            var40 = (float)(param20 - param19) / var45;
            var41 = (var25 - var24) / var45;
            var42 = (var28 - var27) / var45;
            var43 = (var31 - var30) / var45;
            var44 = (var34 - var33) / var45;
            break L2;
          }
        }
        L3: {
          var45 = 0.0f;
          var46 = 0.0f;
          var47 = 0.0f;
          var48 = 0.0f;
          var49 = 0.0f;
          var50 = 0.0f;
          var51 = 0.0f;
          var52 = 0.0f;
          var53 = 0.0f;
          if (param2 == param1) {
            break L3;
          } else {
            var54 = param2 - param1;
            var45 = (param5 - param4) / var54;
            var46 = (param8 - param7) / var54;
            var47 = (param11 - param10) / var54;
            var48 = (param14 - param13) / var54;
            var49 = (float)(param21 - param20) / var54;
            var50 = (var26 - var25) / var54;
            var51 = (var29 - var28) / var54;
            var52 = (var32 - var31) / var54;
            var53 = (var35 - var34) / var54;
            break L3;
          }
        }
        L4: {
          var54 = 0.0f;
          var55 = 0.0f;
          var56 = 0.0f;
          var57 = 0.0f;
          var58 = 0.0f;
          var59 = 0.0f;
          var60 = 0.0f;
          var61 = 0.0f;
          var62 = 0.0f;
          if (param0 == param2) {
            break L4;
          } else {
            var63 = param0 - param2;
            var54 = (param3 - param5) / var63;
            var55 = (param6 - param8) / var63;
            var56 = (param9 - param11) / var63;
            var57 = (param12 - param14) / var63;
            var58 = (float)(param19 - param21) / var63;
            var59 = (var24 - var26) / var63;
            var60 = (var27 - var29) / var63;
            var61 = (var30 - var32) / var63;
            var62 = (var33 - var35) / var63;
            break L4;
          }
        }
        L5: {
          if (param0 > param1) {
            break L5;
          } else {
            if (param0 > param2) {
              break L5;
            } else {
              if (param0 < (float)this.field_v) {
                L6: {
                  if (param1 <= (float)this.field_v) {
                    break L6;
                  } else {
                    param1 = (float)this.field_v;
                    break L6;
                  }
                }
                L7: {
                  if (param2 <= (float)this.field_v) {
                    break L7;
                  } else {
                    param2 = (float)this.field_v;
                    break L7;
                  }
                }
                if (param1 >= param2) {
                  L8: {
                    param4 = param3;
                    param7 = param6;
                    param10 = param9;
                    param13 = param12;
                    param20 = param19;
                    var25 = var24;
                    var28 = var27;
                    var31 = var30;
                    var34 = var33;
                    if (param0 >= 0.0f) {
                      break L8;
                    } else {
                      param3 = param3 - var36 * param0;
                      param4 = param4 - var54 * param0;
                      param6 = param6 - var37 * param0;
                      param7 = param7 - var55 * param0;
                      param9 = param9 - var38 * param0;
                      param10 = param10 - var56 * param0;
                      param12 = param12 - var39 * param0;
                      param13 = param13 - var57 * param0;
                      param19 = (int)((float)param19 - var40 * param0);
                      param20 = (int)((float)param20 - var58 * param0);
                      var24 = var24 - var41 * param0;
                      var25 = var25 - var59 * param0;
                      var27 = var27 - var41 * param0;
                      var28 = var28 - var59 * param0;
                      var30 = var30 - var41 * param0;
                      var31 = var31 - var59 * param0;
                      var33 = var33 - var41 * param0;
                      var34 = var34 - var59 * param0;
                      param0 = 0.0f;
                      break L8;
                    }
                  }
                  L9: {
                    if (param2 >= 0.0f) {
                      break L9;
                    } else {
                      param5 = param5 - var45 * param2;
                      param8 = param8 - var46 * param2;
                      param11 = param11 - var47 * param2;
                      param14 = param14 - var48 * param2;
                      param21 = (int)((float)param21 - var49 * param2);
                      var26 = var26 - var50 * param2;
                      var29 = var29 - var51 * param2;
                      var32 = var32 - var52 * param2;
                      var35 = var35 - var53 * param2;
                      param2 = 0.0f;
                      break L9;
                    }
                  }
                  L10: {
                    L11: {
                      if (param0 == param2) {
                        break L11;
                      } else {
                        if (var54 < var36) {
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                    L12: {
                      if (param0 != param2) {
                        break L12;
                      } else {
                        if (var45 <= var36) {
                          break L12;
                        } else {
                          break L10;
                        }
                      }
                    }
                    param1 = param1 - param2;
                    param2 = param2 - param0;
                    param0 = (float)this.field_p[(int)param0];
                    L13: while (true) {
                      param2 = param2 - 1.0f;
                      if (param2 < 0.0f) {
                        L14: while (true) {
                          param1 = param1 - 1.0f;
                          if (param1 < 0.0f) {
                            return;
                          } else {
                            this.b(this.field_a, this.field_w, (int)param0, (int)param3, (int)param5, param6, param8, param9, param11, param12, param14, (float)param19, (float)param21, var24, var26, var27, var29, var30, var32, var33, var35);
                            param3 = param3 + var36;
                            param5 = param5 + var45;
                            param6 = param6 + var37;
                            param8 = param8 + var46;
                            param9 = param9 + var38;
                            param11 = param11 + var47;
                            param12 = param12 + var39;
                            param14 = param14 + var48;
                            param19 = (int)((float)param19 + var40);
                            param21 = (int)((float)param21 + var49);
                            var24 = var24 + var41;
                            var26 = var26 + var50;
                            var27 = var27 + var42;
                            var29 = var29 + var51;
                            var30 = var30 + var43;
                            var32 = var32 + var52;
                            var33 = var33 + var44;
                            var35 = var35 + var53;
                            param0 = param0 + (float)this.field_t;
                            continue L14;
                          }
                        }
                      } else {
                        this.b(this.field_a, this.field_w, (int)param0, (int)param3, (int)param4, param6, param7, param9, param10, param12, param13, (float)param19, (float)param20, var24, var25, var27, var28, var30, var31, var33, var34);
                        param4 = param4 + var54;
                        param3 = param3 + var36;
                        param7 = param7 + var55;
                        param6 = param6 + var37;
                        param10 = param10 + var56;
                        param9 = param9 + var38;
                        param13 = param13 + var57;
                        param12 = param12 + var39;
                        param20 = (int)((float)param20 + var58);
                        param19 = (int)((float)param19 + var40);
                        var25 = var25 + var59;
                        var24 = var24 + var41;
                        var28 = var28 + var60;
                        var27 = var27 + var42;
                        var31 = var31 + var61;
                        var30 = var30 + var43;
                        var34 = var34 + var62;
                        var33 = var33 + var44;
                        param0 = param0 + (float)this.field_t;
                        continue L13;
                      }
                    }
                  }
                  param1 = param1 - param2;
                  param2 = param2 - param0;
                  param0 = (float)this.field_p[(int)param0];
                  L15: while (true) {
                    param2 = param2 - 1.0f;
                    if (param2 < 0.0f) {
                      L16: while (true) {
                        param1 = param1 - 1.0f;
                        if (param1 < 0.0f) {
                          return;
                        } else {
                          this.b(this.field_a, this.field_w, (int)param0, (int)param5, (int)param3, param8, param6, param11, param9, param14, param12, (float)param21, (float)param19, var26, var24, var29, var27, var32, var30, var35, var33);
                          param5 = param5 + var45;
                          param3 = param3 + var36;
                          param8 = param8 + var46;
                          param6 = param6 + var37;
                          param11 = param11 + var47;
                          param9 = param9 + var38;
                          param14 = param14 + var48;
                          param12 = param12 + var39;
                          param21 = (int)((float)param21 + var49);
                          param19 = (int)((float)param19 + var40);
                          var26 = var26 + var50;
                          var24 = var24 + var41;
                          var29 = var29 + var51;
                          var27 = var27 + var42;
                          var32 = var32 + var52;
                          var30 = var30 + var43;
                          var35 = var35 + var53;
                          var33 = var33 + var44;
                          param0 = param0 + (float)this.field_t;
                          continue L16;
                        }
                      }
                    } else {
                      this.b(this.field_a, this.field_w, (int)param0, (int)param4, (int)param3, param7, param6, param10, param9, param13, param12, (float)param20, (float)param19, var25, var24, var28, var27, var31, var30, var34, var33);
                      param3 = param3 + var36;
                      param4 = param4 + var54;
                      param6 = param6 + var37;
                      param7 = param7 + var55;
                      param9 = param9 + var38;
                      param10 = param10 + var56;
                      param12 = param12 + var39;
                      param13 = param13 + var57;
                      param19 = (int)((float)param19 + var40);
                      param20 = (int)((float)param20 + var58);
                      var24 = var24 + var41;
                      var25 = var25 + var59;
                      var27 = var27 + var42;
                      var28 = var28 + var60;
                      var30 = var30 + var43;
                      var31 = var31 + var61;
                      var33 = var33 + var44;
                      var34 = var34 + var62;
                      param0 = param0 + (float)this.field_t;
                      continue L15;
                    }
                  }
                } else {
                  L17: {
                    param5 = param3;
                    param8 = param6;
                    param11 = param9;
                    param14 = param12;
                    param21 = param19;
                    var26 = var24;
                    var29 = var27;
                    var32 = var30;
                    var35 = var33;
                    if (param0 >= 0.0f) {
                      break L17;
                    } else {
                      param3 = param3 - var36 * param0;
                      param5 = param5 - var54 * param0;
                      param6 = param6 - var37 * param0;
                      param8 = param8 - var55 * param0;
                      param9 = param9 - var38 * param0;
                      param11 = param11 - var56 * param0;
                      param12 = param12 - var39 * param0;
                      param14 = param14 - var57 * param0;
                      param19 = (int)((float)param19 - var40 * param0);
                      param21 = (int)((float)param21 - var58 * param0);
                      var24 = var24 - var41 * param0;
                      var26 = var26 - var59 * param0;
                      var27 = var27 - var41 * param0;
                      var29 = var29 - var59 * param0;
                      var30 = var30 - var41 * param0;
                      var32 = var32 - var59 * param0;
                      var33 = var33 - var41 * param0;
                      var35 = var35 - var59 * param0;
                      param0 = 0.0f;
                      break L17;
                    }
                  }
                  L18: {
                    if (param1 >= 0.0f) {
                      break L18;
                    } else {
                      param4 = param4 - var45 * param1;
                      param7 = param7 - var46 * param1;
                      param10 = param10 - var47 * param1;
                      param13 = param13 - var48 * param1;
                      param20 = (int)((float)param20 - var49 * param1);
                      var25 = var25 - var50 * param1;
                      var28 = var28 - var51 * param1;
                      var31 = var31 - var52 * param1;
                      var34 = var34 - var53 * param1;
                      param1 = 0.0f;
                      break L18;
                    }
                  }
                  L19: {
                    L20: {
                      if (param0 == param1) {
                        break L20;
                      } else {
                        if (var54 < var36) {
                          break L19;
                        } else {
                          break L20;
                        }
                      }
                    }
                    L21: {
                      if (param0 != param1) {
                        break L21;
                      } else {
                        if (var54 <= var45) {
                          break L21;
                        } else {
                          break L19;
                        }
                      }
                    }
                    param2 = param2 - param1;
                    param1 = param1 - param0;
                    param0 = (float)this.field_p[(int)param0];
                    L22: while (true) {
                      param1 = param1 - 1.0f;
                      if (param1 < 0.0f) {
                        L23: while (true) {
                          param2 = param2 - 1.0f;
                          if (param2 < 0.0f) {
                            return;
                          } else {
                            this.b(this.field_a, this.field_w, (int)param0, (int)param4, (int)param5, param7, param8, param10, param11, param13, param14, (float)param20, (float)param21, var25, var26, var28, var29, var31, var32, var34, var35);
                            param4 = param4 + var45;
                            param5 = param5 + var54;
                            param7 = param7 + var46;
                            param8 = param8 + var55;
                            param10 = param10 + var47;
                            param11 = param11 + var56;
                            param13 = param13 + var48;
                            param14 = param14 + var57;
                            param20 = (int)((float)param20 + var49);
                            param21 = (int)((float)param21 + var58);
                            var25 = var25 + var50;
                            var26 = var26 + var59;
                            var28 = var28 + var51;
                            var29 = var29 + var60;
                            var31 = var31 + var52;
                            var32 = var32 + var61;
                            var34 = var34 + var53;
                            var35 = var35 + var62;
                            param0 = param0 + (float)this.field_t;
                            continue L23;
                          }
                        }
                      } else {
                        this.b(this.field_a, this.field_w, (int)param0, (int)param3, (int)param5, param6, param8, param9, param11, param12, param14, (float)param19, (float)param21, var24, var26, var27, var29, var30, var32, var33, var35);
                        param3 = param3 + var36;
                        param5 = param5 + var54;
                        param6 = param6 + var37;
                        param8 = param8 + var55;
                        param9 = param9 + var38;
                        param11 = param11 + var56;
                        param12 = param12 + var39;
                        param14 = param14 + var57;
                        param19 = (int)((float)param19 + var40);
                        param21 = (int)((float)param21 + var58);
                        var24 = var24 + var41;
                        var26 = var26 + var59;
                        var27 = var27 + var42;
                        var29 = var29 + var60;
                        var30 = var30 + var43;
                        var32 = var32 + var61;
                        var33 = var33 + var44;
                        var35 = var35 + var62;
                        param0 = param0 + (float)this.field_t;
                        continue L22;
                      }
                    }
                  }
                  param2 = param2 - param1;
                  param1 = param1 - param0;
                  param0 = (float)this.field_p[(int)param0];
                  L24: while (true) {
                    param1 = param1 - 1.0f;
                    if (param1 < 0.0f) {
                      L25: while (true) {
                        param2 = param2 - 1.0f;
                        if (param2 < 0.0f) {
                          return;
                        } else {
                          this.b(this.field_a, this.field_w, (int)param0, (int)param5, (int)param4, param8, param7, param11, param10, param14, param13, (float)param21, (float)param20, var26, var25, var29, var28, var32, var31, var35, var34);
                          param4 = param4 + var45;
                          param5 = param5 + var54;
                          param7 = param7 + var46;
                          param8 = param8 + var55;
                          param10 = param10 + var47;
                          param11 = param11 + var56;
                          param13 = param13 + var48;
                          param14 = param14 + var57;
                          param20 = (int)((float)param20 + var49);
                          param21 = (int)((float)param21 + var58);
                          var25 = var25 + var50;
                          var26 = var26 + var59;
                          var28 = var28 + var51;
                          var29 = var29 + var60;
                          var31 = var31 + var52;
                          var32 = var32 + var61;
                          var34 = var34 + var53;
                          var35 = var35 + var62;
                          param0 = param0 + (float)this.field_t;
                          continue L25;
                        }
                      }
                    } else {
                      this.b(this.field_a, this.field_w, (int)param0, (int)param5, (int)param3, param8, param6, param11, param9, param14, param12, (float)param21, (float)param19, var26, var24, var29, var27, var32, var30, var35, var33);
                      param3 = param3 + var36;
                      param5 = param5 + var54;
                      param6 = param6 + var37;
                      param8 = param8 + var55;
                      param9 = param9 + var38;
                      param11 = param11 + var56;
                      param12 = param12 + var39;
                      param14 = param14 + var57;
                      param19 = (int)((float)param19 + var40);
                      param21 = (int)((float)param21 + var58);
                      var24 = var24 + var41;
                      var26 = var26 + var59;
                      var27 = var27 + var42;
                      var29 = var29 + var60;
                      var30 = var30 + var43;
                      var32 = var32 + var61;
                      var33 = var33 + var44;
                      var35 = var35 + var62;
                      param0 = param0 + (float)this.field_t;
                      continue L24;
                    }
                  }
                }
              } else {
                return;
              }
            }
          }
        }
        if (param1 > param2) {
          if (param2 < (float)this.field_v) {
            L26: {
              if (param0 <= (float)this.field_v) {
                break L26;
              } else {
                param0 = (float)this.field_v;
                break L26;
              }
            }
            L27: {
              if (param1 <= (float)this.field_v) {
                break L27;
              } else {
                param1 = (float)this.field_v;
                break L27;
              }
            }
            if (param0 >= param1) {
              L28: {
                param3 = param5;
                param6 = param8;
                param9 = param11;
                param12 = param14;
                param19 = param21;
                var24 = var26;
                var27 = var29;
                var30 = var32;
                var33 = var35;
                if (param2 >= 0.0f) {
                  break L28;
                } else {
                  param5 = param5 - var54 * param2;
                  param3 = param3 - var45 * param2;
                  param8 = param8 - var55 * param2;
                  param6 = param6 - var46 * param2;
                  param11 = param11 - var56 * param2;
                  param9 = param9 - var47 * param2;
                  param14 = param14 - var57 * param2;
                  param12 = param12 - var48 * param2;
                  param21 = (int)((float)param21 - var58 * 3.0f);
                  param19 = (int)((float)param19 - var49 * param2);
                  var26 = var26 - var59 * param2;
                  var24 = var24 - var50 * param2;
                  var29 = var29 - var60 * param2;
                  var27 = var27 - var51 * param2;
                  var32 = var32 - var61 * param2;
                  var30 = var30 - var52 * param2;
                  var35 = var35 - var62 * param2;
                  var33 = var33 - var53 * param2;
                  param2 = 0.0f;
                  break L28;
                }
              }
              L29: {
                if (param1 >= 0.0f) {
                  break L29;
                } else {
                  param4 = param4 - var36 * param1;
                  param7 = param7 - var37 * param1;
                  param10 = param10 - var38 * param1;
                  param13 = param13 - var39 * param1;
                  param20 = (int)((float)param20 - var40 * param1);
                  var25 = var25 - var41 * param1;
                  var28 = var28 - var42 * param1;
                  var31 = var31 - var43 * param1;
                  var34 = var34 - var44 * param1;
                  param1 = 0.0f;
                  break L29;
                }
              }
              if (var45 >= var54) {
                param0 = param0 - param1;
                param1 = param1 - param2;
                param2 = (float)this.field_p[(int)param2];
                L30: while (true) {
                  param1 = param1 - 1.0f;
                  if (param1 < 0.0f) {
                    L31: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        return;
                      } else {
                        this.b(this.field_a, this.field_w, (int)param2, (int)param5, (int)param4, param8, param7, param11, param10, param14, param13, (float)param21, (float)param20, var26, var25, var29, var28, var32, var31, var35, var34);
                        param5 = param5 + var54;
                        param4 = param4 + var36;
                        param8 = param8 + var55;
                        param7 = param7 + var37;
                        param11 = param11 + var56;
                        param10 = param10 + var38;
                        param14 = param14 + var57;
                        param13 = param13 + var39;
                        param21 = (int)((float)param21 + var58);
                        param20 = (int)((float)param20 + var40);
                        var26 = var26 + var59;
                        var25 = var25 + var41;
                        var29 = var29 + var60;
                        var28 = var28 + var42;
                        var32 = var32 + var61;
                        var31 = var31 + var43;
                        var35 = var35 + var62;
                        var34 = var34 + var44;
                        param2 = param2 + (float)this.field_t;
                        continue L31;
                      }
                    }
                  } else {
                    this.b(this.field_a, this.field_w, (int)param2, (int)param5, (int)param3, param8, param6, param11, param9, param14, param12, (float)param21, (float)param19, var26, var24, var29, var27, var32, var30, var35, var33);
                    param5 = param5 + var54;
                    param3 = param3 + var45;
                    param8 = param8 + var55;
                    param6 = param6 + var46;
                    param11 = param11 + var56;
                    param9 = param9 + var47;
                    param14 = param14 + var57;
                    param12 = param12 + var48;
                    param21 = (int)((float)param21 + var58);
                    param19 = (int)((float)param19 + var49);
                    var26 = var26 + var59;
                    var24 = var24 + var50;
                    var29 = var29 + var60;
                    var27 = var27 + var51;
                    var32 = var32 + var61;
                    var30 = var30 + var52;
                    var35 = var35 + var62;
                    var33 = var33 + var53;
                    param2 = param2 + (float)this.field_t;
                    continue L30;
                  }
                }
              } else {
                param0 = param0 - param1;
                param1 = param1 - param2;
                param2 = (float)this.field_p[(int)param2];
                L32: while (true) {
                  param1 = param1 - 1.0f;
                  if (param1 < 0.0f) {
                    L33: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        return;
                      } else {
                        this.b(this.field_a, this.field_w, (int)param2, (int)param4, (int)param5, param7, param8, param10, param11, param13, param14, (float)param20, (float)param21, var25, var26, var28, var29, var31, var32, var34, var35);
                        param4 = param4 + var36;
                        param5 = param5 + var54;
                        param7 = param7 + var37;
                        param8 = param8 + var55;
                        param10 = param10 + var38;
                        param11 = param11 + var56;
                        param13 = param13 + var39;
                        param14 = param14 + var57;
                        param20 = (int)((float)param20 + var40);
                        param21 = (int)((float)param21 + var58);
                        var25 = var25 + var41;
                        var26 = var26 + var59;
                        var28 = var28 + var42;
                        var29 = var29 + var60;
                        var31 = var31 + var43;
                        var32 = var32 + var61;
                        var34 = var34 + var44;
                        var35 = var35 + var62;
                        param2 = param2 + (float)this.field_t;
                        continue L33;
                      }
                    }
                  } else {
                    this.b(this.field_a, this.field_w, (int)param2, (int)param3, (int)param5, param6, param8, param9, param11, param12, param14, (float)param19, (float)param21, var24, var26, var27, var29, var30, var32, var33, var35);
                    param3 = param3 + var45;
                    param5 = param5 + var54;
                    param6 = param6 + var46;
                    param8 = param8 + var55;
                    param9 = param9 + var47;
                    param11 = param11 + var56;
                    param12 = param12 + var48;
                    param14 = param14 + var57;
                    param19 = (int)((float)param19 + var49);
                    param21 = (int)((float)param21 + var58);
                    var24 = var24 + var50;
                    var26 = var26 + var59;
                    var27 = var27 + var51;
                    var29 = var29 + var60;
                    var30 = var30 + var52;
                    var32 = var32 + var61;
                    var33 = var33 + var53;
                    var35 = var35 + var62;
                    param2 = param2 + (float)this.field_t;
                    continue L32;
                  }
                }
              }
            } else {
              L34: {
                param4 = param5;
                param7 = param8;
                param10 = param11;
                param13 = param14;
                param20 = param21;
                var25 = var26;
                var28 = var29;
                var31 = var32;
                var34 = var35;
                if (param2 >= 0.0f) {
                  break L34;
                } else {
                  param5 = param5 - var54 * param2;
                  param4 = param4 - var45 * param2;
                  param8 = param8 - var55 * param2;
                  param7 = param7 - var46 * param2;
                  param11 = param11 - var56 * param2;
                  param10 = param10 - var47 * param2;
                  param14 = param14 - var57 * param2;
                  param13 = param13 - var48 * param2;
                  param21 = (int)((float)param21 - var58 * 3.0f);
                  param20 = (int)((float)param20 - var49 * param2);
                  var26 = var26 - var59 * param2;
                  var25 = var25 - var50 * param2;
                  var29 = var29 - var60 * param2;
                  var28 = var28 - var51 * param2;
                  var32 = var32 - var61 * param2;
                  var31 = var31 - var52 * param2;
                  var35 = var35 - var62 * param2;
                  var34 = var34 - var53 * param2;
                  param2 = 0.0f;
                  break L34;
                }
              }
              L35: {
                if (param0 >= 0.0f) {
                  break L35;
                } else {
                  param3 = param3 - var36 * param0;
                  param6 = param6 - var37 * param0;
                  param9 = param9 - var38 * param0;
                  param12 = param12 - var39 * param0;
                  param19 = (int)((float)param19 - var40 * param0);
                  var24 = var24 - var41 * param0;
                  var27 = var27 - var42 * param0;
                  var30 = var30 - var43 * param0;
                  var33 = var33 - var44 * param0;
                  param0 = 0.0f;
                  break L35;
                }
              }
              if (var45 >= var54) {
                param1 = param1 - param0;
                param0 = param0 - param2;
                param2 = (float)this.field_p[(int)param2];
                L36: while (true) {
                  param0 = param0 - 1.0f;
                  if (param0 < 0.0f) {
                    L37: while (true) {
                      param1 = param1 - 1.0f;
                      if (param1 < 0.0f) {
                        return;
                      } else {
                        this.b(this.field_a, this.field_w, (int)param2, (int)param3, (int)param4, param6, param7, param9, param10, param12, param13, (float)param19, (float)param20, var24, var25, var27, var28, var30, var31, var33, var34);
                        param3 = param3 + var36;
                        param4 = param4 + var45;
                        param6 = param6 + var37;
                        param7 = param7 + var46;
                        param9 = param9 + var38;
                        param10 = param10 + var47;
                        param12 = param12 + var39;
                        param13 = param13 + var48;
                        param19 = (int)((float)param19 + var40);
                        param20 = (int)((float)param20 + var49);
                        var24 = var24 + var41;
                        var25 = var25 + var50;
                        var27 = var27 + var42;
                        var28 = var28 + var51;
                        var30 = var30 + var43;
                        var31 = var31 + var52;
                        var33 = var33 + var44;
                        var34 = var34 + var53;
                        param2 = param2 + (float)this.field_t;
                        continue L37;
                      }
                    }
                  } else {
                    this.b(this.field_a, this.field_w, (int)param2, (int)param5, (int)param4, param8, param7, param11, param10, param14, param13, (float)param21, (float)param20, var26, var25, var29, var28, var32, var31, var35, var34);
                    param5 = param5 + var54;
                    param4 = param4 + var45;
                    param8 = param8 + var55;
                    param7 = param7 + var46;
                    param11 = param11 + var56;
                    param10 = param10 + var47;
                    param14 = param14 + var57;
                    param13 = param13 + var48;
                    param21 = (int)((float)param21 + var58);
                    param20 = (int)((float)param20 + var49);
                    var26 = var26 + var59;
                    var25 = var25 + var50;
                    var29 = var29 + var60;
                    var28 = var28 + var51;
                    var32 = var32 + var61;
                    var31 = var31 + var52;
                    var35 = var35 + var62;
                    var34 = var34 + var53;
                    param2 = param2 + (float)this.field_t;
                    continue L36;
                  }
                }
              } else {
                param1 = param1 - param0;
                param0 = param0 - param2;
                param2 = (float)this.field_p[(int)param2];
                L38: while (true) {
                  param0 = param0 - 1.0f;
                  if (param0 < 0.0f) {
                    L39: while (true) {
                      param1 = param1 - 1.0f;
                      if (param1 < 0.0f) {
                        return;
                      } else {
                        this.b(this.field_a, this.field_w, (int)param2, (int)param4, (int)param3, param7, param6, param10, param9, param13, param12, (float)param20, (float)param19, var25, var24, var28, var27, var31, var30, var34, var33);
                        param4 = param4 + var45;
                        param3 = param3 + var36;
                        param7 = param7 + var46;
                        param6 = param6 + var37;
                        param10 = param10 + var47;
                        param9 = param9 + var38;
                        param13 = param13 + var48;
                        param12 = param12 + var39;
                        param20 = (int)((float)param20 + var49);
                        param19 = (int)((float)param19 + var40);
                        var25 = var25 + var50;
                        var24 = var24 + var41;
                        var28 = var28 + var51;
                        var27 = var27 + var42;
                        var31 = var31 + var52;
                        var30 = var30 + var43;
                        var34 = var34 + var53;
                        var33 = var33 + var44;
                        param2 = param2 + (float)this.field_t;
                        continue L39;
                      }
                    }
                  } else {
                    this.b(this.field_a, this.field_w, (int)param2, (int)param4, (int)param5, param7, param8, param10, param11, param13, param14, (float)param20, (float)param21, var25, var26, var28, var29, var31, var32, var34, var35);
                    param4 = param4 + var45;
                    param5 = param5 + var54;
                    param7 = param7 + var46;
                    param8 = param8 + var55;
                    param10 = param10 + var47;
                    param11 = param11 + var56;
                    param13 = param13 + var48;
                    param14 = param14 + var57;
                    param20 = (int)((float)param20 + var49);
                    param21 = (int)((float)param21 + var58);
                    var25 = var25 + var50;
                    var26 = var26 + var59;
                    var28 = var28 + var51;
                    var29 = var29 + var60;
                    var31 = var31 + var52;
                    var32 = var32 + var61;
                    var34 = var34 + var53;
                    var35 = var35 + var62;
                    param2 = param2 + (float)this.field_t;
                    continue L38;
                  }
                }
              }
            }
          } else {
            return;
          }
        } else {
          if (param1 < (float)this.field_v) {
            L40: {
              if (param2 <= (float)this.field_v) {
                break L40;
              } else {
                param2 = (float)this.field_v;
                break L40;
              }
            }
            L41: {
              if (param0 <= (float)this.field_v) {
                break L41;
              } else {
                param0 = (float)this.field_v;
                break L41;
              }
            }
            if (param2 >= param0) {
              L42: {
                param5 = param4;
                param8 = param7;
                param11 = param10;
                param14 = param13;
                param21 = param20;
                var26 = var25;
                var29 = var28;
                var32 = var31;
                var35 = var34;
                if (param1 >= 0.0f) {
                  break L42;
                } else {
                  param5 = param5 - var36 * param1;
                  param4 = param4 - var45 * param1;
                  param8 = param8 - var37 * param1;
                  param7 = param7 - var46 * param1;
                  param11 = param11 - var38 * param1;
                  param10 = param10 - var47 * param1;
                  param14 = param14 - var39 * param1;
                  param13 = param13 - var48 * param1;
                  param21 = (int)((float)param21 - var40 * param1);
                  param20 = (int)((float)param20 - var49 * param1);
                  var26 = var26 - var41 * param1;
                  var25 = var25 - var50 * param1;
                  var29 = var29 - var42 * param1;
                  var28 = var28 - var51 * param1;
                  var32 = var32 - var43 * param1;
                  var31 = var31 - var52 * param1;
                  var35 = var35 - var44 * param1;
                  var34 = var34 - var53 * param1;
                  param1 = 0.0f;
                  break L42;
                }
              }
              L43: {
                if (param0 >= 0.0f) {
                  break L43;
                } else {
                  param3 = param3 - var54 * param0;
                  param6 = param6 - var55 * param0;
                  param9 = param9 - var56 * param0;
                  param12 = param12 - var57 * param0;
                  param19 = (int)((float)param19 - var58 * param0);
                  var24 = var24 - var59 * param0;
                  var27 = var27 - var60 * param0;
                  var30 = var30 - var61 * param0;
                  var33 = var33 - var62 * param0;
                  param0 = 0.0f;
                  break L43;
                }
              }
              param2 = param2 - param0;
              param0 = param0 - param1;
              param1 = (float)this.field_p[(int)param1];
              if (var36 >= var45) {
                L44: while (true) {
                  param0 = param0 - 1.0f;
                  if (param0 < 0.0f) {
                    L45: while (true) {
                      param2 = param2 - 1.0f;
                      if (param2 < 0.0f) {
                        return;
                      } else {
                        this.b(this.field_a, this.field_w, (int)param1, (int)param4, (int)param3, param7, param6, param10, param9, param13, param12, (float)param20, (float)param19, var25, var24, var28, var27, var31, var30, var34, var33);
                        param4 = param4 + var45;
                        param3 = param3 + var54;
                        param7 = param7 + var46;
                        param6 = param6 + var55;
                        param10 = param10 + var47;
                        param9 = param9 + var56;
                        param13 = param13 + var48;
                        param12 = param12 + var57;
                        param20 = (int)((float)param20 + var49);
                        param19 = (int)((float)param19 + var58);
                        var25 = var25 + var50;
                        var24 = var24 + var59;
                        var28 = var28 + var51;
                        var27 = var27 + var60;
                        var31 = var31 + var52;
                        var30 = var30 + var61;
                        var34 = var34 + var53;
                        var33 = var33 + var62;
                        param1 = param1 + (float)this.field_t;
                        continue L45;
                      }
                    }
                  } else {
                    this.b(this.field_a, this.field_w, (int)param1, (int)param4, (int)param5, param7, param8, param10, param11, param13, param14, (float)param20, (float)param21, var25, var26, var28, var29, var31, var32, var34, var35);
                    param4 = param4 + var45;
                    param5 = param5 + var36;
                    param7 = param7 + var46;
                    param8 = param8 + var37;
                    param10 = param10 + var47;
                    param11 = param11 + var38;
                    param13 = param13 + var48;
                    param14 = param14 + var39;
                    param20 = (int)((float)param20 + var49);
                    param21 = (int)((float)param21 + var40);
                    var25 = var25 + var50;
                    var26 = var26 + var41;
                    var28 = var28 + var51;
                    var29 = var29 + var42;
                    var31 = var31 + var52;
                    var32 = var32 + var43;
                    var34 = var34 + var53;
                    var35 = var35 + var44;
                    param1 = param1 + (float)this.field_t;
                    continue L44;
                  }
                }
              } else {
                L46: while (true) {
                  param0 = param0 - 1.0f;
                  if (param0 < 0.0f) {
                    L47: while (true) {
                      param2 = param2 - 1.0f;
                      if (param2 < 0.0f) {
                        return;
                      } else {
                        this.b(this.field_a, this.field_w, (int)param1, (int)param3, (int)param4, param6, param7, param9, param10, param12, param13, (float)param19, (float)param20, var24, var25, var27, var28, var30, var31, var33, var34);
                        param3 = param3 + var54;
                        param4 = param4 + var45;
                        param6 = param6 + var55;
                        param7 = param7 + var46;
                        param9 = param9 + var56;
                        param10 = param10 + var47;
                        param12 = param12 + var57;
                        param13 = param13 + var48;
                        param19 = (int)((float)param19 + var58);
                        param20 = (int)((float)param20 + var49);
                        var24 = var24 + var59;
                        var25 = var25 + var50;
                        var27 = var27 + var60;
                        var28 = var28 + var51;
                        var30 = var30 + var61;
                        var31 = var31 + var52;
                        var33 = var33 + var62;
                        var34 = var34 + var53;
                        param1 = param1 + (float)this.field_t;
                        continue L47;
                      }
                    }
                  } else {
                    this.b(this.field_a, this.field_w, (int)param1, (int)param5, (int)param4, param8, param7, param11, param10, param14, param13, (float)param21, (float)param20, var26, var25, var29, var28, var32, var31, var35, var34);
                    param5 = param5 + var36;
                    param4 = param4 + var45;
                    param8 = param8 + var37;
                    param7 = param7 + var46;
                    param11 = param11 + var38;
                    param10 = param10 + var47;
                    param14 = param14 + var39;
                    param13 = param13 + var48;
                    param21 = (int)((float)param21 + var40);
                    param20 = (int)((float)param20 + var49);
                    var26 = var26 + var41;
                    var25 = var25 + var50;
                    var29 = var29 + var42;
                    var28 = var28 + var51;
                    var32 = var32 + var43;
                    var31 = var31 + var52;
                    var35 = var35 + var44;
                    var34 = var34 + var53;
                    param1 = param1 + (float)this.field_t;
                    continue L46;
                  }
                }
              }
            } else {
              L48: {
                param3 = param4;
                param6 = param7;
                param9 = param10;
                param12 = param13;
                param19 = param20;
                var24 = var25;
                var27 = var28;
                var30 = var31;
                var33 = var34;
                if (param1 >= 0.0f) {
                  break L48;
                } else {
                  param3 = param3 - var36 * param1;
                  param4 = param4 - var45 * param1;
                  param6 = param6 - var37 * param1;
                  param7 = param7 - var46 * param1;
                  param9 = param9 - var38 * param1;
                  param10 = param10 - var47 * param1;
                  param12 = param12 - var39 * param1;
                  param13 = param13 - var48 * param1;
                  param19 = (int)((float)param19 - var40 * param1);
                  param20 = (int)((float)param20 - var49 * param1);
                  var24 = var24 - var41 * param1;
                  var25 = var25 - var50 * param1;
                  var27 = var27 - var42 * param1;
                  var28 = var28 - var51 * param1;
                  var30 = var30 - var43 * param1;
                  var31 = var31 - var52 * param1;
                  var33 = var33 - var44 * param1;
                  var34 = var34 - var53 * param1;
                  param1 = 0.0f;
                  break L48;
                }
              }
              L49: {
                if (param2 >= 0.0f) {
                  break L49;
                } else {
                  param5 = param5 - var54 * param2;
                  param8 = param8 - var55 * param2;
                  param11 = param11 - var56 * param2;
                  param14 = param14 - var57 * param2;
                  param21 = (int)((float)param21 - var58 * param2);
                  var26 = var26 - var59 * param2;
                  var29 = var29 - var60 * param2;
                  var32 = var32 - var61 * param2;
                  var35 = var35 - var62 * param2;
                  param2 = 0.0f;
                  break L49;
                }
              }
              L50: {
                L51: {
                  if (param1 == param2) {
                    break L51;
                  } else {
                    if (var36 < var45) {
                      break L50;
                    } else {
                      break L51;
                    }
                  }
                }
                L52: {
                  if (param1 != param2) {
                    break L52;
                  } else {
                    if (var36 <= var54) {
                      break L52;
                    } else {
                      break L50;
                    }
                  }
                }
                param0 = param0 - param2;
                param2 = param2 - param1;
                param1 = (float)this.field_p[(int)param1];
                L53: while (true) {
                  param2 = param2 - 1.0f;
                  if (param2 < 0.0f) {
                    L54: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        return;
                      } else {
                        this.b(this.field_a, this.field_w, (int)param1, (int)param5, (int)param3, param8, param6, param11, param9, param14, param12, (float)param21, (float)param19, var26, var24, var29, var27, var32, var30, var35, var33);
                        param5 = param5 + var54;
                        param3 = param3 + var36;
                        param8 = param8 + var55;
                        param6 = param6 + var37;
                        param11 = param11 + var56;
                        param9 = param9 + var38;
                        param14 = param14 + var57;
                        param12 = param12 + var39;
                        param21 = (int)((float)param21 + var58);
                        param19 = (int)((float)param19 + var40);
                        var26 = var26 + var59;
                        var24 = var24 + var41;
                        var29 = var29 + var60;
                        var27 = var27 + var42;
                        var32 = var32 + var61;
                        var30 = var30 + var43;
                        var35 = var35 + var62;
                        var33 = var33 + var44;
                        param1 = param1 + (float)this.field_t;
                        continue L54;
                      }
                    }
                  } else {
                    this.b(this.field_a, this.field_w, (int)param1, (int)param4, (int)param3, param7, param6, param10, param9, param13, param12, (float)param20, (float)param19, var25, var24, var28, var27, var31, var30, var34, var33);
                    param4 = param4 + var45;
                    param3 = param3 + var36;
                    param7 = param7 + var46;
                    param6 = param6 + var37;
                    param10 = param10 + var47;
                    param9 = param9 + var38;
                    param13 = param13 + var48;
                    param12 = param12 + var39;
                    param20 = (int)((float)param20 + var49);
                    param19 = (int)((float)param19 + var40);
                    var25 = var25 + var50;
                    var24 = var24 + var41;
                    var28 = var28 + var51;
                    var27 = var27 + var42;
                    var31 = var31 + var52;
                    var30 = var30 + var43;
                    var34 = var34 + var53;
                    var33 = var33 + var44;
                    param1 = param1 + (float)this.field_t;
                    continue L53;
                  }
                }
              }
              param0 = param0 - param2;
              param2 = param2 - param1;
              param1 = (float)this.field_p[(int)param1];
              L55: while (true) {
                param2 = param2 - 1.0f;
                if (param2 < 0.0f) {
                  L56: while (true) {
                    param0 = param0 - 1.0f;
                    if (param0 < 0.0f) {
                      return;
                    } else {
                      this.b(this.field_a, this.field_w, (int)param1, (int)param3, (int)param5, param6, param8, param9, param11, param12, param14, (float)param19, (float)param21, var24, var26, var27, var29, var30, var32, var33, var35);
                      param3 = param3 + var36;
                      param5 = param5 + var54;
                      param6 = param6 + var37;
                      param8 = param8 + var55;
                      param9 = param9 + var38;
                      param11 = param11 + var56;
                      param12 = param12 + var39;
                      param14 = param14 + var57;
                      param19 = (int)((float)param19 + var40);
                      param21 = (int)((float)param21 + var58);
                      var24 = var24 + var41;
                      var26 = var26 + var59;
                      var27 = var27 + var42;
                      var29 = var29 + var60;
                      var30 = var30 + var43;
                      var32 = var32 + var61;
                      var33 = var33 + var44;
                      var35 = var35 + var62;
                      param1 = param1 + (float)this.field_t;
                      continue L56;
                    }
                  }
                } else {
                  this.b(this.field_a, this.field_w, (int)param1, (int)param3, (int)param4, param6, param7, param9, param10, param12, param13, (float)param19, (float)param20, var24, var25, var27, var28, var30, var31, var33, var34);
                  param3 = param3 + var36;
                  param4 = param4 + var45;
                  param6 = param6 + var37;
                  param7 = param7 + var46;
                  param9 = param9 + var38;
                  param10 = param10 + var47;
                  param12 = param12 + var39;
                  param13 = param13 + var48;
                  param19 = (int)((float)param19 + var40);
                  param20 = (int)((float)param20 + var49);
                  var24 = var24 + var41;
                  var25 = var25 + var50;
                  var27 = var27 + var42;
                  var28 = var28 + var51;
                  var30 = var30 + var43;
                  var31 = var31 + var52;
                  var33 = var33 + var44;
                  var34 = var34 + var53;
                  param1 = param1 + (float)this.field_t;
                  continue L55;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    final void b(float param0, float param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8, int param9) {
        float var11;
        float var12;
        float var13;
        float var14;
        float var15;
        float var16;
        float var17;
        float var18;
        float var19;
        float var20;
        float var21;
        float var22;
        if (!this.field_s) {
          L0: {
            var11 = param4 - param3;
            var12 = param1 - param0;
            var13 = param5 - param3;
            var14 = param2 - param0;
            var15 = param7 - param6;
            var16 = param8 - param6;
            var17 = 0.0f;
            if (param1 == param0) {
              break L0;
            } else {
              var17 = (param4 - param3) / (param1 - param0);
              break L0;
            }
          }
          L1: {
            var18 = 0.0f;
            if (param2 == param1) {
              break L1;
            } else {
              var18 = (param5 - param4) / (param2 - param1);
              break L1;
            }
          }
          L2: {
            var19 = 0.0f;
            if (param2 == param0) {
              break L2;
            } else {
              var19 = (param3 - param5) / (param0 - param2);
              break L2;
            }
          }
          var20 = var11 * var14 - var13 * var12;
          if (var20 != 0.0f) {
            L3: {
              var21 = (var15 * var14 - var16 * var12) / var20;
              var22 = (var16 * var11 - var15 * var13) / var20;
              if (param0 > param1) {
                break L3;
              } else {
                if (param0 > param2) {
                  break L3;
                } else {
                  if (param0 < (float)this.field_v) {
                    L4: {
                      if (param1 <= (float)this.field_v) {
                        break L4;
                      } else {
                        param1 = (float)this.field_v;
                        break L4;
                      }
                    }
                    L5: {
                      if (param2 <= (float)this.field_v) {
                        break L5;
                      } else {
                        param2 = (float)this.field_v;
                        break L5;
                      }
                    }
                    param6 = param6 - var21 * param3 + var21;
                    if (param1 >= param2) {
                      L6: {
                        param4 = param3;
                        if (param0 >= 0.0f) {
                          break L6;
                        } else {
                          param4 = param4 - var19 * param0;
                          param3 = param3 - var17 * param0;
                          param6 = param6 - var22 * param0;
                          param0 = 0.0f;
                          break L6;
                        }
                      }
                      L7: {
                        if (param2 >= 0.0f) {
                          break L7;
                        } else {
                          param5 = param5 - var18 * param2;
                          param2 = 0.0f;
                          break L7;
                        }
                      }
                      L8: {
                        if (param0 == param2) {
                          break L8;
                        } else {
                          if (var19 >= var17) {
                            break L8;
                          } else {
                            param1 = param1 - param2;
                            param2 = param2 - param0;
                            param0 = (float)this.field_p[(int)param0];
                            L9: while (true) {
                              param2 = param2 - 1.0f;
                              if (param2 < 0.0f) {
                                L10: while (true) {
                                  param1 = param1 - 1.0f;
                                  if (param1 < 0.0f) {
                                    return;
                                  } else {
                                    this.b(this.field_a, this.field_u, (int)param0, param9, 0, (int)param5, (int)param3, param6, var21);
                                    param5 = param5 + var18;
                                    param3 = param3 + var17;
                                    param6 = param6 + var22;
                                    param0 = param0 + (float)this.field_t;
                                    continue L10;
                                  }
                                }
                              } else {
                                this.b(this.field_a, this.field_u, (int)param0, param9, 0, (int)param4, (int)param3, param6, var21);
                                param4 = param4 + var19;
                                param3 = param3 + var17;
                                param6 = param6 + var22;
                                param0 = param0 + (float)this.field_t;
                                continue L9;
                              }
                            }
                          }
                        }
                      }
                      if (param0 == param2) {
                        if (var18 > var17) {
                          param1 = param1 - param2;
                          param2 = param2 - param0;
                          param0 = (float)this.field_p[(int)param0];
                          L11: while (true) {
                            param2 = param2 - 1.0f;
                            if (param2 < 0.0f) {
                              L12: while (true) {
                                param1 = param1 - 1.0f;
                                if (param1 < 0.0f) {
                                  return;
                                } else {
                                  this.b(this.field_a, this.field_u, (int)param0, param9, 0, (int)param5, (int)param3, param6, var21);
                                  param5 = param5 + var18;
                                  param3 = param3 + var17;
                                  param6 = param6 + var22;
                                  param0 = param0 + (float)this.field_t;
                                  continue L12;
                                }
                              }
                            } else {
                              this.b(this.field_a, this.field_u, (int)param0, param9, 0, (int)param4, (int)param3, param6, var21);
                              param4 = param4 + var19;
                              param3 = param3 + var17;
                              param6 = param6 + var22;
                              param0 = param0 + (float)this.field_t;
                              continue L11;
                            }
                          }
                        } else {
                          param1 = param1 - param2;
                          param2 = param2 - param0;
                          param0 = (float)this.field_p[(int)param0];
                          L13: while (true) {
                            param2 = param2 - 1.0f;
                            if (param2 < 0.0f) {
                              L14: while (true) {
                                param1 = param1 - 1.0f;
                                if (param1 < 0.0f) {
                                  return;
                                } else {
                                  this.b(this.field_a, this.field_u, (int)param0, param9, 0, (int)param3, (int)param5, param6, var21);
                                  param5 = param5 + var18;
                                  param3 = param3 + var17;
                                  param6 = param6 + var22;
                                  param0 = param0 + (float)this.field_t;
                                  continue L14;
                                }
                              }
                            } else {
                              this.b(this.field_a, this.field_u, (int)param0, param9, 0, (int)param3, (int)param4, param6, var21);
                              param4 = param4 + var19;
                              param3 = param3 + var17;
                              param6 = param6 + var22;
                              param0 = param0 + (float)this.field_t;
                              continue L13;
                            }
                          }
                        }
                      } else {
                        param1 = param1 - param2;
                        param2 = param2 - param0;
                        param0 = (float)this.field_p[(int)param0];
                        L15: while (true) {
                          param2 = param2 - 1.0f;
                          if (param2 < 0.0f) {
                            L16: while (true) {
                              param1 = param1 - 1.0f;
                              if (param1 < 0.0f) {
                                return;
                              } else {
                                this.b(this.field_a, this.field_u, (int)param0, param9, 0, (int)param3, (int)param5, param6, var21);
                                param5 = param5 + var18;
                                param3 = param3 + var17;
                                param6 = param6 + var22;
                                param0 = param0 + (float)this.field_t;
                                continue L16;
                              }
                            }
                          } else {
                            this.b(this.field_a, this.field_u, (int)param0, param9, 0, (int)param3, (int)param4, param6, var21);
                            param4 = param4 + var19;
                            param3 = param3 + var17;
                            param6 = param6 + var22;
                            param0 = param0 + (float)this.field_t;
                            continue L15;
                          }
                        }
                      }
                    } else {
                      L17: {
                        param5 = param3;
                        if (param0 >= 0.0f) {
                          break L17;
                        } else {
                          param5 = param5 - var19 * param0;
                          param3 = param3 - var17 * param0;
                          param6 = param6 - var22 * param0;
                          param0 = 0.0f;
                          break L17;
                        }
                      }
                      L18: {
                        if (param1 >= 0.0f) {
                          break L18;
                        } else {
                          param4 = param4 - var18 * param1;
                          param1 = 0.0f;
                          break L18;
                        }
                      }
                      L19: {
                        if (param0 == param1) {
                          break L19;
                        } else {
                          if (var19 >= var17) {
                            break L19;
                          } else {
                            param2 = param2 - param1;
                            param1 = param1 - param0;
                            param0 = (float)this.field_p[(int)param0];
                            L20: while (true) {
                              param1 = param1 - 1.0f;
                              if (param1 < 0.0f) {
                                L21: while (true) {
                                  param2 = param2 - 1.0f;
                                  if (param2 < 0.0f) {
                                    return;
                                  } else {
                                    this.b(this.field_a, this.field_u, (int)param0, param9, 0, (int)param5, (int)param4, param6, var21);
                                    param5 = param5 + var19;
                                    param4 = param4 + var18;
                                    param6 = param6 + var22;
                                    param0 = param0 + (float)this.field_t;
                                    continue L21;
                                  }
                                }
                              } else {
                                this.b(this.field_a, this.field_u, (int)param0, param9, 0, (int)param5, (int)param3, param6, var21);
                                param5 = param5 + var19;
                                param3 = param3 + var17;
                                param6 = param6 + var22;
                                param0 = param0 + (float)this.field_t;
                                continue L20;
                              }
                            }
                          }
                        }
                      }
                      if (param0 == param1) {
                        if (var19 > var18) {
                          param2 = param2 - param1;
                          param1 = param1 - param0;
                          param0 = (float)this.field_p[(int)param0];
                          L22: while (true) {
                            param1 = param1 - 1.0f;
                            if (param1 < 0.0f) {
                              L23: while (true) {
                                param2 = param2 - 1.0f;
                                if (param2 < 0.0f) {
                                  return;
                                } else {
                                  this.b(this.field_a, this.field_u, (int)param0, param9, 0, (int)param5, (int)param4, param6, var21);
                                  param5 = param5 + var19;
                                  param4 = param4 + var18;
                                  param6 = param6 + var22;
                                  param0 = param0 + (float)this.field_t;
                                  continue L23;
                                }
                              }
                            } else {
                              this.b(this.field_a, this.field_u, (int)param0, param9, 0, (int)param5, (int)param3, param6, var21);
                              param5 = param5 + var19;
                              param3 = param3 + var17;
                              param6 = param6 + var22;
                              param0 = param0 + (float)this.field_t;
                              continue L22;
                            }
                          }
                        } else {
                          param2 = param2 - param1;
                          param1 = param1 - param0;
                          param0 = (float)this.field_p[(int)param0];
                          L24: while (true) {
                            param1 = param1 - 1.0f;
                            if (param1 < 0.0f) {
                              L25: while (true) {
                                param2 = param2 - 1.0f;
                                if (param2 < 0.0f) {
                                  return;
                                } else {
                                  this.b(this.field_a, this.field_u, (int)param0, param9, 0, (int)param4, (int)param5, param6, var21);
                                  param5 = param5 + var19;
                                  param4 = param4 + var18;
                                  param6 = param6 + var22;
                                  param0 = param0 + (float)this.field_t;
                                  continue L25;
                                }
                              }
                            } else {
                              this.b(this.field_a, this.field_u, (int)param0, param9, 0, (int)param3, (int)param5, param6, var21);
                              param5 = param5 + var19;
                              param3 = param3 + var17;
                              param6 = param6 + var22;
                              param0 = param0 + (float)this.field_t;
                              continue L24;
                            }
                          }
                        }
                      } else {
                        param2 = param2 - param1;
                        param1 = param1 - param0;
                        param0 = (float)this.field_p[(int)param0];
                        L26: while (true) {
                          param1 = param1 - 1.0f;
                          if (param1 < 0.0f) {
                            L27: while (true) {
                              param2 = param2 - 1.0f;
                              if (param2 < 0.0f) {
                                return;
                              } else {
                                this.b(this.field_a, this.field_u, (int)param0, param9, 0, (int)param4, (int)param5, param6, var21);
                                param5 = param5 + var19;
                                param4 = param4 + var18;
                                param6 = param6 + var22;
                                param0 = param0 + (float)this.field_t;
                                continue L27;
                              }
                            }
                          } else {
                            this.b(this.field_a, this.field_u, (int)param0, param9, 0, (int)param3, (int)param5, param6, var21);
                            param5 = param5 + var19;
                            param3 = param3 + var17;
                            param6 = param6 + var22;
                            param0 = param0 + (float)this.field_t;
                            continue L26;
                          }
                        }
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            if (param1 > param2) {
              if (param2 < (float)this.field_v) {
                L28: {
                  if (param0 <= (float)this.field_v) {
                    break L28;
                  } else {
                    param0 = (float)this.field_v;
                    break L28;
                  }
                }
                L29: {
                  if (param1 <= (float)this.field_v) {
                    break L29;
                  } else {
                    param1 = (float)this.field_v;
                    break L29;
                  }
                }
                param8 = param8 - var21 * param5 + var21;
                if (param0 >= param1) {
                  L30: {
                    param3 = param5;
                    if (param2 >= 0.0f) {
                      break L30;
                    } else {
                      param3 = param3 - var18 * param2;
                      param5 = param5 - var19 * param2;
                      param8 = param8 - var22 * param2;
                      param2 = 0.0f;
                      break L30;
                    }
                  }
                  L31: {
                    if (param1 >= 0.0f) {
                      break L31;
                    } else {
                      param4 = param4 - var17 * param1;
                      param1 = 0.0f;
                      break L31;
                    }
                  }
                  if (var18 < var19) {
                    param0 = param0 - param1;
                    param1 = param1 - param2;
                    param2 = (float)this.field_p[(int)param2];
                    L32: while (true) {
                      param1 = param1 - 1.0f;
                      if (param1 < 0.0f) {
                        L33: while (true) {
                          param0 = param0 - 1.0f;
                          if (param0 < 0.0f) {
                            return;
                          } else {
                            this.b(this.field_a, this.field_u, (int)param2, param9, 0, (int)param4, (int)param5, param8, var21);
                            param4 = param4 + var17;
                            param5 = param5 + var19;
                            param8 = param8 + var22;
                            param2 = param2 + (float)this.field_t;
                            continue L33;
                          }
                        }
                      } else {
                        this.b(this.field_a, this.field_u, (int)param2, param9, 0, (int)param3, (int)param5, param8, var21);
                        param3 = param3 + var18;
                        param5 = param5 + var19;
                        param8 = param8 + var22;
                        param2 = param2 + (float)this.field_t;
                        continue L32;
                      }
                    }
                  } else {
                    param0 = param0 - param1;
                    param1 = param1 - param2;
                    param2 = (float)this.field_p[(int)param2];
                    L34: while (true) {
                      param1 = param1 - 1.0f;
                      if (param1 < 0.0f) {
                        L35: while (true) {
                          param0 = param0 - 1.0f;
                          if (param0 < 0.0f) {
                            return;
                          } else {
                            this.b(this.field_a, this.field_u, (int)param2, param9, 0, (int)param5, (int)param4, param8, var21);
                            param4 = param4 + var17;
                            param5 = param5 + var19;
                            param8 = param8 + var22;
                            param2 = param2 + (float)this.field_t;
                            continue L35;
                          }
                        }
                      } else {
                        this.b(this.field_a, this.field_u, (int)param2, param9, 0, (int)param5, (int)param3, param8, var21);
                        param3 = param3 + var18;
                        param5 = param5 + var19;
                        param8 = param8 + var22;
                        param2 = param2 + (float)this.field_t;
                        continue L34;
                      }
                    }
                  }
                } else {
                  L36: {
                    param4 = param5;
                    if (param2 >= 0.0f) {
                      break L36;
                    } else {
                      param4 = param4 - var18 * param2;
                      param5 = param5 - var19 * param2;
                      param8 = param8 - var22 * param2;
                      param2 = 0.0f;
                      break L36;
                    }
                  }
                  L37: {
                    if (param0 >= 0.0f) {
                      break L37;
                    } else {
                      param3 = param3 - var17 * param0;
                      param0 = 0.0f;
                      break L37;
                    }
                  }
                  if (var18 < var19) {
                    param1 = param1 - param0;
                    param0 = param0 - param2;
                    param2 = (float)this.field_p[(int)param2];
                    L38: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        L39: while (true) {
                          param1 = param1 - 1.0f;
                          if (param1 < 0.0f) {
                            return;
                          } else {
                            this.b(this.field_a, this.field_u, (int)param2, param9, 0, (int)param4, (int)param3, param8, var21);
                            param4 = param4 + var18;
                            param3 = param3 + var17;
                            param8 = param8 + var22;
                            param2 = param2 + (float)this.field_t;
                            continue L39;
                          }
                        }
                      } else {
                        this.b(this.field_a, this.field_u, (int)param2, param9, 0, (int)param4, (int)param5, param8, var21);
                        param4 = param4 + var18;
                        param5 = param5 + var19;
                        param8 = param8 + var22;
                        param2 = param2 + (float)this.field_t;
                        continue L38;
                      }
                    }
                  } else {
                    param1 = param1 - param0;
                    param0 = param0 - param2;
                    param2 = (float)this.field_p[(int)param2];
                    L40: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        L41: while (true) {
                          param1 = param1 - 1.0f;
                          if (param1 < 0.0f) {
                            return;
                          } else {
                            this.b(this.field_a, this.field_u, (int)param2, param9, 0, (int)param3, (int)param4, param8, var21);
                            param4 = param4 + var18;
                            param3 = param3 + var17;
                            param8 = param8 + var22;
                            param2 = param2 + (float)this.field_t;
                            continue L41;
                          }
                        }
                      } else {
                        this.b(this.field_a, this.field_u, (int)param2, param9, 0, (int)param5, (int)param4, param8, var21);
                        param4 = param4 + var18;
                        param5 = param5 + var19;
                        param8 = param8 + var22;
                        param2 = param2 + (float)this.field_t;
                        continue L40;
                      }
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              if (param1 < (float)this.field_v) {
                L42: {
                  if (param2 <= (float)this.field_v) {
                    break L42;
                  } else {
                    param2 = (float)this.field_v;
                    break L42;
                  }
                }
                L43: {
                  if (param0 <= (float)this.field_v) {
                    break L43;
                  } else {
                    param0 = (float)this.field_v;
                    break L43;
                  }
                }
                param7 = param7 - var21 * param4 + var21;
                if (param2 >= param0) {
                  L44: {
                    param5 = param4;
                    if (param1 >= 0.0f) {
                      break L44;
                    } else {
                      param5 = param5 - var17 * param1;
                      param4 = param4 - var18 * param1;
                      param7 = param7 - var22 * param1;
                      param1 = 0.0f;
                      break L44;
                    }
                  }
                  L45: {
                    if (param0 >= 0.0f) {
                      break L45;
                    } else {
                      param3 = param3 - var19 * param0;
                      param0 = 0.0f;
                      break L45;
                    }
                  }
                  if (var17 < var18) {
                    param2 = param2 - param0;
                    param0 = param0 - param1;
                    param1 = (float)this.field_p[(int)param1];
                    L46: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        L47: while (true) {
                          param2 = param2 - 1.0f;
                          if (param2 < 0.0f) {
                            return;
                          } else {
                            this.b(this.field_a, this.field_u, (int)param1, param9, 0, (int)param3, (int)param4, param7, var21);
                            param3 = param3 + var19;
                            param4 = param4 + var18;
                            param7 = param7 + var22;
                            param1 = param1 + (float)this.field_t;
                            continue L47;
                          }
                        }
                      } else {
                        this.b(this.field_a, this.field_u, (int)param1, param9, 0, (int)param5, (int)param4, param7, var21);
                        param5 = param5 + var17;
                        param4 = param4 + var18;
                        param7 = param7 + var22;
                        param1 = param1 + (float)this.field_t;
                        continue L46;
                      }
                    }
                  } else {
                    param2 = param2 - param0;
                    param0 = param0 - param1;
                    param1 = (float)this.field_p[(int)param1];
                    L48: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        L49: while (true) {
                          param2 = param2 - 1.0f;
                          if (param2 < 0.0f) {
                            return;
                          } else {
                            this.b(this.field_a, this.field_u, (int)param1, param9, 0, (int)param4, (int)param3, param7, var21);
                            param3 = param3 + var19;
                            param4 = param4 + var18;
                            param7 = param7 + var22;
                            param1 = param1 + (float)this.field_t;
                            continue L49;
                          }
                        }
                      } else {
                        this.b(this.field_a, this.field_u, (int)param1, param9, 0, (int)param4, (int)param5, param7, var21);
                        param5 = param5 + var17;
                        param4 = param4 + var18;
                        param7 = param7 + var22;
                        param1 = param1 + (float)this.field_t;
                        continue L48;
                      }
                    }
                  }
                } else {
                  L50: {
                    param3 = param4;
                    if (param1 >= 0.0f) {
                      break L50;
                    } else {
                      param3 = param3 - var17 * param1;
                      param4 = param4 - var18 * param1;
                      param7 = param7 - var22 * param1;
                      param1 = 0.0f;
                      break L50;
                    }
                  }
                  L51: {
                    if (param2 >= 0.0f) {
                      break L51;
                    } else {
                      param5 = param5 - var19 * param2;
                      param2 = 0.0f;
                      break L51;
                    }
                  }
                  L52: {
                    if (param1 == param2) {
                      break L52;
                    } else {
                      if (var17 >= var18) {
                        break L52;
                      } else {
                        param0 = param0 - param2;
                        param2 = param2 - param1;
                        param1 = (float)this.field_p[(int)param1];
                        L53: while (true) {
                          param2 = param2 - 1.0f;
                          if (param2 < 0.0f) {
                            L54: while (true) {
                              param0 = param0 - 1.0f;
                              if (param0 < 0.0f) {
                                return;
                              } else {
                                this.b(this.field_a, this.field_u, (int)param1, param9, 0, (int)param3, (int)param5, param7, var21);
                                param3 = param3 + var17;
                                param5 = param5 + var19;
                                param7 = param7 + var22;
                                param1 = param1 + (float)this.field_t;
                                continue L54;
                              }
                            }
                          } else {
                            this.b(this.field_a, this.field_u, (int)param1, param9, 0, (int)param3, (int)param4, param7, var21);
                            param3 = param3 + var17;
                            param4 = param4 + var18;
                            param7 = param7 + var22;
                            param1 = param1 + (float)this.field_t;
                            continue L53;
                          }
                        }
                      }
                    }
                  }
                  if (param1 == param2) {
                    if (var17 > var19) {
                      param0 = param0 - param2;
                      param2 = param2 - param1;
                      param1 = (float)this.field_p[(int)param1];
                      L55: while (true) {
                        param2 = param2 - 1.0f;
                        if (param2 < 0.0f) {
                          L56: while (true) {
                            param0 = param0 - 1.0f;
                            if (param0 < 0.0f) {
                              return;
                            } else {
                              this.b(this.field_a, this.field_u, (int)param1, param9, 0, (int)param3, (int)param5, param7, var21);
                              param3 = param3 + var17;
                              param5 = param5 + var19;
                              param7 = param7 + var22;
                              param1 = param1 + (float)this.field_t;
                              continue L56;
                            }
                          }
                        } else {
                          this.b(this.field_a, this.field_u, (int)param1, param9, 0, (int)param3, (int)param4, param7, var21);
                          param3 = param3 + var17;
                          param4 = param4 + var18;
                          param7 = param7 + var22;
                          param1 = param1 + (float)this.field_t;
                          continue L55;
                        }
                      }
                    } else {
                      param0 = param0 - param2;
                      param2 = param2 - param1;
                      param1 = (float)this.field_p[(int)param1];
                      L57: while (true) {
                        param2 = param2 - 1.0f;
                        if (param2 < 0.0f) {
                          L58: while (true) {
                            param0 = param0 - 1.0f;
                            if (param0 < 0.0f) {
                              return;
                            } else {
                              this.b(this.field_a, this.field_u, (int)param1, param9, 0, (int)param5, (int)param3, param7, var21);
                              param3 = param3 + var17;
                              param5 = param5 + var19;
                              param7 = param7 + var22;
                              param1 = param1 + (float)this.field_t;
                              continue L58;
                            }
                          }
                        } else {
                          this.b(this.field_a, this.field_u, (int)param1, param9, 0, (int)param4, (int)param3, param7, var21);
                          param3 = param3 + var17;
                          param4 = param4 + var18;
                          param7 = param7 + var22;
                          param1 = param1 + (float)this.field_t;
                          continue L57;
                        }
                      }
                    }
                  } else {
                    param0 = param0 - param2;
                    param2 = param2 - param1;
                    param1 = (float)this.field_p[(int)param1];
                    L59: while (true) {
                      param2 = param2 - 1.0f;
                      if (param2 < 0.0f) {
                        L60: while (true) {
                          param0 = param0 - 1.0f;
                          if (param0 < 0.0f) {
                            return;
                          } else {
                            this.b(this.field_a, this.field_u, (int)param1, param9, 0, (int)param5, (int)param3, param7, var21);
                            param3 = param3 + var17;
                            param5 = param5 + var19;
                            param7 = param7 + var22;
                            param1 = param1 + (float)this.field_t;
                            continue L60;
                          }
                        }
                      } else {
                        this.b(this.field_a, this.field_u, (int)param1, param9, 0, (int)param4, (int)param3, param7, var21);
                        param3 = param3 + var17;
                        param4 = param4 + var18;
                        param7 = param7 + var22;
                        param1 = param1 + (float)this.field_t;
                        continue L59;
                      }
                    }
                  }
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } else {
          this.field_k.b((int)param0, param9, (int)param3, (int)param1, 1, (int)param4);
          this.field_k.b((int)param1, param9, (int)param4, (int)param2, 1, (int)param5);
          this.field_k.b((int)param2, param9, (int)param5, (int)param0, 1, (int)param3);
          return;
        }
    }

    private final void b(int[] param0, int[] param1, int param2, int param3, int param4, float param5, float param6, float param7, float param8, float param9, float param10, float param11, float param12, float param13, float param14, float param15, float param16, float param17, float param18, float param19, float param20) {
        int incrementValue$0 = 0;
        int stackIn_28_0 = 0;
        int var22;
        float var23;
        float var24;
        float var25;
        float var26;
        float var27;
        float var28;
        float var29;
        float var30;
        float var31;
        float var32;
        int var33;
        int var34;
        int var35;
        int var36;
        int var37;
        int var38;
        int var39;
        L0: {
          var22 = param4 - param3;
          var23 = 1.0f / (float)var22;
          var24 = (param6 - param5) * var23;
          var25 = (param8 - param7) * var23;
          var26 = (param10 - param9) * var23;
          var27 = (param12 - param11) * var23;
          var28 = (param14 - param13) * var23;
          var29 = (param16 - param15) * var23;
          var30 = (param18 - param17) * var23;
          var31 = (param20 - param19) * var23;
          if (!this.field_q) {
            break L0;
          } else {
            L1: {
              if (param4 <= this.field_h) {
                break L1;
              } else {
                param4 = this.field_h;
                break L1;
              }
            }
            if (param3 >= 0) {
              break L0;
            } else {
              param5 = param5 - var24 * (float)param3;
              param7 = param7 - var25 * (float)param3;
              param9 = param9 - var26 * (float)param3;
              param11 = param11 - var27 * (float)param3;
              param13 = param13 - var28 * (float)param3;
              param15 = param15 - var29 * (float)param3;
              param17 = param17 - var30 * (float)param3;
              param19 = param19 - var31 * (float)param3;
              param3 = 0;
              break L0;
            }
          }
        }
        if (param3 < param4) {
          var22 = param4 - param3;
          param2 = param2 + param3;
          L2: while (true) {
            incrementValue$0 = var22;
            var22--;
            if (incrementValue$0 <= 0) {
              return;
            } else {
              L3: {
                var32 = 1.0f / param5;
                if (var32 >= this.field_u[param2]) {
                  break L3;
                } else {
                  L4: {
                    var33 = (int)(param7 * var32 * (float)this.field_i);
                    if (!this.field_d) {
                      if (var33 >= 0) {
                        if (var33 <= this.field_r) {
                          break L4;
                        } else {
                          var33 = this.field_r;
                          break L4;
                        }
                      } else {
                        var33 = 0;
                        break L4;
                      }
                    } else {
                      var33 = var33 & this.field_r;
                      break L4;
                    }
                  }
                  L5: {
                    var34 = (int)(param9 * var32 * (float)this.field_i);
                    if (!this.field_d) {
                      if (var34 >= 0) {
                        if (var34 <= this.field_r) {
                          break L5;
                        } else {
                          var34 = this.field_r;
                          break L5;
                        }
                      } else {
                        var34 = 0;
                        break L5;
                      }
                    } else {
                      var34 = var34 & this.field_r;
                      break L5;
                    }
                  }
                  L6: {
                    var35 = this.field_w[var34 * this.field_i + var33];
                    var36 = 255;
                    if (this.field_f != 2) {
                      if (this.field_f != 1) {
                        var36 = (int)param13;
                        break L6;
                      } else {
                        L7: {
                          if (var35 != 0) {
                            stackIn_28_0 = 255;
                            break L7;
                          } else {
                            stackIn_28_0 = 0;
                            break L7;
                          }
                        }
                        var36 = stackIn_28_0;
                        break L6;
                      }
                    } else {
                      var36 = var35 >> 24 & 255;
                      break L6;
                    }
                  }
                  if (var36 == 0) {
                    break L3;
                  } else {
                    if (var36 == 255) {
                      L8: {
                        var37 = -16777216 | (int)(param15 * (float)(var35 >> 16 & 255)) << 8 & 16711680 | (int)(param17 * (float)(var35 >> 8 & 255)) & 65280 | (int)(param19 * (float)(var35 & 255)) >> 8;
                        if (param11 == 0.0f) {
                          break L8;
                        } else {
                          var38 = (int)(255.0f - param11);
                          var39 = ((this.field_l & 16711935) * (int)param11 & -16711936 | (this.field_l & 65280) * (int)param11 & 16711680) >>> 8;
                          var37 = (((var37 & 16711935) * var38 & -16711936 | (var37 & 65280) * var38 & 16711680) >>> 8) + var39;
                          break L8;
                        }
                      }
                      param0[param2] = var36 << 24 | var37;
                      this.field_u[param2] = var32;
                      break L3;
                    } else {
                      L9: {
                        var37 = -16777216 | (int)(param15 * (float)(var35 >> 16 & 255)) << 8 & 16711680 | (int)(param17 * (float)(var35 >> 8 & 255)) & 65280 | (int)(param19 * (float)(var35 & 255)) >> 8;
                        if (param11 == 0.0f) {
                          break L9;
                        } else {
                          var38 = (int)(255.0f - param11);
                          var39 = ((this.field_l & 16711935) * (int)param11 & -16711936 | (this.field_l & 65280) * (int)param11 & 16711680) >>> 8;
                          var37 = (((var37 & 16711935) * var38 & -16711936 | (var37 & 65280) * var38 & 16711680) >>> 8) + var39;
                          break L9;
                        }
                      }
                      var38 = param0[param2];
                      var39 = 255 - var36;
                      var37 = ((var38 & 16711935) * var39 + (var37 & 16711935) * var36 & -16711936) + ((var38 & 65280) * var39 + (var37 & 65280) * var36 & 16711680) >> 8;
                      param0[param2] = (var36 | param0[param2] >> 24) << 24 | var37;
                      this.field_u[param2] = var32;
                      break L3;
                    }
                  }
                }
              }
              param2++;
              param5 = param5 + var24;
              param7 = param7 + var25;
              param9 = param9 + var26;
              param11 = param11 + var27;
              param13 = param13 + var28;
              param15 = param15 + var29;
              param17 = param17 + var30;
              param19 = param19 + var31;
              continue L2;
            }
          }
        } else {
          return;
        }
    }

    final void a(float param0, float param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8, int param9, int param10, int param11) {
        float var13;
        float var14;
        float var15;
        float var16;
        float var17;
        float var18;
        float var19;
        float var20;
        float var21;
        float var22;
        float var23;
        float var24;
        float var25;
        float var26;
        float var27;
        float var28;
        float var29;
        float var30;
        float var31;
        float var32;
        float var33;
        float var34;
        float var35;
        float var36;
        float var37;
        float var38;
        float var39;
        if (!this.field_s) {
          L0: {
            var13 = param4 - param3;
            var14 = param1 - param0;
            var15 = param5 - param3;
            var16 = param2 - param0;
            var17 = param7 - param6;
            var18 = param8 - param6;
            var19 = (float)((param10 & 16711680) - (param9 & 16711680));
            var20 = (float)((param11 & 16711680) - (param9 & 16711680));
            var21 = (float)((param10 & 65280) - (param9 & 65280));
            var22 = (float)((param11 & 65280) - (param9 & 65280));
            var23 = (float)((param10 & 255) - (param9 & 255));
            var24 = (float)((param11 & 255) - (param9 & 255));
            if (param2 == param1) {
              var25 = 0.0f;
              break L0;
            } else {
              var25 = (param5 - param4) / (param2 - param1);
              break L0;
            }
          }
          L1: {
            if (param1 == param0) {
              var26 = 0.0f;
              break L1;
            } else {
              var26 = var13 / var14;
              break L1;
            }
          }
          L2: {
            if (param2 == param0) {
              var27 = 0.0f;
              break L2;
            } else {
              var27 = var15 / var16;
              break L2;
            }
          }
          var28 = var13 * var16 - var15 * var14;
          if (var28 != 0.0f) {
            L3: {
              var29 = (var17 * var16 - var18 * var14) / var28;
              var30 = (var18 * var13 - var17 * var15) / var28;
              var31 = (var19 * var16 - var20 * var14) / var28;
              var32 = (var20 * var13 - var19 * var15) / var28;
              var33 = (var21 * var16 - var22 * var14) / var28;
              var34 = (var22 * var13 - var21 * var15) / var28;
              var35 = (var23 * var16 - var24 * var14) / var28;
              var36 = (var24 * var13 - var23 * var15) / var28;
              if (param0 > param1) {
                break L3;
              } else {
                if (param0 > param2) {
                  break L3;
                } else {
                  if (param0 < (float)this.field_v) {
                    L4: {
                      if (param1 <= (float)this.field_v) {
                        break L4;
                      } else {
                        param1 = (float)this.field_v;
                        break L4;
                      }
                    }
                    L5: {
                      if (param2 <= (float)this.field_v) {
                        break L5;
                      } else {
                        param2 = (float)this.field_v;
                        break L5;
                      }
                    }
                    param6 = param6 - var29 * param3 + var29;
                    var37 = (float)(param9 & 16711680) - var31 * param3 + var31;
                    var38 = (float)(param9 & 65280) - var33 * param3 + var33;
                    var39 = (float)(param9 & 255) - var35 * param3 + var35;
                    if (param1 >= param2) {
                      L6: {
                        param4 = param3;
                        if (param0 >= 0.0f) {
                          break L6;
                        } else {
                          param4 = param4 - var27 * param0;
                          param3 = param3 - var26 * param0;
                          param6 = param6 - var30 * param0;
                          var37 = var37 - var32 * param0;
                          var38 = var38 - var34 * param0;
                          var39 = var39 - var36 * param0;
                          param0 = 0.0f;
                          break L6;
                        }
                      }
                      L7: {
                        if (param2 >= 0.0f) {
                          break L7;
                        } else {
                          param5 = param5 - var25 * param2;
                          param2 = 0.0f;
                          break L7;
                        }
                      }
                      L8: {
                        if (param0 == param2) {
                          break L8;
                        } else {
                          if (var27 >= var26) {
                            break L8;
                          } else {
                            param1 = param1 - param2;
                            param2 = param2 - param0;
                            param0 = (float)this.field_p[(int)param0];
                            L9: while (true) {
                              param2 = param2 - 1.0f;
                              if (param2 < 0.0f) {
                                L10: while (true) {
                                  param1 = param1 - 1.0f;
                                  if (param1 < 0.0f) {
                                    return;
                                  } else {
                                    this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param3, param6, var29, var37, var31, var38, var33, var39, var35);
                                    param5 = param5 + var25;
                                    param3 = param3 + var26;
                                    param6 = param6 + var30;
                                    var37 = var37 + var32;
                                    var38 = var38 + var34;
                                    var39 = var39 + var36;
                                    param0 = param0 + (float)this.field_t;
                                    continue L10;
                                  }
                                }
                              } else {
                                this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param4, (int)param3, param6, var29, var37, var31, var38, var33, var39, var35);
                                param4 = param4 + var27;
                                param3 = param3 + var26;
                                param6 = param6 + var30;
                                var37 = var37 + var32;
                                var38 = var38 + var34;
                                var39 = var39 + var36;
                                param0 = param0 + (float)this.field_t;
                                continue L9;
                              }
                            }
                          }
                        }
                      }
                      if (param0 == param2) {
                        if (var25 > var26) {
                          param1 = param1 - param2;
                          param2 = param2 - param0;
                          param0 = (float)this.field_p[(int)param0];
                          L11: while (true) {
                            param2 = param2 - 1.0f;
                            if (param2 < 0.0f) {
                              L12: while (true) {
                                param1 = param1 - 1.0f;
                                if (param1 < 0.0f) {
                                  return;
                                } else {
                                  this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param3, param6, var29, var37, var31, var38, var33, var39, var35);
                                  param5 = param5 + var25;
                                  param3 = param3 + var26;
                                  param6 = param6 + var30;
                                  var37 = var37 + var32;
                                  var38 = var38 + var34;
                                  var39 = var39 + var36;
                                  param0 = param0 + (float)this.field_t;
                                  continue L12;
                                }
                              }
                            } else {
                              this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param4, (int)param3, param6, var29, var37, var31, var38, var33, var39, var35);
                              param4 = param4 + var27;
                              param3 = param3 + var26;
                              param6 = param6 + var30;
                              var37 = var37 + var32;
                              var38 = var38 + var34;
                              var39 = var39 + var36;
                              param0 = param0 + (float)this.field_t;
                              continue L11;
                            }
                          }
                        } else {
                          param1 = param1 - param2;
                          param2 = param2 - param0;
                          param0 = (float)this.field_p[(int)param0];
                          L13: while (true) {
                            param2 = param2 - 1.0f;
                            if (param2 < 0.0f) {
                              L14: while (true) {
                                param1 = param1 - 1.0f;
                                if (param1 < 0.0f) {
                                  return;
                                } else {
                                  this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param5, param6, var29, var37, var31, var38, var33, var39, var35);
                                  param5 = param5 + var25;
                                  param3 = param3 + var26;
                                  param6 = param6 + var30;
                                  var37 = var37 + var32;
                                  var38 = var38 + var34;
                                  var39 = var39 + var36;
                                  param0 = param0 + (float)this.field_t;
                                  continue L14;
                                }
                              }
                            } else {
                              this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param4, param6, var29, var37, var31, var38, var33, var39, var35);
                              param4 = param4 + var27;
                              param3 = param3 + var26;
                              param6 = param6 + var30;
                              var37 = var37 + var32;
                              var38 = var38 + var34;
                              var39 = var39 + var36;
                              param0 = param0 + (float)this.field_t;
                              continue L13;
                            }
                          }
                        }
                      } else {
                        param1 = param1 - param2;
                        param2 = param2 - param0;
                        param0 = (float)this.field_p[(int)param0];
                        L15: while (true) {
                          param2 = param2 - 1.0f;
                          if (param2 < 0.0f) {
                            L16: while (true) {
                              param1 = param1 - 1.0f;
                              if (param1 < 0.0f) {
                                return;
                              } else {
                                this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param5, param6, var29, var37, var31, var38, var33, var39, var35);
                                param5 = param5 + var25;
                                param3 = param3 + var26;
                                param6 = param6 + var30;
                                var37 = var37 + var32;
                                var38 = var38 + var34;
                                var39 = var39 + var36;
                                param0 = param0 + (float)this.field_t;
                                continue L16;
                              }
                            }
                          } else {
                            this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param4, param6, var29, var37, var31, var38, var33, var39, var35);
                            param4 = param4 + var27;
                            param3 = param3 + var26;
                            param6 = param6 + var30;
                            var37 = var37 + var32;
                            var38 = var38 + var34;
                            var39 = var39 + var36;
                            param0 = param0 + (float)this.field_t;
                            continue L15;
                          }
                        }
                      }
                    } else {
                      L17: {
                        param5 = param3;
                        if (param0 >= 0.0f) {
                          break L17;
                        } else {
                          param5 = param5 - var27 * param0;
                          param3 = param3 - var26 * param0;
                          param6 = param6 - var30 * param0;
                          var37 = var37 - var32 * param0;
                          var38 = var38 - var34 * param0;
                          var39 = var39 - var36 * param0;
                          param0 = 0.0f;
                          break L17;
                        }
                      }
                      L18: {
                        if (param1 >= 0.0f) {
                          break L18;
                        } else {
                          param4 = param4 - var25 * param1;
                          param1 = 0.0f;
                          break L18;
                        }
                      }
                      L19: {
                        if (param0 == param1) {
                          break L19;
                        } else {
                          if (var27 >= var26) {
                            break L19;
                          } else {
                            param2 = param2 - param1;
                            param1 = param1 - param0;
                            param0 = (float)this.field_p[(int)param0];
                            L20: while (true) {
                              param1 = param1 - 1.0f;
                              if (param1 < 0.0f) {
                                L21: while (true) {
                                  param2 = param2 - 1.0f;
                                  if (param2 < 0.0f) {
                                    return;
                                  } else {
                                    this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param4, param6, var29, var37, var31, var38, var33, var39, var35);
                                    param5 = param5 + var27;
                                    param4 = param4 + var25;
                                    param6 = param6 + var30;
                                    var37 = var37 + var32;
                                    var38 = var38 + var34;
                                    var39 = var39 + var36;
                                    param0 = param0 + (float)this.field_t;
                                    continue L21;
                                  }
                                }
                              } else {
                                this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param3, param6, var29, var37, var31, var38, var33, var39, var35);
                                param5 = param5 + var27;
                                param3 = param3 + var26;
                                param6 = param6 + var30;
                                var37 = var37 + var32;
                                var38 = var38 + var34;
                                var39 = var39 + var36;
                                param0 = param0 + (float)this.field_t;
                                continue L20;
                              }
                            }
                          }
                        }
                      }
                      if (param0 == param1) {
                        if (var27 > var25) {
                          param2 = param2 - param1;
                          param1 = param1 - param0;
                          param0 = (float)this.field_p[(int)param0];
                          L22: while (true) {
                            param1 = param1 - 1.0f;
                            if (param1 < 0.0f) {
                              L23: while (true) {
                                param2 = param2 - 1.0f;
                                if (param2 < 0.0f) {
                                  return;
                                } else {
                                  this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param4, param6, var29, var37, var31, var38, var33, var39, var35);
                                  param5 = param5 + var27;
                                  param4 = param4 + var25;
                                  param6 = param6 + var30;
                                  var37 = var37 + var32;
                                  var38 = var38 + var34;
                                  var39 = var39 + var36;
                                  param0 = param0 + (float)this.field_t;
                                  continue L23;
                                }
                              }
                            } else {
                              this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param3, param6, var29, var37, var31, var38, var33, var39, var35);
                              param5 = param5 + var27;
                              param3 = param3 + var26;
                              param6 = param6 + var30;
                              var37 = var37 + var32;
                              var38 = var38 + var34;
                              var39 = var39 + var36;
                              param0 = param0 + (float)this.field_t;
                              continue L22;
                            }
                          }
                        } else {
                          param2 = param2 - param1;
                          param1 = param1 - param0;
                          param0 = (float)this.field_p[(int)param0];
                          L24: while (true) {
                            param1 = param1 - 1.0f;
                            if (param1 < 0.0f) {
                              L25: while (true) {
                                param2 = param2 - 1.0f;
                                if (param2 < 0.0f) {
                                  return;
                                } else {
                                  this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param4, (int)param5, param6, var29, var37, var31, var38, var33, var39, var35);
                                  param5 = param5 + var27;
                                  param4 = param4 + var25;
                                  param6 = param6 + var30;
                                  var37 = var37 + var32;
                                  var38 = var38 + var34;
                                  var39 = var39 + var36;
                                  param0 = param0 + (float)this.field_t;
                                  continue L25;
                                }
                              }
                            } else {
                              this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param5, param6, var29, var37, var31, var38, var33, var39, var35);
                              param5 = param5 + var27;
                              param3 = param3 + var26;
                              param6 = param6 + var30;
                              var37 = var37 + var32;
                              var38 = var38 + var34;
                              var39 = var39 + var36;
                              param0 = param0 + (float)this.field_t;
                              continue L24;
                            }
                          }
                        }
                      } else {
                        param2 = param2 - param1;
                        param1 = param1 - param0;
                        param0 = (float)this.field_p[(int)param0];
                        L26: while (true) {
                          param1 = param1 - 1.0f;
                          if (param1 < 0.0f) {
                            L27: while (true) {
                              param2 = param2 - 1.0f;
                              if (param2 < 0.0f) {
                                return;
                              } else {
                                this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param4, (int)param5, param6, var29, var37, var31, var38, var33, var39, var35);
                                param5 = param5 + var27;
                                param4 = param4 + var25;
                                param6 = param6 + var30;
                                var37 = var37 + var32;
                                var38 = var38 + var34;
                                var39 = var39 + var36;
                                param0 = param0 + (float)this.field_t;
                                continue L27;
                              }
                            }
                          } else {
                            this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param5, param6, var29, var37, var31, var38, var33, var39, var35);
                            param5 = param5 + var27;
                            param3 = param3 + var26;
                            param6 = param6 + var30;
                            var37 = var37 + var32;
                            var38 = var38 + var34;
                            var39 = var39 + var36;
                            param0 = param0 + (float)this.field_t;
                            continue L26;
                          }
                        }
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            if (param1 > param2) {
              if (param2 < (float)this.field_v) {
                L28: {
                  if (param0 <= (float)this.field_v) {
                    break L28;
                  } else {
                    param0 = (float)this.field_v;
                    break L28;
                  }
                }
                L29: {
                  if (param1 <= (float)this.field_v) {
                    break L29;
                  } else {
                    param1 = (float)this.field_v;
                    break L29;
                  }
                }
                param8 = param8 - var29 * param5 + var29;
                var37 = (float)(param11 & 16711680) - var31 * param5 + var31;
                var38 = (float)(param11 & 65280) - var33 * param5 + var33;
                var39 = (float)(param11 & 255) - var35 * param5 + var35;
                if (param0 >= param1) {
                  L30: {
                    param3 = param5;
                    if (param2 >= 0.0f) {
                      break L30;
                    } else {
                      param3 = param3 - var25 * param2;
                      param5 = param5 - var27 * param2;
                      param8 = param8 - var30 * param2;
                      var37 = var37 - var32 * param2;
                      var38 = var38 - var34 * param2;
                      var39 = var39 - var36 * param2;
                      param2 = 0.0f;
                      break L30;
                    }
                  }
                  L31: {
                    if (param1 >= 0.0f) {
                      break L31;
                    } else {
                      param4 = param4 - var26 * param1;
                      param1 = 0.0f;
                      break L31;
                    }
                  }
                  if (var25 < var27) {
                    param0 = param0 - param1;
                    param1 = param1 - param2;
                    param2 = (float)this.field_p[(int)param2];
                    L32: while (true) {
                      param1 = param1 - 1.0f;
                      if (param1 < 0.0f) {
                        L33: while (true) {
                          param0 = param0 - 1.0f;
                          if (param0 < 0.0f) {
                            return;
                          } else {
                            this.b(this.field_a, this.field_u, (int)param2, 0, 0, (int)param4, (int)param5, param8, var29, var37, var31, var38, var33, var39, var35);
                            param4 = param4 + var26;
                            param5 = param5 + var27;
                            param8 = param8 + var30;
                            var37 = var37 + var32;
                            var38 = var38 + var34;
                            var39 = var39 + var36;
                            param2 = param2 + (float)this.field_t;
                            continue L33;
                          }
                        }
                      } else {
                        this.b(this.field_a, this.field_u, (int)param2, 0, 0, (int)param3, (int)param5, param8, var29, var37, var31, var38, var33, var39, var35);
                        param3 = param3 + var25;
                        param5 = param5 + var27;
                        param8 = param8 + var30;
                        var37 = var37 + var32;
                        var38 = var38 + var34;
                        var39 = var39 + var36;
                        param2 = param2 + (float)this.field_t;
                        continue L32;
                      }
                    }
                  } else {
                    param0 = param0 - param1;
                    param1 = param1 - param2;
                    param2 = (float)this.field_p[(int)param2];
                    L34: while (true) {
                      param1 = param1 - 1.0f;
                      if (param1 < 0.0f) {
                        L35: while (true) {
                          param0 = param0 - 1.0f;
                          if (param0 < 0.0f) {
                            return;
                          } else {
                            this.b(this.field_a, this.field_u, (int)param2, 0, 0, (int)param5, (int)param4, param8, var29, var37, var31, var38, var33, var39, var35);
                            param4 = param4 + var26;
                            param5 = param5 + var27;
                            param8 = param8 + var30;
                            var37 = var37 + var32;
                            var38 = var38 + var34;
                            var39 = var39 + var36;
                            param2 = param2 + (float)this.field_t;
                            continue L35;
                          }
                        }
                      } else {
                        this.b(this.field_a, this.field_u, (int)param2, 0, 0, (int)param5, (int)param3, param8, var29, var37, var31, var38, var33, var39, var35);
                        param3 = param3 + var25;
                        param5 = param5 + var27;
                        param8 = param8 + var30;
                        var37 = var37 + var32;
                        var38 = var38 + var34;
                        var39 = var39 + var36;
                        param2 = param2 + (float)this.field_t;
                        continue L34;
                      }
                    }
                  }
                } else {
                  L36: {
                    param4 = param5;
                    if (param2 >= 0.0f) {
                      break L36;
                    } else {
                      param4 = param4 - var25 * param2;
                      param5 = param5 - var27 * param2;
                      param8 = param8 - var30 * param2;
                      var37 = var37 - var32 * param2;
                      var38 = var38 - var34 * param2;
                      var39 = var39 - var36 * param2;
                      param2 = 0.0f;
                      break L36;
                    }
                  }
                  L37: {
                    if (param0 >= 0.0f) {
                      break L37;
                    } else {
                      param3 = param3 - var26 * param0;
                      param0 = 0.0f;
                      break L37;
                    }
                  }
                  if (var25 < var27) {
                    param1 = param1 - param0;
                    param0 = param0 - param2;
                    param2 = (float)this.field_p[(int)param2];
                    L38: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        L39: while (true) {
                          param1 = param1 - 1.0f;
                          if (param1 < 0.0f) {
                            return;
                          } else {
                            this.b(this.field_a, this.field_u, (int)param2, 0, 0, (int)param4, (int)param3, param8, var29, var37, var31, var38, var33, var39, var35);
                            param4 = param4 + var25;
                            param3 = param3 + var26;
                            param8 = param8 + var30;
                            var37 = var37 + var32;
                            var38 = var38 + var34;
                            var39 = var39 + var36;
                            param2 = param2 + (float)this.field_t;
                            continue L39;
                          }
                        }
                      } else {
                        this.b(this.field_a, this.field_u, (int)param2, 0, 0, (int)param4, (int)param5, param8, var29, var37, var31, var38, var33, var39, var35);
                        param4 = param4 + var25;
                        param5 = param5 + var27;
                        param8 = param8 + var30;
                        var37 = var37 + var32;
                        var38 = var38 + var34;
                        var39 = var39 + var36;
                        param2 = param2 + (float)this.field_t;
                        continue L38;
                      }
                    }
                  } else {
                    param1 = param1 - param0;
                    param0 = param0 - param2;
                    param2 = (float)this.field_p[(int)param2];
                    L40: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        L41: while (true) {
                          param1 = param1 - 1.0f;
                          if (param1 < 0.0f) {
                            return;
                          } else {
                            this.b(this.field_a, this.field_u, (int)param2, 0, 0, (int)param3, (int)param4, param8, var29, var37, var31, var38, var33, var39, var35);
                            param4 = param4 + var25;
                            param3 = param3 + var26;
                            param8 = param8 + var30;
                            var37 = var37 + var32;
                            var38 = var38 + var34;
                            var39 = var39 + var36;
                            param2 = param2 + (float)this.field_t;
                            continue L41;
                          }
                        }
                      } else {
                        this.b(this.field_a, this.field_u, (int)param2, 0, 0, (int)param5, (int)param4, param8, var29, var37, var31, var38, var33, var39, var35);
                        param4 = param4 + var25;
                        param5 = param5 + var27;
                        param8 = param8 + var30;
                        var37 = var37 + var32;
                        var38 = var38 + var34;
                        var39 = var39 + var36;
                        param2 = param2 + (float)this.field_t;
                        continue L40;
                      }
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              if (param1 < (float)this.field_v) {
                L42: {
                  if (param2 <= (float)this.field_v) {
                    break L42;
                  } else {
                    param2 = (float)this.field_v;
                    break L42;
                  }
                }
                L43: {
                  if (param0 <= (float)this.field_v) {
                    break L43;
                  } else {
                    param0 = (float)this.field_v;
                    break L43;
                  }
                }
                param7 = param7 - var29 * param4 + var29;
                var37 = (float)(param10 & 16711680) - var31 * param4 + var31;
                var38 = (float)(param10 & 65280) - var33 * param4 + var33;
                var39 = (float)(param10 & 255) - var35 * param4 + var35;
                if (param2 >= param0) {
                  L44: {
                    param5 = param4;
                    if (param1 >= 0.0f) {
                      break L44;
                    } else {
                      param5 = param5 - var26 * param1;
                      param4 = param4 - var25 * param1;
                      param7 = param7 - var30 * param1;
                      var37 = var37 - var32 * param1;
                      var38 = var38 - var34 * param1;
                      var39 = var39 - var36 * param1;
                      param1 = 0.0f;
                      break L44;
                    }
                  }
                  L45: {
                    if (param0 >= 0.0f) {
                      break L45;
                    } else {
                      param3 = param3 - var27 * param0;
                      param0 = 0.0f;
                      break L45;
                    }
                  }
                  if (var26 < var25) {
                    param2 = param2 - param0;
                    param0 = param0 - param1;
                    param1 = (float)this.field_p[(int)param1];
                    L46: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        L47: while (true) {
                          param2 = param2 - 1.0f;
                          if (param2 < 0.0f) {
                            return;
                          } else {
                            this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param3, (int)param4, param7, var29, var37, var31, var38, var33, var39, var35);
                            param3 = param3 + var27;
                            param4 = param4 + var25;
                            param7 = param7 + var30;
                            var37 = var37 + var32;
                            var38 = var38 + var34;
                            var39 = var39 + var36;
                            param1 = param1 + (float)this.field_t;
                            continue L47;
                          }
                        }
                      } else {
                        this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param5, (int)param4, param7, var29, var37, var31, var38, var33, var39, var35);
                        param5 = param5 + var26;
                        param4 = param4 + var25;
                        param7 = param7 + var30;
                        var37 = var37 + var32;
                        var38 = var38 + var34;
                        var39 = var39 + var36;
                        param1 = param1 + (float)this.field_t;
                        continue L46;
                      }
                    }
                  } else {
                    param2 = param2 - param0;
                    param0 = param0 - param1;
                    param1 = (float)this.field_p[(int)param1];
                    L48: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        L49: while (true) {
                          param2 = param2 - 1.0f;
                          if (param2 < 0.0f) {
                            return;
                          } else {
                            this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param4, (int)param3, param7, var29, var37, var31, var38, var33, var39, var35);
                            param3 = param3 + var27;
                            param4 = param4 + var25;
                            param7 = param7 + var30;
                            var37 = var37 + var32;
                            var38 = var38 + var34;
                            var39 = var39 + var36;
                            param1 = param1 + (float)this.field_t;
                            continue L49;
                          }
                        }
                      } else {
                        this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param4, (int)param5, param7, var29, var37, var31, var38, var33, var39, var35);
                        param5 = param5 + var26;
                        param4 = param4 + var25;
                        param7 = param7 + var30;
                        var37 = var37 + var32;
                        var38 = var38 + var34;
                        var39 = var39 + var36;
                        param1 = param1 + (float)this.field_t;
                        continue L48;
                      }
                    }
                  }
                } else {
                  L50: {
                    param3 = param4;
                    if (param1 >= 0.0f) {
                      break L50;
                    } else {
                      param3 = param3 - var26 * param1;
                      param4 = param4 - var25 * param1;
                      param7 = param7 - var30 * param1;
                      var37 = var37 - var32 * param1;
                      var38 = var38 - var34 * param1;
                      var39 = var39 - var36 * param1;
                      param1 = 0.0f;
                      break L50;
                    }
                  }
                  L51: {
                    if (param2 >= 0.0f) {
                      break L51;
                    } else {
                      param5 = param5 - var27 * param2;
                      param2 = 0.0f;
                      break L51;
                    }
                  }
                  L52: {
                    if (param1 == param2) {
                      break L52;
                    } else {
                      if (var26 >= var25) {
                        break L52;
                      } else {
                        param0 = param0 - param2;
                        param2 = param2 - param1;
                        param1 = (float)this.field_p[(int)param1];
                        L53: while (true) {
                          param2 = param2 - 1.0f;
                          if (param2 < 0.0f) {
                            L54: while (true) {
                              param0 = param0 - 1.0f;
                              if (param0 < 0.0f) {
                                return;
                              } else {
                                this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param3, (int)param5, param7, var29, var37, var31, var38, var33, var39, var35);
                                param3 = param3 + var26;
                                param5 = param5 + var27;
                                param7 = param7 + var30;
                                var37 = var37 + var32;
                                var38 = var38 + var34;
                                var39 = var39 + var36;
                                param1 = param1 + (float)this.field_t;
                                continue L54;
                              }
                            }
                          } else {
                            this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param3, (int)param4, param7, var29, var37, var31, var38, var33, var39, var35);
                            param3 = param3 + var26;
                            param4 = param4 + var25;
                            param7 = param7 + var30;
                            var37 = var37 + var32;
                            var38 = var38 + var34;
                            var39 = var39 + var36;
                            param1 = param1 + (float)this.field_t;
                            continue L53;
                          }
                        }
                      }
                    }
                  }
                  if (param1 == param2) {
                    if (var26 > var27) {
                      param0 = param0 - param2;
                      param2 = param2 - param1;
                      param1 = (float)this.field_p[(int)param1];
                      L55: while (true) {
                        param2 = param2 - 1.0f;
                        if (param2 < 0.0f) {
                          L56: while (true) {
                            param0 = param0 - 1.0f;
                            if (param0 < 0.0f) {
                              return;
                            } else {
                              this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param3, (int)param5, param7, var29, var37, var31, var38, var33, var39, var35);
                              param3 = param3 + var26;
                              param5 = param5 + var27;
                              param7 = param7 + var30;
                              var37 = var37 + var32;
                              var38 = var38 + var34;
                              var39 = var39 + var36;
                              param1 = param1 + (float)this.field_t;
                              continue L56;
                            }
                          }
                        } else {
                          this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param3, (int)param4, param7, var29, var37, var31, var38, var33, var39, var35);
                          param3 = param3 + var26;
                          param4 = param4 + var25;
                          param7 = param7 + var30;
                          var37 = var37 + var32;
                          var38 = var38 + var34;
                          var39 = var39 + var36;
                          param1 = param1 + (float)this.field_t;
                          continue L55;
                        }
                      }
                    } else {
                      param0 = param0 - param2;
                      param2 = param2 - param1;
                      param1 = (float)this.field_p[(int)param1];
                      L57: while (true) {
                        param2 = param2 - 1.0f;
                        if (param2 < 0.0f) {
                          L58: while (true) {
                            param0 = param0 - 1.0f;
                            if (param0 < 0.0f) {
                              return;
                            } else {
                              this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param5, (int)param3, param7, var29, var37, var31, var38, var33, var39, var35);
                              param3 = param3 + var26;
                              param5 = param5 + var27;
                              param7 = param7 + var30;
                              var37 = var37 + var32;
                              var38 = var38 + var34;
                              var39 = var39 + var36;
                              param1 = param1 + (float)this.field_t;
                              continue L58;
                            }
                          }
                        } else {
                          this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param4, (int)param3, param7, var29, var37, var31, var38, var33, var39, var35);
                          param3 = param3 + var26;
                          param4 = param4 + var25;
                          param7 = param7 + var30;
                          var37 = var37 + var32;
                          var38 = var38 + var34;
                          var39 = var39 + var36;
                          param1 = param1 + (float)this.field_t;
                          continue L57;
                        }
                      }
                    }
                  } else {
                    param0 = param0 - param2;
                    param2 = param2 - param1;
                    param1 = (float)this.field_p[(int)param1];
                    L59: while (true) {
                      param2 = param2 - 1.0f;
                      if (param2 < 0.0f) {
                        L60: while (true) {
                          param0 = param0 - 1.0f;
                          if (param0 < 0.0f) {
                            return;
                          } else {
                            this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param5, (int)param3, param7, var29, var37, var31, var38, var33, var39, var35);
                            param3 = param3 + var26;
                            param5 = param5 + var27;
                            param7 = param7 + var30;
                            var37 = var37 + var32;
                            var38 = var38 + var34;
                            var39 = var39 + var36;
                            param1 = param1 + (float)this.field_t;
                            continue L60;
                          }
                        }
                      } else {
                        this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param4, (int)param3, param7, var29, var37, var31, var38, var33, var39, var35);
                        param3 = param3 + var26;
                        param4 = param4 + var25;
                        param7 = param7 + var30;
                        var37 = var37 + var32;
                        var38 = var38 + var34;
                        var39 = var39 + var36;
                        param1 = param1 + (float)this.field_t;
                        continue L59;
                      }
                    }
                  }
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } else {
          this.field_k.b((int)param0, -16777216 | param9, (int)param3, (int)param1, 1, (int)param4);
          this.field_k.b((int)param1, -16777216 | param9, (int)param4, (int)param2, 1, (int)param5);
          this.field_k.b((int)param2, -16777216 | param9, (int)param5, (int)param0, 1, (int)param3);
          return;
        }
    }

    private final void b(int[] param0, float[] param1, int param2, int param3, int param4, int param5, int param6, float param7, float param8, float param9, float param10) {
        int var12;
        int var13;
        int var14;
        L0: {
          if (!this.field_q) {
            break L0;
          } else {
            L1: {
              if (param6 <= this.field_h) {
                break L1;
              } else {
                param6 = this.field_h;
                break L1;
              }
            }
            if (param5 >= 0) {
              break L0;
            } else {
              param5 = 0;
              break L0;
            }
          }
        }
        if (param5 < param6) {
          L2: {
            L3: {
              param2 = param2 + (param5 - 1);
              param7 = param7 + param8 * (float)param5;
              param9 = param9 + param10 * (float)param5;
              if (!this.field_o.field_n) {
                if (!this.field_j) {
                  param4 = param6 - param5;
                  if (this.field_b != 0) {
                    var12 = this.field_b;
                    var13 = 256 - this.field_b;
                    L4: while (true) {
                      L5: {
                        param2++;
                        if (param9 >= param1[param2]) {
                          break L5;
                        } else {
                          param3 = bt.field_h[(int)param7];
                          param3 = ((param3 & 16711935) * var13 >> 8 & 16711935) + ((param3 & 65280) * var13 >> 8 & 65280);
                          var14 = param0[param2];
                          param0[param2] = param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                          break L5;
                        }
                      }
                      param7 = param7 + param8;
                      param9 = param9 + param10;
                      param4--;
                      if (param4 > 0) {
                        continue L4;
                      } else {
                        break L2;
                      }
                    }
                  } else {
                    L6: while (true) {
                      L7: {
                        param2++;
                        if (param9 >= param1[param2]) {
                          break L7;
                        } else {
                          param0[param2] = bt.field_h[(int)param7];
                          break L7;
                        }
                      }
                      param9 = param9 + param10;
                      param7 = param7 + param8;
                      param4--;
                      if (param4 > 0) {
                        continue L6;
                      } else {
                        break L2;
                      }
                    }
                  }
                } else {
                  param4 = param6 - param5 >> 2;
                  param8 = param8 * 4.0f;
                  if (this.field_b != 0) {
                    L8: {
                      var12 = this.field_b;
                      var13 = 256 - this.field_b;
                      if (param4 <= 0) {
                        break L8;
                      } else {
                        L9: while (true) {
                          L10: {
                            param3 = bt.field_h[(int)param7];
                            param7 = param7 + param8;
                            param3 = ((param3 & 16711935) * var13 >> 8 & 16711935) + ((param3 & 65280) * var13 >> 8 & 65280);
                            param2++;
                            if (param9 >= param1[param2]) {
                              break L10;
                            } else {
                              var14 = param0[param2];
                              param0[param2] = param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                              break L10;
                            }
                          }
                          L11: {
                            param9 = param9 + param10;
                            param2++;
                            if (param9 >= param1[param2]) {
                              break L11;
                            } else {
                              var14 = param0[param2];
                              param0[param2] = param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                              break L11;
                            }
                          }
                          L12: {
                            param9 = param9 + param10;
                            param2++;
                            if (param9 >= param1[param2]) {
                              break L12;
                            } else {
                              var14 = param0[param2];
                              param0[param2] = param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                              break L12;
                            }
                          }
                          L13: {
                            param9 = param9 + param10;
                            param2++;
                            if (param9 >= param1[param2]) {
                              break L13;
                            } else {
                              var14 = param0[param2];
                              param0[param2] = param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                              break L13;
                            }
                          }
                          param9 = param9 + param10;
                          param4--;
                          if (param4 > 0) {
                            continue L9;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    param4 = param6 - param5 & 3;
                    if (param4 <= 0) {
                      break L3;
                    } else {
                      param3 = bt.field_h[(int)param7];
                      param3 = ((param3 & 16711935) * var13 >> 8 & 16711935) + ((param3 & 65280) * var13 >> 8 & 65280);
                      L14: while (true) {
                        L15: {
                          param2++;
                          if (param9 >= param1[param2]) {
                            break L15;
                          } else {
                            var14 = param0[param2];
                            param0[param2] = param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                            break L15;
                          }
                        }
                        param9 = param9 + param10;
                        param4--;
                        if (param4 > 0) {
                          continue L14;
                        } else {
                          break L2;
                        }
                      }
                    }
                  } else {
                    L16: {
                      if (param4 <= 0) {
                        break L16;
                      } else {
                        L17: while (true) {
                          L18: {
                            param3 = bt.field_h[(int)param7];
                            param7 = param7 + param8;
                            param2++;
                            if (param9 >= param1[param2]) {
                              break L18;
                            } else {
                              param0[param2] = param3;
                              break L18;
                            }
                          }
                          L19: {
                            param9 = param9 + param10;
                            param2++;
                            if (param9 >= param1[param2]) {
                              break L19;
                            } else {
                              param0[param2] = param3;
                              break L19;
                            }
                          }
                          L20: {
                            param9 = param9 + param10;
                            param2++;
                            if (param9 >= param1[param2]) {
                              break L20;
                            } else {
                              param0[param2] = param3;
                              break L20;
                            }
                          }
                          L21: {
                            param9 = param9 + param10;
                            param2++;
                            if (param9 >= param1[param2]) {
                              break L21;
                            } else {
                              param0[param2] = param3;
                              break L21;
                            }
                          }
                          param9 = param9 + param10;
                          param4--;
                          if (param4 > 0) {
                            continue L17;
                          } else {
                            break L16;
                          }
                        }
                      }
                    }
                    param4 = param6 - param5 & 3;
                    if (param4 <= 0) {
                      break L2;
                    } else {
                      param3 = bt.field_h[(int)param7];
                      L22: while (true) {
                        L23: {
                          param2++;
                          if (param9 >= param1[param2]) {
                            break L23;
                          } else {
                            param0[param2] = param3;
                            break L23;
                          }
                        }
                        param9 = param9 + param10;
                        param4--;
                        if (param4 > 0) {
                          continue L22;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              } else {
                if (!this.field_j) {
                  param4 = param6 - param5;
                  if (this.field_b != 0) {
                    var12 = this.field_b;
                    var13 = 256 - this.field_b;
                    L24: while (true) {
                      L25: {
                        param2++;
                        if (param9 >= param1[param2]) {
                          break L25;
                        } else {
                          param3 = bt.field_h[(int)param7];
                          param3 = ((param3 & 16711935) * var13 >> 8 & 16711935) + ((param3 & 65280) * var13 >> 8 & 65280);
                          var14 = param0[param2];
                          param0[param2] = param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                          param1[param2] = param9;
                          break L25;
                        }
                      }
                      param7 = param7 + param8;
                      param9 = param9 + param10;
                      param4--;
                      if (param4 > 0) {
                        continue L24;
                      } else {
                        break L2;
                      }
                    }
                  } else {
                    L26: while (true) {
                      L27: {
                        param2++;
                        if (param9 >= param1[param2]) {
                          break L27;
                        } else {
                          param0[param2] = bt.field_h[(int)param7];
                          param1[param2] = param9;
                          break L27;
                        }
                      }
                      param9 = param9 + param10;
                      param7 = param7 + param8;
                      param4--;
                      if (param4 > 0) {
                        continue L26;
                      } else {
                        break L2;
                      }
                    }
                  }
                } else {
                  param4 = param6 - param5 >> 2;
                  param8 = param8 * 4.0f;
                  if (this.field_b != 0) {
                    L28: {
                      var12 = this.field_b;
                      var13 = 256 - this.field_b;
                      if (param4 <= 0) {
                        break L28;
                      } else {
                        L29: while (true) {
                          L30: {
                            param3 = bt.field_h[(int)param7];
                            param7 = param7 + param8;
                            param3 = ((param3 & 16711935) * var13 >> 8 & 16711935) + ((param3 & 65280) * var13 >> 8 & 65280);
                            param2++;
                            if (param9 >= param1[param2]) {
                              break L30;
                            } else {
                              var14 = param0[param2];
                              param0[param2] = param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                              param1[param2] = param9;
                              break L30;
                            }
                          }
                          L31: {
                            param9 = param9 + param10;
                            param2++;
                            if (param9 >= param1[param2]) {
                              break L31;
                            } else {
                              var14 = param0[param2];
                              param0[param2] = param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                              param1[param2] = param9;
                              break L31;
                            }
                          }
                          L32: {
                            param9 = param9 + param10;
                            param2++;
                            if (param9 >= param1[param2]) {
                              break L32;
                            } else {
                              var14 = param0[param2];
                              param0[param2] = param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                              param1[param2] = param9;
                              break L32;
                            }
                          }
                          L33: {
                            param9 = param9 + param10;
                            param2++;
                            if (param9 >= param1[param2]) {
                              break L33;
                            } else {
                              var14 = param0[param2];
                              param0[param2] = param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                              param1[param2] = param9;
                              break L33;
                            }
                          }
                          param9 = param9 + param10;
                          param4--;
                          if (param4 > 0) {
                            continue L29;
                          } else {
                            break L28;
                          }
                        }
                      }
                    }
                    param4 = param6 - param5 & 3;
                    if (param4 <= 0) {
                      break L3;
                    } else {
                      param3 = bt.field_h[(int)param7];
                      param3 = ((param3 & 16711935) * var13 >> 8 & 16711935) + ((param3 & 65280) * var13 >> 8 & 65280);
                      L34: while (true) {
                        L35: {
                          param2++;
                          if (param9 >= param1[param2]) {
                            break L35;
                          } else {
                            var14 = param0[param2];
                            param0[param2] = param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                            param1[param2] = param9;
                            break L35;
                          }
                        }
                        param9 = param9 + param10;
                        param4--;
                        if (param4 > 0) {
                          continue L34;
                        } else {
                          break L2;
                        }
                      }
                    }
                  } else {
                    L36: {
                      if (param4 <= 0) {
                        break L36;
                      } else {
                        L37: while (true) {
                          L38: {
                            param3 = bt.field_h[(int)param7];
                            param7 = param7 + param8;
                            param2++;
                            if (param9 >= param1[param2]) {
                              break L38;
                            } else {
                              param0[param2] = param3;
                              param1[param2] = param9;
                              break L38;
                            }
                          }
                          L39: {
                            param9 = param9 + param10;
                            param2++;
                            if (param9 >= param1[param2]) {
                              break L39;
                            } else {
                              param0[param2] = param3;
                              param1[param2] = param9;
                              break L39;
                            }
                          }
                          L40: {
                            param9 = param9 + param10;
                            param2++;
                            if (param9 >= param1[param2]) {
                              break L40;
                            } else {
                              param0[param2] = param3;
                              param1[param2] = param9;
                              break L40;
                            }
                          }
                          L41: {
                            param9 = param9 + param10;
                            param2++;
                            if (param9 >= param1[param2]) {
                              break L41;
                            } else {
                              param0[param2] = param3;
                              param1[param2] = param9;
                              break L41;
                            }
                          }
                          param9 = param9 + param10;
                          param4--;
                          if (param4 > 0) {
                            continue L37;
                          } else {
                            break L36;
                          }
                        }
                      }
                    }
                    param4 = param6 - param5 & 3;
                    if (param4 > 0) {
                      param3 = bt.field_h[(int)param7];
                      L42: while (true) {
                        L43: {
                          param2++;
                          if (param9 >= param1[param2]) {
                            break L43;
                          } else {
                            param0[param2] = param3;
                            param1[param2] = param9;
                            break L43;
                          }
                        }
                        param9 = param9 + param10;
                        param4--;
                        if (param4 > 0) {
                          continue L42;
                        } else {
                          break L2;
                        }
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
            }
            break L2;
          }
          return;
        } else {
          return;
        }
    }

    final void b(float param0, float param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8, float param9, float param10, float param11) {
        float var13;
        float var14;
        float var15;
        float var16;
        float var17;
        float var18;
        float var19;
        float var20;
        float var21;
        float var22;
        float var23;
        float var24;
        float var25;
        float var26;
        float var27;
        float var28;
        if (!this.field_s) {
          L0: {
            var13 = param4 - param3;
            var14 = param1 - param0;
            var15 = param5 - param3;
            var16 = param2 - param0;
            var17 = param10 - param9;
            var18 = param11 - param9;
            var19 = param7 - param6;
            var20 = param8 - param6;
            if (param2 == param1) {
              var21 = 0.0f;
              break L0;
            } else {
              var21 = (param5 - param4) / (param2 - param1);
              break L0;
            }
          }
          L1: {
            if (param1 == param0) {
              var22 = 0.0f;
              break L1;
            } else {
              var22 = var13 / var14;
              break L1;
            }
          }
          L2: {
            if (param2 == param0) {
              var23 = 0.0f;
              break L2;
            } else {
              var23 = var15 / var16;
              break L2;
            }
          }
          var24 = var13 * var16 - var15 * var14;
          if (var24 != 0.0f) {
            L3: {
              var25 = (var17 * var16 - var18 * var14) / var24;
              var26 = (var18 * var13 - var17 * var15) / var24;
              var27 = (var19 * var16 - var20 * var14) / var24;
              var28 = (var20 * var13 - var19 * var15) / var24;
              if (param0 > param1) {
                break L3;
              } else {
                if (param0 > param2) {
                  break L3;
                } else {
                  if (param0 < (float)this.field_v) {
                    L4: {
                      if (param1 <= (float)this.field_v) {
                        break L4;
                      } else {
                        param1 = (float)this.field_v;
                        break L4;
                      }
                    }
                    L5: {
                      if (param2 <= (float)this.field_v) {
                        break L5;
                      } else {
                        param2 = (float)this.field_v;
                        break L5;
                      }
                    }
                    param9 = param9 - var25 * param3 + var25;
                    param6 = param6 - var27 * param3 + var27;
                    if (param1 >= param2) {
                      L6: {
                        param4 = param3;
                        if (param0 >= 0.0f) {
                          break L6;
                        } else {
                          param4 = param4 - var23 * param0;
                          param3 = param3 - var22 * param0;
                          param9 = param9 - var26 * param0;
                          param6 = param6 - var28 * param0;
                          param0 = 0.0f;
                          break L6;
                        }
                      }
                      L7: {
                        if (param2 >= 0.0f) {
                          break L7;
                        } else {
                          param5 = param5 - var21 * param2;
                          param2 = 0.0f;
                          break L7;
                        }
                      }
                      L8: {
                        if (param0 == param2) {
                          break L8;
                        } else {
                          if (var23 >= var22) {
                            break L8;
                          } else {
                            param1 = param1 - param2;
                            param2 = param2 - param0;
                            param0 = (float)this.field_p[(int)param0];
                            L9: while (true) {
                              param2 = param2 - 1.0f;
                              if (param2 < 0.0f) {
                                L10: while (true) {
                                  param1 = param1 - 1.0f;
                                  if (param1 < 0.0f) {
                                    return;
                                  } else {
                                    this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param3, param9, var25, param6, var27);
                                    param5 = param5 + var21;
                                    param3 = param3 + var22;
                                    param9 = param9 + var26;
                                    param6 = param6 + var28;
                                    param0 = param0 + (float)this.field_t;
                                    continue L10;
                                  }
                                }
                              } else {
                                this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param4, (int)param3, param9, var25, param6, var27);
                                param4 = param4 + var23;
                                param3 = param3 + var22;
                                param9 = param9 + var26;
                                param6 = param6 + var28;
                                param0 = param0 + (float)this.field_t;
                                continue L9;
                              }
                            }
                          }
                        }
                      }
                      if (param0 == param2) {
                        if (var21 > var22) {
                          param1 = param1 - param2;
                          param2 = param2 - param0;
                          param0 = (float)this.field_p[(int)param0];
                          L11: while (true) {
                            param2 = param2 - 1.0f;
                            if (param2 < 0.0f) {
                              L12: while (true) {
                                param1 = param1 - 1.0f;
                                if (param1 < 0.0f) {
                                  return;
                                } else {
                                  this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param3, param9, var25, param6, var27);
                                  param5 = param5 + var21;
                                  param3 = param3 + var22;
                                  param9 = param9 + var26;
                                  param6 = param6 + var28;
                                  param0 = param0 + (float)this.field_t;
                                  continue L12;
                                }
                              }
                            } else {
                              this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param4, (int)param3, param9, var25, param6, var27);
                              param4 = param4 + var23;
                              param3 = param3 + var22;
                              param9 = param9 + var26;
                              param6 = param6 + var28;
                              param0 = param0 + (float)this.field_t;
                              continue L11;
                            }
                          }
                        } else {
                          param1 = param1 - param2;
                          param2 = param2 - param0;
                          param0 = (float)this.field_p[(int)param0];
                          L13: while (true) {
                            param2 = param2 - 1.0f;
                            if (param2 < 0.0f) {
                              L14: while (true) {
                                param1 = param1 - 1.0f;
                                if (param1 < 0.0f) {
                                  return;
                                } else {
                                  this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param5, param9, var25, param6, var27);
                                  param5 = param5 + var21;
                                  param3 = param3 + var22;
                                  param9 = param9 + var26;
                                  param6 = param6 + var28;
                                  param0 = param0 + (float)this.field_t;
                                  continue L14;
                                }
                              }
                            } else {
                              this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param4, param9, var25, param6, var27);
                              param4 = param4 + var23;
                              param3 = param3 + var22;
                              param9 = param9 + var26;
                              param6 = param6 + var28;
                              param0 = param0 + (float)this.field_t;
                              continue L13;
                            }
                          }
                        }
                      } else {
                        param1 = param1 - param2;
                        param2 = param2 - param0;
                        param0 = (float)this.field_p[(int)param0];
                        L15: while (true) {
                          param2 = param2 - 1.0f;
                          if (param2 < 0.0f) {
                            L16: while (true) {
                              param1 = param1 - 1.0f;
                              if (param1 < 0.0f) {
                                return;
                              } else {
                                this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param5, param9, var25, param6, var27);
                                param5 = param5 + var21;
                                param3 = param3 + var22;
                                param9 = param9 + var26;
                                param6 = param6 + var28;
                                param0 = param0 + (float)this.field_t;
                                continue L16;
                              }
                            }
                          } else {
                            this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param4, param9, var25, param6, var27);
                            param4 = param4 + var23;
                            param3 = param3 + var22;
                            param9 = param9 + var26;
                            param6 = param6 + var28;
                            param0 = param0 + (float)this.field_t;
                            continue L15;
                          }
                        }
                      }
                    } else {
                      L17: {
                        param5 = param3;
                        if (param0 >= 0.0f) {
                          break L17;
                        } else {
                          param5 = param5 - var23 * param0;
                          param3 = param3 - var22 * param0;
                          param9 = param9 - var26 * param0;
                          param6 = param6 - var28 * param0;
                          param0 = 0.0f;
                          break L17;
                        }
                      }
                      L18: {
                        if (param1 >= 0.0f) {
                          break L18;
                        } else {
                          param4 = param4 - var21 * param1;
                          param1 = 0.0f;
                          break L18;
                        }
                      }
                      L19: {
                        if (param0 == param1) {
                          break L19;
                        } else {
                          if (var23 >= var22) {
                            break L19;
                          } else {
                            param2 = param2 - param1;
                            param1 = param1 - param0;
                            param0 = (float)this.field_p[(int)param0];
                            L20: while (true) {
                              param1 = param1 - 1.0f;
                              if (param1 < 0.0f) {
                                L21: while (true) {
                                  param2 = param2 - 1.0f;
                                  if (param2 < 0.0f) {
                                    return;
                                  } else {
                                    this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param4, param9, var25, param6, var27);
                                    param5 = param5 + var23;
                                    param4 = param4 + var21;
                                    param9 = param9 + var26;
                                    param6 = param6 + var28;
                                    param0 = param0 + (float)this.field_t;
                                    continue L21;
                                  }
                                }
                              } else {
                                this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param3, param9, var25, param6, var27);
                                param5 = param5 + var23;
                                param3 = param3 + var22;
                                param9 = param9 + var26;
                                param6 = param6 + var28;
                                param0 = param0 + (float)this.field_t;
                                continue L20;
                              }
                            }
                          }
                        }
                      }
                      if (param0 == param1) {
                        if (var23 > var21) {
                          param2 = param2 - param1;
                          param1 = param1 - param0;
                          param0 = (float)this.field_p[(int)param0];
                          L22: while (true) {
                            param1 = param1 - 1.0f;
                            if (param1 < 0.0f) {
                              L23: while (true) {
                                param2 = param2 - 1.0f;
                                if (param2 < 0.0f) {
                                  return;
                                } else {
                                  this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param4, param9, var25, param6, var27);
                                  param5 = param5 + var23;
                                  param4 = param4 + var21;
                                  param9 = param9 + var26;
                                  param6 = param6 + var28;
                                  param0 = param0 + (float)this.field_t;
                                  continue L23;
                                }
                              }
                            } else {
                              this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param5, (int)param3, param9, var25, param6, var27);
                              param5 = param5 + var23;
                              param3 = param3 + var22;
                              param9 = param9 + var26;
                              param6 = param6 + var28;
                              param0 = param0 + (float)this.field_t;
                              continue L22;
                            }
                          }
                        } else {
                          param2 = param2 - param1;
                          param1 = param1 - param0;
                          param0 = (float)this.field_p[(int)param0];
                          L24: while (true) {
                            param1 = param1 - 1.0f;
                            if (param1 < 0.0f) {
                              L25: while (true) {
                                param2 = param2 - 1.0f;
                                if (param2 < 0.0f) {
                                  return;
                                } else {
                                  this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param4, (int)param5, param9, var25, param6, var27);
                                  param5 = param5 + var23;
                                  param4 = param4 + var21;
                                  param9 = param9 + var26;
                                  param6 = param6 + var28;
                                  param0 = param0 + (float)this.field_t;
                                  continue L25;
                                }
                              }
                            } else {
                              this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param5, param9, var25, param6, var27);
                              param5 = param5 + var23;
                              param3 = param3 + var22;
                              param9 = param9 + var26;
                              param6 = param6 + var28;
                              param0 = param0 + (float)this.field_t;
                              continue L24;
                            }
                          }
                        }
                      } else {
                        param2 = param2 - param1;
                        param1 = param1 - param0;
                        param0 = (float)this.field_p[(int)param0];
                        L26: while (true) {
                          param1 = param1 - 1.0f;
                          if (param1 < 0.0f) {
                            L27: while (true) {
                              param2 = param2 - 1.0f;
                              if (param2 < 0.0f) {
                                return;
                              } else {
                                this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param4, (int)param5, param9, var25, param6, var27);
                                param5 = param5 + var23;
                                param4 = param4 + var21;
                                param9 = param9 + var26;
                                param6 = param6 + var28;
                                param0 = param0 + (float)this.field_t;
                                continue L27;
                              }
                            }
                          } else {
                            this.b(this.field_a, this.field_u, (int)param0, 0, 0, (int)param3, (int)param5, param9, var25, param6, var27);
                            param5 = param5 + var23;
                            param3 = param3 + var22;
                            param9 = param9 + var26;
                            param6 = param6 + var28;
                            param0 = param0 + (float)this.field_t;
                            continue L26;
                          }
                        }
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            if (param1 > param2) {
              if (param2 < (float)this.field_v) {
                L28: {
                  if (param0 <= (float)this.field_v) {
                    break L28;
                  } else {
                    param0 = (float)this.field_v;
                    break L28;
                  }
                }
                L29: {
                  if (param1 <= (float)this.field_v) {
                    break L29;
                  } else {
                    param1 = (float)this.field_v;
                    break L29;
                  }
                }
                param11 = param11 - var25 * param5 + var25;
                param8 = param8 - var27 * param5 + var27;
                if (param0 >= param1) {
                  L30: {
                    param3 = param5;
                    if (param2 >= 0.0f) {
                      break L30;
                    } else {
                      param3 = param3 - var21 * param2;
                      param5 = param5 - var23 * param2;
                      param11 = param11 - var26 * param2;
                      param8 = param8 - var28 * param2;
                      param2 = 0.0f;
                      break L30;
                    }
                  }
                  L31: {
                    if (param1 >= 0.0f) {
                      break L31;
                    } else {
                      param4 = param4 - var22 * param1;
                      param1 = 0.0f;
                      break L31;
                    }
                  }
                  if (var21 < var23) {
                    param0 = param0 - param1;
                    param1 = param1 - param2;
                    param2 = (float)this.field_p[(int)param2];
                    L32: while (true) {
                      param1 = param1 - 1.0f;
                      if (param1 < 0.0f) {
                        L33: while (true) {
                          param0 = param0 - 1.0f;
                          if (param0 < 0.0f) {
                            return;
                          } else {
                            this.b(this.field_a, this.field_u, (int)param2, 0, 0, (int)param4, (int)param5, param11, var25, param8, var27);
                            param4 = param4 + var22;
                            param5 = param5 + var23;
                            param11 = param11 + var26;
                            param8 = param8 + var28;
                            param2 = param2 + (float)this.field_t;
                            continue L33;
                          }
                        }
                      } else {
                        this.b(this.field_a, this.field_u, (int)param2, 0, 0, (int)param3, (int)param5, param11, var25, param8, var27);
                        param3 = param3 + var21;
                        param5 = param5 + var23;
                        param11 = param11 + var26;
                        param8 = param8 + var28;
                        param2 = param2 + (float)this.field_t;
                        continue L32;
                      }
                    }
                  } else {
                    param0 = param0 - param1;
                    param1 = param1 - param2;
                    param2 = (float)this.field_p[(int)param2];
                    L34: while (true) {
                      param1 = param1 - 1.0f;
                      if (param1 < 0.0f) {
                        L35: while (true) {
                          param0 = param0 - 1.0f;
                          if (param0 < 0.0f) {
                            return;
                          } else {
                            this.b(this.field_a, this.field_u, (int)param2, 0, 0, (int)param5, (int)param4, param11, var25, param8, var27);
                            param4 = param4 + var22;
                            param5 = param5 + var23;
                            param11 = param11 + var26;
                            param8 = param8 + var28;
                            param2 = param2 + (float)this.field_t;
                            continue L35;
                          }
                        }
                      } else {
                        this.b(this.field_a, this.field_u, (int)param2, 0, 0, (int)param5, (int)param3, param11, var25, param8, var27);
                        param3 = param3 + var21;
                        param5 = param5 + var23;
                        param11 = param11 + var26;
                        param8 = param8 + var28;
                        param2 = param2 + (float)this.field_t;
                        continue L34;
                      }
                    }
                  }
                } else {
                  L36: {
                    param4 = param5;
                    if (param2 >= 0.0f) {
                      break L36;
                    } else {
                      param4 = param4 - var21 * param2;
                      param5 = param5 - var23 * param2;
                      param11 = param11 - var26 * param2;
                      param8 = param8 - var28 * param2;
                      param2 = 0.0f;
                      break L36;
                    }
                  }
                  L37: {
                    if (param0 >= 0.0f) {
                      break L37;
                    } else {
                      param3 = param3 - var22 * param0;
                      param0 = 0.0f;
                      break L37;
                    }
                  }
                  if (var21 < var23) {
                    param1 = param1 - param0;
                    param0 = param0 - param2;
                    param2 = (float)this.field_p[(int)param2];
                    L38: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        L39: while (true) {
                          param1 = param1 - 1.0f;
                          if (param1 < 0.0f) {
                            return;
                          } else {
                            this.b(this.field_a, this.field_u, (int)param2, 0, 0, (int)param4, (int)param3, param11, var25, param8, var27);
                            param4 = param4 + var21;
                            param3 = param3 + var22;
                            param11 = param11 + var26;
                            param8 = param8 + var28;
                            param2 = param2 + (float)this.field_t;
                            continue L39;
                          }
                        }
                      } else {
                        this.b(this.field_a, this.field_u, (int)param2, 0, 0, (int)param4, (int)param5, param11, var25, param8, var27);
                        param4 = param4 + var21;
                        param5 = param5 + var23;
                        param11 = param11 + var26;
                        param8 = param8 + var28;
                        param2 = param2 + (float)this.field_t;
                        continue L38;
                      }
                    }
                  } else {
                    param1 = param1 - param0;
                    param0 = param0 - param2;
                    param2 = (float)this.field_p[(int)param2];
                    L40: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        L41: while (true) {
                          param1 = param1 - 1.0f;
                          if (param1 < 0.0f) {
                            return;
                          } else {
                            this.b(this.field_a, this.field_u, (int)param2, 0, 0, (int)param3, (int)param4, param11, var25, param8, var27);
                            param4 = param4 + var21;
                            param3 = param3 + var22;
                            param11 = param11 + var26;
                            param8 = param8 + var28;
                            param2 = param2 + (float)this.field_t;
                            continue L41;
                          }
                        }
                      } else {
                        this.b(this.field_a, this.field_u, (int)param2, 0, 0, (int)param5, (int)param4, param11, var25, param8, var27);
                        param4 = param4 + var21;
                        param5 = param5 + var23;
                        param11 = param11 + var26;
                        param8 = param8 + var28;
                        param2 = param2 + (float)this.field_t;
                        continue L40;
                      }
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              if (param1 < (float)this.field_v) {
                L42: {
                  if (param2 <= (float)this.field_v) {
                    break L42;
                  } else {
                    param2 = (float)this.field_v;
                    break L42;
                  }
                }
                L43: {
                  if (param0 <= (float)this.field_v) {
                    break L43;
                  } else {
                    param0 = (float)this.field_v;
                    break L43;
                  }
                }
                param10 = param10 - var25 * param4 + var25;
                param7 = param7 - var27 * param4 + var27;
                if (param2 >= param0) {
                  L44: {
                    param5 = param4;
                    if (param1 >= 0.0f) {
                      break L44;
                    } else {
                      param5 = param5 - var22 * param1;
                      param4 = param4 - var21 * param1;
                      param10 = param10 - var26 * param1;
                      param7 = param7 - var28 * param1;
                      param1 = 0.0f;
                      break L44;
                    }
                  }
                  L45: {
                    if (param0 >= 0.0f) {
                      break L45;
                    } else {
                      param3 = param3 - var23 * param0;
                      param0 = 0.0f;
                      break L45;
                    }
                  }
                  if (var22 < var21) {
                    param2 = param2 - param0;
                    param0 = param0 - param1;
                    param1 = (float)this.field_p[(int)param1];
                    L46: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        L47: while (true) {
                          param2 = param2 - 1.0f;
                          if (param2 < 0.0f) {
                            return;
                          } else {
                            this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param3, (int)param4, param10, var25, param7, var27);
                            param3 = param3 + var23;
                            param4 = param4 + var21;
                            param10 = param10 + var26;
                            param7 = param7 + var28;
                            param1 = param1 + (float)this.field_t;
                            continue L47;
                          }
                        }
                      } else {
                        this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param5, (int)param4, param10, var25, param7, var27);
                        param5 = param5 + var22;
                        param4 = param4 + var21;
                        param10 = param10 + var26;
                        param7 = param7 + var28;
                        param1 = param1 + (float)this.field_t;
                        continue L46;
                      }
                    }
                  } else {
                    param2 = param2 - param0;
                    param0 = param0 - param1;
                    param1 = (float)this.field_p[(int)param1];
                    L48: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        L49: while (true) {
                          param2 = param2 - 1.0f;
                          if (param2 < 0.0f) {
                            return;
                          } else {
                            this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param4, (int)param3, param10, var25, param7, var27);
                            param3 = param3 + var23;
                            param4 = param4 + var21;
                            param10 = param10 + var26;
                            param7 = param7 + var28;
                            param1 = param1 + (float)this.field_t;
                            continue L49;
                          }
                        }
                      } else {
                        this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param4, (int)param5, param10, var25, param7, var27);
                        param5 = param5 + var22;
                        param4 = param4 + var21;
                        param10 = param10 + var26;
                        param7 = param7 + var28;
                        param1 = param1 + (float)this.field_t;
                        continue L48;
                      }
                    }
                  }
                } else {
                  L50: {
                    param3 = param4;
                    if (param1 >= 0.0f) {
                      break L50;
                    } else {
                      param3 = param3 - var22 * param1;
                      param4 = param4 - var21 * param1;
                      param10 = param10 - var26 * param1;
                      param7 = param7 - var28 * param1;
                      param1 = 0.0f;
                      break L50;
                    }
                  }
                  L51: {
                    if (param2 >= 0.0f) {
                      break L51;
                    } else {
                      param5 = param5 - var23 * param2;
                      param2 = 0.0f;
                      break L51;
                    }
                  }
                  L52: {
                    if (param1 == param2) {
                      break L52;
                    } else {
                      if (var22 >= var21) {
                        break L52;
                      } else {
                        param0 = param0 - param2;
                        param2 = param2 - param1;
                        param1 = (float)this.field_p[(int)param1];
                        L53: while (true) {
                          param2 = param2 - 1.0f;
                          if (param2 < 0.0f) {
                            L54: while (true) {
                              param0 = param0 - 1.0f;
                              if (param0 < 0.0f) {
                                return;
                              } else {
                                this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param3, (int)param5, param10, var25, param7, var27);
                                param3 = param3 + var22;
                                param5 = param5 + var23;
                                param10 = param10 + var26;
                                param7 = param7 + var28;
                                param1 = param1 + (float)this.field_t;
                                continue L54;
                              }
                            }
                          } else {
                            this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param3, (int)param4, param10, var25, param7, var27);
                            param3 = param3 + var22;
                            param4 = param4 + var21;
                            param10 = param10 + var26;
                            param7 = param7 + var28;
                            param1 = param1 + (float)this.field_t;
                            continue L53;
                          }
                        }
                      }
                    }
                  }
                  if (param1 == param2) {
                    if (var22 > var23) {
                      param0 = param0 - param2;
                      param2 = param2 - param1;
                      param1 = (float)this.field_p[(int)param1];
                      L55: while (true) {
                        param2 = param2 - 1.0f;
                        if (param2 < 0.0f) {
                          L56: while (true) {
                            param0 = param0 - 1.0f;
                            if (param0 < 0.0f) {
                              return;
                            } else {
                              this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param3, (int)param5, param10, var25, param7, var27);
                              param3 = param3 + var22;
                              param5 = param5 + var23;
                              param10 = param10 + var26;
                              param7 = param7 + var28;
                              param1 = param1 + (float)this.field_t;
                              continue L56;
                            }
                          }
                        } else {
                          this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param3, (int)param4, param10, var25, param7, var27);
                          param3 = param3 + var22;
                          param4 = param4 + var21;
                          param10 = param10 + var26;
                          param7 = param7 + var28;
                          param1 = param1 + (float)this.field_t;
                          continue L55;
                        }
                      }
                    } else {
                      param0 = param0 - param2;
                      param2 = param2 - param1;
                      param1 = (float)this.field_p[(int)param1];
                      L57: while (true) {
                        param2 = param2 - 1.0f;
                        if (param2 < 0.0f) {
                          L58: while (true) {
                            param0 = param0 - 1.0f;
                            if (param0 < 0.0f) {
                              return;
                            } else {
                              this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param5, (int)param3, param10, var25, param7, var27);
                              param3 = param3 + var22;
                              param5 = param5 + var23;
                              param10 = param10 + var26;
                              param7 = param7 + var28;
                              param1 = param1 + (float)this.field_t;
                              continue L58;
                            }
                          }
                        } else {
                          this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param4, (int)param3, param10, var25, param7, var27);
                          param3 = param3 + var22;
                          param4 = param4 + var21;
                          param10 = param10 + var26;
                          param7 = param7 + var28;
                          param1 = param1 + (float)this.field_t;
                          continue L57;
                        }
                      }
                    }
                  } else {
                    param0 = param0 - param2;
                    param2 = param2 - param1;
                    param1 = (float)this.field_p[(int)param1];
                    L59: while (true) {
                      param2 = param2 - 1.0f;
                      if (param2 < 0.0f) {
                        L60: while (true) {
                          param0 = param0 - 1.0f;
                          if (param0 < 0.0f) {
                            return;
                          } else {
                            this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param5, (int)param3, param10, var25, param7, var27);
                            param3 = param3 + var22;
                            param5 = param5 + var23;
                            param10 = param10 + var26;
                            param7 = param7 + var28;
                            param1 = param1 + (float)this.field_t;
                            continue L60;
                          }
                        }
                      } else {
                        this.b(this.field_a, this.field_u, (int)param1, 0, 0, (int)param4, (int)param3, param10, var25, param7, var27);
                        param3 = param3 + var22;
                        param4 = param4 + var21;
                        param10 = param10 + var26;
                        param7 = param7 + var28;
                        param1 = param1 + (float)this.field_t;
                        continue L59;
                      }
                    }
                  }
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } else {
          this.field_k.b((int)param0, bt.field_h[(int)param9], (int)param3, (int)param1, 1, (int)param4);
          this.field_k.b((int)param1, bt.field_h[(int)param9], (int)param4, (int)param2, 1, (int)param5);
          this.field_k.b((int)param2, bt.field_h[(int)param9], (int)param5, (int)param0, 1, (int)param3);
          return;
        }
    }

    private final void a(int[] param0, float[] param1, int param2, int param3, int param4, int param5, int param6, float param7, float param8) {
        int var10;
        int var11;
        int var12;
        L0: {
          if (!this.field_q) {
            break L0;
          } else {
            L1: {
              if (param6 <= this.field_h) {
                break L1;
              } else {
                param6 = this.field_h;
                break L1;
              }
            }
            if (param5 >= 0) {
              break L0;
            } else {
              param5 = 0;
              break L0;
            }
          }
        }
        if (param5 < param6) {
          param2 = param2 + (param5 - 1);
          param4 = param6 - param5 >> 2;
          param7 = param7 + param8 * (float)param5;
          if (!this.field_o.field_n) {
            if (this.field_b != 0) {
              L2: {
                if (this.field_b != 254) {
                  var10 = this.field_b;
                  var11 = 256 - this.field_b;
                  param3 = ((param3 & 16711935) * var11 >> 8 & 16711935) + ((param3 & 65280) * var11 >> 8 & 65280);
                  L3: while (true) {
                    param4--;
                    if (param4 < 0) {
                      param4 = param6 - param5 & 3;
                      L4: while (true) {
                        param4--;
                        if (param4 < 0) {
                          break L2;
                        } else {
                          L5: {
                            param2++;
                            if (param7 >= param1[param2]) {
                              break L5;
                            } else {
                              var12 = param0[param2];
                              param0[param2] = param3 + ((var12 & 16711935) * var10 >> 8 & 16711935) + ((var12 & 65280) * var10 >> 8 & 65280);
                              break L5;
                            }
                          }
                          param7 = param7 + param8;
                          continue L4;
                        }
                      }
                    } else {
                      L6: {
                        param2++;
                        if (param7 >= param1[param2]) {
                          break L6;
                        } else {
                          var12 = param0[param2];
                          param0[param2] = param3 + ((var12 & 16711935) * var10 >> 8 & 16711935) + ((var12 & 65280) * var10 >> 8 & 65280);
                          break L6;
                        }
                      }
                      L7: {
                        param7 = param7 + param8;
                        param2++;
                        if (param7 >= param1[param2]) {
                          break L7;
                        } else {
                          var12 = param0[param2];
                          param0[param2] = param3 + ((var12 & 16711935) * var10 >> 8 & 16711935) + ((var12 & 65280) * var10 >> 8 & 65280);
                          break L7;
                        }
                      }
                      L8: {
                        param7 = param7 + param8;
                        param2++;
                        if (param7 >= param1[param2]) {
                          break L8;
                        } else {
                          var12 = param0[param2];
                          param0[param2] = param3 + ((var12 & 16711935) * var10 >> 8 & 16711935) + ((var12 & 65280) * var10 >> 8 & 65280);
                          break L8;
                        }
                      }
                      L9: {
                        param7 = param7 + param8;
                        param2++;
                        if (param7 >= param1[param2]) {
                          break L9;
                        } else {
                          var12 = param0[param2];
                          param0[param2] = param3 + ((var12 & 16711935) * var10 >> 8 & 16711935) + ((var12 & 65280) * var10 >> 8 & 65280);
                          break L9;
                        }
                      }
                      param7 = param7 + param8;
                      continue L3;
                    }
                  }
                } else {
                  if (param5 != 0) {
                    if (param6 <= this.field_h - 1) {
                      param4--;
                      L10: while (true) {
                        if (param4 < 0) {
                          param4 = param6 - param5 & 3;
                          L11: while (true) {
                            param4--;
                            if (param4 < 0) {
                              break L2;
                            } else {
                              L12: {
                                param2++;
                                if (param7 >= param1[param2]) {
                                  break L12;
                                } else {
                                  param0[param2 - 1] = param0[param2];
                                  break L12;
                                }
                              }
                              param7 = param7 + param8;
                              continue L11;
                            }
                          }
                        } else {
                          L13: {
                            param2++;
                            if (param7 >= param1[param2]) {
                              break L13;
                            } else {
                              param0[param2 - 1] = param0[param2];
                              break L13;
                            }
                          }
                          L14: {
                            param7 = param7 + param8;
                            param2++;
                            if (param7 >= param1[param2]) {
                              break L14;
                            } else {
                              param0[param2 - 1] = param0[param2];
                              break L14;
                            }
                          }
                          L15: {
                            param7 = param7 + param8;
                            param2++;
                            if (param7 >= param1[param2]) {
                              break L15;
                            } else {
                              param0[param2 - 1] = param0[param2];
                              break L15;
                            }
                          }
                          L16: {
                            param7 = param7 + param8;
                            param2++;
                            if (param7 >= param1[param2]) {
                              break L16;
                            } else {
                              param0[param2 - 1] = param0[param2];
                              break L16;
                            }
                          }
                          param7 = param7 + param8;
                          param4--;
                          continue L10;
                        }
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
              return;
            } else {
              L17: while (true) {
                param4--;
                if (param4 < 0) {
                  param4 = param6 - param5 & 3;
                  L18: while (true) {
                    param4--;
                    if (param4 >= 0) {
                      L19: {
                        param2++;
                        if (param7 >= param1[param2]) {
                          break L19;
                        } else {
                          param0[param2] = param3;
                          break L19;
                        }
                      }
                      param7 = param7 + param8;
                      continue L18;
                    } else {
                      return;
                    }
                  }
                } else {
                  L20: {
                    param2++;
                    if (param7 >= param1[param2]) {
                      break L20;
                    } else {
                      param0[param2] = param3;
                      break L20;
                    }
                  }
                  L21: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                      break L21;
                    } else {
                      param0[param2] = param3;
                      break L21;
                    }
                  }
                  L22: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                      break L22;
                    } else {
                      param0[param2] = param3;
                      break L22;
                    }
                  }
                  L23: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                      break L23;
                    } else {
                      param0[param2] = param3;
                      break L23;
                    }
                  }
                  param7 = param7 + param8;
                  continue L17;
                }
              }
            }
          } else {
            if (this.field_b != 0) {
              if (this.field_b != 254) {
                var10 = this.field_b;
                var11 = 256 - this.field_b;
                param3 = ((param3 & 16711935) * var11 >> 8 & 16711935) + ((param3 & 65280) * var11 >> 8 & 65280);
                L24: while (true) {
                  param4--;
                  if (param4 < 0) {
                    param4 = param6 - param5 & 3;
                    L25: while (true) {
                      param4--;
                      if (param4 >= 0) {
                        L26: {
                          param2++;
                          if (param7 >= param1[param2]) {
                            break L26;
                          } else {
                            var12 = param0[param2];
                            param0[param2] = param3 + ((var12 & 16711935) * var10 >> 8 & 16711935) + ((var12 & 65280) * var10 >> 8 & 65280);
                            param1[param2] = param7;
                            break L26;
                          }
                        }
                        param7 = param7 + param8;
                        continue L25;
                      } else {
                        return;
                      }
                    }
                  } else {
                    L27: {
                      param2++;
                      if (param7 >= param1[param2]) {
                        break L27;
                      } else {
                        var12 = param0[param2];
                        param0[param2] = param3 + ((var12 & 16711935) * var10 >> 8 & 16711935) + ((var12 & 65280) * var10 >> 8 & 65280);
                        param1[param2] = param7;
                        break L27;
                      }
                    }
                    L28: {
                      param7 = param7 + param8;
                      param2++;
                      if (param7 >= param1[param2]) {
                        break L28;
                      } else {
                        var12 = param0[param2];
                        param0[param2] = param3 + ((var12 & 16711935) * var10 >> 8 & 16711935) + ((var12 & 65280) * var10 >> 8 & 65280);
                        param1[param2] = param7;
                        break L28;
                      }
                    }
                    L29: {
                      param7 = param7 + param8;
                      param2++;
                      if (param7 >= param1[param2]) {
                        break L29;
                      } else {
                        var12 = param0[param2];
                        param0[param2] = param3 + ((var12 & 16711935) * var10 >> 8 & 16711935) + ((var12 & 65280) * var10 >> 8 & 65280);
                        param1[param2] = param7;
                        break L29;
                      }
                    }
                    L30: {
                      param7 = param7 + param8;
                      param2++;
                      if (param7 >= param1[param2]) {
                        break L30;
                      } else {
                        var12 = param0[param2];
                        param0[param2] = param3 + ((var12 & 16711935) * var10 >> 8 & 16711935) + ((var12 & 65280) * var10 >> 8 & 65280);
                        param1[param2] = param7;
                        break L30;
                      }
                    }
                    param7 = param7 + param8;
                    continue L24;
                  }
                }
              } else {
                if (param5 != 0) {
                  if (param6 <= this.field_h - 1) {
                    param4--;
                    L31: while (true) {
                      if (param4 < 0) {
                        param4 = param6 - param5 & 3;
                        L32: while (true) {
                          param4--;
                          if (param4 >= 0) {
                            L33: {
                              param2++;
                              if (param7 >= param1[param2]) {
                                break L33;
                              } else {
                                param0[param2 - 1] = param0[param2];
                                break L33;
                              }
                            }
                            param7 = param7 + param8;
                            continue L32;
                          } else {
                            return;
                          }
                        }
                      } else {
                        L34: {
                          param2++;
                          if (param7 >= param1[param2]) {
                            break L34;
                          } else {
                            param0[param2 - 1] = param0[param2];
                            break L34;
                          }
                        }
                        L35: {
                          param7 = param7 + param8;
                          param2++;
                          if (param7 >= param1[param2]) {
                            break L35;
                          } else {
                            param0[param2 - 1] = param0[param2];
                            break L35;
                          }
                        }
                        L36: {
                          param7 = param7 + param8;
                          param2++;
                          if (param7 >= param1[param2]) {
                            break L36;
                          } else {
                            param0[param2 - 1] = param0[param2];
                            break L36;
                          }
                        }
                        L37: {
                          param7 = param7 + param8;
                          param2++;
                          if (param7 >= param1[param2]) {
                            break L37;
                          } else {
                            param0[param2 - 1] = param0[param2];
                            break L37;
                          }
                        }
                        param7 = param7 + param8;
                        param4--;
                        continue L31;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              L38: while (true) {
                param4--;
                if (param4 < 0) {
                  param4 = param6 - param5 & 3;
                  L39: while (true) {
                    param4--;
                    if (param4 >= 0) {
                      L40: {
                        param2++;
                        if (param7 >= param1[param2]) {
                          break L40;
                        } else {
                          param0[param2] = param3;
                          param1[param2] = param7;
                          break L40;
                        }
                      }
                      param7 = param7 + param8;
                      continue L39;
                    } else {
                      return;
                    }
                  }
                } else {
                  L41: {
                    param2++;
                    if (param7 >= param1[param2]) {
                      break L41;
                    } else {
                      param0[param2] = param3;
                      param1[param2] = param7;
                      break L41;
                    }
                  }
                  L42: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                      break L42;
                    } else {
                      param0[param2] = param3;
                      param1[param2] = param7;
                      break L42;
                    }
                  }
                  L43: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                      break L43;
                    } else {
                      param0[param2] = param3;
                      param1[param2] = param7;
                      break L43;
                    }
                  }
                  L44: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                      break L44;
                    } else {
                      param0[param2] = param3;
                      param1[param2] = param7;
                      break L44;
                    }
                  }
                  param7 = param7 + param8;
                  continue L38;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    private final void b(int[] param0, float[] param1, int param2, int param3, int param4, int param5, int param6, float param7, float param8, float param9, float param10, float param11, float param12, float param13, float param14) {
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int incrementValue$24 = 0;
        int incrementValue$25 = 0;
        int incrementValue$26 = 0;
        int incrementValue$27 = 0;
        int incrementValue$28 = 0;
        int incrementValue$29 = 0;
        int incrementValue$30 = 0;
        int incrementValue$31 = 0;
        int incrementValue$32 = 0;
        int incrementValue$33 = 0;
        int incrementValue$34 = 0;
        int incrementValue$35 = 0;
        int incrementValue$36 = 0;
        int var16_int = 0;
        int[] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (!this.field_q) {
                        statePc = 5;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (param6 <= this.field_h) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    param6 = this.field_h;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (param5 >= 0) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    param5 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (param5 < param6) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    return;
                }
                case 7: {
                    if (!this.field_m) {
                        statePc = 39;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    param2 = param2 + param5;
                    param9 = param9 + param10 * (float)param5;
                    param11 = param11 + param12 * (float)param5;
                    param13 = param13 + param14 * (float)param5;
                    if (!this.field_j) {
                        statePc = 30;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    param4 = param6 - param5 >> 2;
                    param10 = param10 * 4.0f;
                    param12 = param12 * 4.0f;
                    param14 = param14 * 4.0f;
                    if (this.field_b != 0) {
                        statePc = 17;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (param4 <= 0) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                    param9 = param9 + param10;
                    param11 = param11 + param12;
                    param13 = param13 + param14;
                    incrementValue$19 = param2;
                    param2++;
                    param0[incrementValue$19] = param3;
                    incrementValue$20 = param2;
                    param2++;
                    param0[incrementValue$20] = param3;
                    incrementValue$21 = param2;
                    param2++;
                    param0[incrementValue$21] = param3;
                    incrementValue$22 = param2;
                    param2++;
                    param0[incrementValue$22] = param3;
                    param4--;
                    if (param4 > 0) {
                        statePc = 11;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    param4 = param6 - param5 & 3;
                    if (param4 > 0) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    return;
                }
                case 14: {
                    param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    incrementValue$23 = param2;
                    param2++;
                    param0[incrementValue$23] = param3;
                    param4--;
                    if (param4 > 0) {
                        statePc = 15;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (this.field_g) {
                        statePc = 24;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var16_int = this.field_b;
                    var17 = 256 - this.field_b;
                    if (param4 <= 0) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                    param9 = param9 + param10;
                    param11 = param11 + param12;
                    param13 = param13 + param14;
                    param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                    var18 = param0[param2];
                    incrementValue$24 = param2;
                    param2++;
                    param0[incrementValue$24] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                    var18 = param0[param2];
                    incrementValue$25 = param2;
                    param2++;
                    param0[incrementValue$25] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                    var18 = param0[param2];
                    incrementValue$26 = param2;
                    param2++;
                    param0[incrementValue$26] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                    var18 = param0[param2];
                    incrementValue$27 = param2;
                    param2++;
                    param0[incrementValue$27] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                    param4--;
                    if (param4 > 0) {
                        statePc = 19;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    param4 = param6 - param5 & 3;
                    if (param4 <= 0) {
                        statePc = 29;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                    param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    var18 = param0[param2];
                    incrementValue$28 = param2;
                    param2++;
                    param0[incrementValue$28] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                    param4--;
                    if (param4 > 0) {
                        statePc = 22;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (param4 <= 0) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    param3 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
                    param9 = param9 + param10;
                    param11 = param11 + param12;
                    param13 = param13 + param14;
                    var22 = param0;
                    var16 = var22;
                    incrementValue$29 = param2;
                    param2++;
                    var17 = incrementValue$29;
                    var18 = param3;
                    var19 = var22[var17];
                    var20 = var18 + var19;
                    var21 = (var18 & 16711935) + (var19 & 16711935);
                    var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                    var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                    var23 = param0;
                    var16 = var23;
                    incrementValue$30 = param2;
                    param2++;
                    var17 = incrementValue$30;
                    var18 = param3;
                    var19 = var23[var17];
                    var20 = var18 + var19;
                    var21 = (var18 & 16711935) + (var19 & 16711935);
                    var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                    var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                    var24 = param0;
                    var16 = var24;
                    incrementValue$31 = param2;
                    param2++;
                    var17 = incrementValue$31;
                    var18 = param3;
                    var19 = var24[var17];
                    var20 = var18 + var19;
                    var21 = (var18 & 16711935) + (var19 & 16711935);
                    var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                    var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                    var25 = param0;
                    var16 = var25;
                    incrementValue$32 = param2;
                    param2++;
                    var17 = incrementValue$32;
                    var18 = param3;
                    var19 = var25[var17];
                    var20 = var18 + var19;
                    var21 = (var18 & 16711935) + (var19 & 16711935);
                    var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                    var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                    param4--;
                    if (param4 > 0) {
                        statePc = 25;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    param4 = param6 - param5 & 3;
                    if (param4 <= 0) {
                        statePc = 29;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    param3 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    var26 = param0;
                    var16 = var26;
                    incrementValue$33 = param2;
                    param2++;
                    var17 = incrementValue$33;
                    var18 = param3;
                    var19 = var26[var17];
                    var20 = var18 + var19;
                    var21 = (var18 & 16711935) + (var19 & 16711935);
                    var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                    var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                    param4--;
                    if (param4 > 0) {
                        statePc = 28;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    return;
                }
                case 30: {
                    param4 = param6 - param5;
                    if (this.field_b != 0) {
                        statePc = 33;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    incrementValue$34 = param2;
                    param2++;
                    param0[incrementValue$34] = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                    param9 = param9 + param10;
                    param11 = param11 + param12;
                    param13 = param13 + param14;
                    param4--;
                    if (param4 > 0) {
                        statePc = 31;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (this.field_g) {
                        statePc = 37;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var16_int = this.field_b;
                    var17 = 256 - this.field_b;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                    param9 = param9 + param10;
                    param11 = param11 + param12;
                    param13 = param13 + param14;
                    param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                    var18 = param0[param2];
                    incrementValue$35 = param2;
                    param2++;
                    param0[incrementValue$35] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                    param4--;
                    if (param4 > 0) {
                        statePc = 35;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var27 = param0;
                    var16 = var27;
                    incrementValue$36 = param2;
                    param2++;
                    var17 = incrementValue$36;
                    var18 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
                    var19 = var27[var17];
                    var20 = var18 + var19;
                    var21 = (var18 & 16711935) + (var19 & 16711935);
                    var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                    var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                    param9 = param9 + param10;
                    param11 = param11 + param12;
                    param13 = param13 + param14;
                    param4--;
                    if (param4 > 0) {
                        statePc = 37;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    return;
                }
                case 39: {
                    param2 = param2 + (param5 - 1);
                    param7 = param7 + param8 * (float)param5;
                    param9 = param9 + param10 * (float)param5;
                    param11 = param11 + param12 * (float)param5;
                    param13 = param13 + param14 * (float)param5;
                    if (!this.field_o.field_n) {
                        statePc = 107;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (!this.field_j) {
                        statePc = 92;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    param4 = param6 - param5 >> 2;
                    param10 = param10 * 4.0f;
                    param12 = param12 * 4.0f;
                    param14 = param14 * 4.0f;
                    if (this.field_b != 0) {
                        statePc = 59;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (param4 <= 0) {
                        statePc = 52;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                    param9 = param9 + param10;
                    param11 = param11 + param12;
                    param13 = param13 + param14;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 45;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    param0[param2] = param3;
                    param1[param2] = param7;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 47;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    param0[param2] = param3;
                    param1[param2] = param7;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 49;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    param0[param2] = param3;
                    param1[param2] = param7;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 51;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    param0[param2] = param3;
                    param1[param2] = param7;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    param7 = param7 + param8;
                    param4--;
                    if (param4 > 0) {
                        statePc = 43;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    param4 = param6 - param5 & 3;
                    if (param4 > 0) {
                        statePc = 54;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    return;
                }
                case 54: {
                    param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 57;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    param0[param2] = param3;
                    param1[param2] = param7;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    param7 = param7 + param8;
                    param4--;
                    if (param4 > 0) {
                        statePc = 55;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 59: {
                    if (this.field_g) {
                        statePc = 76;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    var16_int = this.field_b;
                    var17 = 256 - this.field_b;
                    if (param4 <= 0) {
                        statePc = 70;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                    param9 = param9 + param10;
                    param11 = param11 + param12;
                    param13 = param13 + param14;
                    param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 63;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    var18 = param0[param2];
                    param0[param2] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                    param1[param2] = param7;
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 65;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    var18 = param0[param2];
                    param0[param2] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                    param1[param2] = param7;
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 67;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    var18 = param0[param2];
                    param0[param2] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                    param1[param2] = param7;
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 69;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    var18 = param0[param2];
                    param0[param2] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                    param1[param2] = param7;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    param7 = param7 + param8;
                    param4--;
                    if (param4 > 0) {
                        statePc = 61;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    param4 = param6 - param5 & 3;
                    if (param4 <= 0) {
                        statePc = 91;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                    param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 74;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    var18 = param0[param2];
                    param0[param2] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                    param1[param2] = param7;
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    param7 = param7 + param8;
                    param4--;
                    if (param4 > 0) {
                        statePc = 72;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if (param4 <= 0) {
                        statePc = 86;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    param3 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
                    param9 = param9 + param10;
                    param11 = param11 + param12;
                    param13 = param13 + param14;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 79;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    var28 = param0;
                    var16 = var28;
                    var17 = param2;
                    var18 = param3;
                    var19 = var28[var17];
                    var20 = var18 + var19;
                    var21 = (var18 & 16711935) + (var19 & 16711935);
                    var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                    var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                    param1[param2] = param7;
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 81;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    var29 = param0;
                    var16 = var29;
                    var17 = param2;
                    var18 = param3;
                    var19 = var29[var17];
                    var20 = var18 + var19;
                    var21 = (var18 & 16711935) + (var19 & 16711935);
                    var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                    var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                    param1[param2] = param7;
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 83;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    var30 = param0;
                    var16 = var30;
                    var17 = param2;
                    var18 = param3;
                    var19 = var30[var17];
                    var20 = var18 + var19;
                    var21 = (var18 & 16711935) + (var19 & 16711935);
                    var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                    var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                    param1[param2] = param7;
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 85;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    var31 = param0;
                    var16 = var31;
                    var17 = param2;
                    var18 = param3;
                    var19 = var31[var17];
                    var20 = var18 + var19;
                    var21 = (var18 & 16711935) + (var19 & 16711935);
                    var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                    var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                    param1[param2] = param7;
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    param7 = param7 + param8;
                    param4--;
                    if (param4 > 0) {
                        statePc = 77;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    param4 = param6 - param5 & 3;
                    if (param4 <= 0) {
                        statePc = 91;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    param3 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 90;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    var32 = param0;
                    var16 = var32;
                    var17 = param2;
                    var18 = param3;
                    var19 = var32[var17];
                    var20 = var18 + var19;
                    var21 = (var18 & 16711935) + (var19 & 16711935);
                    var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                    var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                    param1[param2] = param7;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    param7 = param7 + param8;
                    param4--;
                    if (param4 > 0) {
                        statePc = 88;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    return;
                }
                case 92: {
                    param4 = param6 - param5;
                    if (this.field_b != 0) {
                        statePc = 97;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 95;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    param0[param2] = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                    param1[param2] = param7;
                    statePc = 95;
                    continue stateLoop;
                }
                case 95: {
                    param7 = param7 + param8;
                    param9 = param9 + param10;
                    param11 = param11 + param12;
                    param13 = param13 + param14;
                    param4--;
                    if (param4 > 0) {
                        statePc = 93;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 97: {
                    if (this.field_g) {
                        statePc = 103;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    var16_int = this.field_b;
                    var17 = 256 - this.field_b;
                    statePc = 99;
                    continue stateLoop;
                }
                case 99: {
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 101;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                    param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                    var18 = param0[param2];
                    param0[param2] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                    param1[param2] = param7;
                    statePc = 101;
                    continue stateLoop;
                }
                case 101: {
                    param7 = param7 + param8;
                    param9 = param9 + param10;
                    param11 = param11 + param12;
                    param13 = param13 + param14;
                    param4--;
                    if (param4 > 0) {
                        statePc = 99;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 103: {
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 105;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    var33 = param0;
                    var16 = var33;
                    var17 = param2;
                    var18 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
                    var19 = var33[var17];
                    var20 = var18 + var19;
                    var21 = (var18 & 16711935) + (var19 & 16711935);
                    var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                    var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                    param1[param2] = param7;
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    param7 = param7 + param8;
                    param9 = param9 + param10;
                    param11 = param11 + param12;
                    param13 = param13 + param14;
                    param4--;
                    if (param4 > 0) {
                        statePc = 103;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    return;
                }
                case 107: {
                    if (!this.field_j) {
                        statePc = 159;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    param4 = param6 - param5 >> 2;
                    param10 = param10 * 4.0f;
                    param12 = param12 * 4.0f;
                    param14 = param14 * 4.0f;
                    if (this.field_b != 0) {
                        statePc = 126;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    if (param4 <= 0) {
                        statePc = 119;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                    param9 = param9 + param10;
                    param11 = param11 + param12;
                    param13 = param13 + param14;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 112;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    param0[param2] = param3;
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 114;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    param0[param2] = param3;
                    statePc = 114;
                    continue stateLoop;
                }
                case 114: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 116;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    param0[param2] = param3;
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 118;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    param0[param2] = param3;
                    statePc = 118;
                    continue stateLoop;
                }
                case 118: {
                    param7 = param7 + param8;
                    param4--;
                    if (param4 > 0) {
                        statePc = 110;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    param4 = param6 - param5 & 3;
                    if (param4 > 0) {
                        statePc = 121;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    return;
                }
                case 121: {
                    param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                    statePc = 122;
                    continue stateLoop;
                }
                case 122: {
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 124;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    param0[param2] = param3;
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    param7 = param7 + param8;
                    param4--;
                    if (param4 > 0) {
                        statePc = 122;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 126: {
                    if (this.field_g) {
                        statePc = 143;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    var16_int = this.field_b;
                    var17 = 256 - this.field_b;
                    if (param4 <= 0) {
                        statePc = 137;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                    param9 = param9 + param10;
                    param11 = param11 + param12;
                    param13 = param13 + param14;
                    param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 130;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    var18 = param0[param2];
                    param0[param2] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                    statePc = 130;
                    continue stateLoop;
                }
                case 130: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 132;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    var18 = param0[param2];
                    param0[param2] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 134;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    var18 = param0[param2];
                    param0[param2] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                    statePc = 134;
                    continue stateLoop;
                }
                case 134: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 136;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    var18 = param0[param2];
                    param0[param2] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                    statePc = 136;
                    continue stateLoop;
                }
                case 136: {
                    param7 = param7 + param8;
                    param4--;
                    if (param4 > 0) {
                        statePc = 128;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    param4 = param6 - param5 & 3;
                    if (param4 <= 0) {
                        statePc = 158;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                    param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                    statePc = 139;
                    continue stateLoop;
                }
                case 139: {
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 141;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    var18 = param0[param2];
                    param0[param2] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                    statePc = 141;
                    continue stateLoop;
                }
                case 141: {
                    param7 = param7 + param8;
                    param4--;
                    if (param4 > 0) {
                        statePc = 139;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 143: {
                    if (param4 <= 0) {
                        statePc = 153;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    param3 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
                    param9 = param9 + param10;
                    param11 = param11 + param12;
                    param13 = param13 + param14;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 146;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    var34 = param0;
                    var16 = var34;
                    var17 = param2;
                    var18 = param3;
                    var19 = var34[var17];
                    var20 = var18 + var19;
                    var21 = (var18 & 16711935) + (var19 & 16711935);
                    var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                    var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                    statePc = 146;
                    continue stateLoop;
                }
                case 146: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 148;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    var35 = param0;
                    var16 = var35;
                    var17 = param2;
                    var18 = param3;
                    var19 = var35[var17];
                    var20 = var18 + var19;
                    var21 = (var18 & 16711935) + (var19 & 16711935);
                    var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                    var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                    statePc = 148;
                    continue stateLoop;
                }
                case 148: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 150;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    var36 = param0;
                    var16 = var36;
                    var17 = param2;
                    var18 = param3;
                    var19 = var36[var17];
                    var20 = var18 + var19;
                    var21 = (var18 & 16711935) + (var19 & 16711935);
                    var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                    var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                    statePc = 150;
                    continue stateLoop;
                }
                case 150: {
                    param7 = param7 + param8;
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 152;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    var37 = param0;
                    var16 = var37;
                    var17 = param2;
                    var18 = param3;
                    var19 = var37[var17];
                    var20 = var18 + var19;
                    var21 = (var18 & 16711935) + (var19 & 16711935);
                    var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                    var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                    statePc = 152;
                    continue stateLoop;
                }
                case 152: {
                    param7 = param7 + param8;
                    param4--;
                    if (param4 > 0) {
                        statePc = 144;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    param4 = param6 - param5 & 3;
                    if (param4 <= 0) {
                        statePc = 158;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    param3 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
                    statePc = 155;
                    continue stateLoop;
                }
                case 155: {
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 157;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    var38 = param0;
                    var16 = var38;
                    var17 = param2;
                    var18 = param3;
                    var19 = var38[var17];
                    var20 = var18 + var19;
                    var21 = (var18 & 16711935) + (var19 & 16711935);
                    var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                    var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                    statePc = 157;
                    continue stateLoop;
                }
                case 157: {
                    param7 = param7 + param8;
                    param4--;
                    if (param4 > 0) {
                        statePc = 155;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    return;
                }
                case 159: {
                    param4 = param6 - param5;
                    if (this.field_b != 0) {
                        statePc = 164;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 162;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    param0[param2] = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                    statePc = 162;
                    continue stateLoop;
                }
                case 162: {
                    param7 = param7 + param8;
                    param9 = param9 + param10;
                    param11 = param11 + param12;
                    param13 = param13 + param14;
                    param4--;
                    if (param4 > 0) {
                        statePc = 160;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 164: {
                    if (this.field_g) {
                        statePc = 170;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    var16_int = this.field_b;
                    var17 = 256 - this.field_b;
                    statePc = 166;
                    continue stateLoop;
                }
                case 166: {
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 168;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                    param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                    var18 = param0[param2];
                    param0[param2] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                    statePc = 168;
                    continue stateLoop;
                }
                case 168: {
                    param7 = param7 + param8;
                    param9 = param9 + param10;
                    param11 = param11 + param12;
                    param13 = param13 + param14;
                    param4--;
                    if (param4 > 0) {
                        statePc = 166;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 170: {
                    param2++;
                    if (param7 >= param1[param2]) {
                        statePc = 172;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    var39 = param0;
                    var16 = var39;
                    var17 = param2;
                    var18 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
                    var19 = var39[var17];
                    var20 = var18 + var19;
                    var21 = (var18 & 16711935) + (var19 & 16711935);
                    var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                    var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                    statePc = 172;
                    continue stateLoop;
                }
                case 172: {
                    param7 = param7 + param8;
                    param9 = param9 + param10;
                    param11 = param11 + param12;
                    param13 = param13 + param14;
                    param4--;
                    if (param4 > 0) {
                        statePc = 170;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    iua(sfa param0, tw param1) {
        this.field_j = true;
        this.field_m = false;
        this.field_p = new int[4096];
        this.field_c = -1;
        this.field_s = false;
        this.field_w = null;
        this.field_r = 0;
        this.field_g = false;
        this.field_q = false;
        this.field_b = 0;
        this.field_i = 0;
        this.field_f = 0;
        this.field_d = true;
        this.field_k = param0;
        this.field_o = param1;
        this.field_t = this.field_k.field_K;
        this.field_a = this.field_k.field_r;
        this.field_u = this.field_k.field_n;
    }
}
