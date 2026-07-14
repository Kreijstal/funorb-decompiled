/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue {
    static dd field_c;
    static String field_d;
    static ko field_b;
    static int field_a;
    static int field_e;

    final static void a(byte param0, String param1) {
        int var2 = 0;
        int stackIn_19_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_143_0 = 0;
        int stackIn_213_0 = 0;
        int stackIn_359_0 = 0;
        int stackIn_404_0 = 0;
        int stackOut_402_0 = 0;
        int stackOut_401_0 = 0;
        int stackOut_399_0 = 0;
        int stackOut_397_0 = 0;
        int stackOut_358_0 = 0;
        int stackOut_357_0 = 0;
        int stackOut_355_0 = 0;
        int stackOut_353_0 = 0;
        int stackOut_212_0 = 0;
        int stackOut_211_0 = 0;
        int stackOut_209_0 = 0;
        int stackOut_142_0 = 0;
        int stackOut_141_0 = 0;
        int stackOut_139_0 = 0;
        int stackOut_137_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_89_0 = 0;
        jo.field_J = jo.field_J + 1;
        if (param0 != 70) {
          boolean discarded$1 = ue.a((byte) 11);
          if (ci.field_i == -1) {
            if (-1 != gg.field_g) {
              L0: {
                if (param1 == null) {
                  if (pj.field_I == null) {
                    L1: {
                      if (!nn.field_d) {
                        if (wp.field_c <= jo.field_J) {
                          if (jo.field_J < ji.field_d + wp.field_c) {
                            stackOut_402_0 = 1;
                            stackIn_404_0 = stackOut_402_0;
                            break L1;
                          } else {
                            stackOut_401_0 = 0;
                            stackIn_404_0 = stackOut_401_0;
                            break L1;
                          }
                        } else {
                          stackOut_399_0 = 0;
                          stackIn_404_0 = stackOut_399_0;
                          break L1;
                        }
                      } else {
                        stackOut_397_0 = 0;
                        stackIn_404_0 = stackOut_397_0;
                        break L1;
                      }
                    }
                    L2: {
                      var2 = stackIn_404_0;
                      if (param1 == null) {
                        break L2;
                      } else {
                        if (nn.field_d) {
                          L3: {
                            jo.field_J = wp.field_c;
                            if (param1 == null) {
                              if (var2 == 0) {
                                break L3;
                              } else {
                                nn.field_d = true;
                                break L3;
                              }
                            } else {
                              nn.field_d = false;
                              break L3;
                            }
                          }
                          L4: {
                            id.field_b = ci.field_i;
                            ne.field_n = gg.field_g;
                            pj.field_I = param1;
                            if (nn.field_d) {
                              break L4;
                            } else {
                              if (jo.field_J >= wp.field_c) {
                                break L4;
                              } else {
                                if (!re.field_c) {
                                  break L4;
                                } else {
                                  ne.field_n = gg.field_g;
                                  id.field_b = ci.field_i;
                                  jo.field_J = 0;
                                  if (nn.field_d) {
                                    if (la.field_e != jo.field_J) {
                                      ci.field_i = -1;
                                      gg.field_g = -1;
                                      return;
                                    } else {
                                      nn.field_d = false;
                                      jo.field_J = 0;
                                      ci.field_i = -1;
                                      gg.field_g = -1;
                                      return;
                                    }
                                  } else {
                                    ci.field_i = -1;
                                    gg.field_g = -1;
                                    return;
                                  }
                                }
                              }
                            }
                          }
                          if (nn.field_d) {
                            if (la.field_e != jo.field_J) {
                              ci.field_i = -1;
                              gg.field_g = -1;
                              return;
                            } else {
                              nn.field_d = false;
                              jo.field_J = 0;
                              ci.field_i = -1;
                              gg.field_g = -1;
                              return;
                            }
                          } else {
                            ci.field_i = -1;
                            gg.field_g = -1;
                            return;
                          }
                        } else {
                          if (var2 == 0) {
                            break L2;
                          } else {
                            jo.field_J = wp.field_c;
                            if (param1 == null) {
                              if (var2 == 0) {
                                L5: {
                                  id.field_b = ci.field_i;
                                  ne.field_n = gg.field_g;
                                  pj.field_I = param1;
                                  if (nn.field_d) {
                                    break L5;
                                  } else {
                                    if (jo.field_J >= wp.field_c) {
                                      break L5;
                                    } else {
                                      if (!re.field_c) {
                                        break L5;
                                      } else {
                                        ne.field_n = gg.field_g;
                                        id.field_b = ci.field_i;
                                        jo.field_J = 0;
                                        if (nn.field_d) {
                                          if (la.field_e == jo.field_J) {
                                            nn.field_d = false;
                                            jo.field_J = 0;
                                            ci.field_i = -1;
                                            gg.field_g = -1;
                                            return;
                                          } else {
                                            ci.field_i = -1;
                                            gg.field_g = -1;
                                            return;
                                          }
                                        } else {
                                          ci.field_i = -1;
                                          gg.field_g = -1;
                                          return;
                                        }
                                      }
                                    }
                                  }
                                }
                                if (nn.field_d) {
                                  if (la.field_e == jo.field_J) {
                                    nn.field_d = false;
                                    jo.field_J = 0;
                                    ci.field_i = -1;
                                    gg.field_g = -1;
                                    return;
                                  } else {
                                    ci.field_i = -1;
                                    gg.field_g = -1;
                                    return;
                                  }
                                } else {
                                  ci.field_i = -1;
                                  gg.field_g = -1;
                                  return;
                                }
                              } else {
                                L6: {
                                  nn.field_d = true;
                                  id.field_b = ci.field_i;
                                  ne.field_n = gg.field_g;
                                  pj.field_I = param1;
                                  if (nn.field_d) {
                                    break L6;
                                  } else {
                                    if (jo.field_J >= wp.field_c) {
                                      break L6;
                                    } else {
                                      if (!re.field_c) {
                                        break L6;
                                      } else {
                                        ne.field_n = gg.field_g;
                                        id.field_b = ci.field_i;
                                        jo.field_J = 0;
                                        break L6;
                                      }
                                    }
                                  }
                                }
                                if (nn.field_d) {
                                  if (la.field_e != jo.field_J) {
                                    ci.field_i = -1;
                                    gg.field_g = -1;
                                    return;
                                  } else {
                                    nn.field_d = false;
                                    jo.field_J = 0;
                                    ci.field_i = -1;
                                    gg.field_g = -1;
                                    return;
                                  }
                                } else {
                                  ci.field_i = -1;
                                  gg.field_g = -1;
                                  return;
                                }
                              }
                            } else {
                              L7: {
                                nn.field_d = false;
                                id.field_b = ci.field_i;
                                ne.field_n = gg.field_g;
                                pj.field_I = param1;
                                if (nn.field_d) {
                                  break L7;
                                } else {
                                  if (jo.field_J >= wp.field_c) {
                                    break L7;
                                  } else {
                                    if (!re.field_c) {
                                      break L7;
                                    } else {
                                      ne.field_n = gg.field_g;
                                      id.field_b = ci.field_i;
                                      jo.field_J = 0;
                                      break L7;
                                    }
                                  }
                                }
                              }
                              if (nn.field_d) {
                                if (la.field_e != jo.field_J) {
                                  ci.field_i = -1;
                                  gg.field_g = -1;
                                  return;
                                } else {
                                  nn.field_d = false;
                                  jo.field_J = 0;
                                  ci.field_i = -1;
                                  gg.field_g = -1;
                                  return;
                                }
                              } else {
                                ci.field_i = -1;
                                gg.field_g = -1;
                                return;
                              }
                            }
                          }
                        }
                      }
                    }
                    jo.field_J = 0;
                    if (param1 == null) {
                      if (var2 == 0) {
                        id.field_b = ci.field_i;
                        ne.field_n = gg.field_g;
                        break L0;
                      } else {
                        L8: {
                          nn.field_d = true;
                          id.field_b = ci.field_i;
                          ne.field_n = gg.field_g;
                          pj.field_I = param1;
                          if (nn.field_d) {
                            break L8;
                          } else {
                            if (jo.field_J >= wp.field_c) {
                              break L8;
                            } else {
                              if (!re.field_c) {
                                break L8;
                              } else {
                                ne.field_n = gg.field_g;
                                id.field_b = ci.field_i;
                                jo.field_J = 0;
                                if (nn.field_d) {
                                  if (la.field_e == jo.field_J) {
                                    nn.field_d = false;
                                    jo.field_J = 0;
                                    ci.field_i = -1;
                                    gg.field_g = -1;
                                    return;
                                  } else {
                                    ci.field_i = -1;
                                    gg.field_g = -1;
                                    return;
                                  }
                                } else {
                                  ci.field_i = -1;
                                  gg.field_g = -1;
                                  return;
                                }
                              }
                            }
                          }
                        }
                        if (nn.field_d) {
                          if (la.field_e == jo.field_J) {
                            nn.field_d = false;
                            jo.field_J = 0;
                            ci.field_i = -1;
                            gg.field_g = -1;
                            return;
                          } else {
                            ci.field_i = -1;
                            gg.field_g = -1;
                            return;
                          }
                        } else {
                          ci.field_i = -1;
                          gg.field_g = -1;
                          return;
                        }
                      }
                    } else {
                      L9: {
                        nn.field_d = false;
                        id.field_b = ci.field_i;
                        ne.field_n = gg.field_g;
                        pj.field_I = param1;
                        if (nn.field_d) {
                          break L9;
                        } else {
                          if (jo.field_J >= wp.field_c) {
                            break L9;
                          } else {
                            if (!re.field_c) {
                              break L9;
                            } else {
                              ne.field_n = gg.field_g;
                              id.field_b = ci.field_i;
                              jo.field_J = 0;
                              if (nn.field_d) {
                                if (la.field_e == jo.field_J) {
                                  nn.field_d = false;
                                  jo.field_J = 0;
                                  ci.field_i = -1;
                                  gg.field_g = -1;
                                  return;
                                } else {
                                  ci.field_i = -1;
                                  gg.field_g = -1;
                                  return;
                                }
                              } else {
                                ci.field_i = -1;
                                gg.field_g = -1;
                                return;
                              }
                            }
                          }
                        }
                      }
                      if (nn.field_d) {
                        if (la.field_e == jo.field_J) {
                          nn.field_d = false;
                          jo.field_J = 0;
                          ci.field_i = -1;
                          gg.field_g = -1;
                          return;
                        } else {
                          ci.field_i = -1;
                          gg.field_g = -1;
                          return;
                        }
                      } else {
                        ci.field_i = -1;
                        gg.field_g = -1;
                        return;
                      }
                    }
                  } else {
                    L10: {
                      pj.field_I = param1;
                      if (nn.field_d) {
                        break L10;
                      } else {
                        if (jo.field_J >= wp.field_c) {
                          break L10;
                        } else {
                          if (!re.field_c) {
                            break L10;
                          } else {
                            ne.field_n = gg.field_g;
                            id.field_b = ci.field_i;
                            jo.field_J = 0;
                            break L10;
                          }
                        }
                      }
                    }
                    if (nn.field_d) {
                      if (la.field_e != jo.field_J) {
                        ci.field_i = -1;
                        gg.field_g = -1;
                        return;
                      } else {
                        nn.field_d = false;
                        jo.field_J = 0;
                        ci.field_i = -1;
                        gg.field_g = -1;
                        return;
                      }
                    } else {
                      ci.field_i = -1;
                      gg.field_g = -1;
                      return;
                    }
                  }
                } else {
                  if (param1.equals((Object) (Object) pj.field_I)) {
                    break L0;
                  } else {
                    L11: {
                      if (!nn.field_d) {
                        if (wp.field_c <= jo.field_J) {
                          if (jo.field_J >= ji.field_d + wp.field_c) {
                            stackOut_358_0 = 0;
                            stackIn_359_0 = stackOut_358_0;
                            break L11;
                          } else {
                            stackOut_357_0 = 1;
                            stackIn_359_0 = stackOut_357_0;
                            break L11;
                          }
                        } else {
                          stackOut_355_0 = 0;
                          stackIn_359_0 = stackOut_355_0;
                          break L11;
                        }
                      } else {
                        stackOut_353_0 = 0;
                        stackIn_359_0 = stackOut_353_0;
                        break L11;
                      }
                    }
                    L12: {
                      L13: {
                        var2 = stackIn_359_0;
                        if (param1 == null) {
                          break L13;
                        } else {
                          if (nn.field_d) {
                            jo.field_J = wp.field_c;
                            break L12;
                          } else {
                            if (var2 == 0) {
                              break L13;
                            } else {
                              jo.field_J = wp.field_c;
                              break L12;
                            }
                          }
                        }
                      }
                      jo.field_J = 0;
                      break L12;
                    }
                    L14: {
                      if (param1 == null) {
                        if (var2 == 0) {
                          break L14;
                        } else {
                          nn.field_d = true;
                          break L14;
                        }
                      } else {
                        nn.field_d = false;
                        break L14;
                      }
                    }
                    L15: {
                      id.field_b = ci.field_i;
                      ne.field_n = gg.field_g;
                      pj.field_I = param1;
                      if (nn.field_d) {
                        break L15;
                      } else {
                        if (jo.field_J >= wp.field_c) {
                          break L15;
                        } else {
                          if (!re.field_c) {
                            break L15;
                          } else {
                            ne.field_n = gg.field_g;
                            id.field_b = ci.field_i;
                            jo.field_J = 0;
                            break L15;
                          }
                        }
                      }
                    }
                    L16: {
                      L17: {
                        if (!nn.field_d) {
                          break L17;
                        } else {
                          if (la.field_e != jo.field_J) {
                            break L17;
                          } else {
                            nn.field_d = false;
                            jo.field_J = 0;
                            ci.field_i = -1;
                            gg.field_g = -1;
                            break L16;
                          }
                        }
                      }
                      ci.field_i = -1;
                      gg.field_g = -1;
                      break L16;
                    }
                    return;
                  }
                }
              }
              L18: {
                pj.field_I = param1;
                if (nn.field_d) {
                  break L18;
                } else {
                  if (jo.field_J >= wp.field_c) {
                    break L18;
                  } else {
                    if (!re.field_c) {
                      break L18;
                    } else {
                      ne.field_n = gg.field_g;
                      id.field_b = ci.field_i;
                      jo.field_J = 0;
                      if (!nn.field_d) {
                        ci.field_i = -1;
                        gg.field_g = -1;
                        return;
                      } else {
                        if (la.field_e == jo.field_J) {
                          nn.field_d = false;
                          jo.field_J = 0;
                          ci.field_i = -1;
                          gg.field_g = -1;
                          return;
                        } else {
                          ci.field_i = -1;
                          gg.field_g = -1;
                          return;
                        }
                      }
                    }
                  }
                }
              }
              if (!nn.field_d) {
                ci.field_i = -1;
                gg.field_g = -1;
                return;
              } else {
                if (la.field_e != jo.field_J) {
                  ci.field_i = -1;
                  gg.field_g = -1;
                  return;
                } else {
                  nn.field_d = false;
                  jo.field_J = 0;
                  ci.field_i = -1;
                  gg.field_g = -1;
                  return;
                }
              }
            } else {
              L19: {
                gg.field_g = gg.field_f;
                ci.field_i = wn.field_i;
                if (param1 == null) {
                  if (pj.field_I == null) {
                    break L19;
                  } else {
                    L20: {
                      pj.field_I = param1;
                      if (nn.field_d) {
                        break L20;
                      } else {
                        if (jo.field_J >= wp.field_c) {
                          break L20;
                        } else {
                          if (!re.field_c) {
                            break L20;
                          } else {
                            ne.field_n = gg.field_g;
                            id.field_b = ci.field_i;
                            jo.field_J = 0;
                            break L20;
                          }
                        }
                      }
                    }
                    L21: {
                      L22: {
                        if (!nn.field_d) {
                          break L22;
                        } else {
                          if (la.field_e != jo.field_J) {
                            break L22;
                          } else {
                            nn.field_d = false;
                            jo.field_J = 0;
                            ci.field_i = -1;
                            gg.field_g = -1;
                            break L21;
                          }
                        }
                      }
                      ci.field_i = -1;
                      gg.field_g = -1;
                      break L21;
                    }
                    return;
                  }
                } else {
                  if (!param1.equals((Object) (Object) pj.field_I)) {
                    break L19;
                  } else {
                    L23: {
                      pj.field_I = param1;
                      if (nn.field_d) {
                        break L23;
                      } else {
                        if (jo.field_J >= wp.field_c) {
                          break L23;
                        } else {
                          if (!re.field_c) {
                            break L23;
                          } else {
                            ne.field_n = gg.field_g;
                            id.field_b = ci.field_i;
                            jo.field_J = 0;
                            break L23;
                          }
                        }
                      }
                    }
                    L24: {
                      L25: {
                        if (!nn.field_d) {
                          break L25;
                        } else {
                          if (la.field_e != jo.field_J) {
                            break L25;
                          } else {
                            nn.field_d = false;
                            jo.field_J = 0;
                            ci.field_i = -1;
                            gg.field_g = -1;
                            break L24;
                          }
                        }
                      }
                      ci.field_i = -1;
                      gg.field_g = -1;
                      break L24;
                    }
                    return;
                  }
                }
              }
              if (!nn.field_d) {
                L26: {
                  if (wp.field_c <= jo.field_J) {
                    if (jo.field_J >= ji.field_d + wp.field_c) {
                      stackOut_212_0 = 0;
                      stackIn_213_0 = stackOut_212_0;
                      break L26;
                    } else {
                      stackOut_211_0 = 1;
                      stackIn_213_0 = stackOut_211_0;
                      break L26;
                    }
                  } else {
                    stackOut_209_0 = 0;
                    stackIn_213_0 = stackOut_209_0;
                    break L26;
                  }
                }
                L27: {
                  L28: {
                    var2 = stackIn_213_0;
                    if (param1 == null) {
                      break L28;
                    } else {
                      if (nn.field_d) {
                        jo.field_J = wp.field_c;
                        break L27;
                      } else {
                        if (var2 == 0) {
                          break L28;
                        } else {
                          jo.field_J = wp.field_c;
                          break L27;
                        }
                      }
                    }
                  }
                  jo.field_J = 0;
                  break L27;
                }
                L29: {
                  if (param1 == null) {
                    if (var2 == 0) {
                      break L29;
                    } else {
                      nn.field_d = true;
                      break L29;
                    }
                  } else {
                    nn.field_d = false;
                    break L29;
                  }
                }
                id.field_b = ci.field_i;
                ne.field_n = gg.field_g;
                pj.field_I = param1;
                if (!nn.field_d) {
                  if (jo.field_J < wp.field_c) {
                    if (re.field_c) {
                      ne.field_n = gg.field_g;
                      id.field_b = ci.field_i;
                      jo.field_J = 0;
                      id.field_b = ci.field_i;
                      ne.field_n = gg.field_g;
                      pj.field_I = param1;
                      if (!nn.field_d) {
                        if (jo.field_J < wp.field_c) {
                          L30: {
                            if (re.field_c) {
                              break L30;
                            } else {
                              L31: {
                                if (!nn.field_d) {
                                  break L31;
                                } else {
                                  if (la.field_e != jo.field_J) {
                                    break L31;
                                  } else {
                                    nn.field_d = false;
                                    jo.field_J = 0;
                                    ci.field_i = -1;
                                    gg.field_g = -1;
                                    return;
                                  }
                                }
                              }
                              ci.field_i = -1;
                              gg.field_g = -1;
                              if (var2 != 0) {
                                nn.field_d = true;
                                id.field_b = ci.field_i;
                                ne.field_n = gg.field_g;
                                pj.field_I = param1;
                                if (!nn.field_d) {
                                  if (jo.field_J < wp.field_c) {
                                    if (re.field_c) {
                                      break L30;
                                    } else {
                                      L32: {
                                        L33: {
                                          if (!nn.field_d) {
                                            break L33;
                                          } else {
                                            if (la.field_e != jo.field_J) {
                                              break L33;
                                            } else {
                                              nn.field_d = false;
                                              jo.field_J = 0;
                                              ci.field_i = -1;
                                              gg.field_g = -1;
                                              break L32;
                                            }
                                          }
                                        }
                                        ci.field_i = -1;
                                        gg.field_g = -1;
                                        break L32;
                                      }
                                      return;
                                    }
                                  } else {
                                    L34: {
                                      L35: {
                                        if (!nn.field_d) {
                                          break L35;
                                        } else {
                                          if (la.field_e != jo.field_J) {
                                            break L35;
                                          } else {
                                            nn.field_d = false;
                                            jo.field_J = 0;
                                            ci.field_i = -1;
                                            gg.field_g = -1;
                                            break L34;
                                          }
                                        }
                                      }
                                      ci.field_i = -1;
                                      gg.field_g = -1;
                                      break L34;
                                    }
                                    return;
                                  }
                                } else {
                                  L36: {
                                    L37: {
                                      if (!nn.field_d) {
                                        break L37;
                                      } else {
                                        if (la.field_e != jo.field_J) {
                                          break L37;
                                        } else {
                                          nn.field_d = false;
                                          jo.field_J = 0;
                                          ci.field_i = -1;
                                          gg.field_g = -1;
                                          break L36;
                                        }
                                      }
                                    }
                                    ci.field_i = -1;
                                    gg.field_g = -1;
                                    break L36;
                                  }
                                  return;
                                }
                              } else {
                                L38: {
                                  id.field_b = ci.field_i;
                                  ne.field_n = gg.field_g;
                                  pj.field_I = param1;
                                  if (nn.field_d) {
                                    break L38;
                                  } else {
                                    if (jo.field_J >= wp.field_c) {
                                      break L38;
                                    } else {
                                      if (!re.field_c) {
                                        break L38;
                                      } else {
                                        ne.field_n = gg.field_g;
                                        id.field_b = ci.field_i;
                                        jo.field_J = 0;
                                        break L38;
                                      }
                                    }
                                  }
                                }
                                L39: {
                                  L40: {
                                    if (!nn.field_d) {
                                      break L40;
                                    } else {
                                      if (la.field_e != jo.field_J) {
                                        break L40;
                                      } else {
                                        nn.field_d = false;
                                        jo.field_J = 0;
                                        ci.field_i = -1;
                                        gg.field_g = -1;
                                        break L39;
                                      }
                                    }
                                  }
                                  ci.field_i = -1;
                                  gg.field_g = -1;
                                  break L39;
                                }
                                return;
                              }
                            }
                          }
                          ne.field_n = gg.field_g;
                          id.field_b = ci.field_i;
                          jo.field_J = 0;
                          L41: {
                            L42: {
                              if (!nn.field_d) {
                                break L42;
                              } else {
                                if (la.field_e != jo.field_J) {
                                  break L42;
                                } else {
                                  nn.field_d = false;
                                  jo.field_J = 0;
                                  ci.field_i = -1;
                                  gg.field_g = -1;
                                  break L41;
                                }
                              }
                            }
                            ci.field_i = -1;
                            gg.field_g = -1;
                            break L41;
                          }
                          return;
                        } else {
                          L43: {
                            L44: {
                              if (!nn.field_d) {
                                break L44;
                              } else {
                                if (la.field_e != jo.field_J) {
                                  break L44;
                                } else {
                                  nn.field_d = false;
                                  jo.field_J = 0;
                                  ci.field_i = -1;
                                  gg.field_g = -1;
                                  break L43;
                                }
                              }
                            }
                            ci.field_i = -1;
                            gg.field_g = -1;
                            break L43;
                          }
                          return;
                        }
                      } else {
                        L45: {
                          L46: {
                            if (!nn.field_d) {
                              break L46;
                            } else {
                              if (la.field_e != jo.field_J) {
                                break L46;
                              } else {
                                nn.field_d = false;
                                jo.field_J = 0;
                                ci.field_i = -1;
                                gg.field_g = -1;
                                break L45;
                              }
                            }
                          }
                          ci.field_i = -1;
                          gg.field_g = -1;
                          break L45;
                        }
                        return;
                      }
                    } else {
                      L47: {
                        L48: {
                          if (!nn.field_d) {
                            break L48;
                          } else {
                            if (la.field_e != jo.field_J) {
                              break L48;
                            } else {
                              nn.field_d = false;
                              jo.field_J = 0;
                              ci.field_i = -1;
                              gg.field_g = -1;
                              break L47;
                            }
                          }
                        }
                        ci.field_i = -1;
                        gg.field_g = -1;
                        break L47;
                      }
                      return;
                    }
                  } else {
                    L49: {
                      L50: {
                        if (!nn.field_d) {
                          break L50;
                        } else {
                          if (la.field_e != jo.field_J) {
                            break L50;
                          } else {
                            nn.field_d = false;
                            jo.field_J = 0;
                            ci.field_i = -1;
                            gg.field_g = -1;
                            break L49;
                          }
                        }
                      }
                      ci.field_i = -1;
                      gg.field_g = -1;
                      break L49;
                    }
                    return;
                  }
                } else {
                  L51: {
                    L52: {
                      if (!nn.field_d) {
                        break L52;
                      } else {
                        if (la.field_e != jo.field_J) {
                          break L52;
                        } else {
                          nn.field_d = false;
                          jo.field_J = 0;
                          ci.field_i = -1;
                          gg.field_g = -1;
                          break L51;
                        }
                      }
                    }
                    ci.field_i = -1;
                    gg.field_g = -1;
                    break L51;
                  }
                  return;
                }
              } else {
                L53: {
                  L54: {
                    var2 = 0;
                    if (param1 == null) {
                      break L54;
                    } else {
                      if (nn.field_d) {
                        jo.field_J = wp.field_c;
                        break L53;
                      } else {
                        if (var2 == 0) {
                          break L54;
                        } else {
                          jo.field_J = wp.field_c;
                          break L53;
                        }
                      }
                    }
                  }
                  jo.field_J = 0;
                  break L53;
                }
                L55: {
                  if (param1 == null) {
                    if (var2 == 0) {
                      break L55;
                    } else {
                      nn.field_d = true;
                      break L55;
                    }
                  } else {
                    nn.field_d = false;
                    break L55;
                  }
                }
                L56: {
                  id.field_b = ci.field_i;
                  ne.field_n = gg.field_g;
                  pj.field_I = param1;
                  if (nn.field_d) {
                    break L56;
                  } else {
                    if (jo.field_J >= wp.field_c) {
                      break L56;
                    } else {
                      if (!re.field_c) {
                        break L56;
                      } else {
                        ne.field_n = gg.field_g;
                        id.field_b = ci.field_i;
                        jo.field_J = 0;
                        break L56;
                      }
                    }
                  }
                }
                L57: {
                  L58: {
                    if (!nn.field_d) {
                      break L58;
                    } else {
                      if (la.field_e != jo.field_J) {
                        break L58;
                      } else {
                        nn.field_d = false;
                        jo.field_J = 0;
                        ci.field_i = -1;
                        gg.field_g = -1;
                        break L57;
                      }
                    }
                  }
                  ci.field_i = -1;
                  gg.field_g = -1;
                  break L57;
                }
                return;
              }
            }
          } else {
            L59: {
              if (param1 == null) {
                L60: {
                  if (pj.field_I == null) {
                    L61: {
                      if (!nn.field_d) {
                        if (wp.field_c <= jo.field_J) {
                          if (jo.field_J >= ji.field_d + wp.field_c) {
                            stackOut_142_0 = 0;
                            stackIn_143_0 = stackOut_142_0;
                            break L61;
                          } else {
                            stackOut_141_0 = 1;
                            stackIn_143_0 = stackOut_141_0;
                            break L61;
                          }
                        } else {
                          stackOut_139_0 = 0;
                          stackIn_143_0 = stackOut_139_0;
                          break L61;
                        }
                      } else {
                        stackOut_137_0 = 0;
                        stackIn_143_0 = stackOut_137_0;
                        break L61;
                      }
                    }
                    L62: {
                      L63: {
                        var2 = stackIn_143_0;
                        if (param1 == null) {
                          break L63;
                        } else {
                          if (nn.field_d) {
                            jo.field_J = wp.field_c;
                            break L62;
                          } else {
                            if (var2 == 0) {
                              break L63;
                            } else {
                              jo.field_J = wp.field_c;
                              break L62;
                            }
                          }
                        }
                      }
                      jo.field_J = 0;
                      break L62;
                    }
                    L64: {
                      if (param1 == null) {
                        if (var2 == 0) {
                          break L64;
                        } else {
                          nn.field_d = true;
                          break L64;
                        }
                      } else {
                        nn.field_d = false;
                        break L64;
                      }
                    }
                    id.field_b = ci.field_i;
                    ne.field_n = gg.field_g;
                    break L60;
                  } else {
                    break L60;
                  }
                }
                pj.field_I = param1;
                if (nn.field_d) {
                  break L59;
                } else {
                  if (jo.field_J >= wp.field_c) {
                    break L59;
                  } else {
                    if (!re.field_c) {
                      break L59;
                    } else {
                      ne.field_n = gg.field_g;
                      id.field_b = ci.field_i;
                      jo.field_J = 0;
                      break L59;
                    }
                  }
                }
              } else {
                if (param1.equals((Object) (Object) pj.field_I)) {
                  pj.field_I = param1;
                  if (nn.field_d) {
                    break L59;
                  } else {
                    if (jo.field_J >= wp.field_c) {
                      break L59;
                    } else {
                      if (!re.field_c) {
                        break L59;
                      } else {
                        ne.field_n = gg.field_g;
                        id.field_b = ci.field_i;
                        jo.field_J = 0;
                        break L59;
                      }
                    }
                  }
                } else {
                  pj.field_I = param1;
                  if (nn.field_d) {
                    break L59;
                  } else {
                    if (jo.field_J >= wp.field_c) {
                      break L59;
                    } else {
                      if (!re.field_c) {
                        break L59;
                      } else {
                        ne.field_n = gg.field_g;
                        id.field_b = ci.field_i;
                        jo.field_J = 0;
                        break L59;
                      }
                    }
                  }
                }
              }
            }
            if (nn.field_d) {
              if (la.field_e != jo.field_J) {
                ci.field_i = -1;
                gg.field_g = -1;
                return;
              } else {
                nn.field_d = false;
                jo.field_J = 0;
                ci.field_i = -1;
                gg.field_g = -1;
                return;
              }
            } else {
              ci.field_i = -1;
              gg.field_g = -1;
              return;
            }
          }
        } else {
          L65: {
            if (ci.field_i != -1) {
              break L65;
            } else {
              if (-1 != gg.field_g) {
                break L65;
              } else {
                L66: {
                  L67: {
                    gg.field_g = gg.field_f;
                    ci.field_i = wn.field_i;
                    if (param1 == null) {
                      if (pj.field_I == null) {
                        break L67;
                      } else {
                        pj.field_I = param1;
                        if (nn.field_d) {
                          break L66;
                        } else {
                          if (jo.field_J >= wp.field_c) {
                            break L66;
                          } else {
                            if (!re.field_c) {
                              break L66;
                            } else {
                              ne.field_n = gg.field_g;
                              id.field_b = ci.field_i;
                              jo.field_J = 0;
                              break L66;
                            }
                          }
                        }
                      }
                    } else {
                      if (param1.equals((Object) (Object) pj.field_I)) {
                        pj.field_I = param1;
                        if (nn.field_d) {
                          break L66;
                        } else {
                          if (jo.field_J >= wp.field_c) {
                            break L66;
                          } else {
                            if (!re.field_c) {
                              break L66;
                            } else {
                              ne.field_n = gg.field_g;
                              id.field_b = ci.field_i;
                              jo.field_J = 0;
                              break L66;
                            }
                          }
                        }
                      } else {
                        break L67;
                      }
                    }
                  }
                  L68: {
                    if (!nn.field_d) {
                      if (wp.field_c <= jo.field_J) {
                        if (jo.field_J < ji.field_d + wp.field_c) {
                          stackOut_17_0 = 1;
                          stackIn_19_0 = stackOut_17_0;
                          break L68;
                        } else {
                          stackOut_16_0 = 0;
                          stackIn_19_0 = stackOut_16_0;
                          break L68;
                        }
                      } else {
                        stackOut_14_0 = 0;
                        stackIn_19_0 = stackOut_14_0;
                        break L68;
                      }
                    } else {
                      stackOut_12_0 = 0;
                      stackIn_19_0 = stackOut_12_0;
                      break L68;
                    }
                  }
                  L69: {
                    var2 = stackIn_19_0;
                    if (param1 != null) {
                      L70: {
                        if (!nn.field_d) {
                          break L70;
                        } else {
                          break L70;
                        }
                      }
                      jo.field_J = wp.field_c;
                      break L69;
                    } else {
                      jo.field_J = 0;
                      break L69;
                    }
                  }
                  if (param1 == null) {
                    if (var2 == 0) {
                      id.field_b = ci.field_i;
                      ne.field_n = gg.field_g;
                      pj.field_I = param1;
                      if (nn.field_d) {
                        break L66;
                      } else {
                        if (jo.field_J >= wp.field_c) {
                          break L66;
                        } else {
                          if (!re.field_c) {
                            break L66;
                          } else {
                            ne.field_n = gg.field_g;
                            id.field_b = ci.field_i;
                            jo.field_J = 0;
                            break L66;
                          }
                        }
                      }
                    } else {
                      nn.field_d = true;
                      id.field_b = ci.field_i;
                      ne.field_n = gg.field_g;
                      pj.field_I = param1;
                      if (nn.field_d) {
                        break L66;
                      } else {
                        if (jo.field_J >= wp.field_c) {
                          break L66;
                        } else {
                          if (!re.field_c) {
                            break L66;
                          } else {
                            ne.field_n = gg.field_g;
                            id.field_b = ci.field_i;
                            jo.field_J = 0;
                            break L66;
                          }
                        }
                      }
                    }
                  } else {
                    nn.field_d = false;
                    id.field_b = ci.field_i;
                    ne.field_n = gg.field_g;
                    pj.field_I = param1;
                    if (nn.field_d) {
                      break L66;
                    } else {
                      if (jo.field_J >= wp.field_c) {
                        break L66;
                      } else {
                        if (!re.field_c) {
                          break L66;
                        } else {
                          ne.field_n = gg.field_g;
                          id.field_b = ci.field_i;
                          jo.field_J = 0;
                          break L66;
                        }
                      }
                    }
                  }
                }
                L71: {
                  L72: {
                    if (!nn.field_d) {
                      break L72;
                    } else {
                      if (la.field_e != jo.field_J) {
                        break L72;
                      } else {
                        nn.field_d = false;
                        jo.field_J = 0;
                        ci.field_i = -1;
                        gg.field_g = -1;
                        break L71;
                      }
                    }
                  }
                  ci.field_i = -1;
                  gg.field_g = -1;
                  break L71;
                }
                return;
              }
            }
          }
          L73: {
            if (param1 == null) {
              L74: {
                if (pj.field_I == null) {
                  L75: {
                    if (!nn.field_d) {
                      if (wp.field_c <= jo.field_J) {
                        if (jo.field_J >= ji.field_d + wp.field_c) {
                          stackOut_94_0 = 0;
                          stackIn_96_0 = stackOut_94_0;
                          break L75;
                        } else {
                          stackOut_93_0 = 1;
                          stackIn_96_0 = stackOut_93_0;
                          break L75;
                        }
                      } else {
                        stackOut_91_0 = 0;
                        stackIn_96_0 = stackOut_91_0;
                        break L75;
                      }
                    } else {
                      stackOut_89_0 = 0;
                      stackIn_96_0 = stackOut_89_0;
                      break L75;
                    }
                  }
                  L76: {
                    L77: {
                      var2 = stackIn_96_0;
                      if (param1 == null) {
                        break L77;
                      } else {
                        if (nn.field_d) {
                          jo.field_J = wp.field_c;
                          break L76;
                        } else {
                          if (var2 == 0) {
                            break L77;
                          } else {
                            jo.field_J = wp.field_c;
                            break L76;
                          }
                        }
                      }
                    }
                    jo.field_J = 0;
                    break L76;
                  }
                  L78: {
                    if (param1 == null) {
                      if (var2 == 0) {
                        break L78;
                      } else {
                        nn.field_d = true;
                        break L78;
                      }
                    } else {
                      nn.field_d = false;
                      break L78;
                    }
                  }
                  id.field_b = ci.field_i;
                  ne.field_n = gg.field_g;
                  break L74;
                } else {
                  break L74;
                }
              }
              pj.field_I = param1;
              if (nn.field_d) {
                break L73;
              } else {
                if (jo.field_J >= wp.field_c) {
                  break L73;
                } else {
                  if (!re.field_c) {
                    break L73;
                  } else {
                    ne.field_n = gg.field_g;
                    id.field_b = ci.field_i;
                    jo.field_J = 0;
                    break L73;
                  }
                }
              }
            } else {
              if (param1.equals((Object) (Object) pj.field_I)) {
                pj.field_I = param1;
                if (nn.field_d) {
                  break L73;
                } else {
                  if (jo.field_J >= wp.field_c) {
                    break L73;
                  } else {
                    if (!re.field_c) {
                      break L73;
                    } else {
                      ne.field_n = gg.field_g;
                      id.field_b = ci.field_i;
                      jo.field_J = 0;
                      break L73;
                    }
                  }
                }
              } else {
                pj.field_I = param1;
                if (nn.field_d) {
                  break L73;
                } else {
                  if (jo.field_J >= wp.field_c) {
                    break L73;
                  } else {
                    if (!re.field_c) {
                      break L73;
                    } else {
                      ne.field_n = gg.field_g;
                      id.field_b = ci.field_i;
                      jo.field_J = 0;
                      break L73;
                    }
                  }
                }
              }
            }
          }
          if (nn.field_d) {
            if (la.field_e != jo.field_J) {
              ci.field_i = -1;
              gg.field_g = -1;
              return;
            } else {
              nn.field_d = false;
              jo.field_J = 0;
              ci.field_i = -1;
              gg.field_g = -1;
              return;
            }
          } else {
            ci.field_i = -1;
            gg.field_g = -1;
            return;
          }
        }
    }

    final static void a(boolean param0) {
        if (!(wd.field_Ub == null)) {
            wd.field_Ub.h(11741);
        }
        if (null != of.field_Nb) {
            of.field_Nb.k(0);
            ja.a(param0);
            return;
        }
        ja.a(param0);
    }

    final static boolean a(int param0) {
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == 11) {
          L0: {
            bi.field_f = true;
            ia.field_k = rl.a((byte) -110) - -15000L;
            if (11 != fk.field_ab) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          return stackIn_5_0 != 0;
        } else {
          return false;
        }
    }

    public static void b(boolean param0) {
        field_c = null;
        field_d = null;
        field_b = null;
        if (param0) {
            Object var2 = null;
            ue.a((byte) 106, (String) null);
        }
    }

    final static boolean a(byte param0) {
        if (param0 <= -70) {
          if (sf.field_y >= 20) {
            if (gg.a(true)) {
              if (0 < no.field_l) {
                if (!uc.a(-128)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          field_e = -55;
          if (sf.field_y >= 20) {
            if (gg.a(true)) {
              if (0 < no.field_l) {
                if (!uc.a(-128)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Next";
        field_e = 2048;
        field_b = new ko();
    }
}
