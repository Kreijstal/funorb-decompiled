/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hf {
    static String field_b;
    static String field_c;
    static String field_g;
    static ck[][] field_e;
    static String field_h;
    private RandomAccessFile field_f;
    static String field_a;
    private long field_i;
    private long field_d;

    final int a(byte[] param0, byte param1, int param2, int param3) throws IOException {
        if (param1 > -33) {
            field_h = null;
        }
        int var5 = ((hf) this).field_f.read(param0, param2, param3);
        if (0 < var5) {
            ((hf) this).field_d = ((hf) this).field_d + (long)var5;
        }
        return var5;
    }

    public static void b(int param0) {
        field_g = null;
        field_h = null;
        field_c = null;
        if (param0 != 12741) {
            field_g = null;
        }
        field_a = null;
        field_b = null;
        field_e = null;
    }

    final void a(int param0) throws IOException {
        if (!(((hf) this).field_f == null)) {
            ((hf) this).field_f.close();
            ((hf) this).field_f = null;
        }
        if (param0 >= -4) {
            Object var3 = null;
            String discarded$0 = hf.a(-21, 99, (CharSequence[]) null, (byte) 32);
        }
    }

    protected final void finalize() throws Throwable {
        if (!(null == ((hf) this).field_f)) {
            System.out.println("");
            ((hf) this).a(-86);
        }
    }

    final void a(long param0, int param1) throws IOException {
        ((hf) this).field_f.seek(param0);
        ((hf) this).field_d = param0;
        if (param1 < 3) {
            Object var5 = null;
            String discarded$0 = hf.a(69, 18, (CharSequence[]) null, (byte) 126);
        }
    }

    final static String a(int param0, int param1, CharSequence[] param2, byte param3) {
        CharSequence var4_ref_CharSequence = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        Object var10 = null;
        CharSequence var11 = null;
        var9 = client.field_A ? 1 : 0;
        if (-1 != (param0 ^ -1)) {
          if (param0 != 1) {
            var4 = param0 + param1;
            var5 = 0;
            var6_int = param1;
            L0: while (true) {
              if (var6_int >= var4) {
                L1: {
                  var6 = new StringBuilder(var5);
                  if (param3 == 74) {
                    break L1;
                  } else {
                    var10 = null;
                    String discarded$3 = hf.a(-7, 123, (CharSequence[]) null, (byte) 21);
                    break L1;
                  }
                }
                var7 = param1;
                L2: while (true) {
                  if (var7 >= var4) {
                    return var6.toString();
                  } else {
                    var8 = param2[var7];
                    if (var8 == null) {
                      StringBuilder discarded$4 = var6.append("null");
                      var7++;
                      continue L2;
                    } else {
                      StringBuilder discarded$5 = var6.append(var8);
                      var7++;
                      continue L2;
                    }
                  }
                }
              } else {
                var7_ref_CharSequence = param2[var6_int];
                if (var7_ref_CharSequence == null) {
                  var5 += 4;
                  var6_int++;
                  continue L0;
                } else {
                  var5 = var5 + var7_ref_CharSequence.length();
                  var6_int++;
                  continue L0;
                }
              }
            }
          } else {
            var11 = param2[param1];
            var4_ref_CharSequence = var11;
            if (var4_ref_CharSequence == null) {
              return "null";
            } else {
              return ((Object) (Object) var11).toString();
            }
          }
        } else {
          return "";
        }
    }

    final long a(byte param0) throws IOException {
        if (param0 != -50) {
            return -2L;
        }
        return ((hf) this).field_f.length();
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        if (!(((long)param3 - -((hf) this).field_d ^ -1L) >= (((hf) this).field_i ^ -1L))) {
            ((hf) this).field_f.seek(((hf) this).field_i);
            ((hf) this).field_f.write(1);
            throw new EOFException();
        }
        int var5 = 96 % ((param1 - -35) / 49);
        ((hf) this).field_f.write(param0, param2, param3);
        ((hf) this).field_d = ((hf) this).field_d + (long)param3;
    }

    hf(File param0, String param1, long param2) throws IOException {
        if (-1L == param2) {
            param2 = 9223372036854775807L;
        }
        if (param2 < param0.length()) {
            boolean discarded$0 = param0.delete();
        }
        ((hf) this).field_f = new RandomAccessFile(param0, param1);
        ((hf) this).field_d = 0L;
        ((hf) this).field_i = param2;
        int var5 = ((hf) this).field_f.read();
        if (var5 != -1) {
            if (!param1.equals((Object) (Object) "r")) {
                ((hf) this).field_f.seek(0L);
                ((hf) this).field_f.write(var5);
            }
        }
        ((hf) this).field_f.seek(0L);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Visit the Account Management section on the main site to view.";
        field_a = "<%0>'s game";
        field_h = "Report abuse";
        field_e = new ck[8][];
        field_g = "No players";
        field_c = "<%0> has joined your game.";
    }
}
