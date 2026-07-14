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
        ((er) this).field_g = param0;
    }

    public static void c(int param0) {
        field_j = null;
        if (param0 != 4) {
            return;
        }
        field_f = null;
    }

    final static boolean a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          var2 = ZombieDawnMulti.field_E ? 1 : 0;
          if (ai.field_b != ma.field_d) {
            se.field_E = se.field_E - 40;
            if (se.field_E <= 0) {
              L1: {
                se.field_E = 0;
                ml.field_Jb = gn.field_I[hg.field_rb];
                ma.field_d = ai.field_b;
                if (hg.field_rb >= -1 + lm.field_pb) {
                  stackOut_50_0 = 0;
                  stackIn_51_0 = stackOut_50_0;
                  break L1;
                } else {
                  stackOut_49_0 = 1;
                  stackIn_51_0 = stackOut_49_0;
                  break L1;
                }
              }
              dg.field_J = stackIn_51_0 != 0;
              if (0 <= ai.field_b) {
                if (-1 >= (ml.field_Jb ^ -1)) {
                  var1 = pb.field_e.b(ei.field_g[ma.field_d][ml.field_Jb], 400);
                  hj.field_g = 4 + (20 + var1 * (pb.field_e.field_C + pb.field_e.field_r));
                  if (pp.field_n) {
                    break L0;
                  } else {
                    hj.field_g = hj.field_g + 20;
                    break L0;
                  }
                } else {
                  break L0;
                }
              } else {
                L2: {
                  if (ai.field_b != 21) {
                    break L2;
                  } else {
                    if (10 != hg.field_rb) {
                      break L2;
                    } else {
                      if (!fb.field_e.field_I.a(true)) {
                        df.a(param0 + -16504, 9);
                        w.field_m = w.field_m & -1025;
                        break L2;
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
              if (!io.field_g) {
                if (!io.field_g) {
                  if (se.field_E > 0) {
                    se.field_E = se.field_E - 40;
                    if ((se.field_E ^ -1) >= -1) {
                      L3: {
                        se.field_E = 0;
                        if (ai.field_b != 21) {
                          break L3;
                        } else {
                          if (10 != hg.field_rb) {
                            break L3;
                          } else {
                            if (!fb.field_e.field_I.a(true)) {
                              df.a(param0 + -16504, 9);
                              w.field_m = w.field_m & -1025;
                              break L3;
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
                      if (param0 == -802) {
                        return false;
                      } else {
                        field_k = -56;
                        return false;
                      }
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
                            break L5;
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
                  L6: {
                    if (ai.field_b != 21) {
                      break L6;
                    } else {
                      if (10 != hg.field_rb) {
                        break L6;
                      } else {
                        if (!fb.field_e.field_I.a(true)) {
                          df.a(param0 + -16504, 9);
                          w.field_m = w.field_m & -1025;
                          break L6;
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
                if ((se.field_E ^ -1) > -401) {
                  se.field_E = se.field_E + 40;
                  if (-401 <= (se.field_E ^ -1)) {
                    break L0;
                  } else {
                    L7: {
                      se.field_E = 400;
                      if (ai.field_b != 21) {
                        break L7;
                      } else {
                        if (10 != hg.field_rb) {
                          break L7;
                        } else {
                          if (!fb.field_e.field_I.a(true)) {
                            df.a(param0 + -16504, 9);
                            w.field_m = w.field_m & -1025;
                            break L7;
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
                  L8: {
                    if (io.field_g) {
                      break L8;
                    } else {
                      if (se.field_E > 0) {
                        se.field_E = se.field_E - 40;
                        if ((se.field_E ^ -1) < -1) {
                          break L8;
                        } else {
                          se.field_E = 0;
                          break L8;
                        }
                      } else {
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (ai.field_b != 21) {
                      break L9;
                    } else {
                      if (10 != hg.field_rb) {
                        break L9;
                      } else {
                        if (!fb.field_e.field_I.a(true)) {
                          df.a(param0 + -16504, 9);
                          w.field_m = w.field_m & -1025;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  L10: {
                    if (param0 == -802) {
                      break L10;
                    } else {
                      field_k = -56;
                      break L10;
                    }
                  }
                  return false;
                }
              }
            } else {
              L11: {
                se.field_E = se.field_E - 40;
                if (se.field_E <= 0) {
                  L12: {
                    se.field_E = 0;
                    ml.field_Jb = gn.field_I[hg.field_rb];
                    ma.field_d = ai.field_b;
                    if (hg.field_rb >= -1 + lm.field_pb) {
                      stackOut_6_0 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      break L12;
                    } else {
                      stackOut_5_0 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      break L12;
                    }
                  }
                  dg.field_J = stackIn_7_0 != 0;
                  if (0 <= ai.field_b) {
                    if (-1 >= (ml.field_Jb ^ -1)) {
                      var1 = pb.field_e.b(ei.field_g[ma.field_d][ml.field_Jb], 400);
                      hj.field_g = 4 + (20 + var1 * (pb.field_e.field_C + pb.field_e.field_r));
                      if (pp.field_n) {
                        L13: {
                          if (ai.field_b != 21) {
                            break L13;
                          } else {
                            if (10 != hg.field_rb) {
                              break L13;
                            } else {
                              if (!fb.field_e.field_I.a(true)) {
                                df.a(param0 + -16504, 9);
                                w.field_m = w.field_m & -1025;
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                          }
                        }
                        L14: {
                          if (param0 == -802) {
                            break L14;
                          } else {
                            field_k = -56;
                            break L14;
                          }
                        }
                        return false;
                      } else {
                        hj.field_g = hj.field_g + 20;
                        L15: {
                          if (ai.field_b != 21) {
                            break L15;
                          } else {
                            if (10 != hg.field_rb) {
                              break L15;
                            } else {
                              if (!fb.field_e.field_I.a(true)) {
                                df.a(param0 + -16504, 9);
                                w.field_m = w.field_m & -1025;
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                          }
                        }
                        L16: {
                          if (param0 == -802) {
                            break L16;
                          } else {
                            field_k = -56;
                            break L16;
                          }
                        }
                        return false;
                      }
                    } else {
                      break L11;
                    }
                  } else {
                    L17: {
                      if (ai.field_b != 21) {
                        break L17;
                      } else {
                        if (10 != hg.field_rb) {
                          break L17;
                        } else {
                          if (!fb.field_e.field_I.a(true)) {
                            df.a(param0 + -16504, 9);
                            w.field_m = w.field_m & -1025;
                            break L17;
                          } else {
                            break L17;
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
                  break L11;
                }
              }
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
              L19: {
                if (param0 == -802) {
                  break L19;
                } else {
                  field_k = -56;
                  break L19;
                }
              }
              return false;
            }
          }
        }
        L20: {
          if (ai.field_b != 21) {
            break L20;
          } else {
            if (10 != hg.field_rb) {
              break L20;
            } else {
              if (!fb.field_e.field_I.a(true)) {
                df.a(param0 + -16504, 9);
                w.field_m = w.field_m & -1025;
                break L20;
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
        if (ud.a(param1, param4, param3, (byte) -42)) {
          if (param2 != 0) {
            boolean discarded$2 = er.a(5);
            return rb.a(103, param0.a(param1, true, param3));
          } else {
            return rb.a(103, param0.a(param1, true, param3));
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new ma();
        field_h = 0;
        field_i = field_h;
        field_k = 0;
    }
}
