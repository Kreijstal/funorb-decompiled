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
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        float var20 = 0.0f;
        float var21 = 0.0f;
        float var22 = 0.0f;
        float var23 = 0.0f;
        float var24 = 0.0f;
        float var25 = 0.0f;
        float var26 = 0.0f;
        float var27 = 0.0f;
        float var28 = 0.0f;
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
        int incrementValue$1 = 0;
        int var22 = 0;
        float var23 = 0.0f;
        float var24 = 0.0f;
        float var25 = 0.0f;
        float var26 = 0.0f;
        float var27 = 0.0f;
        float var28 = 0.0f;
        float var29 = 0.0f;
        float var30 = 0.0f;
        float var31 = 0.0f;
        float var32 = 0.0f;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int stackIn_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
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
            incrementValue$1 = var22;
            var22--;
            if (incrementValue$1 <= 0) {
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
                            stackOut_27_0 = 255;
                            stackIn_28_0 = stackOut_27_0;
                            break L7;
                          } else {
                            stackOut_26_0 = 0;
                            stackIn_28_0 = stackOut_26_0;
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
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
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
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        float var20 = 0.0f;
        float var21 = 0.0f;
        float var22 = 0.0f;
        float var23 = 0.0f;
        float var24 = 0.0f;
        float var25 = 0.0f;
        float var26 = 0.0f;
        float var27 = 0.0f;
        float var28 = 0.0f;
        float var29 = 0.0f;
        float var30 = 0.0f;
        float var31 = 0.0f;
        float var32 = 0.0f;
        float var33 = 0.0f;
        float var34 = 0.0f;
        float var35 = 0.0f;
        float var36 = 0.0f;
        float var37 = 0.0f;
        float var38 = 0.0f;
        float var39 = 0.0f;
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
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
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
            param2 = param2 + (param5 - 1);
            param7 = param7 + param8 * (float)param5;
            param9 = param9 + param10 * (float)param5;
            if (!this.field_o.field_n) {
              if (!this.field_j) {
                param4 = param6 - param5;
                if (this.field_b != 0) {
                  var12 = this.field_b;
                  var13 = 256 - this.field_b;
                  L3: while (true) {
                    L4: {
                      param2++;
                      if (param9 >= param1[param2]) {
                        break L4;
                      } else {
                        param3 = bt.field_h[(int)param7];
                        param3 = ((param3 & 16711935) * var13 >> 8 & 16711935) + ((param3 & 65280) * var13 >> 8 & 65280);
                        var14 = param0[param2];
                        param0[param2] = (var13 | var14 >> 24) << 24 | param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                        break L4;
                      }
                    }
                    param7 = param7 + param8;
                    param9 = param9 + param10;
                    param4--;
                    if (param4 > 0) {
                      continue L3;
                    } else {
                      break L2;
                    }
                  }
                } else {
                  L5: while (true) {
                    L6: {
                      param2++;
                      if (param9 >= param1[param2]) {
                        break L6;
                      } else {
                        param0[param2] = bt.field_h[(int)param7];
                        break L6;
                      }
                    }
                    param9 = param9 + param10;
                    param7 = param7 + param8;
                    param4--;
                    if (param4 > 0) {
                      continue L5;
                    } else {
                      break L2;
                    }
                  }
                }
              } else {
                param4 = param6 - param5 >> 2;
                param8 = param8 * 4.0f;
                if (this.field_b != 0) {
                  L7: {
                    var12 = this.field_b;
                    var13 = 256 - this.field_b;
                    if (param4 <= 0) {
                      break L7;
                    } else {
                      L8: while (true) {
                        L9: {
                          param3 = bt.field_h[(int)param7];
                          param7 = param7 + param8;
                          param3 = ((param3 & 16711935) * var13 >> 8 & 16711935) + ((param3 & 65280) * var13 >> 8 & 65280);
                          param2++;
                          if (param9 >= param1[param2]) {
                            break L9;
                          } else {
                            var14 = param0[param2];
                            param0[param2] = (var13 | var14 >> 24) << 24 | param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                            break L9;
                          }
                        }
                        L10: {
                          param9 = param9 + param10;
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
                        param9 = param9 + param10;
                        param4--;
                        if (param4 > 0) {
                          continue L8;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  param4 = param6 - param5 & 3;
                  if (param4 <= 0) {
                    break L2;
                  } else {
                    param3 = bt.field_h[(int)param7];
                    param3 = ((param3 & 16711935) * var13 >> 8 & 16711935) + ((param3 & 65280) * var13 >> 8 & 65280);
                    L13: while (true) {
                      L14: {
                        param2++;
                        if (param9 >= param1[param2]) {
                          break L14;
                        } else {
                          var14 = param0[param2];
                          param0[param2] = (var13 | var14 >> 24) << 24 | param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                          break L14;
                        }
                      }
                      param9 = param9 + param10;
                      param4--;
                      if (param4 > 0) {
                        continue L13;
                      } else {
                        break L2;
                      }
                    }
                  }
                } else {
                  L15: {
                    if (param4 <= 0) {
                      break L15;
                    } else {
                      L16: while (true) {
                        L17: {
                          param3 = bt.field_h[(int)param7];
                          param7 = param7 + param8;
                          param2++;
                          if (param9 >= param1[param2]) {
                            break L17;
                          } else {
                            param0[param2] = param3;
                            break L17;
                          }
                        }
                        L18: {
                          param9 = param9 + param10;
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
                        param9 = param9 + param10;
                        param4--;
                        if (param4 > 0) {
                          continue L16;
                        } else {
                          break L15;
                        }
                      }
                    }
                  }
                  param4 = param6 - param5 & 3;
                  if (param4 <= 0) {
                    break L2;
                  } else {
                    param3 = bt.field_h[(int)param7];
                    L21: while (true) {
                      L22: {
                        param2++;
                        if (param9 >= param1[param2]) {
                          break L22;
                        } else {
                          param0[param2] = param3;
                          break L22;
                        }
                      }
                      param9 = param9 + param10;
                      param4--;
                      if (param4 > 0) {
                        continue L21;
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
                  L23: while (true) {
                    L24: {
                      param2++;
                      if (param9 >= param1[param2]) {
                        break L24;
                      } else {
                        param3 = bt.field_h[(int)param7];
                        param3 = ((param3 & 16711935) * var13 >> 8 & 16711935) + ((param3 & 65280) * var13 >> 8 & 65280);
                        var14 = param0[param2];
                        param0[param2] = (var13 | var14 >> 24) << 24 | param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                        param1[param2] = param9;
                        break L24;
                      }
                    }
                    param7 = param7 + param8;
                    param9 = param9 + param10;
                    param4--;
                    if (param4 > 0) {
                      continue L23;
                    } else {
                      break L2;
                    }
                  }
                } else {
                  L25: while (true) {
                    L26: {
                      param2++;
                      if (param9 >= param1[param2]) {
                        break L26;
                      } else {
                        param0[param2] = bt.field_h[(int)param7];
                        param1[param2] = param9;
                        break L26;
                      }
                    }
                    param9 = param9 + param10;
                    param7 = param7 + param8;
                    param4--;
                    if (param4 > 0) {
                      continue L25;
                    } else {
                      break L2;
                    }
                  }
                }
              } else {
                param4 = param6 - param5 >> 2;
                param8 = param8 * 4.0f;
                if (this.field_b != 0) {
                  L27: {
                    var12 = this.field_b;
                    var13 = 256 - this.field_b;
                    if (param4 <= 0) {
                      break L27;
                    } else {
                      L28: while (true) {
                        L29: {
                          param3 = bt.field_h[(int)param7];
                          param7 = param7 + param8;
                          param3 = ((param3 & 16711935) * var13 >> 8 & 16711935) + ((param3 & 65280) * var13 >> 8 & 65280);
                          param2++;
                          if (param9 >= param1[param2]) {
                            break L29;
                          } else {
                            var14 = param0[param2];
                            param0[param2] = (var13 | var14 >> 24) << 24 | param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                            param1[param2] = param9;
                            break L29;
                          }
                        }
                        L30: {
                          param9 = param9 + param10;
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
                        param9 = param9 + param10;
                        param4--;
                        if (param4 > 0) {
                          continue L28;
                        } else {
                          break L27;
                        }
                      }
                    }
                  }
                  param4 = param6 - param5 & 3;
                  if (param4 <= 0) {
                    break L2;
                  } else {
                    param3 = bt.field_h[(int)param7];
                    param3 = ((param3 & 16711935) * var13 >> 8 & 16711935) + ((param3 & 65280) * var13 >> 8 & 65280);
                    L33: while (true) {
                      L34: {
                        param2++;
                        if (param9 >= param1[param2]) {
                          break L34;
                        } else {
                          var14 = param0[param2];
                          param0[param2] = (var13 | var14 >> 24) << 24 | param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                          param1[param2] = param9;
                          break L34;
                        }
                      }
                      param9 = param9 + param10;
                      param4--;
                      if (param4 > 0) {
                        continue L33;
                      } else {
                        break L2;
                      }
                    }
                  }
                } else {
                  L35: {
                    if (param4 <= 0) {
                      break L35;
                    } else {
                      L36: while (true) {
                        L37: {
                          param3 = bt.field_h[(int)param7];
                          param7 = param7 + param8;
                          param2++;
                          if (param9 >= param1[param2]) {
                            break L37;
                          } else {
                            param0[param2] = param3;
                            param1[param2] = param9;
                            break L37;
                          }
                        }
                        L38: {
                          param9 = param9 + param10;
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
                        param9 = param9 + param10;
                        param4--;
                        if (param4 > 0) {
                          continue L36;
                        } else {
                          break L35;
                        }
                      }
                    }
                  }
                  param4 = param6 - param5 & 3;
                  if (param4 > 0) {
                    param3 = bt.field_h[(int)param7];
                    L41: while (true) {
                      L42: {
                        param2++;
                        if (param9 >= param1[param2]) {
                          break L42;
                        } else {
                          param0[param2] = param3;
                          param1[param2] = param9;
                          break L42;
                        }
                      }
                      param9 = param9 + param10;
                      param4--;
                      if (param4 > 0) {
                        continue L41;
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
          return;
        } else {
          return;
        }
    }

    final void a(float param0, float param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8, int param9) {
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
        float var21 = 0.0f;
        float var22 = 0.0f;
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
        float var24 = 0.0f;
        float var25 = 0.0f;
        float var26 = 0.0f;
        float var27 = 0.0f;
        float var28 = 0.0f;
        float var29 = 0.0f;
        float var30 = 0.0f;
        float var31 = 0.0f;
        float var32 = 0.0f;
        float var33 = 0.0f;
        float var34 = 0.0f;
        float var35 = 0.0f;
        float var36 = 0.0f;
        float var37 = 0.0f;
        float var38 = 0.0f;
        float var39 = 0.0f;
        float var40 = 0.0f;
        float var41 = 0.0f;
        float var42 = 0.0f;
        float var43 = 0.0f;
        float var44 = 0.0f;
        float var45 = 0.0f;
        float var46 = 0.0f;
        float var47 = 0.0f;
        float var48 = 0.0f;
        float var49 = 0.0f;
        float var50 = 0.0f;
        float var51 = 0.0f;
        float var52 = 0.0f;
        float var53 = 0.0f;
        float var54 = 0.0f;
        float var55 = 0.0f;
        float var56 = 0.0f;
        float var57 = 0.0f;
        float var58 = 0.0f;
        float var59 = 0.0f;
        float var60 = 0.0f;
        float var61 = 0.0f;
        float var62 = 0.0f;
        float var63 = 0.0f;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        L0: {
          if (param22 == this.field_c) {
            break L0;
          } else {
            this.field_w = this.field_k.h(param22);
            if (this.field_w != null) {
              L1: {
                stackOut_3_0 = this;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (!this.field_k.j(param22)) {
                  stackOut_5_0 = this;
                  stackOut_5_1 = this.field_k.field_I;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L1;
                } else {
                  stackOut_4_0 = this;
                  stackOut_4_1 = 64;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
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
        int incrementValue$18 = 0;
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
          if (!this.field_m) {
            param2 = param2 + (param5 - 1);
            param7 = param7 + param8 * (float)param5;
            param9 = param9 + param10 * (float)param5;
            param11 = param11 + param12 * (float)param5;
            param13 = param13 + param14 * (float)param5;
            if (!this.field_o.field_n) {
              if (!this.field_j) {
                L2: {
                  param4 = param6 - param5;
                  if (this.field_b != 0) {
                    if (this.field_g) {
                      L3: while (true) {
                        L4: {
                          param2++;
                          if (param7 >= param1[param2]) {
                            break L4;
                          } else {
                            var39 = param0;
                            var16 = var39;
                            var17 = param2;
                            var18 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
                            var19 = var39[var17];
                            var20 = var18 + var19;
                            var21 = (var18 & 16711935) + (var19 & 16711935);
                            var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                            var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                            break L4;
                          }
                        }
                        param7 = param7 + param8;
                        param9 = param9 + param10;
                        param11 = param11 + param12;
                        param13 = param13 + param14;
                        param4--;
                        if (param4 > 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    } else {
                      var16_int = this.field_b;
                      var17 = 256 - this.field_b;
                      L5: while (true) {
                        L6: {
                          param2++;
                          if (param7 >= param1[param2]) {
                            break L6;
                          } else {
                            param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                            param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                            var18 = param0[param2];
                            param0[param2] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                            break L6;
                          }
                        }
                        param7 = param7 + param8;
                        param9 = param9 + param10;
                        param11 = param11 + param12;
                        param13 = param13 + param14;
                        param4--;
                        if (param4 > 0) {
                          continue L5;
                        } else {
                          break L2;
                        }
                      }
                    }
                  } else {
                    L7: while (true) {
                      L8: {
                        param2++;
                        if (param7 >= param1[param2]) {
                          break L8;
                        } else {
                          param0[param2] = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                          break L8;
                        }
                      }
                      param7 = param7 + param8;
                      param9 = param9 + param10;
                      param11 = param11 + param12;
                      param13 = param13 + param14;
                      param4--;
                      if (param4 > 0) {
                        continue L7;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                return;
              } else {
                L9: {
                  param4 = param6 - param5 >> 2;
                  param10 = param10 * 4.0f;
                  param12 = param12 * 4.0f;
                  param14 = param14 * 4.0f;
                  if (this.field_b != 0) {
                    if (this.field_g) {
                      L10: {
                        if (param4 <= 0) {
                          break L10;
                        } else {
                          L11: while (true) {
                            L12: {
                              param3 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
                              param9 = param9 + param10;
                              param11 = param11 + param12;
                              param13 = param13 + param14;
                              param2++;
                              if (param7 >= param1[param2]) {
                                break L12;
                              } else {
                                var34 = param0;
                                var16 = var34;
                                var17 = param2;
                                var18 = param3;
                                var19 = var34[var17];
                                var20 = var18 + var19;
                                var21 = (var18 & 16711935) + (var19 & 16711935);
                                var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                                break L12;
                              }
                            }
                            L13: {
                              param7 = param7 + param8;
                              param2++;
                              if (param7 >= param1[param2]) {
                                break L13;
                              } else {
                                var35 = param0;
                                var16 = var35;
                                var17 = param2;
                                var18 = param3;
                                var19 = var35[var17];
                                var20 = var18 + var19;
                                var21 = (var18 & 16711935) + (var19 & 16711935);
                                var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                                break L13;
                              }
                            }
                            L14: {
                              param7 = param7 + param8;
                              param2++;
                              if (param7 >= param1[param2]) {
                                break L14;
                              } else {
                                var36 = param0;
                                var16 = var36;
                                var17 = param2;
                                var18 = param3;
                                var19 = var36[var17];
                                var20 = var18 + var19;
                                var21 = (var18 & 16711935) + (var19 & 16711935);
                                var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                                break L14;
                              }
                            }
                            L15: {
                              param7 = param7 + param8;
                              param2++;
                              if (param7 >= param1[param2]) {
                                break L15;
                              } else {
                                var37 = param0;
                                var16 = var37;
                                var17 = param2;
                                var18 = param3;
                                var19 = var37[var17];
                                var20 = var18 + var19;
                                var21 = (var18 & 16711935) + (var19 & 16711935);
                                var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                                break L15;
                              }
                            }
                            param7 = param7 + param8;
                            param4--;
                            if (param4 > 0) {
                              continue L11;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                      param4 = param6 - param5 & 3;
                      if (param4 <= 0) {
                        break L9;
                      } else {
                        param3 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
                        L16: while (true) {
                          L17: {
                            param2++;
                            if (param7 >= param1[param2]) {
                              break L17;
                            } else {
                              var38 = param0;
                              var16 = var38;
                              var17 = param2;
                              var18 = param3;
                              var19 = var38[var17];
                              var20 = var18 + var19;
                              var21 = (var18 & 16711935) + (var19 & 16711935);
                              var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                              var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                              break L17;
                            }
                          }
                          param7 = param7 + param8;
                          param4--;
                          if (param4 > 0) {
                            continue L16;
                          } else {
                            break L9;
                          }
                        }
                      }
                    } else {
                      L18: {
                        var16_int = this.field_b;
                        var17 = 256 - this.field_b;
                        if (param4 <= 0) {
                          break L18;
                        } else {
                          L19: while (true) {
                            L20: {
                              param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                              param9 = param9 + param10;
                              param11 = param11 + param12;
                              param13 = param13 + param14;
                              param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                              param2++;
                              if (param7 >= param1[param2]) {
                                break L20;
                              } else {
                                var18 = param0[param2];
                                param0[param2] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                                break L20;
                              }
                            }
                            L21: {
                              param7 = param7 + param8;
                              param2++;
                              if (param7 >= param1[param2]) {
                                break L21;
                              } else {
                                var18 = param0[param2];
                                param0[param2] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                                break L21;
                              }
                            }
                            L22: {
                              param7 = param7 + param8;
                              param2++;
                              if (param7 >= param1[param2]) {
                                break L22;
                              } else {
                                var18 = param0[param2];
                                param0[param2] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                                break L22;
                              }
                            }
                            L23: {
                              param7 = param7 + param8;
                              param2++;
                              if (param7 >= param1[param2]) {
                                break L23;
                              } else {
                                var18 = param0[param2];
                                param0[param2] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                                break L23;
                              }
                            }
                            param7 = param7 + param8;
                            param4--;
                            if (param4 > 0) {
                              continue L19;
                            } else {
                              break L18;
                            }
                          }
                        }
                      }
                      param4 = param6 - param5 & 3;
                      if (param4 <= 0) {
                        break L9;
                      } else {
                        param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                        param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                        L24: while (true) {
                          L25: {
                            param2++;
                            if (param7 >= param1[param2]) {
                              break L25;
                            } else {
                              var18 = param0[param2];
                              param0[param2] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                              break L25;
                            }
                          }
                          param7 = param7 + param8;
                          param4--;
                          if (param4 > 0) {
                            continue L24;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                  } else {
                    L26: {
                      if (param4 <= 0) {
                        break L26;
                      } else {
                        L27: while (true) {
                          L28: {
                            param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                            param9 = param9 + param10;
                            param11 = param11 + param12;
                            param13 = param13 + param14;
                            param2++;
                            if (param7 >= param1[param2]) {
                              break L28;
                            } else {
                              param0[param2] = param3;
                              break L28;
                            }
                          }
                          L29: {
                            param7 = param7 + param8;
                            param2++;
                            if (param7 >= param1[param2]) {
                              break L29;
                            } else {
                              param0[param2] = param3;
                              break L29;
                            }
                          }
                          L30: {
                            param7 = param7 + param8;
                            param2++;
                            if (param7 >= param1[param2]) {
                              break L30;
                            } else {
                              param0[param2] = param3;
                              break L30;
                            }
                          }
                          L31: {
                            param7 = param7 + param8;
                            param2++;
                            if (param7 >= param1[param2]) {
                              break L31;
                            } else {
                              param0[param2] = param3;
                              break L31;
                            }
                          }
                          param7 = param7 + param8;
                          param4--;
                          if (param4 > 0) {
                            continue L27;
                          } else {
                            break L26;
                          }
                        }
                      }
                    }
                    param4 = param6 - param5 & 3;
                    if (param4 > 0) {
                      param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                      L32: while (true) {
                        L33: {
                          param2++;
                          if (param7 >= param1[param2]) {
                            break L33;
                          } else {
                            param0[param2] = param3;
                            break L33;
                          }
                        }
                        param7 = param7 + param8;
                        param4--;
                        if (param4 > 0) {
                          continue L32;
                        } else {
                          break L9;
                        }
                      }
                    } else {
                      return;
                    }
                  }
                }
                return;
              }
            } else {
              if (!this.field_j) {
                L34: {
                  param4 = param6 - param5;
                  if (this.field_b != 0) {
                    if (this.field_g) {
                      L35: while (true) {
                        L36: {
                          param2++;
                          if (param7 >= param1[param2]) {
                            break L36;
                          } else {
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
                            break L36;
                          }
                        }
                        param7 = param7 + param8;
                        param9 = param9 + param10;
                        param11 = param11 + param12;
                        param13 = param13 + param14;
                        param4--;
                        if (param4 > 0) {
                          continue L35;
                        } else {
                          break L34;
                        }
                      }
                    } else {
                      var16_int = this.field_b;
                      var17 = 256 - this.field_b;
                      L37: while (true) {
                        L38: {
                          param2++;
                          if (param7 >= param1[param2]) {
                            break L38;
                          } else {
                            param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                            param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                            var18 = param0[param2];
                            param0[param2] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                            param1[param2] = param7;
                            break L38;
                          }
                        }
                        param7 = param7 + param8;
                        param9 = param9 + param10;
                        param11 = param11 + param12;
                        param13 = param13 + param14;
                        param4--;
                        if (param4 > 0) {
                          continue L37;
                        } else {
                          break L34;
                        }
                      }
                    }
                  } else {
                    L39: while (true) {
                      L40: {
                        param2++;
                        if (param7 >= param1[param2]) {
                          break L40;
                        } else {
                          param0[param2] = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                          param1[param2] = param7;
                          break L40;
                        }
                      }
                      param7 = param7 + param8;
                      param9 = param9 + param10;
                      param11 = param11 + param12;
                      param13 = param13 + param14;
                      param4--;
                      if (param4 > 0) {
                        continue L39;
                      } else {
                        break L34;
                      }
                    }
                  }
                }
                return;
              } else {
                L41: {
                  param4 = param6 - param5 >> 2;
                  param10 = param10 * 4.0f;
                  param12 = param12 * 4.0f;
                  param14 = param14 * 4.0f;
                  if (this.field_b != 0) {
                    if (this.field_g) {
                      L42: {
                        if (param4 <= 0) {
                          break L42;
                        } else {
                          L43: while (true) {
                            L44: {
                              param3 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
                              param9 = param9 + param10;
                              param11 = param11 + param12;
                              param13 = param13 + param14;
                              param2++;
                              if (param7 >= param1[param2]) {
                                break L44;
                              } else {
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
                                break L44;
                              }
                            }
                            L45: {
                              param7 = param7 + param8;
                              param2++;
                              if (param7 >= param1[param2]) {
                                break L45;
                              } else {
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
                                break L45;
                              }
                            }
                            L46: {
                              param7 = param7 + param8;
                              param2++;
                              if (param7 >= param1[param2]) {
                                break L46;
                              } else {
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
                                break L46;
                              }
                            }
                            L47: {
                              param7 = param7 + param8;
                              param2++;
                              if (param7 >= param1[param2]) {
                                break L47;
                              } else {
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
                                break L47;
                              }
                            }
                            param7 = param7 + param8;
                            param4--;
                            if (param4 > 0) {
                              continue L43;
                            } else {
                              break L42;
                            }
                          }
                        }
                      }
                      param4 = param6 - param5 & 3;
                      if (param4 <= 0) {
                        break L41;
                      } else {
                        param3 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
                        L48: while (true) {
                          L49: {
                            param2++;
                            if (param7 >= param1[param2]) {
                              break L49;
                            } else {
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
                              break L49;
                            }
                          }
                          param7 = param7 + param8;
                          param4--;
                          if (param4 > 0) {
                            continue L48;
                          } else {
                            break L41;
                          }
                        }
                      }
                    } else {
                      L50: {
                        var16_int = this.field_b;
                        var17 = 256 - this.field_b;
                        if (param4 <= 0) {
                          break L50;
                        } else {
                          L51: while (true) {
                            L52: {
                              param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                              param9 = param9 + param10;
                              param11 = param11 + param12;
                              param13 = param13 + param14;
                              param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                              param2++;
                              if (param7 >= param1[param2]) {
                                break L52;
                              } else {
                                var18 = param0[param2];
                                param0[param2] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                                param1[param2] = param7;
                                break L52;
                              }
                            }
                            L53: {
                              param7 = param7 + param8;
                              param2++;
                              if (param7 >= param1[param2]) {
                                break L53;
                              } else {
                                var18 = param0[param2];
                                param0[param2] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                                param1[param2] = param7;
                                break L53;
                              }
                            }
                            L54: {
                              param7 = param7 + param8;
                              param2++;
                              if (param7 >= param1[param2]) {
                                break L54;
                              } else {
                                var18 = param0[param2];
                                param0[param2] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                                param1[param2] = param7;
                                break L54;
                              }
                            }
                            L55: {
                              param7 = param7 + param8;
                              param2++;
                              if (param7 >= param1[param2]) {
                                break L55;
                              } else {
                                var18 = param0[param2];
                                param0[param2] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                                param1[param2] = param7;
                                break L55;
                              }
                            }
                            param7 = param7 + param8;
                            param4--;
                            if (param4 > 0) {
                              continue L51;
                            } else {
                              break L50;
                            }
                          }
                        }
                      }
                      param4 = param6 - param5 & 3;
                      if (param4 <= 0) {
                        break L41;
                      } else {
                        param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                        param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                        L56: while (true) {
                          L57: {
                            param2++;
                            if (param7 >= param1[param2]) {
                              break L57;
                            } else {
                              var18 = param0[param2];
                              param0[param2] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                              param1[param2] = param7;
                              break L57;
                            }
                          }
                          param7 = param7 + param8;
                          param4--;
                          if (param4 > 0) {
                            continue L56;
                          } else {
                            break L41;
                          }
                        }
                      }
                    }
                  } else {
                    L58: {
                      if (param4 <= 0) {
                        break L58;
                      } else {
                        L59: while (true) {
                          L60: {
                            param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                            param9 = param9 + param10;
                            param11 = param11 + param12;
                            param13 = param13 + param14;
                            param2++;
                            if (param7 >= param1[param2]) {
                              break L60;
                            } else {
                              param0[param2] = param3;
                              param1[param2] = param7;
                              break L60;
                            }
                          }
                          L61: {
                            param7 = param7 + param8;
                            param2++;
                            if (param7 >= param1[param2]) {
                              break L61;
                            } else {
                              param0[param2] = param3;
                              param1[param2] = param7;
                              break L61;
                            }
                          }
                          L62: {
                            param7 = param7 + param8;
                            param2++;
                            if (param7 >= param1[param2]) {
                              break L62;
                            } else {
                              param0[param2] = param3;
                              param1[param2] = param7;
                              break L62;
                            }
                          }
                          L63: {
                            param7 = param7 + param8;
                            param2++;
                            if (param7 >= param1[param2]) {
                              break L63;
                            } else {
                              param0[param2] = param3;
                              param1[param2] = param7;
                              break L63;
                            }
                          }
                          param7 = param7 + param8;
                          param4--;
                          if (param4 > 0) {
                            continue L59;
                          } else {
                            break L58;
                          }
                        }
                      }
                    }
                    param4 = param6 - param5 & 3;
                    if (param4 > 0) {
                      param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                      L64: while (true) {
                        L65: {
                          param2++;
                          if (param7 >= param1[param2]) {
                            break L65;
                          } else {
                            param0[param2] = param3;
                            param1[param2] = param7;
                            break L65;
                          }
                        }
                        param7 = param7 + param8;
                        param4--;
                        if (param4 > 0) {
                          continue L64;
                        } else {
                          break L41;
                        }
                      }
                    } else {
                      return;
                    }
                  }
                }
                return;
              }
            }
          } else {
            param2 = param2 + param5;
            param9 = param9 + param10 * (float)param5;
            param11 = param11 + param12 * (float)param5;
            param13 = param13 + param14 * (float)param5;
            if (this.field_j) {
              L66: {
                param4 = param6 - param5 >> 2;
                param10 = param10 * 4.0f;
                param12 = param12 * 4.0f;
                param14 = param14 * 4.0f;
                if (this.field_b != 0) {
                  if (this.field_g) {
                    L67: {
                      if (param4 <= 0) {
                        break L67;
                      } else {
                        L68: while (true) {
                          param3 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
                          param9 = param9 + param10;
                          param11 = param11 + param12;
                          param13 = param13 + param14;
                          var22 = param0;
                          var16 = var22;
                          incrementValue$18 = param2;
                          param2++;
                          var17 = incrementValue$18;
                          var18 = param3;
                          var19 = var22[var17];
                          var20 = var18 + var19;
                          var21 = (var18 & 16711935) + (var19 & 16711935);
                          var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                          var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                          var23 = param0;
                          var16 = var23;
                          incrementValue$19 = param2;
                          param2++;
                          var17 = incrementValue$19;
                          var18 = param3;
                          var19 = var23[var17];
                          var20 = var18 + var19;
                          var21 = (var18 & 16711935) + (var19 & 16711935);
                          var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                          var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                          var24 = param0;
                          var16 = var24;
                          incrementValue$20 = param2;
                          param2++;
                          var17 = incrementValue$20;
                          var18 = param3;
                          var19 = var24[var17];
                          var20 = var18 + var19;
                          var21 = (var18 & 16711935) + (var19 & 16711935);
                          var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                          var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                          var25 = param0;
                          var16 = var25;
                          incrementValue$21 = param2;
                          param2++;
                          var17 = incrementValue$21;
                          var18 = param3;
                          var19 = var25[var17];
                          var20 = var18 + var19;
                          var21 = (var18 & 16711935) + (var19 & 16711935);
                          var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                          var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                          param4--;
                          if (param4 > 0) {
                            continue L68;
                          } else {
                            break L67;
                          }
                        }
                      }
                    }
                    param4 = param6 - param5 & 3;
                    if (param4 <= 0) {
                      break L66;
                    } else {
                      param3 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
                      L69: while (true) {
                        var26 = param0;
                        var16 = var26;
                        incrementValue$22 = param2;
                        param2++;
                        var17 = incrementValue$22;
                        var18 = param3;
                        var19 = var26[var17];
                        var20 = var18 + var19;
                        var21 = (var18 & 16711935) + (var19 & 16711935);
                        var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                        var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                        param4--;
                        if (param4 > 0) {
                          continue L69;
                        } else {
                          break L66;
                        }
                      }
                    }
                  } else {
                    L70: {
                      var16_int = this.field_b;
                      var17 = 256 - this.field_b;
                      if (param4 <= 0) {
                        break L70;
                      } else {
                        L71: while (true) {
                          param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                          param9 = param9 + param10;
                          param11 = param11 + param12;
                          param13 = param13 + param14;
                          param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                          var18 = param0[param2];
                          incrementValue$23 = param2;
                          param2++;
                          param0[incrementValue$23] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                          var18 = param0[param2];
                          incrementValue$24 = param2;
                          param2++;
                          param0[incrementValue$24] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                          var18 = param0[param2];
                          incrementValue$25 = param2;
                          param2++;
                          param0[incrementValue$25] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                          var18 = param0[param2];
                          incrementValue$26 = param2;
                          param2++;
                          param0[incrementValue$26] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                          param4--;
                          if (param4 > 0) {
                            continue L71;
                          } else {
                            break L70;
                          }
                        }
                      }
                    }
                    param4 = param6 - param5 & 3;
                    if (param4 <= 0) {
                      break L66;
                    } else {
                      param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                      param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                      L72: while (true) {
                        var18 = param0[param2];
                        incrementValue$27 = param2;
                        param2++;
                        param0[incrementValue$27] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                        param4--;
                        if (param4 > 0) {
                          continue L72;
                        } else {
                          break L66;
                        }
                      }
                    }
                  }
                } else {
                  L73: {
                    if (param4 <= 0) {
                      break L73;
                    } else {
                      L74: while (true) {
                        param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                        param9 = param9 + param10;
                        param11 = param11 + param12;
                        param13 = param13 + param14;
                        incrementValue$28 = param2;
                        param2++;
                        param0[incrementValue$28] = param3;
                        incrementValue$29 = param2;
                        param2++;
                        param0[incrementValue$29] = param3;
                        incrementValue$30 = param2;
                        param2++;
                        param0[incrementValue$30] = param3;
                        incrementValue$31 = param2;
                        param2++;
                        param0[incrementValue$31] = param3;
                        param4--;
                        if (param4 > 0) {
                          continue L74;
                        } else {
                          break L73;
                        }
                      }
                    }
                  }
                  param4 = param6 - param5 & 3;
                  if (param4 > 0) {
                    param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                    L75: while (true) {
                      incrementValue$32 = param2;
                      param2++;
                      param0[incrementValue$32] = param3;
                      param4--;
                      if (param4 > 0) {
                        continue L75;
                      } else {
                        break L66;
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
              return;
            } else {
              L76: {
                param4 = param6 - param5;
                if (this.field_b != 0) {
                  if (this.field_g) {
                    L77: while (true) {
                      var27 = param0;
                      var16 = var27;
                      incrementValue$33 = param2;
                      param2++;
                      var17 = incrementValue$33;
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
                        continue L77;
                      } else {
                        break L76;
                      }
                    }
                  } else {
                    var16_int = this.field_b;
                    var17 = 256 - this.field_b;
                    L78: while (true) {
                      param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                      param9 = param9 + param10;
                      param11 = param11 + param12;
                      param13 = param13 + param14;
                      param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                      var18 = param0[param2];
                      incrementValue$34 = param2;
                      param2++;
                      param0[incrementValue$34] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                      param4--;
                      if (param4 > 0) {
                        continue L78;
                      } else {
                        break L76;
                      }
                    }
                  }
                } else {
                  L79: while (true) {
                    incrementValue$35 = param2;
                    param2++;
                    param0[incrementValue$35] = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                    param9 = param9 + param10;
                    param11 = param11 + param12;
                    param13 = param13 + param14;
                    param4--;
                    if (param4 > 0) {
                      continue L79;
                    } else {
                      break L76;
                    }
                  }
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    final void a(float param0, float param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8, float param9, float param10, float param11, float param12, float param13, float param14, int param15, int param16, int param17, int param18, int param19, int param20, int param21, int param22) {
        float var24 = 0.0f;
        float var25 = 0.0f;
        float var26 = 0.0f;
        float var27 = 0.0f;
        float var28 = 0.0f;
        float var29 = 0.0f;
        float var30 = 0.0f;
        float var31 = 0.0f;
        float var32 = 0.0f;
        float var33 = 0.0f;
        float var34 = 0.0f;
        float var35 = 0.0f;
        float var36 = 0.0f;
        float var37 = 0.0f;
        float var38 = 0.0f;
        float var39 = 0.0f;
        float var40 = 0.0f;
        float var41 = 0.0f;
        float var42 = 0.0f;
        float var43 = 0.0f;
        float var44 = 0.0f;
        float var45 = 0.0f;
        float var46 = 0.0f;
        float var47 = 0.0f;
        float var48 = 0.0f;
        float var49 = 0.0f;
        float var50 = 0.0f;
        float var51 = 0.0f;
        float var52 = 0.0f;
        float var53 = 0.0f;
        float var54 = 0.0f;
        float var55 = 0.0f;
        float var56 = 0.0f;
        float var57 = 0.0f;
        float var58 = 0.0f;
        float var59 = 0.0f;
        float var60 = 0.0f;
        float var61 = 0.0f;
        float var62 = 0.0f;
        float var63 = 0.0f;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        L0: {
          if (param22 == this.field_c) {
            break L0;
          } else {
            this.field_w = this.field_k.h(param22);
            if (this.field_w != null) {
              L1: {
                stackOut_3_0 = this;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (!this.field_k.j(param22)) {
                  stackOut_5_0 = this;
                  stackOut_5_1 = this.field_k.field_I;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L1;
                } else {
                  stackOut_4_0 = this;
                  stackOut_4_1 = 64;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
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
        float var21 = 0.0f;
        float var22 = 0.0f;
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
        int incrementValue$1 = 0;
        int var22 = 0;
        float var23 = 0.0f;
        float var24 = 0.0f;
        float var25 = 0.0f;
        float var26 = 0.0f;
        float var27 = 0.0f;
        float var28 = 0.0f;
        float var29 = 0.0f;
        float var30 = 0.0f;
        float var31 = 0.0f;
        float var32 = 0.0f;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int stackIn_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
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
            incrementValue$1 = var22;
            var22--;
            if (incrementValue$1 <= 0) {
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
                            stackOut_27_0 = 255;
                            stackIn_28_0 = stackOut_27_0;
                            break L7;
                          } else {
                            stackOut_26_0 = 0;
                            stackIn_28_0 = stackOut_26_0;
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
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        float var20 = 0.0f;
        float var21 = 0.0f;
        float var22 = 0.0f;
        float var23 = 0.0f;
        float var24 = 0.0f;
        float var25 = 0.0f;
        float var26 = 0.0f;
        float var27 = 0.0f;
        float var28 = 0.0f;
        float var29 = 0.0f;
        float var30 = 0.0f;
        float var31 = 0.0f;
        float var32 = 0.0f;
        float var33 = 0.0f;
        float var34 = 0.0f;
        float var35 = 0.0f;
        float var36 = 0.0f;
        float var37 = 0.0f;
        float var38 = 0.0f;
        float var39 = 0.0f;
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
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
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
            param2 = param2 + (param5 - 1);
            param7 = param7 + param8 * (float)param5;
            param9 = param9 + param10 * (float)param5;
            if (!this.field_o.field_n) {
              if (!this.field_j) {
                param4 = param6 - param5;
                if (this.field_b != 0) {
                  var12 = this.field_b;
                  var13 = 256 - this.field_b;
                  L3: while (true) {
                    L4: {
                      param2++;
                      if (param9 >= param1[param2]) {
                        break L4;
                      } else {
                        param3 = bt.field_h[(int)param7];
                        param3 = ((param3 & 16711935) * var13 >> 8 & 16711935) + ((param3 & 65280) * var13 >> 8 & 65280);
                        var14 = param0[param2];
                        param0[param2] = param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                        break L4;
                      }
                    }
                    param7 = param7 + param8;
                    param9 = param9 + param10;
                    param4--;
                    if (param4 > 0) {
                      continue L3;
                    } else {
                      break L2;
                    }
                  }
                } else {
                  L5: while (true) {
                    L6: {
                      param2++;
                      if (param9 >= param1[param2]) {
                        break L6;
                      } else {
                        param0[param2] = bt.field_h[(int)param7];
                        break L6;
                      }
                    }
                    param9 = param9 + param10;
                    param7 = param7 + param8;
                    param4--;
                    if (param4 > 0) {
                      continue L5;
                    } else {
                      break L2;
                    }
                  }
                }
              } else {
                param4 = param6 - param5 >> 2;
                param8 = param8 * 4.0f;
                if (this.field_b != 0) {
                  L7: {
                    var12 = this.field_b;
                    var13 = 256 - this.field_b;
                    if (param4 <= 0) {
                      break L7;
                    } else {
                      L8: while (true) {
                        L9: {
                          param3 = bt.field_h[(int)param7];
                          param7 = param7 + param8;
                          param3 = ((param3 & 16711935) * var13 >> 8 & 16711935) + ((param3 & 65280) * var13 >> 8 & 65280);
                          param2++;
                          if (param9 >= param1[param2]) {
                            break L9;
                          } else {
                            var14 = param0[param2];
                            param0[param2] = param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                            break L9;
                          }
                        }
                        L10: {
                          param9 = param9 + param10;
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
                        param9 = param9 + param10;
                        param4--;
                        if (param4 > 0) {
                          continue L8;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  param4 = param6 - param5 & 3;
                  if (param4 <= 0) {
                    break L2;
                  } else {
                    param3 = bt.field_h[(int)param7];
                    param3 = ((param3 & 16711935) * var13 >> 8 & 16711935) + ((param3 & 65280) * var13 >> 8 & 65280);
                    L13: while (true) {
                      L14: {
                        param2++;
                        if (param9 >= param1[param2]) {
                          break L14;
                        } else {
                          var14 = param0[param2];
                          param0[param2] = param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                          break L14;
                        }
                      }
                      param9 = param9 + param10;
                      param4--;
                      if (param4 > 0) {
                        continue L13;
                      } else {
                        break L2;
                      }
                    }
                  }
                } else {
                  L15: {
                    if (param4 <= 0) {
                      break L15;
                    } else {
                      L16: while (true) {
                        L17: {
                          param3 = bt.field_h[(int)param7];
                          param7 = param7 + param8;
                          param2++;
                          if (param9 >= param1[param2]) {
                            break L17;
                          } else {
                            param0[param2] = param3;
                            break L17;
                          }
                        }
                        L18: {
                          param9 = param9 + param10;
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
                        param9 = param9 + param10;
                        param4--;
                        if (param4 > 0) {
                          continue L16;
                        } else {
                          break L15;
                        }
                      }
                    }
                  }
                  param4 = param6 - param5 & 3;
                  if (param4 <= 0) {
                    break L2;
                  } else {
                    param3 = bt.field_h[(int)param7];
                    L21: while (true) {
                      L22: {
                        param2++;
                        if (param9 >= param1[param2]) {
                          break L22;
                        } else {
                          param0[param2] = param3;
                          break L22;
                        }
                      }
                      param9 = param9 + param10;
                      param4--;
                      if (param4 > 0) {
                        continue L21;
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
                  L23: while (true) {
                    L24: {
                      param2++;
                      if (param9 >= param1[param2]) {
                        break L24;
                      } else {
                        param3 = bt.field_h[(int)param7];
                        param3 = ((param3 & 16711935) * var13 >> 8 & 16711935) + ((param3 & 65280) * var13 >> 8 & 65280);
                        var14 = param0[param2];
                        param0[param2] = param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                        param1[param2] = param9;
                        break L24;
                      }
                    }
                    param7 = param7 + param8;
                    param9 = param9 + param10;
                    param4--;
                    if (param4 > 0) {
                      continue L23;
                    } else {
                      break L2;
                    }
                  }
                } else {
                  L25: while (true) {
                    L26: {
                      param2++;
                      if (param9 >= param1[param2]) {
                        break L26;
                      } else {
                        param0[param2] = bt.field_h[(int)param7];
                        param1[param2] = param9;
                        break L26;
                      }
                    }
                    param9 = param9 + param10;
                    param7 = param7 + param8;
                    param4--;
                    if (param4 > 0) {
                      continue L25;
                    } else {
                      break L2;
                    }
                  }
                }
              } else {
                param4 = param6 - param5 >> 2;
                param8 = param8 * 4.0f;
                if (this.field_b != 0) {
                  L27: {
                    var12 = this.field_b;
                    var13 = 256 - this.field_b;
                    if (param4 <= 0) {
                      break L27;
                    } else {
                      L28: while (true) {
                        L29: {
                          param3 = bt.field_h[(int)param7];
                          param7 = param7 + param8;
                          param3 = ((param3 & 16711935) * var13 >> 8 & 16711935) + ((param3 & 65280) * var13 >> 8 & 65280);
                          param2++;
                          if (param9 >= param1[param2]) {
                            break L29;
                          } else {
                            var14 = param0[param2];
                            param0[param2] = param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                            param1[param2] = param9;
                            break L29;
                          }
                        }
                        L30: {
                          param9 = param9 + param10;
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
                        param9 = param9 + param10;
                        param4--;
                        if (param4 > 0) {
                          continue L28;
                        } else {
                          break L27;
                        }
                      }
                    }
                  }
                  param4 = param6 - param5 & 3;
                  if (param4 <= 0) {
                    break L2;
                  } else {
                    param3 = bt.field_h[(int)param7];
                    param3 = ((param3 & 16711935) * var13 >> 8 & 16711935) + ((param3 & 65280) * var13 >> 8 & 65280);
                    L33: while (true) {
                      L34: {
                        param2++;
                        if (param9 >= param1[param2]) {
                          break L34;
                        } else {
                          var14 = param0[param2];
                          param0[param2] = param3 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & 65280) * var12 >> 8 & 65280);
                          param1[param2] = param9;
                          break L34;
                        }
                      }
                      param9 = param9 + param10;
                      param4--;
                      if (param4 > 0) {
                        continue L33;
                      } else {
                        break L2;
                      }
                    }
                  }
                } else {
                  L35: {
                    if (param4 <= 0) {
                      break L35;
                    } else {
                      L36: while (true) {
                        L37: {
                          param3 = bt.field_h[(int)param7];
                          param7 = param7 + param8;
                          param2++;
                          if (param9 >= param1[param2]) {
                            break L37;
                          } else {
                            param0[param2] = param3;
                            param1[param2] = param9;
                            break L37;
                          }
                        }
                        L38: {
                          param9 = param9 + param10;
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
                        param9 = param9 + param10;
                        param4--;
                        if (param4 > 0) {
                          continue L36;
                        } else {
                          break L35;
                        }
                      }
                    }
                  }
                  param4 = param6 - param5 & 3;
                  if (param4 > 0) {
                    param3 = bt.field_h[(int)param7];
                    L41: while (true) {
                      L42: {
                        param2++;
                        if (param9 >= param1[param2]) {
                          break L42;
                        } else {
                          param0[param2] = param3;
                          param1[param2] = param9;
                          break L42;
                        }
                      }
                      param9 = param9 + param10;
                      param4--;
                      if (param4 > 0) {
                        continue L41;
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
          return;
        } else {
          return;
        }
    }

    final void b(float param0, float param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8, float param9, float param10, float param11) {
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        float var20 = 0.0f;
        float var21 = 0.0f;
        float var22 = 0.0f;
        float var23 = 0.0f;
        float var24 = 0.0f;
        float var25 = 0.0f;
        float var26 = 0.0f;
        float var27 = 0.0f;
        float var28 = 0.0f;
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
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
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
        int incrementValue$18 = 0;
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
        int[] var16 = null;
        int var16_int = 0;
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
          if (!this.field_m) {
            param2 = param2 + (param5 - 1);
            param7 = param7 + param8 * (float)param5;
            param9 = param9 + param10 * (float)param5;
            param11 = param11 + param12 * (float)param5;
            param13 = param13 + param14 * (float)param5;
            if (!this.field_o.field_n) {
              if (!this.field_j) {
                L2: {
                  param4 = param6 - param5;
                  if (this.field_b != 0) {
                    if (this.field_g) {
                      L3: while (true) {
                        L4: {
                          param2++;
                          if (param7 >= param1[param2]) {
                            break L4;
                          } else {
                            var39 = param0;
                            var16 = var39;
                            var17 = param2;
                            var18 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
                            var19 = var39[var17];
                            var20 = var18 + var19;
                            var21 = (var18 & 16711935) + (var19 & 16711935);
                            var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                            var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                            break L4;
                          }
                        }
                        param7 = param7 + param8;
                        param9 = param9 + param10;
                        param11 = param11 + param12;
                        param13 = param13 + param14;
                        param4--;
                        if (param4 > 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    } else {
                      var16_int = this.field_b;
                      var17 = 256 - this.field_b;
                      L5: while (true) {
                        L6: {
                          param2++;
                          if (param7 >= param1[param2]) {
                            break L6;
                          } else {
                            param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                            param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                            var18 = param0[param2];
                            param0[param2] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                            break L6;
                          }
                        }
                        param7 = param7 + param8;
                        param9 = param9 + param10;
                        param11 = param11 + param12;
                        param13 = param13 + param14;
                        param4--;
                        if (param4 > 0) {
                          continue L5;
                        } else {
                          break L2;
                        }
                      }
                    }
                  } else {
                    L7: while (true) {
                      L8: {
                        param2++;
                        if (param7 >= param1[param2]) {
                          break L8;
                        } else {
                          param0[param2] = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                          break L8;
                        }
                      }
                      param7 = param7 + param8;
                      param9 = param9 + param10;
                      param11 = param11 + param12;
                      param13 = param13 + param14;
                      param4--;
                      if (param4 > 0) {
                        continue L7;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                return;
              } else {
                L9: {
                  param4 = param6 - param5 >> 2;
                  param10 = param10 * 4.0f;
                  param12 = param12 * 4.0f;
                  param14 = param14 * 4.0f;
                  if (this.field_b != 0) {
                    if (this.field_g) {
                      L10: {
                        if (param4 <= 0) {
                          break L10;
                        } else {
                          L11: while (true) {
                            L12: {
                              param3 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
                              param9 = param9 + param10;
                              param11 = param11 + param12;
                              param13 = param13 + param14;
                              param2++;
                              if (param7 >= param1[param2]) {
                                break L12;
                              } else {
                                var34 = param0;
                                var16 = var34;
                                var17 = param2;
                                var18 = param3;
                                var19 = var34[var17];
                                var20 = var18 + var19;
                                var21 = (var18 & 16711935) + (var19 & 16711935);
                                var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                                break L12;
                              }
                            }
                            L13: {
                              param7 = param7 + param8;
                              param2++;
                              if (param7 >= param1[param2]) {
                                break L13;
                              } else {
                                var35 = param0;
                                var16 = var35;
                                var17 = param2;
                                var18 = param3;
                                var19 = var35[var17];
                                var20 = var18 + var19;
                                var21 = (var18 & 16711935) + (var19 & 16711935);
                                var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                                break L13;
                              }
                            }
                            L14: {
                              param7 = param7 + param8;
                              param2++;
                              if (param7 >= param1[param2]) {
                                break L14;
                              } else {
                                var36 = param0;
                                var16 = var36;
                                var17 = param2;
                                var18 = param3;
                                var19 = var36[var17];
                                var20 = var18 + var19;
                                var21 = (var18 & 16711935) + (var19 & 16711935);
                                var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                                break L14;
                              }
                            }
                            L15: {
                              param7 = param7 + param8;
                              param2++;
                              if (param7 >= param1[param2]) {
                                break L15;
                              } else {
                                var37 = param0;
                                var16 = var37;
                                var17 = param2;
                                var18 = param3;
                                var19 = var37[var17];
                                var20 = var18 + var19;
                                var21 = (var18 & 16711935) + (var19 & 16711935);
                                var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                                break L15;
                              }
                            }
                            param7 = param7 + param8;
                            param4--;
                            if (param4 > 0) {
                              continue L11;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                      param4 = param6 - param5 & 3;
                      if (param4 <= 0) {
                        break L9;
                      } else {
                        param3 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
                        L16: while (true) {
                          L17: {
                            param2++;
                            if (param7 >= param1[param2]) {
                              break L17;
                            } else {
                              var38 = param0;
                              var16 = var38;
                              var17 = param2;
                              var18 = param3;
                              var19 = var38[var17];
                              var20 = var18 + var19;
                              var21 = (var18 & 16711935) + (var19 & 16711935);
                              var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                              var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                              break L17;
                            }
                          }
                          param7 = param7 + param8;
                          param4--;
                          if (param4 > 0) {
                            continue L16;
                          } else {
                            break L9;
                          }
                        }
                      }
                    } else {
                      L18: {
                        var16_int = this.field_b;
                        var17 = 256 - this.field_b;
                        if (param4 <= 0) {
                          break L18;
                        } else {
                          L19: while (true) {
                            L20: {
                              param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                              param9 = param9 + param10;
                              param11 = param11 + param12;
                              param13 = param13 + param14;
                              param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                              param2++;
                              if (param7 >= param1[param2]) {
                                break L20;
                              } else {
                                var18 = param0[param2];
                                param0[param2] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                                break L20;
                              }
                            }
                            L21: {
                              param7 = param7 + param8;
                              param2++;
                              if (param7 >= param1[param2]) {
                                break L21;
                              } else {
                                var18 = param0[param2];
                                param0[param2] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                                break L21;
                              }
                            }
                            L22: {
                              param7 = param7 + param8;
                              param2++;
                              if (param7 >= param1[param2]) {
                                break L22;
                              } else {
                                var18 = param0[param2];
                                param0[param2] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                                break L22;
                              }
                            }
                            L23: {
                              param7 = param7 + param8;
                              param2++;
                              if (param7 >= param1[param2]) {
                                break L23;
                              } else {
                                var18 = param0[param2];
                                param0[param2] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                                break L23;
                              }
                            }
                            param7 = param7 + param8;
                            param4--;
                            if (param4 > 0) {
                              continue L19;
                            } else {
                              break L18;
                            }
                          }
                        }
                      }
                      param4 = param6 - param5 & 3;
                      if (param4 <= 0) {
                        break L9;
                      } else {
                        param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                        param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                        L24: while (true) {
                          L25: {
                            param2++;
                            if (param7 >= param1[param2]) {
                              break L25;
                            } else {
                              var18 = param0[param2];
                              param0[param2] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                              break L25;
                            }
                          }
                          param7 = param7 + param8;
                          param4--;
                          if (param4 > 0) {
                            continue L24;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                  } else {
                    L26: {
                      if (param4 <= 0) {
                        break L26;
                      } else {
                        L27: while (true) {
                          L28: {
                            param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                            param9 = param9 + param10;
                            param11 = param11 + param12;
                            param13 = param13 + param14;
                            param2++;
                            if (param7 >= param1[param2]) {
                              break L28;
                            } else {
                              param0[param2] = param3;
                              break L28;
                            }
                          }
                          L29: {
                            param7 = param7 + param8;
                            param2++;
                            if (param7 >= param1[param2]) {
                              break L29;
                            } else {
                              param0[param2] = param3;
                              break L29;
                            }
                          }
                          L30: {
                            param7 = param7 + param8;
                            param2++;
                            if (param7 >= param1[param2]) {
                              break L30;
                            } else {
                              param0[param2] = param3;
                              break L30;
                            }
                          }
                          L31: {
                            param7 = param7 + param8;
                            param2++;
                            if (param7 >= param1[param2]) {
                              break L31;
                            } else {
                              param0[param2] = param3;
                              break L31;
                            }
                          }
                          param7 = param7 + param8;
                          param4--;
                          if (param4 > 0) {
                            continue L27;
                          } else {
                            break L26;
                          }
                        }
                      }
                    }
                    param4 = param6 - param5 & 3;
                    if (param4 > 0) {
                      param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                      L32: while (true) {
                        L33: {
                          param2++;
                          if (param7 >= param1[param2]) {
                            break L33;
                          } else {
                            param0[param2] = param3;
                            break L33;
                          }
                        }
                        param7 = param7 + param8;
                        param4--;
                        if (param4 > 0) {
                          continue L32;
                        } else {
                          break L9;
                        }
                      }
                    } else {
                      return;
                    }
                  }
                }
                return;
              }
            } else {
              if (!this.field_j) {
                L34: {
                  param4 = param6 - param5;
                  if (this.field_b != 0) {
                    if (this.field_g) {
                      L35: while (true) {
                        L36: {
                          param2++;
                          if (param7 >= param1[param2]) {
                            break L36;
                          } else {
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
                            break L36;
                          }
                        }
                        param7 = param7 + param8;
                        param9 = param9 + param10;
                        param11 = param11 + param12;
                        param13 = param13 + param14;
                        param4--;
                        if (param4 > 0) {
                          continue L35;
                        } else {
                          break L34;
                        }
                      }
                    } else {
                      var16_int = this.field_b;
                      var17 = 256 - this.field_b;
                      L37: while (true) {
                        L38: {
                          param2++;
                          if (param7 >= param1[param2]) {
                            break L38;
                          } else {
                            param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                            param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                            var18 = param0[param2];
                            param0[param2] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                            param1[param2] = param7;
                            break L38;
                          }
                        }
                        param7 = param7 + param8;
                        param9 = param9 + param10;
                        param11 = param11 + param12;
                        param13 = param13 + param14;
                        param4--;
                        if (param4 > 0) {
                          continue L37;
                        } else {
                          break L34;
                        }
                      }
                    }
                  } else {
                    L39: while (true) {
                      L40: {
                        param2++;
                        if (param7 >= param1[param2]) {
                          break L40;
                        } else {
                          param0[param2] = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                          param1[param2] = param7;
                          break L40;
                        }
                      }
                      param7 = param7 + param8;
                      param9 = param9 + param10;
                      param11 = param11 + param12;
                      param13 = param13 + param14;
                      param4--;
                      if (param4 > 0) {
                        continue L39;
                      } else {
                        break L34;
                      }
                    }
                  }
                }
                return;
              } else {
                L41: {
                  param4 = param6 - param5 >> 2;
                  param10 = param10 * 4.0f;
                  param12 = param12 * 4.0f;
                  param14 = param14 * 4.0f;
                  if (this.field_b != 0) {
                    if (this.field_g) {
                      L42: {
                        if (param4 <= 0) {
                          break L42;
                        } else {
                          L43: while (true) {
                            L44: {
                              param3 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
                              param9 = param9 + param10;
                              param11 = param11 + param12;
                              param13 = param13 + param14;
                              param2++;
                              if (param7 >= param1[param2]) {
                                break L44;
                              } else {
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
                                break L44;
                              }
                            }
                            L45: {
                              param7 = param7 + param8;
                              param2++;
                              if (param7 >= param1[param2]) {
                                break L45;
                              } else {
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
                                break L45;
                              }
                            }
                            L46: {
                              param7 = param7 + param8;
                              param2++;
                              if (param7 >= param1[param2]) {
                                break L46;
                              } else {
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
                                break L46;
                              }
                            }
                            L47: {
                              param7 = param7 + param8;
                              param2++;
                              if (param7 >= param1[param2]) {
                                break L47;
                              } else {
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
                                break L47;
                              }
                            }
                            param7 = param7 + param8;
                            param4--;
                            if (param4 > 0) {
                              continue L43;
                            } else {
                              break L42;
                            }
                          }
                        }
                      }
                      param4 = param6 - param5 & 3;
                      if (param4 <= 0) {
                        break L41;
                      } else {
                        param3 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
                        L48: while (true) {
                          L49: {
                            param2++;
                            if (param7 >= param1[param2]) {
                              break L49;
                            } else {
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
                              break L49;
                            }
                          }
                          param7 = param7 + param8;
                          param4--;
                          if (param4 > 0) {
                            continue L48;
                          } else {
                            break L41;
                          }
                        }
                      }
                    } else {
                      L50: {
                        var16_int = this.field_b;
                        var17 = 256 - this.field_b;
                        if (param4 <= 0) {
                          break L50;
                        } else {
                          L51: while (true) {
                            L52: {
                              param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                              param9 = param9 + param10;
                              param11 = param11 + param12;
                              param13 = param13 + param14;
                              param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                              param2++;
                              if (param7 >= param1[param2]) {
                                break L52;
                              } else {
                                var18 = param0[param2];
                                param0[param2] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                                param1[param2] = param7;
                                break L52;
                              }
                            }
                            L53: {
                              param7 = param7 + param8;
                              param2++;
                              if (param7 >= param1[param2]) {
                                break L53;
                              } else {
                                var18 = param0[param2];
                                param0[param2] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                                param1[param2] = param7;
                                break L53;
                              }
                            }
                            L54: {
                              param7 = param7 + param8;
                              param2++;
                              if (param7 >= param1[param2]) {
                                break L54;
                              } else {
                                var18 = param0[param2];
                                param0[param2] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                                param1[param2] = param7;
                                break L54;
                              }
                            }
                            L55: {
                              param7 = param7 + param8;
                              param2++;
                              if (param7 >= param1[param2]) {
                                break L55;
                              } else {
                                var18 = param0[param2];
                                param0[param2] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                                param1[param2] = param7;
                                break L55;
                              }
                            }
                            param7 = param7 + param8;
                            param4--;
                            if (param4 > 0) {
                              continue L51;
                            } else {
                              break L50;
                            }
                          }
                        }
                      }
                      param4 = param6 - param5 & 3;
                      if (param4 <= 0) {
                        break L41;
                      } else {
                        param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                        param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                        L56: while (true) {
                          L57: {
                            param2++;
                            if (param7 >= param1[param2]) {
                              break L57;
                            } else {
                              var18 = param0[param2];
                              param0[param2] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                              param1[param2] = param7;
                              break L57;
                            }
                          }
                          param7 = param7 + param8;
                          param4--;
                          if (param4 > 0) {
                            continue L56;
                          } else {
                            break L41;
                          }
                        }
                      }
                    }
                  } else {
                    L58: {
                      if (param4 <= 0) {
                        break L58;
                      } else {
                        L59: while (true) {
                          L60: {
                            param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                            param9 = param9 + param10;
                            param11 = param11 + param12;
                            param13 = param13 + param14;
                            param2++;
                            if (param7 >= param1[param2]) {
                              break L60;
                            } else {
                              param0[param2] = param3;
                              param1[param2] = param7;
                              break L60;
                            }
                          }
                          L61: {
                            param7 = param7 + param8;
                            param2++;
                            if (param7 >= param1[param2]) {
                              break L61;
                            } else {
                              param0[param2] = param3;
                              param1[param2] = param7;
                              break L61;
                            }
                          }
                          L62: {
                            param7 = param7 + param8;
                            param2++;
                            if (param7 >= param1[param2]) {
                              break L62;
                            } else {
                              param0[param2] = param3;
                              param1[param2] = param7;
                              break L62;
                            }
                          }
                          L63: {
                            param7 = param7 + param8;
                            param2++;
                            if (param7 >= param1[param2]) {
                              break L63;
                            } else {
                              param0[param2] = param3;
                              param1[param2] = param7;
                              break L63;
                            }
                          }
                          param7 = param7 + param8;
                          param4--;
                          if (param4 > 0) {
                            continue L59;
                          } else {
                            break L58;
                          }
                        }
                      }
                    }
                    param4 = param6 - param5 & 3;
                    if (param4 > 0) {
                      param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                      L64: while (true) {
                        L65: {
                          param2++;
                          if (param7 >= param1[param2]) {
                            break L65;
                          } else {
                            param0[param2] = param3;
                            param1[param2] = param7;
                            break L65;
                          }
                        }
                        param7 = param7 + param8;
                        param4--;
                        if (param4 > 0) {
                          continue L64;
                        } else {
                          break L41;
                        }
                      }
                    } else {
                      return;
                    }
                  }
                }
                return;
              }
            }
          } else {
            param2 = param2 + param5;
            param9 = param9 + param10 * (float)param5;
            param11 = param11 + param12 * (float)param5;
            param13 = param13 + param14 * (float)param5;
            if (!this.field_j) {
              L66: {
                param4 = param6 - param5;
                if (this.field_b != 0) {
                  if (this.field_g) {
                    L67: while (true) {
                      var27 = param0;
                      var16 = var27;
                      incrementValue$18 = param2;
                      param2++;
                      var17 = incrementValue$18;
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
                        continue L67;
                      } else {
                        break L66;
                      }
                    }
                  } else {
                    var16_int = this.field_b;
                    var17 = 256 - this.field_b;
                    L68: while (true) {
                      param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                      param9 = param9 + param10;
                      param11 = param11 + param12;
                      param13 = param13 + param14;
                      param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                      var18 = param0[param2];
                      incrementValue$19 = param2;
                      param2++;
                      param0[incrementValue$19] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                      param4--;
                      if (param4 > 0) {
                        continue L68;
                      } else {
                        break L66;
                      }
                    }
                  }
                } else {
                  L69: while (true) {
                    incrementValue$20 = param2;
                    param2++;
                    param0[incrementValue$20] = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                    param9 = param9 + param10;
                    param11 = param11 + param12;
                    param13 = param13 + param14;
                    param4--;
                    if (param4 > 0) {
                      continue L69;
                    } else {
                      break L66;
                    }
                  }
                }
              }
              return;
            } else {
              L70: {
                param4 = param6 - param5 >> 2;
                param10 = param10 * 4.0f;
                param12 = param12 * 4.0f;
                param14 = param14 * 4.0f;
                if (this.field_b != 0) {
                  if (this.field_g) {
                    L71: {
                      if (param4 <= 0) {
                        break L71;
                      } else {
                        L72: while (true) {
                          param3 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
                          param9 = param9 + param10;
                          param11 = param11 + param12;
                          param13 = param13 + param14;
                          var22 = param0;
                          var16 = var22;
                          incrementValue$21 = param2;
                          param2++;
                          var17 = incrementValue$21;
                          var18 = param3;
                          var19 = var22[var17];
                          var20 = var18 + var19;
                          var21 = (var18 & 16711935) + (var19 & 16711935);
                          var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                          var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                          var23 = param0;
                          var16 = var23;
                          incrementValue$22 = param2;
                          param2++;
                          var17 = incrementValue$22;
                          var18 = param3;
                          var19 = var23[var17];
                          var20 = var18 + var19;
                          var21 = (var18 & 16711935) + (var19 & 16711935);
                          var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                          var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                          var24 = param0;
                          var16 = var24;
                          incrementValue$23 = param2;
                          param2++;
                          var17 = incrementValue$23;
                          var18 = param3;
                          var19 = var24[var17];
                          var20 = var18 + var19;
                          var21 = (var18 & 16711935) + (var19 & 16711935);
                          var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                          var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                          var25 = param0;
                          var16 = var25;
                          incrementValue$24 = param2;
                          param2++;
                          var17 = incrementValue$24;
                          var18 = param3;
                          var19 = var25[var17];
                          var20 = var18 + var19;
                          var21 = (var18 & 16711935) + (var19 & 16711935);
                          var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                          var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                          param4--;
                          if (param4 > 0) {
                            continue L72;
                          } else {
                            break L71;
                          }
                        }
                      }
                    }
                    param4 = param6 - param5 & 3;
                    if (param4 <= 0) {
                      break L70;
                    } else {
                      param3 = (int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255;
                      L73: while (true) {
                        var26 = param0;
                        var16 = var26;
                        incrementValue$25 = param2;
                        param2++;
                        var17 = incrementValue$25;
                        var18 = param3;
                        var19 = var26[var17];
                        var20 = var18 + var19;
                        var21 = (var18 & 16711935) + (var19 & 16711935);
                        var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                        var16[var17] = -16777216 | var20 - var19 | var19 - (var19 >>> 8);
                        param4--;
                        if (param4 > 0) {
                          continue L73;
                        } else {
                          break L70;
                        }
                      }
                    }
                  } else {
                    L74: {
                      var16_int = this.field_b;
                      var17 = 256 - this.field_b;
                      if (param4 <= 0) {
                        break L74;
                      } else {
                        L75: while (true) {
                          param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                          param9 = param9 + param10;
                          param11 = param11 + param12;
                          param13 = param13 + param14;
                          param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                          var18 = param0[param2];
                          incrementValue$26 = param2;
                          param2++;
                          param0[incrementValue$26] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                          var18 = param0[param2];
                          incrementValue$27 = param2;
                          param2++;
                          param0[incrementValue$27] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                          var18 = param0[param2];
                          incrementValue$28 = param2;
                          param2++;
                          param0[incrementValue$28] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                          var18 = param0[param2];
                          incrementValue$29 = param2;
                          param2++;
                          param0[incrementValue$29] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                          param4--;
                          if (param4 > 0) {
                            continue L75;
                          } else {
                            break L74;
                          }
                        }
                      }
                    }
                    param4 = param6 - param5 & 3;
                    if (param4 <= 0) {
                      break L70;
                    } else {
                      param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                      param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                      L76: while (true) {
                        var18 = param0[param2];
                        incrementValue$30 = param2;
                        param2++;
                        param0[incrementValue$30] = (var17 | var18 >> 24) << 24 | param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                        param4--;
                        if (param4 > 0) {
                          continue L76;
                        } else {
                          break L70;
                        }
                      }
                    }
                  }
                } else {
                  L77: {
                    if (param4 <= 0) {
                      break L77;
                    } else {
                      L78: while (true) {
                        param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                        param9 = param9 + param10;
                        param11 = param11 + param12;
                        param13 = param13 + param14;
                        incrementValue$31 = param2;
                        param2++;
                        param0[incrementValue$31] = param3;
                        incrementValue$32 = param2;
                        param2++;
                        param0[incrementValue$32] = param3;
                        incrementValue$33 = param2;
                        param2++;
                        param0[incrementValue$33] = param3;
                        incrementValue$34 = param2;
                        param2++;
                        param0[incrementValue$34] = param3;
                        param4--;
                        if (param4 > 0) {
                          continue L78;
                        } else {
                          break L77;
                        }
                      }
                    }
                  }
                  param4 = param6 - param5 & 3;
                  if (param4 > 0) {
                    param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                    L79: while (true) {
                      incrementValue$35 = param2;
                      param2++;
                      param0[incrementValue$35] = param3;
                      param4--;
                      if (param4 > 0) {
                        continue L79;
                      } else {
                        break L70;
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
              return;
            }
          }
        } else {
          return;
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
