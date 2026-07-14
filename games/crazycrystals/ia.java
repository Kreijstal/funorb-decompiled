/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia extends ln {
    static int field_i;
    static String field_h;
    static int field_g;

    final int a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        var6 = CrazyCrystals.field_B;
        if (-2 > (((ia) this).field_c ^ -1)) {
          if (((ia) this).field_b <= 0) {
            return 0;
          } else {
            var3 = 105 / ((55 - param1) / 50);
            var4 = 0;
            var5 = 0;
            L0: while (true) {
              if (2 <= var5) {
                L1: {
                  if (var4 == ((ia) this).field_b) {
                    stackOut_9_0 = 1;
                    stackIn_10_0 = stackOut_9_0;
                    break L1;
                  } else {
                    stackOut_8_0 = 0;
                    stackIn_10_0 = stackOut_8_0;
                    break L1;
                  }
                }
                return stackIn_10_0;
              } else {
                var4 = var4 + q.field_a[param0].field_e[var5];
                var5++;
                continue L0;
              }
            }
          }
        } else {
          return 0;
        }
    }

    final static void a(byte param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_18_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_147_0 = 0;
        int stackIn_194_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_193_0 = 0;
        int stackOut_192_0 = 0;
        int stackOut_190_0 = 0;
        int stackOut_188_0 = 0;
        int stackOut_146_0 = 0;
        int stackOut_145_0 = 0;
        int stackOut_143_0 = 0;
        int stackOut_141_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        var3 = CrazyCrystals.field_B;
        if (param0 == -47) {
          L0: {
            if ((pe.field_i ^ -1) != 0) {
              break L0;
            } else {
              if (ce.field_gb == -1) {
                ce.field_gb = bm.field_h;
                pe.field_i = qh.field_i;
                break L0;
              } else {
                cl.field_o = cl.field_o + 1;
                if (param1 != null) {
                  if (param1.equals((Object) (Object) kf.field_f)) {
                    L1: {
                      kf.field_f = param1;
                      if (co.field_F) {
                        break L1;
                      } else {
                        if (cl.field_o >= ih.field_a) {
                          break L1;
                        } else {
                          if (ij.field_h) {
                            rf.field_G = ce.field_gb;
                            ni.field_b = pe.field_i;
                            cl.field_o = 0;
                            break L1;
                          } else {
                            break L1;
                          }
                        }
                      }
                    }
                    L2: {
                      pe.field_i = -1;
                      if (!co.field_F) {
                        break L2;
                      } else {
                        if (cl.field_o == lc.field_e) {
                          cl.field_o = 0;
                          co.field_F = false;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                    ce.field_gb = -1;
                    return;
                  } else {
                    L3: {
                      if (!co.field_F) {
                        if (cl.field_o >= ih.field_a) {
                          if (cl.field_o < ih.field_a - -u.field_a) {
                            stackOut_102_0 = 1;
                            stackIn_104_0 = stackOut_102_0;
                            break L3;
                          } else {
                            stackOut_101_0 = 0;
                            stackIn_104_0 = stackOut_101_0;
                            break L3;
                          }
                        } else {
                          stackOut_99_0 = 0;
                          stackIn_104_0 = stackOut_99_0;
                          break L3;
                        }
                      } else {
                        stackOut_97_0 = 0;
                        stackIn_104_0 = stackOut_97_0;
                        break L3;
                      }
                    }
                    L4: {
                      var2 = stackIn_104_0;
                      if (param1 == null) {
                        cl.field_o = 0;
                        break L4;
                      } else {
                        L5: {
                          if (co.field_F) {
                            break L5;
                          } else {
                            if (var2 != 0) {
                              break L5;
                            } else {
                              cl.field_o = 0;
                              break L4;
                            }
                          }
                        }
                        cl.field_o = ih.field_a;
                        break L4;
                      }
                    }
                    L6: {
                      if (param1 != null) {
                        co.field_F = false;
                        break L6;
                      } else {
                        if (var2 == 0) {
                          break L6;
                        } else {
                          co.field_F = true;
                          break L6;
                        }
                      }
                    }
                    L7: {
                      rf.field_G = ce.field_gb;
                      ni.field_b = pe.field_i;
                      kf.field_f = param1;
                      if (co.field_F) {
                        break L7;
                      } else {
                        if (cl.field_o >= ih.field_a) {
                          break L7;
                        } else {
                          if (ij.field_h) {
                            rf.field_G = ce.field_gb;
                            ni.field_b = pe.field_i;
                            cl.field_o = 0;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    L8: {
                      pe.field_i = -1;
                      if (!co.field_F) {
                        break L8;
                      } else {
                        if (cl.field_o == lc.field_e) {
                          cl.field_o = 0;
                          co.field_F = false;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                    }
                    ce.field_gb = -1;
                    return;
                  }
                } else {
                  if (kf.field_f != null) {
                    L9: {
                      kf.field_f = param1;
                      if (co.field_F) {
                        break L9;
                      } else {
                        if (cl.field_o >= ih.field_a) {
                          break L9;
                        } else {
                          if (ij.field_h) {
                            rf.field_G = ce.field_gb;
                            ni.field_b = pe.field_i;
                            cl.field_o = 0;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    L10: {
                      pe.field_i = -1;
                      if (!co.field_F) {
                        break L10;
                      } else {
                        if (cl.field_o == lc.field_e) {
                          cl.field_o = 0;
                          co.field_F = false;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                    }
                    ce.field_gb = -1;
                    return;
                  } else {
                    L11: {
                      if (!co.field_F) {
                        if (cl.field_o >= ih.field_a) {
                          if (cl.field_o >= ih.field_a - -u.field_a) {
                            stackOut_56_0 = 0;
                            stackIn_58_0 = stackOut_56_0;
                            break L11;
                          } else {
                            stackOut_55_0 = 1;
                            stackIn_58_0 = stackOut_55_0;
                            break L11;
                          }
                        } else {
                          stackOut_53_0 = 0;
                          stackIn_58_0 = stackOut_53_0;
                          break L11;
                        }
                      } else {
                        stackOut_51_0 = 0;
                        stackIn_58_0 = stackOut_51_0;
                        break L11;
                      }
                    }
                    L12: {
                      var2 = stackIn_58_0;
                      if (param1 == null) {
                        cl.field_o = 0;
                        break L12;
                      } else {
                        if (!co.field_F) {
                          if (var2 == 0) {
                            cl.field_o = 0;
                            break L12;
                          } else {
                            cl.field_o = ih.field_a;
                            break L12;
                          }
                        } else {
                          cl.field_o = ih.field_a;
                          break L12;
                        }
                      }
                    }
                    L13: {
                      if (param1 != null) {
                        co.field_F = false;
                        rf.field_G = ce.field_gb;
                        ni.field_b = pe.field_i;
                        break L13;
                      } else {
                        if (var2 == 0) {
                          rf.field_G = ce.field_gb;
                          ni.field_b = pe.field_i;
                          break L13;
                        } else {
                          co.field_F = true;
                          rf.field_G = ce.field_gb;
                          ni.field_b = pe.field_i;
                          break L13;
                        }
                      }
                    }
                    L14: {
                      kf.field_f = param1;
                      if (co.field_F) {
                        break L14;
                      } else {
                        if (cl.field_o >= ih.field_a) {
                          break L14;
                        } else {
                          if (ij.field_h) {
                            rf.field_G = ce.field_gb;
                            ni.field_b = pe.field_i;
                            cl.field_o = 0;
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                      }
                    }
                    L15: {
                      pe.field_i = -1;
                      if (!co.field_F) {
                        break L15;
                      } else {
                        if (cl.field_o == lc.field_e) {
                          cl.field_o = 0;
                          co.field_F = false;
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                    }
                    ce.field_gb = -1;
                    return;
                  }
                }
              }
            }
          }
          cl.field_o = cl.field_o + 1;
          if (param1 != null) {
            L16: {
              if (!param1.equals((Object) (Object) kf.field_f)) {
                L17: {
                  if (!co.field_F) {
                    if (cl.field_o >= ih.field_a) {
                      if (cl.field_o >= ih.field_a - -u.field_a) {
                        stackOut_193_0 = 0;
                        stackIn_194_0 = stackOut_193_0;
                        break L17;
                      } else {
                        stackOut_192_0 = 1;
                        stackIn_194_0 = stackOut_192_0;
                        break L17;
                      }
                    } else {
                      stackOut_190_0 = 0;
                      stackIn_194_0 = stackOut_190_0;
                      break L17;
                    }
                  } else {
                    stackOut_188_0 = 0;
                    stackIn_194_0 = stackOut_188_0;
                    break L17;
                  }
                }
                L18: {
                  var2 = stackIn_194_0;
                  if (param1 == null) {
                    cl.field_o = 0;
                    break L18;
                  } else {
                    if (co.field_F) {
                      L19: {
                        cl.field_o = ih.field_a;
                        if (param1 != null) {
                          co.field_F = false;
                          break L19;
                        } else {
                          if (var2 == 0) {
                            break L19;
                          } else {
                            co.field_F = true;
                            break L19;
                          }
                        }
                      }
                      L20: {
                        rf.field_G = ce.field_gb;
                        ni.field_b = pe.field_i;
                        kf.field_f = param1;
                        if (co.field_F) {
                          break L20;
                        } else {
                          if (cl.field_o >= ih.field_a) {
                            break L20;
                          } else {
                            if (ij.field_h) {
                              rf.field_G = ce.field_gb;
                              ni.field_b = pe.field_i;
                              cl.field_o = 0;
                              break L20;
                            } else {
                              break L20;
                            }
                          }
                        }
                      }
                      L21: {
                        pe.field_i = -1;
                        if (!co.field_F) {
                          break L21;
                        } else {
                          if (cl.field_o == lc.field_e) {
                            cl.field_o = 0;
                            co.field_F = false;
                            break L21;
                          } else {
                            break L21;
                          }
                        }
                      }
                      ce.field_gb = -1;
                      return;
                    } else {
                      if (var2 != 0) {
                        L22: {
                          cl.field_o = ih.field_a;
                          if (param1 != null) {
                            co.field_F = false;
                            break L22;
                          } else {
                            if (var2 == 0) {
                              break L22;
                            } else {
                              co.field_F = true;
                              break L22;
                            }
                          }
                        }
                        L23: {
                          rf.field_G = ce.field_gb;
                          ni.field_b = pe.field_i;
                          kf.field_f = param1;
                          if (co.field_F) {
                            break L23;
                          } else {
                            if (cl.field_o >= ih.field_a) {
                              break L23;
                            } else {
                              if (ij.field_h) {
                                rf.field_G = ce.field_gb;
                                ni.field_b = pe.field_i;
                                cl.field_o = 0;
                                break L23;
                              } else {
                                break L23;
                              }
                            }
                          }
                        }
                        pe.field_i = -1;
                        if (co.field_F) {
                          if (cl.field_o == lc.field_e) {
                            cl.field_o = 0;
                            co.field_F = false;
                            ce.field_gb = -1;
                            return;
                          } else {
                            ce.field_gb = -1;
                            return;
                          }
                        } else {
                          ce.field_gb = -1;
                          return;
                        }
                      } else {
                        cl.field_o = 0;
                        break L18;
                      }
                    }
                  }
                }
                if (param1 != null) {
                  L24: {
                    co.field_F = false;
                    rf.field_G = ce.field_gb;
                    ni.field_b = pe.field_i;
                    kf.field_f = param1;
                    if (co.field_F) {
                      break L24;
                    } else {
                      if (cl.field_o >= ih.field_a) {
                        break L24;
                      } else {
                        if (ij.field_h) {
                          rf.field_G = ce.field_gb;
                          ni.field_b = pe.field_i;
                          cl.field_o = 0;
                          break L24;
                        } else {
                          L25: {
                            pe.field_i = -1;
                            if (!co.field_F) {
                              break L25;
                            } else {
                              if (cl.field_o == lc.field_e) {
                                cl.field_o = 0;
                                co.field_F = false;
                                break L25;
                              } else {
                                break L25;
                              }
                            }
                          }
                          ce.field_gb = -1;
                          return;
                        }
                      }
                    }
                  }
                  pe.field_i = -1;
                  if (co.field_F) {
                    if (cl.field_o == lc.field_e) {
                      cl.field_o = 0;
                      co.field_F = false;
                      ce.field_gb = -1;
                      return;
                    } else {
                      ce.field_gb = -1;
                      return;
                    }
                  } else {
                    ce.field_gb = -1;
                    return;
                  }
                } else {
                  if (var2 == 0) {
                    rf.field_G = ce.field_gb;
                    ni.field_b = pe.field_i;
                    break L16;
                  } else {
                    co.field_F = true;
                    rf.field_G = ce.field_gb;
                    ni.field_b = pe.field_i;
                    kf.field_f = param1;
                    if (!co.field_F) {
                      L26: {
                        if (cl.field_o >= ih.field_a) {
                          break L26;
                        } else {
                          if (ij.field_h) {
                            rf.field_G = ce.field_gb;
                            ni.field_b = pe.field_i;
                            cl.field_o = 0;
                            break L26;
                          } else {
                            L27: {
                              pe.field_i = -1;
                              if (!co.field_F) {
                                break L27;
                              } else {
                                if (cl.field_o == lc.field_e) {
                                  cl.field_o = 0;
                                  co.field_F = false;
                                  break L27;
                                } else {
                                  break L27;
                                }
                              }
                            }
                            ce.field_gb = -1;
                            return;
                          }
                        }
                      }
                      pe.field_i = -1;
                      if (co.field_F) {
                        if (cl.field_o != lc.field_e) {
                          ce.field_gb = -1;
                          return;
                        } else {
                          cl.field_o = 0;
                          co.field_F = false;
                          ce.field_gb = -1;
                          return;
                        }
                      } else {
                        ce.field_gb = -1;
                        return;
                      }
                    } else {
                      pe.field_i = -1;
                      if (co.field_F) {
                        if (cl.field_o == lc.field_e) {
                          cl.field_o = 0;
                          co.field_F = false;
                          ce.field_gb = -1;
                          return;
                        } else {
                          ce.field_gb = -1;
                          return;
                        }
                      } else {
                        ce.field_gb = -1;
                        return;
                      }
                    }
                  }
                }
              } else {
                break L16;
              }
            }
            L28: {
              kf.field_f = param1;
              if (co.field_F) {
                break L28;
              } else {
                if (cl.field_o >= ih.field_a) {
                  break L28;
                } else {
                  if (ij.field_h) {
                    rf.field_G = ce.field_gb;
                    ni.field_b = pe.field_i;
                    cl.field_o = 0;
                    break L28;
                  } else {
                    L29: {
                      pe.field_i = -1;
                      if (!co.field_F) {
                        break L29;
                      } else {
                        if (cl.field_o == lc.field_e) {
                          cl.field_o = 0;
                          co.field_F = false;
                          break L29;
                        } else {
                          ce.field_gb = -1;
                          return;
                        }
                      }
                    }
                    ce.field_gb = -1;
                    return;
                  }
                }
              }
            }
            L30: {
              pe.field_i = -1;
              if (!co.field_F) {
                break L30;
              } else {
                if (cl.field_o == lc.field_e) {
                  cl.field_o = 0;
                  co.field_F = false;
                  break L30;
                } else {
                  ce.field_gb = -1;
                  return;
                }
              }
            }
            ce.field_gb = -1;
            return;
          } else {
            if (kf.field_f != null) {
              L31: {
                kf.field_f = param1;
                if (co.field_F) {
                  break L31;
                } else {
                  if (cl.field_o >= ih.field_a) {
                    break L31;
                  } else {
                    if (ij.field_h) {
                      rf.field_G = ce.field_gb;
                      ni.field_b = pe.field_i;
                      cl.field_o = 0;
                      break L31;
                    } else {
                      pe.field_i = -1;
                      if (co.field_F) {
                        if (cl.field_o != lc.field_e) {
                          ce.field_gb = -1;
                          return;
                        } else {
                          cl.field_o = 0;
                          co.field_F = false;
                          ce.field_gb = -1;
                          return;
                        }
                      } else {
                        ce.field_gb = -1;
                        return;
                      }
                    }
                  }
                }
              }
              pe.field_i = -1;
              if (co.field_F) {
                if (cl.field_o != lc.field_e) {
                  ce.field_gb = -1;
                  return;
                } else {
                  cl.field_o = 0;
                  co.field_F = false;
                  ce.field_gb = -1;
                  return;
                }
              } else {
                ce.field_gb = -1;
                return;
              }
            } else {
              L32: {
                if (!co.field_F) {
                  if (cl.field_o >= ih.field_a) {
                    if (cl.field_o >= ih.field_a - -u.field_a) {
                      stackOut_146_0 = 0;
                      stackIn_147_0 = stackOut_146_0;
                      break L32;
                    } else {
                      stackOut_145_0 = 1;
                      stackIn_147_0 = stackOut_145_0;
                      break L32;
                    }
                  } else {
                    stackOut_143_0 = 0;
                    stackIn_147_0 = stackOut_143_0;
                    break L32;
                  }
                } else {
                  stackOut_141_0 = 0;
                  stackIn_147_0 = stackOut_141_0;
                  break L32;
                }
              }
              L33: {
                var2 = stackIn_147_0;
                if (param1 == null) {
                  cl.field_o = 0;
                  break L33;
                } else {
                  L34: {
                    if (co.field_F) {
                      break L34;
                    } else {
                      if (var2 != 0) {
                        break L34;
                      } else {
                        cl.field_o = 0;
                        break L33;
                      }
                    }
                  }
                  cl.field_o = ih.field_a;
                  break L33;
                }
              }
              L35: {
                if (param1 != null) {
                  co.field_F = false;
                  break L35;
                } else {
                  if (var2 == 0) {
                    break L35;
                  } else {
                    co.field_F = true;
                    break L35;
                  }
                }
              }
              L36: {
                rf.field_G = ce.field_gb;
                ni.field_b = pe.field_i;
                kf.field_f = param1;
                if (co.field_F) {
                  break L36;
                } else {
                  if (cl.field_o >= ih.field_a) {
                    break L36;
                  } else {
                    if (ij.field_h) {
                      rf.field_G = ce.field_gb;
                      ni.field_b = pe.field_i;
                      cl.field_o = 0;
                      break L36;
                    } else {
                      break L36;
                    }
                  }
                }
              }
              L37: {
                pe.field_i = -1;
                if (!co.field_F) {
                  break L37;
                } else {
                  if (cl.field_o == lc.field_e) {
                    cl.field_o = 0;
                    co.field_F = false;
                    break L37;
                  } else {
                    break L37;
                  }
                }
              }
              ce.field_gb = -1;
              return;
            }
          }
        } else {
          L38: {
            field_g = -56;
            if ((pe.field_i ^ -1) != 0) {
              break L38;
            } else {
              if (ce.field_gb == -1) {
                ce.field_gb = bm.field_h;
                pe.field_i = qh.field_i;
                break L38;
              } else {
                break L38;
              }
            }
          }
          L39: {
            L40: {
              cl.field_o = cl.field_o + 1;
              if (param1 != null) {
                if (!param1.equals((Object) (Object) kf.field_f)) {
                  break L40;
                } else {
                  break L39;
                }
              } else {
                if (kf.field_f != null) {
                  break L39;
                } else {
                  break L40;
                }
              }
            }
            L41: {
              if (!co.field_F) {
                if (cl.field_o >= ih.field_a) {
                  if (cl.field_o < ih.field_a - -u.field_a) {
                    stackOut_16_0 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    break L41;
                  } else {
                    stackOut_15_0 = 0;
                    stackIn_18_0 = stackOut_15_0;
                    break L41;
                  }
                } else {
                  stackOut_13_0 = 0;
                  stackIn_18_0 = stackOut_13_0;
                  break L41;
                }
              } else {
                stackOut_11_0 = 0;
                stackIn_18_0 = stackOut_11_0;
                break L41;
              }
            }
            L42: {
              L43: {
                var2 = stackIn_18_0;
                if (param1 == null) {
                  break L43;
                } else {
                  if (!co.field_F) {
                    if (var2 == 0) {
                      break L43;
                    } else {
                      cl.field_o = ih.field_a;
                      break L42;
                    }
                  } else {
                    cl.field_o = ih.field_a;
                    break L42;
                  }
                }
              }
              cl.field_o = 0;
              break L42;
            }
            if (param1 != null) {
              co.field_F = false;
              rf.field_G = ce.field_gb;
              ni.field_b = pe.field_i;
              break L39;
            } else {
              if (var2 == 0) {
                rf.field_G = ce.field_gb;
                ni.field_b = pe.field_i;
                break L39;
              } else {
                co.field_F = true;
                rf.field_G = ce.field_gb;
                ni.field_b = pe.field_i;
                break L39;
              }
            }
          }
          L44: {
            kf.field_f = param1;
            if (co.field_F) {
              break L44;
            } else {
              if (cl.field_o >= ih.field_a) {
                break L44;
              } else {
                if (ij.field_h) {
                  rf.field_G = ce.field_gb;
                  ni.field_b = pe.field_i;
                  cl.field_o = 0;
                  break L44;
                } else {
                  break L44;
                }
              }
            }
          }
          L45: {
            pe.field_i = -1;
            if (!co.field_F) {
              ce.field_gb = -1;
              break L45;
            } else {
              if (cl.field_o == lc.field_e) {
                cl.field_o = 0;
                co.field_F = false;
                ce.field_gb = -1;
                break L45;
              } else {
                ce.field_gb = -1;
                break L45;
              }
            }
          }
          return;
        }
    }

    final static void a(int param0, int param1) {
        if (0 <= param1) {
          L0: {
            if (-65 <= (param1 ^ -1)) {
              break L0;
            } else {
              param1 = 64;
              break L0;
            }
          }
          if (param0 != -658435066) {
            return;
          } else {
            fq.field_x.e(-20562, param1 * lc.field_d >> -658435066);
            qd.field_r = param1;
            return;
          }
        } else {
          param1 = 0;
          if (param0 != -658435066) {
            return;
          } else {
            fq.field_x.e(-20562, param1 * lc.field_d >> -658435066);
            qd.field_r = param1;
            return;
          }
        }
    }

    ia(String param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3);
    }

    public static void a(boolean param0) {
        field_h = null;
        if (!param0) {
            Object var2 = null;
            ia.a((byte) -77, (String) null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Try again";
    }
}
