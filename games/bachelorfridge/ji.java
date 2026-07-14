/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji extends bw {
    int field_h;
    static int[] field_i;
    static String field_g;
    static jg field_f;

    final static void a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_24_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_142_0 = 0;
        int stackIn_205_0 = 0;
        int stackIn_236_0 = 0;
        int stackIn_266_0 = 0;
        int stackOut_265_0 = 0;
        int stackOut_264_0 = 0;
        int stackOut_262_0 = 0;
        int stackOut_260_0 = 0;
        int stackOut_235_0 = 0;
        int stackOut_234_0 = 0;
        int stackOut_232_0 = 0;
        int stackOut_230_0 = 0;
        int stackOut_204_0 = 0;
        int stackOut_203_0 = 0;
        int stackOut_201_0 = 0;
        int stackOut_199_0 = 0;
        int stackOut_141_0 = 0;
        int stackOut_140_0 = 0;
        int stackOut_138_0 = 0;
        int stackOut_136_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        var3 = BachelorFridge.field_y;
        if (param0 < -87) {
          if ((ld.field_n ^ -1) == 0) {
            if ((hda.field_o ^ -1) != 0) {
              L0: {
                df.field_o = df.field_o + 1;
                if (param1 != null) {
                  if (!param1.equals((Object) (Object) ov.field_g)) {
                    L1: {
                      if (!b.field_r) {
                        if (pv.field_i <= df.field_o) {
                          if (pv.field_i - -oha.field_i <= df.field_o) {
                            stackOut_265_0 = 0;
                            stackIn_266_0 = stackOut_265_0;
                            break L1;
                          } else {
                            stackOut_264_0 = 1;
                            stackIn_266_0 = stackOut_264_0;
                            break L1;
                          }
                        } else {
                          stackOut_262_0 = 0;
                          stackIn_266_0 = stackOut_262_0;
                          break L1;
                        }
                      } else {
                        stackOut_260_0 = 0;
                        stackIn_266_0 = stackOut_260_0;
                        break L1;
                      }
                    }
                    L2: {
                      var2 = stackIn_266_0;
                      if (param1 == null) {
                        df.field_o = 0;
                        break L2;
                      } else {
                        if (b.field_r) {
                          L3: {
                            df.field_o = pv.field_i;
                            if (param1 != null) {
                              b.field_r = false;
                              break L3;
                            } else {
                              if (var2 == 0) {
                                break L3;
                              } else {
                                b.field_r = true;
                                break L3;
                              }
                            }
                          }
                          L4: {
                            jl.field_s = ld.field_n;
                            eaa.field_b = hda.field_o;
                            ov.field_g = param1;
                            if (b.field_r) {
                              break L4;
                            } else {
                              if (pv.field_i <= df.field_o) {
                                break L4;
                              } else {
                                if (dda.field_f) {
                                  jl.field_s = ld.field_n;
                                  df.field_o = 0;
                                  eaa.field_b = hda.field_o;
                                  break L4;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          L5: {
                            ld.field_n = -1;
                            hda.field_o = -1;
                            if (!b.field_r) {
                              break L5;
                            } else {
                              if (df.field_o != lfa.field_o) {
                                break L5;
                              } else {
                                df.field_o = 0;
                                b.field_r = false;
                                break L5;
                              }
                            }
                          }
                          return;
                        } else {
                          if (var2 != 0) {
                            L6: {
                              df.field_o = pv.field_i;
                              if (param1 != null) {
                                b.field_r = false;
                                break L6;
                              } else {
                                if (var2 == 0) {
                                  break L6;
                                } else {
                                  b.field_r = true;
                                  break L6;
                                }
                              }
                            }
                            L7: {
                              jl.field_s = ld.field_n;
                              eaa.field_b = hda.field_o;
                              ov.field_g = param1;
                              if (b.field_r) {
                                break L7;
                              } else {
                                if (pv.field_i <= df.field_o) {
                                  break L7;
                                } else {
                                  if (dda.field_f) {
                                    jl.field_s = ld.field_n;
                                    df.field_o = 0;
                                    eaa.field_b = hda.field_o;
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            ld.field_n = -1;
                            hda.field_o = -1;
                            if (b.field_r) {
                              if (df.field_o == lfa.field_o) {
                                df.field_o = 0;
                                b.field_r = false;
                                return;
                              } else {
                                return;
                              }
                            } else {
                              return;
                            }
                          } else {
                            df.field_o = 0;
                            break L2;
                          }
                        }
                      }
                    }
                    if (param1 != null) {
                      L8: {
                        b.field_r = false;
                        jl.field_s = ld.field_n;
                        eaa.field_b = hda.field_o;
                        ov.field_g = param1;
                        if (b.field_r) {
                          break L8;
                        } else {
                          if (pv.field_i <= df.field_o) {
                            break L8;
                          } else {
                            if (dda.field_f) {
                              jl.field_s = ld.field_n;
                              df.field_o = 0;
                              eaa.field_b = hda.field_o;
                              break L8;
                            } else {
                              L9: {
                                ld.field_n = -1;
                                hda.field_o = -1;
                                if (!b.field_r) {
                                  break L9;
                                } else {
                                  if (df.field_o != lfa.field_o) {
                                    break L9;
                                  } else {
                                    df.field_o = 0;
                                    b.field_r = false;
                                    break L9;
                                  }
                                }
                              }
                              return;
                            }
                          }
                        }
                      }
                      ld.field_n = -1;
                      hda.field_o = -1;
                      if (b.field_r) {
                        if (df.field_o != lfa.field_o) {
                          return;
                        } else {
                          df.field_o = 0;
                          b.field_r = false;
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      if (var2 == 0) {
                        jl.field_s = ld.field_n;
                        eaa.field_b = hda.field_o;
                        break L0;
                      } else {
                        L10: {
                          b.field_r = true;
                          jl.field_s = ld.field_n;
                          eaa.field_b = hda.field_o;
                          ov.field_g = param1;
                          if (b.field_r) {
                            break L10;
                          } else {
                            if (pv.field_i <= df.field_o) {
                              break L10;
                            } else {
                              if (dda.field_f) {
                                jl.field_s = ld.field_n;
                                df.field_o = 0;
                                eaa.field_b = hda.field_o;
                                break L10;
                              } else {
                                L11: {
                                  ld.field_n = -1;
                                  hda.field_o = -1;
                                  if (!b.field_r) {
                                    break L11;
                                  } else {
                                    if (df.field_o != lfa.field_o) {
                                      break L11;
                                    } else {
                                      df.field_o = 0;
                                      b.field_r = false;
                                      break L11;
                                    }
                                  }
                                }
                                return;
                              }
                            }
                          }
                        }
                        ld.field_n = -1;
                        hda.field_o = -1;
                        if (b.field_r) {
                          if (df.field_o != lfa.field_o) {
                            return;
                          } else {
                            df.field_o = 0;
                            b.field_r = false;
                            return;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    break L0;
                  }
                } else {
                  if (null != ov.field_g) {
                    break L0;
                  } else {
                    L12: {
                      if (!b.field_r) {
                        if (pv.field_i <= df.field_o) {
                          if (pv.field_i - -oha.field_i <= df.field_o) {
                            stackOut_235_0 = 0;
                            stackIn_236_0 = stackOut_235_0;
                            break L12;
                          } else {
                            stackOut_234_0 = 1;
                            stackIn_236_0 = stackOut_234_0;
                            break L12;
                          }
                        } else {
                          stackOut_232_0 = 0;
                          stackIn_236_0 = stackOut_232_0;
                          break L12;
                        }
                      } else {
                        stackOut_230_0 = 0;
                        stackIn_236_0 = stackOut_230_0;
                        break L12;
                      }
                    }
                    L13: {
                      var2 = stackIn_236_0;
                      if (param1 == null) {
                        df.field_o = 0;
                        break L13;
                      } else {
                        L14: {
                          if (b.field_r) {
                            break L14;
                          } else {
                            if (var2 != 0) {
                              break L14;
                            } else {
                              df.field_o = 0;
                              break L13;
                            }
                          }
                        }
                        df.field_o = pv.field_i;
                        break L13;
                      }
                    }
                    L15: {
                      if (param1 != null) {
                        b.field_r = false;
                        break L15;
                      } else {
                        if (var2 == 0) {
                          break L15;
                        } else {
                          b.field_r = true;
                          break L15;
                        }
                      }
                    }
                    L16: {
                      jl.field_s = ld.field_n;
                      eaa.field_b = hda.field_o;
                      ov.field_g = param1;
                      if (b.field_r) {
                        break L16;
                      } else {
                        if (pv.field_i <= df.field_o) {
                          break L16;
                        } else {
                          if (dda.field_f) {
                            jl.field_s = ld.field_n;
                            df.field_o = 0;
                            eaa.field_b = hda.field_o;
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                      }
                    }
                    L17: {
                      ld.field_n = -1;
                      hda.field_o = -1;
                      if (!b.field_r) {
                        break L17;
                      } else {
                        if (df.field_o != lfa.field_o) {
                          break L17;
                        } else {
                          df.field_o = 0;
                          b.field_r = false;
                          break L17;
                        }
                      }
                    }
                    return;
                  }
                }
              }
              L18: {
                ov.field_g = param1;
                if (b.field_r) {
                  break L18;
                } else {
                  if (pv.field_i <= df.field_o) {
                    break L18;
                  } else {
                    if (dda.field_f) {
                      jl.field_s = ld.field_n;
                      df.field_o = 0;
                      eaa.field_b = hda.field_o;
                      break L18;
                    } else {
                      ld.field_n = -1;
                      hda.field_o = -1;
                      if (b.field_r) {
                        if (df.field_o != lfa.field_o) {
                          return;
                        } else {
                          df.field_o = 0;
                          b.field_r = false;
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
              L19: {
                ld.field_n = -1;
                hda.field_o = -1;
                if (!b.field_r) {
                  break L19;
                } else {
                  if (df.field_o != lfa.field_o) {
                    break L19;
                  } else {
                    df.field_o = 0;
                    b.field_r = false;
                    return;
                  }
                }
              }
              return;
            } else {
              L20: {
                L21: {
                  ld.field_n = mk.field_p;
                  hda.field_o = gd.field_m;
                  df.field_o = df.field_o + 1;
                  if (param1 != null) {
                    if (!param1.equals((Object) (Object) ov.field_g)) {
                      break L21;
                    } else {
                      break L20;
                    }
                  } else {
                    if (null != ov.field_g) {
                      break L20;
                    } else {
                      break L21;
                    }
                  }
                }
                L22: {
                  if (!b.field_r) {
                    if (pv.field_i <= df.field_o) {
                      if (pv.field_i - -oha.field_i <= df.field_o) {
                        stackOut_204_0 = 0;
                        stackIn_205_0 = stackOut_204_0;
                        break L22;
                      } else {
                        stackOut_203_0 = 1;
                        stackIn_205_0 = stackOut_203_0;
                        break L22;
                      }
                    } else {
                      stackOut_201_0 = 0;
                      stackIn_205_0 = stackOut_201_0;
                      break L22;
                    }
                  } else {
                    stackOut_199_0 = 0;
                    stackIn_205_0 = stackOut_199_0;
                    break L22;
                  }
                }
                L23: {
                  var2 = stackIn_205_0;
                  if (param1 == null) {
                    df.field_o = 0;
                    break L23;
                  } else {
                    L24: {
                      if (b.field_r) {
                        break L24;
                      } else {
                        if (var2 != 0) {
                          break L24;
                        } else {
                          df.field_o = 0;
                          break L23;
                        }
                      }
                    }
                    df.field_o = pv.field_i;
                    break L23;
                  }
                }
                L25: {
                  if (param1 != null) {
                    b.field_r = false;
                    break L25;
                  } else {
                    if (var2 == 0) {
                      break L25;
                    } else {
                      b.field_r = true;
                      break L25;
                    }
                  }
                }
                jl.field_s = ld.field_n;
                eaa.field_b = hda.field_o;
                break L20;
              }
              L26: {
                ov.field_g = param1;
                if (b.field_r) {
                  break L26;
                } else {
                  if (pv.field_i <= df.field_o) {
                    break L26;
                  } else {
                    if (dda.field_f) {
                      jl.field_s = ld.field_n;
                      df.field_o = 0;
                      eaa.field_b = hda.field_o;
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                }
              }
              L27: {
                ld.field_n = -1;
                hda.field_o = -1;
                if (!b.field_r) {
                  break L27;
                } else {
                  if (df.field_o != lfa.field_o) {
                    break L27;
                  } else {
                    df.field_o = 0;
                    b.field_r = false;
                    break L27;
                  }
                }
              }
              return;
            }
          } else {
            df.field_o = df.field_o + 1;
            if (param1 != null) {
              if (!param1.equals((Object) (Object) ov.field_g)) {
                L28: {
                  if (!b.field_r) {
                    if (pv.field_i <= df.field_o) {
                      if (pv.field_i - -oha.field_i <= df.field_o) {
                        stackOut_141_0 = 0;
                        stackIn_142_0 = stackOut_141_0;
                        break L28;
                      } else {
                        stackOut_140_0 = 1;
                        stackIn_142_0 = stackOut_140_0;
                        break L28;
                      }
                    } else {
                      stackOut_138_0 = 0;
                      stackIn_142_0 = stackOut_138_0;
                      break L28;
                    }
                  } else {
                    stackOut_136_0 = 0;
                    stackIn_142_0 = stackOut_136_0;
                    break L28;
                  }
                }
                L29: {
                  var2 = stackIn_142_0;
                  if (param1 == null) {
                    df.field_o = 0;
                    break L29;
                  } else {
                    L30: {
                      if (b.field_r) {
                        break L30;
                      } else {
                        if (var2 != 0) {
                          break L30;
                        } else {
                          df.field_o = 0;
                          break L29;
                        }
                      }
                    }
                    df.field_o = pv.field_i;
                    break L29;
                  }
                }
                if (param1 == null) {
                  if (var2 == 0) {
                    L31: {
                      jl.field_s = ld.field_n;
                      eaa.field_b = hda.field_o;
                      ov.field_g = param1;
                      if (b.field_r) {
                        break L31;
                      } else {
                        if (pv.field_i <= df.field_o) {
                          break L31;
                        } else {
                          if (dda.field_f) {
                            jl.field_s = ld.field_n;
                            df.field_o = 0;
                            eaa.field_b = hda.field_o;
                            break L31;
                          } else {
                            break L31;
                          }
                        }
                      }
                    }
                    L32: {
                      ld.field_n = -1;
                      hda.field_o = -1;
                      if (!b.field_r) {
                        break L32;
                      } else {
                        if (df.field_o != lfa.field_o) {
                          break L32;
                        } else {
                          df.field_o = 0;
                          b.field_r = false;
                          break L32;
                        }
                      }
                    }
                    return;
                  } else {
                    b.field_r = true;
                    L33: {
                      jl.field_s = ld.field_n;
                      eaa.field_b = hda.field_o;
                      ov.field_g = param1;
                      if (b.field_r) {
                        break L33;
                      } else {
                        if (pv.field_i <= df.field_o) {
                          break L33;
                        } else {
                          if (dda.field_f) {
                            jl.field_s = ld.field_n;
                            df.field_o = 0;
                            eaa.field_b = hda.field_o;
                            break L33;
                          } else {
                            break L33;
                          }
                        }
                      }
                    }
                    L34: {
                      ld.field_n = -1;
                      hda.field_o = -1;
                      if (!b.field_r) {
                        break L34;
                      } else {
                        if (df.field_o != lfa.field_o) {
                          break L34;
                        } else {
                          df.field_o = 0;
                          b.field_r = false;
                          break L34;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  b.field_r = false;
                  L35: {
                    jl.field_s = ld.field_n;
                    eaa.field_b = hda.field_o;
                    ov.field_g = param1;
                    if (b.field_r) {
                      break L35;
                    } else {
                      if (pv.field_i <= df.field_o) {
                        break L35;
                      } else {
                        if (dda.field_f) {
                          jl.field_s = ld.field_n;
                          df.field_o = 0;
                          eaa.field_b = hda.field_o;
                          break L35;
                        } else {
                          break L35;
                        }
                      }
                    }
                  }
                  L36: {
                    ld.field_n = -1;
                    hda.field_o = -1;
                    if (!b.field_r) {
                      break L36;
                    } else {
                      if (df.field_o != lfa.field_o) {
                        break L36;
                      } else {
                        df.field_o = 0;
                        b.field_r = false;
                        break L36;
                      }
                    }
                  }
                  return;
                }
              } else {
                L37: {
                  ov.field_g = param1;
                  if (b.field_r) {
                    break L37;
                  } else {
                    if (pv.field_i <= df.field_o) {
                      break L37;
                    } else {
                      if (dda.field_f) {
                        jl.field_s = ld.field_n;
                        df.field_o = 0;
                        eaa.field_b = hda.field_o;
                        break L37;
                      } else {
                        break L37;
                      }
                    }
                  }
                }
                L38: {
                  ld.field_n = -1;
                  hda.field_o = -1;
                  if (!b.field_r) {
                    break L38;
                  } else {
                    if (df.field_o != lfa.field_o) {
                      break L38;
                    } else {
                      df.field_o = 0;
                      b.field_r = false;
                      break L38;
                    }
                  }
                }
                return;
              }
            } else {
              if (null != ov.field_g) {
                L39: {
                  ov.field_g = param1;
                  if (b.field_r) {
                    break L39;
                  } else {
                    if (pv.field_i <= df.field_o) {
                      break L39;
                    } else {
                      if (dda.field_f) {
                        jl.field_s = ld.field_n;
                        df.field_o = 0;
                        eaa.field_b = hda.field_o;
                        break L39;
                      } else {
                        break L39;
                      }
                    }
                  }
                }
                L40: {
                  ld.field_n = -1;
                  hda.field_o = -1;
                  if (!b.field_r) {
                    break L40;
                  } else {
                    if (df.field_o != lfa.field_o) {
                      break L40;
                    } else {
                      df.field_o = 0;
                      b.field_r = false;
                      break L40;
                    }
                  }
                }
                return;
              } else {
                L41: {
                  if (!b.field_r) {
                    if (pv.field_i <= df.field_o) {
                      if (pv.field_i - -oha.field_i <= df.field_o) {
                        stackOut_100_0 = 0;
                        stackIn_102_0 = stackOut_100_0;
                        break L41;
                      } else {
                        stackOut_99_0 = 1;
                        stackIn_102_0 = stackOut_99_0;
                        break L41;
                      }
                    } else {
                      stackOut_97_0 = 0;
                      stackIn_102_0 = stackOut_97_0;
                      break L41;
                    }
                  } else {
                    stackOut_95_0 = 0;
                    stackIn_102_0 = stackOut_95_0;
                    break L41;
                  }
                }
                L42: {
                  var2 = stackIn_102_0;
                  if (param1 == null) {
                    df.field_o = 0;
                    break L42;
                  } else {
                    L43: {
                      if (b.field_r) {
                        break L43;
                      } else {
                        if (var2 != 0) {
                          break L43;
                        } else {
                          df.field_o = 0;
                          break L42;
                        }
                      }
                    }
                    df.field_o = pv.field_i;
                    break L42;
                  }
                }
                L44: {
                  if (param1 != null) {
                    b.field_r = false;
                    break L44;
                  } else {
                    if (var2 == 0) {
                      break L44;
                    } else {
                      b.field_r = true;
                      break L44;
                    }
                  }
                }
                L45: {
                  jl.field_s = ld.field_n;
                  eaa.field_b = hda.field_o;
                  ov.field_g = param1;
                  if (b.field_r) {
                    break L45;
                  } else {
                    if (pv.field_i <= df.field_o) {
                      break L45;
                    } else {
                      if (dda.field_f) {
                        jl.field_s = ld.field_n;
                        df.field_o = 0;
                        eaa.field_b = hda.field_o;
                        break L45;
                      } else {
                        break L45;
                      }
                    }
                  }
                }
                L46: {
                  ld.field_n = -1;
                  hda.field_o = -1;
                  if (!b.field_r) {
                    break L46;
                  } else {
                    if (df.field_o != lfa.field_o) {
                      break L46;
                    } else {
                      df.field_o = 0;
                      b.field_r = false;
                      break L46;
                    }
                  }
                }
                return;
              }
            }
          }
        } else {
          L47: {
            ji.a(-69);
            if ((ld.field_n ^ -1) != 0) {
              break L47;
            } else {
              if ((hda.field_o ^ -1) != 0) {
                break L47;
              } else {
                ld.field_n = mk.field_p;
                hda.field_o = gd.field_m;
                break L47;
              }
            }
          }
          df.field_o = df.field_o + 1;
          if (param1 != null) {
            if (!param1.equals((Object) (Object) ov.field_g)) {
              L48: {
                if (!b.field_r) {
                  if (pv.field_i <= df.field_o) {
                    if (pv.field_i - -oha.field_i > df.field_o) {
                      stackOut_67_0 = 1;
                      stackIn_69_0 = stackOut_67_0;
                      break L48;
                    } else {
                      stackOut_66_0 = 0;
                      stackIn_69_0 = stackOut_66_0;
                      break L48;
                    }
                  } else {
                    stackOut_64_0 = 0;
                    stackIn_69_0 = stackOut_64_0;
                    break L48;
                  }
                } else {
                  stackOut_62_0 = 0;
                  stackIn_69_0 = stackOut_62_0;
                  break L48;
                }
              }
              L49: {
                L50: {
                  var2 = stackIn_69_0;
                  if (param1 == null) {
                    break L50;
                  } else {
                    if (!b.field_r) {
                      if (var2 == 0) {
                        break L50;
                      } else {
                        df.field_o = pv.field_i;
                        break L49;
                      }
                    } else {
                      df.field_o = pv.field_i;
                      break L49;
                    }
                  }
                }
                df.field_o = 0;
                break L49;
              }
              L51: {
                if (param1 != null) {
                  b.field_r = false;
                  break L51;
                } else {
                  if (var2 == 0) {
                    break L51;
                  } else {
                    b.field_r = true;
                    break L51;
                  }
                }
              }
              L52: {
                jl.field_s = ld.field_n;
                eaa.field_b = hda.field_o;
                ov.field_g = param1;
                if (!b.field_r) {
                  ld.field_n = -1;
                  hda.field_o = -1;
                  if (!b.field_r) {
                    break L52;
                  } else {
                    if (df.field_o != lfa.field_o) {
                      break L52;
                    } else {
                      df.field_o = 0;
                      b.field_r = false;
                      break L52;
                    }
                  }
                } else {
                  ld.field_n = -1;
                  hda.field_o = -1;
                  if (!b.field_r) {
                    break L52;
                  } else {
                    if (df.field_o != lfa.field_o) {
                      break L52;
                    } else {
                      df.field_o = 0;
                      b.field_r = false;
                      break L52;
                    }
                  }
                }
              }
              return;
            } else {
              L53: {
                ov.field_g = param1;
                if (b.field_r) {
                  break L53;
                } else {
                  if (pv.field_i <= df.field_o) {
                    break L53;
                  } else {
                    if (dda.field_f) {
                      jl.field_s = ld.field_n;
                      df.field_o = 0;
                      eaa.field_b = hda.field_o;
                      break L53;
                    } else {
                      break L53;
                    }
                  }
                }
              }
              L54: {
                ld.field_n = -1;
                hda.field_o = -1;
                if (!b.field_r) {
                  break L54;
                } else {
                  if (df.field_o != lfa.field_o) {
                    break L54;
                  } else {
                    df.field_o = 0;
                    b.field_r = false;
                    break L54;
                  }
                }
              }
              return;
            }
          } else {
            if (null == ov.field_g) {
              L55: {
                if (!b.field_r) {
                  if (pv.field_i <= df.field_o) {
                    if (pv.field_i - -oha.field_i > df.field_o) {
                      stackOut_22_0 = 1;
                      stackIn_24_0 = stackOut_22_0;
                      break L55;
                    } else {
                      stackOut_21_0 = 0;
                      stackIn_24_0 = stackOut_21_0;
                      break L55;
                    }
                  } else {
                    stackOut_19_0 = 0;
                    stackIn_24_0 = stackOut_19_0;
                    break L55;
                  }
                } else {
                  stackOut_17_0 = 0;
                  stackIn_24_0 = stackOut_17_0;
                  break L55;
                }
              }
              L56: {
                var2 = stackIn_24_0;
                if (param1 == null) {
                  df.field_o = 0;
                  break L56;
                } else {
                  if (!b.field_r) {
                    if (var2 == 0) {
                      df.field_o = 0;
                      break L56;
                    } else {
                      df.field_o = pv.field_i;
                      break L56;
                    }
                  } else {
                    df.field_o = pv.field_i;
                    break L56;
                  }
                }
              }
              L57: {
                if (param1 != null) {
                  b.field_r = false;
                  jl.field_s = ld.field_n;
                  eaa.field_b = hda.field_o;
                  break L57;
                } else {
                  if (var2 == 0) {
                    jl.field_s = ld.field_n;
                    eaa.field_b = hda.field_o;
                    break L57;
                  } else {
                    b.field_r = true;
                    jl.field_s = ld.field_n;
                    eaa.field_b = hda.field_o;
                    break L57;
                  }
                }
              }
              L58: {
                ov.field_g = param1;
                if (b.field_r) {
                  L59: {
                    ld.field_n = -1;
                    hda.field_o = -1;
                    if (b.field_r) {
                      break L59;
                    } else {
                      ld.field_n = -1;
                      hda.field_o = -1;
                      if (!b.field_r) {
                        break L58;
                      } else {
                        break L59;
                      }
                    }
                  }
                  if (df.field_o != lfa.field_o) {
                    break L58;
                  } else {
                    df.field_o = 0;
                    b.field_r = false;
                    break L58;
                  }
                } else {
                  ld.field_n = -1;
                  hda.field_o = -1;
                  if (!b.field_r) {
                    break L58;
                  } else {
                    if (df.field_o != lfa.field_o) {
                      break L58;
                    } else {
                      df.field_o = 0;
                      b.field_r = false;
                      break L58;
                    }
                  }
                }
              }
              return;
            } else {
              L60: {
                ov.field_g = param1;
                if (b.field_r) {
                  L61: {
                    ld.field_n = -1;
                    hda.field_o = -1;
                    if (b.field_r) {
                      break L61;
                    } else {
                      ld.field_n = -1;
                      hda.field_o = -1;
                      if (!b.field_r) {
                        break L60;
                      } else {
                        break L61;
                      }
                    }
                  }
                  if (df.field_o != lfa.field_o) {
                    break L60;
                  } else {
                    df.field_o = 0;
                    b.field_r = false;
                    break L60;
                  }
                } else {
                  ld.field_n = -1;
                  hda.field_o = -1;
                  if (!b.field_r) {
                    break L60;
                  } else {
                    if (df.field_o != lfa.field_o) {
                      break L60;
                    } else {
                      df.field_o = 0;
                      b.field_r = false;
                      break L60;
                    }
                  }
                }
              }
              return;
            }
          }
        }
    }

    ji(int param0) {
        ((ji) this).field_h = param0;
    }

    final static void a(boolean param0, int param1) {
        if (param1 < 40) {
          field_f = null;
          jna.a(true, param0);
          hda.a((byte) -91, param0);
          return;
        } else {
          jna.a(true, param0);
          hda.a((byte) -91, param0);
          return;
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_g = null;
        if (param0 < 10) {
            ji.a(111);
            field_i = null;
            return;
        }
        field_i = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Username: ";
        field_i = new int[8192];
        field_f = new jg();
    }
}
