/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class np {
    static int field_j;
    private int field_k;
    private int field_g;
    private int field_i;
    private int field_n;
    static fb field_a;
    int field_b;
    private boolean field_e;
    static int field_o;
    static String field_l;
    static int[] field_f;
    int field_c;
    private int field_h;
    static String field_d;
    static boolean field_m;

    final boolean d(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == -1) {
          if (-1 == ((np) this).field_h) {
            if (84 != ((np) this).field_i) {
              if (-84 == ((np) this).field_i) {
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
          ((np) this).field_h = 80;
          if (-1 == ((np) this).field_h) {
            if (84 == ((np) this).field_i) {
              return true;
            } else {
              L0: {
                if (-84 != ((np) this).field_i) {
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

    final void e(int param0) {
        ((np) this).field_h = 0;
        ((np) this).field_g = 0;
        ((np) this).field_i = 0;
        if (param0 > 2) {
          L0: {
            if (0 == ((np) this).field_n) {
              ((np) this).field_i = oq.field_j;
              break L0;
            } else {
              break L0;
            }
          }
          if (0 == ((np) this).field_n) {
            if (96 == oq.field_j) {
              if (-1 > (((np) this).field_c ^ -1)) {
                ((np) this).field_e = false;
                ((np) this).field_c = ((np) this).field_c - 1;
                if (0 == ((np) this).field_n) {
                  if (97 != oq.field_j) {
                    return;
                  } else {
                    L1: {
                      ((np) this).field_c = ((np) this).field_c + 1;
                      if (((np) this).field_c >= ((np) this).field_b) {
                        ((np) this).field_c = 0;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    ((np) this).field_e = false;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                ((np) this).field_c = ((np) this).field_b;
                ((np) this).field_e = false;
                ((np) this).field_c = ((np) this).field_c - 1;
                if (0 == ((np) this).field_n) {
                  if (97 != oq.field_j) {
                    return;
                  } else {
                    L2: {
                      ((np) this).field_c = ((np) this).field_c + 1;
                      if (((np) this).field_c >= ((np) this).field_b) {
                        ((np) this).field_c = 0;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    ((np) this).field_e = false;
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              if (0 == ((np) this).field_n) {
                if (97 != oq.field_j) {
                  return;
                } else {
                  L3: {
                    ((np) this).field_c = ((np) this).field_c + 1;
                    if (((np) this).field_c >= ((np) this).field_b) {
                      ((np) this).field_c = 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  ((np) this).field_e = false;
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            if (0 == ((np) this).field_n) {
              if (97 != oq.field_j) {
                return;
              } else {
                L4: {
                  ((np) this).field_c = ((np) this).field_c + 1;
                  if (((np) this).field_c >= ((np) this).field_b) {
                    ((np) this).field_c = 0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                ((np) this).field_e = false;
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final void b(int param0) {
        ((np) this).field_i = param0;
        ((np) this).field_h = 0;
        ((np) this).field_g = 0;
        if (0 == ((np) this).field_n) {
          if ((oq.field_j ^ -1) == -99) {
            L0: {
              if (-1 <= (((np) this).field_c ^ -1)) {
                ((np) this).field_c = ((np) this).field_b;
                break L0;
              } else {
                break L0;
              }
            }
            ((np) this).field_e = false;
            ((np) this).field_c = ((np) this).field_c - 1;
            if (((np) this).field_n != -1) {
              if (-1 == (((np) this).field_n ^ -1)) {
                if (99 == oq.field_j) {
                  ((np) this).field_c = ((np) this).field_c + 1;
                  ((np) this).field_e = false;
                  if (((np) this).field_b <= ((np) this).field_c) {
                    ((np) this).field_c = 0;
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              ((np) this).field_i = oq.field_j;
              if (-1 == ((np) this).field_n) {
                if (99 == oq.field_j) {
                  ((np) this).field_c = ((np) this).field_c + 1;
                  ((np) this).field_e = false;
                  if (((np) this).field_b <= ((np) this).field_c) {
                    ((np) this).field_c = 0;
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            if (((np) this).field_n != -1) {
              if (-1 == (((np) this).field_n ^ -1)) {
                if (99 == oq.field_j) {
                  ((np) this).field_c = ((np) this).field_c + 1;
                  ((np) this).field_e = false;
                  if (((np) this).field_b > ((np) this).field_c) {
                    return;
                  } else {
                    ((np) this).field_c = 0;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              ((np) this).field_i = oq.field_j;
              if (-1 == ((np) this).field_n) {
                if (99 == oq.field_j) {
                  ((np) this).field_c = ((np) this).field_c + 1;
                  ((np) this).field_e = false;
                  if (((np) this).field_b > ((np) this).field_c) {
                    return;
                  } else {
                    ((np) this).field_c = 0;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        } else {
          if (((np) this).field_n != -1) {
            if (-1 == (((np) this).field_n ^ -1)) {
              if (99 == oq.field_j) {
                ((np) this).field_c = ((np) this).field_c + 1;
                ((np) this).field_e = false;
                if (((np) this).field_b > ((np) this).field_c) {
                  return;
                } else {
                  ((np) this).field_c = 0;
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            ((np) this).field_i = oq.field_j;
            if (-1 == ((np) this).field_n) {
              if (99 == oq.field_j) {
                ((np) this).field_c = ((np) this).field_c + 1;
                ((np) this).field_e = false;
                if (((np) this).field_b > ((np) this).field_c) {
                  return;
                } else {
                  ((np) this).field_c = 0;
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -1) {
          L0: {
            boolean discarded$10 = ((np) this).a(126);
            if (102 != ((np) this).field_i) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (102 != ((np) this).field_i) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final boolean c(int param0) {
        if (param0 != -97) {
            return true;
        }
        return -97 == (((np) this).field_i ^ -1) ? true : false;
    }

    final boolean f(int param0) {
        if (param0 >= -38) {
            return false;
        }
        return 97 == ((np) this).field_i ? true : false;
    }

    public static void b(boolean param0) {
        field_l = null;
        field_a = null;
        field_f = null;
        field_d = null;
        if (!param0) {
            Object var2 = null;
            java.net.URL discarded$0 = np.a((String) null, -42, (String) null, true, (java.net.URL) null);
        }
    }

    final boolean b(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 >= -34) {
          L0: {
            ((np) this).field_b = 69;
            if (((np) this).field_n == 0) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((np) this).field_n == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(int param0, int param1, int param2) {
        if (((np) this).field_b <= param2) {
          throw new IllegalArgumentException();
        } else {
          if (((np) this).field_b > param1) {
            ((np) this).field_h = 0;
            ((np) this).field_i = 0;
            ((np) this).field_g = 0;
            if (0 != je.field_d) {
              ((np) this).field_k = ne.field_j;
              ((np) this).field_c = param1;
              ((np) this).field_h = je.field_d;
              ((np) this).field_g = je.field_d;
              ((np) this).field_n = je.field_d;
              ((np) this).field_e = true;
              if ((((np) this).field_n ^ -1) != param0) {
                if (0 != rf.field_n) {
                  if (0 < ((np) this).field_k) {
                    ((np) this).field_k = ((np) this).field_k - 1;
                    L0: {
                      if (je.field_d != 0) {
                        break L0;
                      } else {
                        if (0 == rf.field_n) {
                          ((np) this).field_n = 0;
                          break L0;
                        } else {
                          L1: {
                            if (((np) this).field_n != 0) {
                              break L1;
                            } else {
                              L2: {
                                if (((np) this).field_e) {
                                  break L2;
                                } else {
                                  if (!r.field_d) {
                                    break L1;
                                  } else {
                                    break L2;
                                  }
                                }
                              }
                              if ((param2 ^ -1) > -1) {
                                if (((np) this).field_e) {
                                  ((np) this).field_c = -1;
                                  break L1;
                                } else {
                                  return;
                                }
                              } else {
                                if (param2 != ((np) this).field_c) {
                                  ((np) this).field_c = param2;
                                  ((np) this).field_e = true;
                                  return;
                                } else {
                                  ((np) this).field_c = param2;
                                  ((np) this).field_e = true;
                                  return;
                                }
                              }
                            }
                          }
                          return;
                        }
                      }
                    }
                    L3: {
                      if (((np) this).field_n != 0) {
                        break L3;
                      } else {
                        if (((np) this).field_e) {
                          if ((param2 ^ -1) > -1) {
                            if (((np) this).field_e) {
                              ((np) this).field_c = -1;
                              break L3;
                            } else {
                              return;
                            }
                          } else {
                            if (param2 != ((np) this).field_c) {
                              ((np) this).field_c = param2;
                              ((np) this).field_e = true;
                              return;
                            } else {
                              ((np) this).field_c = param2;
                              ((np) this).field_e = true;
                              return;
                            }
                          }
                        } else {
                          if (!r.field_d) {
                            break L3;
                          } else {
                            if ((param2 ^ -1) > -1) {
                              if (((np) this).field_e) {
                                ((np) this).field_c = -1;
                                return;
                              } else {
                                return;
                              }
                            } else {
                              if (param2 != ((np) this).field_c) {
                                ((np) this).field_c = param2;
                                ((np) this).field_e = true;
                                return;
                              } else {
                                ((np) this).field_c = param2;
                                ((np) this).field_e = true;
                                return;
                              }
                            }
                          }
                        }
                      }
                    }
                    return;
                  } else {
                    ((np) this).field_k = eo.field_Y;
                    ((np) this).field_h = ((np) this).field_n;
                    ((np) this).field_k = ((np) this).field_k - 1;
                    if (je.field_d != 0) {
                      L4: {
                        if (((np) this).field_n != 0) {
                          break L4;
                        } else {
                          L5: {
                            if (((np) this).field_e) {
                              break L5;
                            } else {
                              if (!r.field_d) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          if ((param2 ^ -1) > -1) {
                            if (((np) this).field_e) {
                              ((np) this).field_c = -1;
                              break L4;
                            } else {
                              break L4;
                            }
                          } else {
                            if (param2 != ((np) this).field_c) {
                              ((np) this).field_c = param2;
                              ((np) this).field_e = true;
                              break L4;
                            } else {
                              ((np) this).field_c = param2;
                              ((np) this).field_e = true;
                              break L4;
                            }
                          }
                        }
                      }
                      return;
                    } else {
                      L6: {
                        if (0 == rf.field_n) {
                          ((np) this).field_n = 0;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        if (((np) this).field_n != 0) {
                          break L7;
                        } else {
                          L8: {
                            if (((np) this).field_e) {
                              break L8;
                            } else {
                              if (!r.field_d) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          if ((param2 ^ -1) > -1) {
                            if (((np) this).field_e) {
                              ((np) this).field_c = -1;
                              break L7;
                            } else {
                              break L7;
                            }
                          } else {
                            if (param2 != ((np) this).field_c) {
                              ((np) this).field_c = param2;
                              ((np) this).field_e = true;
                              break L7;
                            } else {
                              ((np) this).field_c = param2;
                              ((np) this).field_e = true;
                              break L7;
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                } else {
                  L9: {
                    if (je.field_d != 0) {
                      break L9;
                    } else {
                      if (0 == rf.field_n) {
                        ((np) this).field_n = 0;
                        break L9;
                      } else {
                        if (((np) this).field_n == 0) {
                          L10: {
                            if (((np) this).field_e) {
                              break L10;
                            } else {
                              if (r.field_d) {
                                break L10;
                              } else {
                                return;
                              }
                            }
                          }
                          if ((param2 ^ -1) > -1) {
                            if (((np) this).field_e) {
                              ((np) this).field_c = -1;
                              return;
                            } else {
                              return;
                            }
                          } else {
                            if (param2 != ((np) this).field_c) {
                              ((np) this).field_c = param2;
                              ((np) this).field_e = true;
                              return;
                            } else {
                              ((np) this).field_c = param2;
                              ((np) this).field_e = true;
                              return;
                            }
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  if (((np) this).field_n == 0) {
                    if (((np) this).field_e) {
                      if ((param2 ^ -1) > -1) {
                        if (!((np) this).field_e) {
                          return;
                        } else {
                          ((np) this).field_c = -1;
                          return;
                        }
                      } else {
                        if (param2 != ((np) this).field_c) {
                          ((np) this).field_c = param2;
                          ((np) this).field_e = true;
                          return;
                        } else {
                          ((np) this).field_c = param2;
                          ((np) this).field_e = true;
                          return;
                        }
                      }
                    } else {
                      if (r.field_d) {
                        if ((param2 ^ -1) > -1) {
                          if (((np) this).field_e) {
                            ((np) this).field_c = -1;
                            return;
                          } else {
                            return;
                          }
                        } else {
                          if (param2 != ((np) this).field_c) {
                            ((np) this).field_c = param2;
                            ((np) this).field_e = true;
                            return;
                          } else {
                            ((np) this).field_c = param2;
                            ((np) this).field_e = true;
                            return;
                          }
                        }
                      } else {
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                }
              } else {
                L11: {
                  if (je.field_d != 0) {
                    break L11;
                  } else {
                    if (0 == rf.field_n) {
                      ((np) this).field_n = 0;
                      break L11;
                    } else {
                      L12: {
                        if (((np) this).field_n != 0) {
                          break L12;
                        } else {
                          L13: {
                            if (((np) this).field_e) {
                              break L13;
                            } else {
                              if (!r.field_d) {
                                break L12;
                              } else {
                                break L13;
                              }
                            }
                          }
                          if ((param2 ^ -1) > -1) {
                            if (((np) this).field_e) {
                              ((np) this).field_c = -1;
                              break L12;
                            } else {
                              break L12;
                            }
                          } else {
                            if (param2 != ((np) this).field_c) {
                              ((np) this).field_c = param2;
                              ((np) this).field_e = true;
                              break L12;
                            } else {
                              ((np) this).field_c = param2;
                              ((np) this).field_e = true;
                              break L12;
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                if (((np) this).field_n == 0) {
                  if (((np) this).field_e) {
                    if ((param2 ^ -1) > -1) {
                      if (!((np) this).field_e) {
                        return;
                      } else {
                        ((np) this).field_c = -1;
                        return;
                      }
                    } else {
                      if (param2 != ((np) this).field_c) {
                        ((np) this).field_c = param2;
                        ((np) this).field_e = true;
                        return;
                      } else {
                        ((np) this).field_c = param2;
                        ((np) this).field_e = true;
                        return;
                      }
                    }
                  } else {
                    if (r.field_d) {
                      L14: {
                        if ((param2 ^ -1) > -1) {
                          if (((np) this).field_e) {
                            ((np) this).field_c = -1;
                            break L14;
                          } else {
                            break L14;
                          }
                        } else {
                          if (param2 != ((np) this).field_c) {
                            ((np) this).field_c = param2;
                            ((np) this).field_e = true;
                            break L14;
                          } else {
                            ((np) this).field_c = param2;
                            ((np) this).field_e = true;
                            break L14;
                          }
                        }
                      }
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            } else {
              L15: {
                if ((((np) this).field_n ^ -1) == param0) {
                  break L15;
                } else {
                  if (0 == rf.field_n) {
                    break L15;
                  } else {
                    if (0 < ((np) this).field_k) {
                      ((np) this).field_k = ((np) this).field_k - 1;
                      break L15;
                    } else {
                      ((np) this).field_k = eo.field_Y;
                      ((np) this).field_h = ((np) this).field_n;
                      L16: {
                        ((np) this).field_k = ((np) this).field_k - 1;
                        if (je.field_d != 0) {
                          break L16;
                        } else {
                          if (0 == rf.field_n) {
                            ((np) this).field_n = 0;
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                      }
                      L17: {
                        if (((np) this).field_n != 0) {
                          break L17;
                        } else {
                          L18: {
                            if (((np) this).field_e) {
                              break L18;
                            } else {
                              if (!r.field_d) {
                                break L17;
                              } else {
                                break L18;
                              }
                            }
                          }
                          if ((param2 ^ -1) > -1) {
                            if (((np) this).field_e) {
                              ((np) this).field_c = -1;
                              break L17;
                            } else {
                              break L17;
                            }
                          } else {
                            if (param2 != ((np) this).field_c) {
                              ((np) this).field_c = param2;
                              ((np) this).field_e = true;
                              break L17;
                            } else {
                              ((np) this).field_c = param2;
                              ((np) this).field_e = true;
                              break L17;
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                }
              }
              L19: {
                if (je.field_d != 0) {
                  break L19;
                } else {
                  if (0 == rf.field_n) {
                    ((np) this).field_n = 0;
                    break L19;
                  } else {
                    L20: {
                      if (((np) this).field_n != 0) {
                        break L20;
                      } else {
                        L21: {
                          if (((np) this).field_e) {
                            break L21;
                          } else {
                            if (!r.field_d) {
                              break L20;
                            } else {
                              break L21;
                            }
                          }
                        }
                        if ((param2 ^ -1) > -1) {
                          if (((np) this).field_e) {
                            ((np) this).field_c = -1;
                            break L20;
                          } else {
                            break L20;
                          }
                        } else {
                          if (param2 != ((np) this).field_c) {
                            ((np) this).field_c = param2;
                            ((np) this).field_e = true;
                            break L20;
                          } else {
                            ((np) this).field_c = param2;
                            ((np) this).field_e = true;
                            break L20;
                          }
                        }
                      }
                    }
                    return;
                  }
                }
              }
              if (((np) this).field_n == 0) {
                if (((np) this).field_e) {
                  if ((param2 ^ -1) > -1) {
                    if (!((np) this).field_e) {
                      return;
                    } else {
                      ((np) this).field_c = -1;
                      return;
                    }
                  } else {
                    if (param2 != ((np) this).field_c) {
                      ((np) this).field_c = param2;
                      ((np) this).field_e = true;
                      return;
                    } else {
                      ((np) this).field_c = param2;
                      ((np) this).field_e = true;
                      return;
                    }
                  }
                } else {
                  if (r.field_d) {
                    L22: {
                      if ((param2 ^ -1) > -1) {
                        if (((np) this).field_e) {
                          ((np) this).field_c = -1;
                          break L22;
                        } else {
                          break L22;
                        }
                      } else {
                        if (param2 != ((np) this).field_c) {
                          ((np) this).field_c = param2;
                          ((np) this).field_e = true;
                          break L22;
                        } else {
                          ((np) this).field_c = param2;
                          ((np) this).field_e = true;
                          break L22;
                        }
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            }
          } else {
            throw new IllegalArgumentException();
          }
        }
    }

    final static java.net.URL a(String param0, int param1, String param2, boolean param3, java.net.URL param4) {
        try {
            String var5 = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_42_0 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_41_0 = null;
            var9 = ShatteredPlansClient.field_F ? 1 : 0;
            var5 = param4.getFile();
            var6 = 0;
            L0: while (true) {
              L1: {
                if (!var5.regionMatches(var6, "/l=", 0, 3)) {
                  break L1;
                } else {
                  var7_int = var5.indexOf('/', var6 - -1);
                  if (0 <= var7_int) {
                    if (param1 >= 0) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L0;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (var5.regionMatches(var6, "/a=", 0, 3)) {
                  var7_int = var5.indexOf('/', var6 - -1);
                  if ((var7_int ^ -1) <= -1) {
                    var6 = var7_int;
                    continue L0;
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (!var5.regionMatches(var6, "/p=", 0, 3)) {
                  break L3;
                } else {
                  var7_int = var5.indexOf('/', var6 - -1);
                  if (0 <= var7_int) {
                    if (param0 != null) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L0;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                L5: {
                  if (var5.regionMatches(var6, "/s=", 0, 3)) {
                    break L5;
                  } else {
                    if (var5.regionMatches(var6, "/c=", 0, 3)) {
                      break L5;
                    } else {
                      break L4;
                    }
                  }
                }
                var7_int = var5.indexOf('/', 1 + var6);
                if (-1 < (var7_int ^ -1)) {
                  break L4;
                } else {
                  if (param2 != null) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_int);
                    continue L0;
                  } else {
                    var6 = var7_int;
                    continue L0;
                  }
                }
              }
              L6: {
                var7 = new StringBuilder(var6);
                StringBuilder discarded$9 = var7.append(var5.substring(0, var6));
                if (param1 >= -1) {
                  break L6;
                } else {
                  StringBuilder discarded$10 = var7.append("/l=");
                  StringBuilder discarded$11 = var7.append(Integer.toString(param1));
                  break L6;
                }
              }
              L7: {
                if (param0 == null) {
                  break L7;
                } else {
                  if (-1 < param0.length()) {
                    StringBuilder discarded$12 = var7.append("/p=");
                    StringBuilder discarded$13 = var7.append(param0);
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              L8: {
                if (param2 == null) {
                  break L8;
                } else {
                  if ((param2.length() ^ -1) < -1) {
                    StringBuilder discarded$14 = var7.append("/s=");
                    StringBuilder discarded$15 = var7.append(param2);
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
              L9: {
                if (var5.length() > var6) {
                  StringBuilder discarded$16 = var7.append(var5.substring(var6, var5.length()));
                  break L9;
                } else {
                  StringBuilder discarded$17 = var7.append(47);
                  break L9;
                }
              }
              L10: {
                if (!param3) {
                  break L10;
                } else {
                  field_d = null;
                  break L10;
                }
              }
              try {
                stackOut_41_0 = new java.net.URL(param4, var7.toString());
                stackIn_42_0 = stackOut_41_0;
              } catch (java.lang.Exception decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
                return stackIn_42_0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        int var5 = 0;
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
          var5 = 31 % ((param3 - 0) / 42);
          ((np) this).field_n = 0;
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
        ((np) this).field_e = stackIn_3_1 != 0;
        if (((np) this).field_e) {
          ((np) this).field_c = param0;
          return;
        } else {
          ((np) this).field_c = param1;
          return;
        }
    }

    final boolean a(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (!param0) {
          L0: {
            field_f = null;
            if ((((np) this).field_i ^ -1) != -104) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((((np) this).field_i ^ -1) != -104) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final boolean a(byte param0) {
        int var2 = 0;
        var2 = -16 / ((param0 - 2) / 34);
        if (-1 == (((np) this).field_g ^ -1)) {
          if (((np) this).field_i != 84) {
            if (((np) this).field_i == 83) {
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
    }

    np(int param0) {
        ((np) this).field_e = false;
        ((np) this).field_c = 0;
        ((np) this).field_b = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Opposing fleets destroyed.";
        field_o = 5;
        field_d = "Skip Intro";
    }
}
