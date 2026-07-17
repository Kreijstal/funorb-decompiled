/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn {
    private int field_f;
    private int field_c;
    private int field_e;
    int field_b;
    int field_g;
    private int field_a;
    private boolean field_d;

    final boolean a(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == -1) {
          if (((jn) this).field_f == 0) {
            if (((jn) this).field_c != 84) {
              if (83 == ((jn) this).field_c) {
                return true;
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
          ((jn) this).field_a = 15;
          if (((jn) this).field_f == 0) {
            if (((jn) this).field_c == 84) {
              return true;
            } else {
              L0: {
                if (83 != ((jn) this).field_c) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L0;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        }
    }

    final static void a(int param0, vn param1) {
        try {
            bi.field_g = 0;
            em.field_j = 0;
            nc.field_c = param1;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "jn.E(" + 0 + 44 + (param1 != null ? "{...}" : "null") + 44 + 0 + 44 + 0 + 41);
        }
    }

    final void a(byte param0, int param1) {
        ((jn) this).field_f = 0;
        if (param0 == -21) {
          ((jn) this).field_c = 0;
          if (((jn) this).field_a != 0) {
            L0: {
              if (((jn) this).field_a != 0) {
                break L0;
              } else {
                if (aa.field_n == 96) {
                  L1: {
                    if (((jn) this).field_g <= 0) {
                      ((jn) this).field_g = ((jn) this).field_b;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  ((jn) this).field_g = ((jn) this).field_g - 1;
                  ((jn) this).field_d = false;
                  break L0;
                } else {
                  if (((jn) this).field_a == 0) {
                    if (aa.field_n == 97) {
                      ((jn) this).field_g = ((jn) this).field_g + 1;
                      ((jn) this).field_d = false;
                      if (((jn) this).field_g >= ((jn) this).field_b) {
                        ((jn) this).field_g = 0;
                        if (((jn) this).field_a != 0) {
                          return;
                        } else {
                          L2: {
                            if (aa.field_n == 98) {
                              break L2;
                            } else {
                              if (99 == aa.field_n) {
                                break L2;
                              } else {
                                return;
                              }
                            }
                          }
                          if (0 <= ((jn) this).field_g) {
                            ((jn) this).field_d = false;
                            return;
                          } else {
                            ((jn) this).field_g = param1;
                            ((jn) this).field_d = false;
                            return;
                          }
                        }
                      } else {
                        if (((jn) this).field_a != 0) {
                          return;
                        } else {
                          L3: {
                            if (aa.field_n == 98) {
                              break L3;
                            } else {
                              if (99 == aa.field_n) {
                                break L3;
                              } else {
                                return;
                              }
                            }
                          }
                          if (0 <= ((jn) this).field_g) {
                            ((jn) this).field_d = false;
                            return;
                          } else {
                            ((jn) this).field_g = param1;
                            ((jn) this).field_d = false;
                            return;
                          }
                        }
                      }
                    } else {
                      L4: {
                        if (((jn) this).field_a != 0) {
                          break L4;
                        } else {
                          L5: {
                            if (aa.field_n == 98) {
                              break L5;
                            } else {
                              if (99 == aa.field_n) {
                                break L5;
                              } else {
                                break L4;
                              }
                            }
                          }
                          if (0 <= ((jn) this).field_g) {
                            ((jn) this).field_d = false;
                            return;
                          } else {
                            ((jn) this).field_g = param1;
                            ((jn) this).field_d = false;
                            return;
                          }
                        }
                      }
                      return;
                    }
                  } else {
                    if (((jn) this).field_a != 0) {
                      return;
                    } else {
                      L6: {
                        if (aa.field_n == 98) {
                          break L6;
                        } else {
                          if (99 == aa.field_n) {
                            break L6;
                          } else {
                            return;
                          }
                        }
                      }
                      if (0 <= ((jn) this).field_g) {
                        ((jn) this).field_d = false;
                        return;
                      } else {
                        ((jn) this).field_g = param1;
                        ((jn) this).field_d = false;
                        return;
                      }
                    }
                  }
                }
              }
            }
            L7: {
              if (((jn) this).field_a != 0) {
                break L7;
              } else {
                if (aa.field_n == 97) {
                  ((jn) this).field_g = ((jn) this).field_g + 1;
                  ((jn) this).field_d = false;
                  if (((jn) this).field_g < ((jn) this).field_b) {
                    break L7;
                  } else {
                    ((jn) this).field_g = 0;
                    if (((jn) this).field_a != 0) {
                      return;
                    } else {
                      L8: {
                        if (aa.field_n == 98) {
                          break L8;
                        } else {
                          if (99 == aa.field_n) {
                            break L8;
                          } else {
                            return;
                          }
                        }
                      }
                      if (0 <= ((jn) this).field_g) {
                        ((jn) this).field_d = false;
                        return;
                      } else {
                        ((jn) this).field_g = param1;
                        ((jn) this).field_d = false;
                        return;
                      }
                    }
                  }
                } else {
                  if (((jn) this).field_a != 0) {
                    return;
                  } else {
                    L9: {
                      if (aa.field_n == 98) {
                        break L9;
                      } else {
                        if (99 == aa.field_n) {
                          break L9;
                        } else {
                          return;
                        }
                      }
                    }
                    if (0 <= ((jn) this).field_g) {
                      ((jn) this).field_d = false;
                      return;
                    } else {
                      ((jn) this).field_g = param1;
                      ((jn) this).field_d = false;
                      return;
                    }
                  }
                }
              }
            }
            if (((jn) this).field_a != 0) {
              return;
            } else {
              L10: {
                if (aa.field_n == 98) {
                  break L10;
                } else {
                  if (99 == aa.field_n) {
                    break L10;
                  } else {
                    return;
                  }
                }
              }
              if (0 <= ((jn) this).field_g) {
                ((jn) this).field_d = false;
                return;
              } else {
                ((jn) this).field_g = param1;
                ((jn) this).field_d = false;
                return;
              }
            }
          } else {
            ((jn) this).field_c = aa.field_n;
            if (((jn) this).field_a == 0) {
              L11: {
                if (aa.field_n == 96) {
                  L12: {
                    if (((jn) this).field_g <= 0) {
                      ((jn) this).field_g = ((jn) this).field_b;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  ((jn) this).field_g = ((jn) this).field_g - 1;
                  ((jn) this).field_d = false;
                  break L11;
                } else {
                  break L11;
                }
              }
              if (((jn) this).field_a == 0) {
                L13: {
                  if (aa.field_n == 97) {
                    ((jn) this).field_g = ((jn) this).field_g + 1;
                    ((jn) this).field_d = false;
                    if (((jn) this).field_g < ((jn) this).field_b) {
                      break L13;
                    } else {
                      ((jn) this).field_g = 0;
                      break L13;
                    }
                  } else {
                    break L13;
                  }
                }
                if (((jn) this).field_a != 0) {
                  return;
                } else {
                  L14: {
                    if (aa.field_n == 98) {
                      break L14;
                    } else {
                      if (99 == aa.field_n) {
                        break L14;
                      } else {
                        return;
                      }
                    }
                  }
                  if (0 <= ((jn) this).field_g) {
                    ((jn) this).field_d = false;
                    return;
                  } else {
                    ((jn) this).field_g = param1;
                    ((jn) this).field_d = false;
                    return;
                  }
                }
              } else {
                L15: {
                  if (((jn) this).field_a != 0) {
                    break L15;
                  } else {
                    L16: {
                      if (aa.field_n == 98) {
                        break L16;
                      } else {
                        if (99 == aa.field_n) {
                          break L16;
                        } else {
                          break L15;
                        }
                      }
                    }
                    if (0 <= ((jn) this).field_g) {
                      ((jn) this).field_d = false;
                      return;
                    } else {
                      ((jn) this).field_g = param1;
                      ((jn) this).field_d = false;
                      return;
                    }
                  }
                }
                return;
              }
            } else {
              L17: {
                if (((jn) this).field_a != 0) {
                  break L17;
                } else {
                  if (aa.field_n == 97) {
                    ((jn) this).field_g = ((jn) this).field_g + 1;
                    ((jn) this).field_d = false;
                    if (((jn) this).field_g < ((jn) this).field_b) {
                      break L17;
                    } else {
                      ((jn) this).field_g = 0;
                      break L17;
                    }
                  } else {
                    break L17;
                  }
                }
              }
              L18: {
                if (((jn) this).field_a != 0) {
                  break L18;
                } else {
                  L19: {
                    if (aa.field_n == 98) {
                      break L19;
                    } else {
                      if (99 == aa.field_n) {
                        break L19;
                      } else {
                        break L18;
                      }
                    }
                  }
                  if (0 <= ((jn) this).field_g) {
                    ((jn) this).field_d = false;
                    return;
                  } else {
                    ((jn) this).field_g = param1;
                    ((jn) this).field_d = false;
                    return;
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

    final void a(int param0, int param1, int param2) {
        if (~((jn) this).field_b < ~param1) {
          if (param0 < ((jn) this).field_b) {
            ((jn) this).field_f = 0;
            ((jn) this).field_c = 0;
            if (param2 == 4) {
              L0: {
                if (gg.field_J != 0) {
                  ((jn) this).field_a = gg.field_J;
                  ((jn) this).field_e = fc.field_d;
                  ((jn) this).field_d = true;
                  ((jn) this).field_f = gg.field_J;
                  ((jn) this).field_g = param0;
                  break L0;
                } else {
                  break L0;
                }
              }
              L1: {
                if (0 == ((jn) this).field_a) {
                  break L1;
                } else {
                  if (rd.field_f != 0) {
                    L2: {
                      if (((jn) this).field_e <= 0) {
                        ((jn) this).field_e = tl.field_x;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    ((jn) this).field_e = ((jn) this).field_e - 1;
                    break L1;
                  } else {
                    if (gg.field_J == 0) {
                      if (rd.field_f == 0) {
                        ((jn) this).field_a = 0;
                        if (((jn) this).field_a == 0) {
                          L3: {
                            L4: {
                              if (((jn) this).field_d) {
                                break L4;
                              } else {
                                if (na.field_k) {
                                  break L4;
                                } else {
                                  break L3;
                                }
                              }
                            }
                            if (param1 < 0) {
                              if (!((jn) this).field_d) {
                                break L3;
                              } else {
                                ((jn) this).field_g = -1;
                                return;
                              }
                            } else {
                              if (~((jn) this).field_g == ~param1) {
                                ((jn) this).field_d = true;
                                ((jn) this).field_g = param1;
                                break L3;
                              } else {
                                ((jn) this).field_d = true;
                                ((jn) this).field_g = param1;
                                return;
                              }
                            }
                          }
                          return;
                        } else {
                          return;
                        }
                      } else {
                        L5: {
                          if (((jn) this).field_a != 0) {
                            break L5;
                          } else {
                            L6: {
                              if (((jn) this).field_d) {
                                break L6;
                              } else {
                                if (na.field_k) {
                                  break L6;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            if (param1 < 0) {
                              if (!((jn) this).field_d) {
                                break L5;
                              } else {
                                ((jn) this).field_g = -1;
                                break L5;
                              }
                            } else {
                              if (~((jn) this).field_g == ~param1) {
                                ((jn) this).field_d = true;
                                ((jn) this).field_g = param1;
                                break L5;
                              } else {
                                ((jn) this).field_d = true;
                                ((jn) this).field_g = param1;
                                break L5;
                              }
                            }
                          }
                        }
                        return;
                      }
                    } else {
                      L7: {
                        if (((jn) this).field_a != 0) {
                          break L7;
                        } else {
                          L8: {
                            if (((jn) this).field_d) {
                              break L8;
                            } else {
                              if (na.field_k) {
                                break L8;
                              } else {
                                break L7;
                              }
                            }
                          }
                          if (param1 < 0) {
                            if (!((jn) this).field_d) {
                              break L7;
                            } else {
                              ((jn) this).field_g = -1;
                              break L7;
                            }
                          } else {
                            if (~((jn) this).field_g == ~param1) {
                              ((jn) this).field_d = true;
                              ((jn) this).field_g = param1;
                              break L7;
                            } else {
                              ((jn) this).field_d = true;
                              ((jn) this).field_g = param1;
                              break L7;
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                }
              }
              L9: {
                if (gg.field_J != 0) {
                  break L9;
                } else {
                  if (rd.field_f != 0) {
                    break L9;
                  } else {
                    L10: {
                      ((jn) this).field_a = 0;
                      if (((jn) this).field_a != 0) {
                        break L10;
                      } else {
                        L11: {
                          if (((jn) this).field_d) {
                            break L11;
                          } else {
                            if (na.field_k) {
                              break L11;
                            } else {
                              return;
                            }
                          }
                        }
                        if (param1 < 0) {
                          if (!((jn) this).field_d) {
                            break L10;
                          } else {
                            ((jn) this).field_g = -1;
                            return;
                          }
                        } else {
                          if (~((jn) this).field_g == ~param1) {
                            ((jn) this).field_d = true;
                            ((jn) this).field_g = param1;
                            return;
                          } else {
                            ((jn) this).field_d = true;
                            ((jn) this).field_g = param1;
                            return;
                          }
                        }
                      }
                    }
                    return;
                  }
                }
              }
              L12: {
                if (((jn) this).field_a != 0) {
                  break L12;
                } else {
                  L13: {
                    if (((jn) this).field_d) {
                      break L13;
                    } else {
                      if (na.field_k) {
                        break L13;
                      } else {
                        return;
                      }
                    }
                  }
                  if (param1 < 0) {
                    if (!((jn) this).field_d) {
                      break L12;
                    } else {
                      ((jn) this).field_g = -1;
                      return;
                    }
                  } else {
                    if (~((jn) this).field_g == ~param1) {
                      ((jn) this).field_d = true;
                      ((jn) this).field_g = param1;
                      return;
                    } else {
                      ((jn) this).field_d = true;
                      ((jn) this).field_g = param1;
                      return;
                    }
                  }
                }
              }
              return;
            } else {
              return;
            }
          } else {
            throw new IllegalArgumentException();
          }
        } else {
          throw new IllegalArgumentException();
        }
    }

    final static boolean a() {
        if (10 > bk.field_w) {
            return false;
        }
        if (pf.field_d < 13) {
            return false;
        }
        return true;
    }

    final void b(int param0) {
        L0: {
          ((jn) this).field_f = 0;
          ((jn) this).field_c = 0;
          if (param0 == ((jn) this).field_a) {
            ((jn) this).field_c = aa.field_n;
            break L0;
          } else {
            break L0;
          }
        }
        if (-1 == ((jn) this).field_a) {
          if (aa.field_n == 98) {
            if (((jn) this).field_g > 0) {
              L1: {
                ((jn) this).field_g = ((jn) this).field_g - 1;
                ((jn) this).field_d = false;
                if (0 != ((jn) this).field_a) {
                  break L1;
                } else {
                  if (99 != aa.field_n) {
                    break L1;
                  } else {
                    L2: {
                      ((jn) this).field_g = ((jn) this).field_g + 1;
                      if (((jn) this).field_g >= ((jn) this).field_b) {
                        ((jn) this).field_g = 0;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    ((jn) this).field_d = false;
                    break L1;
                  }
                }
              }
              return;
            } else {
              ((jn) this).field_g = ((jn) this).field_b;
              L3: {
                ((jn) this).field_g = ((jn) this).field_g - 1;
                ((jn) this).field_d = false;
                if (0 != ((jn) this).field_a) {
                  break L3;
                } else {
                  if (99 != aa.field_n) {
                    break L3;
                  } else {
                    L4: {
                      ((jn) this).field_g = ((jn) this).field_g + 1;
                      if (((jn) this).field_g >= ((jn) this).field_b) {
                        ((jn) this).field_g = 0;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    ((jn) this).field_d = false;
                    break L3;
                  }
                }
              }
              return;
            }
          } else {
            if (0 == ((jn) this).field_a) {
              if (99 != aa.field_n) {
                return;
              } else {
                L5: {
                  ((jn) this).field_g = ((jn) this).field_g + 1;
                  if (((jn) this).field_g >= ((jn) this).field_b) {
                    ((jn) this).field_g = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                ((jn) this).field_d = false;
                return;
              }
            } else {
              return;
            }
          }
        } else {
          L6: {
            if (0 != ((jn) this).field_a) {
              break L6;
            } else {
              if (99 != aa.field_n) {
                break L6;
              } else {
                L7: {
                  ((jn) this).field_g = ((jn) this).field_g + 1;
                  if (((jn) this).field_g >= ((jn) this).field_b) {
                    ((jn) this).field_g = 0;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                ((jn) this).field_d = false;
                break L6;
              }
            }
          }
          return;
        }
    }

    final static void a(gn param0, int param1, gn param2) {
        try {
            gh.field_n = new vi[7];
            pd.field_f = param2;
            em.field_m = new String[7];
            i.field_k = new vi[7];
            bd.field_Q = param0;
            em.field_m[0] = "holdtheline_title";
            em.field_m[5] = "holdtheline_alpine";
            em.field_m[1] = "holdtheline_victory_jingle";
            ab.field_jb = -1;
            oc.field_a = 7;
            em.field_m[4] = "holdtheline_desert";
            bi.field_e = 0;
            em.field_m[6] = "holdtheline_urban";
            em.field_m[2] = "holdtheline_lose_jingle";
            em.field_m[3] = "holdtheline_classic";
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "jn.A(" + (param0 != null ? "{...}" : "null") + 44 + -127 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static int a(int param0, byte param1, da param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            var3_int = param2.h(param0, 7);
            L1: {
              if ((1 << param0) - 1 == var3_int) {
                var3_int = -1;
                break L1;
              } else {
                break L1;
              }
            }
            stackOut_5_0 = var3_int;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("jn.I(").append(param0).append(44).append(-96).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0;
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param2) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((jn) this).field_d = stackIn_3_1 != 0;
        ((jn) this).field_a = param1;
        if (!((jn) this).field_d) {
          ((jn) this).field_g = param3;
          return;
        } else {
          ((jn) this).field_g = param0;
          return;
        }
    }

    jn(int param0) {
        ((jn) this).field_g = 0;
        ((jn) this).field_d = false;
        ((jn) this).field_b = param0;
    }

    static {
    }
}
