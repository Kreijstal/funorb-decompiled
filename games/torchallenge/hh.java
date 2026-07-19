/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    static java.awt.Font field_a;
    static ka field_b;
    static int[][][] field_c;

    final static int[] b(int param0, int param1, int param2) {
        int[] discarded$1 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          if (param1 == 7429) {
            break L0;
          } else {
            discarded$1 = hh.b(-62, -101, 108);
            break L0;
          }
        }
        var3 = ai.a(true, param0);
        var4 = lc.b(-88, param0);
        var5 = ai.a(true, param2);
        var6 = lc.b(-116, param2);
        var7 = (int)((long)var5 * (long)var3 >> 1515446672);
        var8 = (int)((long)var3 * (long)var6 >> -999452336);
        var9 = (int)((long)var4 * (long)var5 >> -1055390000);
        var10 = (int)((long)var6 * (long)var4 >> -2000789680);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    final static void a(int param0, int param1, int param2) {
        if (param0 != 2) {
          L0: {
            L1: {
              field_b = (ka) null;
              if (kc.field_s == null) {
                break L1;
              } else {
                if (param2 > kc.field_s.length) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            kc.field_s = new int[2 * param2];
            break L0;
          }
          if (null != bg.field_Q) {
            L2: {
              if (param2 > bg.field_Q.length) {
                bg.field_Q = new int[param2 * 2];
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                if (rk.field_p == null) {
                  break L4;
                } else {
                  if (rk.field_p.length >= param2) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              rk.field_p = new int[2 * param2];
              break L3;
            }
            L5: {
              if (null == ea.field_a) {
                break L5;
              } else {
                if (ea.field_a.length >= param2) {
                  if (cb.field_e == null) {
                    L6: {
                      L7: {
                        cb.field_e = new int[param2 * 2];
                        if (bj.field_b == null) {
                          break L7;
                        } else {
                          if (param2 > bj.field_b.length) {
                            break L7;
                          } else {
                            break L6;
                          }
                        }
                      }
                      bj.field_b = new int[param2 * 2];
                      break L6;
                    }
                    if (null == hi.field_G) {
                      L8: {
                        hi.field_G = new int[(param1 + param2) * 2];
                        if (null == qa.field_i) {
                          break L8;
                        } else {
                          if (qa.field_i.length >= param2) {
                            bb.field_c = 0;
                            ia.field_q = -2147483648;
                            v.field_Z = -2147483648;
                            ol.field_d = 2147483647;
                            pi.field_e = 2147483647;
                            return;
                          } else {
                            break L8;
                          }
                        }
                      }
                      qa.field_i = new boolean[param2 * 2];
                      bb.field_c = 0;
                      ia.field_q = -2147483648;
                      v.field_Z = -2147483648;
                      ol.field_d = 2147483647;
                      pi.field_e = 2147483647;
                      return;
                    } else {
                      if (param1 + param2 <= hi.field_G.length) {
                        if (null == qa.field_i) {
                          qa.field_i = new boolean[param2 * 2];
                          bb.field_c = 0;
                          ia.field_q = -2147483648;
                          v.field_Z = -2147483648;
                          ol.field_d = 2147483647;
                          pi.field_e = 2147483647;
                          return;
                        } else {
                          if (qa.field_i.length < param2) {
                            qa.field_i = new boolean[param2 * 2];
                            bb.field_c = 0;
                            ia.field_q = -2147483648;
                            v.field_Z = -2147483648;
                            ol.field_d = 2147483647;
                            pi.field_e = 2147483647;
                            return;
                          } else {
                            bb.field_c = 0;
                            ia.field_q = -2147483648;
                            v.field_Z = -2147483648;
                            ol.field_d = 2147483647;
                            pi.field_e = 2147483647;
                            return;
                          }
                        }
                      } else {
                        L9: {
                          hi.field_G = new int[(param1 + param2) * 2];
                          if (null == qa.field_i) {
                            break L9;
                          } else {
                            if (qa.field_i.length >= param2) {
                              bb.field_c = 0;
                              ia.field_q = -2147483648;
                              v.field_Z = -2147483648;
                              ol.field_d = 2147483647;
                              pi.field_e = 2147483647;
                              return;
                            } else {
                              break L9;
                            }
                          }
                        }
                        qa.field_i = new boolean[param2 * 2];
                        bb.field_c = 0;
                        ia.field_q = -2147483648;
                        v.field_Z = -2147483648;
                        ol.field_d = 2147483647;
                        pi.field_e = 2147483647;
                        return;
                      }
                    }
                  } else {
                    if (param2 <= cb.field_e.length) {
                      L10: {
                        L11: {
                          if (bj.field_b == null) {
                            break L11;
                          } else {
                            if (param2 > bj.field_b.length) {
                              break L11;
                            } else {
                              break L10;
                            }
                          }
                        }
                        bj.field_b = new int[param2 * 2];
                        break L10;
                      }
                      if (null == hi.field_G) {
                        hi.field_G = new int[(param1 + param2) * 2];
                        if (null == qa.field_i) {
                          qa.field_i = new boolean[param2 * 2];
                          bb.field_c = 0;
                          ia.field_q = -2147483648;
                          v.field_Z = -2147483648;
                          ol.field_d = 2147483647;
                          pi.field_e = 2147483647;
                          return;
                        } else {
                          if (qa.field_i.length < param2) {
                            qa.field_i = new boolean[param2 * 2];
                            bb.field_c = 0;
                            ia.field_q = -2147483648;
                            v.field_Z = -2147483648;
                            ol.field_d = 2147483647;
                            pi.field_e = 2147483647;
                            return;
                          } else {
                            bb.field_c = 0;
                            ia.field_q = -2147483648;
                            v.field_Z = -2147483648;
                            ol.field_d = 2147483647;
                            pi.field_e = 2147483647;
                            return;
                          }
                        }
                      } else {
                        if (param1 + param2 <= hi.field_G.length) {
                          if (null == qa.field_i) {
                            qa.field_i = new boolean[param2 * 2];
                            bb.field_c = 0;
                            ia.field_q = -2147483648;
                            v.field_Z = -2147483648;
                            ol.field_d = 2147483647;
                            pi.field_e = 2147483647;
                            return;
                          } else {
                            if (qa.field_i.length < param2) {
                              qa.field_i = new boolean[param2 * 2];
                              bb.field_c = 0;
                              ia.field_q = -2147483648;
                              v.field_Z = -2147483648;
                              ol.field_d = 2147483647;
                              pi.field_e = 2147483647;
                              return;
                            } else {
                              bb.field_c = 0;
                              ia.field_q = -2147483648;
                              v.field_Z = -2147483648;
                              ol.field_d = 2147483647;
                              pi.field_e = 2147483647;
                              return;
                            }
                          }
                        } else {
                          hi.field_G = new int[(param1 + param2) * 2];
                          if (null == qa.field_i) {
                            qa.field_i = new boolean[param2 * 2];
                            bb.field_c = 0;
                            ia.field_q = -2147483648;
                            v.field_Z = -2147483648;
                            ol.field_d = 2147483647;
                            pi.field_e = 2147483647;
                            return;
                          } else {
                            if (qa.field_i.length < param2) {
                              qa.field_i = new boolean[param2 * 2];
                              bb.field_c = 0;
                              ia.field_q = -2147483648;
                              v.field_Z = -2147483648;
                              ol.field_d = 2147483647;
                              pi.field_e = 2147483647;
                              return;
                            } else {
                              bb.field_c = 0;
                              ia.field_q = -2147483648;
                              v.field_Z = -2147483648;
                              ol.field_d = 2147483647;
                              pi.field_e = 2147483647;
                              return;
                            }
                          }
                        }
                      }
                    } else {
                      L12: {
                        L13: {
                          cb.field_e = new int[param2 * 2];
                          if (bj.field_b == null) {
                            break L13;
                          } else {
                            if (param2 > bj.field_b.length) {
                              break L13;
                            } else {
                              break L12;
                            }
                          }
                        }
                        bj.field_b = new int[param2 * 2];
                        break L12;
                      }
                      L14: {
                        L15: {
                          if (null == hi.field_G) {
                            break L15;
                          } else {
                            if (param1 + param2 <= hi.field_G.length) {
                              break L14;
                            } else {
                              break L15;
                            }
                          }
                        }
                        hi.field_G = new int[(param1 + param2) * 2];
                        break L14;
                      }
                      if (null == qa.field_i) {
                        qa.field_i = new boolean[param2 * 2];
                        bb.field_c = 0;
                        ia.field_q = -2147483648;
                        v.field_Z = -2147483648;
                        ol.field_d = 2147483647;
                        pi.field_e = 2147483647;
                        return;
                      } else {
                        if (qa.field_i.length < param2) {
                          qa.field_i = new boolean[param2 * 2];
                          bb.field_c = 0;
                          ia.field_q = -2147483648;
                          v.field_Z = -2147483648;
                          ol.field_d = 2147483647;
                          pi.field_e = 2147483647;
                          return;
                        } else {
                          bb.field_c = 0;
                          ia.field_q = -2147483648;
                          v.field_Z = -2147483648;
                          ol.field_d = 2147483647;
                          pi.field_e = 2147483647;
                          return;
                        }
                      }
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            L16: {
              L17: {
                ea.field_a = new int[param2 * 2];
                if (cb.field_e == null) {
                  break L17;
                } else {
                  if (param2 <= cb.field_e.length) {
                    break L16;
                  } else {
                    break L17;
                  }
                }
              }
              cb.field_e = new int[param2 * 2];
              break L16;
            }
            L18: {
              L19: {
                if (bj.field_b == null) {
                  break L19;
                } else {
                  if (param2 > bj.field_b.length) {
                    break L19;
                  } else {
                    break L18;
                  }
                }
              }
              bj.field_b = new int[param2 * 2];
              break L18;
            }
            L20: {
              L21: {
                if (null == hi.field_G) {
                  break L21;
                } else {
                  if (param1 + param2 <= hi.field_G.length) {
                    break L20;
                  } else {
                    break L21;
                  }
                }
              }
              hi.field_G = new int[(param1 + param2) * 2];
              break L20;
            }
            L22: {
              if (null == qa.field_i) {
                break L22;
              } else {
                if (qa.field_i.length >= param2) {
                  bb.field_c = 0;
                  ia.field_q = -2147483648;
                  v.field_Z = -2147483648;
                  ol.field_d = 2147483647;
                  pi.field_e = 2147483647;
                  return;
                } else {
                  break L22;
                }
              }
            }
            qa.field_i = new boolean[param2 * 2];
            bb.field_c = 0;
            ia.field_q = -2147483648;
            v.field_Z = -2147483648;
            ol.field_d = 2147483647;
            pi.field_e = 2147483647;
            return;
          } else {
            L23: {
              L24: {
                bg.field_Q = new int[param2 * 2];
                if (rk.field_p == null) {
                  break L24;
                } else {
                  if (rk.field_p.length >= param2) {
                    break L23;
                  } else {
                    break L24;
                  }
                }
              }
              rk.field_p = new int[2 * param2];
              break L23;
            }
            L25: {
              if (null == ea.field_a) {
                break L25;
              } else {
                if (ea.field_a.length >= param2) {
                  if (cb.field_e == null) {
                    L26: {
                      L27: {
                        cb.field_e = new int[param2 * 2];
                        if (bj.field_b == null) {
                          break L27;
                        } else {
                          if (param2 > bj.field_b.length) {
                            break L27;
                          } else {
                            break L26;
                          }
                        }
                      }
                      bj.field_b = new int[param2 * 2];
                      break L26;
                    }
                    L28: {
                      L29: {
                        if (null == hi.field_G) {
                          break L29;
                        } else {
                          if (param1 + param2 <= hi.field_G.length) {
                            break L28;
                          } else {
                            break L29;
                          }
                        }
                      }
                      hi.field_G = new int[(param1 + param2) * 2];
                      break L28;
                    }
                    L30: {
                      if (null == qa.field_i) {
                        break L30;
                      } else {
                        if (qa.field_i.length >= param2) {
                          bb.field_c = 0;
                          ia.field_q = -2147483648;
                          v.field_Z = -2147483648;
                          ol.field_d = 2147483647;
                          pi.field_e = 2147483647;
                          return;
                        } else {
                          break L30;
                        }
                      }
                    }
                    qa.field_i = new boolean[param2 * 2];
                    bb.field_c = 0;
                    ia.field_q = -2147483648;
                    v.field_Z = -2147483648;
                    ol.field_d = 2147483647;
                    pi.field_e = 2147483647;
                    return;
                  } else {
                    if (param2 <= cb.field_e.length) {
                      L31: {
                        L32: {
                          if (bj.field_b == null) {
                            break L32;
                          } else {
                            if (param2 > bj.field_b.length) {
                              break L32;
                            } else {
                              break L31;
                            }
                          }
                        }
                        bj.field_b = new int[param2 * 2];
                        break L31;
                      }
                      if (null == hi.field_G) {
                        L33: {
                          hi.field_G = new int[(param1 + param2) * 2];
                          if (null == qa.field_i) {
                            break L33;
                          } else {
                            if (qa.field_i.length >= param2) {
                              bb.field_c = 0;
                              ia.field_q = -2147483648;
                              v.field_Z = -2147483648;
                              ol.field_d = 2147483647;
                              pi.field_e = 2147483647;
                              return;
                            } else {
                              break L33;
                            }
                          }
                        }
                        qa.field_i = new boolean[param2 * 2];
                        bb.field_c = 0;
                        ia.field_q = -2147483648;
                        v.field_Z = -2147483648;
                        ol.field_d = 2147483647;
                        pi.field_e = 2147483647;
                        return;
                      } else {
                        if (param1 + param2 <= hi.field_G.length) {
                          if (null == qa.field_i) {
                            qa.field_i = new boolean[param2 * 2];
                            bb.field_c = 0;
                            ia.field_q = -2147483648;
                            v.field_Z = -2147483648;
                            ol.field_d = 2147483647;
                            pi.field_e = 2147483647;
                            return;
                          } else {
                            if (qa.field_i.length < param2) {
                              qa.field_i = new boolean[param2 * 2];
                              bb.field_c = 0;
                              ia.field_q = -2147483648;
                              v.field_Z = -2147483648;
                              ol.field_d = 2147483647;
                              pi.field_e = 2147483647;
                              return;
                            } else {
                              bb.field_c = 0;
                              ia.field_q = -2147483648;
                              v.field_Z = -2147483648;
                              ol.field_d = 2147483647;
                              pi.field_e = 2147483647;
                              return;
                            }
                          }
                        } else {
                          L34: {
                            hi.field_G = new int[(param1 + param2) * 2];
                            if (null == qa.field_i) {
                              break L34;
                            } else {
                              if (qa.field_i.length >= param2) {
                                bb.field_c = 0;
                                ia.field_q = -2147483648;
                                v.field_Z = -2147483648;
                                ol.field_d = 2147483647;
                                pi.field_e = 2147483647;
                                return;
                              } else {
                                break L34;
                              }
                            }
                          }
                          qa.field_i = new boolean[param2 * 2];
                          bb.field_c = 0;
                          ia.field_q = -2147483648;
                          v.field_Z = -2147483648;
                          ol.field_d = 2147483647;
                          pi.field_e = 2147483647;
                          return;
                        }
                      }
                    } else {
                      L35: {
                        L36: {
                          cb.field_e = new int[param2 * 2];
                          if (bj.field_b == null) {
                            break L36;
                          } else {
                            if (param2 > bj.field_b.length) {
                              break L36;
                            } else {
                              break L35;
                            }
                          }
                        }
                        bj.field_b = new int[param2 * 2];
                        break L35;
                      }
                      L37: {
                        L38: {
                          if (null == hi.field_G) {
                            break L38;
                          } else {
                            if (param1 + param2 <= hi.field_G.length) {
                              break L37;
                            } else {
                              break L38;
                            }
                          }
                        }
                        hi.field_G = new int[(param1 + param2) * 2];
                        break L37;
                      }
                      L39: {
                        if (null == qa.field_i) {
                          break L39;
                        } else {
                          if (qa.field_i.length >= param2) {
                            bb.field_c = 0;
                            ia.field_q = -2147483648;
                            v.field_Z = -2147483648;
                            ol.field_d = 2147483647;
                            pi.field_e = 2147483647;
                            return;
                          } else {
                            break L39;
                          }
                        }
                      }
                      qa.field_i = new boolean[param2 * 2];
                      bb.field_c = 0;
                      ia.field_q = -2147483648;
                      v.field_Z = -2147483648;
                      ol.field_d = 2147483647;
                      pi.field_e = 2147483647;
                      return;
                    }
                  }
                } else {
                  break L25;
                }
              }
            }
            L40: {
              L41: {
                ea.field_a = new int[param2 * 2];
                if (cb.field_e == null) {
                  break L41;
                } else {
                  if (param2 <= cb.field_e.length) {
                    break L40;
                  } else {
                    break L41;
                  }
                }
              }
              cb.field_e = new int[param2 * 2];
              break L40;
            }
            L42: {
              L43: {
                if (bj.field_b == null) {
                  break L43;
                } else {
                  if (param2 > bj.field_b.length) {
                    break L43;
                  } else {
                    break L42;
                  }
                }
              }
              bj.field_b = new int[param2 * 2];
              break L42;
            }
            L44: {
              L45: {
                if (null == hi.field_G) {
                  break L45;
                } else {
                  if (param1 + param2 <= hi.field_G.length) {
                    break L44;
                  } else {
                    break L45;
                  }
                }
              }
              hi.field_G = new int[(param1 + param2) * 2];
              break L44;
            }
            L46: {
              if (null == qa.field_i) {
                break L46;
              } else {
                if (qa.field_i.length >= param2) {
                  bb.field_c = 0;
                  ia.field_q = -2147483648;
                  v.field_Z = -2147483648;
                  ol.field_d = 2147483647;
                  pi.field_e = 2147483647;
                  return;
                } else {
                  break L46;
                }
              }
            }
            qa.field_i = new boolean[param2 * 2];
            bb.field_c = 0;
            ia.field_q = -2147483648;
            v.field_Z = -2147483648;
            ol.field_d = 2147483647;
            pi.field_e = 2147483647;
            return;
          }
        } else {
          L47: {
            L48: {
              if (kc.field_s == null) {
                break L48;
              } else {
                if (param2 > kc.field_s.length) {
                  break L48;
                } else {
                  break L47;
                }
              }
            }
            kc.field_s = new int[2 * param2];
            break L47;
          }
          L49: {
            L50: {
              if (null == bg.field_Q) {
                break L50;
              } else {
                if (param2 > bg.field_Q.length) {
                  break L50;
                } else {
                  break L49;
                }
              }
            }
            bg.field_Q = new int[param2 * 2];
            break L49;
          }
          L51: {
            L52: {
              if (rk.field_p == null) {
                break L52;
              } else {
                if (rk.field_p.length >= param2) {
                  break L51;
                } else {
                  break L52;
                }
              }
            }
            rk.field_p = new int[2 * param2];
            break L51;
          }
          L53: {
            if (null == ea.field_a) {
              break L53;
            } else {
              if (ea.field_a.length >= param2) {
                if (cb.field_e == null) {
                  L54: {
                    L55: {
                      cb.field_e = new int[param2 * 2];
                      if (bj.field_b == null) {
                        break L55;
                      } else {
                        if (param2 > bj.field_b.length) {
                          break L55;
                        } else {
                          break L54;
                        }
                      }
                    }
                    bj.field_b = new int[param2 * 2];
                    break L54;
                  }
                  L56: {
                    L57: {
                      if (null == hi.field_G) {
                        break L57;
                      } else {
                        if (param1 + param2 <= hi.field_G.length) {
                          break L56;
                        } else {
                          break L57;
                        }
                      }
                    }
                    hi.field_G = new int[(param1 + param2) * 2];
                    break L56;
                  }
                  L58: {
                    if (null == qa.field_i) {
                      break L58;
                    } else {
                      if (qa.field_i.length >= param2) {
                        bb.field_c = 0;
                        ia.field_q = -2147483648;
                        v.field_Z = -2147483648;
                        ol.field_d = 2147483647;
                        pi.field_e = 2147483647;
                        return;
                      } else {
                        break L58;
                      }
                    }
                  }
                  qa.field_i = new boolean[param2 * 2];
                  bb.field_c = 0;
                  ia.field_q = -2147483648;
                  v.field_Z = -2147483648;
                  ol.field_d = 2147483647;
                  pi.field_e = 2147483647;
                  return;
                } else {
                  if (param2 <= cb.field_e.length) {
                    L59: {
                      L60: {
                        if (bj.field_b == null) {
                          break L60;
                        } else {
                          if (param2 > bj.field_b.length) {
                            break L60;
                          } else {
                            break L59;
                          }
                        }
                      }
                      bj.field_b = new int[param2 * 2];
                      break L59;
                    }
                    if (null == hi.field_G) {
                      L61: {
                        hi.field_G = new int[(param1 + param2) * 2];
                        if (null == qa.field_i) {
                          break L61;
                        } else {
                          if (qa.field_i.length >= param2) {
                            bb.field_c = 0;
                            ia.field_q = -2147483648;
                            v.field_Z = -2147483648;
                            ol.field_d = 2147483647;
                            pi.field_e = 2147483647;
                            return;
                          } else {
                            break L61;
                          }
                        }
                      }
                      qa.field_i = new boolean[param2 * 2];
                      bb.field_c = 0;
                      ia.field_q = -2147483648;
                      v.field_Z = -2147483648;
                      ol.field_d = 2147483647;
                      pi.field_e = 2147483647;
                      return;
                    } else {
                      if (param1 + param2 <= hi.field_G.length) {
                        if (null == qa.field_i) {
                          qa.field_i = new boolean[param2 * 2];
                          bb.field_c = 0;
                          ia.field_q = -2147483648;
                          v.field_Z = -2147483648;
                          ol.field_d = 2147483647;
                          pi.field_e = 2147483647;
                          return;
                        } else {
                          if (qa.field_i.length < param2) {
                            qa.field_i = new boolean[param2 * 2];
                            bb.field_c = 0;
                            ia.field_q = -2147483648;
                            v.field_Z = -2147483648;
                            ol.field_d = 2147483647;
                            pi.field_e = 2147483647;
                            return;
                          } else {
                            bb.field_c = 0;
                            ia.field_q = -2147483648;
                            v.field_Z = -2147483648;
                            ol.field_d = 2147483647;
                            pi.field_e = 2147483647;
                            return;
                          }
                        }
                      } else {
                        L62: {
                          hi.field_G = new int[(param1 + param2) * 2];
                          if (null == qa.field_i) {
                            break L62;
                          } else {
                            if (qa.field_i.length >= param2) {
                              bb.field_c = 0;
                              ia.field_q = -2147483648;
                              v.field_Z = -2147483648;
                              ol.field_d = 2147483647;
                              pi.field_e = 2147483647;
                              return;
                            } else {
                              break L62;
                            }
                          }
                        }
                        qa.field_i = new boolean[param2 * 2];
                        bb.field_c = 0;
                        ia.field_q = -2147483648;
                        v.field_Z = -2147483648;
                        ol.field_d = 2147483647;
                        pi.field_e = 2147483647;
                        return;
                      }
                    }
                  } else {
                    L63: {
                      L64: {
                        cb.field_e = new int[param2 * 2];
                        if (bj.field_b == null) {
                          break L64;
                        } else {
                          if (param2 > bj.field_b.length) {
                            break L64;
                          } else {
                            break L63;
                          }
                        }
                      }
                      bj.field_b = new int[param2 * 2];
                      break L63;
                    }
                    L65: {
                      L66: {
                        if (null == hi.field_G) {
                          break L66;
                        } else {
                          if (param1 + param2 <= hi.field_G.length) {
                            break L65;
                          } else {
                            break L66;
                          }
                        }
                      }
                      hi.field_G = new int[(param1 + param2) * 2];
                      break L65;
                    }
                    L67: {
                      if (null == qa.field_i) {
                        break L67;
                      } else {
                        if (qa.field_i.length >= param2) {
                          bb.field_c = 0;
                          ia.field_q = -2147483648;
                          v.field_Z = -2147483648;
                          ol.field_d = 2147483647;
                          pi.field_e = 2147483647;
                          return;
                        } else {
                          break L67;
                        }
                      }
                    }
                    qa.field_i = new boolean[param2 * 2];
                    bb.field_c = 0;
                    ia.field_q = -2147483648;
                    v.field_Z = -2147483648;
                    ol.field_d = 2147483647;
                    pi.field_e = 2147483647;
                    return;
                  }
                }
              } else {
                break L53;
              }
            }
          }
          L68: {
            L69: {
              ea.field_a = new int[param2 * 2];
              if (cb.field_e == null) {
                break L69;
              } else {
                if (param2 <= cb.field_e.length) {
                  break L68;
                } else {
                  break L69;
                }
              }
            }
            cb.field_e = new int[param2 * 2];
            break L68;
          }
          L70: {
            L71: {
              if (bj.field_b == null) {
                break L71;
              } else {
                if (param2 > bj.field_b.length) {
                  break L71;
                } else {
                  break L70;
                }
              }
            }
            bj.field_b = new int[param2 * 2];
            break L70;
          }
          L72: {
            L73: {
              if (null == hi.field_G) {
                break L73;
              } else {
                if (param1 + param2 <= hi.field_G.length) {
                  break L72;
                } else {
                  break L73;
                }
              }
            }
            hi.field_G = new int[(param1 + param2) * 2];
            break L72;
          }
          L74: {
            if (null == qa.field_i) {
              break L74;
            } else {
              if (qa.field_i.length >= param2) {
                bb.field_c = 0;
                ia.field_q = -2147483648;
                v.field_Z = -2147483648;
                ol.field_d = 2147483647;
                pi.field_e = 2147483647;
                return;
              } else {
                break L74;
              }
            }
          }
          qa.field_i = new boolean[param2 * 2];
          bb.field_c = 0;
          ia.field_q = -2147483648;
          v.field_Z = -2147483648;
          ol.field_d = 2147483647;
          pi.field_e = 2147483647;
          return;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        int var1 = 65 / ((param0 - 28) / 44);
        field_a = null;
        field_c = (int[][][]) null;
    }

    static {
    }
}
