/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    static java.awt.Font field_a;
    static ka field_b;
    static int[][][] field_c;

    final static int[] b(int param0, int param1, int param2) {
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
            int[] discarded$1 = hh.b(-62, -101, 108);
            break L0;
          }
        }
        var3 = ai.a(true, param0);
        var4 = lc.b(-88, param0);
        var5 = ai.a(true, param2);
        var6 = lc.b(-116, param2);
        var7 = (int)((long)var5 * (long)var3 >> 16);
        var8 = (int)((long)var3 * (long)var6 >> 16);
        var9 = (int)((long)var4 * (long)var5 >> 16);
        var10 = (int)((long)var6 * (long)var4 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    final static void a(int param0, int param1, int param2) {
        L0: {
          L1: {
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
          if (param2 <= bg.field_Q.length) {
            L2: {
              L3: {
                if (rk.field_p == null) {
                  break L3;
                } else {
                  if (rk.field_p.length >= param2) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              rk.field_p = new int[2 * param2];
              break L2;
            }
            L4: {
              if (null == ea.field_a) {
                break L4;
              } else {
                if (ea.field_a.length >= param2) {
                  if (cb.field_e == null) {
                    L5: {
                      L6: {
                        cb.field_e = new int[param2 * 2];
                        if (bj.field_b == null) {
                          break L6;
                        } else {
                          if (param2 > bj.field_b.length) {
                            break L6;
                          } else {
                            break L5;
                          }
                        }
                      }
                      bj.field_b = new int[param2 * 2];
                      break L5;
                    }
                    if (null == hi.field_G) {
                      L7: {
                        hi.field_G = new int[(param1 + param2) * 2];
                        if (null == qa.field_i) {
                          break L7;
                        } else {
                          if (qa.field_i.length >= param2) {
                            bb.field_c = 0;
                            ia.field_q = -2147483648;
                            v.field_Z = -2147483648;
                            ol.field_d = 2147483647;
                            pi.field_e = 2147483647;
                            return;
                          } else {
                            break L7;
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
                      }
                    }
                  } else {
                    if (param2 <= cb.field_e.length) {
                      if (bj.field_b != null) {
                        L9: {
                          if (param2 > bj.field_b.length) {
                            bj.field_b = new int[param2 * 2];
                            break L9;
                          } else {
                            break L9;
                          }
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
                            if (qa.field_i.length >= param2) {
                              bb.field_c = 0;
                              ia.field_q = -2147483648;
                              v.field_Z = -2147483648;
                              ol.field_d = 2147483647;
                              pi.field_e = 2147483647;
                              return;
                            } else {
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
                              if (qa.field_i.length >= param2) {
                                bb.field_c = 0;
                                ia.field_q = -2147483648;
                                v.field_Z = -2147483648;
                                ol.field_d = 2147483647;
                                pi.field_e = 2147483647;
                                return;
                              } else {
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
                        bj.field_b = new int[param2 * 2];
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
                      }
                    } else {
                      L10: {
                        L11: {
                          cb.field_e = new int[param2 * 2];
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
                      L12: {
                        L13: {
                          if (null == hi.field_G) {
                            break L13;
                          } else {
                            if (param1 + param2 <= hi.field_G.length) {
                              break L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        hi.field_G = new int[(param1 + param2) * 2];
                        break L12;
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
                  break L4;
                }
              }
            }
            L14: {
              L15: {
                ea.field_a = new int[param2 * 2];
                if (cb.field_e == null) {
                  break L15;
                } else {
                  if (param2 <= cb.field_e.length) {
                    break L14;
                  } else {
                    break L15;
                  }
                }
              }
              cb.field_e = new int[param2 * 2];
              break L14;
            }
            L16: {
              L17: {
                if (bj.field_b == null) {
                  break L17;
                } else {
                  if (param2 > bj.field_b.length) {
                    break L17;
                  } else {
                    break L16;
                  }
                }
              }
              bj.field_b = new int[param2 * 2];
              break L16;
            }
            L18: {
              L19: {
                if (null == hi.field_G) {
                  break L19;
                } else {
                  if (param1 + param2 <= hi.field_G.length) {
                    break L18;
                  } else {
                    break L19;
                  }
                }
              }
              hi.field_G = new int[(param1 + param2) * 2];
              break L18;
            }
            L20: {
              if (null == qa.field_i) {
                break L20;
              } else {
                if (qa.field_i.length >= param2) {
                  bb.field_c = 0;
                  ia.field_q = -2147483648;
                  v.field_Z = -2147483648;
                  ol.field_d = 2147483647;
                  pi.field_e = 2147483647;
                  return;
                } else {
                  break L20;
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
            L21: {
              L22: {
                bg.field_Q = new int[param2 * 2];
                if (rk.field_p == null) {
                  break L22;
                } else {
                  if (rk.field_p.length >= param2) {
                    break L21;
                  } else {
                    break L22;
                  }
                }
              }
              rk.field_p = new int[2 * param2];
              break L21;
            }
            L23: {
              if (null == ea.field_a) {
                break L23;
              } else {
                if (ea.field_a.length >= param2) {
                  if (cb.field_e == null) {
                    L24: {
                      L25: {
                        cb.field_e = new int[param2 * 2];
                        if (bj.field_b == null) {
                          break L25;
                        } else {
                          if (param2 > bj.field_b.length) {
                            break L25;
                          } else {
                            break L24;
                          }
                        }
                      }
                      bj.field_b = new int[param2 * 2];
                      break L24;
                    }
                    L26: {
                      L27: {
                        if (null == hi.field_G) {
                          break L27;
                        } else {
                          if (param1 + param2 <= hi.field_G.length) {
                            break L26;
                          } else {
                            break L27;
                          }
                        }
                      }
                      hi.field_G = new int[(param1 + param2) * 2];
                      break L26;
                    }
                    L28: {
                      if (null == qa.field_i) {
                        break L28;
                      } else {
                        if (qa.field_i.length >= param2) {
                          bb.field_c = 0;
                          ia.field_q = -2147483648;
                          v.field_Z = -2147483648;
                          ol.field_d = 2147483647;
                          pi.field_e = 2147483647;
                          return;
                        } else {
                          break L28;
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
                      L29: {
                        L30: {
                          if (bj.field_b == null) {
                            break L30;
                          } else {
                            if (param2 > bj.field_b.length) {
                              break L30;
                            } else {
                              break L29;
                            }
                          }
                        }
                        bj.field_b = new int[param2 * 2];
                        break L29;
                      }
                      if (null == hi.field_G) {
                        L31: {
                          hi.field_G = new int[(param1 + param2) * 2];
                          if (null == qa.field_i) {
                            break L31;
                          } else {
                            if (qa.field_i.length >= param2) {
                              bb.field_c = 0;
                              ia.field_q = -2147483648;
                              v.field_Z = -2147483648;
                              ol.field_d = 2147483647;
                              pi.field_e = 2147483647;
                              return;
                            } else {
                              break L31;
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
                          L32: {
                            hi.field_G = new int[(param1 + param2) * 2];
                            if (null == qa.field_i) {
                              break L32;
                            } else {
                              if (qa.field_i.length >= param2) {
                                bb.field_c = 0;
                                ia.field_q = -2147483648;
                                v.field_Z = -2147483648;
                                ol.field_d = 2147483647;
                                pi.field_e = 2147483647;
                                return;
                              } else {
                                break L32;
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
                      L33: {
                        L34: {
                          cb.field_e = new int[param2 * 2];
                          if (bj.field_b == null) {
                            break L34;
                          } else {
                            if (param2 > bj.field_b.length) {
                              break L34;
                            } else {
                              break L33;
                            }
                          }
                        }
                        bj.field_b = new int[param2 * 2];
                        break L33;
                      }
                      L35: {
                        L36: {
                          if (null == hi.field_G) {
                            break L36;
                          } else {
                            if (param1 + param2 <= hi.field_G.length) {
                              break L35;
                            } else {
                              break L36;
                            }
                          }
                        }
                        hi.field_G = new int[(param1 + param2) * 2];
                        break L35;
                      }
                      L37: {
                        if (null == qa.field_i) {
                          break L37;
                        } else {
                          if (qa.field_i.length >= param2) {
                            bb.field_c = 0;
                            ia.field_q = -2147483648;
                            v.field_Z = -2147483648;
                            ol.field_d = 2147483647;
                            pi.field_e = 2147483647;
                            return;
                          } else {
                            break L37;
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
                  break L23;
                }
              }
            }
            L38: {
              L39: {
                ea.field_a = new int[param2 * 2];
                if (cb.field_e == null) {
                  break L39;
                } else {
                  if (param2 <= cb.field_e.length) {
                    break L38;
                  } else {
                    break L39;
                  }
                }
              }
              cb.field_e = new int[param2 * 2];
              break L38;
            }
            L40: {
              L41: {
                if (bj.field_b == null) {
                  break L41;
                } else {
                  if (param2 > bj.field_b.length) {
                    break L41;
                  } else {
                    break L40;
                  }
                }
              }
              bj.field_b = new int[param2 * 2];
              break L40;
            }
            L42: {
              L43: {
                if (null == hi.field_G) {
                  break L43;
                } else {
                  if (param1 + param2 <= hi.field_G.length) {
                    break L42;
                  } else {
                    break L43;
                  }
                }
              }
              hi.field_G = new int[(param1 + param2) * 2];
              break L42;
            }
            L44: {
              if (null == qa.field_i) {
                break L44;
              } else {
                if (qa.field_i.length >= param2) {
                  bb.field_c = 0;
                  ia.field_q = -2147483648;
                  v.field_Z = -2147483648;
                  ol.field_d = 2147483647;
                  pi.field_e = 2147483647;
                  return;
                } else {
                  break L44;
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
          L45: {
            L46: {
              bg.field_Q = new int[param2 * 2];
              if (rk.field_p == null) {
                break L46;
              } else {
                if (rk.field_p.length >= param2) {
                  break L45;
                } else {
                  break L46;
                }
              }
            }
            rk.field_p = new int[2 * param2];
            break L45;
          }
          L47: {
            if (null == ea.field_a) {
              break L47;
            } else {
              if (ea.field_a.length >= param2) {
                if (cb.field_e == null) {
                  L48: {
                    L49: {
                      cb.field_e = new int[param2 * 2];
                      if (bj.field_b == null) {
                        break L49;
                      } else {
                        if (param2 > bj.field_b.length) {
                          break L49;
                        } else {
                          break L48;
                        }
                      }
                    }
                    bj.field_b = new int[param2 * 2];
                    break L48;
                  }
                  L50: {
                    L51: {
                      if (null == hi.field_G) {
                        break L51;
                      } else {
                        if (param1 + param2 <= hi.field_G.length) {
                          break L50;
                        } else {
                          break L51;
                        }
                      }
                    }
                    hi.field_G = new int[(param1 + param2) * 2];
                    break L50;
                  }
                  L52: {
                    if (null == qa.field_i) {
                      break L52;
                    } else {
                      if (qa.field_i.length >= param2) {
                        bb.field_c = 0;
                        ia.field_q = -2147483648;
                        v.field_Z = -2147483648;
                        ol.field_d = 2147483647;
                        pi.field_e = 2147483647;
                        return;
                      } else {
                        break L52;
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
                    L53: {
                      L54: {
                        if (bj.field_b == null) {
                          break L54;
                        } else {
                          if (param2 > bj.field_b.length) {
                            break L54;
                          } else {
                            break L53;
                          }
                        }
                      }
                      bj.field_b = new int[param2 * 2];
                      break L53;
                    }
                    if (null == hi.field_G) {
                      L55: {
                        hi.field_G = new int[(param1 + param2) * 2];
                        if (null == qa.field_i) {
                          break L55;
                        } else {
                          if (qa.field_i.length >= param2) {
                            bb.field_c = 0;
                            ia.field_q = -2147483648;
                            v.field_Z = -2147483648;
                            ol.field_d = 2147483647;
                            pi.field_e = 2147483647;
                            return;
                          } else {
                            break L55;
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
                        L56: {
                          hi.field_G = new int[(param1 + param2) * 2];
                          if (null == qa.field_i) {
                            break L56;
                          } else {
                            if (qa.field_i.length >= param2) {
                              bb.field_c = 0;
                              ia.field_q = -2147483648;
                              v.field_Z = -2147483648;
                              ol.field_d = 2147483647;
                              pi.field_e = 2147483647;
                              return;
                            } else {
                              break L56;
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
                    L57: {
                      L58: {
                        cb.field_e = new int[param2 * 2];
                        if (bj.field_b == null) {
                          break L58;
                        } else {
                          if (param2 > bj.field_b.length) {
                            break L58;
                          } else {
                            break L57;
                          }
                        }
                      }
                      bj.field_b = new int[param2 * 2];
                      break L57;
                    }
                    L59: {
                      L60: {
                        if (null == hi.field_G) {
                          break L60;
                        } else {
                          if (param1 + param2 <= hi.field_G.length) {
                            break L59;
                          } else {
                            break L60;
                          }
                        }
                      }
                      hi.field_G = new int[(param1 + param2) * 2];
                      break L59;
                    }
                    L61: {
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
                  }
                }
              } else {
                break L47;
              }
            }
          }
          L62: {
            L63: {
              ea.field_a = new int[param2 * 2];
              if (cb.field_e == null) {
                break L63;
              } else {
                if (param2 <= cb.field_e.length) {
                  break L62;
                } else {
                  break L63;
                }
              }
            }
            cb.field_e = new int[param2 * 2];
            break L62;
          }
          L64: {
            L65: {
              if (bj.field_b == null) {
                break L65;
              } else {
                if (param2 > bj.field_b.length) {
                  break L65;
                } else {
                  break L64;
                }
              }
            }
            bj.field_b = new int[param2 * 2];
            break L64;
          }
          L66: {
            L67: {
              if (null == hi.field_G) {
                break L67;
              } else {
                if (param1 + param2 <= hi.field_G.length) {
                  break L66;
                } else {
                  break L67;
                }
              }
            }
            hi.field_G = new int[(param1 + param2) * 2];
            break L66;
          }
          L68: {
            if (null == qa.field_i) {
              break L68;
            } else {
              if (qa.field_i.length >= param2) {
                bb.field_c = 0;
                ia.field_q = -2147483648;
                v.field_Z = -2147483648;
                ol.field_d = 2147483647;
                pi.field_e = 2147483647;
                return;
              } else {
                break L68;
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
        int var1 = 32;
        field_a = null;
        field_c = null;
    }

    static {
    }
}
