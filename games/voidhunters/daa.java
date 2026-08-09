/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class daa {
    boolean field_n;
    int[] field_k;
    private int[] field_e;
    boolean field_i;
    private float[] field_h;
    private sob field_f;
    int field_g;
    private boolean field_l;
    private co field_c;
    int field_b;
    private int field_m;
    boolean field_d;
    boolean field_j;
    int field_a;

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
        if (!this.field_l) {
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
                  if (param0 < (float)this.field_g) {
                    L4: {
                      if (param1 <= (float)this.field_g) {
                        break L4;
                      } else {
                        param1 = (float)this.field_g;
                        break L4;
                      }
                    }
                    L5: {
                      if (param2 <= (float)this.field_g) {
                        break L5;
                      } else {
                        param2 = (float)this.field_g;
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
                            param0 = (float)this.field_k[(int)param0];
                            L9: while (true) {
                              param2 = param2 - 1.0f;
                              if (param2 < 0.0f) {
                                L10: while (true) {
                                  param1 = param1 - 1.0f;
                                  if (param1 < 0.0f) {
                                    return;
                                  } else {
                                    this.a(this.field_e, this.field_h, (int)param0, param9, 0, (int)param5, (int)param3, param6, var21);
                                    param5 = param5 + var18;
                                    param3 = param3 + var17;
                                    param6 = param6 + var22;
                                    param0 = param0 + (float)this.field_m;
                                    continue L10;
                                  }
                                }
                              } else {
                                this.a(this.field_e, this.field_h, (int)param0, param9, 0, (int)param4, (int)param3, param6, var21);
                                param4 = param4 + var19;
                                param3 = param3 + var17;
                                param6 = param6 + var22;
                                param0 = param0 + (float)this.field_m;
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
                          param0 = (float)this.field_k[(int)param0];
                          L11: while (true) {
                            param2 = param2 - 1.0f;
                            if (param2 < 0.0f) {
                              L12: while (true) {
                                param1 = param1 - 1.0f;
                                if (param1 < 0.0f) {
                                  return;
                                } else {
                                  this.a(this.field_e, this.field_h, (int)param0, param9, 0, (int)param5, (int)param3, param6, var21);
                                  param5 = param5 + var18;
                                  param3 = param3 + var17;
                                  param6 = param6 + var22;
                                  param0 = param0 + (float)this.field_m;
                                  continue L12;
                                }
                              }
                            } else {
                              this.a(this.field_e, this.field_h, (int)param0, param9, 0, (int)param4, (int)param3, param6, var21);
                              param4 = param4 + var19;
                              param3 = param3 + var17;
                              param6 = param6 + var22;
                              param0 = param0 + (float)this.field_m;
                              continue L11;
                            }
                          }
                        } else {
                          param1 = param1 - param2;
                          param2 = param2 - param0;
                          param0 = (float)this.field_k[(int)param0];
                          L13: while (true) {
                            param2 = param2 - 1.0f;
                            if (param2 < 0.0f) {
                              L14: while (true) {
                                param1 = param1 - 1.0f;
                                if (param1 < 0.0f) {
                                  return;
                                } else {
                                  this.a(this.field_e, this.field_h, (int)param0, param9, 0, (int)param3, (int)param5, param6, var21);
                                  param5 = param5 + var18;
                                  param3 = param3 + var17;
                                  param6 = param6 + var22;
                                  param0 = param0 + (float)this.field_m;
                                  continue L14;
                                }
                              }
                            } else {
                              this.a(this.field_e, this.field_h, (int)param0, param9, 0, (int)param3, (int)param4, param6, var21);
                              param4 = param4 + var19;
                              param3 = param3 + var17;
                              param6 = param6 + var22;
                              param0 = param0 + (float)this.field_m;
                              continue L13;
                            }
                          }
                        }
                      } else {
                        param1 = param1 - param2;
                        param2 = param2 - param0;
                        param0 = (float)this.field_k[(int)param0];
                        L15: while (true) {
                          param2 = param2 - 1.0f;
                          if (param2 < 0.0f) {
                            L16: while (true) {
                              param1 = param1 - 1.0f;
                              if (param1 < 0.0f) {
                                return;
                              } else {
                                this.a(this.field_e, this.field_h, (int)param0, param9, 0, (int)param3, (int)param5, param6, var21);
                                param5 = param5 + var18;
                                param3 = param3 + var17;
                                param6 = param6 + var22;
                                param0 = param0 + (float)this.field_m;
                                continue L16;
                              }
                            }
                          } else {
                            this.a(this.field_e, this.field_h, (int)param0, param9, 0, (int)param3, (int)param4, param6, var21);
                            param4 = param4 + var19;
                            param3 = param3 + var17;
                            param6 = param6 + var22;
                            param0 = param0 + (float)this.field_m;
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
                            param0 = (float)this.field_k[(int)param0];
                            L20: while (true) {
                              param1 = param1 - 1.0f;
                              if (param1 < 0.0f) {
                                L21: while (true) {
                                  param2 = param2 - 1.0f;
                                  if (param2 < 0.0f) {
                                    return;
                                  } else {
                                    this.a(this.field_e, this.field_h, (int)param0, param9, 0, (int)param5, (int)param4, param6, var21);
                                    param5 = param5 + var19;
                                    param4 = param4 + var18;
                                    param6 = param6 + var22;
                                    param0 = param0 + (float)this.field_m;
                                    continue L21;
                                  }
                                }
                              } else {
                                this.a(this.field_e, this.field_h, (int)param0, param9, 0, (int)param5, (int)param3, param6, var21);
                                param5 = param5 + var19;
                                param3 = param3 + var17;
                                param6 = param6 + var22;
                                param0 = param0 + (float)this.field_m;
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
                          param0 = (float)this.field_k[(int)param0];
                          L22: while (true) {
                            param1 = param1 - 1.0f;
                            if (param1 < 0.0f) {
                              L23: while (true) {
                                param2 = param2 - 1.0f;
                                if (param2 < 0.0f) {
                                  return;
                                } else {
                                  this.a(this.field_e, this.field_h, (int)param0, param9, 0, (int)param5, (int)param4, param6, var21);
                                  param5 = param5 + var19;
                                  param4 = param4 + var18;
                                  param6 = param6 + var22;
                                  param0 = param0 + (float)this.field_m;
                                  continue L23;
                                }
                              }
                            } else {
                              this.a(this.field_e, this.field_h, (int)param0, param9, 0, (int)param5, (int)param3, param6, var21);
                              param5 = param5 + var19;
                              param3 = param3 + var17;
                              param6 = param6 + var22;
                              param0 = param0 + (float)this.field_m;
                              continue L22;
                            }
                          }
                        } else {
                          param2 = param2 - param1;
                          param1 = param1 - param0;
                          param0 = (float)this.field_k[(int)param0];
                          L24: while (true) {
                            param1 = param1 - 1.0f;
                            if (param1 < 0.0f) {
                              L25: while (true) {
                                param2 = param2 - 1.0f;
                                if (param2 < 0.0f) {
                                  return;
                                } else {
                                  this.a(this.field_e, this.field_h, (int)param0, param9, 0, (int)param4, (int)param5, param6, var21);
                                  param5 = param5 + var19;
                                  param4 = param4 + var18;
                                  param6 = param6 + var22;
                                  param0 = param0 + (float)this.field_m;
                                  continue L25;
                                }
                              }
                            } else {
                              this.a(this.field_e, this.field_h, (int)param0, param9, 0, (int)param3, (int)param5, param6, var21);
                              param5 = param5 + var19;
                              param3 = param3 + var17;
                              param6 = param6 + var22;
                              param0 = param0 + (float)this.field_m;
                              continue L24;
                            }
                          }
                        }
                      } else {
                        param2 = param2 - param1;
                        param1 = param1 - param0;
                        param0 = (float)this.field_k[(int)param0];
                        L26: while (true) {
                          param1 = param1 - 1.0f;
                          if (param1 < 0.0f) {
                            L27: while (true) {
                              param2 = param2 - 1.0f;
                              if (param2 < 0.0f) {
                                return;
                              } else {
                                this.a(this.field_e, this.field_h, (int)param0, param9, 0, (int)param4, (int)param5, param6, var21);
                                param5 = param5 + var19;
                                param4 = param4 + var18;
                                param6 = param6 + var22;
                                param0 = param0 + (float)this.field_m;
                                continue L27;
                              }
                            }
                          } else {
                            this.a(this.field_e, this.field_h, (int)param0, param9, 0, (int)param3, (int)param5, param6, var21);
                            param5 = param5 + var19;
                            param3 = param3 + var17;
                            param6 = param6 + var22;
                            param0 = param0 + (float)this.field_m;
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
              if (param2 < (float)this.field_g) {
                L28: {
                  if (param0 <= (float)this.field_g) {
                    break L28;
                  } else {
                    param0 = (float)this.field_g;
                    break L28;
                  }
                }
                L29: {
                  if (param1 <= (float)this.field_g) {
                    break L29;
                  } else {
                    param1 = (float)this.field_g;
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
                    param2 = (float)this.field_k[(int)param2];
                    L32: while (true) {
                      param1 = param1 - 1.0f;
                      if (param1 < 0.0f) {
                        L33: while (true) {
                          param0 = param0 - 1.0f;
                          if (param0 < 0.0f) {
                            return;
                          } else {
                            this.a(this.field_e, this.field_h, (int)param2, param9, 0, (int)param4, (int)param5, param8, var21);
                            param4 = param4 + var17;
                            param5 = param5 + var19;
                            param8 = param8 + var22;
                            param2 = param2 + (float)this.field_m;
                            continue L33;
                          }
                        }
                      } else {
                        this.a(this.field_e, this.field_h, (int)param2, param9, 0, (int)param3, (int)param5, param8, var21);
                        param3 = param3 + var18;
                        param5 = param5 + var19;
                        param8 = param8 + var22;
                        param2 = param2 + (float)this.field_m;
                        continue L32;
                      }
                    }
                  } else {
                    param0 = param0 - param1;
                    param1 = param1 - param2;
                    param2 = (float)this.field_k[(int)param2];
                    L34: while (true) {
                      param1 = param1 - 1.0f;
                      if (param1 < 0.0f) {
                        L35: while (true) {
                          param0 = param0 - 1.0f;
                          if (param0 < 0.0f) {
                            return;
                          } else {
                            this.a(this.field_e, this.field_h, (int)param2, param9, 0, (int)param5, (int)param4, param8, var21);
                            param4 = param4 + var17;
                            param5 = param5 + var19;
                            param8 = param8 + var22;
                            param2 = param2 + (float)this.field_m;
                            continue L35;
                          }
                        }
                      } else {
                        this.a(this.field_e, this.field_h, (int)param2, param9, 0, (int)param5, (int)param3, param8, var21);
                        param3 = param3 + var18;
                        param5 = param5 + var19;
                        param8 = param8 + var22;
                        param2 = param2 + (float)this.field_m;
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
                    param2 = (float)this.field_k[(int)param2];
                    L38: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        L39: while (true) {
                          param1 = param1 - 1.0f;
                          if (param1 < 0.0f) {
                            return;
                          } else {
                            this.a(this.field_e, this.field_h, (int)param2, param9, 0, (int)param4, (int)param3, param8, var21);
                            param4 = param4 + var18;
                            param3 = param3 + var17;
                            param8 = param8 + var22;
                            param2 = param2 + (float)this.field_m;
                            continue L39;
                          }
                        }
                      } else {
                        this.a(this.field_e, this.field_h, (int)param2, param9, 0, (int)param4, (int)param5, param8, var21);
                        param4 = param4 + var18;
                        param5 = param5 + var19;
                        param8 = param8 + var22;
                        param2 = param2 + (float)this.field_m;
                        continue L38;
                      }
                    }
                  } else {
                    param1 = param1 - param0;
                    param0 = param0 - param2;
                    param2 = (float)this.field_k[(int)param2];
                    L40: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        L41: while (true) {
                          param1 = param1 - 1.0f;
                          if (param1 < 0.0f) {
                            return;
                          } else {
                            this.a(this.field_e, this.field_h, (int)param2, param9, 0, (int)param3, (int)param4, param8, var21);
                            param4 = param4 + var18;
                            param3 = param3 + var17;
                            param8 = param8 + var22;
                            param2 = param2 + (float)this.field_m;
                            continue L41;
                          }
                        }
                      } else {
                        this.a(this.field_e, this.field_h, (int)param2, param9, 0, (int)param5, (int)param4, param8, var21);
                        param4 = param4 + var18;
                        param5 = param5 + var19;
                        param8 = param8 + var22;
                        param2 = param2 + (float)this.field_m;
                        continue L40;
                      }
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              if (param1 < (float)this.field_g) {
                L42: {
                  if (param2 <= (float)this.field_g) {
                    break L42;
                  } else {
                    param2 = (float)this.field_g;
                    break L42;
                  }
                }
                L43: {
                  if (param0 <= (float)this.field_g) {
                    break L43;
                  } else {
                    param0 = (float)this.field_g;
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
                    param1 = (float)this.field_k[(int)param1];
                    L46: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        L47: while (true) {
                          param2 = param2 - 1.0f;
                          if (param2 < 0.0f) {
                            return;
                          } else {
                            this.a(this.field_e, this.field_h, (int)param1, param9, 0, (int)param3, (int)param4, param7, var21);
                            param3 = param3 + var19;
                            param4 = param4 + var18;
                            param7 = param7 + var22;
                            param1 = param1 + (float)this.field_m;
                            continue L47;
                          }
                        }
                      } else {
                        this.a(this.field_e, this.field_h, (int)param1, param9, 0, (int)param5, (int)param4, param7, var21);
                        param5 = param5 + var17;
                        param4 = param4 + var18;
                        param7 = param7 + var22;
                        param1 = param1 + (float)this.field_m;
                        continue L46;
                      }
                    }
                  } else {
                    param2 = param2 - param0;
                    param0 = param0 - param1;
                    param1 = (float)this.field_k[(int)param1];
                    L48: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        L49: while (true) {
                          param2 = param2 - 1.0f;
                          if (param2 < 0.0f) {
                            return;
                          } else {
                            this.a(this.field_e, this.field_h, (int)param1, param9, 0, (int)param4, (int)param3, param7, var21);
                            param3 = param3 + var19;
                            param4 = param4 + var18;
                            param7 = param7 + var22;
                            param1 = param1 + (float)this.field_m;
                            continue L49;
                          }
                        }
                      } else {
                        this.a(this.field_e, this.field_h, (int)param1, param9, 0, (int)param4, (int)param5, param7, var21);
                        param5 = param5 + var17;
                        param4 = param4 + var18;
                        param7 = param7 + var22;
                        param1 = param1 + (float)this.field_m;
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
                        param1 = (float)this.field_k[(int)param1];
                        L53: while (true) {
                          param2 = param2 - 1.0f;
                          if (param2 < 0.0f) {
                            L54: while (true) {
                              param0 = param0 - 1.0f;
                              if (param0 < 0.0f) {
                                return;
                              } else {
                                this.a(this.field_e, this.field_h, (int)param1, param9, 0, (int)param3, (int)param5, param7, var21);
                                param3 = param3 + var17;
                                param5 = param5 + var19;
                                param7 = param7 + var22;
                                param1 = param1 + (float)this.field_m;
                                continue L54;
                              }
                            }
                          } else {
                            this.a(this.field_e, this.field_h, (int)param1, param9, 0, (int)param3, (int)param4, param7, var21);
                            param3 = param3 + var17;
                            param4 = param4 + var18;
                            param7 = param7 + var22;
                            param1 = param1 + (float)this.field_m;
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
                      param1 = (float)this.field_k[(int)param1];
                      L55: while (true) {
                        param2 = param2 - 1.0f;
                        if (param2 < 0.0f) {
                          L56: while (true) {
                            param0 = param0 - 1.0f;
                            if (param0 < 0.0f) {
                              return;
                            } else {
                              this.a(this.field_e, this.field_h, (int)param1, param9, 0, (int)param3, (int)param5, param7, var21);
                              param3 = param3 + var17;
                              param5 = param5 + var19;
                              param7 = param7 + var22;
                              param1 = param1 + (float)this.field_m;
                              continue L56;
                            }
                          }
                        } else {
                          this.a(this.field_e, this.field_h, (int)param1, param9, 0, (int)param3, (int)param4, param7, var21);
                          param3 = param3 + var17;
                          param4 = param4 + var18;
                          param7 = param7 + var22;
                          param1 = param1 + (float)this.field_m;
                          continue L55;
                        }
                      }
                    } else {
                      param0 = param0 - param2;
                      param2 = param2 - param1;
                      param1 = (float)this.field_k[(int)param1];
                      L57: while (true) {
                        param2 = param2 - 1.0f;
                        if (param2 < 0.0f) {
                          L58: while (true) {
                            param0 = param0 - 1.0f;
                            if (param0 < 0.0f) {
                              return;
                            } else {
                              this.a(this.field_e, this.field_h, (int)param1, param9, 0, (int)param5, (int)param3, param7, var21);
                              param3 = param3 + var17;
                              param5 = param5 + var19;
                              param7 = param7 + var22;
                              param1 = param1 + (float)this.field_m;
                              continue L58;
                            }
                          }
                        } else {
                          this.a(this.field_e, this.field_h, (int)param1, param9, 0, (int)param4, (int)param3, param7, var21);
                          param3 = param3 + var17;
                          param4 = param4 + var18;
                          param7 = param7 + var22;
                          param1 = param1 + (float)this.field_m;
                          continue L57;
                        }
                      }
                    }
                  } else {
                    param0 = param0 - param2;
                    param2 = param2 - param1;
                    param1 = (float)this.field_k[(int)param1];
                    L59: while (true) {
                      param2 = param2 - 1.0f;
                      if (param2 < 0.0f) {
                        L60: while (true) {
                          param0 = param0 - 1.0f;
                          if (param0 < 0.0f) {
                            return;
                          } else {
                            this.a(this.field_e, this.field_h, (int)param1, param9, 0, (int)param5, (int)param3, param7, var21);
                            param3 = param3 + var17;
                            param5 = param5 + var19;
                            param7 = param7 + var22;
                            param1 = param1 + (float)this.field_m;
                            continue L60;
                          }
                        }
                      } else {
                        this.a(this.field_e, this.field_h, (int)param1, param9, 0, (int)param4, (int)param3, param7, var21);
                        param3 = param3 + var17;
                        param4 = param4 + var18;
                        param7 = param7 + var22;
                        param1 = param1 + (float)this.field_m;
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
          this.field_f.c((int)param4, 1, param9, (int)param1, (int)param3, (int)param0);
          this.field_f.c((int)param5, 1, param9, (int)param2, (int)param4, (int)param1);
          this.field_f.c((int)param3, 1, param9, (int)param0, (int)param5, (int)param2);
          return;
        }
    }

    private final void a(int[] param0, float[] param1, int param2, int param3, int param4, int param5, int param6, float param7, float param8) {
        int var10;
        int var11;
        int var12;
        L0: {
          if (!this.field_n) {
            break L0;
          } else {
            L1: {
              if (param6 <= this.field_b) {
                break L1;
              } else {
                param6 = this.field_b;
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
          if (!this.field_c.field_f) {
            if (this.field_a != 0) {
              L2: {
                if (this.field_a != 254) {
                  var10 = this.field_a;
                  var11 = 256 - this.field_a;
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
                    if (param6 <= this.field_b - 1) {
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
            if (this.field_a != 0) {
              if (this.field_a != 254) {
                var10 = this.field_a;
                var11 = 256 - this.field_a;
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
                  if (param6 <= this.field_b - 1) {
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

    final int a() {
        return this.field_k[0] % this.field_m;
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
        if (!this.field_l) {
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
                  if (param0 < (float)this.field_g) {
                    L4: {
                      if (param1 <= (float)this.field_g) {
                        break L4;
                      } else {
                        param1 = (float)this.field_g;
                        break L4;
                      }
                    }
                    L5: {
                      if (param2 <= (float)this.field_g) {
                        break L5;
                      } else {
                        param2 = (float)this.field_g;
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
                            param0 = (float)this.field_k[(int)param0];
                            L9: while (true) {
                              param2 = param2 - 1.0f;
                              if (param2 < 0.0f) {
                                L10: while (true) {
                                  param1 = param1 - 1.0f;
                                  if (param1 < 0.0f) {
                                    return;
                                  } else {
                                    this.a(this.field_e, this.field_h, (int)param0, 0, 0, (int)param5, (int)param3, param6, var29, var37, var31, var38, var33, var39, var35);
                                    param5 = param5 + var25;
                                    param3 = param3 + var26;
                                    param6 = param6 + var30;
                                    var37 = var37 + var32;
                                    var38 = var38 + var34;
                                    var39 = var39 + var36;
                                    param0 = param0 + (float)this.field_m;
                                    continue L10;
                                  }
                                }
                              } else {
                                this.a(this.field_e, this.field_h, (int)param0, 0, 0, (int)param4, (int)param3, param6, var29, var37, var31, var38, var33, var39, var35);
                                param4 = param4 + var27;
                                param3 = param3 + var26;
                                param6 = param6 + var30;
                                var37 = var37 + var32;
                                var38 = var38 + var34;
                                var39 = var39 + var36;
                                param0 = param0 + (float)this.field_m;
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
                          param0 = (float)this.field_k[(int)param0];
                          L11: while (true) {
                            param2 = param2 - 1.0f;
                            if (param2 < 0.0f) {
                              L12: while (true) {
                                param1 = param1 - 1.0f;
                                if (param1 < 0.0f) {
                                  return;
                                } else {
                                  this.a(this.field_e, this.field_h, (int)param0, 0, 0, (int)param5, (int)param3, param6, var29, var37, var31, var38, var33, var39, var35);
                                  param5 = param5 + var25;
                                  param3 = param3 + var26;
                                  param6 = param6 + var30;
                                  var37 = var37 + var32;
                                  var38 = var38 + var34;
                                  var39 = var39 + var36;
                                  param0 = param0 + (float)this.field_m;
                                  continue L12;
                                }
                              }
                            } else {
                              this.a(this.field_e, this.field_h, (int)param0, 0, 0, (int)param4, (int)param3, param6, var29, var37, var31, var38, var33, var39, var35);
                              param4 = param4 + var27;
                              param3 = param3 + var26;
                              param6 = param6 + var30;
                              var37 = var37 + var32;
                              var38 = var38 + var34;
                              var39 = var39 + var36;
                              param0 = param0 + (float)this.field_m;
                              continue L11;
                            }
                          }
                        } else {
                          param1 = param1 - param2;
                          param2 = param2 - param0;
                          param0 = (float)this.field_k[(int)param0];
                          L13: while (true) {
                            param2 = param2 - 1.0f;
                            if (param2 < 0.0f) {
                              L14: while (true) {
                                param1 = param1 - 1.0f;
                                if (param1 < 0.0f) {
                                  return;
                                } else {
                                  this.a(this.field_e, this.field_h, (int)param0, 0, 0, (int)param3, (int)param5, param6, var29, var37, var31, var38, var33, var39, var35);
                                  param5 = param5 + var25;
                                  param3 = param3 + var26;
                                  param6 = param6 + var30;
                                  var37 = var37 + var32;
                                  var38 = var38 + var34;
                                  var39 = var39 + var36;
                                  param0 = param0 + (float)this.field_m;
                                  continue L14;
                                }
                              }
                            } else {
                              this.a(this.field_e, this.field_h, (int)param0, 0, 0, (int)param3, (int)param4, param6, var29, var37, var31, var38, var33, var39, var35);
                              param4 = param4 + var27;
                              param3 = param3 + var26;
                              param6 = param6 + var30;
                              var37 = var37 + var32;
                              var38 = var38 + var34;
                              var39 = var39 + var36;
                              param0 = param0 + (float)this.field_m;
                              continue L13;
                            }
                          }
                        }
                      } else {
                        param1 = param1 - param2;
                        param2 = param2 - param0;
                        param0 = (float)this.field_k[(int)param0];
                        L15: while (true) {
                          param2 = param2 - 1.0f;
                          if (param2 < 0.0f) {
                            L16: while (true) {
                              param1 = param1 - 1.0f;
                              if (param1 < 0.0f) {
                                return;
                              } else {
                                this.a(this.field_e, this.field_h, (int)param0, 0, 0, (int)param3, (int)param5, param6, var29, var37, var31, var38, var33, var39, var35);
                                param5 = param5 + var25;
                                param3 = param3 + var26;
                                param6 = param6 + var30;
                                var37 = var37 + var32;
                                var38 = var38 + var34;
                                var39 = var39 + var36;
                                param0 = param0 + (float)this.field_m;
                                continue L16;
                              }
                            }
                          } else {
                            this.a(this.field_e, this.field_h, (int)param0, 0, 0, (int)param3, (int)param4, param6, var29, var37, var31, var38, var33, var39, var35);
                            param4 = param4 + var27;
                            param3 = param3 + var26;
                            param6 = param6 + var30;
                            var37 = var37 + var32;
                            var38 = var38 + var34;
                            var39 = var39 + var36;
                            param0 = param0 + (float)this.field_m;
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
                            param0 = (float)this.field_k[(int)param0];
                            L20: while (true) {
                              param1 = param1 - 1.0f;
                              if (param1 < 0.0f) {
                                L21: while (true) {
                                  param2 = param2 - 1.0f;
                                  if (param2 < 0.0f) {
                                    return;
                                  } else {
                                    this.a(this.field_e, this.field_h, (int)param0, 0, 0, (int)param5, (int)param4, param6, var29, var37, var31, var38, var33, var39, var35);
                                    param5 = param5 + var27;
                                    param4 = param4 + var25;
                                    param6 = param6 + var30;
                                    var37 = var37 + var32;
                                    var38 = var38 + var34;
                                    var39 = var39 + var36;
                                    param0 = param0 + (float)this.field_m;
                                    continue L21;
                                  }
                                }
                              } else {
                                this.a(this.field_e, this.field_h, (int)param0, 0, 0, (int)param5, (int)param3, param6, var29, var37, var31, var38, var33, var39, var35);
                                param5 = param5 + var27;
                                param3 = param3 + var26;
                                param6 = param6 + var30;
                                var37 = var37 + var32;
                                var38 = var38 + var34;
                                var39 = var39 + var36;
                                param0 = param0 + (float)this.field_m;
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
                          param0 = (float)this.field_k[(int)param0];
                          L22: while (true) {
                            param1 = param1 - 1.0f;
                            if (param1 < 0.0f) {
                              L23: while (true) {
                                param2 = param2 - 1.0f;
                                if (param2 < 0.0f) {
                                  return;
                                } else {
                                  this.a(this.field_e, this.field_h, (int)param0, 0, 0, (int)param5, (int)param4, param6, var29, var37, var31, var38, var33, var39, var35);
                                  param5 = param5 + var27;
                                  param4 = param4 + var25;
                                  param6 = param6 + var30;
                                  var37 = var37 + var32;
                                  var38 = var38 + var34;
                                  var39 = var39 + var36;
                                  param0 = param0 + (float)this.field_m;
                                  continue L23;
                                }
                              }
                            } else {
                              this.a(this.field_e, this.field_h, (int)param0, 0, 0, (int)param5, (int)param3, param6, var29, var37, var31, var38, var33, var39, var35);
                              param5 = param5 + var27;
                              param3 = param3 + var26;
                              param6 = param6 + var30;
                              var37 = var37 + var32;
                              var38 = var38 + var34;
                              var39 = var39 + var36;
                              param0 = param0 + (float)this.field_m;
                              continue L22;
                            }
                          }
                        } else {
                          param2 = param2 - param1;
                          param1 = param1 - param0;
                          param0 = (float)this.field_k[(int)param0];
                          L24: while (true) {
                            param1 = param1 - 1.0f;
                            if (param1 < 0.0f) {
                              L25: while (true) {
                                param2 = param2 - 1.0f;
                                if (param2 < 0.0f) {
                                  return;
                                } else {
                                  this.a(this.field_e, this.field_h, (int)param0, 0, 0, (int)param4, (int)param5, param6, var29, var37, var31, var38, var33, var39, var35);
                                  param5 = param5 + var27;
                                  param4 = param4 + var25;
                                  param6 = param6 + var30;
                                  var37 = var37 + var32;
                                  var38 = var38 + var34;
                                  var39 = var39 + var36;
                                  param0 = param0 + (float)this.field_m;
                                  continue L25;
                                }
                              }
                            } else {
                              this.a(this.field_e, this.field_h, (int)param0, 0, 0, (int)param3, (int)param5, param6, var29, var37, var31, var38, var33, var39, var35);
                              param5 = param5 + var27;
                              param3 = param3 + var26;
                              param6 = param6 + var30;
                              var37 = var37 + var32;
                              var38 = var38 + var34;
                              var39 = var39 + var36;
                              param0 = param0 + (float)this.field_m;
                              continue L24;
                            }
                          }
                        }
                      } else {
                        param2 = param2 - param1;
                        param1 = param1 - param0;
                        param0 = (float)this.field_k[(int)param0];
                        L26: while (true) {
                          param1 = param1 - 1.0f;
                          if (param1 < 0.0f) {
                            L27: while (true) {
                              param2 = param2 - 1.0f;
                              if (param2 < 0.0f) {
                                return;
                              } else {
                                this.a(this.field_e, this.field_h, (int)param0, 0, 0, (int)param4, (int)param5, param6, var29, var37, var31, var38, var33, var39, var35);
                                param5 = param5 + var27;
                                param4 = param4 + var25;
                                param6 = param6 + var30;
                                var37 = var37 + var32;
                                var38 = var38 + var34;
                                var39 = var39 + var36;
                                param0 = param0 + (float)this.field_m;
                                continue L27;
                              }
                            }
                          } else {
                            this.a(this.field_e, this.field_h, (int)param0, 0, 0, (int)param3, (int)param5, param6, var29, var37, var31, var38, var33, var39, var35);
                            param5 = param5 + var27;
                            param3 = param3 + var26;
                            param6 = param6 + var30;
                            var37 = var37 + var32;
                            var38 = var38 + var34;
                            var39 = var39 + var36;
                            param0 = param0 + (float)this.field_m;
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
              if (param2 < (float)this.field_g) {
                L28: {
                  if (param0 <= (float)this.field_g) {
                    break L28;
                  } else {
                    param0 = (float)this.field_g;
                    break L28;
                  }
                }
                L29: {
                  if (param1 <= (float)this.field_g) {
                    break L29;
                  } else {
                    param1 = (float)this.field_g;
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
                    param2 = (float)this.field_k[(int)param2];
                    L32: while (true) {
                      param1 = param1 - 1.0f;
                      if (param1 < 0.0f) {
                        L33: while (true) {
                          param0 = param0 - 1.0f;
                          if (param0 < 0.0f) {
                            return;
                          } else {
                            this.a(this.field_e, this.field_h, (int)param2, 0, 0, (int)param4, (int)param5, param8, var29, var37, var31, var38, var33, var39, var35);
                            param4 = param4 + var26;
                            param5 = param5 + var27;
                            param8 = param8 + var30;
                            var37 = var37 + var32;
                            var38 = var38 + var34;
                            var39 = var39 + var36;
                            param2 = param2 + (float)this.field_m;
                            continue L33;
                          }
                        }
                      } else {
                        this.a(this.field_e, this.field_h, (int)param2, 0, 0, (int)param3, (int)param5, param8, var29, var37, var31, var38, var33, var39, var35);
                        param3 = param3 + var25;
                        param5 = param5 + var27;
                        param8 = param8 + var30;
                        var37 = var37 + var32;
                        var38 = var38 + var34;
                        var39 = var39 + var36;
                        param2 = param2 + (float)this.field_m;
                        continue L32;
                      }
                    }
                  } else {
                    param0 = param0 - param1;
                    param1 = param1 - param2;
                    param2 = (float)this.field_k[(int)param2];
                    L34: while (true) {
                      param1 = param1 - 1.0f;
                      if (param1 < 0.0f) {
                        L35: while (true) {
                          param0 = param0 - 1.0f;
                          if (param0 < 0.0f) {
                            return;
                          } else {
                            this.a(this.field_e, this.field_h, (int)param2, 0, 0, (int)param5, (int)param4, param8, var29, var37, var31, var38, var33, var39, var35);
                            param4 = param4 + var26;
                            param5 = param5 + var27;
                            param8 = param8 + var30;
                            var37 = var37 + var32;
                            var38 = var38 + var34;
                            var39 = var39 + var36;
                            param2 = param2 + (float)this.field_m;
                            continue L35;
                          }
                        }
                      } else {
                        this.a(this.field_e, this.field_h, (int)param2, 0, 0, (int)param5, (int)param3, param8, var29, var37, var31, var38, var33, var39, var35);
                        param3 = param3 + var25;
                        param5 = param5 + var27;
                        param8 = param8 + var30;
                        var37 = var37 + var32;
                        var38 = var38 + var34;
                        var39 = var39 + var36;
                        param2 = param2 + (float)this.field_m;
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
                    param2 = (float)this.field_k[(int)param2];
                    L38: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        L39: while (true) {
                          param1 = param1 - 1.0f;
                          if (param1 < 0.0f) {
                            return;
                          } else {
                            this.a(this.field_e, this.field_h, (int)param2, 0, 0, (int)param4, (int)param3, param8, var29, var37, var31, var38, var33, var39, var35);
                            param4 = param4 + var25;
                            param3 = param3 + var26;
                            param8 = param8 + var30;
                            var37 = var37 + var32;
                            var38 = var38 + var34;
                            var39 = var39 + var36;
                            param2 = param2 + (float)this.field_m;
                            continue L39;
                          }
                        }
                      } else {
                        this.a(this.field_e, this.field_h, (int)param2, 0, 0, (int)param4, (int)param5, param8, var29, var37, var31, var38, var33, var39, var35);
                        param4 = param4 + var25;
                        param5 = param5 + var27;
                        param8 = param8 + var30;
                        var37 = var37 + var32;
                        var38 = var38 + var34;
                        var39 = var39 + var36;
                        param2 = param2 + (float)this.field_m;
                        continue L38;
                      }
                    }
                  } else {
                    param1 = param1 - param0;
                    param0 = param0 - param2;
                    param2 = (float)this.field_k[(int)param2];
                    L40: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        L41: while (true) {
                          param1 = param1 - 1.0f;
                          if (param1 < 0.0f) {
                            return;
                          } else {
                            this.a(this.field_e, this.field_h, (int)param2, 0, 0, (int)param3, (int)param4, param8, var29, var37, var31, var38, var33, var39, var35);
                            param4 = param4 + var25;
                            param3 = param3 + var26;
                            param8 = param8 + var30;
                            var37 = var37 + var32;
                            var38 = var38 + var34;
                            var39 = var39 + var36;
                            param2 = param2 + (float)this.field_m;
                            continue L41;
                          }
                        }
                      } else {
                        this.a(this.field_e, this.field_h, (int)param2, 0, 0, (int)param5, (int)param4, param8, var29, var37, var31, var38, var33, var39, var35);
                        param4 = param4 + var25;
                        param5 = param5 + var27;
                        param8 = param8 + var30;
                        var37 = var37 + var32;
                        var38 = var38 + var34;
                        var39 = var39 + var36;
                        param2 = param2 + (float)this.field_m;
                        continue L40;
                      }
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              if (param1 < (float)this.field_g) {
                L42: {
                  if (param2 <= (float)this.field_g) {
                    break L42;
                  } else {
                    param2 = (float)this.field_g;
                    break L42;
                  }
                }
                L43: {
                  if (param0 <= (float)this.field_g) {
                    break L43;
                  } else {
                    param0 = (float)this.field_g;
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
                    param1 = (float)this.field_k[(int)param1];
                    L46: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        L47: while (true) {
                          param2 = param2 - 1.0f;
                          if (param2 < 0.0f) {
                            return;
                          } else {
                            this.a(this.field_e, this.field_h, (int)param1, 0, 0, (int)param3, (int)param4, param7, var29, var37, var31, var38, var33, var39, var35);
                            param3 = param3 + var27;
                            param4 = param4 + var25;
                            param7 = param7 + var30;
                            var37 = var37 + var32;
                            var38 = var38 + var34;
                            var39 = var39 + var36;
                            param1 = param1 + (float)this.field_m;
                            continue L47;
                          }
                        }
                      } else {
                        this.a(this.field_e, this.field_h, (int)param1, 0, 0, (int)param5, (int)param4, param7, var29, var37, var31, var38, var33, var39, var35);
                        param5 = param5 + var26;
                        param4 = param4 + var25;
                        param7 = param7 + var30;
                        var37 = var37 + var32;
                        var38 = var38 + var34;
                        var39 = var39 + var36;
                        param1 = param1 + (float)this.field_m;
                        continue L46;
                      }
                    }
                  } else {
                    param2 = param2 - param0;
                    param0 = param0 - param1;
                    param1 = (float)this.field_k[(int)param1];
                    L48: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        L49: while (true) {
                          param2 = param2 - 1.0f;
                          if (param2 < 0.0f) {
                            return;
                          } else {
                            this.a(this.field_e, this.field_h, (int)param1, 0, 0, (int)param4, (int)param3, param7, var29, var37, var31, var38, var33, var39, var35);
                            param3 = param3 + var27;
                            param4 = param4 + var25;
                            param7 = param7 + var30;
                            var37 = var37 + var32;
                            var38 = var38 + var34;
                            var39 = var39 + var36;
                            param1 = param1 + (float)this.field_m;
                            continue L49;
                          }
                        }
                      } else {
                        this.a(this.field_e, this.field_h, (int)param1, 0, 0, (int)param4, (int)param5, param7, var29, var37, var31, var38, var33, var39, var35);
                        param5 = param5 + var26;
                        param4 = param4 + var25;
                        param7 = param7 + var30;
                        var37 = var37 + var32;
                        var38 = var38 + var34;
                        var39 = var39 + var36;
                        param1 = param1 + (float)this.field_m;
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
                        param1 = (float)this.field_k[(int)param1];
                        L53: while (true) {
                          param2 = param2 - 1.0f;
                          if (param2 < 0.0f) {
                            L54: while (true) {
                              param0 = param0 - 1.0f;
                              if (param0 < 0.0f) {
                                return;
                              } else {
                                this.a(this.field_e, this.field_h, (int)param1, 0, 0, (int)param3, (int)param5, param7, var29, var37, var31, var38, var33, var39, var35);
                                param3 = param3 + var26;
                                param5 = param5 + var27;
                                param7 = param7 + var30;
                                var37 = var37 + var32;
                                var38 = var38 + var34;
                                var39 = var39 + var36;
                                param1 = param1 + (float)this.field_m;
                                continue L54;
                              }
                            }
                          } else {
                            this.a(this.field_e, this.field_h, (int)param1, 0, 0, (int)param3, (int)param4, param7, var29, var37, var31, var38, var33, var39, var35);
                            param3 = param3 + var26;
                            param4 = param4 + var25;
                            param7 = param7 + var30;
                            var37 = var37 + var32;
                            var38 = var38 + var34;
                            var39 = var39 + var36;
                            param1 = param1 + (float)this.field_m;
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
                      param1 = (float)this.field_k[(int)param1];
                      L55: while (true) {
                        param2 = param2 - 1.0f;
                        if (param2 < 0.0f) {
                          L56: while (true) {
                            param0 = param0 - 1.0f;
                            if (param0 < 0.0f) {
                              return;
                            } else {
                              this.a(this.field_e, this.field_h, (int)param1, 0, 0, (int)param3, (int)param5, param7, var29, var37, var31, var38, var33, var39, var35);
                              param3 = param3 + var26;
                              param5 = param5 + var27;
                              param7 = param7 + var30;
                              var37 = var37 + var32;
                              var38 = var38 + var34;
                              var39 = var39 + var36;
                              param1 = param1 + (float)this.field_m;
                              continue L56;
                            }
                          }
                        } else {
                          this.a(this.field_e, this.field_h, (int)param1, 0, 0, (int)param3, (int)param4, param7, var29, var37, var31, var38, var33, var39, var35);
                          param3 = param3 + var26;
                          param4 = param4 + var25;
                          param7 = param7 + var30;
                          var37 = var37 + var32;
                          var38 = var38 + var34;
                          var39 = var39 + var36;
                          param1 = param1 + (float)this.field_m;
                          continue L55;
                        }
                      }
                    } else {
                      param0 = param0 - param2;
                      param2 = param2 - param1;
                      param1 = (float)this.field_k[(int)param1];
                      L57: while (true) {
                        param2 = param2 - 1.0f;
                        if (param2 < 0.0f) {
                          L58: while (true) {
                            param0 = param0 - 1.0f;
                            if (param0 < 0.0f) {
                              return;
                            } else {
                              this.a(this.field_e, this.field_h, (int)param1, 0, 0, (int)param5, (int)param3, param7, var29, var37, var31, var38, var33, var39, var35);
                              param3 = param3 + var26;
                              param5 = param5 + var27;
                              param7 = param7 + var30;
                              var37 = var37 + var32;
                              var38 = var38 + var34;
                              var39 = var39 + var36;
                              param1 = param1 + (float)this.field_m;
                              continue L58;
                            }
                          }
                        } else {
                          this.a(this.field_e, this.field_h, (int)param1, 0, 0, (int)param4, (int)param3, param7, var29, var37, var31, var38, var33, var39, var35);
                          param3 = param3 + var26;
                          param4 = param4 + var25;
                          param7 = param7 + var30;
                          var37 = var37 + var32;
                          var38 = var38 + var34;
                          var39 = var39 + var36;
                          param1 = param1 + (float)this.field_m;
                          continue L57;
                        }
                      }
                    }
                  } else {
                    param0 = param0 - param2;
                    param2 = param2 - param1;
                    param1 = (float)this.field_k[(int)param1];
                    L59: while (true) {
                      param2 = param2 - 1.0f;
                      if (param2 < 0.0f) {
                        L60: while (true) {
                          param0 = param0 - 1.0f;
                          if (param0 < 0.0f) {
                            return;
                          } else {
                            this.a(this.field_e, this.field_h, (int)param1, 0, 0, (int)param5, (int)param3, param7, var29, var37, var31, var38, var33, var39, var35);
                            param3 = param3 + var26;
                            param5 = param5 + var27;
                            param7 = param7 + var30;
                            var37 = var37 + var32;
                            var38 = var38 + var34;
                            var39 = var39 + var36;
                            param1 = param1 + (float)this.field_m;
                            continue L60;
                          }
                        }
                      } else {
                        this.a(this.field_e, this.field_h, (int)param1, 0, 0, (int)param4, (int)param3, param7, var29, var37, var31, var38, var33, var39, var35);
                        param3 = param3 + var26;
                        param4 = param4 + var25;
                        param7 = param7 + var30;
                        var37 = var37 + var32;
                        var38 = var38 + var34;
                        var39 = var39 + var36;
                        param1 = param1 + (float)this.field_m;
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
          this.field_f.c((int)param4, 1, -16777216 | param9, (int)param1, (int)param3, (int)param0);
          this.field_f.c((int)param5, 1, -16777216 | param9, (int)param2, (int)param4, (int)param1);
          this.field_f.c((int)param3, 1, -16777216 | param9, (int)param0, (int)param5, (int)param2);
          return;
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
                    if (!this.field_n) {
                        statePc = 5;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (param6 <= this.field_b) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    param6 = this.field_b;
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
                    if (!this.field_i) {
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
                    if (this.field_a != 0) {
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
                    if (this.field_d) {
                        statePc = 16;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var16_int = this.field_a;
                    var17 = 256 - this.field_a;
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
                    if (this.field_a != 0) {
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
                    if (this.field_d) {
                        statePc = 33;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var16_int = this.field_a;
                    var17 = 256 - this.field_a;
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
                    if (!this.field_c.field_f) {
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
                    if (this.field_a != 0) {
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
                    if (this.field_d) {
                        statePc = 77;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    var16_int = this.field_a;
                    var17 = 256 - this.field_a;
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
                    if (this.field_a != 0) {
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
                    if (this.field_d) {
                        statePc = 104;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    var16_int = this.field_a;
                    var17 = 256 - this.field_a;
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
                    if (this.field_a != 0) {
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
                    if (this.field_d) {
                        statePc = 144;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    var16_int = this.field_a;
                    var17 = 256 - this.field_a;
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
                    if (this.field_a != 0) {
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
                    if (this.field_d) {
                        statePc = 171;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    var16_int = this.field_a;
                    var17 = 256 - this.field_a;
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

    final int b() {
        return this.field_k[0] / this.field_m;
    }

    daa(sob param0, co param1) {
        this.field_k = new int[4096];
        this.field_i = false;
        this.field_l = false;
        this.field_n = false;
        this.field_d = false;
        this.field_j = true;
        this.field_a = 0;
        this.field_f = param0;
        this.field_c = param1;
        this.field_m = this.field_f.field_i;
        this.field_e = this.field_f.field_k;
        this.field_h = this.field_f.field_r;
    }
}
