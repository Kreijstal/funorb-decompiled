/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class er extends br {
    int field_g;
    static ma field_f;
    static int field_k;
    static int field_i;
    static int field_h;
    static ja field_j;

    er(int param0) {
        this.field_g = param0;
    }

    public static void c(int param0) {
        field_j = null;
        if (param0 != 4) {
            return;
        }
        field_f = null;
    }

    final static boolean a(int param0) {
        int stackIn_7_0 = 0;
        int stackIn_74_0 = 0;
        int var1;
        int var2;
        L0: {
          L1: {
            var2 = ZombieDawnMulti.field_E ? 1 : 0;
            if (ai.field_b != ma.field_d) {
              se.field_E = se.field_E - 40;
              if (se.field_E <= 0) {
                L2: {
                  se.field_E = 0;
                  ml.field_Jb = gn.field_I[hg.field_rb];
                  ma.field_d = ai.field_b;
                  if (hg.field_rb >= -1 + lm.field_pb) {
                    stackIn_74_0 = 0;
                    break L2;
                  } else {
                    stackIn_74_0 = 1;
                    break L2;
                  }
                }
                dg.field_J = stackIn_74_0 != 0;
                if (0 <= ai.field_b) {
                  if (-1 >= (ml.field_Jb ^ -1)) {
                    L3: {
                      var1 = pb.field_e.b(ei.field_g[ma.field_d][ml.field_Jb], 400);
                      hj.field_g = 4 + (20 + var1 * (pb.field_e.field_C + pb.field_e.field_r));
                      if (pp.field_n) {
                        break L3;
                      } else {
                        hj.field_g = hj.field_g + 20;
                        break L3;
                      }
                    }
                    if (var2 != 0) {
                      break L1;
                    } else {
                      L4: {
                        if (ai.field_b != 21) {
                          break L4;
                        } else {
                          if (10 != hg.field_rb) {
                            break L4;
                          } else {
                            if (!fb.field_e.field_I.a(true)) {
                              df.a(param0 + -16504, 9);
                              w.field_m = w.field_m & -1025;
                              break L4;
                            } else {
                              if (param0 != -802) {
                                field_k = -56;
                                return false;
                              } else {
                                return false;
                              }
                            }
                          }
                        }
                      }
                      if (param0 != -802) {
                        field_k = -56;
                        return false;
                      } else {
                        return false;
                      }
                    }
                  } else {
                    break L0;
                  }
                } else {
                  L5: {
                    if (ai.field_b != 21) {
                      break L5;
                    } else {
                      if (10 != hg.field_rb) {
                        break L5;
                      } else {
                        if (!fb.field_e.field_I.a(true)) {
                          df.a(param0 + -16504, 9);
                          w.field_m = w.field_m & -1025;
                          break L5;
                        } else {
                          if (param0 != -802) {
                            field_k = -56;
                            return false;
                          } else {
                            return false;
                          }
                        }
                      }
                    }
                  }
                  if (param0 != -802) {
                    field_k = -56;
                    return false;
                  } else {
                    return false;
                  }
                }
              } else {
                break L0;
              }
            } else {
              if (hg.field_rb == ml.field_Jb) {
                break L1;
              } else {
                L6: {
                  se.field_E = se.field_E - 40;
                  if (se.field_E <= 0) {
                    L7: {
                      se.field_E = 0;
                      ml.field_Jb = gn.field_I[hg.field_rb];
                      ma.field_d = ai.field_b;
                      if (hg.field_rb >= -1 + lm.field_pb) {
                        stackIn_7_0 = 0;
                        break L7;
                      } else {
                        stackIn_7_0 = 1;
                        break L7;
                      }
                    }
                    dg.field_J = stackIn_7_0 != 0;
                    if (0 <= ai.field_b) {
                      if (-1 >= (ml.field_Jb ^ -1)) {
                        var1 = pb.field_e.b(ei.field_g[ma.field_d][ml.field_Jb], 400);
                        hj.field_g = 4 + (20 + var1 * (pb.field_e.field_C + pb.field_e.field_r));
                        if (pp.field_n) {
                          L8: {
                            if (var2 == 0) {
                              break L8;
                            } else {
                              L9: {
                                L10: {
                                  if (!io.field_g) {
                                    break L10;
                                  } else {
                                    if ((se.field_E ^ -1) > -401) {
                                      break L9;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                if (io.field_g) {
                                  break L8;
                                } else {
                                  if (se.field_E > 0) {
                                    se.field_E = se.field_E - 40;
                                    if ((se.field_E ^ -1) < -1) {
                                      break L8;
                                    } else {
                                      se.field_E = 0;
                                      if (var2 == 0) {
                                        break L8;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              se.field_E = se.field_E + 40;
                              if (-401 <= (se.field_E ^ -1)) {
                                break L8;
                              } else {
                                se.field_E = 400;
                                break L8;
                              }
                            }
                          }
                          L11: {
                            if (ai.field_b != 21) {
                              break L11;
                            } else {
                              if (10 != hg.field_rb) {
                                break L11;
                              } else {
                                if (!fb.field_e.field_I.a(true)) {
                                  df.a(param0 + -16504, 9);
                                  w.field_m = w.field_m & -1025;
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                            }
                          }
                          L12: {
                            if (param0 == -802) {
                              break L12;
                            } else {
                              field_k = -56;
                              break L12;
                            }
                          }
                          return false;
                        } else {
                          L13: {
                            hj.field_g = hj.field_g + 20;
                            if (var2 == 0) {
                              break L13;
                            } else {
                              L14: {
                                L15: {
                                  if (!io.field_g) {
                                    break L15;
                                  } else {
                                    if ((se.field_E ^ -1) > -401) {
                                      break L14;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                                if (io.field_g) {
                                  break L13;
                                } else {
                                  if (se.field_E > 0) {
                                    se.field_E = se.field_E - 40;
                                    if ((se.field_E ^ -1) < -1) {
                                      break L13;
                                    } else {
                                      se.field_E = 0;
                                      if (var2 == 0) {
                                        break L13;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              se.field_E = se.field_E + 40;
                              if (-401 <= (se.field_E ^ -1)) {
                                break L13;
                              } else {
                                se.field_E = 400;
                                break L13;
                              }
                            }
                          }
                          L16: {
                            if (ai.field_b != 21) {
                              break L16;
                            } else {
                              if (10 != hg.field_rb) {
                                break L16;
                              } else {
                                if (!fb.field_e.field_I.a(true)) {
                                  df.a(param0 + -16504, 9);
                                  w.field_m = w.field_m & -1025;
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                            }
                          }
                          L17: {
                            if (param0 == -802) {
                              break L17;
                            } else {
                              field_k = -56;
                              break L17;
                            }
                          }
                          return false;
                        }
                      } else {
                        break L6;
                      }
                    } else {
                      L18: {
                        if (ai.field_b != 21) {
                          break L18;
                        } else {
                          if (10 != hg.field_rb) {
                            break L18;
                          } else {
                            if (!fb.field_e.field_I.a(true)) {
                              df.a(param0 + -16504, 9);
                              w.field_m = w.field_m & -1025;
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                        }
                      }
                      if (param0 != -802) {
                        field_k = -56;
                        return false;
                      } else {
                        return false;
                      }
                    }
                  } else {
                    break L6;
                  }
                }
                L19: {
                  if (ai.field_b != 21) {
                    break L19;
                  } else {
                    if (10 != hg.field_rb) {
                      break L19;
                    } else {
                      if (!fb.field_e.field_I.a(true)) {
                        df.a(param0 + -16504, 9);
                        w.field_m = w.field_m & -1025;
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                  }
                }
                L20: {
                  if (param0 == -802) {
                    break L20;
                  } else {
                    field_k = -56;
                    break L20;
                  }
                }
                return false;
              }
            }
          }
          if (!io.field_g) {
            if (io.field_g) {
              break L0;
            } else {
              if (se.field_E > 0) {
                se.field_E = se.field_E - 40;
                if ((se.field_E ^ -1) < -1) {
                  break L0;
                } else {
                  se.field_E = 0;
                  if (var2 == 0) {
                    break L0;
                  } else {
                    se.field_E = se.field_E + 40;
                    if (-401 <= (se.field_E ^ -1)) {
                      L21: {
                        if (ai.field_b != 21) {
                          break L21;
                        } else {
                          if (10 != hg.field_rb) {
                            break L21;
                          } else {
                            if (!fb.field_e.field_I.a(true)) {
                              df.a(param0 + -16504, 9);
                              w.field_m = w.field_m & -1025;
                              break L21;
                            } else {
                              if (param0 != -802) {
                                field_k = -56;
                                return false;
                              } else {
                                return false;
                              }
                            }
                          }
                        }
                      }
                      if (param0 != -802) {
                        field_k = -56;
                        return false;
                      } else {
                        return false;
                      }
                    } else {
                      L22: {
                        se.field_E = 400;
                        if (ai.field_b != 21) {
                          break L22;
                        } else {
                          if (10 != hg.field_rb) {
                            break L22;
                          } else {
                            if (!fb.field_e.field_I.a(true)) {
                              df.a(param0 + -16504, 9);
                              w.field_m = w.field_m & -1025;
                              break L22;
                            } else {
                              break L22;
                            }
                          }
                        }
                      }
                      L23: {
                        if (param0 == -802) {
                          break L23;
                        } else {
                          field_k = -56;
                          break L23;
                        }
                      }
                      return false;
                    }
                  }
                }
              } else {
                L24: {
                  if (ai.field_b != 21) {
                    break L24;
                  } else {
                    if (10 != hg.field_rb) {
                      break L24;
                    } else {
                      if (!fb.field_e.field_I.a(true)) {
                        df.a(param0 + -16504, 9);
                        w.field_m = w.field_m & -1025;
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                  }
                }
                L25: {
                  if (param0 == -802) {
                    break L25;
                  } else {
                    field_k = -56;
                    break L25;
                  }
                }
                return false;
              }
            }
          } else {
            if ((se.field_E ^ -1) > -401) {
              se.field_E = se.field_E + 40;
              if (-401 <= (se.field_E ^ -1)) {
                break L0;
              } else {
                L26: {
                  se.field_E = 400;
                  if (ai.field_b != 21) {
                    break L26;
                  } else {
                    if (10 != hg.field_rb) {
                      break L26;
                    } else {
                      if (!fb.field_e.field_I.a(true)) {
                        df.a(param0 + -16504, 9);
                        w.field_m = w.field_m & -1025;
                        break L26;
                      } else {
                        if (param0 == -802) {
                          return false;
                        } else {
                          field_k = -56;
                          return false;
                        }
                      }
                    }
                  }
                }
                if (param0 == -802) {
                  return false;
                } else {
                  field_k = -56;
                  return false;
                }
              }
            } else {
              L27: {
                if (io.field_g) {
                  break L27;
                } else {
                  if (se.field_E > 0) {
                    se.field_E = se.field_E - 40;
                    if ((se.field_E ^ -1) < -1) {
                      break L27;
                    } else {
                      se.field_E = 0;
                      if (var2 == 0) {
                        break L27;
                      } else {
                        se.field_E = se.field_E + 40;
                        if (-401 <= (se.field_E ^ -1)) {
                          break L27;
                        } else {
                          se.field_E = 400;
                          break L27;
                        }
                      }
                    }
                  } else {
                    break L27;
                  }
                }
              }
              L28: {
                if (ai.field_b != 21) {
                  break L28;
                } else {
                  if (10 != hg.field_rb) {
                    break L28;
                  } else {
                    if (!fb.field_e.field_I.a(true)) {
                      df.a(param0 + -16504, 9);
                      w.field_m = w.field_m & -1025;
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                }
              }
              L29: {
                if (param0 == -802) {
                  break L29;
                } else {
                  field_k = -56;
                  break L29;
                }
              }
              return false;
            }
          }
        }
        L30: {
          if (ai.field_b != 21) {
            break L30;
          } else {
            if (10 != hg.field_rb) {
              break L30;
            } else {
              if (!fb.field_e.field_I.a(true)) {
                df.a(param0 + -16504, 9);
                w.field_m = w.field_m & -1025;
                break L30;
              } else {
                if (param0 == -802) {
                  return false;
                } else {
                  field_k = -56;
                  return false;
                }
              }
            }
          }
        }
        if (param0 == -802) {
          return false;
        } else {
          field_k = -56;
          return false;
        }
    }

    final static ef a(ul param0, int param1, int param2, int param3, ul param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        ef stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (ud.a(param1, param4, param3, (byte) -42)) {
              L1: {
                if (param2 == 0) {
                  break L1;
                } else {
                  er.a(5);
                  break L1;
                }
              }
              stackIn_6_0 = rb.a(103, param0.a(param1, true, param3));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("er.C(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ef) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    static {
        field_f = new ma();
        field_h = 0;
        field_i = field_h;
        field_k = 0;
    }
}
