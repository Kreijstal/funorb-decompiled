/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class IterableNodeHashTable implements Iterable {
    static String field_c;
    IntrusiveNode[] field_e;
    private IntrusiveNode lookupCursor;
    int field_a;
    static String field_d;

    final static void closePrivateChatInput(int param0) {
        ce.field_d = 0;
        oo.field_d = true;
        if (param0 != 7500) {
          IterableNodeHashTable.advanceBackgroundSkin((byte) -13);
        }
    }

    final static int getChatFilterMode(int param0, int param1) {
        int var2 = param1;
        if (0 == param0) {
          var2 = LoginMethod.field_e;
        }
        if (1 == param0) {
          var2 = GradientOutlineTextPainter.field_v;
        }
        if (2 == param0) {
          var2 = ib.field_e;
        }
        return var2;
    }

    final IntrusiveNode findByKey(int param0, long param1) {
        IntrusiveNode var4;
        IntrusiveNode var5;
        int var6;
        var6 = Pixelate.field_H ? 1 : 0;
        var4 = this.field_e[(int)((long)(this.field_a - param0) & param1)];
        this.lookupCursor = var4.field_a;
        while (true) {
          if (this.lookupCursor == var4) {
            this.lookupCursor = null;
            return null;
          }
          if (this.lookupCursor.field_e != param1) {
            this.lookupCursor = this.lookupCursor.field_a;
            continue;
          }
          break;
        }
        var5 = this.lookupCursor;
        this.lookupCursor = this.lookupCursor.field_a;
        return var5;
    }

    final void put(IntrusiveNode param0, long param1, int param2) {
        IntrusiveNode var5 = null;
        try {
          if (param0.previous != null) {
            param0.unlink(2779);
          }
          var5 = this.field_e[(int)(param1 & (long)(param2 + this.field_a))];
          param0.previous = var5.previous;
          param0.field_a = var5;
          param0.previous.field_a = param0;
          param0.field_e = param1;
          param0.field_a.previous = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "kl.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 >= -74) {
          field_c = (String) null;
          field_d = null;
          field_c = null;
          return;
        }
        field_d = null;
        field_c = null;
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new NodeHashTableIterator(this));
    }

    IterableNodeHashTable(int param0) {
        int var2 = 0;
        IntrusiveNode dupTemp$0 = null;
        IntrusiveNode var3 = null;
        this.field_a = param0;
        this.field_e = new IntrusiveNode[param0];
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$0 = new IntrusiveNode();
          var3 = dupTemp$0;
          this.field_e[var2] = dupTemp$0;
          var3.field_a = var3;
          var3.previous = var3;
        }
    }

    final static void advanceBackgroundSkin(byte param0) {
        if (7500 > jd.field_r) {
          return;
        }
        int fieldTemp$0 = LoadingProgressDialog.field_hb + 1;
        LoadingProgressDialog.field_hb = LoadingProgressDialog.field_hb + 1;
        if (fieldTemp$0 == jm.field_g.length) {
          LoadingProgressDialog.field_hb = 0;
        }
        HighscoresScreen.selectBackground(-89, jm.field_g[LoadingProgressDialog.field_hb]);
        jd.field_r = 0;
        if (param0 <= -73) {
          return;
        }
        field_d = (String) null;
    }

    static {
        field_c = "This is <%0>'s RuneScape clan if they have one.";
        field_d = "GFX: High Detail";
    }
}
