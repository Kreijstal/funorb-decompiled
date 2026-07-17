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
        if (!((daa) this).field_l) {
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
                  if (param0 < (float)((daa) this).field_g) {
                    L4: {
                      if (param1 <= (float)((daa) this).field_g) {
                        break L4;
                      } else {
                        param1 = (float)((daa) this).field_g;
                        break L4;
                      }
                    }
                    L5: {
                      if (param2 <= (float)((daa) this).field_g) {
                        break L5;
                      } else {
                        param2 = (float)((daa) this).field_g;
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
                            param0 = (float)((daa) this).field_k[(int)param0];
                            L9: while (true) {
                              param2 = param2 - 1.0f;
                              if (param2 < 0.0f) {
                                L10: while (true) {
                                  param1 = param1 - 1.0f;
                                  if (param1 < 0.0f) {
                                    return;
                                  } else {
                                    this.a(((daa) this).field_e, ((daa) this).field_h, (int)param0, param9, 0, (int)param5, (int)param3, param6, var21);
                                    param5 = param5 + var18;
                                    param3 = param3 + var17;
                                    param6 = param6 + var22;
                                    param0 = param0 + (float)((daa) this).field_m;
                                    continue L10;
                                  }
                                }
                              } else {
                                this.a(((daa) this).field_e, ((daa) this).field_h, (int)param0, param9, 0, (int)param4, (int)param3, param6, var21);
                                param4 = param4 + var19;
                                param3 = param3 + var17;
                                param6 = param6 + var22;
                                param0 = param0 + (float)((daa) this).field_m;
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
                          param0 = (float)((daa) this).field_k[(int)param0];
                          L11: while (true) {
                            param2 = param2 - 1.0f;
                            if (param2 < 0.0f) {
                              L12: while (true) {
                                param1 = param1 - 1.0f;
                                if (param1 < 0.0f) {
                                  return;
                                } else {
                                  this.a(((daa) this).field_e, ((daa) this).field_h, (int)param0, param9, 0, (int)param5, (int)param3, param6, var21);
                                  param5 = param5 + var18;
                                  param3 = param3 + var17;
                                  param6 = param6 + var22;
                                  param0 = param0 + (float)((daa) this).field_m;
                                  continue L12;
                                }
                              }
                            } else {
                              this.a(((daa) this).field_e, ((daa) this).field_h, (int)param0, param9, 0, (int)param4, (int)param3, param6, var21);
                              param4 = param4 + var19;
                              param3 = param3 + var17;
                              param6 = param6 + var22;
                              param0 = param0 + (float)((daa) this).field_m;
                              continue L11;
                            }
                          }
                        } else {
                          param1 = param1 - param2;
                          param2 = param2 - param0;
                          param0 = (float)((daa) this).field_k[(int)param0];
                          L13: while (true) {
                            param2 = param2 - 1.0f;
                            if (param2 < 0.0f) {
                              L14: while (true) {
                                param1 = param1 - 1.0f;
                                if (param1 < 0.0f) {
                                  return;
                                } else {
                                  this.a(((daa) this).field_e, ((daa) this).field_h, (int)param0, param9, 0, (int)param3, (int)param5, param6, var21);
                                  param5 = param5 + var18;
                                  param3 = param3 + var17;
                                  param6 = param6 + var22;
                                  param0 = param0 + (float)((daa) this).field_m;
                                  continue L14;
                                }
                              }
                            } else {
                              this.a(((daa) this).field_e, ((daa) this).field_h, (int)param0, param9, 0, (int)param3, (int)param4, param6, var21);
                              param4 = param4 + var19;
                              param3 = param3 + var17;
                              param6 = param6 + var22;
                              param0 = param0 + (float)((daa) this).field_m;
                              continue L13;
                            }
                          }
                        }
                      } else {
                        param1 = param1 - param2;
                        param2 = param2 - param0;
                        param0 = (float)((daa) this).field_k[(int)param0];
                        L15: while (true) {
                          param2 = param2 - 1.0f;
                          if (param2 < 0.0f) {
                            L16: while (true) {
                              param1 = param1 - 1.0f;
                              if (param1 < 0.0f) {
                                return;
                              } else {
                                this.a(((daa) this).field_e, ((daa) this).field_h, (int)param0, param9, 0, (int)param3, (int)param5, param6, var21);
                                param5 = param5 + var18;
                                param3 = param3 + var17;
                                param6 = param6 + var22;
                                param0 = param0 + (float)((daa) this).field_m;
                                continue L16;
                              }
                            }
                          } else {
                            this.a(((daa) this).field_e, ((daa) this).field_h, (int)param0, param9, 0, (int)param3, (int)param4, param6, var21);
                            param4 = param4 + var19;
                            param3 = param3 + var17;
                            param6 = param6 + var22;
                            param0 = param0 + (float)((daa) this).field_m;
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
                            param0 = (float)((daa) this).field_k[(int)param0];
                            L20: while (true) {
                              param1 = param1 - 1.0f;
                              if (param1 < 0.0f) {
                                L21: while (true) {
                                  param2 = param2 - 1.0f;
                                  if (param2 < 0.0f) {
                                    return;
                                  } else {
                                    this.a(((daa) this).field_e, ((daa) this).field_h, (int)param0, param9, 0, (int)param5, (int)param4, param6, var21);
                                    param5 = param5 + var19;
                                    param4 = param4 + var18;
                                    param6 = param6 + var22;
                                    param0 = param0 + (float)((daa) this).field_m;
                                    continue L21;
                                  }
                                }
                              } else {
                                this.a(((daa) this).field_e, ((daa) this).field_h, (int)param0, param9, 0, (int)param5, (int)param3, param6, var21);
                                param5 = param5 + var19;
                                param3 = param3 + var17;
                                param6 = param6 + var22;
                                param0 = param0 + (float)((daa) this).field_m;
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
                          param0 = (float)((daa) this).field_k[(int)param0];
                          L22: while (true) {
                            param1 = param1 - 1.0f;
                            if (param1 < 0.0f) {
                              L23: while (true) {
                                param2 = param2 - 1.0f;
                                if (param2 < 0.0f) {
                                  return;
                                } else {
                                  this.a(((daa) this).field_e, ((daa) this).field_h, (int)param0, param9, 0, (int)param5, (int)param4, param6, var21);
                                  param5 = param5 + var19;
                                  param4 = param4 + var18;
                                  param6 = param6 + var22;
                                  param0 = param0 + (float)((daa) this).field_m;
                                  continue L23;
                                }
                              }
                            } else {
                              this.a(((daa) this).field_e, ((daa) this).field_h, (int)param0, param9, 0, (int)param5, (int)param3, param6, var21);
                              param5 = param5 + var19;
                              param3 = param3 + var17;
                              param6 = param6 + var22;
                              param0 = param0 + (float)((daa) this).field_m;
                              continue L22;
                            }
                          }
                        } else {
                          param2 = param2 - param1;
                          param1 = param1 - param0;
                          param0 = (float)((daa) this).field_k[(int)param0];
                          L24: while (true) {
                            param1 = param1 - 1.0f;
                            if (param1 < 0.0f) {
                              L25: while (true) {
                                param2 = param2 - 1.0f;
                                if (param2 < 0.0f) {
                                  return;
                                } else {
                                  this.a(((daa) this).field_e, ((daa) this).field_h, (int)param0, param9, 0, (int)param4, (int)param5, param6, var21);
                                  param5 = param5 + var19;
                                  param4 = param4 + var18;
                                  param6 = param6 + var22;
                                  param0 = param0 + (float)((daa) this).field_m;
                                  continue L25;
                                }
                              }
                            } else {
                              this.a(((daa) this).field_e, ((daa) this).field_h, (int)param0, param9, 0, (int)param3, (int)param5, param6, var21);
                              param5 = param5 + var19;
                              param3 = param3 + var17;
                              param6 = param6 + var22;
                              param0 = param0 + (float)((daa) this).field_m;
                              continue L24;
                            }
                          }
                        }
                      } else {
                        param2 = param2 - param1;
                        param1 = param1 - param0;
                        param0 = (float)((daa) this).field_k[(int)param0];
                        L26: while (true) {
                          param1 = param1 - 1.0f;
                          if (param1 < 0.0f) {
                            L27: while (true) {
                              param2 = param2 - 1.0f;
                              if (param2 < 0.0f) {
                                return;
                              } else {
                                this.a(((daa) this).field_e, ((daa) this).field_h, (int)param0, param9, 0, (int)param4, (int)param5, param6, var21);
                                param5 = param5 + var19;
                                param4 = param4 + var18;
                                param6 = param6 + var22;
                                param0 = param0 + (float)((daa) this).field_m;
                                continue L27;
                              }
                            }
                          } else {
                            this.a(((daa) this).field_e, ((daa) this).field_h, (int)param0, param9, 0, (int)param3, (int)param5, param6, var21);
                            param5 = param5 + var19;
                            param3 = param3 + var17;
                            param6 = param6 + var22;
                            param0 = param0 + (float)((daa) this).field_m;
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
              if (param2 < (float)((daa) this).field_g) {
                L28: {
                  if (param0 <= (float)((daa) this).field_g) {
                    break L28;
                  } else {
                    param0 = (float)((daa) this).field_g;
                    break L28;
                  }
                }
                L29: {
                  if (param1 <= (float)((daa) this).field_g) {
                    break L29;
                  } else {
                    param1 = (float)((daa) this).field_g;
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
                    param2 = (float)((daa) this).field_k[(int)param2];
                    L32: while (true) {
                      param1 = param1 - 1.0f;
                      if (param1 < 0.0f) {
                        L33: while (true) {
                          param0 = param0 - 1.0f;
                          if (param0 < 0.0f) {
                            return;
                          } else {
                            this.a(((daa) this).field_e, ((daa) this).field_h, (int)param2, param9, 0, (int)param4, (int)param5, param8, var21);
                            param4 = param4 + var17;
                            param5 = param5 + var19;
                            param8 = param8 + var22;
                            param2 = param2 + (float)((daa) this).field_m;
                            continue L33;
                          }
                        }
                      } else {
                        this.a(((daa) this).field_e, ((daa) this).field_h, (int)param2, param9, 0, (int)param3, (int)param5, param8, var21);
                        param3 = param3 + var18;
                        param5 = param5 + var19;
                        param8 = param8 + var22;
                        param2 = param2 + (float)((daa) this).field_m;
                        continue L32;
                      }
                    }
                  } else {
                    param0 = param0 - param1;
                    param1 = param1 - param2;
                    param2 = (float)((daa) this).field_k[(int)param2];
                    L34: while (true) {
                      param1 = param1 - 1.0f;
                      if (param1 < 0.0f) {
                        L35: while (true) {
                          param0 = param0 - 1.0f;
                          if (param0 < 0.0f) {
                            return;
                          } else {
                            this.a(((daa) this).field_e, ((daa) this).field_h, (int)param2, param9, 0, (int)param5, (int)param4, param8, var21);
                            param4 = param4 + var17;
                            param5 = param5 + var19;
                            param8 = param8 + var22;
                            param2 = param2 + (float)((daa) this).field_m;
                            continue L35;
                          }
                        }
                      } else {
                        this.a(((daa) this).field_e, ((daa) this).field_h, (int)param2, param9, 0, (int)param5, (int)param3, param8, var21);
                        param3 = param3 + var18;
                        param5 = param5 + var19;
                        param8 = param8 + var22;
                        param2 = param2 + (float)((daa) this).field_m;
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
                    param2 = (float)((daa) this).field_k[(int)param2];
                    L38: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        L39: while (true) {
                          param1 = param1 - 1.0f;
                          if (param1 < 0.0f) {
                            return;
                          } else {
                            this.a(((daa) this).field_e, ((daa) this).field_h, (int)param2, param9, 0, (int)param4, (int)param3, param8, var21);
                            param4 = param4 + var18;
                            param3 = param3 + var17;
                            param8 = param8 + var22;
                            param2 = param2 + (float)((daa) this).field_m;
                            continue L39;
                          }
                        }
                      } else {
                        this.a(((daa) this).field_e, ((daa) this).field_h, (int)param2, param9, 0, (int)param4, (int)param5, param8, var21);
                        param4 = param4 + var18;
                        param5 = param5 + var19;
                        param8 = param8 + var22;
                        param2 = param2 + (float)((daa) this).field_m;
                        continue L38;
                      }
                    }
                  } else {
                    param1 = param1 - param0;
                    param0 = param0 - param2;
                    param2 = (float)((daa) this).field_k[(int)param2];
                    L40: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        L41: while (true) {
                          param1 = param1 - 1.0f;
                          if (param1 < 0.0f) {
                            return;
                          } else {
                            this.a(((daa) this).field_e, ((daa) this).field_h, (int)param2, param9, 0, (int)param3, (int)param4, param8, var21);
                            param4 = param4 + var18;
                            param3 = param3 + var17;
                            param8 = param8 + var22;
                            param2 = param2 + (float)((daa) this).field_m;
                            continue L41;
                          }
                        }
                      } else {
                        this.a(((daa) this).field_e, ((daa) this).field_h, (int)param2, param9, 0, (int)param5, (int)param4, param8, var21);
                        param4 = param4 + var18;
                        param5 = param5 + var19;
                        param8 = param8 + var22;
                        param2 = param2 + (float)((daa) this).field_m;
                        continue L40;
                      }
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              if (param1 < (float)((daa) this).field_g) {
                L42: {
                  if (param2 <= (float)((daa) this).field_g) {
                    break L42;
                  } else {
                    param2 = (float)((daa) this).field_g;
                    break L42;
                  }
                }
                L43: {
                  if (param0 <= (float)((daa) this).field_g) {
                    break L43;
                  } else {
                    param0 = (float)((daa) this).field_g;
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
                    param1 = (float)((daa) this).field_k[(int)param1];
                    L46: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        L47: while (true) {
                          param2 = param2 - 1.0f;
                          if (param2 < 0.0f) {
                            return;
                          } else {
                            this.a(((daa) this).field_e, ((daa) this).field_h, (int)param1, param9, 0, (int)param3, (int)param4, param7, var21);
                            param3 = param3 + var19;
                            param4 = param4 + var18;
                            param7 = param7 + var22;
                            param1 = param1 + (float)((daa) this).field_m;
                            continue L47;
                          }
                        }
                      } else {
                        this.a(((daa) this).field_e, ((daa) this).field_h, (int)param1, param9, 0, (int)param5, (int)param4, param7, var21);
                        param5 = param5 + var17;
                        param4 = param4 + var18;
                        param7 = param7 + var22;
                        param1 = param1 + (float)((daa) this).field_m;
                        continue L46;
                      }
                    }
                  } else {
                    param2 = param2 - param0;
                    param0 = param0 - param1;
                    param1 = (float)((daa) this).field_k[(int)param1];
                    L48: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        L49: while (true) {
                          param2 = param2 - 1.0f;
                          if (param2 < 0.0f) {
                            return;
                          } else {
                            this.a(((daa) this).field_e, ((daa) this).field_h, (int)param1, param9, 0, (int)param4, (int)param3, param7, var21);
                            param3 = param3 + var19;
                            param4 = param4 + var18;
                            param7 = param7 + var22;
                            param1 = param1 + (float)((daa) this).field_m;
                            continue L49;
                          }
                        }
                      } else {
                        this.a(((daa) this).field_e, ((daa) this).field_h, (int)param1, param9, 0, (int)param4, (int)param5, param7, var21);
                        param5 = param5 + var17;
                        param4 = param4 + var18;
                        param7 = param7 + var22;
                        param1 = param1 + (float)((daa) this).field_m;
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
                        param1 = (float)((daa) this).field_k[(int)param1];
                        L53: while (true) {
                          param2 = param2 - 1.0f;
                          if (param2 < 0.0f) {
                            L54: while (true) {
                              param0 = param0 - 1.0f;
                              if (param0 < 0.0f) {
                                return;
                              } else {
                                this.a(((daa) this).field_e, ((daa) this).field_h, (int)param1, param9, 0, (int)param3, (int)param5, param7, var21);
                                param3 = param3 + var17;
                                param5 = param5 + var19;
                                param7 = param7 + var22;
                                param1 = param1 + (float)((daa) this).field_m;
                                continue L54;
                              }
                            }
                          } else {
                            this.a(((daa) this).field_e, ((daa) this).field_h, (int)param1, param9, 0, (int)param3, (int)param4, param7, var21);
                            param3 = param3 + var17;
                            param4 = param4 + var18;
                            param7 = param7 + var22;
                            param1 = param1 + (float)((daa) this).field_m;
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
                      param1 = (float)((daa) this).field_k[(int)param1];
                      L55: while (true) {
                        param2 = param2 - 1.0f;
                        if (param2 < 0.0f) {
                          L56: while (true) {
                            param0 = param0 - 1.0f;
                            if (param0 < 0.0f) {
                              return;
                            } else {
                              this.a(((daa) this).field_e, ((daa) this).field_h, (int)param1, param9, 0, (int)param3, (int)param5, param7, var21);
                              param3 = param3 + var17;
                              param5 = param5 + var19;
                              param7 = param7 + var22;
                              param1 = param1 + (float)((daa) this).field_m;
                              continue L56;
                            }
                          }
                        } else {
                          this.a(((daa) this).field_e, ((daa) this).field_h, (int)param1, param9, 0, (int)param3, (int)param4, param7, var21);
                          param3 = param3 + var17;
                          param4 = param4 + var18;
                          param7 = param7 + var22;
                          param1 = param1 + (float)((daa) this).field_m;
                          continue L55;
                        }
                      }
                    } else {
                      param0 = param0 - param2;
                      param2 = param2 - param1;
                      param1 = (float)((daa) this).field_k[(int)param1];
                      L57: while (true) {
                        param2 = param2 - 1.0f;
                        if (param2 < 0.0f) {
                          L58: while (true) {
                            param0 = param0 - 1.0f;
                            if (param0 < 0.0f) {
                              return;
                            } else {
                              this.a(((daa) this).field_e, ((daa) this).field_h, (int)param1, param9, 0, (int)param5, (int)param3, param7, var21);
                              param3 = param3 + var17;
                              param5 = param5 + var19;
                              param7 = param7 + var22;
                              param1 = param1 + (float)((daa) this).field_m;
                              continue L58;
                            }
                          }
                        } else {
                          this.a(((daa) this).field_e, ((daa) this).field_h, (int)param1, param9, 0, (int)param4, (int)param3, param7, var21);
                          param3 = param3 + var17;
                          param4 = param4 + var18;
                          param7 = param7 + var22;
                          param1 = param1 + (float)((daa) this).field_m;
                          continue L57;
                        }
                      }
                    }
                  } else {
                    param0 = param0 - param2;
                    param2 = param2 - param1;
                    param1 = (float)((daa) this).field_k[(int)param1];
                    L59: while (true) {
                      param2 = param2 - 1.0f;
                      if (param2 < 0.0f) {
                        L60: while (true) {
                          param0 = param0 - 1.0f;
                          if (param0 < 0.0f) {
                            return;
                          } else {
                            this.a(((daa) this).field_e, ((daa) this).field_h, (int)param1, param9, 0, (int)param5, (int)param3, param7, var21);
                            param3 = param3 + var17;
                            param5 = param5 + var19;
                            param7 = param7 + var22;
                            param1 = param1 + (float)((daa) this).field_m;
                            continue L60;
                          }
                        }
                      } else {
                        this.a(((daa) this).field_e, ((daa) this).field_h, (int)param1, param9, 0, (int)param4, (int)param3, param7, var21);
                        param3 = param3 + var17;
                        param4 = param4 + var18;
                        param7 = param7 + var22;
                        param1 = param1 + (float)((daa) this).field_m;
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
          ((daa) this).field_f.c((int)param4, 1, param9, (int)param1, (int)param3, (int)param0);
          ((daa) this).field_f.c((int)param5, 1, param9, (int)param2, (int)param4, (int)param1);
          ((daa) this).field_f.c((int)param3, 1, param9, (int)param0, (int)param5, (int)param2);
          return;
        }
    }

    private final void a(int[] param0, float[] param1, int param2, int param3, int param4, int param5, int param6, float param7, float param8) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          if (!((daa) this).field_n) {
            break L0;
          } else {
            L1: {
              if (param6 <= ((daa) this).field_b) {
                break L1;
              } else {
                param6 = ((daa) this).field_b;
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
          if (!((daa) this).field_c.field_f) {
            if (((daa) this).field_a != 0) {
              L2: {
                if (((daa) this).field_a != 254) {
                  var10 = ((daa) this).field_a;
                  var11 = 256 - ((daa) this).field_a;
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
                    if (param6 <= ((daa) this).field_b - 1) {
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
            if (((daa) this).field_a != 0) {
              if (((daa) this).field_a != 254) {
                var10 = ((daa) this).field_a;
                var11 = 256 - ((daa) this).field_a;
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
                  if (param6 <= ((daa) this).field_b - 1) {
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
        return ((daa) this).field_k[0] % ((daa) this).field_m;
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
        if (!((daa) this).field_l) {
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
                  if (param0 < (float)((daa) this).field_g) {
                    L4: {
                      if (param1 <= (float)((daa) this).field_g) {
                        break L4;
                      } else {
                        param1 = (float)((daa) this).field_g;
                        break L4;
                      }
                    }
                    L5: {
                      if (param2 <= (float)((daa) this).field_g) {
                        break L5;
                      } else {
                        param2 = (float)((daa) this).field_g;
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
                            param0 = (float)((daa) this).field_k[(int)param0];
                            L9: while (true) {
                              param2 = param2 - 1.0f;
                              if (param2 < 0.0f) {
                                L10: while (true) {
                                  param1 = param1 - 1.0f;
                                  if (param1 < 0.0f) {
                                    return;
                                  } else {
                                    this.a(((daa) this).field_e, ((daa) this).field_h, (int)param0, 0, 0, (int)param5, (int)param3, param6, var29, var37, var31, var38, var33, var39, var35);
                                    param5 = param5 + var25;
                                    param3 = param3 + var26;
                                    param6 = param6 + var30;
                                    var37 = var37 + var32;
                                    var38 = var38 + var34;
                                    var39 = var39 + var36;
                                    param0 = param0 + (float)((daa) this).field_m;
                                    continue L10;
                                  }
                                }
                              } else {
                                this.a(((daa) this).field_e, ((daa) this).field_h, (int)param0, 0, 0, (int)param4, (int)param3, param6, var29, var37, var31, var38, var33, var39, var35);
                                param4 = param4 + var27;
                                param3 = param3 + var26;
                                param6 = param6 + var30;
                                var37 = var37 + var32;
                                var38 = var38 + var34;
                                var39 = var39 + var36;
                                param0 = param0 + (float)((daa) this).field_m;
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
                          param0 = (float)((daa) this).field_k[(int)param0];
                          L11: while (true) {
                            param2 = param2 - 1.0f;
                            if (param2 < 0.0f) {
                              L12: while (true) {
                                param1 = param1 - 1.0f;
                                if (param1 < 0.0f) {
                                  return;
                                } else {
                                  this.a(((daa) this).field_e, ((daa) this).field_h, (int)param0, 0, 0, (int)param5, (int)param3, param6, var29, var37, var31, var38, var33, var39, var35);
                                  param5 = param5 + var25;
                                  param3 = param3 + var26;
                                  param6 = param6 + var30;
                                  var37 = var37 + var32;
                                  var38 = var38 + var34;
                                  var39 = var39 + var36;
                                  param0 = param0 + (float)((daa) this).field_m;
                                  continue L12;
                                }
                              }
                            } else {
                              this.a(((daa) this).field_e, ((daa) this).field_h, (int)param0, 0, 0, (int)param4, (int)param3, param6, var29, var37, var31, var38, var33, var39, var35);
                              param4 = param4 + var27;
                              param3 = param3 + var26;
                              param6 = param6 + var30;
                              var37 = var37 + var32;
                              var38 = var38 + var34;
                              var39 = var39 + var36;
                              param0 = param0 + (float)((daa) this).field_m;
                              continue L11;
                            }
                          }
                        } else {
                          param1 = param1 - param2;
                          param2 = param2 - param0;
                          param0 = (float)((daa) this).field_k[(int)param0];
                          L13: while (true) {
                            param2 = param2 - 1.0f;
                            if (param2 < 0.0f) {
                              L14: while (true) {
                                param1 = param1 - 1.0f;
                                if (param1 < 0.0f) {
                                  return;
                                } else {
                                  this.a(((daa) this).field_e, ((daa) this).field_h, (int)param0, 0, 0, (int)param3, (int)param5, param6, var29, var37, var31, var38, var33, var39, var35);
                                  param5 = param5 + var25;
                                  param3 = param3 + var26;
                                  param6 = param6 + var30;
                                  var37 = var37 + var32;
                                  var38 = var38 + var34;
                                  var39 = var39 + var36;
                                  param0 = param0 + (float)((daa) this).field_m;
                                  continue L14;
                                }
                              }
                            } else {
                              this.a(((daa) this).field_e, ((daa) this).field_h, (int)param0, 0, 0, (int)param3, (int)param4, param6, var29, var37, var31, var38, var33, var39, var35);
                              param4 = param4 + var27;
                              param3 = param3 + var26;
                              param6 = param6 + var30;
                              var37 = var37 + var32;
                              var38 = var38 + var34;
                              var39 = var39 + var36;
                              param0 = param0 + (float)((daa) this).field_m;
                              continue L13;
                            }
                          }
                        }
                      } else {
                        param1 = param1 - param2;
                        param2 = param2 - param0;
                        param0 = (float)((daa) this).field_k[(int)param0];
                        L15: while (true) {
                          param2 = param2 - 1.0f;
                          if (param2 < 0.0f) {
                            L16: while (true) {
                              param1 = param1 - 1.0f;
                              if (param1 < 0.0f) {
                                return;
                              } else {
                                this.a(((daa) this).field_e, ((daa) this).field_h, (int)param0, 0, 0, (int)param3, (int)param5, param6, var29, var37, var31, var38, var33, var39, var35);
                                param5 = param5 + var25;
                                param3 = param3 + var26;
                                param6 = param6 + var30;
                                var37 = var37 + var32;
                                var38 = var38 + var34;
                                var39 = var39 + var36;
                                param0 = param0 + (float)((daa) this).field_m;
                                continue L16;
                              }
                            }
                          } else {
                            this.a(((daa) this).field_e, ((daa) this).field_h, (int)param0, 0, 0, (int)param3, (int)param4, param6, var29, var37, var31, var38, var33, var39, var35);
                            param4 = param4 + var27;
                            param3 = param3 + var26;
                            param6 = param6 + var30;
                            var37 = var37 + var32;
                            var38 = var38 + var34;
                            var39 = var39 + var36;
                            param0 = param0 + (float)((daa) this).field_m;
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
                            param0 = (float)((daa) this).field_k[(int)param0];
                            L20: while (true) {
                              param1 = param1 - 1.0f;
                              if (param1 < 0.0f) {
                                L21: while (true) {
                                  param2 = param2 - 1.0f;
                                  if (param2 < 0.0f) {
                                    return;
                                  } else {
                                    this.a(((daa) this).field_e, ((daa) this).field_h, (int)param0, 0, 0, (int)param5, (int)param4, param6, var29, var37, var31, var38, var33, var39, var35);
                                    param5 = param5 + var27;
                                    param4 = param4 + var25;
                                    param6 = param6 + var30;
                                    var37 = var37 + var32;
                                    var38 = var38 + var34;
                                    var39 = var39 + var36;
                                    param0 = param0 + (float)((daa) this).field_m;
                                    continue L21;
                                  }
                                }
                              } else {
                                this.a(((daa) this).field_e, ((daa) this).field_h, (int)param0, 0, 0, (int)param5, (int)param3, param6, var29, var37, var31, var38, var33, var39, var35);
                                param5 = param5 + var27;
                                param3 = param3 + var26;
                                param6 = param6 + var30;
                                var37 = var37 + var32;
                                var38 = var38 + var34;
                                var39 = var39 + var36;
                                param0 = param0 + (float)((daa) this).field_m;
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
                          param0 = (float)((daa) this).field_k[(int)param0];
                          L22: while (true) {
                            param1 = param1 - 1.0f;
                            if (param1 < 0.0f) {
                              L23: while (true) {
                                param2 = param2 - 1.0f;
                                if (param2 < 0.0f) {
                                  return;
                                } else {
                                  this.a(((daa) this).field_e, ((daa) this).field_h, (int)param0, 0, 0, (int)param5, (int)param4, param6, var29, var37, var31, var38, var33, var39, var35);
                                  param5 = param5 + var27;
                                  param4 = param4 + var25;
                                  param6 = param6 + var30;
                                  var37 = var37 + var32;
                                  var38 = var38 + var34;
                                  var39 = var39 + var36;
                                  param0 = param0 + (float)((daa) this).field_m;
                                  continue L23;
                                }
                              }
                            } else {
                              this.a(((daa) this).field_e, ((daa) this).field_h, (int)param0, 0, 0, (int)param5, (int)param3, param6, var29, var37, var31, var38, var33, var39, var35);
                              param5 = param5 + var27;
                              param3 = param3 + var26;
                              param6 = param6 + var30;
                              var37 = var37 + var32;
                              var38 = var38 + var34;
                              var39 = var39 + var36;
                              param0 = param0 + (float)((daa) this).field_m;
                              continue L22;
                            }
                          }
                        } else {
                          param2 = param2 - param1;
                          param1 = param1 - param0;
                          param0 = (float)((daa) this).field_k[(int)param0];
                          L24: while (true) {
                            param1 = param1 - 1.0f;
                            if (param1 < 0.0f) {
                              L25: while (true) {
                                param2 = param2 - 1.0f;
                                if (param2 < 0.0f) {
                                  return;
                                } else {
                                  this.a(((daa) this).field_e, ((daa) this).field_h, (int)param0, 0, 0, (int)param4, (int)param5, param6, var29, var37, var31, var38, var33, var39, var35);
                                  param5 = param5 + var27;
                                  param4 = param4 + var25;
                                  param6 = param6 + var30;
                                  var37 = var37 + var32;
                                  var38 = var38 + var34;
                                  var39 = var39 + var36;
                                  param0 = param0 + (float)((daa) this).field_m;
                                  continue L25;
                                }
                              }
                            } else {
                              this.a(((daa) this).field_e, ((daa) this).field_h, (int)param0, 0, 0, (int)param3, (int)param5, param6, var29, var37, var31, var38, var33, var39, var35);
                              param5 = param5 + var27;
                              param3 = param3 + var26;
                              param6 = param6 + var30;
                              var37 = var37 + var32;
                              var38 = var38 + var34;
                              var39 = var39 + var36;
                              param0 = param0 + (float)((daa) this).field_m;
                              continue L24;
                            }
                          }
                        }
                      } else {
                        param2 = param2 - param1;
                        param1 = param1 - param0;
                        param0 = (float)((daa) this).field_k[(int)param0];
                        L26: while (true) {
                          param1 = param1 - 1.0f;
                          if (param1 < 0.0f) {
                            L27: while (true) {
                              param2 = param2 - 1.0f;
                              if (param2 < 0.0f) {
                                return;
                              } else {
                                this.a(((daa) this).field_e, ((daa) this).field_h, (int)param0, 0, 0, (int)param4, (int)param5, param6, var29, var37, var31, var38, var33, var39, var35);
                                param5 = param5 + var27;
                                param4 = param4 + var25;
                                param6 = param6 + var30;
                                var37 = var37 + var32;
                                var38 = var38 + var34;
                                var39 = var39 + var36;
                                param0 = param0 + (float)((daa) this).field_m;
                                continue L27;
                              }
                            }
                          } else {
                            this.a(((daa) this).field_e, ((daa) this).field_h, (int)param0, 0, 0, (int)param3, (int)param5, param6, var29, var37, var31, var38, var33, var39, var35);
                            param5 = param5 + var27;
                            param3 = param3 + var26;
                            param6 = param6 + var30;
                            var37 = var37 + var32;
                            var38 = var38 + var34;
                            var39 = var39 + var36;
                            param0 = param0 + (float)((daa) this).field_m;
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
              if (param2 < (float)((daa) this).field_g) {
                L28: {
                  if (param0 <= (float)((daa) this).field_g) {
                    break L28;
                  } else {
                    param0 = (float)((daa) this).field_g;
                    break L28;
                  }
                }
                L29: {
                  if (param1 <= (float)((daa) this).field_g) {
                    break L29;
                  } else {
                    param1 = (float)((daa) this).field_g;
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
                    param2 = (float)((daa) this).field_k[(int)param2];
                    L32: while (true) {
                      param1 = param1 - 1.0f;
                      if (param1 < 0.0f) {
                        L33: while (true) {
                          param0 = param0 - 1.0f;
                          if (param0 < 0.0f) {
                            return;
                          } else {
                            this.a(((daa) this).field_e, ((daa) this).field_h, (int)param2, 0, 0, (int)param4, (int)param5, param8, var29, var37, var31, var38, var33, var39, var35);
                            param4 = param4 + var26;
                            param5 = param5 + var27;
                            param8 = param8 + var30;
                            var37 = var37 + var32;
                            var38 = var38 + var34;
                            var39 = var39 + var36;
                            param2 = param2 + (float)((daa) this).field_m;
                            continue L33;
                          }
                        }
                      } else {
                        this.a(((daa) this).field_e, ((daa) this).field_h, (int)param2, 0, 0, (int)param3, (int)param5, param8, var29, var37, var31, var38, var33, var39, var35);
                        param3 = param3 + var25;
                        param5 = param5 + var27;
                        param8 = param8 + var30;
                        var37 = var37 + var32;
                        var38 = var38 + var34;
                        var39 = var39 + var36;
                        param2 = param2 + (float)((daa) this).field_m;
                        continue L32;
                      }
                    }
                  } else {
                    param0 = param0 - param1;
                    param1 = param1 - param2;
                    param2 = (float)((daa) this).field_k[(int)param2];
                    L34: while (true) {
                      param1 = param1 - 1.0f;
                      if (param1 < 0.0f) {
                        L35: while (true) {
                          param0 = param0 - 1.0f;
                          if (param0 < 0.0f) {
                            return;
                          } else {
                            this.a(((daa) this).field_e, ((daa) this).field_h, (int)param2, 0, 0, (int)param5, (int)param4, param8, var29, var37, var31, var38, var33, var39, var35);
                            param4 = param4 + var26;
                            param5 = param5 + var27;
                            param8 = param8 + var30;
                            var37 = var37 + var32;
                            var38 = var38 + var34;
                            var39 = var39 + var36;
                            param2 = param2 + (float)((daa) this).field_m;
                            continue L35;
                          }
                        }
                      } else {
                        this.a(((daa) this).field_e, ((daa) this).field_h, (int)param2, 0, 0, (int)param5, (int)param3, param8, var29, var37, var31, var38, var33, var39, var35);
                        param3 = param3 + var25;
                        param5 = param5 + var27;
                        param8 = param8 + var30;
                        var37 = var37 + var32;
                        var38 = var38 + var34;
                        var39 = var39 + var36;
                        param2 = param2 + (float)((daa) this).field_m;
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
                    param2 = (float)((daa) this).field_k[(int)param2];
                    L38: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        L39: while (true) {
                          param1 = param1 - 1.0f;
                          if (param1 < 0.0f) {
                            return;
                          } else {
                            this.a(((daa) this).field_e, ((daa) this).field_h, (int)param2, 0, 0, (int)param4, (int)param3, param8, var29, var37, var31, var38, var33, var39, var35);
                            param4 = param4 + var25;
                            param3 = param3 + var26;
                            param8 = param8 + var30;
                            var37 = var37 + var32;
                            var38 = var38 + var34;
                            var39 = var39 + var36;
                            param2 = param2 + (float)((daa) this).field_m;
                            continue L39;
                          }
                        }
                      } else {
                        this.a(((daa) this).field_e, ((daa) this).field_h, (int)param2, 0, 0, (int)param4, (int)param5, param8, var29, var37, var31, var38, var33, var39, var35);
                        param4 = param4 + var25;
                        param5 = param5 + var27;
                        param8 = param8 + var30;
                        var37 = var37 + var32;
                        var38 = var38 + var34;
                        var39 = var39 + var36;
                        param2 = param2 + (float)((daa) this).field_m;
                        continue L38;
                      }
                    }
                  } else {
                    param1 = param1 - param0;
                    param0 = param0 - param2;
                    param2 = (float)((daa) this).field_k[(int)param2];
                    L40: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        L41: while (true) {
                          param1 = param1 - 1.0f;
                          if (param1 < 0.0f) {
                            return;
                          } else {
                            this.a(((daa) this).field_e, ((daa) this).field_h, (int)param2, 0, 0, (int)param3, (int)param4, param8, var29, var37, var31, var38, var33, var39, var35);
                            param4 = param4 + var25;
                            param3 = param3 + var26;
                            param8 = param8 + var30;
                            var37 = var37 + var32;
                            var38 = var38 + var34;
                            var39 = var39 + var36;
                            param2 = param2 + (float)((daa) this).field_m;
                            continue L41;
                          }
                        }
                      } else {
                        this.a(((daa) this).field_e, ((daa) this).field_h, (int)param2, 0, 0, (int)param5, (int)param4, param8, var29, var37, var31, var38, var33, var39, var35);
                        param4 = param4 + var25;
                        param5 = param5 + var27;
                        param8 = param8 + var30;
                        var37 = var37 + var32;
                        var38 = var38 + var34;
                        var39 = var39 + var36;
                        param2 = param2 + (float)((daa) this).field_m;
                        continue L40;
                      }
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              if (param1 < (float)((daa) this).field_g) {
                L42: {
                  if (param2 <= (float)((daa) this).field_g) {
                    break L42;
                  } else {
                    param2 = (float)((daa) this).field_g;
                    break L42;
                  }
                }
                L43: {
                  if (param0 <= (float)((daa) this).field_g) {
                    break L43;
                  } else {
                    param0 = (float)((daa) this).field_g;
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
                    param1 = (float)((daa) this).field_k[(int)param1];
                    L46: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        L47: while (true) {
                          param2 = param2 - 1.0f;
                          if (param2 < 0.0f) {
                            return;
                          } else {
                            this.a(((daa) this).field_e, ((daa) this).field_h, (int)param1, 0, 0, (int)param3, (int)param4, param7, var29, var37, var31, var38, var33, var39, var35);
                            param3 = param3 + var27;
                            param4 = param4 + var25;
                            param7 = param7 + var30;
                            var37 = var37 + var32;
                            var38 = var38 + var34;
                            var39 = var39 + var36;
                            param1 = param1 + (float)((daa) this).field_m;
                            continue L47;
                          }
                        }
                      } else {
                        this.a(((daa) this).field_e, ((daa) this).field_h, (int)param1, 0, 0, (int)param5, (int)param4, param7, var29, var37, var31, var38, var33, var39, var35);
                        param5 = param5 + var26;
                        param4 = param4 + var25;
                        param7 = param7 + var30;
                        var37 = var37 + var32;
                        var38 = var38 + var34;
                        var39 = var39 + var36;
                        param1 = param1 + (float)((daa) this).field_m;
                        continue L46;
                      }
                    }
                  } else {
                    param2 = param2 - param0;
                    param0 = param0 - param1;
                    param1 = (float)((daa) this).field_k[(int)param1];
                    L48: while (true) {
                      param0 = param0 - 1.0f;
                      if (param0 < 0.0f) {
                        L49: while (true) {
                          param2 = param2 - 1.0f;
                          if (param2 < 0.0f) {
                            return;
                          } else {
                            this.a(((daa) this).field_e, ((daa) this).field_h, (int)param1, 0, 0, (int)param4, (int)param3, param7, var29, var37, var31, var38, var33, var39, var35);
                            param3 = param3 + var27;
                            param4 = param4 + var25;
                            param7 = param7 + var30;
                            var37 = var37 + var32;
                            var38 = var38 + var34;
                            var39 = var39 + var36;
                            param1 = param1 + (float)((daa) this).field_m;
                            continue L49;
                          }
                        }
                      } else {
                        this.a(((daa) this).field_e, ((daa) this).field_h, (int)param1, 0, 0, (int)param4, (int)param5, param7, var29, var37, var31, var38, var33, var39, var35);
                        param5 = param5 + var26;
                        param4 = param4 + var25;
                        param7 = param7 + var30;
                        var37 = var37 + var32;
                        var38 = var38 + var34;
                        var39 = var39 + var36;
                        param1 = param1 + (float)((daa) this).field_m;
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
                        param1 = (float)((daa) this).field_k[(int)param1];
                        L53: while (true) {
                          param2 = param2 - 1.0f;
                          if (param2 < 0.0f) {
                            L54: while (true) {
                              param0 = param0 - 1.0f;
                              if (param0 < 0.0f) {
                                return;
                              } else {
                                this.a(((daa) this).field_e, ((daa) this).field_h, (int)param1, 0, 0, (int)param3, (int)param5, param7, var29, var37, var31, var38, var33, var39, var35);
                                param3 = param3 + var26;
                                param5 = param5 + var27;
                                param7 = param7 + var30;
                                var37 = var37 + var32;
                                var38 = var38 + var34;
                                var39 = var39 + var36;
                                param1 = param1 + (float)((daa) this).field_m;
                                continue L54;
                              }
                            }
                          } else {
                            this.a(((daa) this).field_e, ((daa) this).field_h, (int)param1, 0, 0, (int)param3, (int)param4, param7, var29, var37, var31, var38, var33, var39, var35);
                            param3 = param3 + var26;
                            param4 = param4 + var25;
                            param7 = param7 + var30;
                            var37 = var37 + var32;
                            var38 = var38 + var34;
                            var39 = var39 + var36;
                            param1 = param1 + (float)((daa) this).field_m;
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
                      param1 = (float)((daa) this).field_k[(int)param1];
                      L55: while (true) {
                        param2 = param2 - 1.0f;
                        if (param2 < 0.0f) {
                          L56: while (true) {
                            param0 = param0 - 1.0f;
                            if (param0 < 0.0f) {
                              return;
                            } else {
                              this.a(((daa) this).field_e, ((daa) this).field_h, (int)param1, 0, 0, (int)param3, (int)param5, param7, var29, var37, var31, var38, var33, var39, var35);
                              param3 = param3 + var26;
                              param5 = param5 + var27;
                              param7 = param7 + var30;
                              var37 = var37 + var32;
                              var38 = var38 + var34;
                              var39 = var39 + var36;
                              param1 = param1 + (float)((daa) this).field_m;
                              continue L56;
                            }
                          }
                        } else {
                          this.a(((daa) this).field_e, ((daa) this).field_h, (int)param1, 0, 0, (int)param3, (int)param4, param7, var29, var37, var31, var38, var33, var39, var35);
                          param3 = param3 + var26;
                          param4 = param4 + var25;
                          param7 = param7 + var30;
                          var37 = var37 + var32;
                          var38 = var38 + var34;
                          var39 = var39 + var36;
                          param1 = param1 + (float)((daa) this).field_m;
                          continue L55;
                        }
                      }
                    } else {
                      param0 = param0 - param2;
                      param2 = param2 - param1;
                      param1 = (float)((daa) this).field_k[(int)param1];
                      L57: while (true) {
                        param2 = param2 - 1.0f;
                        if (param2 < 0.0f) {
                          L58: while (true) {
                            param0 = param0 - 1.0f;
                            if (param0 < 0.0f) {
                              return;
                            } else {
                              this.a(((daa) this).field_e, ((daa) this).field_h, (int)param1, 0, 0, (int)param5, (int)param3, param7, var29, var37, var31, var38, var33, var39, var35);
                              param3 = param3 + var26;
                              param5 = param5 + var27;
                              param7 = param7 + var30;
                              var37 = var37 + var32;
                              var38 = var38 + var34;
                              var39 = var39 + var36;
                              param1 = param1 + (float)((daa) this).field_m;
                              continue L58;
                            }
                          }
                        } else {
                          this.a(((daa) this).field_e, ((daa) this).field_h, (int)param1, 0, 0, (int)param4, (int)param3, param7, var29, var37, var31, var38, var33, var39, var35);
                          param3 = param3 + var26;
                          param4 = param4 + var25;
                          param7 = param7 + var30;
                          var37 = var37 + var32;
                          var38 = var38 + var34;
                          var39 = var39 + var36;
                          param1 = param1 + (float)((daa) this).field_m;
                          continue L57;
                        }
                      }
                    }
                  } else {
                    param0 = param0 - param2;
                    param2 = param2 - param1;
                    param1 = (float)((daa) this).field_k[(int)param1];
                    L59: while (true) {
                      param2 = param2 - 1.0f;
                      if (param2 < 0.0f) {
                        L60: while (true) {
                          param0 = param0 - 1.0f;
                          if (param0 < 0.0f) {
                            return;
                          } else {
                            this.a(((daa) this).field_e, ((daa) this).field_h, (int)param1, 0, 0, (int)param5, (int)param3, param7, var29, var37, var31, var38, var33, var39, var35);
                            param3 = param3 + var26;
                            param5 = param5 + var27;
                            param7 = param7 + var30;
                            var37 = var37 + var32;
                            var38 = var38 + var34;
                            var39 = var39 + var36;
                            param1 = param1 + (float)((daa) this).field_m;
                            continue L60;
                          }
                        }
                      } else {
                        this.a(((daa) this).field_e, ((daa) this).field_h, (int)param1, 0, 0, (int)param4, (int)param3, param7, var29, var37, var31, var38, var33, var39, var35);
                        param3 = param3 + var26;
                        param4 = param4 + var25;
                        param7 = param7 + var30;
                        var37 = var37 + var32;
                        var38 = var38 + var34;
                        var39 = var39 + var36;
                        param1 = param1 + (float)((daa) this).field_m;
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
          ((daa) this).field_f.c((int)param4, 1, -16777216 | param9, (int)param1, (int)param3, (int)param0);
          ((daa) this).field_f.c((int)param5, 1, -16777216 | param9, (int)param2, (int)param4, (int)param1);
          ((daa) this).field_f.c((int)param3, 1, -16777216 | param9, (int)param0, (int)param5, (int)param2);
          return;
        }
    }

    private final void a(int[] param0, float[] param1, int param2, int param3, int param4, int param5, int param6, float param7, float param8, float param9, float param10, float param11, float param12, float param13, float param14) {
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
          if (!((daa) this).field_n) {
            break L0;
          } else {
            L1: {
              if (param6 <= ((daa) this).field_b) {
                break L1;
              } else {
                param6 = ((daa) this).field_b;
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
          if (!((daa) this).field_i) {
            param2 = param2 + (param5 - 1);
            param7 = param7 + param8 * (float)param5;
            param9 = param9 + param10 * (float)param5;
            param11 = param11 + param12 * (float)param5;
            param13 = param13 + param14 * (float)param5;
            if (!((daa) this).field_c.field_f) {
              if (!((daa) this).field_j) {
                L2: {
                  param4 = param6 - param5;
                  if (((daa) this).field_a != 0) {
                    if (((daa) this).field_d) {
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
                      var16_int = ((daa) this).field_a;
                      var17 = 256 - ((daa) this).field_a;
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
                  if (((daa) this).field_a != 0) {
                    if (((daa) this).field_d) {
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
                        var16_int = ((daa) this).field_a;
                        var17 = 256 - ((daa) this).field_a;
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
              if (!((daa) this).field_j) {
                L34: {
                  param4 = param6 - param5;
                  if (((daa) this).field_a != 0) {
                    if (((daa) this).field_d) {
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
                      var16_int = ((daa) this).field_a;
                      var17 = 256 - ((daa) this).field_a;
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
                  if (((daa) this).field_a != 0) {
                    if (((daa) this).field_d) {
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
                        var16_int = ((daa) this).field_a;
                        var17 = 256 - ((daa) this).field_a;
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
            if (((daa) this).field_j) {
              L66: {
                param4 = param6 - param5 >> 2;
                param10 = param10 * 4.0f;
                param12 = param12 * 4.0f;
                param14 = param14 * 4.0f;
                if (((daa) this).field_a != 0) {
                  if (((daa) this).field_d) {
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
                          int incrementValue$18 = param2;
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
                          int incrementValue$19 = param2;
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
                          int incrementValue$20 = param2;
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
                          int incrementValue$21 = param2;
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
                        int incrementValue$22 = param2;
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
                      var16_int = ((daa) this).field_a;
                      var17 = 256 - ((daa) this).field_a;
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
                          int incrementValue$23 = param2;
                          param2++;
                          param0[incrementValue$23] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                          var18 = param0[param2];
                          int incrementValue$24 = param2;
                          param2++;
                          param0[incrementValue$24] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                          var18 = param0[param2];
                          int incrementValue$25 = param2;
                          param2++;
                          param0[incrementValue$25] = param3 + ((var18 & 16711935) * var16_int >> 8 & 16711935) + ((var18 & 65280) * var16_int >> 8 & 65280);
                          var18 = param0[param2];
                          int incrementValue$26 = param2;
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
                        int incrementValue$27 = param2;
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
                        int incrementValue$28 = param2;
                        param2++;
                        param0[incrementValue$28] = param3;
                        int incrementValue$29 = param2;
                        param2++;
                        param0[incrementValue$29] = param3;
                        int incrementValue$30 = param2;
                        param2++;
                        param0[incrementValue$30] = param3;
                        int incrementValue$31 = param2;
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
                      int incrementValue$32 = param2;
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
                if (((daa) this).field_a != 0) {
                  if (((daa) this).field_d) {
                    L77: while (true) {
                      var27 = param0;
                      var16 = var27;
                      int incrementValue$33 = param2;
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
                    var16_int = ((daa) this).field_a;
                    var17 = 256 - ((daa) this).field_a;
                    L78: while (true) {
                      param3 = -16777216 | ((int)param9 & 16711680 | (int)param11 & 65280 | (int)param13 & 255);
                      param9 = param9 + param10;
                      param11 = param11 + param12;
                      param13 = param13 + param14;
                      param3 = ((param3 & 16711935) * var17 >> 8 & 16711935) + ((param3 & 65280) * var17 >> 8 & 65280);
                      var18 = param0[param2];
                      int incrementValue$34 = param2;
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
                    int incrementValue$35 = param2;
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

    final int b() {
        return ((daa) this).field_k[0] / ((daa) this).field_m;
    }

    daa(sob param0, co param1) {
        ((daa) this).field_k = new int[4096];
        ((daa) this).field_i = false;
        ((daa) this).field_l = false;
        ((daa) this).field_n = false;
        ((daa) this).field_d = false;
        ((daa) this).field_j = true;
        ((daa) this).field_a = 0;
        ((daa) this).field_f = param0;
        ((daa) this).field_c = param1;
        ((daa) this).field_m = ((daa) this).field_f.field_i;
        ((daa) this).field_e = ((daa) this).field_f.field_k;
        ((daa) this).field_h = ((daa) this).field_f.field_r;
    }
}
