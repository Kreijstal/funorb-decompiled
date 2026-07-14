/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl {
    static int field_a;

    final static pb a(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = stellarshard.field_B;
        int var4 = -71 % ((param1 - 61) / 52);
        pb var7 = new pb(param2, param2);
        pb var3 = var7;
        for (var5 = 0; var3.field_z.length > var5; var5++) {
            var7.field_z[var5] = param0;
        }
        return var3;
    }

    final static void a(byte param0) {
        int var1 = 19 % ((38 - param0) / 55);
    }

    final static void a(String param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_32_0 = 0;
        int stackIn_105_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_104_0 = 0;
        L0: {
          var3 = stellarshard.field_B;
          ki.field_v = ki.field_v + 1;
          if (vk.field_b != -1) {
            break L0;
          } else {
            if (-1 == wg.field_c) {
              wg.field_c = eb.field_a;
              vk.field_b = ni.field_e;
              break L0;
            } else {
              L1: {
                if (param0 != null) {
                  if (!param0.equals((Object) (Object) hk.field_m)) {
                    break L1;
                  } else {
                    L2: {
                      if (wk.field_c) {
                        break L2;
                      } else {
                        if (pc.field_g <= ki.field_v) {
                          break L2;
                        } else {
                          if (qc.field_a) {
                            am.field_f = vk.field_b;
                            ki.field_v = 0;
                            h.field_c = wg.field_c;
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    L3: {
                      hk.field_m = param0;
                      if (!wk.field_c) {
                        break L3;
                      } else {
                        if (ki.field_v != td.field_b) {
                          break L3;
                        } else {
                          ki.field_v = 0;
                          wk.field_c = false;
                          break L3;
                        }
                      }
                    }
                    L4: {
                      vk.field_b = -1;
                      wg.field_c = -1;
                      if (param1 > 79) {
                        break L4;
                      } else {
                        pb discarded$20 = cl.a(-42, 42, 30);
                        break L4;
                      }
                    }
                    return;
                  }
                } else {
                  if (null == hk.field_m) {
                    break L1;
                  } else {
                    L5: {
                      if (wk.field_c) {
                        break L5;
                      } else {
                        if (pc.field_g <= ki.field_v) {
                          break L5;
                        } else {
                          if (qc.field_a) {
                            am.field_f = vk.field_b;
                            ki.field_v = 0;
                            h.field_c = wg.field_c;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    L6: {
                      hk.field_m = param0;
                      if (!wk.field_c) {
                        break L6;
                      } else {
                        if (ki.field_v != td.field_b) {
                          break L6;
                        } else {
                          ki.field_v = 0;
                          wk.field_c = false;
                          break L6;
                        }
                      }
                    }
                    L7: {
                      vk.field_b = -1;
                      wg.field_c = -1;
                      if (param1 > 79) {
                        break L7;
                      } else {
                        pb discarded$21 = cl.a(-42, 42, 30);
                        break L7;
                      }
                    }
                    return;
                  }
                }
              }
              L8: {
                L9: {
                  if (wk.field_c) {
                    break L9;
                  } else {
                    if (pc.field_g > ki.field_v) {
                      break L9;
                    } else {
                      if ((ki.field_v ^ -1) <= (pc.field_g + ul.field_D ^ -1)) {
                        break L9;
                      } else {
                        stackOut_30_0 = 1;
                        stackIn_32_0 = stackOut_30_0;
                        break L8;
                      }
                    }
                  }
                }
                stackOut_31_0 = 0;
                stackIn_32_0 = stackOut_31_0;
                break L8;
              }
              L10: {
                var2 = stackIn_32_0;
                if (param0 == null) {
                  ki.field_v = 0;
                  break L10;
                } else {
                  if (wk.field_c) {
                    ki.field_v = pc.field_g;
                    break L10;
                  } else {
                    if (var2 == 0) {
                      ki.field_v = 0;
                      break L10;
                    } else {
                      ki.field_v = pc.field_g;
                      break L10;
                    }
                  }
                }
              }
              L11: {
                am.field_f = vk.field_b;
                if (param0 == null) {
                  if (var2 != 0) {
                    wk.field_c = true;
                    break L11;
                  } else {
                    break L11;
                  }
                } else {
                  wk.field_c = false;
                  break L11;
                }
              }
              L12: {
                h.field_c = wg.field_c;
                if (wk.field_c) {
                  break L12;
                } else {
                  if (pc.field_g <= ki.field_v) {
                    break L12;
                  } else {
                    if (qc.field_a) {
                      am.field_f = vk.field_b;
                      ki.field_v = 0;
                      h.field_c = wg.field_c;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                }
              }
              L13: {
                hk.field_m = param0;
                if (!wk.field_c) {
                  break L13;
                } else {
                  if (ki.field_v != td.field_b) {
                    break L13;
                  } else {
                    ki.field_v = 0;
                    wk.field_c = false;
                    break L13;
                  }
                }
              }
              L14: {
                vk.field_b = -1;
                wg.field_c = -1;
                if (param1 > 79) {
                  break L14;
                } else {
                  pb discarded$22 = cl.a(-42, 42, 30);
                  break L14;
                }
              }
              return;
            }
          }
        }
        L15: {
          if (param0 != null) {
            if (!param0.equals((Object) (Object) hk.field_m)) {
              break L15;
            } else {
              L16: {
                if (wk.field_c) {
                  break L16;
                } else {
                  if (pc.field_g <= ki.field_v) {
                    break L16;
                  } else {
                    if (qc.field_a) {
                      am.field_f = vk.field_b;
                      ki.field_v = 0;
                      h.field_c = wg.field_c;
                      break L16;
                    } else {
                      L17: {
                        hk.field_m = param0;
                        if (!wk.field_c) {
                          break L17;
                        } else {
                          if (ki.field_v != td.field_b) {
                            break L17;
                          } else {
                            L18: {
                              ki.field_v = 0;
                              wk.field_c = false;
                              vk.field_b = -1;
                              wg.field_c = -1;
                              if (param1 > 79) {
                                break L18;
                              } else {
                                pb discarded$23 = cl.a(-42, 42, 30);
                                break L18;
                              }
                            }
                            return;
                          }
                        }
                      }
                      vk.field_b = -1;
                      wg.field_c = -1;
                      if (param1 > 79) {
                        return;
                      } else {
                        pb discarded$24 = cl.a(-42, 42, 30);
                        return;
                      }
                    }
                  }
                }
              }
              L19: {
                hk.field_m = param0;
                if (!wk.field_c) {
                  break L19;
                } else {
                  if (ki.field_v != td.field_b) {
                    break L19;
                  } else {
                    ki.field_v = 0;
                    wk.field_c = false;
                    vk.field_b = -1;
                    wg.field_c = -1;
                    if (param1 > 79) {
                      return;
                    } else {
                      pb discarded$25 = cl.a(-42, 42, 30);
                      return;
                    }
                  }
                }
              }
              vk.field_b = -1;
              wg.field_c = -1;
              if (param1 > 79) {
                return;
              } else {
                pb discarded$26 = cl.a(-42, 42, 30);
                return;
              }
            }
          } else {
            if (null == hk.field_m) {
              break L15;
            } else {
              L20: {
                if (wk.field_c) {
                  break L20;
                } else {
                  if (pc.field_g <= ki.field_v) {
                    break L20;
                  } else {
                    if (qc.field_a) {
                      am.field_f = vk.field_b;
                      ki.field_v = 0;
                      h.field_c = wg.field_c;
                      break L20;
                    } else {
                      L21: {
                        hk.field_m = param0;
                        if (!wk.field_c) {
                          break L21;
                        } else {
                          if (ki.field_v != td.field_b) {
                            break L21;
                          } else {
                            L22: {
                              ki.field_v = 0;
                              wk.field_c = false;
                              vk.field_b = -1;
                              wg.field_c = -1;
                              if (param1 > 79) {
                                break L22;
                              } else {
                                pb discarded$27 = cl.a(-42, 42, 30);
                                break L22;
                              }
                            }
                            return;
                          }
                        }
                      }
                      vk.field_b = -1;
                      wg.field_c = -1;
                      if (param1 > 79) {
                        return;
                      } else {
                        pb discarded$28 = cl.a(-42, 42, 30);
                        return;
                      }
                    }
                  }
                }
              }
              L23: {
                hk.field_m = param0;
                if (!wk.field_c) {
                  break L23;
                } else {
                  if (ki.field_v != td.field_b) {
                    break L23;
                  } else {
                    ki.field_v = 0;
                    wk.field_c = false;
                    vk.field_b = -1;
                    wg.field_c = -1;
                    if (param1 > 79) {
                      return;
                    } else {
                      pb discarded$29 = cl.a(-42, 42, 30);
                      return;
                    }
                  }
                }
              }
              vk.field_b = -1;
              wg.field_c = -1;
              if (param1 > 79) {
                return;
              } else {
                pb discarded$30 = cl.a(-42, 42, 30);
                return;
              }
            }
          }
        }
        L24: {
          L25: {
            if (wk.field_c) {
              break L25;
            } else {
              if (pc.field_g > ki.field_v) {
                break L25;
              } else {
                if ((ki.field_v ^ -1) <= (pc.field_g + ul.field_D ^ -1)) {
                  break L25;
                } else {
                  stackOut_103_0 = 1;
                  stackIn_105_0 = stackOut_103_0;
                  break L24;
                }
              }
            }
          }
          stackOut_104_0 = 0;
          stackIn_105_0 = stackOut_104_0;
          break L24;
        }
        L26: {
          var2 = stackIn_105_0;
          if (param0 == null) {
            ki.field_v = 0;
            break L26;
          } else {
            if (wk.field_c) {
              ki.field_v = pc.field_g;
              break L26;
            } else {
              if (var2 == 0) {
                L27: {
                  ki.field_v = 0;
                  am.field_f = vk.field_b;
                  if (param0 == null) {
                    if (var2 != 0) {
                      wk.field_c = true;
                      break L27;
                    } else {
                      break L27;
                    }
                  } else {
                    wk.field_c = false;
                    break L27;
                  }
                }
                L28: {
                  h.field_c = wg.field_c;
                  if (wk.field_c) {
                    break L28;
                  } else {
                    if (pc.field_g <= ki.field_v) {
                      break L28;
                    } else {
                      if (qc.field_a) {
                        am.field_f = vk.field_b;
                        ki.field_v = 0;
                        h.field_c = wg.field_c;
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                  }
                }
                L29: {
                  hk.field_m = param0;
                  if (!wk.field_c) {
                    break L29;
                  } else {
                    if (ki.field_v != td.field_b) {
                      break L29;
                    } else {
                      ki.field_v = 0;
                      wk.field_c = false;
                      break L29;
                    }
                  }
                }
                L30: {
                  vk.field_b = -1;
                  wg.field_c = -1;
                  if (param1 > 79) {
                    break L30;
                  } else {
                    pb discarded$31 = cl.a(-42, 42, 30);
                    break L30;
                  }
                }
                return;
              } else {
                ki.field_v = pc.field_g;
                break L26;
              }
            }
          }
        }
        am.field_f = vk.field_b;
        if (param0 == null) {
          if (var2 != 0) {
            L31: {
              wk.field_c = true;
              h.field_c = wg.field_c;
              if (wk.field_c) {
                break L31;
              } else {
                if (pc.field_g <= ki.field_v) {
                  break L31;
                } else {
                  if (qc.field_a) {
                    am.field_f = vk.field_b;
                    ki.field_v = 0;
                    h.field_c = wg.field_c;
                    break L31;
                  } else {
                    L32: {
                      hk.field_m = param0;
                      if (!wk.field_c) {
                        break L32;
                      } else {
                        if (ki.field_v != td.field_b) {
                          break L32;
                        } else {
                          L33: {
                            ki.field_v = 0;
                            wk.field_c = false;
                            vk.field_b = -1;
                            wg.field_c = -1;
                            if (param1 > 79) {
                              break L33;
                            } else {
                              pb discarded$32 = cl.a(-42, 42, 30);
                              break L33;
                            }
                          }
                          return;
                        }
                      }
                    }
                    vk.field_b = -1;
                    wg.field_c = -1;
                    if (param1 > 79) {
                      return;
                    } else {
                      pb discarded$33 = cl.a(-42, 42, 30);
                      return;
                    }
                  }
                }
              }
            }
            L34: {
              hk.field_m = param0;
              if (!wk.field_c) {
                break L34;
              } else {
                if (ki.field_v != td.field_b) {
                  break L34;
                } else {
                  ki.field_v = 0;
                  wk.field_c = false;
                  vk.field_b = -1;
                  wg.field_c = -1;
                  if (param1 > 79) {
                    return;
                  } else {
                    pb discarded$34 = cl.a(-42, 42, 30);
                    return;
                  }
                }
              }
            }
            vk.field_b = -1;
            wg.field_c = -1;
            if (param1 > 79) {
              return;
            } else {
              pb discarded$35 = cl.a(-42, 42, 30);
              return;
            }
          } else {
            L35: {
              h.field_c = wg.field_c;
              if (wk.field_c) {
                break L35;
              } else {
                if (pc.field_g <= ki.field_v) {
                  break L35;
                } else {
                  if (qc.field_a) {
                    am.field_f = vk.field_b;
                    ki.field_v = 0;
                    h.field_c = wg.field_c;
                    break L35;
                  } else {
                    L36: {
                      hk.field_m = param0;
                      if (!wk.field_c) {
                        break L36;
                      } else {
                        if (ki.field_v != td.field_b) {
                          break L36;
                        } else {
                          ki.field_v = 0;
                          wk.field_c = false;
                          break L36;
                        }
                      }
                    }
                    L37: {
                      vk.field_b = -1;
                      wg.field_c = -1;
                      if (param1 > 79) {
                        break L37;
                      } else {
                        pb discarded$36 = cl.a(-42, 42, 30);
                        break L37;
                      }
                    }
                    return;
                  }
                }
              }
            }
            L38: {
              hk.field_m = param0;
              if (!wk.field_c) {
                break L38;
              } else {
                if (ki.field_v != td.field_b) {
                  break L38;
                } else {
                  L39: {
                    ki.field_v = 0;
                    wk.field_c = false;
                    vk.field_b = -1;
                    wg.field_c = -1;
                    if (param1 > 79) {
                      break L39;
                    } else {
                      pb discarded$37 = cl.a(-42, 42, 30);
                      break L39;
                    }
                  }
                  return;
                }
              }
            }
            vk.field_b = -1;
            wg.field_c = -1;
            if (param1 > 79) {
              return;
            } else {
              pb discarded$38 = cl.a(-42, 42, 30);
              return;
            }
          }
        } else {
          L40: {
            wk.field_c = false;
            h.field_c = wg.field_c;
            if (wk.field_c) {
              break L40;
            } else {
              if (pc.field_g <= ki.field_v) {
                break L40;
              } else {
                if (qc.field_a) {
                  am.field_f = vk.field_b;
                  ki.field_v = 0;
                  h.field_c = wg.field_c;
                  break L40;
                } else {
                  break L40;
                }
              }
            }
          }
          L41: {
            hk.field_m = param0;
            if (!wk.field_c) {
              break L41;
            } else {
              if (ki.field_v != td.field_b) {
                break L41;
              } else {
                ki.field_v = 0;
                wk.field_c = false;
                break L41;
              }
            }
          }
          L42: {
            vk.field_b = -1;
            wg.field_c = -1;
            if (param1 > 79) {
              break L42;
            } else {
              pb discarded$39 = cl.a(-42, 42, 30);
              break L42;
            }
          }
          return;
        }
    }

    final static byte[] a(int param0, byte[] param1) {
        int var2 = param1.length;
        byte[] var3 = new byte[var2];
        ri.a(param1, param0, var3, 0, var2);
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = -1605303501;
    }
}
