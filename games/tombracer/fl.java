/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl extends ci {
    static int field_m;

    final int[] c(int param0, int param1) {
        String discarded$1 = null;
        int[] var3 = null;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        int[] var8 = null;
        int[] stackIn_9_0 = null;
        int[] stackIn_10_0 = null;
        int[] stackIn_18_0 = null;
        int[] stackIn_19_0 = null;
        int[] stackOut_17_0 = null;
        int[] stackOut_8_0 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        if (param0 == 1) {
          var8 = this.field_i.a((byte) -111, param1);
          var3 = var8;
          if (this.field_i.field_d) {
            var4 = 0;
            L0: while (true) {
              if (ns.field_g > var4) {
                this.d(var4, param1, -5455);
                var5 = this.c(0, -70, fv.field_e);
                stackOut_17_0 = (int[]) (var8);
                stackIn_19_0 = stackOut_17_0;
                stackIn_18_0 = stackOut_17_0;
                if (var6 == 0) {
                  stackIn_19_0[var4] = var5[boa.field_o];
                  var4++;
                  continue L0;
                } else {
                  return stackIn_18_0;
                }
              } else {
                return var8;
              }
            }
          } else {
            return var8;
          }
        } else {
          var7 = (CharSequence) null;
          discarded$1 = fl.a((byte) -31, (CharSequence) null);
          var8 = this.field_i.a((byte) -111, param1);
          var3 = var8;
          if (this.field_i.field_d) {
            var4 = 0;
            L1: while (true) {
              if (ns.field_g > var4) {
                this.d(var4, param1, -5455);
                var5 = this.c(0, -70, fv.field_e);
                stackOut_8_0 = (int[]) (var8);
                stackIn_10_0 = stackOut_8_0;
                stackIn_9_0 = stackOut_8_0;
                if (var6 == 0) {
                  stackIn_10_0[var4] = var5[boa.field_o];
                  var4++;
                  continue L1;
                } else {
                  return stackIn_9_0;
                }
              } else {
                return var8;
              }
            }
          } else {
            return var8;
          }
        }
    }

    final static String a(byte param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        char[] var8 = null;
        char[] var9 = null;
        String stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_21_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var3 = 4 % ((64 - param0) / 38);
              var2_int = param1.length();
              if (-21 > (var2_int ^ -1)) {
                var2_int = 20;
                break L1;
              } else {
                break L1;
              }
            }
            var9 = new char[var2_int];
            var8 = var9;
            var4 = var8;
            var5 = 0;
            L2: while (true) {
              L3: {
                if (var2_int <= var5) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      L6: {
                        var6 = param1.charAt(var5);
                        if (65 > var6) {
                          break L6;
                        } else {
                          if (var6 <= 90) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        L8: {
                          L9: {
                            if (var6 < 97) {
                              break L9;
                            } else {
                              if (var6 <= 122) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                          if (var6 < 48) {
                            break L7;
                          } else {
                            if (var6 > 57) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var4[var5] = (char)var6;
                        if (var7 == 0) {
                          break L4;
                        } else {
                          break L7;
                        }
                      }
                      var4[var5] = (char)95;
                      if (var7 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                    var4[var5] = (char)(32 + var6);
                    break L4;
                  }
                  var5++;
                  if (var7 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_21_0 = new String(var9);
              stackIn_22_0 = stackOut_21_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var2);
            stackOut_23_1 = new StringBuilder().append("fl.C(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L10;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L10;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        return stackIn_22_0;
    }

    private final void d(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        float var6 = 0.0f;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        if (param2 != -5455) {
          field_m = -128;
          var4 = ht.field_Fb[param0];
          var5 = sj.field_b[param1];
          var6 = (float)Math.atan2((double)(-2048 + var4), (double)(var5 - 2048));
          if ((double)var6 >= -3.141592653589793) {
            L0: {
              if (-2.356194490192345 < (double)var6) {
                break L0;
              } else {
                fv.field_e = param1;
                boa.field_o = param0;
                if (var7 != 0) {
                  break L0;
                } else {
                  fv.field_e = fv.field_e & hba.field_b;
                  boa.field_o = boa.field_o & una.field_b;
                  return;
                }
              }
            }
            L1: {
              if ((double)var6 > -1.5707963267948966) {
                break L1;
              } else {
                if ((double)var6 < -2.356194490192345) {
                  break L1;
                } else {
                  boa.field_o = param1;
                  fv.field_e = param0;
                  if (var7 != 0) {
                    break L1;
                  } else {
                    fv.field_e = fv.field_e & hba.field_b;
                    boa.field_o = boa.field_o & una.field_b;
                    return;
                  }
                }
              }
            }
            L2: {
              if (-0.7853981633974483 < (double)var6) {
                break L2;
              } else {
                if (-1.5707963267948966 > (double)var6) {
                  break L2;
                } else {
                  fv.field_e = param0;
                  boa.field_o = -param1 + ns.field_g;
                  if (var7 != 0) {
                    break L2;
                  } else {
                    fv.field_e = fv.field_e & hba.field_b;
                    boa.field_o = boa.field_o & una.field_b;
                    return;
                  }
                }
              }
            }
            L3: {
              if (var6 > 0.0f) {
                break L3;
              } else {
                if ((double)var6 < -0.7853981633974483) {
                  break L3;
                } else {
                  boa.field_o = param0;
                  fv.field_e = qda.field_i - param1;
                  if (var7 != 0) {
                    L4: {
                      L5: {
                        if (0.0f > var6) {
                          break L5;
                        } else {
                          if ((double)var6 > 0.7853981633974483) {
                            break L5;
                          } else {
                            fv.field_e = qda.field_i - param1;
                            boa.field_o = ns.field_g - param0;
                            if (var7 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      L6: {
                        if ((double)var6 < 0.7853981633974483) {
                          break L6;
                        } else {
                          if ((double)var6 > 1.5707963267948966) {
                            break L6;
                          } else {
                            boa.field_o = ns.field_g + -param1;
                            fv.field_e = qda.field_i + -param0;
                            if (var7 == 0) {
                              break L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      L7: {
                        L8: {
                          if ((double)var6 < 1.5707963267948966) {
                            break L8;
                          } else {
                            if (2.356194490192345 >= (double)var6) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        if (2.356194490192345 > (double)var6) {
                          break L4;
                        } else {
                          if ((double)var6 > 3.141592653589793) {
                            break L4;
                          } else {
                            fv.field_e = param1;
                            boa.field_o = -param0 + ns.field_g;
                            if (var7 == 0) {
                              break L4;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      boa.field_o = param1;
                      fv.field_e = qda.field_i + -param0;
                      break L4;
                    }
                    fv.field_e = fv.field_e & hba.field_b;
                    boa.field_o = boa.field_o & una.field_b;
                    return;
                  } else {
                    fv.field_e = fv.field_e & hba.field_b;
                    boa.field_o = boa.field_o & una.field_b;
                    return;
                  }
                }
              }
            }
            L9: {
              L10: {
                if (0.0f > var6) {
                  break L10;
                } else {
                  if ((double)var6 > 0.7853981633974483) {
                    break L10;
                  } else {
                    fv.field_e = qda.field_i - param1;
                    boa.field_o = ns.field_g - param0;
                    if (var7 == 0) {
                      break L9;
                    } else {
                      L11: {
                        if ((double)var6 < 0.7853981633974483) {
                          break L11;
                        } else {
                          if ((double)var6 > 1.5707963267948966) {
                            break L11;
                          } else {
                            boa.field_o = ns.field_g + -param1;
                            fv.field_e = qda.field_i + -param0;
                            break L11;
                          }
                        }
                      }
                      L12: {
                        if ((double)var6 < 1.5707963267948966) {
                          break L12;
                        } else {
                          if (2.356194490192345 >= (double)var6) {
                            boa.field_o = param1;
                            fv.field_e = qda.field_i + -param0;
                            fv.field_e = fv.field_e & hba.field_b;
                            boa.field_o = boa.field_o & una.field_b;
                            return;
                          } else {
                            break L12;
                          }
                        }
                      }
                      L13: {
                        if (2.356194490192345 > (double)var6) {
                          break L13;
                        } else {
                          if ((double)var6 > 3.141592653589793) {
                            break L13;
                          } else {
                            fv.field_e = param1;
                            boa.field_o = -param0 + ns.field_g;
                            if (var7 == 0) {
                              break L13;
                            } else {
                              boa.field_o = param1;
                              fv.field_e = qda.field_i + -param0;
                              fv.field_e = fv.field_e & hba.field_b;
                              boa.field_o = boa.field_o & una.field_b;
                              return;
                            }
                          }
                        }
                      }
                      fv.field_e = fv.field_e & hba.field_b;
                      boa.field_o = boa.field_o & una.field_b;
                      return;
                    }
                  }
                }
              }
              L14: {
                if ((double)var6 < 0.7853981633974483) {
                  break L14;
                } else {
                  if ((double)var6 > 1.5707963267948966) {
                    break L14;
                  } else {
                    boa.field_o = ns.field_g + -param1;
                    fv.field_e = qda.field_i + -param0;
                    if (var7 == 0) {
                      break L9;
                    } else {
                      if ((double)var6 < 1.5707963267948966) {
                        L15: {
                          if (2.356194490192345 > (double)var6) {
                            break L15;
                          } else {
                            if ((double)var6 > 3.141592653589793) {
                              break L15;
                            } else {
                              fv.field_e = param1;
                              boa.field_o = -param0 + ns.field_g;
                              if (var7 == 0) {
                                break L15;
                              } else {
                                boa.field_o = param1;
                                fv.field_e = qda.field_i + -param0;
                                fv.field_e = fv.field_e & hba.field_b;
                                boa.field_o = boa.field_o & una.field_b;
                                return;
                              }
                            }
                          }
                        }
                        fv.field_e = fv.field_e & hba.field_b;
                        boa.field_o = boa.field_o & una.field_b;
                        return;
                      } else {
                        if (2.356194490192345 >= (double)var6) {
                          boa.field_o = param1;
                          fv.field_e = qda.field_i + -param0;
                          fv.field_e = fv.field_e & hba.field_b;
                          boa.field_o = boa.field_o & una.field_b;
                          return;
                        } else {
                          L16: {
                            if (2.356194490192345 > (double)var6) {
                              break L16;
                            } else {
                              if ((double)var6 > 3.141592653589793) {
                                break L16;
                              } else {
                                fv.field_e = param1;
                                boa.field_o = -param0 + ns.field_g;
                                boa.field_o = param1;
                                fv.field_e = qda.field_i + -param0;
                                fv.field_e = fv.field_e & hba.field_b;
                                boa.field_o = boa.field_o & una.field_b;
                                return;
                              }
                            }
                          }
                          fv.field_e = fv.field_e & hba.field_b;
                          boa.field_o = boa.field_o & una.field_b;
                          return;
                        }
                      }
                    }
                  }
                }
              }
              if ((double)var6 < 1.5707963267948966) {
                if (2.356194490192345 > (double)var6) {
                  break L9;
                } else {
                  if ((double)var6 > 3.141592653589793) {
                    break L9;
                  } else {
                    fv.field_e = param1;
                    boa.field_o = -param0 + ns.field_g;
                    if (var7 == 0) {
                      break L9;
                    } else {
                      boa.field_o = param1;
                      fv.field_e = qda.field_i + -param0;
                      fv.field_e = fv.field_e & hba.field_b;
                      boa.field_o = boa.field_o & una.field_b;
                      return;
                    }
                  }
                }
              } else {
                if (2.356194490192345 >= (double)var6) {
                  boa.field_o = param1;
                  fv.field_e = qda.field_i + -param0;
                  fv.field_e = fv.field_e & hba.field_b;
                  boa.field_o = boa.field_o & una.field_b;
                  return;
                } else {
                  L17: {
                    if (2.356194490192345 > (double)var6) {
                      break L17;
                    } else {
                      if ((double)var6 > 3.141592653589793) {
                        break L17;
                      } else {
                        fv.field_e = param1;
                        boa.field_o = -param0 + ns.field_g;
                        if (var7 == 0) {
                          break L17;
                        } else {
                          boa.field_o = param1;
                          fv.field_e = qda.field_i + -param0;
                          fv.field_e = fv.field_e & hba.field_b;
                          boa.field_o = boa.field_o & una.field_b;
                          return;
                        }
                      }
                    }
                  }
                  fv.field_e = fv.field_e & hba.field_b;
                  boa.field_o = boa.field_o & una.field_b;
                  return;
                }
              }
            }
            fv.field_e = fv.field_e & hba.field_b;
            boa.field_o = boa.field_o & una.field_b;
            return;
          } else {
            L18: {
              if ((double)var6 > -1.5707963267948966) {
                break L18;
              } else {
                if ((double)var6 < -2.356194490192345) {
                  break L18;
                } else {
                  boa.field_o = param1;
                  fv.field_e = param0;
                  if (var7 != 0) {
                    break L18;
                  } else {
                    fv.field_e = fv.field_e & hba.field_b;
                    boa.field_o = boa.field_o & una.field_b;
                    return;
                  }
                }
              }
            }
            L19: {
              if (-0.7853981633974483 < (double)var6) {
                break L19;
              } else {
                if (-1.5707963267948966 > (double)var6) {
                  break L19;
                } else {
                  fv.field_e = param0;
                  boa.field_o = -param1 + ns.field_g;
                  if (var7 != 0) {
                    break L19;
                  } else {
                    fv.field_e = fv.field_e & hba.field_b;
                    boa.field_o = boa.field_o & una.field_b;
                    return;
                  }
                }
              }
            }
            L20: {
              if (var6 > 0.0f) {
                break L20;
              } else {
                if ((double)var6 < -0.7853981633974483) {
                  break L20;
                } else {
                  boa.field_o = param0;
                  fv.field_e = qda.field_i - param1;
                  if (var7 != 0) {
                    L21: {
                      if (0.0f > var6) {
                        break L21;
                      } else {
                        if ((double)var6 > 0.7853981633974483) {
                          break L21;
                        } else {
                          fv.field_e = qda.field_i - param1;
                          boa.field_o = ns.field_g - param0;
                          break L21;
                        }
                      }
                    }
                    L22: {
                      L23: {
                        if ((double)var6 < 0.7853981633974483) {
                          break L23;
                        } else {
                          if ((double)var6 > 1.5707963267948966) {
                            break L23;
                          } else {
                            boa.field_o = ns.field_g + -param1;
                            fv.field_e = qda.field_i + -param0;
                            if (var7 == 0) {
                              break L22;
                            } else {
                              break L23;
                            }
                          }
                        }
                      }
                      L24: {
                        L25: {
                          if ((double)var6 < 1.5707963267948966) {
                            break L25;
                          } else {
                            if (2.356194490192345 >= (double)var6) {
                              break L24;
                            } else {
                              break L25;
                            }
                          }
                        }
                        if (2.356194490192345 > (double)var6) {
                          break L22;
                        } else {
                          if ((double)var6 > 3.141592653589793) {
                            break L22;
                          } else {
                            fv.field_e = param1;
                            boa.field_o = -param0 + ns.field_g;
                            if (var7 == 0) {
                              break L22;
                            } else {
                              break L24;
                            }
                          }
                        }
                      }
                      boa.field_o = param1;
                      fv.field_e = qda.field_i + -param0;
                      break L22;
                    }
                    fv.field_e = fv.field_e & hba.field_b;
                    boa.field_o = boa.field_o & una.field_b;
                    return;
                  } else {
                    fv.field_e = fv.field_e & hba.field_b;
                    boa.field_o = boa.field_o & una.field_b;
                    return;
                  }
                }
              }
            }
            L26: {
              if (0.0f > var6) {
                break L26;
              } else {
                if ((double)var6 > 0.7853981633974483) {
                  break L26;
                } else {
                  fv.field_e = qda.field_i - param1;
                  boa.field_o = ns.field_g - param0;
                  if (var7 != 0) {
                    L27: {
                      if ((double)var6 < 0.7853981633974483) {
                        break L27;
                      } else {
                        if ((double)var6 > 1.5707963267948966) {
                          break L27;
                        } else {
                          boa.field_o = ns.field_g + -param1;
                          fv.field_e = qda.field_i + -param0;
                          break L27;
                        }
                      }
                    }
                    L28: {
                      L29: {
                        L30: {
                          if ((double)var6 < 1.5707963267948966) {
                            break L30;
                          } else {
                            if (2.356194490192345 >= (double)var6) {
                              break L29;
                            } else {
                              break L30;
                            }
                          }
                        }
                        if (2.356194490192345 > (double)var6) {
                          break L28;
                        } else {
                          if ((double)var6 > 3.141592653589793) {
                            break L28;
                          } else {
                            fv.field_e = param1;
                            boa.field_o = -param0 + ns.field_g;
                            if (var7 == 0) {
                              break L28;
                            } else {
                              break L29;
                            }
                          }
                        }
                      }
                      boa.field_o = param1;
                      fv.field_e = qda.field_i + -param0;
                      break L28;
                    }
                    fv.field_e = fv.field_e & hba.field_b;
                    boa.field_o = boa.field_o & una.field_b;
                    return;
                  } else {
                    fv.field_e = fv.field_e & hba.field_b;
                    boa.field_o = boa.field_o & una.field_b;
                    return;
                  }
                }
              }
            }
            L31: {
              if ((double)var6 < 0.7853981633974483) {
                break L31;
              } else {
                if ((double)var6 > 1.5707963267948966) {
                  break L31;
                } else {
                  boa.field_o = ns.field_g + -param1;
                  fv.field_e = qda.field_i + -param0;
                  if (var7 != 0) {
                    L32: {
                      L33: {
                        L34: {
                          if ((double)var6 < 1.5707963267948966) {
                            break L34;
                          } else {
                            if (2.356194490192345 >= (double)var6) {
                              break L33;
                            } else {
                              break L34;
                            }
                          }
                        }
                        if (2.356194490192345 > (double)var6) {
                          break L32;
                        } else {
                          if ((double)var6 > 3.141592653589793) {
                            break L32;
                          } else {
                            fv.field_e = param1;
                            boa.field_o = -param0 + ns.field_g;
                            if (var7 == 0) {
                              break L32;
                            } else {
                              break L33;
                            }
                          }
                        }
                      }
                      boa.field_o = param1;
                      fv.field_e = qda.field_i + -param0;
                      break L32;
                    }
                    fv.field_e = fv.field_e & hba.field_b;
                    boa.field_o = boa.field_o & una.field_b;
                    return;
                  } else {
                    fv.field_e = fv.field_e & hba.field_b;
                    boa.field_o = boa.field_o & una.field_b;
                    return;
                  }
                }
              }
            }
            if ((double)var6 < 1.5707963267948966) {
              L35: {
                if (2.356194490192345 > (double)var6) {
                  break L35;
                } else {
                  if ((double)var6 > 3.141592653589793) {
                    break L35;
                  } else {
                    fv.field_e = param1;
                    boa.field_o = -param0 + ns.field_g;
                    if (var7 == 0) {
                      break L35;
                    } else {
                      boa.field_o = param1;
                      fv.field_e = qda.field_i + -param0;
                      fv.field_e = fv.field_e & hba.field_b;
                      boa.field_o = boa.field_o & una.field_b;
                      return;
                    }
                  }
                }
              }
              fv.field_e = fv.field_e & hba.field_b;
              boa.field_o = boa.field_o & una.field_b;
              return;
            } else {
              if (2.356194490192345 >= (double)var6) {
                boa.field_o = param1;
                fv.field_e = qda.field_i + -param0;
                fv.field_e = fv.field_e & hba.field_b;
                boa.field_o = boa.field_o & una.field_b;
                return;
              } else {
                L36: {
                  if (2.356194490192345 > (double)var6) {
                    break L36;
                  } else {
                    if ((double)var6 > 3.141592653589793) {
                      break L36;
                    } else {
                      fv.field_e = param1;
                      boa.field_o = -param0 + ns.field_g;
                      if (var7 == 0) {
                        break L36;
                      } else {
                        boa.field_o = param1;
                        fv.field_e = qda.field_i + -param0;
                        break L36;
                      }
                    }
                  }
                }
                fv.field_e = fv.field_e & hba.field_b;
                boa.field_o = boa.field_o & una.field_b;
                return;
              }
            }
          }
        } else {
          L37: {
            var4 = ht.field_Fb[param0];
            var5 = sj.field_b[param1];
            var6 = (float)Math.atan2((double)(-2048 + var4), (double)(var5 - 2048));
            if ((double)var6 < -3.141592653589793) {
              break L37;
            } else {
              if (-2.356194490192345 < (double)var6) {
                break L37;
              } else {
                fv.field_e = param1;
                boa.field_o = param0;
                if (var7 != 0) {
                  break L37;
                } else {
                  fv.field_e = fv.field_e & hba.field_b;
                  boa.field_o = boa.field_o & una.field_b;
                  return;
                }
              }
            }
          }
          L38: {
            if ((double)var6 > -1.5707963267948966) {
              break L38;
            } else {
              if ((double)var6 < -2.356194490192345) {
                break L38;
              } else {
                boa.field_o = param1;
                fv.field_e = param0;
                if (var7 != 0) {
                  break L38;
                } else {
                  fv.field_e = fv.field_e & hba.field_b;
                  boa.field_o = boa.field_o & una.field_b;
                  return;
                }
              }
            }
          }
          L39: {
            if (-0.7853981633974483 < (double)var6) {
              break L39;
            } else {
              if (-1.5707963267948966 > (double)var6) {
                break L39;
              } else {
                fv.field_e = param0;
                boa.field_o = -param1 + ns.field_g;
                if (var7 != 0) {
                  break L39;
                } else {
                  fv.field_e = fv.field_e & hba.field_b;
                  boa.field_o = boa.field_o & una.field_b;
                  return;
                }
              }
            }
          }
          L40: {
            if (var6 > 0.0f) {
              break L40;
            } else {
              if ((double)var6 < -0.7853981633974483) {
                break L40;
              } else {
                boa.field_o = param0;
                fv.field_e = qda.field_i - param1;
                if (var7 != 0) {
                  L41: {
                    if (0.0f > var6) {
                      break L41;
                    } else {
                      if ((double)var6 > 0.7853981633974483) {
                        break L41;
                      } else {
                        fv.field_e = qda.field_i - param1;
                        boa.field_o = ns.field_g - param0;
                        break L41;
                      }
                    }
                  }
                  L42: {
                    L43: {
                      if ((double)var6 < 0.7853981633974483) {
                        break L43;
                      } else {
                        if ((double)var6 > 1.5707963267948966) {
                          break L43;
                        } else {
                          boa.field_o = ns.field_g + -param1;
                          fv.field_e = qda.field_i + -param0;
                          if (var7 == 0) {
                            break L42;
                          } else {
                            break L43;
                          }
                        }
                      }
                    }
                    L44: {
                      L45: {
                        if ((double)var6 < 1.5707963267948966) {
                          break L45;
                        } else {
                          if (2.356194490192345 >= (double)var6) {
                            break L44;
                          } else {
                            break L45;
                          }
                        }
                      }
                      if (2.356194490192345 > (double)var6) {
                        break L42;
                      } else {
                        if ((double)var6 > 3.141592653589793) {
                          break L42;
                        } else {
                          fv.field_e = param1;
                          boa.field_o = -param0 + ns.field_g;
                          if (var7 == 0) {
                            break L42;
                          } else {
                            break L44;
                          }
                        }
                      }
                    }
                    boa.field_o = param1;
                    fv.field_e = qda.field_i + -param0;
                    break L42;
                  }
                  fv.field_e = fv.field_e & hba.field_b;
                  boa.field_o = boa.field_o & una.field_b;
                  return;
                } else {
                  fv.field_e = fv.field_e & hba.field_b;
                  boa.field_o = boa.field_o & una.field_b;
                  return;
                }
              }
            }
          }
          L46: {
            if (0.0f > var6) {
              break L46;
            } else {
              if ((double)var6 > 0.7853981633974483) {
                break L46;
              } else {
                fv.field_e = qda.field_i - param1;
                boa.field_o = ns.field_g - param0;
                if (var7 != 0) {
                  L47: {
                    if ((double)var6 < 0.7853981633974483) {
                      break L47;
                    } else {
                      if ((double)var6 > 1.5707963267948966) {
                        break L47;
                      } else {
                        boa.field_o = ns.field_g + -param1;
                        fv.field_e = qda.field_i + -param0;
                        break L47;
                      }
                    }
                  }
                  L48: {
                    L49: {
                      L50: {
                        if ((double)var6 < 1.5707963267948966) {
                          break L50;
                        } else {
                          if (2.356194490192345 >= (double)var6) {
                            break L49;
                          } else {
                            break L50;
                          }
                        }
                      }
                      if (2.356194490192345 > (double)var6) {
                        break L48;
                      } else {
                        if ((double)var6 > 3.141592653589793) {
                          break L48;
                        } else {
                          fv.field_e = param1;
                          boa.field_o = -param0 + ns.field_g;
                          if (var7 == 0) {
                            break L48;
                          } else {
                            break L49;
                          }
                        }
                      }
                    }
                    boa.field_o = param1;
                    fv.field_e = qda.field_i + -param0;
                    break L48;
                  }
                  fv.field_e = fv.field_e & hba.field_b;
                  boa.field_o = boa.field_o & una.field_b;
                  return;
                } else {
                  fv.field_e = fv.field_e & hba.field_b;
                  boa.field_o = boa.field_o & una.field_b;
                  return;
                }
              }
            }
          }
          L51: {
            if ((double)var6 < 0.7853981633974483) {
              break L51;
            } else {
              if ((double)var6 > 1.5707963267948966) {
                break L51;
              } else {
                boa.field_o = ns.field_g + -param1;
                fv.field_e = qda.field_i + -param0;
                if (var7 != 0) {
                  L52: {
                    L53: {
                      L54: {
                        if ((double)var6 < 1.5707963267948966) {
                          break L54;
                        } else {
                          if (2.356194490192345 >= (double)var6) {
                            break L53;
                          } else {
                            break L54;
                          }
                        }
                      }
                      if (2.356194490192345 > (double)var6) {
                        break L52;
                      } else {
                        if ((double)var6 > 3.141592653589793) {
                          break L52;
                        } else {
                          fv.field_e = param1;
                          boa.field_o = -param0 + ns.field_g;
                          if (var7 == 0) {
                            break L52;
                          } else {
                            break L53;
                          }
                        }
                      }
                    }
                    boa.field_o = param1;
                    fv.field_e = qda.field_i + -param0;
                    break L52;
                  }
                  fv.field_e = fv.field_e & hba.field_b;
                  boa.field_o = boa.field_o & una.field_b;
                  return;
                } else {
                  fv.field_e = fv.field_e & hba.field_b;
                  boa.field_o = boa.field_o & una.field_b;
                  return;
                }
              }
            }
          }
          if ((double)var6 < 1.5707963267948966) {
            if (2.356194490192345 <= (double)var6) {
              if ((double)var6 <= 3.141592653589793) {
                fv.field_e = param1;
                boa.field_o = -param0 + ns.field_g;
                if (var7 == 0) {
                  fv.field_e = fv.field_e & hba.field_b;
                  boa.field_o = boa.field_o & una.field_b;
                  return;
                } else {
                  boa.field_o = param1;
                  fv.field_e = qda.field_i + -param0;
                  fv.field_e = fv.field_e & hba.field_b;
                  boa.field_o = boa.field_o & una.field_b;
                  return;
                }
              } else {
                fv.field_e = fv.field_e & hba.field_b;
                boa.field_o = boa.field_o & una.field_b;
                return;
              }
            } else {
              fv.field_e = fv.field_e & hba.field_b;
              boa.field_o = boa.field_o & una.field_b;
              return;
            }
          } else {
            if (2.356194490192345 < (double)var6) {
              L55: {
                if (2.356194490192345 > (double)var6) {
                  break L55;
                } else {
                  if ((double)var6 > 3.141592653589793) {
                    break L55;
                  } else {
                    fv.field_e = param1;
                    boa.field_o = -param0 + ns.field_g;
                    if (var7 == 0) {
                      break L55;
                    } else {
                      boa.field_o = param1;
                      fv.field_e = qda.field_i + -param0;
                      break L55;
                    }
                  }
                }
              }
              fv.field_e = fv.field_e & hba.field_b;
              boa.field_o = boa.field_o & una.field_b;
              return;
            } else {
              boa.field_o = param1;
              fv.field_e = qda.field_i + -param0;
              fv.field_e = fv.field_e & hba.field_b;
              boa.field_o = boa.field_o & una.field_b;
              return;
            }
          }
        }
    }

    final void a(byte param0, uia param1, int param2) {
        RuntimeException var4 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (0 == param2) {
                L2: {
                  stackOut_2_0 = this;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_3_0 = stackOut_2_0;
                  if ((param1.h(param0 + 148) ^ -1) != -2) {
                    stackOut_4_0 = this;
                    stackOut_4_1 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    break L2;
                  } else {
                    stackOut_3_0 = this;
                    stackOut_3_1 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    break L2;
                  }
                }
                ((fl) (this)).field_g = stackIn_5_1 != 0;
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              if (param0 == 107) {
                break L3;
              } else {
                field_m = -44;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var4);
            stackOut_9_1 = new StringBuilder().append("fl.A(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ')');
        }
    }

    final int[][] b(int param0, int param1) {
        int[][] var3 = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var9 = 0;
        int[][] var10 = null;
        int[][] var11 = null;
        int[][] var13 = null;
        int[][] var24 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        var13 = this.field_h.a(param0, (byte) -43);
        var11 = var13;
        var10 = var11;
        var3 = var10;
        if (this.field_h.field_f) {
          var4 = var13[0];
          var5 = var13[1];
          var6 = var13[2];
          var7 = 0;
          L0: while (true) {
            if (var7 >= ns.field_g) {
              if (param1 == -1) {
                return var10;
              } else {
                this.d(68, 15, 61);
                return var10;
              }
            } else {
              this.d(var7, param0, -5455);
              var24 = this.a(fv.field_e, 0, -1);
              var4[var7] = var24[0][boa.field_o];
              var5[var7] = var24[1][boa.field_o];
              var6[var7] = var24[2][boa.field_o];
              var7++;
              if (var9 == 0) {
                continue L0;
              } else {
                return var10;
              }
            }
          }
        } else {
          if (param1 == -1) {
            return var10;
          } else {
            this.d(68, 15, 61);
            return var10;
          }
        }
    }

    public fl() {
        super(1, false);
    }

    static {
        field_m = 0;
    }
}
